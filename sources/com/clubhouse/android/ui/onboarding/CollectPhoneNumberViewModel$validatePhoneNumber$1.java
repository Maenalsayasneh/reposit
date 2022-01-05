package com.clubhouse.android.ui.onboarding;

import i0.e.b.g3.r.p0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: CollectPhoneNumberViewModel.kt */
public final class CollectPhoneNumberViewModel$validatePhoneNumber$1 extends Lambda implements l<p0, p0> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberViewModel$validatePhoneNumber$1(String str) {
        super(1);
        this.c = str;
    }

    public Object invoke(Object obj) {
        p0 p0Var = (p0) obj;
        i.e(p0Var, "$this$setState");
        return p0.copy$default(p0Var, false, this.c, (Integer) null, 5, (Object) null);
    }
}
