package i0.h.a.b.n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.zzan;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class m implements Parcelable.Creator<zzan> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = v.N(parcel, readInt);
            } else if (i != 3) {
                v.i2(parcel, readInt);
            } else {
                bundle = v.I(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zzan(str, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzan[i];
    }
}
