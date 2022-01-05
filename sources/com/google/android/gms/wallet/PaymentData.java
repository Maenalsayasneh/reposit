package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h0.b0.v;
import i0.h.a.b.n.a;
import i0.h.a.b.n.z;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class PaymentData extends AbstractSafeParcelable implements a {
    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new z();
    public Bundle Y1;
    public String Z1;
    public Bundle a2;
    public String c;
    public CardInfo d;
    public UserAddress q;
    public PaymentMethodToken x;
    public String y;

    public PaymentData() {
    }

    public void a(@RecentlyNonNull Intent intent) {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 1, this.c, false);
        v.A2(parcel, 2, this.d, i, false);
        v.A2(parcel, 3, this.q, i, false);
        v.A2(parcel, 4, this.x, i, false);
        v.B2(parcel, 5, this.y, false);
        v.w2(parcel, 6, this.Y1, false);
        v.B2(parcel, 7, this.Z1, false);
        v.w2(parcel, 8, this.a2, false);
        v.L2(parcel, G2);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.c = str;
        this.d = cardInfo;
        this.q = userAddress;
        this.x = paymentMethodToken;
        this.y = str2;
        this.Y1 = bundle;
        this.Z1 = str3;
        this.a2 = bundle2;
    }
}
