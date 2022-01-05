package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.r.o0;
import i0.e.b.g3.r.p1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.CollectNameFragment$initEffectsHandler$1", f = "CollectNameFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CollectNameFragment.kt */
public final class CollectNameFragment$initEffectsHandler$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CollectNameFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameFragment$initEffectsHandler$1(CollectNameFragment collectNameFragment, m0.l.c<? super CollectNameFragment$initEffectsHandler$1> cVar) {
        super(2, cVar);
        this.d = collectNameFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CollectNameFragment$initEffectsHandler$1 collectNameFragment$initEffectsHandler$1 = new CollectNameFragment$initEffectsHandler$1(this.d, cVar);
        collectNameFragment$initEffectsHandler$1.c = obj;
        return collectNameFragment$initEffectsHandler$1;
    }

    public Object invoke(Object obj, Object obj2) {
        CollectNameFragment$initEffectsHandler$1 collectNameFragment$initEffectsHandler$1 = new CollectNameFragment$initEffectsHandler$1(this.d, (m0.l.c) obj2);
        collectNameFragment$initEffectsHandler$1.c = (b) obj;
        i iVar = i.a;
        collectNameFragment$initEffectsHandler$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final CollectNameFragment collectNameFragment = this.d;
            v.f2(collectNameFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = collectNameFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof p1) {
            CollectNameViewModel N0 = this.d.N0();
            final CollectNameFragment collectNameFragment2 = this.d;
            v.v2(N0, new l<o0, i>() {
                public Object invoke(Object obj) {
                    m0.n.b.i.e((o0) obj, "state");
                    ((AmplitudeAnalytics) v.l(collectNameFragment2)).a("Onboarding-Name-Done");
                    v.a1(collectNameFragment2, ((p1) bVar).a, (q) null, 2);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
