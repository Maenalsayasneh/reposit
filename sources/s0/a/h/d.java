package s0.a.h;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s0.a.g.h;

public class d extends PKIXParameters {
    public Set Y1 = new HashSet();
    public Set Z1 = new HashSet();
    public Set a2 = new HashSet();
    public int b2 = 0;
    public List c = new ArrayList();
    public boolean c2 = false;
    public h d;
    public boolean q;
    public List x = new ArrayList();
    public Set y = new HashSet();

    public d(Set set) throws InvalidAlgorithmParameterException {
        super(set);
    }

    public void b(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof d) {
                d dVar = (d) pKIXParameters;
                this.b2 = dVar.b2;
                this.c2 = dVar.c2;
                this.q = dVar.q;
                h hVar = dVar.d;
                this.d = hVar == null ? null : (h) hVar.clone();
                this.c = new ArrayList(dVar.c);
                this.x = new ArrayList(dVar.x);
                this.y = new HashSet(dVar.y);
                this.Z1 = new HashSet(dVar.Z1);
                this.Y1 = new HashSet(dVar.Y1);
                this.a2 = new HashSet(dVar.a2);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Object clone() {
        try {
            d dVar = new d(getTrustAnchors());
            dVar.b(this);
            return dVar;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        if (certSelector != null) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            int i = k.c;
            k kVar = new k();
            kVar.setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            kVar.setBasicConstraints(x509CertSelector.getBasicConstraints());
            kVar.setCertificate(x509CertSelector.getCertificate());
            kVar.setCertificateValid(x509CertSelector.getCertificateValid());
            kVar.setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            try {
                kVar.setPathToNames(x509CertSelector.getPathToNames());
                kVar.setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                kVar.setNameConstraints(x509CertSelector.getNameConstraints());
                kVar.setPolicy(x509CertSelector.getPolicy());
                kVar.setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                kVar.setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                kVar.setIssuer(x509CertSelector.getIssuer());
                kVar.setKeyUsage(x509CertSelector.getKeyUsage());
                kVar.setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                kVar.setSerialNumber(x509CertSelector.getSerialNumber());
                kVar.setSubject(x509CertSelector.getSubject());
                kVar.setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                kVar.setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                this.d = kVar;
            } catch (IOException e) {
                throw new IllegalArgumentException("error in passed in selector: " + e);
            }
        } else {
            this.d = null;
        }
    }
}
