package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetCreateClubResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubRepo.kt */
public final class ClubRepo$createClub$2 extends Lambda implements l<GetCreateClubResponse, i> {
    public final /* synthetic */ ClubRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$createClub$2(ClubRepo clubRepo) {
        super(1);
        this.c = clubRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((GetCreateClubResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.g).a("Server-CreateClub-Success");
        return i.a;
    }
}
