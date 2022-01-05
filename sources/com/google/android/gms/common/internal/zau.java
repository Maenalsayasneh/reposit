package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.c0;
import i0.h.a.b.c.i.g;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zau> CREATOR = new c0();
    public final int c;
    public IBinder d;
    public ConnectionResult q;
    public boolean x;
    public boolean y;

    public zau(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.c = i;
        this.d = iBinder;
        this.q = connectionResult;
        this.x = z;
        this.y = z2;
    }

    public final g I0() {
        IBinder iBinder = this.d;
        if (iBinder == null) {
            return null;
        }
        return g.a.d0(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zau)) {
            return false;
        }
        zau zau = (zau) obj;
        return this.q.equals(zau.q) && v.c0(I0(), zau.I0());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        IBinder iBinder = this.d;
        if (iBinder != null) {
            int G22 = v.G2(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            v.L2(parcel, G22);
        }
        v.A2(parcel, 3, this.q, i, false);
        boolean z = this.x;
        v.J2(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.y;
        v.J2(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        v.L2(parcel, G2);
    }
}
