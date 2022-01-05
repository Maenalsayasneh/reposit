package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.e.d;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new d();
    public int Y1;
    public int c;
    public String d;
    public double q;
    public String x;
    public long y;

    public LoyaltyPointsBalance() {
        this.Y1 = -1;
        this.c = -1;
        this.q = -1.0d;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i2);
        v.B2(parcel, 3, this.d, false);
        double d2 = this.q;
        v.J2(parcel, 4, 8);
        parcel.writeDouble(d2);
        v.B2(parcel, 5, this.x, false);
        long j = this.y;
        v.J2(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.Y1;
        v.J2(parcel, 7, 4);
        parcel.writeInt(i3);
        v.L2(parcel, G2);
    }

    public LoyaltyPointsBalance(int i, String str, double d2, String str2, long j, int i2) {
        this.c = i;
        this.d = str;
        this.q = d2;
        this.x = str2;
        this.y = j;
        this.Y1 = i2;
    }
}
