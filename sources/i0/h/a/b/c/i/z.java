package i0.h.a.b.c.i;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import h0.b0.v;
import i0.h.a.b.c.g.d;
import i0.h.a.b.c.i.l;
import i0.h.a.b.m.h;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class z implements d.a {
    public final /* synthetic */ d a;
    public final /* synthetic */ h b;
    public final /* synthetic */ l.a c;

    public z(d dVar, h hVar, l.a aVar, l.b bVar) {
        this.a = dVar;
        this.b = hVar;
        this.c = aVar;
    }

    public final void a(Status status) {
        if (status.I0()) {
            d dVar = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) dVar;
            Objects.requireNonNull(basePendingResult);
            v.C(!basePendingResult.i, "Result has already been consumed.");
            v.C(true, "Cannot await if then() has been called.");
            try {
                if (!basePendingResult.d.await(0, timeUnit)) {
                    basePendingResult.c(Status.x);
                }
            } catch (InterruptedException unused) {
                basePendingResult.c(Status.d);
            }
            v.C(basePendingResult.d(), "Result is not ready.");
            i0.h.a.b.c.g.h h = basePendingResult.h();
            h hVar = this.b;
            hVar.a.q(this.c.a(h));
            return;
        }
        h hVar2 = this.b;
        hVar2.a.p(v.i0(status));
    }
}
