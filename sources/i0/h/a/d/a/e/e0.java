package i0.h.a.d.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class e0 implements IInterface {
    public final IBinder a;
    public final String b;

    public e0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final Parcel L() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void d0(int i, Parcel parcel) throws RemoteException {
        try {
            this.a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
