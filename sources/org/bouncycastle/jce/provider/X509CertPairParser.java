package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;
import s0.a.a.j;
import s0.a.a.s;
import s0.a.h.l;
import s0.a.h.p;

public class X509CertPairParser extends p {
    private InputStream currentStream = null;

    private l readDERCrossCertificatePair(InputStream inputStream) throws IOException, CertificateParsingException {
        s sVar = (s) new j(inputStream).i();
        return new l((sVar == null || (sVar instanceof s0.a.a.c3.p)) ? (s0.a.a.c3.p) sVar : new s0.a.a.c3.p(sVar));
    }

    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        if (!inputStream.markSupported()) {
            this.currentStream = new BufferedInputStream(this.currentStream);
        }
    }

    public Object engineRead() throws StreamParsingException {
        try {
            this.currentStream.mark(10);
            if (this.currentStream.read() == -1) {
                return null;
            }
            this.currentStream.reset();
            return readDERCrossCertificatePair(this.currentStream);
        } catch (Exception e) {
            throw new StreamParsingException(e.toString(), e);
        }
    }

    public Collection engineReadAll() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            l lVar = (l) engineRead();
            if (lVar == null) {
                return arrayList;
            }
            arrayList.add(lVar);
        }
    }
}
