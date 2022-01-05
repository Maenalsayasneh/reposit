package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.local.Language;
import i0.b.a.o;
import i0.e.b.g3.u.z5.v0;
import i0.e.b.g3.x.g.e;
import i0.e.b.g3.x.g.f;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: LanguagesFragment.kt */
public final class LanguagesFragment$buildLanguagesModels$1 extends Lambda implements l<v0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ LanguagesFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesFragment$buildLanguagesModels$1(o oVar, LanguagesFragment languagesFragment) {
        super(1);
        this.c = oVar;
        this.d = languagesFragment;
    }

    public Object invoke(Object obj) {
        v0 v0Var = (v0) obj;
        m0.n.b.i.e(v0Var, "state");
        List<Language> list = v0Var.a;
        o oVar = this.c;
        LanguagesFragment languagesFragment = this.d;
        for (Language language : list) {
            f fVar = new f();
            fVar.L(language.c);
            fVar.Q(language.d);
            fVar.P(language.q);
            fVar.O(language.x);
            fVar.N(new i0.e.b.g3.u.z5.i(languagesFragment, language));
            oVar.add(fVar);
            if (!m0.n.b.i.a(g.G(v0Var.a), language)) {
                e eVar = new e();
                eVar.K(m0.n.b.i.k("divider", language.c));
                oVar.add(eVar);
            }
        }
        return i.a;
    }
}
