package i0.h.a.b.i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class c implements Parcelable.Creator<RecaptchaAction> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        RecaptchaActionType recaptchaActionType = new RecaptchaActionType(RecaptchaActionType.OTHER);
        Bundle bundle = new Bundle();
        String str = "";
        String str2 = str;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                recaptchaActionType = (RecaptchaActionType) v.M(parcel, readInt, RecaptchaActionType.CREATOR);
            } else if (i == 2) {
                str = v.N(parcel, readInt);
            } else if (i == 3) {
                bundle = v.I(parcel, readInt);
            } else if (i != 4) {
                v.i2(parcel, readInt);
            } else {
                str2 = v.N(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new RecaptchaAction(recaptchaActionType, str, bundle, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecaptchaAction[i];
    }
}
