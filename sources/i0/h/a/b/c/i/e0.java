package i0.h.a.b.c.i;

import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class e0 implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = h0.b0.v.r2(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r5 = r2
            r6 = r5
            r8 = r6
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004a
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L_0x0040
            r3 = 2
            if (r2 == r3) goto L_0x003b
            r3 = 3
            if (r2 == r3) goto L_0x0036
            r3 = 4
            if (r2 == r3) goto L_0x0031
            r3 = 5
            if (r2 == r3) goto L_0x002c
            h0.b0.v.i2(r10, r1)
            goto L_0x000b
        L_0x002c:
            int r8 = h0.b0.v.G1(r10, r1)
            goto L_0x000b
        L_0x0031:
            int[] r7 = h0.b0.v.K(r10, r1)
            goto L_0x000b
        L_0x0036:
            boolean r6 = h0.b0.v.A1(r10, r1)
            goto L_0x000b
        L_0x003b:
            boolean r5 = h0.b0.v.A1(r10, r1)
            goto L_0x000b
        L_0x0040:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> r2 = com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r10, r1, r2)
            r4 = r1
            com.google.android.gms.common.internal.RootTelemetryConfiguration r4 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r4
            goto L_0x000b
        L_0x004a:
            h0.b0.v.a0(r10, r0)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r10 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.i.e0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
