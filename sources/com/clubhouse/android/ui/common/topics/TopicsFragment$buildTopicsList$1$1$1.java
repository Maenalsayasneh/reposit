package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.local.Topic;
import i0.e.b.g3.m.g.a;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: TopicsFragment.kt */
public final class TopicsFragment$buildTopicsList$1$1$1 extends Lambda implements l<Topic, Boolean> {
    public final /* synthetic */ TopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsFragment$buildTopicsList$1$1$1(TopicsFragment topicsFragment) {
        super(1);
        this.c = topicsFragment;
    }

    public Object invoke(Object obj) {
        Topic topic = (Topic) obj;
        i.e(topic, "it");
        this.c.N0().p(new a(topic));
        return Boolean.TRUE;
    }
}
