package com.google.firebase.iid;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import h0.b0.v;
import i0.h.a.b.c.m.f.a;
import i0.h.c.c;
import i0.h.c.p.d;
import i0.h.c.p.e;
import i0.h.c.p.j;
import i0.h.c.p.k;
import i0.h.c.p.m;
import i0.h.c.p.r;
import i0.h.c.p.t;
import i0.h.c.p.u;
import i0.h.c.q.b;
import i0.h.c.r.g;
import i0.h.c.u.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

@Deprecated
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class FirebaseInstanceId {
    public static final long a = TimeUnit.HOURS.toSeconds(8);
    public static t b;
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static ScheduledExecutorService d;
    public final Executor e;
    public final c f;
    public final m g;
    public final j h;
    public final r i;
    public final g j;
    public boolean k = false;
    public final List<FirebaseInstanceIdInternal.a> l = new ArrayList();

    public FirebaseInstanceId(c cVar, b<h> bVar, b<HeartBeatInfo> bVar2, g gVar) {
        cVar.a();
        m mVar = new m(cVar.d);
        ExecutorService a2 = i0.h.c.p.b.a();
        ExecutorService a3 = i0.h.c.p.b.a();
        if (m.b(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (b == null) {
                    cVar.a();
                    b = new t(cVar.d);
                }
            }
            this.f = cVar;
            this.g = mVar;
            this.h = new j(cVar, mVar, bVar, bVar2, gVar);
            this.e = a3;
            this.i = new r(a2);
            this.j = gVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static <T> T b(i0.h.a.b.m.g<T> gVar) throws InterruptedException {
        v.A(gVar, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.c(d.c, new e(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        if (gVar.n()) {
            return gVar.j();
        }
        if (gVar.l()) {
            throw new CancellationException("Task is already canceled");
        } else if (gVar.m()) {
            throw new IllegalStateException(gVar.i());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public static void d(c cVar) {
        cVar.a();
        v.y(cVar.f.g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        cVar.a();
        v.y(cVar.f.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        cVar.a();
        v.y(cVar.f.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        cVar.a();
        v.u(cVar.f.b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cVar.a();
        v.u(c.matcher(cVar.f.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(c cVar) {
        d(cVar);
        cVar.a();
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) cVar.g.a(FirebaseInstanceId.class);
        v.A(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static String m(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public final <T> T a(i0.h.a.b.m.g<T> gVar) throws IOException {
        try {
            return i0.h.a.b.c.m.b.k(gVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    synchronized (this) {
                        b.c();
                    }
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public String c() throws IOException {
        String b2 = m.b(this.f);
        d(this.f);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((k) a(g(b2, "*"))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    public void e(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (d == null) {
                d = new ScheduledThreadPoolExecutor(1, new a("FirebaseInstanceId"));
            }
            d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String f() {
        /*
            r5 = this;
            i0.h.c.p.t r0 = b     // Catch:{ InterruptedException -> 0x0027 }
            i0.h.c.c r1 = r5.f     // Catch:{ InterruptedException -> 0x0027 }
            java.lang.String r1 = r1.c()     // Catch:{ InterruptedException -> 0x0027 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0027 }
            long r2 = r0.d(r1)     // Catch:{ all -> 0x0024 }
            java.util.Map<java.lang.String, java.lang.Long> r4 = r0.c     // Catch:{ all -> 0x0024 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0024 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0027 }
            i0.h.c.r.g r0 = r5.j     // Catch:{ InterruptedException -> 0x0027 }
            i0.h.a.b.m.g r0 = r0.getId()     // Catch:{ InterruptedException -> 0x0027 }
            java.lang.Object r0 = b(r0)     // Catch:{ InterruptedException -> 0x0027 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException -> 0x0027 }
            return r0
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0027 }
            throw r1     // Catch:{ InterruptedException -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.f():java.lang.String");
    }

    public final i0.h.a.b.m.g<k> g(String str, String str2) {
        return i0.h.a.b.c.m.b.H(null).h(this.e, new i0.h.c.p.c(this, str, m(str2)));
    }

    public final String h() {
        c cVar = this.f;
        cVar.a();
        if ("[DEFAULT]".equals(cVar.e)) {
            return "";
        }
        return this.f.c();
    }

    @Deprecated
    public String i() {
        d(this.f);
        t.a j2 = j();
        if (q(j2)) {
            o();
        }
        int i2 = t.a.b;
        if (j2 == null) {
            return null;
        }
        return j2.c;
    }

    public t.a j() {
        return k(m.b(this.f), "*");
    }

    public t.a k(String str, String str2) {
        t.a b2;
        t tVar = b;
        String h2 = h();
        synchronized (tVar) {
            b2 = t.a.b(tVar.a.getString(tVar.b(h2, str, str2), (String) null));
        }
        return b2;
    }

    public boolean l() {
        int i2;
        m mVar = this.g;
        synchronized (mVar) {
            i2 = mVar.e;
            if (i2 == 0) {
                PackageManager packageManager = mVar.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!i0.h.a.b.c.m.b.U()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null) {
                            if (queryIntentServices.size() > 0) {
                                mVar.e = 1;
                                i2 = 1;
                            }
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null) {
                        if (queryBroadcastReceivers.size() > 0) {
                            mVar.e = 2;
                            i2 = 2;
                        }
                    }
                    Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    if (i0.h.a.b.c.m.b.U()) {
                        mVar.e = 2;
                        i2 = 2;
                    } else {
                        mVar.e = 1;
                        i2 = 1;
                    }
                }
            }
        }
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public synchronized void n(boolean z) {
        this.k = z;
    }

    public synchronized void o() {
        if (!this.k) {
            p(0);
        }
    }

    public synchronized void p(long j2) {
        e(new u(this, Math.min(Math.max(30, j2 + j2), a)), j2);
        this.k = true;
    }

    public boolean q(t.a aVar) {
        if (aVar != null) {
            if (System.currentTimeMillis() > aVar.e + t.a.a || !this.g.a().equals(aVar.d)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
