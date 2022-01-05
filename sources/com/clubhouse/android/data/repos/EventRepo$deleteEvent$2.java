package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventRepo.kt */
public final class EventRepo$deleteEvent$2 extends Lambda implements l<EmptySuccessResponse, i> {
    public final /* synthetic */ EventRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$deleteEvent$2(EventRepo eventRepo) {
        super(1);
        this.c = eventRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((EmptySuccessResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-DeleteEvent-Success");
        return i.a;
    }
}
