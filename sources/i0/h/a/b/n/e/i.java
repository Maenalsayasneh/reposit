package i0.h.a.b.n.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class i implements Parcelable.Creator<WalletObjectMessage> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = v.N(parcel, readInt);
            } else if (i == 3) {
                str2 = v.N(parcel, readInt);
            } else if (i == 4) {
                timeInterval = (TimeInterval) v.M(parcel, readInt, TimeInterval.CREATOR);
            } else if (i == 5) {
                uriData = (UriData) v.M(parcel, readInt, UriData.CREATOR);
            } else if (i != 6) {
                v.i2(parcel, readInt);
            } else {
                uriData2 = (UriData) v.M(parcel, readInt, UriData.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
