package i0.h.a.b.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class p implements Parcelable.Creator<Feature> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = v.N(parcel, readInt);
            } else if (i2 == 2) {
                i = v.G1(parcel, readInt);
            } else if (i2 != 3) {
                v.i2(parcel, readInt);
            } else {
                j = v.H1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
