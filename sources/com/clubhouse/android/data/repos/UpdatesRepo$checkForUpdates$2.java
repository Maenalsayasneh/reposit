package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UpdatesRepo.kt */
public final class UpdatesRepo$checkForUpdates$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ UpdatesRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesRepo$checkForUpdates$2(UpdatesRepo updatesRepo) {
        super(1);
        this.c = updatesRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-CheckForUpdate-Error");
        return i.a;
    }
}
