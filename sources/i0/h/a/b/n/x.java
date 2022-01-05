package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.zza;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class x implements Parcelable.Creator<MaskedWallet> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        zza zza = null;
        zza zza2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = v.N(parcel, readInt);
                    break;
                case 3:
                    str2 = v.N(parcel, readInt);
                    break;
                case 4:
                    strArr = v.O(parcel, readInt);
                    break;
                case 5:
                    str3 = v.N(parcel, readInt);
                    break;
                case 6:
                    zza = (zza) v.M(parcel, readInt, zza.CREATOR);
                    break;
                case 7:
                    zza2 = (zza) v.M(parcel, readInt, zza.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) v.Q(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) v.Q(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) v.M(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) v.M(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) v.Q(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    v.i2(parcel, readInt);
                    break;
            }
        }
        v.a0(parcel, r2);
        return new MaskedWallet(str, str2, strArr, str3, zza, zza2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
