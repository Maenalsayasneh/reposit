package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.util.Collection;
import java.util.Objects;
import s0.a.d.a;

public class MultiCertStoreSpi extends CertStoreSpi {
    private a params;

    public MultiCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof a) {
            this.params = (a) certStoreParameters;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("org.bouncycastle.jce.provider.MultiCertStoreSpi: parameter must be a MultiCertStoreParameters object\n");
        P0.append(certStoreParameters.toString());
        throw new InvalidAlgorithmParameterException(P0.toString());
    }

    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        Objects.requireNonNull(this.params);
        Objects.requireNonNull(this.params);
        throw null;
    }

    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        Objects.requireNonNull(this.params);
        Objects.requireNonNull(this.params);
        throw null;
    }
}
