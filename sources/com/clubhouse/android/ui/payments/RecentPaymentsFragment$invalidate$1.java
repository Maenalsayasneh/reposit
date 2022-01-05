package com.clubhouse.android.ui.payments;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.clubhouse.android.ui.payments.RecentPaymentsFragment;
import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.b3.b.e.k;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;

/* compiled from: RecentPaymentsFragment.kt */
public final class RecentPaymentsFragment$invalidate$1 extends Lambda implements l<GetRecentPaymentsState, f1> {
    public final /* synthetic */ RecentPaymentsFragment c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.payments.RecentPaymentsFragment$invalidate$1$1", f = "RecentPaymentsFragment.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.payments.RecentPaymentsFragment$invalidate$1$1  reason: invalid class name */
    /* compiled from: RecentPaymentsFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements m0.n.a.p<f0, c<? super m0.i>, Object> {
        public int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(getRecentPaymentsState, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(getRecentPaymentsState, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                RecentPaymentsFragment.RecentPaymentItemContoller recentPaymentItemContoller = RecentPaymentsFragment.this.c2;
                w<k> wVar = getRecentPaymentsState.d;
                this.c = 1;
                if (recentPaymentItemContoller.submitData(wVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m0.i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsFragment$invalidate$1(RecentPaymentsFragment recentPaymentsFragment) {
        super(1);
        this.c = recentPaymentsFragment;
    }

    public Object invoke(Object obj) {
        final GetRecentPaymentsState getRecentPaymentsState = (GetRecentPaymentsState) obj;
        i.e(getRecentPaymentsState, "state");
        p viewLifecycleOwner = this.c.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = q.a(viewLifecycleOwner);
        final RecentPaymentsFragment recentPaymentsFragment = this.c;
        return a.E2(a, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
