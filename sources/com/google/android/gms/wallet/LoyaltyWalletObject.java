package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import h0.b0.v;
import i0.h.a.b.n.w;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new w();
    public String Y1;
    public String Z1;
    public String a2;
    @Deprecated
    public String b2;
    public String c;
    public String c2;
    public String d;
    public int d2;
    public ArrayList<WalletObjectMessage> e2;
    public TimeInterval f2;
    public ArrayList<LatLng> g2;
    @Deprecated
    public String h2;
    @Deprecated
    public String i2;
    public ArrayList<LabelValueRow> j2;
    public boolean k2;
    public ArrayList<UriData> l2;
    public ArrayList<TextModuleData> m2;
    public ArrayList<UriData> n2;
    public LoyaltyPoints o2;
    public String q;
    public String x;
    public String y;

    public LoyaltyWalletObject() {
        this.e2 = new ArrayList<>();
        this.g2 = new ArrayList<>();
        this.j2 = new ArrayList<>();
        this.l2 = new ArrayList<>();
        this.m2 = new ArrayList<>();
        this.n2 = new ArrayList<>();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
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
        int i3 = this.d2;
        v.J2(parcel, 12, 4);
        parcel.writeInt(i3);
        v.F2(parcel, 13, this.e2, false);
        v.A2(parcel, 14, this.f2, i, false);
        v.F2(parcel, 15, this.g2, false);
        v.B2(parcel, 16, this.h2, false);
        v.B2(parcel, 17, this.i2, false);
        v.F2(parcel, 18, this.j2, false);
        boolean z = this.k2;
        v.J2(parcel, 19, 4);
        parcel.writeInt(z ? 1 : 0);
        v.F2(parcel, 20, this.l2, false);
        v.F2(parcel, 21, this.m2, false);
        v.F2(parcel, 22, this.n2, false);
        v.A2(parcel, 23, this.o2, i, false);
        v.L2(parcel, G2);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str11, String str12, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.d2 = i;
        this.e2 = arrayList;
        this.f2 = timeInterval;
        this.g2 = arrayList2;
        this.h2 = str11;
        this.i2 = str12;
        this.j2 = arrayList3;
        this.k2 = z;
        this.l2 = arrayList4;
        this.m2 = arrayList5;
        this.n2 = arrayList6;
        this.o2 = loyaltyPoints;
    }
}
