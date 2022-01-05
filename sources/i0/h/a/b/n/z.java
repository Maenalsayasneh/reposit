package i0.h.a.b.n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class z implements Parcelable.Creator<PaymentData> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = v.N(parcel, readInt);
                    break;
                case 2:
                    cardInfo = (CardInfo) v.M(parcel, readInt, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) v.M(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) v.M(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = v.N(parcel, readInt);
                    break;
                case 6:
                    bundle = v.I(parcel, readInt);
                    break;
                case 7:
                    str3 = v.N(parcel, readInt);
                    break;
                case 8:
                    bundle2 = v.I(parcel, readInt);
                    break;
                default:
                    v.i2(parcel, readInt);
                    break;
            }
        }
        v.a0(parcel, r2);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
