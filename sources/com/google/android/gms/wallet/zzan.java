package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.m;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new m();
    public String c;
    public Bundle d;

    public zzan() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.w2(parcel, 3, this.d, false);
        v.L2(parcel, G2);
    }

    public zzan(String str, Bundle bundle) {
        this.c = str;
        this.d = bundle;
    }
}
