package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import q0.h;
import q0.h0.n.c;

/* compiled from: CertificatePinner.kt */
public final class CertificatePinner$check$1 extends Lambda implements a<List<? extends X509Certificate>> {
    public final /* synthetic */ h c;
    public final /* synthetic */ List d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(h hVar, List list, String str) {
        super(0);
        this.c = hVar;
        this.d = list;
        this.q = str;
    }

    public Object invoke() {
        List<Certificate> list;
        c cVar = this.c.d;
        if (cVar == null || (list = cVar.a(this.d, this.q)) == null) {
            list = this.d;
        }
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
