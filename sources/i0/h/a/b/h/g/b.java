package i0.h.a.b.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h0.b0.v;

public final class b implements Parcelable.Creator<LatLngBounds> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                latLng = (LatLng) v.M(parcel, readInt, LatLng.CREATOR);
            } else if (i != 3) {
                v.i2(parcel, readInt);
            } else {
                latLng2 = (LatLng) v.M(parcel, readInt, LatLng.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
