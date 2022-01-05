package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.e0;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new e0();
    public final RootTelemetryConfiguration c;
    public final boolean d;
    public final boolean q;
    public final int[] x;
    public final int y;

    public ConnectionTelemetryConfiguration(@RecentlyNonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i) {
        this.c = rootTelemetryConfiguration;
        this.d = z;
        this.q = z2;
        this.x = iArr;
        this.y = i;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 1, this.c, i, false);
        boolean z = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.q;
        v.J2(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int[] iArr = this.x;
        if (iArr != null) {
            int G22 = v.G2(parcel, 4);
            parcel.writeIntArray(iArr);
            v.L2(parcel, G22);
        }
        int i2 = this.y;
        v.J2(parcel, 5, 4);
        parcel.writeInt(i2);
        v.L2(parcel, G2);
    }
}
