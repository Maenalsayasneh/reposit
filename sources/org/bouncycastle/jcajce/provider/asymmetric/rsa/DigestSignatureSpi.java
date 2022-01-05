package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import s0.a.a.c3.b;
import s0.a.a.v0;
import s0.a.b.a;
import s0.a.b.b0.a0;
import s0.a.b.b0.o;
import s0.a.b.b0.p;
import s0.a.b.b0.q;
import s0.a.b.b0.r;
import s0.a.b.b0.s;
import s0.a.b.b0.t;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.d0.c;
import s0.a.b.e0.n0;
import s0.a.b.k0.k1;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public class DigestSignatureSpi extends SignatureSpi {
    private b algId;
    private a cipher;
    private n digest;

    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(s0.a.a.w2.n.V, new s0.a.b.b0.n(), new c(new n0()));
        }
    }

    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(s0.a.a.w2.n.W, new o(), new c(new n0()));
        }
    }

    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(s0.a.a.w2.n.X, new p(), new c(new n0()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(s0.a.a.z2.b.c, new r(), new c(new n0()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(s0.a.a.z2.b.b, new s(), new c(new n0()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(s0.a.a.z2.b.d, new t(), new c(new n0()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(s0.a.a.v2.b.f, new v(), new c(new n0()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(s0.a.a.r2.b.f, new w(), new c(new n0()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(s0.a.a.r2.b.c, new x(), new c(new n0()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(s0.a.a.r2.b.d, new y(), new c(new n0()));
        }
    }

    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(s0.a.a.r2.b.i, m0.r.t.a.r.m.a1.a.R0(), new c(new n0()));
        }
    }

    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(s0.a.a.r2.b.j, m0.r.t.a.r.m.a1.a.S0(), new c(new n0()));
        }
    }

    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(s0.a.a.r2.b.k, m0.r.t.a.r.m.a1.a.T0(), new c(new n0()));
        }
    }

    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(s0.a.a.r2.b.l, m0.r.t.a.r.m.a1.a.U0(), new c(new n0()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(s0.a.a.r2.b.e, new a0(), new c(new n0()));
        }
    }

    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(s0.a.a.r2.b.g, m0.r.t.a.r.m.a1.a.V0(), new c(new n0()));
        }
    }

    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(s0.a.a.r2.b.h, m0.r.t.a.r.m.a1.a.W0(), new c(new n0()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new q(), new c(new n0()));
        }
    }

    public DigestSignatureSpi(s0.a.a.n nVar, n nVar2, a aVar) {
        this.digest = nVar2;
        this.cipher = aVar;
        this.algId = new b(nVar, v0.c);
    }

    public DigestSignatureSpi(n nVar, a aVar) {
        this.digest = nVar;
        this.cipher = aVar;
        this.algId = null;
    }

    private byte[] derEncode(byte[] bArr) throws IOException {
        b bVar = this.algId;
        return bVar == null ? bArr : new s0.a.a.c3.r(bVar, bArr).r("DER");
    }

    private String getType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    public Object engineGetParameter(String str) {
        return null;
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            k1 generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
            this.digest.reset();
            this.cipher.init(true, generatePrivateKeyParameter);
            return;
        }
        throw new InvalidKeyException(i0.d.a.a.a.y0(i0.d.a.a.a.P0("Supplied key ("), getType(privateKey), ") is not a RSAPrivateKey instance"));
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            k1 generatePublicKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            this.digest.reset();
            this.cipher.init(false, generatePublicKeyParameter);
            return;
        }
        throw new InvalidKeyException(i0.d.a.a.a.y0(i0.d.a.a.a.P0("Supplied key ("), getType(publicKey), ") is not a RSAPublicKey instance"));
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
            byte[] derEncode = derEncode(bArr);
            return this.cipher.b(derEncode, 0, derEncode.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
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
            byte[] b = this.cipher.b(bArr, 0, bArr.length);
            byte[] derEncode = derEncode(bArr2);
            if (b.length == derEncode.length) {
                return h3.U(b, derEncode);
            }
            if (b.length == derEncode.length - 2) {
                derEncode[1] = (byte) (derEncode[1] - 2);
                derEncode[3] = (byte) (derEncode[3] - 2);
                int i = derEncode[3] + 4;
                int i2 = i + 2;
                byte b2 = 0;
                for (int i3 = 0; i3 < derEncode.length - i2; i3++) {
                    b2 |= b[i + i3] ^ derEncode[i2 + i3];
                }
                for (int i4 = 0; i4 < i; i4++) {
                    b2 |= b[i4] ^ derEncode[i4];
                }
                return b2 == 0;
            }
            h3.U(derEncode, derEncode);
            return false;
        } catch (Exception unused) {
        }
    }
}
