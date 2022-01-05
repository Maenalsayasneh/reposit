package i0.h.a.b.g.h;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public abstract class p2 extends a implements q2 {
    public p2() {
        super("com.google.android.gms.recaptcha.internal.IInitCallback");
    }

    public final boolean L(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        v.X1((Status) r.a(parcel, Status.CREATOR), (RecaptchaHandle) r.a(parcel, RecaptchaHandle.CREATOR), ((w2) this).a);
        return true;
    }
}
