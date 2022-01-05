package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UserRepo.kt */
public final class UserRepo$addEmail$2 extends Lambda implements l<EmptySuccessResponse, i> {
    public final /* synthetic */ UserRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$addEmail$2(UserRepo userRepo) {
        super(1);
        this.c = userRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((EmptySuccessResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.i).a("Server-AddEmail-Success");
        return i.a;
    }
}
