package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.ui.clubs.ClubMemberSearchFragment;
import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.ClubMemberSearchFragment$onViewCreated$4", f = "ClubMemberSearchFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubMemberSearchFragment.kt */
public final class ClubMemberSearchFragment$onViewCreated$4 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ClubMemberSearchFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchFragment$onViewCreated$4(ClubMemberSearchFragment clubMemberSearchFragment, m0.l.c<? super ClubMemberSearchFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = clubMemberSearchFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ClubMemberSearchFragment$onViewCreated$4 clubMemberSearchFragment$onViewCreated$4 = new ClubMemberSearchFragment$onViewCreated$4(this.d, cVar);
        clubMemberSearchFragment$onViewCreated$4.c = obj;
        return clubMemberSearchFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        ClubMemberSearchFragment$onViewCreated$4 clubMemberSearchFragment$onViewCreated$4 = new ClubMemberSearchFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        clubMemberSearchFragment$onViewCreated$4.c = (String) obj;
        i iVar = i.a;
        clubMemberSearchFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ClubMemberSearchFragment clubMemberSearchFragment = this.d;
        ClubMemberSearchFragment.a aVar = ClubMemberSearchFragment.Z1;
        clubMemberSearchFragment.O0().p(new b((String) this.c));
        return i.a;
    }
}
