package i0.h.a.b.a.a.d.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class b implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        Bundle bundle = null;
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
                bundle = v.I(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new GoogleSignInOptionsExtensionParcelable(i, i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }
}
