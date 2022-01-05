package i0.h.a.b.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zaj;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class i implements Parcelable.Creator<zaj> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i2 != 2) {
                v.i2(parcel, readInt);
            } else {
                zat = (zat) v.M(parcel, readInt, zat.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new zaj(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}
