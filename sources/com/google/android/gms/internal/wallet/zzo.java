package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.g.k.i;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new i();
    public final PendingIntent c;

    public zzo(PendingIntent pendingIntent) {
        this.c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 1, this.c, i, false);
        v.L2(parcel, G2);
    }
}
