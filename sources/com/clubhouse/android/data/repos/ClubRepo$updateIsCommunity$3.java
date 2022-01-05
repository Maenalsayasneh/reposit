package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubRepo.kt */
public final class ClubRepo$updateIsCommunity$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ ClubRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubRepo$updateIsCommunity$3(ClubRepo clubRepo, int i) {
        super(1);
        this.c = clubRepo;
        this.d = i;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.g).b("Server-UpdateIsCommunity-Error", a.m1("ClubId", Integer.valueOf(this.d)));
        return i.a;
    }
}
