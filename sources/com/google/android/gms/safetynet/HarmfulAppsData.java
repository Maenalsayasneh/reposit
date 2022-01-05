package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.j.f;

public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new f();
    public final String c;
    public final byte[] d;
    public final int q;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.c = str;
        this.d = bArr;
        this.q = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.x2(parcel, 3, this.d, false);
        int i2 = this.q;
        v.J2(parcel, 4, 4);
        parcel.writeInt(i2);
        v.L2(parcel, G2);
    }
}
