package i0.h.a.b.k.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zaa;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class c implements Parcelable.Creator<zaa> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i3 == 2) {
                i2 = v.G1(parcel, readInt);
            } else if (i3 != 3) {
                v.i2(parcel, readInt);
            } else {
                intent = (Intent) v.M(parcel, readInt, Intent.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new zaa(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
