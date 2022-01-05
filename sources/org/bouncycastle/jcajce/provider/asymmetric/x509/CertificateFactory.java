package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import s0.a.a.c3.n;
import s0.a.a.c3.o;
import s0.a.a.e;
import s0.a.a.j;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.w2.w;
import s0.a.a.z;
import s0.a.c.o.a;
import s0.a.c.o.c;

public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private static final PEMUtil PEM_PKCS7_PARSER = new PEMUtil("PKCS7");
    private final c bcHelper = new a();
    private InputStream currentCrlStream = null;
    private InputStream currentStream = null;
    private v sCrlData = null;
    private int sCrlDataObjectCount = 0;
    private v sData = null;
    private int sDataObjectCount = 0;

    public class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public ExCertificateException(Throwable th) {
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    private CRL getCRL() throws CRLException {
        v vVar = this.sCrlData;
        if (vVar == null) {
            return null;
        }
        int i = this.sCrlDataObjectCount;
        e[] eVarArr = vVar.c;
        if (i >= eVarArr.length) {
            return null;
        }
        this.sCrlDataObjectCount = i + 1;
        return createCRL(o.s(eVarArr[i]));
    }

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
        return new X509CertificateObject(this.bcHelper, n.s(eVar));
    }

    private CRL readDERCRL(j jVar) throws IOException, CRLException {
        return getCRL(s.B(jVar.i()));
    }

    private Certificate readDERCertificate(j jVar) throws IOException, CertificateParsingException {
        return getCertificate(s.B(jVar.i()));
    }

    private CRL readPEMCRL(InputStream inputStream) throws IOException, CRLException {
        return getCRL(PEM_CRL_PARSER.readPEMObject(inputStream));
    }

    private Certificate readPEMCertificate(InputStream inputStream) throws IOException, CertificateParsingException {
        return getCertificate(PEM_CERT_PARSER.readPEMObject(inputStream));
    }

    public CRL createCRL(o oVar) throws CRLException {
        return new X509CRLObject(this.bcHelper, oVar);
    }

    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        InputStream inputStream2 = this.currentCrlStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentCrlStream = inputStream;
            this.sCrlData = null;
            this.sCrlDataObjectCount = 0;
        }
        try {
            v vVar = this.sCrlData;
            if (vVar == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(s0.a.g.l.a.a(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? readPEMCRL(inputStream) : readDERCRL(new j(inputStream, true));
            } else if (this.sCrlDataObjectCount != vVar.c.length) {
                return getCRL();
            } else {
                this.sCrlData = null;
                this.sCrlDataObjectCount = 0;
                return null;
            }
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(engineGenerateCRL);
        }
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return new PKIXCertPath(inputStream, str);
    }

    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object next : list) {
            if (next != null && !(next instanceof X509Certificate)) {
                StringBuilder P0 = i0.d.a.a.a.P0("list contains non X509Certificate object while creating CertPath\n");
                P0.append(next.toString());
                throw new CertificateException(P0.toString());
            }
        }
        return new PKIXCertPath(list);
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        InputStream inputStream2 = this.currentStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentStream = inputStream;
            this.sData = null;
            this.sDataObjectCount = 0;
        }
        try {
            v vVar = this.sData;
            if (vVar == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(s0.a.g.l.a.a(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? readPEMCertificate(inputStream) : readDERCertificate(new j(inputStream));
            } else if (this.sDataObjectCount != vVar.c.length) {
                return getCertificate();
            } else {
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
        } catch (Exception e) {
            throw new ExCertificateException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("parsing issue: ")), e);
        }
    }

    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(engineGenerateCertificate);
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }

    private CRL getCRL(s sVar) throws CRLException {
        if (sVar == null) {
            return null;
        }
        if (sVar.size() <= 1 || !(sVar.D(0) instanceof s0.a.a.n) || !sVar.D(0).equals(s0.a.a.w2.n.e0)) {
            return createCRL(o.s(sVar));
        }
        this.sCrlData = w.s(s.C((z) sVar.D(1), true)).y;
        return getCRL();
    }

    private Certificate getCertificate(s sVar) throws CertificateParsingException {
        if (sVar == null) {
            return null;
        }
        if (sVar.size() <= 1 || !(sVar.D(0) instanceof s0.a.a.n) || !sVar.D(0).equals(s0.a.a.w2.n.e0)) {
            return new X509CertificateObject(this.bcHelper, n.s(sVar));
        }
        this.sData = w.s(s.C((z) sVar.D(1), true)).x;
        return getCertificate();
    }
}
