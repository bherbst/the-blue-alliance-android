package com.thebluealliance.androidclient.di;

import android.accounts.AccountManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import com.google.android.gms.analytics.Tracker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;
import com.thebluealliance.androidclient.Analytics;
import com.thebluealliance.androidclient.config.LocalProperties;
import com.thebluealliance.androidclient.database.Database;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import androidx.annotation.VisibleForTesting;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

/**
 * App-wide dependency injection items
 */
@InstallIn(SingletonComponent.class)
@Module
public class TBAAndroidModule {

    private static Gson sGson;

    public TBAAndroidModule() {
    }

    @Provides
    public Resources provideApplicationResources(@ApplicationContext Context context) {
        return context.getResources();
    }

    @Provides @Singleton
    public Gson provideGson() {
        return getGson();
    }

    @Provides @Singleton
    public Picasso providePicasso(@ApplicationContext Context context) {
        return new Picasso.Builder(context)
                .build();
    }

    @Provides
    @Singleton
    public Database provideDatabase(@ApplicationContext Context context, Gson gson) {
        return Database.getInstance(context, gson);
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPrefs(@ApplicationContext Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    public Tracker provideAndroidTracker(@ApplicationContext Context context) {
        return Analytics.getTracker(Analytics.GAnalyticsTracker.ANDROID_TRACKER, context);
    }

    @Provides
    public NotificationManager provideNotificationManager(@ApplicationContext Context context) {
        return (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }

    @Provides
    public AccountManager provideAccountManager(@ApplicationContext Context context) {
        return AccountManager.get(context);
    }

    @Provides
    public LocalProperties provideLocalProperties(@ApplicationContext Context context) {
        return new LocalProperties(context);
    }

    @VisibleForTesting
    public static Gson getGson() {
        if (sGson != null) return sGson;
        GsonBuilder builder = new GsonBuilder();
        sGson = builder.create();
        return sGson;
    }
}
