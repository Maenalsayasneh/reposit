package i0.h.a.b.e;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i0.h.a.b.d.b;
import i0.h.a.b.g.e.b;
import i0.h.a.b.g.e.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class e extends b implements f {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final i0.h.a.b.d.b A(i0.h.a.b.d.b bVar, String str, int i) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(i);
        Parcel d0 = d0(2, L);
        i0.h.a.b.d.b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }

    public final int H(i0.h.a.b.d.b bVar, String str, boolean z) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(z ? 1 : 0);
        Parcel d0 = d0(5, L);
        int readInt = d0.readInt();
        d0.recycle();
        return readInt;
    }

    public final int M(i0.h.a.b.d.b bVar, String str, boolean z) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(z ? 1 : 0);
        Parcel d0 = d0(3, L);
        int readInt = d0.readInt();
        d0.recycle();
        return readInt;
    }

    public final i0.h.a.b.d.b P(i0.h.a.b.d.b bVar, String str, int i) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(i);
        Parcel d0 = d0(4, L);
        i0.h.a.b.d.b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }

    public final i0.h.a.b.d.b X(i0.h.a.b.d.b bVar, String str, boolean z, long j) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(z ? 1 : 0);
        L.writeLong(j);
        Parcel d0 = d0(7, L);
        i0.h.a.b.d.b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }

    public final int d() throws RemoteException {
        Parcel d0 = d0(6, L());
        int readInt = d0.readInt();
        d0.recycle();
        return readInt;
    }

    public final i0.h.a.b.d.b j(i0.h.a.b.d.b bVar, String str, int i, i0.h.a.b.d.b bVar2) throws RemoteException {
        Parcel L = L();
        c.b(L, bVar);
        L.writeString(str);
        L.writeInt(i);
        c.b(L, bVar2);
        Parcel d0 = d0(8, L);
        i0.h.a.b.d.b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }
}
