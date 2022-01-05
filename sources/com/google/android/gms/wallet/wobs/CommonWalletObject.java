package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import h0.b0.v;
import i0.h.a.b.n.e.a;
import java.util.ArrayList;

@KeepName
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public class CommonWalletObject extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new a();
    public String Y1;
    public String Z1;
    @Deprecated
    public String a2;
    public int b2;
    public String c;
    public ArrayList<WalletObjectMessage> c2;
    public String d;
    public TimeInterval d2;
    public ArrayList<LatLng> e2;
    @Deprecated
    public String f2;
    @Deprecated
    public String g2;
    public ArrayList<LabelValueRow> h2;
    public boolean i2;
    public ArrayList<UriData> j2;
    public ArrayList<TextModuleData> k2;
    public ArrayList<UriData> l2;
    public String q;
    public String x;
    public String y;

    public CommonWalletObject() {
        this.c2 = new ArrayList<>();
        this.e2 = new ArrayList<>();
        this.h2 = new ArrayList<>();
        this.j2 = new ArrayList<>();
        this.k2 = new ArrayList<>();
        this.l2 = new ArrayList<>();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.B2(parcel, 4, this.q, false);
        v.B2(parcel, 5, this.x, false);
        v.B2(parcel, 6, this.y, false);
        v.B2(parcel, 7, this.Y1, false);
        v.B2(parcel, 8, this.Z1, false);
        v.B2(parcel, 9, this.a2, false);
        int i3 = this.b2;
        v.J2(parcel, 10, 4);
        parcel.writeInt(i3);
        v.F2(parcel, 11, this.c2, false);
        v.A2(parcel, 12, this.d2, i, false);
        v.F2(parcel, 13, this.e2, false);
        v.B2(parcel, 14, this.f2, false);
        v.B2(parcel, 15, this.g2, false);
        v.F2(parcel, 16, this.h2, false);
        boolean z = this.i2;
        v.J2(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        v.F2(parcel, 18, this.j2, false);
        v.F2(parcel, 19, this.k2, false);
        v.F2(parcel, 20, this.l2, false);
        v.L2(parcel, G2);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str9, String str10, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6) {
        this.c = str;
        this.d = str2;
        this.q = str3;
        this.x = str4;
        this.y = str5;
        this.Y1 = str6;
        this.Z1 = str7;
        this.a2 = str8;
        this.b2 = i;
        this.c2 = arrayList;
        this.d2 = timeInterval;
        this.e2 = arrayList2;
        this.f2 = str9;
        this.g2 = str10;
        this.h2 = arrayList3;
        this.i2 = z;
        this.j2 = arrayList4;
        this.k2 = arrayList5;
        this.l2 = arrayList6;
    }
}
