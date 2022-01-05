package com.instabug.library.core.eventbus;

import com.instabug.library.model.session.SessionState;

public class SessionStateEventBus extends EventBus<SessionState> {
    private static SessionStateEventBus instance;

    public static SessionStateEventBus getInstance() {
        if (instance == null) {
            instance = new SessionStateEventBus();
        }
        return instance;
    }
}
