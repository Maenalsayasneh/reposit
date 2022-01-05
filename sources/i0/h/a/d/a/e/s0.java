package i0.h.a.d.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class s0 extends e0 implements t0 {
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void I(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel L = L();
        int i = g0.a;
        L.writeInt(1);
        bundle.writeToParcel(L, 0);
        L.writeInt(1);
        bundle2.writeToParcel(L, 0);
        d0(2, L);
    }

    public final void J(Bundle bundle) throws RemoteException {
        Parcel L = L();
        int i = g0.a;
        L.writeInt(1);
        bundle.writeToParcel(L, 0);
        d0(4, L);
    }

    public final void Q(Bundle bundle) throws RemoteException {
        Parcel L = L();
        int i = g0.a;
        L.writeInt(1);
        bundle.writeToParcel(L, 0);
        d0(3, L);
    }
}
