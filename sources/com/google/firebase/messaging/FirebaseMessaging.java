package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import h0.b0.v;
import i0.h.a.a.f;
import i0.h.c.c;
import i0.h.c.n.b;
import i0.h.c.n.d;
import i0.h.c.r.g;
import i0.h.c.t.a0;
import i0.h.c.t.f0;
import i0.h.c.t.j0;
import i0.h.c.t.n0;
import i0.h.c.t.o;
import i0.h.c.t.o0;
import i0.h.c.t.p;
import i0.h.c.t.q;
import i0.h.c.t.r;
import i0.h.c.t.r0;
import i0.h.c.t.s0;
import i0.h.c.t.t;
import i0.h.c.t.u;
import i0.h.c.u.h;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class FirebaseMessaging {
    public static final long a = TimeUnit.HOURS.toSeconds(8);
    @SuppressLint({"StaticFieldLeak"})
    public static n0 b;
    @SuppressLint({"FirebaseUnknownNullness"})
    public static f c;
    public static ScheduledExecutorService d;
    public final c e;
    public final FirebaseInstanceIdInternal f;
    public final g g;
    public final Context h;
    public final a0 i;
    public final j0 j;
    public final a k;
    public final Executor l;
    public final i0.h.a.b.m.g<s0> m;
    public final f0 n;
    public boolean o = false;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public class a {
        public final d a;
        public boolean b;
        public b<i0.h.c.a> c;
        public Boolean d;

        public a(d dVar) {
            this.a = dVar;
        }

        public synchronized void a() {
            if (!this.b) {
                Boolean c2 = c();
                this.d = c2;
                if (c2 == null) {
                    u uVar = new u(this);
                    this.c = uVar;
                    this.a.a(i0.h.c.a.class, uVar);
                }
                this.b = true;
            }
        }

        public synchronized boolean b() {
            boolean z;
            boolean z2;
            a();
            Boolean bool = this.d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                c cVar = FirebaseMessaging.this.e;
                cVar.a();
                i0.h.c.s.a aVar = cVar.j.get();
                synchronized (aVar) {
                    z2 = aVar.d;
                }
                z = z2;
            }
            return z;
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            c cVar = FirebaseMessaging.this.e;
            cVar.a();
            Context context = cVar.d;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(c cVar, FirebaseInstanceIdInternal firebaseInstanceIdInternal, i0.h.c.q.b<h> bVar, i0.h.c.q.b<HeartBeatInfo> bVar2, g gVar, f fVar, d dVar) {
        cVar.a();
        f0 f0Var = new f0(cVar.d);
        a0 a0Var = new a0(cVar, f0Var, bVar, bVar2, gVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new i0.h.a.b.c.m.f.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i0.h.a.b.c.m.f.a("Firebase-Messaging-Init"));
        c = fVar;
        this.e = cVar;
        this.f = firebaseInstanceIdInternal;
        this.g = gVar;
        this.k = new a(dVar);
        cVar.a();
        Context context = cVar.d;
        this.h = context;
        this.n = f0Var;
        this.i = a0Var;
        this.j = new j0(newSingleThreadExecutor);
        this.l = scheduledThreadPoolExecutor;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new p(this));
        }
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new n0(context);
            }
        }
        scheduledThreadPoolExecutor.execute(new q(this));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new i0.h.a.b.c.m.f.a("Firebase-Messaging-Topics-Io"));
        int i2 = s0.b;
        i0.h.a.b.m.g<s0> u = i0.h.a.b.c.m.b.u(scheduledThreadPoolExecutor2, new r0(context, scheduledThreadPoolExecutor2, this, gVar, f0Var, a0Var));
        this.m = u;
        u.e(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i0.h.a.b.c.m.f.a("Firebase-Messaging-Trigger-Topics-Io")), new r(this));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(c cVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            cVar.a();
            firebaseMessaging = (FirebaseMessaging) cVar.g.a(cls);
            v.A(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public String a() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) i0.h.a.b.c.m.b.j(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        } else {
            n0.a d2 = d();
            if (!i(d2)) {
                return d2.b;
            }
            String b2 = f0.b(this.e);
            try {
                String str = (String) i0.h.a.b.c.m.b.j(this.g.getId().h(Executors.newSingleThreadExecutor(new i0.h.a.b.c.m.f.a("Firebase-Messaging-Network-Io")), new t(this, b2)));
                b.b(c(), b2, str, this.n.a());
                if (d2 == null || !str.equals(d2.b)) {
                    e(str);
                }
                return str;
            } catch (InterruptedException | ExecutionException e3) {
                throw new IOException(e3);
            }
        }
    }

    public void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (d == null) {
                d = new ScheduledThreadPoolExecutor(1, new i0.h.a.b.c.m.f.a("TAG"));
            }
            d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final String c() {
        c cVar = this.e;
        cVar.a();
        if ("[DEFAULT]".equals(cVar.e)) {
            return "";
        }
        return this.e.c();
    }

    public n0.a d() {
        n0.a b2;
        n0 n0Var = b;
        String c2 = c();
        String b3 = f0.b(this.e);
        synchronized (n0Var) {
            b2 = n0.a.b(n0Var.a.getString(n0Var.a(c2, b3), (String) null));
        }
        return b2;
    }

    public final void e(String str) {
        String str2;
        c cVar = this.e;
        cVar.a();
        if ("[DEFAULT]".equals(cVar.e)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                c cVar2 = this.e;
                cVar2.a();
                String valueOf = String.valueOf(cVar2.e);
                if (valueOf.length() != 0) {
                    str2 = "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    str2 = new String("Invoking onNewToken for app: ");
                }
                Log.d("FirebaseMessaging", str2);
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new o(this.h).b(intent);
        }
    }

    public synchronized void f(boolean z) {
        this.o = z;
    }

    public final void g() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (i(d())) {
            synchronized (this) {
                if (!this.o) {
                    h(0);
                }
            }
        }
    }

    public synchronized void h(long j2) {
        b(new o0(this, Math.min(Math.max(30, j2 + j2), a)), j2);
        this.o = true;
    }

    public boolean i(n0.a aVar) {
        if (aVar != null) {
            if (System.currentTimeMillis() > aVar.d + n0.a.a || !this.n.a().equals(aVar.c)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
