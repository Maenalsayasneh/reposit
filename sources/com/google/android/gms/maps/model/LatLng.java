package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import i0.h.a.b.h.g.c;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new c();
    public final double c;
    public final double d;

    public LatLng(double d2, double d3) {
        if (-180.0d > d3 || d3 >= 180.0d) {
            this.d = ((((d3 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.d = d3;
        }
        this.c = Math.max(-90.0d, Math.min(90.0d, d2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.c) == Double.doubleToLongBits(latLng.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(latLng.d);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        long doubleToLongBits2 = Double.doubleToLongBits(this.d);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        double d2 = this.c;
        double d3 = this.d;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d2);
        sb.append(InstabugDbContract.COMMA_SEP);
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        double d2 = this.c;
        v.J2(parcel, 2, 8);
        parcel.writeDouble(d2);
        double d3 = this.d;
        v.J2(parcel, 3, 8);
        parcel.writeDouble(d3);
        v.L2(parcel, G2);
    }
}
