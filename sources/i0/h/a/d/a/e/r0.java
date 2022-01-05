package i0.h.a.d.a.e;

import android.os.IInterface;

public abstract class r0 extends f0 implements IInterface {
    public r0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARNING: type inference failed for: r12v12, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L(int r11, android.os.Parcel r12) throws android.os.RemoteException {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 3
            if (r11 == r2) goto L_0x0066
            if (r11 == r4) goto L_0x000a
            return r3
        L_0x000a:
            android.os.Parcelable$Creator r11 = android.os.Bundle.CREATOR
            android.os.Parcelable r11 = i0.h.a.d.a.e.g0.a(r12, r11)
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 != 0) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r12 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            android.os.IInterface r12 = r11.queryLocalInterface(r12)
            boolean r1 = r12 instanceof i0.h.a.d.a.e.t0
            if (r1 == 0) goto L_0x0027
            r1 = r12
            i0.h.a.d.a.e.t0 r1 = (i0.h.a.d.a.e.t0) r1
            goto L_0x002c
        L_0x0027:
            i0.h.a.d.a.e.s0 r1 = new i0.h.a.d.a.e.s0
            r1.<init>(r11)
        L_0x002c:
            r11 = r10
            i0.h.a.d.a.b.w r11 = (i0.h.a.d.a.b.w) r11
            i0.h.a.d.a.e.f r12 = r11.a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "clearAssetPackStorage AIDL call"
            r12.b(r4, r3, r2)
            android.content.Context r12 = r11.b
            boolean r12 = i0.h.a.d.a.e.q.a(r12)
            if (r12 == 0) goto L_0x005c
            android.content.Context r12 = r11.b
            boolean r12 = i0.h.a.d.a.e.q.b(r12)
            if (r12 != 0) goto L_0x0049
            goto L_0x005c
        L_0x0049:
            i0.h.a.d.a.b.y r11 = r11.d
            java.io.File r11 = r11.f()
            i0.h.a.d.a.b.y.g(r11)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r1.J(r11)
            goto L_0x00f3
        L_0x005c:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r1.Q(r11)
            goto L_0x00f3
        L_0x0066:
            android.os.Parcelable$Creator r11 = android.os.Bundle.CREATOR
            android.os.Parcelable r11 = i0.h.a.d.a.e.g0.a(r12, r11)
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.os.IBinder r12 = r12.readStrongBinder()
            if (r12 != 0) goto L_0x0075
            goto L_0x0087
        L_0x0075:
            java.lang.String r1 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            android.os.IInterface r1 = r12.queryLocalInterface(r1)
            boolean r5 = r1 instanceof i0.h.a.d.a.e.t0
            if (r5 == 0) goto L_0x0082
            i0.h.a.d.a.e.t0 r1 = (i0.h.a.d.a.e.t0) r1
            goto L_0x0087
        L_0x0082:
            i0.h.a.d.a.e.s0 r1 = new i0.h.a.d.a.e.s0
            r1.<init>(r12)
        L_0x0087:
            r12 = r10
            i0.h.a.d.a.b.w r12 = (i0.h.a.d.a.b.w) r12
            i0.h.a.d.a.e.f r5 = r12.a
            java.lang.String r6 = "updateServiceState AIDL call"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r5.b(r4, r6, r7)
            android.content.Context r5 = r12.b
            boolean r5 = i0.h.a.d.a.e.q.a(r5)
            if (r5 == 0) goto L_0x00e6
            android.content.Context r5 = r12.b
            boolean r5 = i0.h.a.d.a.e.q.b(r5)
            if (r5 != 0) goto L_0x00a4
            goto L_0x00e6
        L_0x00a4:
            com.google.android.play.core.assetpacks.AssetPackExtractionService r12 = r12.c
            monitor-enter(r12)
            java.lang.String r5 = "action_type"
            int r5 = r11.getInt(r5)     // Catch:{ all -> 0x00e3 }
            i0.h.a.d.a.e.f r6 = r12.c     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x00e3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00e3 }
            r7[r3] = r8     // Catch:{ all -> 0x00e3 }
            java.lang.String r9 = "updateServiceState: %d"
            r6.b(r4, r9, r7)     // Catch:{ all -> 0x00e3 }
            if (r5 != r0) goto L_0x00c2
            r12.b(r11)     // Catch:{ all -> 0x00e3 }
            goto L_0x00d4
        L_0x00c2:
            if (r5 != r2) goto L_0x00c8
            r12.a()     // Catch:{ all -> 0x00e3 }
            goto L_0x00d4
        L_0x00c8:
            i0.h.a.d.a.e.f r11 = r12.c     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00e3 }
            r2[r3] = r8     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = "Unknown action type received: %d"
            r4 = 6
            r11.b(r4, r3, r2)     // Catch:{ all -> 0x00e3 }
        L_0x00d4:
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x00e3 }
            r11.<init>()     // Catch:{ all -> 0x00e3 }
            monitor-exit(r12)
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            r1.I(r11, r12)
            goto L_0x00f3
        L_0x00e3:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x00e6:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r1.Q(r11)
            com.google.android.play.core.assetpacks.AssetPackExtractionService r11 = r12.c
            r11.a()
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.d.a.e.r0.L(int, android.os.Parcel):boolean");
    }
}
