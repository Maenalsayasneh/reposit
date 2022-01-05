package i0.h.a.b.c.i.n;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zaaa;
import i0.h.a.b.g.c.b;
import i0.h.a.b.g.c.c;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class a extends b implements b {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void c0(zaaa zaaa) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = c.a;
        if (zaaa == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            zaaa.writeToParcel(obtain, 0);
        }
        try {
            this.a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
