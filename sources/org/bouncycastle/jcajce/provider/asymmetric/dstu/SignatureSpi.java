package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import s0.a.a.c3.y0;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.w2.n;
import s0.a.a.x0;
import s0.a.b.i;
import s0.a.b.k;
import s0.a.b.n0.d;

public class SignatureSpi extends java.security.SignatureSpi implements n, y0 {
    private s0.a.b.n digest;
    private k signer = new d();

    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInitSign(java.security.PrivateKey r5) throws java.security.InvalidKeyException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey
            if (r0 == 0) goto L_0x0018
            s0.a.b.k0.b r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            s0.a.b.b0.d r0 = new s0.a.b.b0.d
            byte[] r1 = s0.a.a.a3.d.s()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>((byte[]) r1)
        L_0x0015:
            r4.digest = r0
            goto L_0x002f
        L_0x0018:
            boolean r0 = r5 instanceof s0.a.d.d.a
            if (r0 == 0) goto L_0x002e
            s0.a.b.k0.b r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            s0.a.b.b0.d r0 = new s0.a.b.b0.d
            byte[] r1 = s0.a.a.a3.d.s()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>((byte[]) r1)
            goto L_0x0015
        L_0x002e:
            r5 = 0
        L_0x002f:
            java.security.SecureRandom r0 = r4.appRandom
            r1 = 1
            if (r0 == 0) goto L_0x003f
            s0.a.b.k r2 = r4.signer
            s0.a.b.k0.d1 r3 = new s0.a.b.k0.d1
            r3.<init>(r5, r0)
            r2.init(r1, r3)
            goto L_0x0044
        L_0x003f:
            s0.a.b.k r0 = r4.signer
            r0.init(r1, r5)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi.engineInitSign(java.security.PrivateKey):void");
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        i iVar;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            iVar = bCDSTU4145PublicKey.engineGetKeyParameters();
            this.digest = new s0.a.b.b0.d(expandSbox(bCDSTU4145PublicKey.getSbox()));
        } else {
            iVar = ECUtil.generatePublicKeyParameter(publicKey);
            this.digest = new s0.a.b.b0.d(expandSbox(s0.a.a.a3.d.s()));
        }
        this.signer.init(false, iVar);
    }

    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] a = this.signer.a(bArr);
            byte[] byteArray = a[0].toByteArray();
            byte[] byteArray2 = a[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new x0(bArr2).getEncoded();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    public void engineUpdate(byte b) throws SignatureException {
        this.digest.update(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.digest.update(bArr, i, i2);
    }

    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] bArr3 = ((o) r.x(bArr)).c;
            byte[] bArr4 = new byte[(bArr3.length / 2)];
            byte[] bArr5 = new byte[(bArr3.length / 2)];
            System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length / 2);
            System.arraycopy(bArr3, bArr3.length / 2, bArr4, 0, bArr3.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr4), new BigInteger(1, bArr5)};
            return this.signer.b(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    public byte[] expandSbox(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr2[i2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[i2 + 1] = (byte) (bArr[i] & 15);
        }
        return bArr2;
    }
}
