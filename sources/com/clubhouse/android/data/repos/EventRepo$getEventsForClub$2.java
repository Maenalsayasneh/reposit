package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventRepo.kt */
public final class EventRepo$getEventsForClub$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ EventRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$getEventsForClub$2(EventRepo eventRepo) {
        super(1);
        this.c = eventRepo;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((Exception) obj, "it");
        ((AmplitudeAnalytics) this.c.b).a("Server-GetEventsForClub-Error");
        return i.a;
    }
}
