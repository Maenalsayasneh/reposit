package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.i;

@Deprecated
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new i();
    public final String c;
    public final String d;
    public final int q;
    public final int x;

    public zzad(String str, String str2, int i, int i2) {
        this.c = str;
        this.d = str2;
        this.q = i;
        this.x = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        int i2 = this.q;
        v.J2(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.x;
        v.J2(parcel, 5, 4);
        parcel.writeInt(i3);
        v.L2(parcel, G2);
    }
}
