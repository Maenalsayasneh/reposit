package i0.h.a.b.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.zza;
import h0.b0.v;

public final class e implements Parcelable.Creator<zza> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                v.i2(parcel, readInt);
            } else {
                str = v.N(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zza(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
