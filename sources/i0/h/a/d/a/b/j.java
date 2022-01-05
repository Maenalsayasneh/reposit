package i0.h.a.d.a.b;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import i0.h.a.d.a.j.m;

public final class j extends i<ParcelFileDescriptor> {
    public j(n nVar, m<ParcelFileDescriptor> mVar) {
        super(nVar, mVar);
    }

    public final void Y(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.b.e.b();
        n.a.b(4, "onGetChunkFileDescriptor", new Object[0]);
        this.a.b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
