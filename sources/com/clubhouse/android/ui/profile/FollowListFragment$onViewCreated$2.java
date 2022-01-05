package com.clubhouse.android.ui.profile;

import android.widget.ProgressBar;
import android.widget.TextView;
import i0.e.b.d3.k;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.FollowListFragment$onViewCreated$2", f = "FollowListFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowListFragment.kt */
public final class FollowListFragment$onViewCreated$2 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowListFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowListFragment$onViewCreated$2(FollowListFragment followListFragment, m0.l.c<? super FollowListFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = followListFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowListFragment$onViewCreated$2 followListFragment$onViewCreated$2 = new FollowListFragment$onViewCreated$2(this.d, cVar);
        followListFragment$onViewCreated$2.c = obj;
        return followListFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowListFragment$onViewCreated$2 followListFragment$onViewCreated$2 = new FollowListFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        followListFragment$onViewCreated$2.c = (d) obj;
        i iVar = i.a;
        followListFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        d dVar = (d) this.c;
        TextView textView = this.d.N0().b;
        m0.n.b.i.d(textView, "binding.emptyText");
        k.L(textView, Boolean.valueOf(dVar instanceof d.a));
        ProgressBar progressBar = this.d.N0().d;
        m0.n.b.i.d(progressBar, "binding.loading");
        k.L(progressBar, Boolean.valueOf(dVar instanceof d.C0203d));
        return i.a;
    }
}
