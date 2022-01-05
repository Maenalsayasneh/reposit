package i0.h.a.a.h.e;

import i0.h.c.m.c;
import i0.h.c.m.d;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class e implements d<p> {
    public static final e a = new e();
    public static final c b = c.a("eventTimeMs");
    public static final c c = c.a("eventCode");
    public static final c d = c.a("eventUptimeMs");
    public static final c e = c.a("sourceExtension");
    public static final c f = c.a("sourceExtensionJsonProto3");
    public static final c g = c.a("timezoneOffsetSeconds");
    public static final c h = c.a("networkConnectionInfo");

    public void a(Object obj, Object obj2) throws IOException {
        p pVar = (p) obj;
        i0.h.c.m.e eVar = (i0.h.c.m.e) obj2;
        eVar.a(b, pVar.b());
        eVar.f(c, pVar.a());
        eVar.a(d, pVar.c());
        eVar.f(e, pVar.e());
        eVar.f(f, pVar.f());
        eVar.a(g, pVar.g());
        eVar.f(h, pVar.d());
    }
}
