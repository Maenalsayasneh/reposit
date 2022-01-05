package j0.a.a.c.b;

import android.app.Application;
import android.os.Bundle;
import h0.q.g0;
import h0.q.m0;
import j0.a.a.c.a.e;
import java.util.Set;

/* compiled from: DefaultViewModelFactories */
public final class c {
    public final Application a;
    public final Set<String> b;
    public final e c;

    public c(Application application, Set<String> set, e eVar) {
        this.a = application;
        this.b = set;
        this.c = eVar;
    }

    public final m0.b a(h0.x.c cVar, Bundle bundle, m0.b bVar) {
        if (bVar == null) {
            bVar = new g0(this.a, cVar, bundle);
        }
        return new d(cVar, bundle, this.b, bVar, this.c);
    }
}
