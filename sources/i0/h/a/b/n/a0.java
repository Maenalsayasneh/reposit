package i0.h.a.b.n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class a0 implements Parcelable.Creator<PaymentDataRequest> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r2 = v.r2(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList<Integer> arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        Bundle bundle = null;
        boolean z4 = true;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = v.A1(parcel2, readInt);
                    break;
                case 2:
                    z2 = v.A1(parcel2, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) v.M(parcel2, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z3 = v.A1(parcel2, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) v.M(parcel2, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = v.L(parcel2, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) v.M(parcel2, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) v.M(parcel2, readInt, TransactionInfo.CREATOR);
                    break;
                case 9:
                    z4 = v.A1(parcel2, readInt);
                    break;
                case 10:
                    str = v.N(parcel2, readInt);
                    break;
                case 11:
                    bundle = v.I(parcel2, readInt);
                    break;
                default:
                    v.i2(parcel2, readInt);
                    break;
            }
        }
        v.a0(parcel2, r2);
        return new PaymentDataRequest(z, z2, cardRequirements, z3, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z4, str, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
