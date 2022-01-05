package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.b0.a0;
import s0.a.b.b0.h0;
import s0.a.b.b0.r;
import s0.a.b.b0.s;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.e0.n0;
import s0.a.b.n;
import s0.a.b.n0.t;

public class X931SignatureSpi extends SignatureSpi {
    private t signer;

    public static class RIPEMD128WithRSAEncryption extends X931SignatureSpi {
        public RIPEMD128WithRSAEncryption() {
            super(new r(), new n0());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends X931SignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new s(), new n0());
        }
    }

    public static class SHA1WithRSAEncryption extends X931SignatureSpi {
        public SHA1WithRSAEncryption() {
            super(new v(), new n0());
        }
    }

    public static class SHA224WithRSAEncryption extends X931SignatureSpi {
        public SHA224WithRSAEncryption() {
            super(new w(), new n0());
        }
    }

    public static class SHA256WithRSAEncryption extends X931SignatureSpi {
        public SHA256WithRSAEncryption() {
            super(new x(), new n0());
        }
    }

    public static class SHA384WithRSAEncryption extends X931SignatureSpi {
        public SHA384WithRSAEncryption() {
            super(new y(), new n0());
        }
    }

    public static class SHA512WithRSAEncryption extends X931SignatureSpi {
        public SHA512WithRSAEncryption() {
            super(new a0(), new n0());
        }
    }

    public static class SHA512_224WithRSAEncryption extends X931SignatureSpi {
        public SHA512_224WithRSAEncryption() {
            super(a.V0(), new n0());
        }
    }

    public static class SHA512_256WithRSAEncryption extends X931SignatureSpi {
        public SHA512_256WithRSAEncryption() {
            super(a.W0(), new n0());
        }
    }

    public static class WhirlpoolWithRSAEncryption extends X931SignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new h0(), new n0());
        }
    }

    public X931SignatureSpi(n nVar, s0.a.b.a aVar) {
        this.signer = new t(aVar, nVar);
    }

    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.signer.init(true, RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey));
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.signer.init(false, RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey));
    }

    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.b();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    public void engineUpdate(byte b) throws SignatureException {
        this.signer.g.update(b);
    }

    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.a(bArr);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.signer.g.update(bArr, i, i2);
    }
}
