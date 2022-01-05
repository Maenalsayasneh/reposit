package s0.a.c;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import s0.a.g.h;

public class i<T extends Certificate> implements h<T> {
    public final CertSelector c;

    public static class b extends X509CertSelector {
        public final i c;

        public b(i iVar) {
            this.c = iVar;
            CertSelector certSelector = iVar.c;
            if (certSelector instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e) {
                    throw new IllegalStateException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("base selector invalid: ")), e);
                }
            }
        }

        public boolean match(Certificate certificate) {
            i iVar = this.c;
            if (iVar == null) {
                return certificate != null;
            }
            return iVar.c.match(certificate);
        }
    }

    public i(CertSelector certSelector) {
        this.c = certSelector;
    }

    public i(CertSelector certSelector, a aVar) {
        this.c = certSelector;
    }

    public Object clone() {
        return new i(this.c);
    }

    /* renamed from: match */
    public boolean r0(Certificate certificate) {
        return this.c.match(certificate);
    }
}
