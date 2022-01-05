package q0;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import m0.n.b.i;

/* compiled from: Dns.kt */
public final class r implements s {
    public List<InetAddress> a(String str) {
        i.e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            i.d(allByName, "InetAddress.getAllByName(hostname)");
            return h.l4(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(a.n0("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
