package com.clubhouse.android.ui.profile.settings;

import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.z5.b1;
import i0.e.b.g3.u.z5.d1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$onViewCreated$12$1 extends Lambda implements l<d1, i> {
    public final /* synthetic */ SettingsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$onViewCreated$12$1(SettingsFragment settingsFragment) {
        super(1);
        this.c = settingsFragment;
    }

    public Object invoke(Object obj) {
        d1 d1Var = (d1) obj;
        m0.n.b.i.e(d1Var, "state");
        SettingsFragment settingsFragment = this.c;
        NotificationSettingsArgs notificationSettingsArgs = new NotificationSettingsArgs(d1Var.e, d1Var.f, d1Var.g, d1Var.h);
        m0.n.b.i.e(notificationSettingsArgs, "mavericksArg");
        v.a1(settingsFragment, new b1(notificationSettingsArgs), (q) null, 2);
        return i.a;
    }
}
