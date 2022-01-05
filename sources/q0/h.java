package q0;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.r;
import okio.ByteString;
import q0.h0.n.c;

/* compiled from: CertificatePinner.kt */
public final class h {
    public static final h a = new h(g.D0(new ArrayList()), (c) null, 2);
    public static final a b = new a((f) null);
    public final Set<b> c;
    public final c d;

    /* compiled from: CertificatePinner.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final String a(Certificate certificate) {
            i.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder P0 = i0.d.a.a.a.P0("sha256/");
                P0.append(b((X509Certificate) certificate).a());
                return P0.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final ByteString b(X509Certificate x509Certificate) {
            i.e(x509Certificate, "$this$sha256Hash");
            ByteString.a aVar = ByteString.d;
            PublicKey publicKey = x509Certificate.getPublicKey();
            i.d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            i.d(encoded, "publicKey.encoded");
            return ByteString.a.d(aVar, encoded, 0, 0, 3).b("SHA-256");
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class b {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            if (!i.a((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!i.a((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(i.a((Object) null, (Object) null) ^ true);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append('/');
            throw null;
        }
    }

    public h(Set set, c cVar, int i) {
        int i2 = i & 2;
        i.e(set, "pins");
        this.c = set;
        this.d = null;
    }

    public final void a(String str, m0.n.a.a<? extends List<? extends X509Certificate>> aVar) {
        i.e(str, "hostname");
        i.e(aVar, "cleanedPeerCertificatesFn");
        i.e(str, "hostname");
        Set<b> set = this.c;
        List<b> list = EmptyList.c;
        for (T next : set) {
            Objects.requireNonNull((b) next);
            i.e(str, "hostname");
            if (StringsKt__IndentKt.J((String) null, "**.", false, 2)) {
                throw null;
            } else if (StringsKt__IndentKt.J((String) null, "*.", false, 2)) {
                throw null;
            } else if (i.a(str, (Object) null)) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                if (!(list instanceof m0.n.b.s.a) || (list instanceof m0.n.b.s.c)) {
                    list.add(next);
                } else {
                    r.e(list, "kotlin.collections.MutableList");
                    throw null;
                }
            }
        }
        if (!list.isEmpty()) {
            List<X509Certificate> list2 = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list2) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Objects.requireNonNull((b) it.next());
                    throw null;
                }
            }
            StringBuilder S0 = i0.d.a.a.a.S0("Certificate pinning failure!", "\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list2) {
                S0.append("\n    ");
                S0.append(b.a(x509Certificate2));
                S0.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                i.d(subjectDN, "element.subjectDN");
                S0.append(subjectDN.getName());
            }
            S0.append("\n  Pinned certificates for ");
            S0.append(str);
            S0.append(":");
            for (b append : list) {
                S0.append("\n    ");
                S0.append(append);
            }
            String sb = S0.toString();
            i.d(sb, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb);
        }
    }

    public final h b(c cVar) {
        i.e(cVar, "certificateChainCleaner");
        if (i.a(this.d, cVar)) {
            return this;
        }
        return new h(this.c, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return i.a(hVar.c, this.c) && i.a(hVar.d, this.d);
        }
    }

    public int hashCode() {
        int I = i0.d.a.a.a.I(this.c, 1517, 41);
        c cVar = this.d;
        return I + (cVar != null ? cVar.hashCode() : 0);
    }

    public h(Set<b> set, c cVar) {
        i.e(set, "pins");
        this.c = set;
        this.d = cVar;
    }
}
