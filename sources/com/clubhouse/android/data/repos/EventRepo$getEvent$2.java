package com.clubhouse.android.data.repos;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.e.a.a;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: EventRepo.kt */
public final class EventRepo$getEvent$2 extends Lambda implements l<Exception, i> {
    public final /* synthetic */ EventRepo c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$getEvent$2(EventRepo eventRepo, String str) {
        super(1);
        this.c = eventRepo;
        this.d = str;
    }

    public Object invoke(Object obj) {
        Map map;
        m0.n.b.i.e((Exception) obj, "it");
        a aVar = this.c.b;
        String str = this.d;
        if (str == null) {
            map = null;
        } else {
            map = i0.d.a.a.a.n1("hash_id", str);
        }
        if (map == null) {
            map = g.o();
        }
        ((AmplitudeAnalytics) aVar).b("Server-GetEvent-Error", map);
        return i.a;
    }
}
