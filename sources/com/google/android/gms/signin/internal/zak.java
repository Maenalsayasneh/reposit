package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zau;
import h0.b0.v;
import i0.h.a.b.k.b.j;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new j();
    public final int c;
    public final ConnectionResult d;
    public final zau q;

    public zak(int i, ConnectionResult connectionResult, zau zau) {
        this.c = i;
        this.d = connectionResult;
        this.q = zau;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        v.A2(parcel, 2, this.d, i, false);
        v.A2(parcel, 3, this.q, i, false);
        v.L2(parcel, G2);
    }

    public zak() {
        ConnectionResult connectionResult = new ConnectionResult(8, (PendingIntent) null);
        this.c = 1;
        this.d = connectionResult;
        this.q = null;
    }
}
