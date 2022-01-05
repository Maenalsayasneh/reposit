package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.InstrumentInfo;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class u implements Parcelable.Creator<InstrumentInfo> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = v.N(parcel, readInt);
            } else if (i2 == 3) {
                str2 = v.N(parcel, readInt);
            } else if (i2 != 4) {
                v.i2(parcel, readInt);
            } else {
                i = v.G1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new InstrumentInfo(str, str2, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InstrumentInfo[i];
    }
}
