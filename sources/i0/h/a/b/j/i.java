package i0.h.a.b.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.zzh;
import h0.b0.v;

public final class i implements Parcelable.Creator<zzh> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = v.G1(parcel, readInt);
            } else if (i2 != 3) {
                v.i2(parcel, readInt);
            } else {
                z = v.A1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zzh(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
