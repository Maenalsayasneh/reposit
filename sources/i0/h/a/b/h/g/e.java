package i0.h.a.b.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import h0.b0.v;

public final class e implements Parcelable.Creator<StreetViewPanoramaOrientation> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                f = v.D1(parcel, readInt);
            } else if (i != 3) {
                v.i2(parcel, readInt);
            } else {
                f2 = v.D1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new StreetViewPanoramaOrientation(f, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
