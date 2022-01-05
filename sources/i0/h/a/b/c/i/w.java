package i0.h.a.b.c.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zao;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class w implements Parcelable.Creator<zao> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i4 == 2) {
                i2 = v.G1(parcel, readInt);
            } else if (i4 == 3) {
                i3 = v.G1(parcel, readInt);
            } else if (i4 == 4) {
                j = v.H1(parcel, readInt);
            } else if (i4 != 5) {
                v.i2(parcel, readInt);
            } else {
                j2 = v.H1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zao(i, i2, i3, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zao[i];
    }
}
