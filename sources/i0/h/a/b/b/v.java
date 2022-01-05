package i0.h.a.b.b;

import android.os.Bundle;
import i0.h.a.b.m.a;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.c0;
import i0.h.a.b.m.f;
import i0.h.a.b.m.g;
import i0.h.a.b.m.x;
import i0.h.a.b.m.y;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class v implements a {
    public final b a;
    public final Bundle b;

    public v(b bVar, Bundle bundle) {
        this.a = bVar;
        this.b = bundle;
    }

    public final Object a(g gVar) {
        b bVar = this.a;
        Bundle bundle = this.b;
        Objects.requireNonNull(bVar);
        if (!gVar.n()) {
            return gVar;
        }
        Bundle bundle2 = (Bundle) gVar.j();
        if (!(bundle2 != null && bundle2.containsKey("google.messenger"))) {
            return gVar;
        }
        g<Bundle> c = bVar.c(bundle);
        Executor executor = z.c;
        f fVar = w.a;
        b0 b0Var = (b0) c;
        Objects.requireNonNull(b0Var);
        b0 b0Var2 = new b0();
        y<TResult> yVar = b0Var.b;
        int i = c0.a;
        yVar.b(new x(executor, fVar, b0Var2));
        b0Var.t();
        return b0Var2;
    }
}
