package i0.h.a.b.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class o implements Parcelable.Creator<ConnectionResult> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i3 == 2) {
                i2 = v.G1(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) v.M(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 4) {
                v.i2(parcel, readInt);
            } else {
                str = v.N(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
