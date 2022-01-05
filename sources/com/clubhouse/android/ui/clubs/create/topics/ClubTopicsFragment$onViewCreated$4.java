package com.clubhouse.android.ui.clubs.create.topics;

import com.clubhouse.android.data.models.local.ParentTopic;
import h0.b0.v;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.clubs.create.topics.ClubTopicsFragment$onViewCreated$4", f = "ClubTopicsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$onViewCreated$4 extends SuspendLambda implements p<List<? extends ParentTopic>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$onViewCreated$4(ClubTopicsFragment clubTopicsFragment, m0.l.c<? super ClubTopicsFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.c = clubTopicsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ClubTopicsFragment$onViewCreated$4(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        ClubTopicsFragment$onViewCreated$4 clubTopicsFragment$onViewCreated$4 = new ClubTopicsFragment$onViewCreated$4(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        clubTopicsFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ClubTopicsFragment clubTopicsFragment = this.c;
        k<Object>[] kVarArr = ClubTopicsFragment.Z1;
        v.v2(clubTopicsFragment.O0(), new ClubTopicsFragment$buildTopicsList$1(clubTopicsFragment));
        return i.a;
    }
}
