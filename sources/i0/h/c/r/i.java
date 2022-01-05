package i0.h.c.r;

import i0.d.a.a.a;
import i0.h.a.b.m.h;
import i0.h.c.r.a;
import i0.h.c.r.p.c;
import java.util.Objects;

/* compiled from: GetAuthTokenListener */
public class i implements m {
    public final n a;
    public final h<k> b;

    public i(n nVar, h<k> hVar) {
        this.a = nVar;
        this.b = hVar;
    }

    public boolean a(Exception exc) {
        this.b.a(exc);
        return true;
    }

    public boolean b(c cVar) {
        if (!cVar.j() || this.a.d(cVar)) {
            return false;
        }
        h<k> hVar = this.b;
        String a2 = cVar.a();
        Objects.requireNonNull(a2, "Null token");
        Long valueOf = Long.valueOf(cVar.b());
        Long valueOf2 = Long.valueOf(cVar.g());
        String str = "";
        if (valueOf == null) {
            str = a.n0(str, " tokenExpirationTimestamp");
        }
        if (valueOf2 == null) {
            str = a.n0(str, " tokenCreationTimestamp");
        }
        if (str.isEmpty()) {
            hVar.a.q(new a(a2, valueOf.longValue(), valueOf2.longValue(), (a.C0149a) null));
            return true;
        }
        throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
    }
}
