package com.instabug.library.network;

import androidx.core.app.InstabugBackgroundService;

public abstract class InstabugNetworkBasedBackgroundService extends InstabugBackgroundService {
    public boolean mustHaveNetworkConnection() {
        return true;
    }
}
