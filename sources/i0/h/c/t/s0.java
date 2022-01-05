package i0.h.c.t;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import h0.f.a;
import i0.h.a.b.c.m.b;
import i0.h.a.b.m.h;
import i0.h.c.r.g;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class s0 {
    public static final long a = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int b = 0;
    public final Context c;
    public final f0 d;
    public final a0 e;
    public final FirebaseMessaging f;
    public final g g;
    public final Map<String, ArrayDeque<h<Void>>> h = new a();
    public final ScheduledExecutorService i;
    public boolean j = false;
    public final q0 k;

    public s0(FirebaseMessaging firebaseMessaging, g gVar, f0 f0Var, q0 q0Var, a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f = firebaseMessaging;
        this.g = gVar;
        this.d = f0Var;
        this.k = q0Var;
        this.e = a0Var;
        this.c = context;
        this.i = scheduledExecutorService;
    }

    public static <T> T a(i0.h.a.b.m.g<T> gVar) throws IOException {
        try {
            return b.k(gVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) throws IOException {
        String str2;
        String str3;
        String str4 = (String) a(this.g.getId());
        a0 a0Var = this.e;
        String a2 = this.f.a();
        Objects.requireNonNull(a0Var);
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "/topics/".concat(valueOf);
        } else {
            str2 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str2);
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            str3 = "/topics/".concat(valueOf2);
        } else {
            str3 = new String("/topics/");
        }
        a(a0Var.a(a0Var.b(str4, a2, str3, bundle)));
    }

    public final void c(String str) throws IOException {
        String str2;
        String str3;
        String str4 = (String) a(this.g.getId());
        a0 a0Var = this.e;
        String a2 = this.f.a();
        Objects.requireNonNull(a0Var);
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "/topics/".concat(valueOf);
        } else {
            str2 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str2);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            str3 = "/topics/".concat(valueOf2);
        } else {
            str3 = new String("/topics/");
        }
        a(a0Var.a(a0Var.b(str4, a2, str3, bundle)));
    }

    public synchronized void e(boolean z) {
        this.j = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r0.c;
        r5 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r5 == 83) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r5 == 85) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4.equals("U") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r4.equals("S") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r4 == 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r4 == 1) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (d() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        r4 = java.lang.String.valueOf(r0);
        r6 = new java.lang.StringBuilder(r4.length() + 24);
        r6.append("Unknown topic operation");
        r6.append(r4);
        r6.append(".");
        android.util.Log.d("FirebaseMessaging", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        c(r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (d() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        r4 = r0.b;
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 35);
        r7.append("Unsubscribe from topic: ");
        r7.append(r4);
        r7.append(" succeeded.");
        android.util.Log.d("FirebaseMessaging", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        b(r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (d() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        r4 = r0.b;
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 31);
        r7.append("Subscribe to topic: ");
        r7.append(r4);
        r7.append(" succeeded.");
        android.util.Log.d("FirebaseMessaging", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        if (r1.getMessage() == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r1 = r1.getMessage();
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 53);
        r5.append("Topic operation failed: ");
        r5.append(r1);
        r5.append(". Will retry Topic operation.");
        android.util.Log.e("FirebaseMessaging", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f() throws java.io.IOException {
        /*
            r8 = this;
        L_0x0000:
            monitor-enter(r8)
            i0.h.c.t.q0 r0 = r8.k     // Catch:{ all -> 0x017e }
            i0.h.c.t.p0 r0 = r0.a()     // Catch:{ all -> 0x017e }
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = d()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x017e }
        L_0x0017:
            monitor-exit(r8)     // Catch:{ all -> 0x017e }
            return r1
        L_0x0019:
            monitor-exit(r8)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 0
            java.lang.String r4 = r0.c     // Catch:{ IOException -> 0x00d1 }
            int r5 = r4.hashCode()     // Catch:{ IOException -> 0x00d1 }
            r6 = 83
            if (r5 == r6) goto L_0x0036
            r6 = 85
            if (r5 == r6) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            java.lang.String r5 = "U"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0040
            r4 = r1
            goto L_0x0041
        L_0x0036:
            java.lang.String r5 = "S"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0040
            r4 = r3
            goto L_0x0041
        L_0x0040:
            r4 = -1
        L_0x0041:
            java.lang.String r5 = " succeeded."
            if (r4 == 0) goto L_0x00a2
            if (r4 == r1) goto L_0x0072
            boolean r4 = d()     // Catch:{ IOException -> 0x00d1 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x00d1 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x00d1 }
            int r5 = r5 + 24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d1 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r5 = "Unknown topic operation"
            r6.append(r5)     // Catch:{ IOException -> 0x00d1 }
            r6.append(r4)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = "."
            r6.append(r4)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x00d1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x0120
        L_0x0072:
            java.lang.String r4 = r0.b     // Catch:{ IOException -> 0x00d1 }
            r8.c(r4)     // Catch:{ IOException -> 0x00d1 }
            boolean r4 = d()     // Catch:{ IOException -> 0x00d1 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = r0.b     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6 + 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d1 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = "Unsubscribe from topic: "
            r7.append(r6)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r4)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r5)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00d1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x0120
        L_0x00a2:
            java.lang.String r4 = r0.b     // Catch:{ IOException -> 0x00d1 }
            r8.b(r4)     // Catch:{ IOException -> 0x00d1 }
            boolean r4 = d()     // Catch:{ IOException -> 0x00d1 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = r0.b     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6 + 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d1 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = "Subscribe to topic: "
            r7.append(r6)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r4)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r5)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00d1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x0120
        L_0x00d1:
            r1 = move-exception
            java.lang.String r4 = r1.getMessage()
            java.lang.String r5 = "SERVICE_NOT_AVAILABLE"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00f8
            java.lang.String r4 = r1.getMessage()
            java.lang.String r5 = "INTERNAL_SERVER_ERROR"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00eb
            goto L_0x00f8
        L_0x00eb:
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto L_0x00f7
            java.lang.String r1 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r2, r1)
            goto L_0x011f
        L_0x00f7:
            throw r1
        L_0x00f8:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 53
            r5.<init>(r4)
            java.lang.String r4 = "Topic operation failed: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = ". Will retry Topic operation."
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.e(r2, r1)
        L_0x011f:
            r1 = r3
        L_0x0120:
            if (r1 != 0) goto L_0x0123
            return r3
        L_0x0123:
            i0.h.c.t.q0 r1 = r8.k
            monitor-enter(r1)
            i0.h.c.t.m0 r2 = r1.c     // Catch:{ all -> 0x017b }
            java.lang.String r3 = r0.d     // Catch:{ all -> 0x017b }
            java.util.ArrayDeque<java.lang.String> r4 = r2.d     // Catch:{ all -> 0x017b }
            monitor-enter(r4)     // Catch:{ all -> 0x017b }
            java.util.ArrayDeque<java.lang.String> r5 = r2.d     // Catch:{ all -> 0x0178 }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x0178 }
            if (r3 == 0) goto L_0x013f
            java.util.concurrent.Executor r3 = r2.e     // Catch:{ all -> 0x0178 }
            i0.h.c.t.l0 r5 = new i0.h.c.t.l0     // Catch:{ all -> 0x0178 }
            r5.<init>(r2)     // Catch:{ all -> 0x0178 }
            r3.execute(r5)     // Catch:{ all -> 0x0178 }
        L_0x013f:
            monitor-exit(r4)     // Catch:{ all -> 0x0178 }
            monitor-exit(r1)
            java.util.Map<java.lang.String, java.util.ArrayDeque<i0.h.a.b.m.h<java.lang.Void>>> r2 = r8.h
            monitor-enter(r2)
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x0175 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<i0.h.a.b.m.h<java.lang.Void>>> r1 = r8.h     // Catch:{ all -> 0x0175 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x0151
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            goto L_0x0000
        L_0x0151:
            java.util.Map<java.lang.String, java.util.ArrayDeque<i0.h.a.b.m.h<java.lang.Void>>> r1 = r8.h     // Catch:{ all -> 0x0175 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0175 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0175 }
            java.lang.Object r3 = r1.poll()     // Catch:{ all -> 0x0175 }
            i0.h.a.b.m.h r3 = (i0.h.a.b.m.h) r3     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x0167
            r4 = 0
            i0.h.a.b.m.b0<TResult> r3 = r3.a     // Catch:{ all -> 0x0175 }
            r3.q(r4)     // Catch:{ all -> 0x0175 }
        L_0x0167:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0175 }
            if (r1 == 0) goto L_0x0172
            java.util.Map<java.lang.String, java.util.ArrayDeque<i0.h.a.b.m.h<java.lang.Void>>> r1 = r8.h     // Catch:{ all -> 0x0175 }
            r1.remove(r0)     // Catch:{ all -> 0x0175 }
        L_0x0172:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            goto L_0x0000
        L_0x0175:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            throw r0
        L_0x0178:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0178 }
            throw r0     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x017e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x017e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.t.s0.f():boolean");
    }

    public void g(long j2) {
        this.i.schedule(new t0(this, this.c, this.d, Math.min(Math.max(30, j2 + j2), a)), j2, TimeUnit.SECONDS);
        e(true);
    }
}
