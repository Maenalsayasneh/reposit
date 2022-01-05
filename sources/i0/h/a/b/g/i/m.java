package i0.h.a.b.g.i;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;

public final class m extends d<g> {
    public final Context A;

    public m(Context context, Looper looper, c cVar, c.a aVar, c.b bVar) {
        super(context, looper, 45, cVar, aVar, bVar);
        this.A = context;
    }

    public final int j() {
        return 12200000;
    }

    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new h(iBinder);
    }

    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
