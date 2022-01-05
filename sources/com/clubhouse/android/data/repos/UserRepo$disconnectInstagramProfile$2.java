package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.request.UpdateInstagramProfileResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UserRepo.kt */
public final class UserRepo$disconnectInstagramProfile$2 extends Lambda implements l<UpdateInstagramProfileResponse, i> {
    public final /* synthetic */ UserRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$disconnectInstagramProfile$2(UserRepo userRepo) {
        super(1);
        this.c = userRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((UpdateInstagramProfileResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.i).a("Server-UpdateInstagramProfile-Success");
        return i.a;
    }
}
