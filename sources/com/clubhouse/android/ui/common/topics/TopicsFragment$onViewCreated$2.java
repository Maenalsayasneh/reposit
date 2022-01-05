package com.clubhouse.android.ui.common.topics;

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

@c(c = "com.clubhouse.android.ui.common.topics.TopicsFragment$onViewCreated$2", f = "TopicsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: TopicsFragment.kt */
public final class TopicsFragment$onViewCreated$2 extends SuspendLambda implements p<List<? extends ParentTopic>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ TopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsFragment$onViewCreated$2(TopicsFragment topicsFragment, m0.l.c<? super TopicsFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.c = topicsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new TopicsFragment$onViewCreated$2(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        TopicsFragment$onViewCreated$2 topicsFragment$onViewCreated$2 = new TopicsFragment$onViewCreated$2(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        topicsFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        TopicsFragment topicsFragment = this.c;
        k<Object>[] kVarArr = TopicsFragment.Z1;
        v.v2(topicsFragment.N0(), new TopicsFragment$buildTopicsList$1(topicsFragment));
        return i.a;
    }
}
