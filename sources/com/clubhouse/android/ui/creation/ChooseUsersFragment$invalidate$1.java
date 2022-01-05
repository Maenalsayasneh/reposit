package com.clubhouse.android.ui.creation;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import h0.q.p;
import h0.u.w;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.n.q;
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

/* compiled from: ChooseUsersFragment.kt */
public final class ChooseUsersFragment$invalidate$1 extends Lambda implements l<q, f1> {
    public final /* synthetic */ ChooseUsersFragment c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.creation.ChooseUsersFragment$invalidate$1$1", f = "ChooseUsersFragment.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.creation.ChooseUsersFragment$invalidate$1$1  reason: invalid class name */
    /* compiled from: ChooseUsersFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements m0.n.a.p<f0, c<? super m0.i>, Object> {
        public int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(qVar, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(qVar, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                PagingDataEpoxyController<i0.e.b.a3.d.a<m>> pagingDataEpoxyController = ChooseUsersFragment.this.t2;
                w<i0.e.b.a3.d.a<m>> wVar = qVar.a;
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
    public ChooseUsersFragment$invalidate$1(ChooseUsersFragment chooseUsersFragment) {
        super(1);
        this.c = chooseUsersFragment;
    }

    public Object invoke(Object obj) {
        final q qVar = (q) obj;
        i.e(qVar, "state");
        p viewLifecycleOwner = this.c.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleCoroutineScope a = h0.q.q.a(viewLifecycleOwner);
        final ChooseUsersFragment chooseUsersFragment = this.c;
        return a.E2(a, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
