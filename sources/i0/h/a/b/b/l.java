package i0.h.a.b.b;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class l implements Runnable {
    public final g c;
    public final IBinder d;

    public l(g gVar, IBinder iBinder) {
        this.c = gVar;
        this.d = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r0.a(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            i0.h.a.b.b.g r0 = r4.c
            android.os.IBinder r1 = r4.d
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.a(r2, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x000f:
            i0.h.a.b.b.p r3 = new i0.h.a.b.b.p     // Catch:{ RemoteException -> 0x0029 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0029 }
            r0.c = r3     // Catch:{ RemoteException -> 0x0029 }
            r1 = 2
            r0.a = r1     // Catch:{ all -> 0x0027 }
            i0.h.a.b.b.f r1 = r0.f     // Catch:{ all -> 0x0027 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.c     // Catch:{ all -> 0x0027 }
            i0.h.a.b.b.k r2 = new i0.h.a.b.b.k     // Catch:{ all -> 0x0027 }
            r2.<init>(r0)     // Catch:{ all -> 0x0027 }
            r1.execute(r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r1 = move-exception
            goto L_0x0033
        L_0x0029:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0027 }
            r0.a(r2, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.b.l.run():void");
    }
}
