package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.h.g.d;
import java.util.Arrays;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new d();
    public final float c;
    public final float d;
    public final float q;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        v.u(z, sb.toString());
        this.c = ((double) f) <= 0.0d ? 0.0f : f;
        this.d = 0.0f + f2;
        this.q = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        new StreetViewPanoramaOrientation(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaCamera.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(streetViewPanoramaCamera.d) && Float.floatToIntBits(this.q) == Float.floatToIntBits(streetViewPanoramaCamera.q);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.q)});
    }

    public String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("zoom", Float.valueOf(this.c));
        kVar.a("tilt", Float.valueOf(this.d));
        kVar.a("bearing", Float.valueOf(this.q));
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
        float f3 = this.q;
        v.J2(parcel, 4, 4);
        parcel.writeFloat(f3);
        v.L2(parcel, G2);
    }
}
