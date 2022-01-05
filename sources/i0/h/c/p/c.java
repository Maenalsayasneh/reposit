package i0.h.c.p;

import com.google.firebase.iid.FirebaseInstanceId;
import i0.h.a.b.m.a;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final /* synthetic */ class c implements a {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;

    public c(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(i0.h.a.b.m.g r11) {
        /*
            r10 = this;
            com.google.firebase.iid.FirebaseInstanceId r11 = r10.a
            java.lang.String r0 = r10.b
            java.lang.String r1 = r10.c
            java.lang.String r2 = r11.f()
            i0.h.c.p.t$a r3 = r11.k(r0, r1)
            boolean r4 = r11.q(r3)
            if (r4 != 0) goto L_0x0021
            i0.h.c.p.l r11 = new i0.h.c.p.l
            java.lang.String r0 = r3.c
            r11.<init>(r2, r0)
            i0.h.a.b.m.g r11 = i0.h.a.b.c.m.b.H(r11)
            goto L_0x00c9
        L_0x0021:
            i0.h.c.p.r r4 = r11.i
            monitor-enter(r4)
            android.util.Pair r5 = new android.util.Pair     // Catch:{ all -> 0x00ca }
            r5.<init>(r0, r1)     // Catch:{ all -> 0x00ca }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, i0.h.a.b.m.g<i0.h.c.p.k>> r6 = r4.b     // Catch:{ all -> 0x00ca }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x00ca }
            i0.h.a.b.m.g r6 = (i0.h.a.b.m.g) r6     // Catch:{ all -> 0x00ca }
            r7 = 3
            if (r6 == 0) goto L_0x005f
            java.lang.String r11 = "FirebaseInstanceId"
            boolean r11 = android.util.Log.isLoggable(r11, r7)     // Catch:{ all -> 0x00ca }
            if (r11 == 0) goto L_0x005c
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ca }
            int r0 = r11.length()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            int r0 = r0 + 29
            r1.<init>(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "Joining ongoing request for: "
            r1.append(r0)     // Catch:{ all -> 0x00ca }
            r1.append(r11)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = "FirebaseInstanceId"
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ca }
            android.util.Log.d(r11, r0)     // Catch:{ all -> 0x00ca }
        L_0x005c:
            monitor-exit(r4)
            r11 = r6
            goto L_0x00c9
        L_0x005f:
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x0087
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ca }
            int r7 = r6.length()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            int r7 = r7 + 24
            r8.<init>(r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "Making new request for: "
            r8.append(r7)     // Catch:{ all -> 0x00ca }
            r8.append(r6)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = "FirebaseInstanceId"
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00ca }
            android.util.Log.d(r6, r7)     // Catch:{ all -> 0x00ca }
        L_0x0087:
            i0.h.c.p.j r6 = r11.h     // Catch:{ all -> 0x00ca }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x00ca }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x00ca }
            r7.<init>()     // Catch:{ all -> 0x00ca }
            i0.h.a.b.m.g r7 = r6.a(r2, r0, r1, r7)     // Catch:{ all -> 0x00ca }
            int r8 = i0.h.c.p.b.a     // Catch:{ all -> 0x00ca }
            java.util.concurrent.Executor r8 = i0.h.c.p.a.c     // Catch:{ all -> 0x00ca }
            i0.h.c.p.i r9 = new i0.h.c.p.i     // Catch:{ all -> 0x00ca }
            r9.<init>(r6)     // Catch:{ all -> 0x00ca }
            i0.h.a.b.m.g r6 = r7.g(r8, r9)     // Catch:{ all -> 0x00ca }
            java.util.concurrent.Executor r7 = r11.e     // Catch:{ all -> 0x00ca }
            i0.h.c.p.f r8 = new i0.h.c.p.f     // Catch:{ all -> 0x00ca }
            r8.<init>(r11, r0, r1, r2)     // Catch:{ all -> 0x00ca }
            i0.h.a.b.m.g r0 = r6.o(r7, r8)     // Catch:{ all -> 0x00ca }
            java.util.concurrent.Executor r1 = i0.h.c.p.g.c     // Catch:{ all -> 0x00ca }
            i0.h.c.p.h r2 = new i0.h.c.p.h     // Catch:{ all -> 0x00ca }
            r2.<init>(r11, r3)     // Catch:{ all -> 0x00ca }
            i0.h.a.b.m.g r11 = r0.e(r1, r2)     // Catch:{ all -> 0x00ca }
            java.util.concurrent.Executor r0 = r4.a     // Catch:{ all -> 0x00ca }
            i0.h.c.p.q r1 = new i0.h.c.p.q     // Catch:{ all -> 0x00ca }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x00ca }
            i0.h.a.b.m.g r11 = r11.h(r0, r1)     // Catch:{ all -> 0x00ca }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, i0.h.a.b.m.g<i0.h.c.p.k>> r0 = r4.b     // Catch:{ all -> 0x00ca }
            r0.put(r5, r11)     // Catch:{ all -> 0x00ca }
            monitor-exit(r4)
        L_0x00c9:
            return r11
        L_0x00ca:
            r11 = move-exception
            monitor-exit(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.p.c.a(i0.h.a.b.m.g):java.lang.Object");
    }
}
