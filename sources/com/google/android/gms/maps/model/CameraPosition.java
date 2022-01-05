package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.h.g.a;
import java.util.Arrays;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new a();
    public final LatLng c;
    public final float d;
    public final float q;
    public final float x;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        v.A(latLng, "null camera target");
        v.v(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.c = latLng;
        this.d = f;
        this.q = f2 + 0.0f;
        this.x = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.c.equals(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d) && Float.floatToIntBits(this.q) == Float.floatToIntBits(cameraPosition.q) && Float.floatToIntBits(this.x) == Float.floatToIntBits(cameraPosition.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.d), Float.valueOf(this.q), Float.valueOf(this.x)});
    }

    public final String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("target", this.c);
        kVar.a("zoom", Float.valueOf(this.d));
        kVar.a("tilt", Float.valueOf(this.q));
        kVar.a("bearing", Float.valueOf(this.x));
        return kVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 2, this.c, i, false);
        float f = this.d;
        v.J2(parcel, 3, 4);
        parcel.writeFloat(f);
        float f2 = this.q;
        v.J2(parcel, 4, 4);
        parcel.writeFloat(f2);
        float f3 = this.x;
        v.J2(parcel, 5, 4);
        parcel.writeFloat(f3);
        v.L2(parcel, G2);
    }
}
