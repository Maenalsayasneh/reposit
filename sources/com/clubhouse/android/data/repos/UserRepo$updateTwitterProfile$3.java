package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UserRepo.kt */
public final class UserRepo$updateTwitterProfile$3 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ UserRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$updateTwitterProfile$3(UserRepo userRepo) {
        super(1);
        this.c = userRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.i).a("Server-UpdateTwitterUsername-Error");
        return i.a;
    }
}
