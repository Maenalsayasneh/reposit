package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.zzad;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class i implements Parcelable.Creator<zzad> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 2) {
                str = v.N(parcel, readInt);
            } else if (i3 == 3) {
                str2 = v.N(parcel, readInt);
            } else if (i3 == 4) {
                i = v.G1(parcel, readInt);
            } else if (i3 != 5) {
                v.i2(parcel, readInt);
            } else {
                i2 = v.G1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zzad(str, str2, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
