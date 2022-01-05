package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.h.g.e;
import java.util.Arrays;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new e();
    public final float c;
    public final float d;

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        v.u(z, sb.toString());
        this.c = f + 0.0f;
        this.d = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaOrientation.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(streetViewPanoramaOrientation.d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("tilt", Float.valueOf(this.c));
        kVar.a("bearing", Float.valueOf(this.d));
        return kVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        float f = this.c;
        v.J2(parcel, 2, 4);
        parcel.writeFloat(f);
        float f2 = this.d;
        v.J2(parcel, 3, 4);
        parcel.writeFloat(f2);
        v.L2(parcel, G2);
    }
}
