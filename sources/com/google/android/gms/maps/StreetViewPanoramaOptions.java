package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.c.m.b;
import i0.h.a.b.h.i;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new i();
    public Boolean Y1;
    public Boolean Z1;
    public Boolean a2;
    public Boolean b2;
    public StreetViewPanoramaCamera c;
    public StreetViewSource c2 = StreetViewSource.c;
    public String d;
    public LatLng q;
    public Integer x;
    public Boolean y;

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b3, byte b4, byte b5, byte b6, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.y = bool;
        this.Y1 = bool;
        this.Z1 = bool;
        this.a2 = bool;
        this.c = streetViewPanoramaCamera;
        this.q = latLng;
        this.x = num;
        this.d = str;
        this.y = b.p0(b);
        this.Y1 = b.p0(b3);
        this.Z1 = b.p0(b4);
        this.a2 = b.p0(b5);
        this.b2 = b.p0(b6);
        this.c2 = streetViewSource;
    }

    public final String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("PanoramaId", this.d);
        kVar.a("Position", this.q);
        kVar.a("Radius", this.x);
        kVar.a("Source", this.c2);
        kVar.a("StreetViewPanoramaCamera", this.c);
        kVar.a("UserNavigationEnabled", this.y);
        kVar.a("ZoomGesturesEnabled", this.Y1);
        kVar.a("PanningGesturesEnabled", this.Z1);
        kVar.a("StreetNamesEnabled", this.a2);
        kVar.a("UseViewLifecycleInFragment", this.b2);
        return kVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 2, this.c, i, false);
        v.B2(parcel, 3, this.d, false);
        v.A2(parcel, 4, this.q, i, false);
        Integer num = this.x;
        if (num != null) {
            v.J2(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        byte o02 = b.o0(this.y);
        v.J2(parcel, 6, 4);
        parcel.writeInt(o02);
        byte o03 = b.o0(this.Y1);
        v.J2(parcel, 7, 4);
        parcel.writeInt(o03);
        byte o04 = b.o0(this.Z1);
        v.J2(parcel, 8, 4);
        parcel.writeInt(o04);
        byte o05 = b.o0(this.a2);
        v.J2(parcel, 9, 4);
        parcel.writeInt(o05);
        byte o06 = b.o0(this.b2);
        v.J2(parcel, 10, 4);
        parcel.writeInt(o06);
        v.A2(parcel, 11, this.c2, i, false);
        v.L2(parcel, G2);
    }
}
