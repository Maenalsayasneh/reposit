package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.e.e;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new e();
    public String c;
    public LoyaltyPointsBalance d;
    @Deprecated
    public TimeInterval q;

    public LoyaltyPoints() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.A2(parcel, 3, this.d, i, false);
        v.A2(parcel, 5, this.q, i, false);
        v.L2(parcel, G2);
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.c = str;
        this.d = loyaltyPointsBalance;
        this.q = timeInterval;
    }
}
