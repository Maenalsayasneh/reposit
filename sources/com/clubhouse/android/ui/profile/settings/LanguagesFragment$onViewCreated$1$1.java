package com.clubhouse.android.ui.profile.settings;

import h0.b0.v;
import i0.e.b.g3.u.z5.v0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: LanguagesFragment.kt */
public final class LanguagesFragment$onViewCreated$1$1 extends Lambda implements l<v0, i> {
    public final /* synthetic */ LanguagesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesFragment$onViewCreated$1$1(LanguagesFragment languagesFragment) {
        super(1);
        this.c = languagesFragment;
    }

    public Object invoke(Object obj) {
        v0 v0Var = (v0) obj;
        m0.n.b.i.e(v0Var, "state");
        if (v0Var.b) {
            v.V1(this.c, "languages_updated_result", Boolean.TRUE);
        }
        v.c1(this.c);
        return i.a;
    }
}
