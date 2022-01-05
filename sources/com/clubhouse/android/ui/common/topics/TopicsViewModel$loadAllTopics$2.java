package com.clubhouse.android.ui.common.topics;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.ParentTopic;
import com.clubhouse.android.data.models.remote.response.GetAllTopicsResponse;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.m.g.d;
import i0.e.b.g3.r.n1;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel$loadAllTopics$2 extends Lambda implements p<d, b<? extends GetAllTopicsResponse>, d> {
    public final /* synthetic */ TopicsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel$loadAllTopics$2(TopicsViewModel topicsViewModel) {
        super(2);
        this.c = topicsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        d dVar = (d) obj;
        b bVar = (b) obj2;
        i.e(dVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            TopicsViewModel topicsViewModel = this.c;
            List<ParentTopic> list = ((GetAllTopicsResponse) ((f0) bVar).b).a;
            Objects.requireNonNull(topicsViewModel);
            MavericksViewModel.f(topicsViewModel, new TopicsViewModel$loadSelectedTopics$1(topicsViewModel, (c<? super TopicsViewModel$loadSelectedTopics$1>) null), (d0) null, (m) null, new TopicsViewModel$loadSelectedTopics$2(topicsViewModel, list), 3, (Object) null);
        } else if (bVar instanceof i0.b.b.c) {
            this.c.o(n1.a);
        }
        return dVar;
    }
}
