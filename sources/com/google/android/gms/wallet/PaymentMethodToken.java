package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.b0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new b0();
    public int c;
    public String d;

    public PaymentMethodToken() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i2);
        v.B2(parcel, 3, this.d, false);
        v.L2(parcel, G2);
    }

    public PaymentMethodToken(int i, String str) {
        this.c = i;
        this.d = str;
    }
}
