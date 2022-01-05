package com.clubhouse.android.ui.payments;

import android.widget.FrameLayout;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.payments.RecentPaymentsFragment$configurePagingController$1", f = "RecentPaymentsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: RecentPaymentsFragment.kt */
public final class RecentPaymentsFragment$configurePagingController$1 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ RecentPaymentsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsFragment$configurePagingController$1(RecentPaymentsFragment recentPaymentsFragment, m0.l.c<? super RecentPaymentsFragment$configurePagingController$1> cVar) {
        super(2, cVar);
        this.d = recentPaymentsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        RecentPaymentsFragment$configurePagingController$1 recentPaymentsFragment$configurePagingController$1 = new RecentPaymentsFragment$configurePagingController$1(this.d, cVar);
        recentPaymentsFragment$configurePagingController$1.c = obj;
        return recentPaymentsFragment$configurePagingController$1;
    }

    public Object invoke(Object obj, Object obj2) {
        RecentPaymentsFragment$configurePagingController$1 recentPaymentsFragment$configurePagingController$1 = new RecentPaymentsFragment$configurePagingController$1(this.d, (m0.l.c) obj2);
        recentPaymentsFragment$configurePagingController$1.c = (d) obj;
        i iVar = i.a;
        recentPaymentsFragment$configurePagingController$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        d dVar = (d) this.c;
        RecentPaymentsFragment recentPaymentsFragment = this.d;
        k<Object>[] kVarArr = RecentPaymentsFragment.Z1;
        FrameLayout frameLayout = recentPaymentsFragment.N0().b;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(dVar instanceof d.C0203d));
        if (dVar instanceof d.b) {
            final RecentPaymentsFragment recentPaymentsFragment2 = this.d;
            v.f2(recentPaymentsFragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(recentPaymentsFragment2.getString(R.string.recent_payments_error));
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
