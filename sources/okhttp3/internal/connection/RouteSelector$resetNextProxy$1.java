package okhttp3.internal.connection;

import i0.j.f.p.h;
import java.net.Proxy;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import q0.h0.c;
import q0.h0.g.j;
import q0.w;

/* compiled from: RouteSelector.kt */
public final class RouteSelector$resetNextProxy$1 extends Lambda implements a<List<? extends Proxy>> {
    public final /* synthetic */ j c;
    public final /* synthetic */ Proxy d;
    public final /* synthetic */ w q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSelector$resetNextProxy$1(j jVar, Proxy proxy, w wVar) {
        super(0);
        this.c = jVar;
        this.d = proxy;
        this.q = wVar;
    }

    /* renamed from: a */
    public final List<Proxy> invoke() {
        Proxy proxy = this.d;
        if (proxy != null) {
            return h.L2(proxy);
        }
        URI j = this.q.j();
        if (j.getHost() == null) {
            return c.l(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.c.e.k.select(j);
        if (!(select == null || select.isEmpty())) {
            return c.x(select);
        }
        return c.l(Proxy.NO_PROXY);
    }
}
