package i0.h.a.b.a.a.d.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import i0.h.a.b.g.a.b;
import i0.h.a.b.g.a.c;
import i0.h.a.b.g.a.d;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class p extends c implements q {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void V(o oVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = d.a;
        obtain.writeStrongBinder((b) oVar);
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        L(102, obtain);
    }

    public final void r(o oVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = d.a;
        obtain.writeStrongBinder((b) oVar);
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        L(103, obtain);
    }
}
