package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.a0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new a0();
    public ArrayList<Integer> Y1;
    public PaymentMethodTokenizationParameters Z1;
    public TransactionInfo a2;
    public boolean b2;
    public boolean c;
    public String c2;
    public boolean d;
    public Bundle d2;
    public CardRequirements q;
    public boolean x;
    public ShippingAddressRequirements y;

    public PaymentDataRequest() {
        this.b2 = true;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        boolean z = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        v.A2(parcel, 3, this.q, i, false);
        boolean z3 = this.x;
        v.J2(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        v.A2(parcel, 5, this.y, i, false);
        v.z2(parcel, 6, this.Y1, false);
        v.A2(parcel, 7, this.Z1, i, false);
        v.A2(parcel, 8, this.a2, i, false);
        boolean z4 = this.b2;
        v.J2(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        v.B2(parcel, 10, this.c2, false);
        v.w2(parcel, 11, this.d2, false);
        v.L2(parcel, G2);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList<Integer> arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, Bundle bundle) {
        this.c = z;
        this.d = z2;
        this.q = cardRequirements;
        this.x = z3;
        this.y = shippingAddressRequirements;
        this.Y1 = arrayList;
        this.Z1 = paymentMethodTokenizationParameters;
        this.a2 = transactionInfo;
        this.b2 = z4;
        this.c2 = str;
        this.d2 = bundle;
    }
}
