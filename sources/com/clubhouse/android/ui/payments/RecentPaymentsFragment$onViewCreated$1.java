package com.clubhouse.android.ui.payments;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.payments.RecentPaymentsFragment$onViewCreated$1", f = "RecentPaymentsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: RecentPaymentsFragment.kt */
public final class RecentPaymentsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ RecentPaymentsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsFragment$onViewCreated$1(RecentPaymentsFragment recentPaymentsFragment, m0.l.c<? super RecentPaymentsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = recentPaymentsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        RecentPaymentsFragment$onViewCreated$1 recentPaymentsFragment$onViewCreated$1 = new RecentPaymentsFragment$onViewCreated$1(this.d, cVar);
        recentPaymentsFragment$onViewCreated$1.c = obj;
        return recentPaymentsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        RecentPaymentsFragment$onViewCreated$1 recentPaymentsFragment$onViewCreated$1 = new RecentPaymentsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        recentPaymentsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        recentPaymentsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final RecentPaymentsFragment recentPaymentsFragment = this.d;
            v.f2(recentPaymentsFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = recentPaymentsFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
