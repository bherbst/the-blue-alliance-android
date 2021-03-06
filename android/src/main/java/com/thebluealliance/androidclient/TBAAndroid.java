package com.thebluealliance.androidclient;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.support.multidex.MultiDexApplication;

import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;
import com.thebluealliance.androidclient.accounts.AccountModule;
import com.thebluealliance.androidclient.auth.AuthModule;
import com.thebluealliance.androidclient.binders.BinderModule;
import com.thebluealliance.androidclient.config.AppConfig;
import com.thebluealliance.androidclient.database.writers.DatabaseWriterModule;
import com.thebluealliance.androidclient.datafeed.DatafeedModule;
import com.thebluealliance.androidclient.datafeed.HttpModule;
import com.thebluealliance.androidclient.datafeed.gce.GceModule;
import com.thebluealliance.androidclient.datafeed.status.TBAStatusController;
import com.thebluealliance.androidclient.di.TBAAndroidModule;
import com.thebluealliance.androidclient.di.components.ApplicationComponent;
import com.thebluealliance.androidclient.di.components.DaggerApplicationComponent;
import com.thebluealliance.androidclient.di.components.DaggerDatafeedComponent;
import com.thebluealliance.androidclient.di.components.DaggerDbComponent;
import com.thebluealliance.androidclient.di.components.DatafeedComponent;
import com.thebluealliance.androidclient.di.components.DbComponent;
import com.thebluealliance.androidclient.gcm.GcmModule;
import com.thebluealliance.androidclient.imgur.ImgurModule;

import javax.inject.Inject;

import static com.thebluealliance.androidclient.gcm.notifications.BaseNotification.NOTIFICATION_CHANNEL;

public class TBAAndroid extends MultiDexApplication {

    @Inject TBAStatusController mStatusController;
    @Inject AppConfig mAppConfig;

    private ApplicationComponent mComponent;
    private DbComponent mDbComponent;
    private TBAAndroidModule mModule;
    private DatafeedModule mDatafeedModule;
    private BinderModule mBinderModule;
    private DatabaseWriterModule mDatabaseWriterModule;
    private AuthModule mAuthModule;
    private boolean mShouldBindStetho;
    private boolean mShouldInstallLeakCanary;

    private HttpModule mHttpModule;
    private GceModule mGceModule;
    private ImgurModule mImgurModule;
    private AccountModule mAccountModule;
    private GcmModule mGcmModule;

    public TBAAndroid() {
        super();
        mShouldBindStetho = true;
        mShouldInstallLeakCanary = true;
    }

    /**
     * Firebase Crash Reporting makes it so the application is multi-process. Each process will
     * run the Application's onCreate during initialization.
     * Therefore, ensure there are no accesses to shared resources here, otherwise we could
     * get some strange race conditions
     */
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }

        if (mShouldInstallLeakCanary) {
            LeakCanary.install(this);
        }

        TbaLogger.i("Welcome to The Blue Alliance for Android, v" + BuildConfig.VERSION_NAME);
        getDatafeedComponenet().inject(this);
        mAppConfig.updateRemoteData();
        registerActivityLifecycleCallbacks(mStatusController);

        if (Utilities.isDebuggable() && mShouldBindStetho) {
            Stetho.initialize(
                    Stetho.newInitializerBuilder(this)
                            .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                            .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))

                            .build());
        }

        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.notification_channel_name);
            String description = getString(R.string.notification_channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(NOTIFICATION_CHANNEL, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }

    void disableStetho() {
        mShouldBindStetho = false;
    }

    void disableLeakCanary() {
        mShouldInstallLeakCanary = false;
    }

    public TBAAndroidModule getModule() {
        if (mModule == null) {
            mModule = new TBAAndroidModule(this);
        }
        return mModule;
    }

    public DatafeedModule getDatafeedModule() {
        if (mDatafeedModule == null) {
            mDatafeedModule = new DatafeedModule();
        }
        return mDatafeedModule;
    }

    public HttpModule getHttpModule() {
        if (mHttpModule == null) {
            mHttpModule = new HttpModule();
        }
        return mHttpModule;
    }

    public GceModule getGceModule() {
        if (mGceModule == null) {
            mGceModule = new GceModule();
        }
        return mGceModule;
    }

    public ImgurModule getImgurModule() {
        if (mImgurModule == null) {
            mImgurModule = new ImgurModule();
        }
        return mImgurModule;
    }

    public BinderModule getBinderModule() {
        if (mBinderModule == null) {
            mBinderModule = new BinderModule(getResources());
        }
        return mBinderModule;
    }

    public DatabaseWriterModule getDatabaseWriterModule() {
        if (mDatabaseWriterModule == null) {
            mDatabaseWriterModule = new DatabaseWriterModule();
        }
        return mDatabaseWriterModule;
    }

    public AuthModule getAuthModule() {
        if (mAuthModule == null) {
            mAuthModule = new AuthModule(this);
        }
        return mAuthModule;
    }

    public AccountModule getAccountModule() {
        if (mAccountModule == null) {
            mAccountModule = new AccountModule();
        }
        return mAccountModule;
    }

    public GcmModule getGcmModule() {
        if (mGcmModule == null) {
            mGcmModule = new GcmModule();
        }
        return mGcmModule;
    }

    public ApplicationComponent getComponent() {
        if (mComponent == null) {
            mComponent = DaggerApplicationComponent.builder()
              .tBAAndroidModule(getModule())
              .build();
        }
        return mComponent;
    }

    public DbComponent getDbComponent() {
        if (mDbComponent == null) {
            mDbComponent = DaggerDbComponent.builder()
                .tBAAndroidModule(getModule())
                .build();
        }
        return mDbComponent;
    }

    public DatafeedComponent getDatafeedComponenet() {
        return DaggerDatafeedComponent.builder()
          .applicationComponent(getComponent())
          .datafeedModule(getDatafeedModule())
          .build();
    }
}
