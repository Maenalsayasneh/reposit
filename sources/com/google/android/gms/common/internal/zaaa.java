package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new p();
    public final int c;
    public List<zao> d;

    public zaaa(int i, List<zao> list) {
        this.c = i;
        this.d = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        v.F2(parcel, 2, this.d, false);
        v.L2(parcel, G2);
    }
}
