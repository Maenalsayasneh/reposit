package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.r.s1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.CollectPhoneNumberFragment$onViewCreated$1", f = "CollectPhoneNumberFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CollectPhoneNumberFragment.kt */
public final class CollectPhoneNumberFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CollectPhoneNumberFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberFragment$onViewCreated$1(CollectPhoneNumberFragment collectPhoneNumberFragment, m0.l.c<? super CollectPhoneNumberFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = collectPhoneNumberFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CollectPhoneNumberFragment$onViewCreated$1 collectPhoneNumberFragment$onViewCreated$1 = new CollectPhoneNumberFragment$onViewCreated$1(this.d, cVar);
        collectPhoneNumberFragment$onViewCreated$1.c = obj;
        return collectPhoneNumberFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        CollectPhoneNumberFragment$onViewCreated$1 collectPhoneNumberFragment$onViewCreated$1 = new CollectPhoneNumberFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        collectPhoneNumberFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        collectPhoneNumberFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final CollectPhoneNumberFragment collectPhoneNumberFragment = this.d;
            v.f2(collectPhoneNumberFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = collectPhoneNumberFragment.getString(R.string.blocked_number_error);
                        m0.n.b.i.d(str, "getString(R.string.blocked_number_error)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof s1) {
            ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-PhoneNumber-Done");
            v.a1(this.d, ((s1) bVar).a, (q) null, 2);
        }
        return i.a;
    }
}
