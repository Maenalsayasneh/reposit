package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;
import s0.a.a.c3.n;
import s0.a.a.e;
import s0.a.a.j;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.w;
import s0.a.a.z;
import s0.a.h.p;

public class X509CertParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("CERTIFICATE");
    private InputStream currentStream = null;
    private v sData = null;
    private int sDataObjectCount = 0;

    private Certificate getCertificate() throws CertificateParsingException {
        e eVar;
        if (this.sData == null) {
            return null;
        }
        do {
            int i = this.sDataObjectCount;
            e[] eVarArr = this.sData.c;
            if (i >= eVarArr.length) {
                return null;
            }
            this.sDataObjectCount = i + 1;
            eVar = eVarArr[i];
        } while (!(eVar instanceof s));
        return new X509CertificateObject(n.s(eVar));
    }

    private Certificate readDERCertificate(InputStream inputStream) throws IOException, CertificateParsingException {
        s sVar = (s) new j(inputStream).i();
        if (sVar.size() <= 1 || !(sVar.D(0) instanceof s0.a.a.n) || !sVar.D(0).equals(s0.a.a.w2.n.e0)) {
            return new X509CertificateObject(n.s(sVar));
        }
        this.sData = new w(s.C((z) sVar.D(1), true)).x;
        return getCertificate();
    }

    private Certificate readPEMCertificate(InputStream inputStream) throws IOException, CertificateParsingException {
        s readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new X509CertificateObject(n.s(readPEMObject));
        }
        return null;
    }

    public void engineInit(InputStream inputStream) {
        this.currentStream = inputStream;
        this.sData = null;
        this.sDataObjectCount = 0;
        if (!inputStream.markSupported()) {
            this.currentStream = new BufferedInputStream(this.currentStream);
        }
    }

    public Object engineRead() throws StreamParsingException {
        try {
            v vVar = this.sData;
            if (vVar == null) {
                this.currentStream.mark(10);
                int read = this.currentStream.read();
                if (read == -1) {
                    return null;
                }
                if (read != 48) {
                    this.currentStream.reset();
                    return readPEMCertificate(this.currentStream);
                }
                this.currentStream.reset();
                return readDERCertificate(this.currentStream);
            } else if (this.sDataObjectCount != vVar.c.length) {
                return getCertificate();
            } else {
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
        } catch (Exception e) {
            throw new StreamParsingException(e.toString(), e);
        }
    }

    public Collection engineReadAll() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificate = (Certificate) engineRead();
            if (certificate == null) {
                return arrayList;
            }
            arrayList.add(certificate);
        }
    }
}
