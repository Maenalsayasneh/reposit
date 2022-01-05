package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.Topic;
import i0.e.b.g3.p.c0.e0.u0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: TopicSuggestions.kt */
public final class TopicSuggestions$bindTopicSuggestions$1$1 extends Lambda implements l<Topic, Boolean> {
    public final /* synthetic */ u0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicSuggestions$bindTopicSuggestions$1$1(u0 u0Var) {
        super(1);
        this.c = u0Var;
    }

    public Object invoke(Object obj) {
        Topic topic = (Topic) obj;
        i.e(topic, "it");
        l<? super Topic, Boolean> lVar = this.c.l;
        if (lVar != null) {
            Boolean invoke = lVar.invoke(topic);
        }
        return Boolean.TRUE;
    }
}
