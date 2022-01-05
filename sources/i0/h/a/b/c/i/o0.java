package i0.h.a.b.c.i;

import android.os.Parcel;
import android.os.RemoteException;
import i0.h.a.b.c.r;
import i0.h.a.b.d.d;
import i0.h.a.b.g.e.a;
import i0.h.a.b.g.e.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public abstract class o0 extends a implements n0 {
    public o0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean L(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            d dVar = new d(((r) this).d0());
            parcel2.writeNoException();
            c.b(parcel2, dVar);
        } else if (i != 2) {
            return false;
        } else {
            int i3 = ((r) this).a;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }
}
