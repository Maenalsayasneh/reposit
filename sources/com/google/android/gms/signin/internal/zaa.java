package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.g.h;
import i0.h.a.b.k.b.c;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zaa extends AbstractSafeParcelable implements h {
    public static final Parcelable.Creator<zaa> CREATOR = new c();
    public final int c;
    public int d;
    public Intent q;

    public zaa() {
        this.c = 2;
        this.d = 0;
        this.q = null;
    }

    public final Status getStatus() {
        if (this.d == 0) {
            return Status.c;
        }
        return Status.y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i3);
        v.A2(parcel, 3, this.q, i, false);
        v.L2(parcel, G2);
    }

    public zaa(int i, int i2, Intent intent) {
        this.c = i;
        this.d = i2;
        this.q = intent;
    }
}
