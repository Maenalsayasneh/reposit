package com.clubhouse.android.ui.profile.settings;

import h0.b0.v;
import i0.b.a.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: LanguagesFragment.kt */
public final class LanguagesFragment$initLanguages$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ LanguagesFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesFragment$initLanguages$1(LanguagesFragment languagesFragment) {
        super(1);
        this.c = languagesFragment;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        LanguagesFragment languagesFragment = this.c;
        k<Object>[] kVarArr = LanguagesFragment.Z1;
        v.v2(languagesFragment.O0(), new LanguagesFragment$buildLanguagesModels$1(oVar, languagesFragment));
        return i.a;
    }
}
