package g0.a.b.a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel */
public interface a extends IInterface {

    /* renamed from: g0.a.b.a.a$a  reason: collision with other inner class name */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0009a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: g0.a.b.a.a$a$a  reason: collision with other inner class name */
        /* compiled from: INotificationSideChannel */
        public static class C0010a implements a {
            public IBinder a;

            public C0010a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void i0(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, (Parcel) null, 1)) {
                        int i2 = C0009a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    void i0(String str, int i, String str2, Notification notification) throws RemoteException;
}
