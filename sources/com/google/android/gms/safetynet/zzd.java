package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.j.g;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new g();
    public final long c;
    public final HarmfulAppsData[] d;
    public final int q;
    public final boolean x;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.c = j;
        this.d = harmfulAppsDataArr;
        this.x = z;
        if (z) {
            this.q = i;
        } else {
            this.q = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        long j = this.c;
        v.J2(parcel, 2, 8);
        parcel.writeLong(j);
        v.E2(parcel, 3, this.d, i, false);
        int i2 = this.q;
        v.J2(parcel, 4, 4);
        parcel.writeInt(i2);
        boolean z = this.x;
        v.J2(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        v.L2(parcel, G2);
    }
}
