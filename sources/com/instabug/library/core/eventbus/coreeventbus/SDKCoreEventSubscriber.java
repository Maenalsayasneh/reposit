package com.instabug.library.core.eventbus.coreeventbus;

import k0.b.l;
import k0.b.w.a;
import k0.b.y.d;

public class SDKCoreEventSubscriber {
    public static l<SDKCoreEvent> getObservable() {
        return SDKCoreEventBus.getInstance().observeEvents(SDKCoreEvent.class);
    }

    public static a subscribe(d<SDKCoreEvent> dVar) {
        return SDKCoreEventBus.getInstance().subscribe(dVar);
    }
}
