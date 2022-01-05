package com.clubhouse.android.ui.recentSpeakers;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment;
import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.v.f;
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

/* compiled from: RecentSpeakersFragment.kt */
public final class RecentSpeakersFragment$invalidate$1 extends Lambda implements l<f, f1> {
    public final /* synthetic */ RecentSpeakersFragment c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment$invalidate$1$1", f = "RecentSpeakersFragment.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment$invalidate$1$1  reason: invalid class name */
    /* compiled from: RecentSpeakersFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements m0.n.a.p<f0, c<? super m0.i>, Object> {
        public int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(fVar, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(fVar, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                RecentSpeakersFragment.PagingController pagingController = RecentSpeakersFragment.this.c2;
                w<m> wVar = fVar.a;
                this.c = 1;
                if (pagingController.submitData(wVar, this) == coroutineSingletons) {
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
    public RecentSpeakersFragment$invalidate$1(RecentSpeakersFragment recentSpeakersFragment) {
        super(1);
        this.c = recentSpeakersFragment;
    }

    public Object invoke(Object obj) {
        final f fVar = (f) obj;
        i.e(fVar, "state");
        p viewLifecycleOwner = this.c.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = q.a(viewLifecycleOwner);
        final RecentSpeakersFragment recentSpeakersFragment = this.c;
        return a.E2(a, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
