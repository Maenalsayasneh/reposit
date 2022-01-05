package h0.w;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import h0.w.c;

/* compiled from: IMultiInstanceInvalidationService */
public abstract class d extends Binder implements IInterface {
    public d() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int d0 = ((MultiInstanceInvalidationService.b) this).d0(c.a.L(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(d0);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).j0(c.a.L(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).L(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
