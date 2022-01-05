package com.instabug.library.core.eventbus;

import i0.j.e.t0.e;

public class ScreenCaptureEventBus extends EventBus<e> {
    private static ScreenCaptureEventBus INSTANCE;

    public static ScreenCaptureEventBus getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ScreenCaptureEventBus();
        }
        return INSTANCE;
    }
}
