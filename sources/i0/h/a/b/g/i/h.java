package i0.h.a.b.g.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class h implements g, IInterface {
    public final IBinder a;
    public final String b = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public h(IBinder iBinder) {
        this.a = iBinder;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final void x(e eVar, byte[] bArr, String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = b.a;
        obtain.writeStrongBinder(eVar == null ? null : (a) eVar);
        obtain.writeByteArray(bArr);
        obtain.writeString(str);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
