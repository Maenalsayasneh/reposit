package i0.h.a.b.g.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class r2 implements s2, IInterface {
    public final IBinder a;
    public final String b = "com.google.android.gms.recaptcha.internal.IRecaptchaService";

    public r2(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void F(o2 o2Var, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = r.a;
        obtain.writeStrongBinder((a) o2Var);
        obtain.writeInt(1);
        recaptchaHandle.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        recaptchaAction.writeToParcel(obtain, 0);
        L(3, obtain);
    }

    public final void L(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void U(q2 q2Var, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = r.a;
        obtain.writeStrongBinder((a) q2Var);
        obtain.writeString(str);
        L(2, obtain);
    }

    public IBinder asBinder() {
        return this.a;
    }
}
