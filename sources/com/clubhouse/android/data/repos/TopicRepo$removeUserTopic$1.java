package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.Topic;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.TopicRepo", f = "TopicRepo.kt", l = {32}, m = "removeUserTopic")
/* compiled from: TopicRepo.kt */
public final class TopicRepo$removeUserTopic$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ TopicRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicRepo$removeUserTopic$1(TopicRepo topicRepo, m0.l.c<? super TopicRepo$removeUserTopic$1> cVar) {
        super(cVar);
        this.d = topicRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.c((Topic) null, this);
    }
}
