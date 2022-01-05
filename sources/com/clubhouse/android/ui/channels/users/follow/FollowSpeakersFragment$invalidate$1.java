package com.clubhouse.android.ui.channels.users.follow;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import h0.q.p;
import h0.q.q;
import h0.u.w;
import i0.e.b.b3.b.e.d;
import i0.e.b.g3.k.w0.a.e;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;

/* compiled from: FollowSpeakersFragment.kt */
public final class FollowSpeakersFragment$invalidate$1 extends Lambda implements l<e, f1> {
    public final /* synthetic */ FollowSpeakersFragment c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.channels.users.follow.FollowSpeakersFragment$invalidate$1$1", f = "FollowSpeakersFragment.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.channels.users.follow.FollowSpeakersFragment$invalidate$1$1  reason: invalid class name */
    /* compiled from: FollowSpeakersFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements m0.n.a.p<f0, c<? super m0.i>, Object> {
        public int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(eVar, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(eVar, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                PagingDataEpoxyController<d> pagingDataEpoxyController = FollowSpeakersFragment.this.t2;
                w<d> wVar = eVar.a;
                this.c = 1;
                if (pagingDataEpoxyController.submitData(wVar, this) == coroutineSingletons) {
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
    public FollowSpeakersFragment$invalidate$1(FollowSpeakersFragment followSpeakersFragment) {
        super(1);
        this.c = followSpeakersFragment;
    }

    public Object invoke(Object obj) {
        final e eVar = (e) obj;
        i.e(eVar, "state");
        p viewLifecycleOwner = this.c.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = q.a(viewLifecycleOwner);
        final FollowSpeakersFragment followSpeakersFragment = this.c;
        return a.E2(a, (m0.l.e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
