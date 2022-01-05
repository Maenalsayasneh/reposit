package com.instabug.chat;

import com.instabug.library.Feature;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugDeprecationLogger;

public final class Chats {
    private static final String TAG = "Chats";

    public static class a implements VoidRunnable {
        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.show", new Api.Parameter[0]);
            if (InstabugCore.isFeatureEnabled(Feature.DEPRECATED_CHATS)) {
                ChatsDelegate.openNewChat();
            }
            InstabugDeprecationLogger.getInstance().log(18);
        }
    }

    public static class b implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public b(Feature.State state) {
            this.a = state;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.setState", i0.d.a.a.a.O("state", Feature.State.class));
            Feature.State state = this.a;
            InstabugCore.setChatsState(state);
            InstabugCore.setDeprecatedChatState(state);
            InvocationManager.getInstance().notifyInvocationOptionChanged();
            InstabugDeprecationLogger.getInstance().log(19);
        }
    }

    @Deprecated
    public static void setState(Feature.State state) {
        APIChecker.checkAndRun("Chats.setState", new b(state));
    }

    @Deprecated
    public static void show() {
        APIChecker.checkAndRun("Chats.show", new a());
    }
}
