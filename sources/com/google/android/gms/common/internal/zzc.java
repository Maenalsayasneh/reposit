package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.d0;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new d0();
    public Bundle c;
    public Feature[] d;
    public int q;
    public ConnectionTelemetryConfiguration x;

    public zzc(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.c = bundle;
        this.d = featureArr;
        this.q = i;
        this.x = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.w2(parcel, 1, this.c, false);
        v.E2(parcel, 2, this.d, i, false);
        int i2 = this.q;
        v.J2(parcel, 3, 4);
        parcel.writeInt(i2);
        v.A2(parcel, 4, this.x, i, false);
        v.L2(parcel, G2);
    }

    public zzc() {
    }
}
