package com.clubhouse.android.ui.search;

import androidx.paging.TerminalSeparatorType;
import com.clubhouse.android.ui.search.ExploreFragment;
import com.clubhouse.app.R;
import g0.a.b.b.a;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.w.z;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.search.ExploreFragment$invalidate$1$1$1", f = "ExploreFragment.kt", l = {138, 144}, m = "invokeSuspend")
/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$invalidate$1$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ z d;
    public final /* synthetic */ ExploreFragment q;
    public final /* synthetic */ w<j> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$invalidate$1$1$1(z zVar, ExploreFragment exploreFragment, w<j> wVar, m0.l.c<? super ExploreFragment$invalidate$1$1$1> cVar) {
        super(2, cVar);
        this.d = zVar;
        this.q = exploreFragment;
        this.x = wVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ExploreFragment$invalidate$1$1$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ExploreFragment$invalidate$1$1$1(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            if (this.d.b == Mode.SUGGESTED) {
                ExploreFragment exploreFragment = this.q;
                ExploreFragment.PagingController pagingController = exploreFragment.d2;
                w<j> wVar = this.x;
                String string = exploreFragment.getString(R.string.people_to_follow);
                m0.n.b.i.d(string, "getString(R.string.people_to_follow)");
                w W = a.W(wVar, (TerminalSeparatorType) null, new i0.e.b.b3.b.e.h(string), 1);
                this.c = 1;
                if (pagingController.submitData(W, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                ExploreFragment.PagingController pagingController2 = this.q.d2;
                w<j> wVar2 = this.x;
                this.c = 2;
                if (pagingController2.submitData(wVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
