package okhttp3;

import i0.j.f.p.h;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;
import q0.j;

/* compiled from: Handshake.kt */
public final class Handshake {
    public final c a;
    public final TlsVersion b;
    public final j c;
    public final List<Certificate> d;

    public Handshake(TlsVersion tlsVersion, j jVar, List<? extends Certificate> list, a<? extends List<? extends Certificate>> aVar) {
        i.e(tlsVersion, "tlsVersion");
        i.e(jVar, "cipherSuite");
        i.e(list, "localCertificates");
        i.e(aVar, "peerCertificatesFn");
        this.b = tlsVersion;
        this.c = jVar;
        this.d = list;
        this.a = h.H2(new Handshake$peerCertificates$2(aVar));
    }

    public static final Handshake a(SSLSession sSLSession) throws IOException {
        List list;
        List list2;
        i.e(sSLSession, "$this$handshake");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(i0.d.a.a.a.n0("cipherSuite == ", cipherSuite));
            }
            j b2 = j.s.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            } else if (!i.a("NONE", protocol)) {
                TlsVersion a2 = TlsVersion.Companion.a(protocol);
                try {
                    Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                    if (peerCertificates != null) {
                        list = q0.h0.c.l((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length));
                    } else {
                        list = EmptyList.c;
                    }
                } catch (SSLPeerUnverifiedException unused) {
                    list = EmptyList.c;
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = q0.h0.c.l((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
                } else {
                    list2 = EmptyList.c;
                }
                return new Handshake(a2, b2, list2, new Handshake$Companion$handshake$1(list));
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        i.d(type, "type");
        return type;
    }

    public final List<Certificate> c() {
        return (List) this.a.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.b == this.b && i.a(handshake.c, this.c) && i.a(handshake.c(), c()) && i.a(handshake.d, this.d);
        }
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = c().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        List<Certificate> c2 = c();
        ArrayList arrayList = new ArrayList(h.K(c2, 10));
        for (Certificate b2 : c2) {
            arrayList.add(b(b2));
        }
        String obj = arrayList.toString();
        StringBuilder S0 = i0.d.a.a.a.S0("Handshake{", "tlsVersion=");
        S0.append(this.b);
        S0.append(' ');
        S0.append("cipherSuite=");
        S0.append(this.c);
        S0.append(' ');
        S0.append("peerCertificates=");
        S0.append(obj);
        S0.append(' ');
        S0.append("localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(h.K(list, 10));
        for (Certificate b3 : list) {
            arrayList2.add(b(b3));
        }
        S0.append(arrayList2);
        S0.append('}');
        return S0.toString();
    }
}
