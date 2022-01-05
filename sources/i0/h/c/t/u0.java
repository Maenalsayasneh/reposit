package i0.h.c.t;

import i0.h.a.b.l.a;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class u0 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static a c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = b
            monitor-enter(r0)
            i0.h.a.b.l.a r1 = c     // Catch:{ all -> 0x0038 }
            r2 = 1
            if (r1 != 0) goto L_0x0018
            i0.h.a.b.l.a r1 = new i0.h.a.b.l.a     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0038 }
            c = r1     // Catch:{ all -> 0x0038 }
            android.os.PowerManager$WakeLock r3 = r1.c     // Catch:{ all -> 0x0038 }
            r3.setReferenceCounted(r2)     // Catch:{ all -> 0x0038 }
            r1.h = r2     // Catch:{ all -> 0x0038 }
        L_0x0018:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0038 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x002d
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            r4 = 0
            return r4
        L_0x002d:
            if (r1 != 0) goto L_0x0036
            i0.h.a.b.l.a r5 = c     // Catch:{ all -> 0x0038 }
            long r1 = a     // Catch:{ all -> 0x0038 }
            r5.a(r1)     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return r4
        L_0x0038:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.t.u0.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
