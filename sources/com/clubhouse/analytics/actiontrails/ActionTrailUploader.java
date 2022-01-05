package com.clubhouse.analytics.actiontrails;

import androidx.work.NetworkType;
import com.clubhouse.android.data.models.local.ActionTrail;
import h0.g0.b;
import h0.g0.n;
import i0.j.f.p.h;
import j$.time.Instant;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineStart;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import n0.a.f0;
import n0.a.m0;
import n0.c.l.a;

/* compiled from: ActionTrailUploader.kt */
public final class ActionTrailUploader {
    public static final b a;
    public final n b;
    public final a c;
    public final i0.k.a.a d;
    public final f0 e = m0.r.t.a.r.m.a1.a.h(m0.c);

    static {
        b.a aVar = new b.a();
        aVar.a = NetworkType.CONNECTED;
        b bVar = new b(aVar);
        i.d(bVar, "Builder()\n            .setRequiredNetworkType(NetworkType.CONNECTED)\n            .build()");
        a = bVar;
    }

    public ActionTrailUploader(n nVar, a aVar, i0.k.a.a aVar2) {
        i.e(nVar, "workManager");
        i.e(aVar, "json");
        i.e(aVar2, "cache");
        this.b = nVar;
        this.c = aVar;
        this.d = aVar2;
    }

    public final void a(String str, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        String str2 = str;
        i.e(str2, "event");
        i.e(map2, "properties");
        long epochSecond = Instant.now().getEpochSecond();
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "randomUUID().toString()");
        m0.r.t.a.r.m.a1.a.E2(this.e, (e) null, (CoroutineStart) null, new ActionTrailUploader$record$1(this, uuid, new ActionTrail(str2, epochSecond, uuid, g.b0(map2, h.S2(new Pair("client_time_recorded", String.valueOf(epochSecond))))), (c<? super ActionTrailUploader$record$1>) null), 3, (Object) null);
    }
}
