package com.clubhouse.android.ui.profile.settings;

import h0.a.b;
import h0.b0.v;
import i0.e.b.g3.u.z5.v0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: LanguagesFragment.kt */
public final class LanguagesFragment$onViewCreated$2 extends Lambda implements l<b, i> {
    public final /* synthetic */ LanguagesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesFragment$onViewCreated$2(LanguagesFragment languagesFragment) {
        super(1);
        this.c = languagesFragment;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((b) obj, "$this$addCallback");
        LanguagesFragment languagesFragment = this.c;
        k<Object>[] kVarArr = LanguagesFragment.Z1;
        LanguagesViewModel O0 = languagesFragment.O0();
        final LanguagesFragment languagesFragment2 = this.c;
        v.v2(O0, new l<v0, i>() {
            public Object invoke(Object obj) {
                v0 v0Var = (v0) obj;
                m0.n.b.i.e(v0Var, "state");
                if (v0Var.b) {
                    v.V1(LanguagesFragment.this, "languages_updated_result", Boolean.TRUE);
                }
                v.c1(LanguagesFragment.this);
                return i.a;
            }
        });
        return i.a;
    }
}
