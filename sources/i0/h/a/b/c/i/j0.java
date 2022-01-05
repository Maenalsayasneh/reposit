package i0.h.a.b.c.i;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import i0.h.a.b.c.i.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class j0 implements ServiceConnection, l0 {
    public final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final e.a e;
    public ComponentName f;
    public final /* synthetic */ h0 g;

    public j0(h0 h0Var, e.a aVar) {
        this.g = h0Var;
        this.e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 3
            r9.b = r0
            i0.h.a.b.c.i.h0 r0 = r9.g
            i0.h.a.b.c.l.a r1 = r0.f
            android.content.Context r2 = r0.d
            i0.h.a.b.c.i.e$a r0 = r9.e
            java.lang.String r3 = r0.b
            r4 = 0
            if (r3 == 0) goto L_0x0088
            boolean r3 = r0.e
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = "ConnectionStatusConfig"
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r0.b
            java.lang.String r7 = "serviceActionBundleKey"
            r5.putString(r7, r6)
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002f }
            android.net.Uri r7 = i0.h.a.b.c.i.e.a.a     // Catch:{ IllegalArgumentException -> 0x002f }
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r5 = r6.call(r7, r8, r4, r5)     // Catch:{ IllegalArgumentException -> 0x002f }
            goto L_0x004f
        L_0x002f:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            int r6 = r6 + 34
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Dynamic intent resolution failed: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.w(r3, r5)
            r5 = r4
        L_0x004f:
            if (r5 != 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            java.lang.String r4 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r5.getParcelable(r4)
            android.content.Intent r4 = (android.content.Intent) r4
        L_0x005a:
            if (r4 != 0) goto L_0x0078
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r0.b
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            if (r7 == 0) goto L_0x006f
            java.lang.String r5 = r5.concat(r6)
            goto L_0x0075
        L_0x006f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            r5 = r6
        L_0x0075:
            android.util.Log.w(r3, r5)
        L_0x0078:
            if (r4 != 0) goto L_0x0092
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r0.b
            r3.<init>(r4)
            java.lang.String r0 = r0.c
            android.content.Intent r0 = r3.setPackage(r0)
            goto L_0x0091
        L_0x0088:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r0 = r0.setComponent(r4)
        L_0x0091:
            r4 = r0
        L_0x0092:
            i0.h.a.b.c.i.e$a r0 = r9.e
            int r6 = r0.d
            r3 = r10
            r5 = r9
            boolean r10 = r1.d(r2, r3, r4, r5, r6)
            r9.c = r10
            if (r10 == 0) goto L_0x00b5
            i0.h.a.b.c.i.h0 r10 = r9.g
            android.os.Handler r10 = r10.e
            r0 = 1
            i0.h.a.b.c.i.e$a r1 = r9.e
            android.os.Message r10 = r10.obtainMessage(r0, r1)
            i0.h.a.b.c.i.h0 r0 = r9.g
            android.os.Handler r1 = r0.e
            long r2 = r0.h
            r1.sendMessageDelayed(r10, r2)
            return
        L_0x00b5:
            r10 = 2
            r9.b = r10
            i0.h.a.b.c.i.h0 r10 = r9.g     // Catch:{ IllegalArgumentException -> 0x00c1 }
            i0.h.a.b.c.l.a r0 = r10.f     // Catch:{ IllegalArgumentException -> 0x00c1 }
            android.content.Context r10 = r10.d     // Catch:{ IllegalArgumentException -> 0x00c1 }
            r0.c(r10, r9)     // Catch:{ IllegalArgumentException -> 0x00c1 }
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.i.j0.a(java.lang.String):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
