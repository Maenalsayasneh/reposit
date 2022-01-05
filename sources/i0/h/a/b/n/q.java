package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class q implements Parcelable.Creator<CardInfo> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = v.N(parcel, readInt);
            } else if (i2 == 2) {
                str2 = v.N(parcel, readInt);
            } else if (i2 == 3) {
                str3 = v.N(parcel, readInt);
            } else if (i2 == 4) {
                i = v.G1(parcel, readInt);
            } else if (i2 != 5) {
                v.i2(parcel, readInt);
            } else {
                userAddress = (UserAddress) v.M(parcel, readInt, UserAddress.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
