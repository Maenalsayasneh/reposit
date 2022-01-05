package com.clubhouse.android.ui.clubs.create;

import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.ui.clubs.create.topics.ClubTopicsArgs;
import h0.b0.v;
import i0.e.b.g3.l.v2.m;
import i0.e.b.g3.l.v2.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CreateClubFragment.kt */
public final class CreateClubFragment$onViewCreated$10$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ CreateClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubFragment$onViewCreated$10$1(CreateClubFragment createClubFragment) {
        super(1);
        this.c = createClubFragment;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        CreateClubFragment createClubFragment = this.c;
        ClubTopicsArgs clubTopicsArgs = new ClubTopicsArgs((Club) null, qVar.j);
        m0.n.b.i.e(clubTopicsArgs, "mavericksArg");
        v.a1(createClubFragment, new m(clubTopicsArgs), (h0.t.q) null, 2);
        return i.a;
    }
}
