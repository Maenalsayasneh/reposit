package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import h0.b0.v;
import i0.h.a.b.n.y;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class OfferWalletObject extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new y();
    public final int c;
    public String d;
    public CommonWalletObject q;

    public OfferWalletObject() {
        this.c = 3;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        v.B2(parcel, 2, (String) null, false);
        v.B2(parcel, 3, this.d, false);
        v.A2(parcel, 4, this.q, i, false);
        v.L2(parcel, G2);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.c = i;
        this.d = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.c = str;
            this.q = commonWalletObject2;
            return;
        }
        this.q = commonWalletObject;
    }
}
