package com.instabug.bug.view.reporting.g;

import com.instabug.bug.R;
import com.instabug.bug.view.reporting.b;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.b.t.k.k;

/* compiled from: AskQuestionFragment */
public class a extends b {
    public static final String s2 = a.class.getSimpleName();

    public k M0() {
        return new i0.j.b.t.k.m.a(this);
    }

    public String s() {
        if (isAdded()) {
            return getString(R.string.IBGAskQuestionHint);
        }
        InstabugSDKLogger.w(s2, "failed to provideDefaultHintMessage, fragment not attached yet");
        return "";
    }

    public String x() {
        if (isAdded()) {
            return getString(R.string.askAQuestionHeader);
        }
        InstabugSDKLogger.w(s2, "failed to provideDefaultTitle, fragment not attached yet");
        return "";
    }
}
