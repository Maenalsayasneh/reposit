package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetIncidentCategoriesResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: UserRepo.kt */
public final class UserRepo$getIncidentCategories$2 extends Lambda implements l<GetIncidentCategoriesResponse, i> {
    public final /* synthetic */ UserRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getIncidentCategories$2(UserRepo userRepo) {
        super(1);
        this.c = userRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((GetIncidentCategoriesResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.i).a("Server-ReportAnIncident-Success");
        return i.a;
    }
}
