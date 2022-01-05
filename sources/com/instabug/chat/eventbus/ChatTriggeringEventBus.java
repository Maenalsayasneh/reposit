package com.instabug.chat.eventbus;

import com.instabug.library.core.eventbus.EventBus;
import i0.j.c.g.a;

public class ChatTriggeringEventBus extends EventBus<a> {
    private static ChatTriggeringEventBus instance;

    public static ChatTriggeringEventBus getInstance() {
        if (instance == null) {
            instance = new ChatTriggeringEventBus();
        }
        return instance;
    }
}
