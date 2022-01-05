package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.remote.response.GetAllTopicsResponse;
import com.clubhouse.android.data.repos.TopicRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.common.topics.TopicsViewModel$loadAllTopics$1", f = "TopicsViewModel.kt", l = {76}, m = "invokeSuspend")
/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel$loadAllTopics$1 extends SuspendLambda implements l<m0.l.c<? super GetAllTopicsResponse>, Object> {
    public int c;
    public final /* synthetic */ TopicsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel$loadAllTopics$1(TopicsViewModel topicsViewModel, m0.l.c<? super TopicsViewModel$loadAllTopics$1> cVar) {
        super(1, cVar);
        this.d = topicsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new TopicsViewModel$loadAllTopics$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new TopicsViewModel$loadAllTopics$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            TopicRepo topicRepo = this.d.n;
            this.c = 1;
            obj = topicRepo.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
