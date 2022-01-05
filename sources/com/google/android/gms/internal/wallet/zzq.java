package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.g.k.j;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new j();
    public String[] c;
    public int[] d;
    public RemoteViews q;
    public byte[] x;

    public zzq() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.C2(parcel, 1, this.c, false);
        int[] iArr = this.d;
        if (iArr != null) {
            int G22 = v.G2(parcel, 2);
            parcel.writeIntArray(iArr);
            v.L2(parcel, G22);
        }
        v.A2(parcel, 3, this.q, i, false);
        v.x2(parcel, 4, this.x, false);
        v.L2(parcel, G2);
    }

    public zzq(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.c = strArr;
        this.d = iArr;
        this.q = remoteViews;
        this.x = bArr;
    }
}
