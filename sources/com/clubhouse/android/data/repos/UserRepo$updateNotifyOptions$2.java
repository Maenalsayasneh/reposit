package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.d.a.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UserRepo.kt */
public final class UserRepo$updateNotifyOptions$2 extends Lambda implements l<EmptySuccessResponse, i> {
    public final /* synthetic */ UserRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$updateNotifyOptions$2(UserRepo userRepo, int i) {
        super(1);
        this.c = userRepo;
        this.d = i;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((EmptySuccessResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.i).b("Server-UpdateFollowNotificationType-Success", a.m1("UserId", Integer.valueOf(this.d)));
        return i.a;
    }
}
