package i0.h.a.a.h.e;

import com.instabug.library.model.State;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import i0.h.c.m.c;
import i0.h.c.m.d;
import i0.h.c.m.e;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class b implements d<a> {
    public static final b a = new b();
    public static final c b = c.a("sdkVersion");
    public static final c c = c.a("model");
    public static final c d = c.a("hardware");
    public static final c e = c.a("device");
    public static final c f = c.a("product");
    public static final c g = c.a("osBuild");
    public static final c h = c.a("manufacturer");
    public static final c i = c.a("fingerprint");
    public static final c j = c.a(State.KEY_LOCALE);
    public static final c k = c.a(AccountRangeJsonParser.FIELD_COUNTRY);
    public static final c l = c.a("mccMnc");
    public static final c m = c.a("applicationBuild");

    public void a(Object obj, Object obj2) throws IOException {
        a aVar = (a) obj;
        e eVar = (e) obj2;
        eVar.f(b, aVar.l());
        eVar.f(c, aVar.i());
        eVar.f(d, aVar.e());
        eVar.f(e, aVar.c());
        eVar.f(f, aVar.k());
        eVar.f(g, aVar.j());
        eVar.f(h, aVar.g());
        eVar.f(i, aVar.d());
        eVar.f(j, aVar.f());
        eVar.f(k, aVar.b());
        eVar.f(l, aVar.h());
        eVar.f(m, aVar.a());
    }
}
