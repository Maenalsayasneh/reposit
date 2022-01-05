package okhttp3.internal.connection;

import i0.j.f.p.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import okhttp3.Handshake;
import q0.h0.g.g;

/* compiled from: RealConnection.kt */
public final class RealConnection$connectTls$2 extends Lambda implements a<List<? extends X509Certificate>> {
    public final /* synthetic */ g c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(g gVar) {
        super(0);
        this.c = gVar;
    }

    public Object invoke() {
        Handshake handshake = this.c.d;
        i.c(handshake);
        List<Certificate> c2 = handshake.c();
        ArrayList arrayList = new ArrayList(h.K(c2, 10));
        for (Certificate certificate : c2) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
