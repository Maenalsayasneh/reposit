package com.instabug.library.core.eventbus.coreeventbus;

public class SDKCoreEventPublisher {
    public static void post(SDKCoreEvent sDKCoreEvent) {
        SDKCoreEventBus.getInstance().post(sDKCoreEvent);
    }
}
