package org.bouncycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import s0.a.b.n;
import s0.a.b.z;

public class BCMessageDigest extends MessageDigest {
    public n digest;
    public int digestSize;

    public BCMessageDigest(n nVar) {
        super(nVar.getAlgorithmName());
        this.digest = nVar;
        this.digestSize = nVar.getDigestSize();
    }

    public BCMessageDigest(z zVar, int i) {
        super(zVar.getAlgorithmName());
        this.digest = zVar;
        this.digestSize = i / 8;
    }

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    public int engineGetDigestLength() {
        return this.digestSize;
    }

    public void engineReset() {
        this.digest.reset();
    }

    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
