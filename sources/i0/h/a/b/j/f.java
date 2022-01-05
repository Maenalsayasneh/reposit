package i0.h.a.b.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.HarmfulAppsData;
import h0.b0.v;

public final class f implements Parcelable.Creator<HarmfulAppsData> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = v.N(parcel, readInt);
            } else if (i2 == 3) {
                bArr = v.J(parcel, readInt);
            } else if (i2 != 4) {
                v.i2(parcel, readInt);
            } else {
                i = v.G1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new HarmfulAppsData(str, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HarmfulAppsData[i];
    }
}
