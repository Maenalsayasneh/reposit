package com.instabug.library.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instabug.library.util.InstabugSDKLogger;

public class LastContactedChangedBroadcast extends BroadcastReceiver {
    public static final String LAST_CONTACTED_AT = "last_contacted_at";
    public static final String LAST_CONTACTED_CHANGED = "User last contact at changed";
    public static final String TAG = "LastContactedChangedBroadcast";
    private a mLastContactedMonitor;

    public interface a {
        void a();
    }

    public LastContactedChangedBroadcast(a aVar) {
        this.mLastContactedMonitor = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        InstabugSDKLogger.d(TAG, "onReceive");
        this.mLastContactedMonitor.a();
    }
}
