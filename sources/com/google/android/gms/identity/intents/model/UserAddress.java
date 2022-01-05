package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.f.a.a.a;

public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();
    public String Y1;
    public String Z1;
    public String a2;
    public String b2;
    public String c;
    public String c2;
    public String d;
    public String d2;
    public String e2;
    public boolean f2;
    public String g2;
    public String h2;
    public String q;
    public String x;
    public String y;

    public UserAddress() {
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.c = str;
        this.d = str2;
        this.q = str3;
        this.x = str4;
        this.y = str5;
        this.Y1 = str6;
        this.Z1 = str7;
        this.a2 = str8;
        this.b2 = str9;
        this.c2 = str10;
        this.d2 = str11;
        this.e2 = str12;
        this.f2 = z;
        this.g2 = str13;
        this.h2 = str14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.B2(parcel, 4, this.q, false);
        v.B2(parcel, 5, this.x, false);
        v.B2(parcel, 6, this.y, false);
        v.B2(parcel, 7, this.Y1, false);
        v.B2(parcel, 8, this.Z1, false);
        v.B2(parcel, 9, this.a2, false);
        v.B2(parcel, 10, this.b2, false);
        v.B2(parcel, 11, this.c2, false);
        v.B2(parcel, 12, this.d2, false);
        v.B2(parcel, 13, this.e2, false);
        boolean z = this.f2;
        v.J2(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        v.B2(parcel, 15, this.g2, false);
        v.B2(parcel, 16, this.h2, false);
        v.L2(parcel, G2);
    }
}
