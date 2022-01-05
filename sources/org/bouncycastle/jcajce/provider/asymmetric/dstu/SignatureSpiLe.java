package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.security.SignatureException;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.x0;

public class SignatureSpiLe extends SignatureSpi {
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = o.B(super.engineSign()).c;
        reverseBytes(bArr);
        try {
            return new x0(bArr).getEncoded();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] bArr2 = ((o) r.x(bArr)).c;
            reverseBytes(bArr2);
            try {
                return super.engineVerify(new x0(bArr2).getEncoded());
            } catch (SignatureException e) {
                throw e;
            } catch (Exception e2) {
                throw new SignatureException(e2.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    public void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }
}
