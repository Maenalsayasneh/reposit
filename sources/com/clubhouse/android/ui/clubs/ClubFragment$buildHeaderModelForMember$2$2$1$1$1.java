package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import h0.t.q;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$buildHeaderModelForMember$2$2$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ ClubFragment c;
    public final /* synthetic */ ClubWithAdmin d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$buildHeaderModelForMember$2$2$1$1$1(ClubFragment clubFragment, ClubWithAdmin clubWithAdmin) {
        super(0);
        this.c = clubFragment;
        this.d = clubWithAdmin;
    }

    public Object invoke() {
        ClubFragment clubFragment = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        Boolean bool = Boolean.FALSE;
        m0.n.b.i.e(clubFragment, "<this>");
        m0.n.b.i.e(clubWithAdmin, "club");
        HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(clubWithAdmin, bool, "", SourceLocation.CLUB, (Map) null, 16);
        i0.d.a.a.a.m(halfClubRulesArgs, "mavericksArg", halfClubRulesArgs, clubFragment, (q) null, 2);
        return i.a;
    }
}
