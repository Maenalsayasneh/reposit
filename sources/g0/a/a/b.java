package g0.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import g0.a.a.a;

/* compiled from: ICustomTabsService */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService */
    public static abstract class a extends Binder implements b {
        public static final /* synthetic */ int a = 0;

        /* renamed from: g0.a.a.b$a$a  reason: collision with other inner class name */
        /* compiled from: ICustomTabsService */
        public static class C0008a implements b {
            public IBinder a;

            public C0008a(IBinder iBinder) {
                this.a = iBinder;
            }

            public boolean E(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean K(a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder((a.C0007a) aVar);
                    boolean z = false;
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }
    }

    boolean E(long j) throws RemoteException;

    boolean K(a aVar) throws RemoteException;
}
