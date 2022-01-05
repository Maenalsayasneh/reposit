package com.clubhouse.android.ui.onboarding;

import i0.b.b.b;
import i0.e.b.g3.r.w0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: CollectUsernameViewModel.kt */
public final class CollectUsernameViewModel$updateUsername$1 extends Lambda implements l<w0, w0> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectUsernameViewModel$updateUsername$1(String str) {
        super(1);
        this.c = str;
    }

    public Object invoke(Object obj) {
        w0 w0Var = (w0) obj;
        i.e(w0Var, "$this$setState");
        return w0.copy$default(w0Var, (String) null, (String) null, this.c, (List) null, false, false, (b) null, 123, (Object) null);
    }
}
