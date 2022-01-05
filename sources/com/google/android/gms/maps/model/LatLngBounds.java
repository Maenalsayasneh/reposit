package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.h.g.b;
import java.util.Arrays;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new b();
    public final LatLng c;
    public final LatLng d;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        v.A(latLng, "null southwest");
        v.A(latLng2, "null northeast");
        double d2 = latLng2.c;
        double d3 = latLng.c;
        v.v(d2 >= d3, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d3), Double.valueOf(latLng2.c));
        this.c = latLng;
        this.d = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.c.equals(latLngBounds.c) && this.d.equals(latLngBounds.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d});
    }

    public final String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("southwest", this.c);
        kVar.a("northeast", this.d);
        return kVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 2, this.c, i, false);
        v.A2(parcel, 3, this.d, i, false);
        v.L2(parcel, G2);
    }
}
