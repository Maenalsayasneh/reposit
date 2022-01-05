package i0.h.a.b.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewSource;
import h0.b0.v;

public final class f implements Parcelable.Creator<StreetViewSource> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                v.i2(parcel, readInt);
            } else {
                i = v.G1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new StreetViewSource(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewSource[i];
    }
}
