package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.m0;
import s0.a.a.c3.y0;
import s0.a.a.w2.n;
import s0.a.b.b0.f;
import s0.a.b.k;
import s0.a.b.k0.b;
import s0.a.b.k0.d1;
import s0.a.b.k0.z;
import s0.a.b.n0.g;
import s0.a.d.d.a;

public class ECGOST2012SignatureSpi256 extends SignatureSpi implements n, y0 {
    private s0.a.b.n digest = new f();
    private int halfSize = 32;
    private k signer = new g();
    private int size = 64;

    public static b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof a) {
            z zVar = (z) ECUtil.generatePrivateKeyParameter(privateKey);
            if (zVar.d.j.bitLength() <= 256) {
                this.digest.reset();
                SecureRandom secureRandom = this.appRandom;
                if (secureRandom != null) {
                    this.signer.init(true, new d1(zVar, secureRandom));
                } else {
                    this.signer.init(true, zVar);
                }
            } else {
                throw new InvalidKeyException("key out of range for ECGOST-2012-256");
            }
        } else {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
        }
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        z zVar;
        if (publicKey instanceof ECPublicKey) {
            zVar = (z) generatePublicKeyParameter(publicKey);
        } else {
            try {
                zVar = (z) ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(m0.s(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (zVar.d.j.bitLength() <= 256) {
            this.digest.reset();
            this.signer.init(false, zVar);
            return;
        }
        throw new InvalidKeyException("key out of range for ECGOST-2012-256");
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
            byte[] bArr2 = new byte[this.size];
            BigInteger[] a = this.signer.a(bArr);
            byte[] byteArray = a[0].toByteArray();
            byte[] byteArray2 = a[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.halfSize - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.halfSize - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.size - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.size - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
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
            int i = this.halfSize;
            byte[] bArr3 = new byte[i];
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, 0, bArr4, 0, i);
            int i2 = this.halfSize;
            System.arraycopy(bArr, i2, bArr3, 0, i2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.b(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
