package i0.h.a.b.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class c implements Parcelable.Creator<CloudMessage> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                v.i2(parcel, readInt);
            } else {
                intent = (Intent) v.M(parcel, readInt, Intent.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new CloudMessage(intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}
