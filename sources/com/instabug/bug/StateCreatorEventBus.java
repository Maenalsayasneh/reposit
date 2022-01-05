package com.instabug.bug;

import com.instabug.library.core.eventbus.EventBus;
import com.instabug.library.model.State;

public class StateCreatorEventBus extends EventBus<State.Action> {
    private static StateCreatorEventBus instance;

    public static StateCreatorEventBus getInstance() {
        if (instance == null) {
            instance = new StateCreatorEventBus();
        }
        return instance;
    }

    public static void release() {
        instance = null;
    }
}
