package com.thebluealliance.androidclient.accounts;

import android.content.Context;

import com.thebluealliance.androidclient.DefaultTestRunner;
import com.thebluealliance.androidclient.datafeed.MyTbaDatafeed;
import com.thebluealliance.androidclient.helpers.ModelNotificationFavoriteSettings;
import com.thebluealliance.androidclient.interfaces.ModelSettingsCallbacks;
import com.thebluealliance.androidclient.mytba.ModelPrefsResult;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.concurrent.ExecutionException;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(DefaultTestRunner.class)
public class UpdateUserModelSettingsTest {

    @Mock Context mContext;
    @Mock ModelNotificationFavoriteSettings mSettings;
    @Mock MyTbaDatafeed mMyTbaDatafeed;
    @Mock ModelSettingsCallbacks mCallbacks;

    private UpdateUserModelSettings mTask;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mTask = new UpdateUserModelSettings(mContext, mMyTbaDatafeed, mSettings);
        mTask.setCallbacks(mCallbacks);
    }

    @Test
    public void testSuccess() throws ExecutionException, InterruptedException {
        when(mMyTbaDatafeed.updateModelSettings(mContext, mSettings))
                .thenReturn(ModelPrefsResult.SUCCESS);
        mTask.execute().get();
        verify(mCallbacks).onSuccess();
    }

    @Test
    public void testFailure() throws ExecutionException, InterruptedException {
        when(mMyTbaDatafeed.updateModelSettings(mContext, mSettings))
                .thenReturn(ModelPrefsResult.ERROR);
        mTask.execute().get();
        verify(mCallbacks).onError();
    }

    @Test
    public void testNoOp() throws ExecutionException, InterruptedException {
        when(mMyTbaDatafeed.updateModelSettings(mContext, mSettings))
                .thenReturn(ModelPrefsResult.NOOP);
        mTask.execute().get();
        verify(mCallbacks).onNoOp();
    }
}