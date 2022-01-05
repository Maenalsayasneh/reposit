package i0.h.a.b.h.f;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import i0.h.a.b.d.b;

public interface c extends IInterface {
    void a0(f fVar) throws RemoteException;

    void b() throws RemoteException;

    void c() throws RemoteException;

    void e(Bundle bundle) throws RemoteException;

    void f() throws RemoteException;

    void g() throws RemoteException;

    void i(Bundle bundle) throws RemoteException;

    b k(b bVar, b bVar2, Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void z(b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException;
}
