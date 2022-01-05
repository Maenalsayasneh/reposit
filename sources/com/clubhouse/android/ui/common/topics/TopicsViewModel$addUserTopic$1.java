package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.TopicRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.common.topics.TopicsViewModel$addUserTopic$1", f = "TopicsViewModel.kt", l = {60}, m = "invokeSuspend")
/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel$addUserTopic$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ TopicsViewModel d;
    public final /* synthetic */ Topic q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel$addUserTopic$1(TopicsViewModel topicsViewModel, Topic topic, m0.l.c<? super TopicsViewModel$addUserTopic$1> cVar) {
        super(1, cVar);
        this.d = topicsViewModel;
        this.q = topic;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new TopicsViewModel$addUserTopic$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new TopicsViewModel$addUserTopic$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            TopicRepo topicRepo = this.d.n;
            Topic topic = this.q;
            this.c = 1;
            obj = topicRepo.a(topic, this);
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
