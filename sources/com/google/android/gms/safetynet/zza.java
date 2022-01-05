package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.j.e;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new e();
    public final String c;

    public zza(String str) {
        this.c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.L2(parcel, G2);
    }
}
