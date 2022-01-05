package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubRepo.kt */
public final class ClubRepo$updateClubRules$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ ClubRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$updateClubRules$3(ClubRepo clubRepo) {
        super(1);
        this.c = clubRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.g).a("Server-UpdateRules-Error");
        return i.a;
    }
}
