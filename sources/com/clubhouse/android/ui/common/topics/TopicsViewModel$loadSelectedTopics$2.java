package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.local.ParentTopic;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.g3.m.g.d;
import i0.e.b.g3.r.n1;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel$loadSelectedTopics$2 extends Lambda implements p<d, b<? extends GetProfileResponse>, d> {
    public final /* synthetic */ TopicsViewModel c;
    public final /* synthetic */ List<ParentTopic> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel$loadSelectedTopics$2(TopicsViewModel topicsViewModel, List<ParentTopic> list) {
        super(2);
        this.c = topicsViewModel;
        this.d = list;
    }

    public Object invoke(Object obj, Object obj2) {
        d dVar = (d) obj;
        final b bVar = (b) obj2;
        i.e(dVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            TopicsViewModel topicsViewModel = this.c;
            final List<ParentTopic> list = this.d;
            topicsViewModel.m(new l<d, d>() {
                public Object invoke(Object obj) {
                    Set set;
                    i.e((d) obj, "$this$setState");
                    List<ParentTopic> list = list;
                    List<Topic> list2 = ((GetProfileResponse) ((f0) bVar).b).a.q2;
                    if (list2 == null) {
                        set = null;
                    } else {
                        ArrayList arrayList = new ArrayList(h.K(list2, 10));
                        for (Topic topic : list2) {
                            arrayList.add(Integer.valueOf(topic.c));
                        }
                        set = g.D0(arrayList);
                    }
                    if (set == null) {
                        set = EmptySet.c;
                    }
                    i.e(list, "topics");
                    i.e(set, "selected");
                    return new d(list, set);
                }
            });
        } else if (bVar instanceof c) {
            this.c.o(n1.a);
        }
        return dVar;
    }
}
