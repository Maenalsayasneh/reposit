package i0.h.a.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class d implements Parcelable.Creator<RecaptchaActionType> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                v.i2(parcel, readInt);
            } else {
                str = v.N(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new RecaptchaActionType(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecaptchaActionType[i];
    }
}
