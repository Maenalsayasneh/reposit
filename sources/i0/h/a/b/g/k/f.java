package i0.h.a.b.g.k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wallet.zzi;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class f implements Parcelable.Creator<zzi> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                v.i2(parcel, readInt);
            } else {
                bArr = v.J(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zzi(bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
