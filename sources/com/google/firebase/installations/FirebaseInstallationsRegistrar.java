package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import i0.h.a.b.c.m.b;
import i0.h.c.c;
import i0.h.c.j.d;
import i0.h.c.j.e;
import i0.h.c.j.h;
import i0.h.c.j.r;
import i0.h.c.r.f;
import i0.h.c.r.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements h {
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        return new f((c) eVar.a(c.class), eVar.b(i0.h.c.u.h.class), eVar.b(HeartBeatInfo.class));
    }

    public List<d<?>> getComponents() {
        d.b<g> a = d.a(g.class);
        a.a(new r(c.class, 1, 0));
        a.a(new r(HeartBeatInfo.class, 0, 1));
        a.a(new r(i0.h.c.u.h.class, 0, 1));
        a.d(i0.h.c.r.h.a);
        return Arrays.asList(new d[]{a.c(), b.x("fire-installations", "16.3.5")});
    }
}
