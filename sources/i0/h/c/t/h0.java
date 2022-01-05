package i0.h.c.t;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;
import h0.b0.v;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class h0 implements Parcelable.Creator<RemoteMessage> {
    public Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                v.i2(parcel, readInt);
            } else {
                bundle = v.I(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new RemoteMessage(bundle);
    }

    public Object[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
