package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.j.i;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new i();
    public final int c;
    public final boolean d;

    public zzh(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.d;
        v.J2(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        v.L2(parcel, G2);
    }
}
