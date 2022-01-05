package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import s0.a.a.c3.y0;
import s0.a.a.w2.n;
import s0.a.b.b0.a0;
import s0.a.b.b0.q;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.i;
import s0.a.b.k;
import s0.a.b.k0.b;
import s0.a.b.k0.d1;
import s0.a.b.n0.a;
import s0.a.b.n0.c;
import s0.a.b.n0.l;
import s0.a.b.n0.s;

public class DSASigner extends SignatureSpi implements n, y0 {
    private s0.a.b.n digest;
    private a encoding = s.a;
    private SecureRandom random;
    private k signer;

    public static class detDSA extends DSASigner {
        public detDSA() {
            super(new v(), new c(new l(new v())));
        }
    }

    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(new w(), new c(new l(new w())));
        }
    }

    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(new x(), new c(new l(new x())));
        }
    }

    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(new y(), new c(new l(new y())));
        }
    }

    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(new a0(), new c(new l(new a0())));
        }
    }

    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(m0.r.t.a.r.m.a1.a.R0(), new c(new l(m0.r.t.a.r.m.a1.a.R0())));
        }
    }

    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(m0.r.t.a.r.m.a1.a.S0(), new c(new l(m0.r.t.a.r.m.a1.a.S0())));
        }
    }

    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(m0.r.t.a.r.m.a1.a.T0(), new c(new l(m0.r.t.a.r.m.a1.a.T0())));
        }
    }

    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(m0.r.t.a.r.m.a1.a.U0(), new c(new l(m0.r.t.a.r.m.a1.a.U0())));
        }
    }

    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(new w(), new c());
        }
    }

    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(new x(), new c());
        }
    }

    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(new y(), new c());
        }
    }

    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(new a0(), new c());
        }
    }

    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(m0.r.t.a.r.m.a1.a.R0(), new c());
        }
    }

    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(m0.r.t.a.r.m.a1.a.S0(), new c());
        }
    }

    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(m0.r.t.a.r.m.a1.a.T0(), new c());
        }
    }

    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(m0.r.t.a.r.m.a1.a.U0(), new c());
        }
    }

    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new q(), new c());
        }
    }

    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(new v(), new c());
        }
    }

    public DSASigner(s0.a.b.n nVar, k kVar) {
        this.digest = nVar;
        this.signer = kVar;
    }

    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        i generatePrivateKeyParameter = DSAUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new d1(generatePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, generatePrivateKeyParameter);
    }

    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        b generatePublicKeyParameter = DSAUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
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
            return this.encoding.b(this.signer.getOrder(), a[0], a[1]);
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
            BigInteger[] a = this.encoding.a(this.signer.getOrder(), bArr);
            return this.signer.b(bArr2, a[0], a[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
