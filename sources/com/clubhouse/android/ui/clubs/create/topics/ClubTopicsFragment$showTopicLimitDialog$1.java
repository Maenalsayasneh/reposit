package com.clubhouse.android.ui.clubs.create.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.l.v2.z.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$showTopicLimitDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ClubTopicsFragment c;
    public final /* synthetic */ Topic d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$showTopicLimitDialog$1(ClubTopicsFragment clubTopicsFragment, Topic topic) {
        super(1);
        this.c = clubTopicsFragment;
        this.d = topic;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.club_topic_limit_dialog_title);
        aVar.a.f = this.c.getString(R.string.club_topic_limit_unselect, this.d.d);
        aVar.d(R.string.ok, b.c);
        return i.a;
    }
}
