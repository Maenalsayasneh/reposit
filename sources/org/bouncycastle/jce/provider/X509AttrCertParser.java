package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;
import s0.a.a.e;
import s0.a.a.j;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.w;
import s0.a.a.z;
import s0.a.h.h;
import s0.a.h.p;
import s0.a.h.q;

public class X509AttrCertParser extends p {
    private static final PEMUtil PEM_PARSER = new PEMUtil("ATTRIBUTE CERTIFICATE");
    private InputStream currentStream = null;
    private v sData = null;
    private int sDataObjectCount = 0;

    private h getCertificate() throws IOException {
        if (this.sData == null) {
            return null;
        }
        while (true) {
            int i = this.sDataObjectCount;
            e[] eVarArr = this.sData.c;
            if (i >= eVarArr.length) {
                return null;
            }
            this.sDataObjectCount = i + 1;
            e eVar = eVarArr[i];
            if (eVar instanceof z) {
                z zVar = (z) eVar;
                if (zVar.c == 2) {
                    return new q(s.C(zVar, false).getEncoded());
                }
            }
        }
    }

    private h readDERCertificate(InputStream inputStream) throws IOException {
        s B = s.B(new j(inputStream).i());
        if (B.size() <= 1 || !(B.D(0) instanceof n) || !B.D(0).equals(s0.a.a.w2.n.e0)) {
            return new q(B.getEncoded());
        }
        this.sData = new w(s.C((z) B.D(1), true)).x;
        return getCertificate();
    }

    private h readPEMCertificate(InputStream inputStream) throws IOException {
        s readPEMObject = PEM_PARSER.readPEMObject(inputStream);
        if (readPEMObject != null) {
            return new q(readPEMObject.getEncoded());
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
            h hVar = (h) engineRead();
            if (hVar == null) {
                return arrayList;
            }
            arrayList.add(hVar);
        }
    }
}
