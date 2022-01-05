package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateEncodingException;
import s0.a.a.c3.j;
import s0.a.a.c3.n;
import s0.a.c.o.c;

public class X509CertificateInternal extends X509CertificateImpl {
    private final byte[] encoding;

    public X509CertificateInternal(c cVar, n nVar, j jVar, boolean[] zArr, String str, byte[] bArr, byte[] bArr2) {
        super(cVar, nVar, jVar, zArr, str, bArr);
        this.encoding = bArr2;
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
