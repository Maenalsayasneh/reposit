package i0.h.a.b.g.h;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public abstract class n2 extends a implements o2 {
    public n2() {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    public final boolean L(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        v.X1((Status) r.a(parcel, Status.CREATOR), (RecaptchaResultData) r.a(parcel, RecaptchaResultData.CREATOR), ((b) this).a);
        return true;
    }
}
