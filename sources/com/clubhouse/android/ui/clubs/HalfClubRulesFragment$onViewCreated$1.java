package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.l.u1;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.HalfClubRulesFragment$onViewCreated$1", f = "HalfClubRulesFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfClubRulesFragment.kt */
public final class HalfClubRulesFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfClubRulesFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfClubRulesFragment$onViewCreated$1(HalfClubRulesFragment halfClubRulesFragment, m0.l.c<? super HalfClubRulesFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = halfClubRulesFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfClubRulesFragment$onViewCreated$1 halfClubRulesFragment$onViewCreated$1 = new HalfClubRulesFragment$onViewCreated$1(this.d, cVar);
        halfClubRulesFragment$onViewCreated$1.c = obj;
        return halfClubRulesFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfClubRulesFragment$onViewCreated$1 halfClubRulesFragment$onViewCreated$1 = new HalfClubRulesFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        halfClubRulesFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        halfClubRulesFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof u1) {
            HalfClubRulesFragment halfClubRulesFragment = this.d;
            Objects.requireNonNull(HalfClubRulesFragment.p2);
            v.V1(halfClubRulesFragment, HalfClubRulesFragment.r2, Boolean.TRUE);
            v.c1(this.d);
        } else if (bVar instanceof d) {
            final HalfClubRulesFragment halfClubRulesFragment2 = this.d;
            v.b2(halfClubRulesFragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = halfClubRulesFragment2.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    jVar.h(Banner.Style.Negative);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
