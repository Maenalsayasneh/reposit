package com.pubnub.api.endpoints;

public interface BuilderSteps {

    public interface ChannelStep<T> {
        T channel(String str);
    }
}
