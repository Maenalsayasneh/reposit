package com.clubhouse.android.ui.clubs.create.topics;

import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.g3.l.v2.z.d;
import i0.e.b.g3.m.g.a;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.k;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$buildTopicsList$1$2$2 extends Lambda implements l<Topic, Boolean> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$buildTopicsList$1$2$2(ClubTopicsFragment clubTopicsFragment) {
        super(1);
        this.c = clubTopicsFragment;
    }

    public Object invoke(Object obj) {
        final Topic topic = (Topic) obj;
        i.e(topic, "it");
        ClubTopicsFragment clubTopicsFragment = this.c;
        k<Object>[] kVarArr = ClubTopicsFragment.Z1;
        ClubTopicsViewModel O0 = clubTopicsFragment.O0();
        final ClubTopicsFragment clubTopicsFragment2 = this.c;
        return Boolean.valueOf(((Boolean) v.v2(O0, new l<d, Boolean>() {
            public Object invoke(Object obj) {
                boolean z;
                d dVar = (d) obj;
                i.e(dVar, "state");
                if (dVar.d) {
                    ClubTopicsFragment clubTopicsFragment = ClubTopicsFragment.this;
                    k<Object>[] kVarArr = ClubTopicsFragment.Z1;
                    clubTopicsFragment.O0().p(new a(topic));
                    z = true;
                } else {
                    ClubTopicsFragment clubTopicsFragment2 = ClubTopicsFragment.this;
                    Topic topic = topic;
                    k<Object>[] kVarArr2 = ClubTopicsFragment.Z1;
                    Objects.requireNonNull(clubTopicsFragment2);
                    ClubTopicsFragment$showTopicLimitDialog$1 clubTopicsFragment$showTopicLimitDialog$1 = new ClubTopicsFragment$showTopicLimitDialog$1(clubTopicsFragment2, topic);
                    i.e(clubTopicsFragment2, "<this>");
                    i.e(clubTopicsFragment$showTopicLimitDialog$1, "f");
                    d.a aVar = new d.a(clubTopicsFragment2.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
                    clubTopicsFragment$showTopicLimitDialog$1.invoke(aVar);
                    aVar.g();
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue());
    }
}
