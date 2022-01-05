package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.CreateEventResponse;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventRepo.kt */
public final class EventRepo$createEvent$2 extends Lambda implements l<CreateEventResponse, i> {
    public final /* synthetic */ EventRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$createEvent$2(EventRepo eventRepo) {
        super(1);
        this.c = eventRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((CreateEventResponse) obj, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-CreateEvent-Success");
        return i.a;
    }
}
