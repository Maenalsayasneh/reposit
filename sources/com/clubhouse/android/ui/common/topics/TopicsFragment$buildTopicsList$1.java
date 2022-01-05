package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.local.ParentTopic;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.g3.m.g.d;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: TopicsFragment.kt */
public final class TopicsFragment$buildTopicsList$1 extends Lambda implements l<d, i> {
    public final /* synthetic */ TopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsFragment$buildTopicsList$1(TopicsFragment topicsFragment) {
        super(1);
        this.c = topicsFragment;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        m0.n.b.i.e(dVar, "state");
        this.c.Q0().removeAllViews();
        if (!dVar.a.isEmpty()) {
            this.c.getLayoutInflater().inflate(this.c.O0(), this.c.Q0());
            List<ParentTopic> list = dVar.a;
            TopicsFragment topicsFragment = this.c;
            for (ParentTopic parentTopic : list) {
                v.k(topicsFragment, parentTopic.d, topicsFragment.Q0());
                List list2 = parentTopic.x;
                if (list2 == null) {
                    list2 = EmptyList.c;
                }
                v.j(topicsFragment, list2, dVar.b, topicsFragment.Q0(), 0, new TopicsFragment$buildTopicsList$1$1$1(topicsFragment), new TopicsFragment$buildTopicsList$1$1$2(topicsFragment), 8);
            }
            k.p(this.c.P0());
            this.c.R0();
        }
        return i.a;
    }
}
