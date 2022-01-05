package i0.h.a.b.c.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class r0 implements Parcelable.Creator<RootTelemetryConfiguration> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i4 == 2) {
                z = v.A1(parcel, readInt);
            } else if (i4 == 3) {
                z2 = v.A1(parcel, readInt);
            } else if (i4 == 4) {
                i2 = v.G1(parcel, readInt);
            } else if (i4 != 5) {
                v.i2(parcel, readInt);
            } else {
                i3 = v.G1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
