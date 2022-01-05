package org.bouncycastle.jce.provider;

import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import s0.a.a.b3.c;
import s0.a.a.b3.d;
import s0.a.c.l.a;
import s0.a.h.h;

public class PrincipalUtils {
    public static c getCA(TrustAnchor trustAnchor) {
        return getX500Name(notNull(trustAnchor).getCA());
    }

    private static byte[] getEncoded(X500Principal x500Principal) {
        return notNull(notNull(x500Principal).getEncoded());
    }

    public static c getEncodedIssuerPrincipal(Object obj) {
        return obj instanceof X509Certificate ? getIssuerPrincipal((X509Certificate) obj) : getX500Name((X500Principal) ((h) obj).c().b()[0]);
    }

    public static c getIssuerPrincipal(X509CRL x509crl) {
        return getX500Name(notNull(x509crl).getIssuerX500Principal());
    }

    public static c getIssuerPrincipal(X509Certificate x509Certificate) {
        return x509Certificate instanceof a ? notNull(((a) x509Certificate).getIssuerX500Name()) : getX500Name(notNull(x509Certificate).getIssuerX500Principal());
    }

    public static c getSubjectPrincipal(X509Certificate x509Certificate) {
        return x509Certificate instanceof a ? notNull(((a) x509Certificate).getSubjectX500Name()) : getX500Name(notNull(x509Certificate).getSubjectX500Principal());
    }

    public static c getX500Name(X500Principal x500Principal) {
        return notNull(c.s(getEncoded(x500Principal)));
    }

    public static c getX500Name(d dVar, X500Principal x500Principal) {
        return notNull(c.t(dVar, getEncoded(x500Principal)));
    }

    private static TrustAnchor notNull(TrustAnchor trustAnchor) {
        if (trustAnchor != null) {
            return trustAnchor;
        }
        throw new IllegalStateException();
    }

    private static X509CRL notNull(X509CRL x509crl) {
        if (x509crl != null) {
            return x509crl;
        }
        throw new IllegalStateException();
    }

    private static X509Certificate notNull(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            return x509Certificate;
        }
        throw new IllegalStateException();
    }

    private static X500Principal notNull(X500Principal x500Principal) {
        if (x500Principal != null) {
            return x500Principal;
        }
        throw new IllegalStateException();
    }

    private static c notNull(c cVar) {
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    private static byte[] notNull(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        throw new IllegalStateException();
    }
}
