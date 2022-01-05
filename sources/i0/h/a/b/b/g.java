package i0.h.a.b.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzp;
import i0.h.a.b.g.d.a;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class g implements ServiceConnection {
    public int a = 0;
    public final Messenger b = new Messenger(new a(Looper.getMainLooper(), new j(this)));
    public p c;
    public final Queue<q<?>> d = new ArrayDeque();
    public final SparseArray<q<?>> e = new SparseArray<>();
    public final /* synthetic */ f f;

    public g(f fVar, h hVar) {
        this.f = fVar;
    }

    public final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            i0.h.a.b.c.l.a.b().c(this.f.b, this);
            zzp zzp = new zzp(i, str);
            for (q b2 : this.d) {
                b2.b(zzp);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                this.e.valueAt(i3).b(zzp);
            }
            this.e.clear();
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            int i4 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(i0.h.a.b.b.q<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.a     // Catch:{ all -> 0x009c }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x0043
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009c }
            int r0 = r5.a     // Catch:{ all -> 0x009c }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r2.<init>(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x009c }
            r2.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x009c }
            r6.<init>(r0)     // Catch:{ all -> 0x009c }
            throw r6     // Catch:{ all -> 0x009c }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<i0.h.a.b.b.q<?>> r0 = r5.d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            i0.h.a.b.b.f r6 = r5.f     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r6 = r6.c     // Catch:{ all -> 0x009c }
            i0.h.a.b.b.k r0 = new i0.h.a.b.b.k     // Catch:{ all -> 0x009c }
            r0.<init>(r5)     // Catch:{ all -> 0x009c }
            r6.execute(r0)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return r3
        L_0x0043:
            java.util.Queue<i0.h.a.b.b.q<?>> r0 = r5.d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return r3
        L_0x004a:
            java.util.Queue<i0.h.a.b.b.q<?>> r0 = r5.d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            int r6 = r5.a     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x0055
            r6 = r3
            goto L_0x0056
        L_0x0055:
            r6 = r2
        L_0x0056:
            h0.b0.v.B(r6)     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x009c }
        L_0x0068:
            r5.a = r3     // Catch:{ all -> 0x009c }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x009c }
            i0.h.a.b.c.l.a r0 = i0.h.a.b.c.l.a.b()     // Catch:{ all -> 0x009c }
            i0.h.a.b.b.f r1 = r5.f     // Catch:{ all -> 0x009c }
            android.content.Context r1 = r1.b     // Catch:{ all -> 0x009c }
            boolean r6 = r0.a(r1, r6, r5, r3)     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x008a
            java.lang.String r6 = "Unable to bind to service"
            r5.a(r2, r6)     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x008a:
            i0.h.a.b.b.f r6 = r5.f     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r6 = r6.c     // Catch:{ all -> 0x009c }
            i0.h.a.b.b.i r0 = new i0.h.a.b.b.i     // Catch:{ all -> 0x009c }
            r0.<init>(r5)     // Catch:{ all -> 0x009c }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x009c }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r5)
            return r3
        L_0x009c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.b.g.b(i0.h.a.b.b.q):boolean");
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            i0.h.a.b.c.l.a.b().c(this.f.b, this);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.c.execute(new l(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.c.execute(new n(this));
    }
}
