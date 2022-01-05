package i0.h.a.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class e implements Parcelable.Creator<RecaptchaHandle> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        ArrayList<String> arrayList = new ArrayList<>();
        String str = "";
        String str2 = str;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = v.N(parcel, readInt);
            } else if (i == 2) {
                str2 = v.N(parcel, readInt);
            } else if (i != 3) {
                v.i2(parcel, readInt);
            } else {
                arrayList = v.P(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new RecaptchaHandle(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecaptchaHandle[i];
    }
}
