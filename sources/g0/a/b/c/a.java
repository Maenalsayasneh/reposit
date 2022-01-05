package g0.a.b.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import java.util.Objects;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: g0.a.b.c.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static abstract class C0011a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: g0.a.b.c.a$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        public static class C0012a implements a {
            public IBinder a;

            public C0012a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public C0011a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                ResultReceiver.b bVar = (ResultReceiver.b) this;
                Objects.requireNonNull(ResultReceiver.this);
                ResultReceiver.this.a(readInt, bundle);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }
}
