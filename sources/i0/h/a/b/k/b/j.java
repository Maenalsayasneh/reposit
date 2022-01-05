package i0.h.a.b.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zau;
import com.google.android.gms.signin.internal.zak;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class j implements Parcelable.Creator<zak> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zau zau = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i2 == 2) {
                connectionResult = (ConnectionResult) v.M(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 != 3) {
                v.i2(parcel, readInt);
            } else {
                zau = (zau) v.M(parcel, readInt, zau.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new zak(i, connectionResult, zau);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
