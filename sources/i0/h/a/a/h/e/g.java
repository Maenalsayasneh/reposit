package i0.h.a.a.h.e;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import i0.h.c.m.c;
import i0.h.c.m.d;
import i0.h.c.m.e;
import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class g implements d<NetworkConnectionInfo> {
    public static final g a = new g();
    public static final c b = c.a("networkType");
    public static final c c = c.a("mobileSubtype");

    public void a(Object obj, Object obj2) throws IOException {
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        e eVar = (e) obj2;
        eVar.f(b, networkConnectionInfo.b());
        eVar.f(c, networkConnectionInfo.a());
    }
}
