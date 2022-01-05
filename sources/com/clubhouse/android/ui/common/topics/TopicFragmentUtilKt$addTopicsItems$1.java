package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.local.Topic;
import i0.b.a.o;
import i0.e.b.g3.r.b3.h;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: TopicFragmentUtil.kt */
public final class TopicFragmentUtilKt$addTopicsItems$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ List<Topic> c;
    public final /* synthetic */ Set<Integer> d;
    public final /* synthetic */ l<Topic, Boolean> q;
    public final /* synthetic */ l<Topic, i> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicFragmentUtilKt$addTopicsItems$1(List<Topic> list, Set<Integer> set, l<? super Topic, Boolean> lVar, l<? super Topic, i> lVar2) {
        super(1);
        this.c = list;
        this.d = set;
        this.q = lVar;
        this.x = lVar2;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        List<Topic> list = this.c;
        Set<Integer> set = this.d;
        l<Topic, Boolean> lVar = this.q;
        l<Topic, i> lVar2 = this.x;
        for (Topic topic : list) {
            h hVar = new h();
            hVar.L(new Number[]{Integer.valueOf(topic.c)});
            hVar.P(topic.d);
            hVar.O(set.contains(Integer.valueOf(topic.c)));
            hVar.M(new TopicFragmentUtilKt$addTopicsItems$1$1$1$1(lVar, topic));
            hVar.N(new TopicFragmentUtilKt$addTopicsItems$1$1$1$2(lVar2, topic));
            oVar.add(hVar);
        }
        return i.a;
    }
}
