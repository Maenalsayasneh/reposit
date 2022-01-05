package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.g.k.h;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new h();
    public final byte[] c;

    public zzm(byte[] bArr) {
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.x2(parcel, 1, this.c, false);
        v.L2(parcel, G2);
    }
}
