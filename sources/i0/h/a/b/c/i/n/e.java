package i0.h.a.b.c.i.n;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import i0.h.a.b.c.g.j.k;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class e extends d<b> {
    public e(Context context, Looper looper, c cVar, i0.h.a.b.c.g.j.e eVar, k kVar) {
        super(context, looper, 270, cVar, eVar, kVar);
    }

    public final int j() {
        return 203390000;
    }

    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof b) {
            return (b) queryLocalInterface;
        }
        return new a(iBinder);
    }

    public final Feature[] r() {
        return i0.h.a.b.g.c.d.b;
    }

    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
}
