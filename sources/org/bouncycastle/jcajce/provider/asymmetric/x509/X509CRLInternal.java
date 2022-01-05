package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;
import s0.a.a.c3.o;
import s0.a.c.o.c;

public class X509CRLInternal extends X509CRLImpl {
    private final byte[] encoding;

    public X509CRLInternal(c cVar, o oVar, String str, byte[] bArr, boolean z, byte[] bArr2) {
        super(cVar, oVar, str, bArr, z);
        this.encoding = bArr2;
    }

    public byte[] getEncoded() throws CRLException {
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
