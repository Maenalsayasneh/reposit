package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.HalfEventArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.l.l1;
import i0.e.b.g3.l.m2;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$7 extends Lambda implements l<EventInClub, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$7(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        EventInClub eventInClub = (EventInClub) obj;
        m0.n.b.i.e(eventInClub, "event");
        ClubFragment clubFragment = this.c;
        HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, Integer.valueOf(eventInClub.Y1), (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 125);
        m0.n.b.i.e(halfEventArgs, "mavericksArg");
        v.a1(clubFragment, new l1(halfEventArgs), (q) null, 2);
        this.c.T0().p(m2.a);
        return i.a;
    }
}
