package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;
import s0.a.a.c3.o;
import s0.a.a.j;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.w;
import s0.a.a.z;
import s0.a.h.p;

public class X509CRLParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("CRL");
    private InputStream currentStream = null;
    private v sData = null;
    private int sDataObjectCount = 0;

    private CRL getCRL() throws CRLException {
        v vVar = this.sData;
        if (vVar == null || this.sDataObjectCount >= vVar.c.length) {
            return null;
        }
        v vVar2 = this.sData;
        int i = this.sDataObjectCount;
        this.sDataObjectCount = i + 1;
        return new X509CRLObject(o.s(vVar2.c[i]));
    }

    private CRL readDERCRL(InputStream inputStream) throws IOException, CRLException {
        s sVar = (s) new j(inputStream).i();
        if (sVar.size() <= 1 || !(sVar.D(0) instanceof n) || !sVar.D(0).equals(s0.a.a.w2.n.e0)) {
            return new X509CRLObject(o.s(sVar));
        }
        this.sData = new w(s.C((z) sVar.D(1), true)).y;
        return getCRL();
    }

    private CRL readPEMCRL(InputStream inputStream) throws IOException, CRLException {
        s readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new X509CRLObject(o.s(readPEMObject));
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
                    return readPEMCRL(this.currentStream);
                }
                this.currentStream.reset();
                return readDERCRL(this.currentStream);
            } else if (this.sDataObjectCount != vVar.c.length) {
                return getCRL();
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
            CRL crl = (CRL) engineRead();
            if (crl == null) {
                return arrayList;
            }
            arrayList.add(crl);
        }
    }
}
