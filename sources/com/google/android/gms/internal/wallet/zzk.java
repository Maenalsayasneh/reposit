package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.g.k.g;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new g();
    public final byte[] c;

    public zzk() {
        this.c = new byte[0];
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.x2(parcel, 2, this.c, false);
        v.L2(parcel, G2);
    }

    public zzk(byte[] bArr) {
        this.c = bArr;
    }
}
