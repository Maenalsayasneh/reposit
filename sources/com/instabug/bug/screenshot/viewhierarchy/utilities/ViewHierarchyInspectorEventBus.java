package com.instabug.bug.screenshot.viewhierarchy.utilities;

import com.instabug.bug.k.b.c$b;
import com.instabug.library.core.eventbus.EventBus;

public class ViewHierarchyInspectorEventBus extends EventBus<c$b> {
    private static ViewHierarchyInspectorEventBus instance;

    public static ViewHierarchyInspectorEventBus getInstance() {
        if (instance == null) {
            instance = new ViewHierarchyInspectorEventBus();
        }
        return instance;
    }
}
