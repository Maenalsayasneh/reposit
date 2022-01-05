package i0.h.a.b.c.i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzc;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class d0 implements Parcelable.Creator<zzc> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = v.I(parcel, readInt);
            } else if (i2 == 2) {
                featureArr = (Feature[]) v.Q(parcel, readInt, Feature.CREATOR);
            } else if (i2 == 3) {
                i = v.G1(parcel, readInt);
            } else if (i2 != 4) {
                v.i2(parcel, readInt);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) v.M(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new zzc(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
