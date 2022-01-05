package i0.h.a.b.e;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i0.h.a.b.d.b;
import i0.h.a.b.g.e.b;
import i0.h.a.b.g.e.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class g extends b implements h {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final i0.h.a.b.d.b j(i0.h.a.b.d.b bVar, String str, int i, i0.h.a.b.d.b bVar2) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(i);
        c.b(L, bVar2);
        Parcel d0 = d0(2, L);
        i0.h.a.b.d.b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }

    public final i0.h.a.b.d.b p(i0.h.a.b.d.b bVar, String str, int i, i0.h.a.b.d.b bVar2) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(i);
        c.b(L, bVar2);
        Parcel d0 = d0(3, L);
        i0.h.a.b.d.b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }
}
