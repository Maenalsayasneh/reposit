package com.clubhouse.android.ui.common.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.e.b.g3.m.g.d;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel$removeUserTopic$2 extends Lambda implements p<d, b<? extends EmptySuccessResponse>, d> {
    public final /* synthetic */ Topic c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel$removeUserTopic$2(Topic topic) {
        super(2);
        this.c = topic;
    }

    public Object invoke(Object obj, Object obj2) {
        d dVar = (d) obj;
        i.e(dVar, "$this$execute");
        i.e((b) obj2, "it");
        return d.copy$default(dVar, (List) null, g.T(dVar.b, Integer.valueOf(this.c.c)), 1, (Object) null);
    }
}
