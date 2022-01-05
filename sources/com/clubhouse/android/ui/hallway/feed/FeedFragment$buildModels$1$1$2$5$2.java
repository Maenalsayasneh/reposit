package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.ui.profile.settings.EditTopicsArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.p.c0.x;
import i0.e.b.g3.p.m;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.k;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$buildModels$1$1$2$5$2 extends Lambda implements l<Topic, Boolean> {
    public final /* synthetic */ FeedFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$buildModels$1$1$2$5$2(FeedFragment feedFragment) {
        super(1);
        this.c = feedFragment;
    }

    public Object invoke(Object obj) {
        Topic topic = (Topic) obj;
        FeedFragment feedFragment = this.c;
        k<Object>[] kVarArr = FeedFragment.Z1;
        FeedViewModel P0 = feedFragment.P0();
        i.d(topic, "topic");
        P0.p(new x(topic));
        FeedFragment feedFragment2 = this.c;
        EditTopicsArgs editTopicsArgs = new EditTopicsArgs(topic);
        i.e(editTopicsArgs, "mavericksArg");
        v.a1(feedFragment2, new m(editTopicsArgs), (q) null, 2);
        return Boolean.TRUE;
    }
}
