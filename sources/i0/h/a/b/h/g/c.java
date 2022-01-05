package i0.h.a.b.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h0.b0.v;

public final class c implements Parcelable.Creator<LatLng> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                d = v.C1(parcel, readInt);
            } else if (i != 3) {
                v.i2(parcel, readInt);
            } else {
                d2 = v.C1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
