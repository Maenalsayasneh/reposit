package q0.h0.h;

import com.instabug.library.networkv2.request.Header;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;
import q0.b0;
import q0.d0;
import q0.e0;
import q0.f0;
import q0.h0.c;
import q0.n;
import q0.p;
import q0.v;
import q0.x;
import q0.y;
import r0.m;

/* compiled from: BridgeInterceptor.kt */
public final class a implements x {
    public final p a;

    public a(p pVar) {
        i.e(pVar, "cookieJar");
        this.a = pVar;
    }

    public e0 intercept(x.a aVar) throws IOException {
        boolean z;
        f0 f0Var;
        x.a aVar2 = aVar;
        i.e(aVar2, "chain");
        g gVar = (g) aVar2;
        b0 b0Var = gVar.f;
        Objects.requireNonNull(b0Var);
        b0.a aVar3 = new b0.a(b0Var);
        d0 d0Var = b0Var.e;
        if (d0Var != null) {
            y b = d0Var.b();
            if (b != null) {
                aVar3.c(Header.CONTENT_TYPE, b.d);
            }
            long a2 = d0Var.a();
            if (a2 != -1) {
                aVar3.c("Content-Length", String.valueOf(a2));
                aVar3.f("Transfer-Encoding");
            } else {
                aVar3.c("Transfer-Encoding", "chunked");
                aVar3.f("Content-Length");
            }
        }
        int i = 0;
        if (b0Var.b("Host") == null) {
            aVar3.c("Host", c.w(b0Var.b, false));
        }
        if (b0Var.b(Header.CONNECTION) == null) {
            aVar3.c(Header.CONNECTION, "Keep-Alive");
        }
        if (b0Var.b("Accept-Encoding") == null && b0Var.b("Range") == null) {
            aVar3.c("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<n> b2 = this.a.b(b0Var.b);
        if (!b2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (T next : b2) {
                int i2 = i + 1;
                if (i >= 0) {
                    n nVar = (n) next;
                    if (i > 0) {
                        sb.append("; ");
                    }
                    sb.append(nVar.f);
                    sb.append('=');
                    sb.append(nVar.g);
                    i = i2;
                } else {
                    g.r0();
                    throw null;
                }
            }
            String sb2 = sb.toString();
            i.d(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar3.c("Cookie", sb2);
        }
        if (b0Var.b("User-Agent") == null) {
            aVar3.c("User-Agent", "okhttp/4.9.1");
        }
        e0 a3 = gVar.a(aVar3.b());
        e.d(this.a, b0Var.b, a3.Z1);
        e0.a aVar4 = new e0.a(a3);
        aVar4.g(b0Var);
        if (z && StringsKt__IndentKt.f("gzip", e0.b(a3, Header.CONTENT_ENCODING, (String) null, 2), true) && e.a(a3) && (f0Var = a3.a2) != null) {
            m mVar = new m(f0Var.source());
            v.a j = a3.Z1.j();
            j.f(Header.CONTENT_ENCODING);
            j.f("Content-Length");
            aVar4.d(j.d());
            aVar4.g = new h(e0.b(a3, Header.CONTENT_TYPE, (String) null, 2), -1, m0.r.t.a.r.m.a1.a.c0(mVar));
        }
        return aVar4.a();
    }
}
