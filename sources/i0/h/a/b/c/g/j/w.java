package i0.h.a.b.c.g.j;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.c.i.g;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class w implements Runnable {
    public final /* synthetic */ ConnectionResult c;
    public final /* synthetic */ f.c d;

    public w(f.c cVar, ConnectionResult connectionResult) {
        this.d = cVar;
        this.c = connectionResult;
    }

    public final void run() {
        g gVar;
        f.c cVar = this.d;
        f.a aVar = f.this.n.get(cVar.b);
        if (aVar != null) {
            if (this.c.I0()) {
                f.c cVar2 = this.d;
                cVar2.e = true;
                if (cVar2.a.n()) {
                    f.c cVar3 = this.d;
                    if (cVar3.e && (gVar = cVar3.c) != null) {
                        cVar3.a.b(gVar, cVar3.d);
                        return;
                    }
                    return;
                }
                try {
                    a.f fVar = this.d.a;
                    fVar.b((g) null, fVar.a());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.d.a.c("Failed to get service from broker.");
                    aVar.d(new ConnectionResult(10), (Exception) null);
                }
            } else {
                aVar.d(this.c, (Exception) null);
            }
        }
    }
}
