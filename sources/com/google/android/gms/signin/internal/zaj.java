package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import h0.b0.v;
import i0.h.a.b.k.b.i;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new i();
    public final int c;
    public final zat d;

    public zaj(int i, zat zat) {
        this.c = i;
        this.d = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        v.A2(parcel, 2, this.d, i, false);
        v.L2(parcel, G2);
    }

    public zaj(zat zat) {
        this.c = 1;
        this.d = zat;
    }
}
