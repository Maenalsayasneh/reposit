package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import i0.h.a.a.d;
import i0.h.a.a.e;
import i0.h.a.a.f;
import i0.h.c.j.d;
import i0.h.c.j.h;
import i0.h.c.j.r;
import i0.h.c.r.g;
import i0.h.c.t.v;
import i0.h.c.t.w;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class FirebaseMessagingRegistrar implements h {

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static class b<T> implements e<T> {
        public b(a aVar) {
        }

        public void a(i0.h.a.a.c<T> cVar) {
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static class c implements f {
        public <T> e<T> a(String str, Class<T> cls, i0.h.a.a.b bVar, d<T, byte[]> dVar) {
            return new b((a) null);
        }
    }

    public static f determineFactory(f fVar) {
        if (fVar == null) {
            return new c();
        }
        try {
            fVar.a("test", String.class, new i0.h.a.a.b("json"), w.a);
            return fVar;
        } catch (IllegalArgumentException unused) {
            return new c();
        }
    }

    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(i0.h.c.j.e eVar) {
        return new FirebaseMessaging((i0.h.c.c) eVar.a(i0.h.c.c.class), (FirebaseInstanceIdInternal) eVar.a(FirebaseInstanceIdInternal.class), eVar.b(i0.h.c.u.h.class), eVar.b(HeartBeatInfo.class), (g) eVar.a(g.class), determineFactory((f) eVar.a(f.class)), (i0.h.c.n.d) eVar.a(i0.h.c.n.d.class));
    }

    @Keep
    public List<i0.h.c.j.d<?>> getComponents() {
        d.b<FirebaseMessaging> a2 = i0.h.c.j.d.a(FirebaseMessaging.class);
        a2.a(new r(i0.h.c.c.class, 1, 0));
        a2.a(new r(FirebaseInstanceIdInternal.class, 0, 0));
        a2.a(new r(i0.h.c.u.h.class, 0, 1));
        a2.a(new r(HeartBeatInfo.class, 0, 1));
        a2.a(new r(f.class, 0, 0));
        a2.a(new r(g.class, 1, 0));
        a2.a(new r(i0.h.c.n.d.class, 1, 0));
        a2.d(v.a);
        a2.b();
        return Arrays.asList(new i0.h.c.j.d[]{a2.c(), i0.h.a.b.c.m.b.x("fire-fcm", "20.1.7_1p")});
    }
}
