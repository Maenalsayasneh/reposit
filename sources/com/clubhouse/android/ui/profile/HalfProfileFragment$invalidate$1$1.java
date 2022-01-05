package com.clubhouse.android.ui.profile;

import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.f3.k.b;
import i0.e.b.g3.u.i5;
import i0.e.b.g3.u.q4;
import i0.e.e.m.g;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$invalidate$1$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$invalidate$1$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (q4Var.A) {
            b bVar = this.c.b2;
            if (bVar != null) {
                Key key = Key.SHOW_WAVE_HALF_PROFILE_NUX;
                if (!bVar.a(key, false)) {
                    g gVar = g.a;
                    final HalfProfileFragment halfProfileFragment = this.c;
                    gVar.a(halfProfileFragment, q4Var.a, new a<i>() {
                        public Object invoke() {
                            HalfProfileFragment.this.U0().p(new i5(q4Var.a.getId().intValue(), q4Var.a.getName()));
                            return i.a;
                        }
                    });
                    b bVar2 = this.c.b2;
                    if (bVar2 != null) {
                        bVar2.g(key, true);
                    } else {
                        m0.n.b.i.m("userPrefs");
                        throw null;
                    }
                }
            } else {
                m0.n.b.i.m("userPrefs");
                throw null;
            }
        }
        return i.a;
    }
}
