package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h0.b0.v;
import i0.h.a.b.n.q;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class CardInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new q();
    public String c;
    public String d;
    public String q;
    public int x;
    public UserAddress y;

    public CardInfo() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 1, this.c, false);
        v.B2(parcel, 2, this.d, false);
        v.B2(parcel, 3, this.q, false);
        int i2 = this.x;
        v.J2(parcel, 4, 4);
        parcel.writeInt(i2);
        v.A2(parcel, 5, this.y, i, false);
        v.L2(parcel, G2);
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.c = str;
        this.d = str2;
        this.q = str3;
        this.x = i;
        this.y = userAddress;
    }
}
