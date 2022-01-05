package i0.h.a.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;
import i0.h.c.m.c;
import i0.h.c.m.e;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class d implements i0.h.c.m.d<ClientInfo> {
    public static final d a = new d();
    public static final c b = c.a("clientType");
    public static final c c = c.a("androidClientInfo");

    public void a(Object obj, Object obj2) throws IOException {
        ClientInfo clientInfo = (ClientInfo) obj;
        e eVar = (e) obj2;
        eVar.f(b, clientInfo.b());
        eVar.f(c, clientInfo.a());
    }
}
