package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h0.b0.v;
import i0.h.a.b.c.i.k;
import i0.h.a.b.c.i.q0;
import i0.h.a.b.c.m.b;
import i0.h.a.b.h.h;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new h();
    public Boolean Y1;
    public Boolean Z1;
    public Boolean a2;
    public Boolean b2;
    public Boolean c;
    public Boolean c2;
    public Boolean d;
    public Boolean d2;
    public Boolean e2;
    public Boolean f2;
    public Float g2 = null;
    public Float h2 = null;
    public LatLngBounds i2 = null;
    public Boolean j2;
    public int q = -1;
    public CameraPosition x;
    public Boolean y;

    public GoogleMapOptions(byte b, byte b3, int i, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f, Float f3, LatLngBounds latLngBounds, byte b13) {
        this.c = b.p0(b);
        this.d = b.p0(b3);
        this.q = i;
        this.x = cameraPosition;
        this.y = b.p0(b4);
        this.Y1 = b.p0(b5);
        this.Z1 = b.p0(b6);
        this.a2 = b.p0(b7);
        this.b2 = b.p0(b8);
        this.c2 = b.p0(b9);
        this.d2 = b.p0(b10);
        this.e2 = b.p0(b11);
        this.f2 = b.p0(b12);
        this.g2 = f;
        this.h2 = f3;
        this.i2 = latLngBounds;
        this.j2 = b.p0(b13);
    }

    public static GoogleMapOptions I0(Context context, AttributeSet attributeSet) {
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = R.styleable.MapAttrs;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.q = obtainAttributes.getInt(i, -1);
        }
        int i3 = R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.c = Boolean.valueOf(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.d = Boolean.valueOf(obtainAttributes.getBoolean(i4, false));
        }
        int i5 = R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.Y1 = Boolean.valueOf(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.c2 = Boolean.valueOf(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.j2 = Boolean.valueOf(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.Z1 = Boolean.valueOf(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.b2 = Boolean.valueOf(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.a2 = Boolean.valueOf(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.y = Boolean.valueOf(obtainAttributes.getBoolean(i11, true));
        }
        int i12 = R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.d2 = Boolean.valueOf(obtainAttributes.getBoolean(i12, false));
        }
        int i13 = R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.e2 = Boolean.valueOf(obtainAttributes.getBoolean(i13, true));
        }
        int i14 = R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.f2 = Boolean.valueOf(obtainAttributes.getBoolean(i14, false));
        }
        int i15 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.g2 = Float.valueOf(obtainAttributes.getFloat(i15, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.h2 = Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        int i16 = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        float f = 0.0f;
        Float valueOf = obtainAttributes2.hasValue(i16) ? Float.valueOf(obtainAttributes2.getFloat(i16, 0.0f)) : null;
        int i17 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes2.hasValue(i17) ? Float.valueOf(obtainAttributes2.getFloat(i17, 0.0f)) : null;
        int i18 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes2.hasValue(i18) ? Float.valueOf(obtainAttributes2.getFloat(i18, 0.0f)) : null;
        int i19 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes2.hasValue(i19) ? Float.valueOf(obtainAttributes2.getFloat(i19, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (!(valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
        }
        googleMapOptions.i2 = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        int i20 = R.styleable.MapAttrs_cameraTargetLat;
        float f3 = obtainAttributes3.hasValue(i20) ? obtainAttributes3.getFloat(i20, 0.0f) : 0.0f;
        int i21 = R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng((double) f3, (double) (obtainAttributes3.hasValue(i21) ? obtainAttributes3.getFloat(i21, 0.0f) : 0.0f));
        int i22 = R.styleable.MapAttrs_cameraZoom;
        float f4 = obtainAttributes3.hasValue(i22) ? obtainAttributes3.getFloat(i22, 0.0f) : 0.0f;
        int i23 = R.styleable.MapAttrs_cameraBearing;
        float f5 = obtainAttributes3.hasValue(i23) ? obtainAttributes3.getFloat(i23, 0.0f) : 0.0f;
        int i24 = R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes3.hasValue(i24)) {
            f = obtainAttributes3.getFloat(i24, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.x = new CameraPosition(latLng, f4, f, f5);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        k kVar = new k(this, (q0) null);
        kVar.a("MapType", Integer.valueOf(this.q));
        kVar.a("LiteMode", this.d2);
        kVar.a("Camera", this.x);
        kVar.a("CompassEnabled", this.Y1);
        kVar.a("ZoomControlsEnabled", this.y);
        kVar.a("ScrollGesturesEnabled", this.Z1);
        kVar.a("ZoomGesturesEnabled", this.a2);
        kVar.a("TiltGesturesEnabled", this.b2);
        kVar.a("RotateGesturesEnabled", this.c2);
        kVar.a("ScrollGesturesEnabledDuringRotateOrZoom", this.j2);
        kVar.a("MapToolbarEnabled", this.e2);
        kVar.a("AmbientEnabled", this.f2);
        kVar.a("MinZoomPreference", this.g2);
        kVar.a("MaxZoomPreference", this.h2);
        kVar.a("LatLngBoundsForCameraTarget", this.i2);
        kVar.a("ZOrderOnTop", this.c);
        kVar.a("UseViewLifecycleInFragment", this.d);
        return kVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        byte o02 = b.o0(this.c);
        v.J2(parcel, 2, 4);
        parcel.writeInt(o02);
        byte o03 = b.o0(this.d);
        v.J2(parcel, 3, 4);
        parcel.writeInt(o03);
        int i3 = this.q;
        v.J2(parcel, 4, 4);
        parcel.writeInt(i3);
        v.A2(parcel, 5, this.x, i, false);
        byte o04 = b.o0(this.y);
        v.J2(parcel, 6, 4);
        parcel.writeInt(o04);
        byte o05 = b.o0(this.Y1);
        v.J2(parcel, 7, 4);
        parcel.writeInt(o05);
        byte o06 = b.o0(this.Z1);
        v.J2(parcel, 8, 4);
        parcel.writeInt(o06);
        byte o07 = b.o0(this.a2);
        v.J2(parcel, 9, 4);
        parcel.writeInt(o07);
        byte o08 = b.o0(this.b2);
        v.J2(parcel, 10, 4);
        parcel.writeInt(o08);
        byte o09 = b.o0(this.c2);
        v.J2(parcel, 11, 4);
        parcel.writeInt(o09);
        byte o010 = b.o0(this.d2);
        v.J2(parcel, 12, 4);
        parcel.writeInt(o010);
        byte o011 = b.o0(this.e2);
        v.J2(parcel, 14, 4);
        parcel.writeInt(o011);
        byte o012 = b.o0(this.f2);
        v.J2(parcel, 15, 4);
        parcel.writeInt(o012);
        v.y2(parcel, 16, this.g2, false);
        v.y2(parcel, 17, this.h2, false);
        v.A2(parcel, 18, this.i2, i, false);
        byte o013 = b.o0(this.j2);
        v.J2(parcel, 19, 4);
        parcel.writeInt(o013);
        v.L2(parcel, G2);
    }

    public GoogleMapOptions() {
    }
}
