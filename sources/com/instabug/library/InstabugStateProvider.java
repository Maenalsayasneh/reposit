package com.instabug.library;

import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;

public class InstabugStateProvider {
    private static final String TAG = "InstabugStateProvider";
    private static InstabugStateProvider instance;
    private InstabugState state = InstabugState.BUILDING;

    private InstabugStateProvider() {
    }

    public static synchronized InstabugStateProvider getInstance() {
        InstabugStateProvider instabugStateProvider;
        synchronized (InstabugStateProvider.class) {
            if (instance == null) {
                instance = new InstabugStateProvider();
            }
            instabugStateProvider = instance;
        }
        return instabugStateProvider;
    }

    public InstabugState getState() {
        return this.state;
    }

    public void setState(InstabugState instabugState) {
        StringBuilder P0 = a.P0("Setting Instabug SDK state to ");
        P0.append(instabugState.name());
        InstabugSDKLogger.d(TAG, P0.toString());
        this.state = instabugState;
    }
}
