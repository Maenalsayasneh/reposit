package com.pubnub.api.callbacks;

public abstract class ReconnectionCallback {
    public abstract void onMaxReconnectionExhaustion();

    public abstract void onReconnection();
}
