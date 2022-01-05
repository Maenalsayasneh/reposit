package i0.h.a.b.g.k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wallet.zzm;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class h implements Parcelable.Creator<zzm> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                v.i2(parcel, readInt);
            } else {
                bArr = v.J(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zzm(bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
