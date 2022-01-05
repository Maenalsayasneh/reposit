package i0.h.a.a.h.e;

import i0.h.c.m.c;
import i0.h.c.m.d;
import i0.h.c.m.e;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class f implements d<q> {
    public static final f a = new f();
    public static final c b = c.a("requestTimeMs");
    public static final c c = c.a("requestUptimeMs");
    public static final c d = c.a("clientInfo");
    public static final c e = c.a("logSource");
    public static final c f = c.a("logSourceName");
    public static final c g = c.a("logEvent");
    public static final c h = c.a("qosTier");

    public void a(Object obj, Object obj2) throws IOException {
        q qVar = (q) obj;
        e eVar = (e) obj2;
        eVar.a(b, qVar.f());
        eVar.a(c, qVar.g());
        eVar.f(d, qVar.a());
        eVar.f(e, qVar.c());
        eVar.f(f, qVar.d());
        eVar.f(g, qVar.b());
        eVar.f(h, qVar.e());
    }
}
