package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.zza;
import com.google.android.gms.wallet.zzad;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class t implements Parcelable.Creator<FullWallet> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        String str2 = null;
        zzad zzad = null;
        String str3 = null;
        zza zza = null;
        zza zza2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    zzad = (zzad) v.M(parcel, readInt, zzad.CREATOR);
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
                    strArr = v.O(parcel, readInt);
                    break;
                case 9:
                    userAddress = (UserAddress) v.M(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) v.M(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) v.Q(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                case 12:
                    paymentMethodToken = (PaymentMethodToken) v.M(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                default:
                    v.i2(parcel, readInt);
                    break;
            }
        }
        v.a0(parcel, r2);
        return new FullWallet(str, str2, zzad, str3, zza, zza2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FullWallet[i];
    }
}
