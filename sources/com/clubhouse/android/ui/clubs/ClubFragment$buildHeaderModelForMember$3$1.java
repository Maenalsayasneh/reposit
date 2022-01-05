package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.EventInClub;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForMember$3$1 extends Lambda implements l<EventInClub, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForMember$3$1(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        EventInClub eventInClub = (EventInClub) obj;
        ClubFragment clubFragment = this.c;
        m0.n.b.i.d(eventInClub, "event");
        ClubFragment.R0(clubFragment, eventInClub);
        return i.a;
    }
}
