package i0.h.a.d.a.a;

import android.os.IBinder;
import android.os.IInterface;
import i0.h.a.d.a.e.h0;
import i0.h.a.d.a.e.i0;
import i0.h.a.d.a.e.j0;
import i0.h.a.d.a.e.l;

public final /* synthetic */ class k implements l {
    public static final l a = new k();

    public final Object a(IBinder iBinder) {
        int i = i0.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof j0 ? (j0) queryLocalInterface : new h0(iBinder);
    }
}
