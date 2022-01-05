package com.clubhouse.android.ui.onboarding;

import android.content.Context;
import h0.b0.v;
import i0.b.a.e0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;
import m0.r.k;

/* compiled from: WelcomeRoomFragment.kt */
public final class WelcomeRoomFragment$welcomeChannelViewBinder$2 extends Lambda implements p<e0, Context, i> {
    public final /* synthetic */ WelcomeRoomFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomFragment$welcomeChannelViewBinder$2(WelcomeRoomFragment welcomeRoomFragment) {
        super(2);
        this.c = welcomeRoomFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        m0.n.b.i.e(e0Var, "$this$epoxyView");
        m0.n.b.i.e((Context) obj2, "it");
        WelcomeRoomFragment welcomeRoomFragment = this.c;
        k<Object>[] kVarArr = WelcomeRoomFragment.Z1;
        i iVar = (i) v.v2(welcomeRoomFragment.O0(), new WelcomeRoomFragment$buildChannel$1(e0Var, welcomeRoomFragment));
        return i.a;
    }
}
