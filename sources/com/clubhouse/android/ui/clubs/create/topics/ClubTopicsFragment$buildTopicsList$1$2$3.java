package com.clubhouse.android.ui.clubs.create.topics;

import com.clubhouse.android.data.models.local.Topic;
import i0.e.b.g3.m.g.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$buildTopicsList$1$2$3 extends Lambda implements l<Topic, i> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$buildTopicsList$1$2$3(ClubTopicsFragment clubTopicsFragment) {
        super(1);
        this.c = clubTopicsFragment;
    }

    public Object invoke(Object obj) {
        Topic topic = (Topic) obj;
        m0.n.b.i.e(topic, "it");
        ClubTopicsFragment clubTopicsFragment = this.c;
        k<Object>[] kVarArr = ClubTopicsFragment.Z1;
        clubTopicsFragment.O0().p(new b(topic));
        return i.a;
    }
}
