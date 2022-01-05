package com.google.firebase.iid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import i0.h.a.b.m.g;
import i0.h.c.c;
import i0.h.c.j.d;
import i0.h.c.j.e;
import i0.h.c.j.h;
import i0.h.c.j.r;
import i0.h.c.p.b;
import i0.h.c.p.i;
import i0.h.c.p.j;
import i0.h.c.p.m;
import i0.h.c.p.n;
import i0.h.c.p.o;
import i0.h.c.p.p;
import i0.h.c.p.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Keep
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final class Registrar implements h {

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class a implements FirebaseInstanceIdInternal {
        public final FirebaseInstanceId a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.a = firebaseInstanceId;
        }

        public void addNewTokenListener(FirebaseInstanceIdInternal.a aVar) {
            this.a.l.add(aVar);
        }

        public void deleteToken(String str, String str2) throws IOException {
            FirebaseInstanceId firebaseInstanceId = this.a;
            FirebaseInstanceId.d(firebaseInstanceId.f);
            if (Looper.getMainLooper() != Looper.myLooper()) {
                String m = FirebaseInstanceId.m(str2);
                String f = firebaseInstanceId.f();
                j jVar = firebaseInstanceId.h;
                Objects.requireNonNull(jVar);
                Bundle bundle = new Bundle();
                bundle.putString("delete", "1");
                g<Bundle> a2 = jVar.a(f, str, m, bundle);
                int i = b.a;
                firebaseInstanceId.a(a2.g(i0.h.c.p.a.c, new i(jVar)));
                t tVar = FirebaseInstanceId.b;
                String h = firebaseInstanceId.h();
                synchronized (tVar) {
                    String b = tVar.b(h, str, m);
                    SharedPreferences.Editor edit = tVar.a.edit();
                    edit.remove(b);
                    edit.commit();
                }
                return;
            }
            throw new IOException("MAIN_THREAD");
        }

        public String getId() {
            FirebaseInstanceId firebaseInstanceId = this.a;
            FirebaseInstanceId.d(firebaseInstanceId.f);
            if (firebaseInstanceId.q(firebaseInstanceId.j())) {
                firebaseInstanceId.o();
            }
            return firebaseInstanceId.f();
        }

        public String getToken() {
            return this.a.i();
        }

        public g<String> getTokenTask() {
            String i = this.a.i();
            if (i != null) {
                return i0.h.a.b.c.m.b.H(i);
            }
            FirebaseInstanceId firebaseInstanceId = this.a;
            FirebaseInstanceId.d(firebaseInstanceId.f);
            return firebaseInstanceId.g(m.b(firebaseInstanceId.f), "*").f(p.a);
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(e eVar) {
        return new FirebaseInstanceId((c) eVar.a(c.class), eVar.b(i0.h.c.u.h.class), eVar.b(HeartBeatInfo.class), (i0.h.c.r.g) eVar.a(i0.h.c.r.g.class));
    }

    public static final /* synthetic */ FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    @Keep
    public List<d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        d.b<FirebaseInstanceId> a2 = d.a(cls);
        a2.a(new r(c.class, 1, 0));
        a2.a(new r(i0.h.c.u.h.class, 0, 1));
        a2.a(new r(HeartBeatInfo.class, 0, 1));
        a2.a(new r(i0.h.c.r.g.class, 1, 0));
        a2.d(n.a);
        a2.b();
        d<FirebaseInstanceId> c = a2.c();
        d.b<FirebaseInstanceIdInternal> a3 = d.a(FirebaseInstanceIdInternal.class);
        a3.a(new r(cls, 1, 0));
        a3.d(o.a);
        return Arrays.asList(new d[]{c, a3.c(), i0.h.a.b.c.m.b.x("fire-iid", "21.1.0")});
    }
}
