package i0.h.a.b.n.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class g implements Parcelable.Creator<TimeInterval> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                j = v.H1(parcel, readInt);
            } else if (i != 3) {
                v.i2(parcel, readInt);
            } else {
                j2 = v.H1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new TimeInterval(j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeInterval[i];
    }
}
