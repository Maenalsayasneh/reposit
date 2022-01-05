package com.instabug.bug.instabugdisclaimer;

import com.instabug.bug.BugReporting;
import com.instabug.chat.Chats;
import com.instabug.chat.Replies;
import com.instabug.library.Feature;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.settings.SettingsManager;
import i0.h.a.b.c.m.b;
import i0.j.b.m.a;

public class Internal {
    public static void setDisclaimerText(String str) {
        a.a(str);
    }

    public static void setup() {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("setup", new Api.Parameter[0]);
        Feature feature = Feature.CONSOLE_LOGS;
        Feature.State state = Feature.State.DISABLED;
        InstabugCore.setFeatureState(feature, state);
        InstabugCore.setFeatureState(Feature.TRACK_USER_STEPS, state);
        InstabugCore.setFeatureState(Feature.REPRO_STEPS, state);
        InstabugCore.setFeatureState(Feature.VIEW_HIERARCHY_V2, state);
        Chats.setState(state);
        Replies.setState(state);
        BugReporting.setState(Feature.State.ENABLED);
        b.r(0, 1);
        SettingsManager.getInstance().setIsSessionEnabled(false);
        a.a("Disclaimer: Once submitted, this feedback and [metadata](#metadata-screen) will be sent to and stored on Instabug's servers.<P/><P/>[Learn more](http://grasshopper.codes).");
    }
}
