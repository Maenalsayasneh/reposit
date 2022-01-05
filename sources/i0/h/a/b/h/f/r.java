package i0.h.a.b.h.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import i0.h.a.b.d.b;
import i0.h.a.b.g.g.a;
import i0.h.a.b.g.g.c;

public final class r extends a implements c {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    public final void a0(f fVar) throws RemoteException {
        Parcel L = L();
        c.a(L, fVar);
        j0(12, L);
    }

    public final void b() throws RemoteException {
        j0(5, L());
    }

    public final void c() throws RemoteException {
        j0(6, L());
    }

    public final void e(Bundle bundle) throws RemoteException {
        Parcel L = L();
        c.b(L, bundle);
        Parcel d0 = d0(10, L);
        if (d0.readInt() != 0) {
            bundle.readFromParcel(d0);
        }
        d0.recycle();
    }

    public final void f() throws RemoteException {
        j0(8, L());
    }

    public final void g() throws RemoteException {
        j0(7, L());
    }

    public final void i(Bundle bundle) throws RemoteException {
        Parcel L = L();
        c.b(L, bundle);
        j0(3, L);
    }

    public final b k(b bVar, b bVar2, Bundle bundle) throws RemoteException {
        Parcel L = L();
        c.a(L, bVar);
        c.a(L, bVar2);
        c.b(L, bundle);
        Parcel d0 = d0(4, L);
        b d02 = b.a.d0(d0.readStrongBinder());
        d0.recycle();
        return d02;
    }

    public final void onLowMemory() throws RemoteException {
        j0(9, L());
    }

    public final void onStart() throws RemoteException {
        j0(15, L());
    }

    public final void onStop() throws RemoteException {
        j0(16, L());
    }

    public final void z(b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel L = L();
        c.a(L, bVar);
        c.b(L, googleMapOptions);
        c.b(L, bundle);
        j0(2, L);
    }
}
