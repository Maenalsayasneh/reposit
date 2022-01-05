package i0.h.a.b.k.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.zaj;
import i0.h.a.b.g.c.a;
import i0.h.a.b.g.c.b;
import i0.h.a.b.g.c.c;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class f extends b implements g {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void Z(zaj zaj, e eVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = c.a;
        obtain.writeInt(1);
        zaj.writeToParcel(obtain, 0);
        obtain.writeStrongBinder((a) eVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
