package com.clubhouse.android.ui.clubs.invites;

import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$filterMembers$1", f = "GrowClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$filterMembers$1 extends SuspendLambda implements p<j, m0.l.c<? super Boolean>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ List<Integer> d;
    public final /* synthetic */ Set<Integer> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$filterMembers$1(List<Integer> list, Set<Integer> set, m0.l.c<? super GrowClubFragment$filterMembers$1> cVar) {
        super(2, cVar);
        this.d = list;
        this.q = set;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        GrowClubFragment$filterMembers$1 growClubFragment$filterMembers$1 = new GrowClubFragment$filterMembers$1(this.d, this.q, cVar);
        growClubFragment$filterMembers$1.c = obj;
        return growClubFragment$filterMembers$1;
    }

    public Object invoke(Object obj, Object obj2) {
        GrowClubFragment$filterMembers$1 growClubFragment$filterMembers$1 = new GrowClubFragment$filterMembers$1(this.d, this.q, (m0.l.c) obj2);
        growClubFragment$filterMembers$1.c = (j) obj;
        return growClubFragment$filterMembers$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        int intValue = ((m) ((j) this.c)).g.getId().intValue();
        return Boolean.valueOf(!this.d.contains(new Integer(intValue)) || this.q.contains(new Integer(intValue)));
    }
}
