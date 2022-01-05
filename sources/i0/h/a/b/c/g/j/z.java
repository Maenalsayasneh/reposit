package i0.h.a.b.c.g.j;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zao;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.c.i.b;
import i0.h.a.b.c.i.m;
import i0.h.a.b.m.c;
import i0.h.a.b.m.g;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class z<T> implements c<T> {
    public final f c;
    public final int d;
    public final b<?> q;
    public final long x;

    public z(f fVar, int i, b<?> bVar, long j) {
        this.c = fVar;
        this.d = i;
        this.q = bVar;
        this.x = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r9 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration a(i0.h.a.b.c.g.j.f.a<?> r8, int r9) {
        /*
            i0.h.a.b.c.g.a$f r0 = r8.b
            i0.h.a.b.c.i.b r0 = (i0.h.a.b.c.i.b) r0
            com.google.android.gms.common.internal.zzc r0 = r0.v
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x000d
        L_0x000b:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r0.x
        L_0x000d:
            if (r0 == 0) goto L_0x0034
            boolean r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x002a
            int[] r2 = r0.x
            if (r2 == 0) goto L_0x0029
            int r5 = r2.length
            r6 = r3
        L_0x001b:
            if (r6 >= r5) goto L_0x0026
            r7 = r2[r6]
            if (r7 != r9) goto L_0x0023
            r9 = r4
            goto L_0x0027
        L_0x0023:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0026:
            r9 = r3
        L_0x0027:
            if (r9 == 0) goto L_0x002a
        L_0x0029:
            r3 = r4
        L_0x002a:
            if (r3 != 0) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            int r8 = r8.l
            int r9 = r0.y
            if (r8 >= r9) goto L_0x0034
            return r0
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.g.j.z.a(i0.h.a.b.c.g.j.f$a, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    public final void onComplete(g<T> gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        int i7;
        if (this.c.e()) {
            boolean z = true;
            boolean z2 = this.x > 0;
            RootTelemetryConfiguration rootTelemetryConfiguration = m.a().c;
            if (rootTelemetryConfiguration == null) {
                i3 = 5000;
                i2 = 0;
                i = 100;
            } else if (rootTelemetryConfiguration.d) {
                boolean z3 = z2 & rootTelemetryConfiguration.q;
                i3 = rootTelemetryConfiguration.x;
                int i8 = rootTelemetryConfiguration.y;
                int i9 = rootTelemetryConfiguration.c;
                f.a aVar = this.c.n.get(this.q);
                if (aVar != null && aVar.b.isConnected() && (aVar.b instanceof b)) {
                    ConnectionTelemetryConfiguration a = a(aVar, this.d);
                    if (a != null) {
                        if (!a.q || this.x <= 0) {
                            z = false;
                        }
                        i8 = a.y;
                        z3 = z;
                    } else {
                        return;
                    }
                }
                i2 = i9;
                i = i8;
            } else {
                return;
            }
            f fVar = this.c;
            if (gVar.n()) {
                i5 = 0;
                i4 = 0;
            } else {
                if (gVar.l()) {
                    i6 = 100;
                } else {
                    Exception i10 = gVar.i();
                    if (i10 instanceof ApiException) {
                        Status status = ((ApiException) i10).c;
                        int i11 = status.a2;
                        ConnectionResult connectionResult = status.d2;
                        if (connectionResult == null) {
                            i7 = -1;
                        } else {
                            i7 = connectionResult.q;
                        }
                        i4 = i7;
                        i5 = i11;
                    } else {
                        i6 = 101;
                    }
                }
                i5 = i6;
                i4 = -1;
            }
            if (z2) {
                j2 = this.x;
                j = System.currentTimeMillis();
            } else {
                j2 = 0;
                j = 0;
            }
            Handler handler = fVar.q;
            handler.sendMessage(handler.obtainMessage(18, new y(new zao(this.d, i5, i4, j2, j), i2, (long) i3, i)));
        }
    }
}
