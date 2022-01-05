package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import s0.a.b.a0.b;
import s0.a.b.a0.h;
import s0.a.b.a0.l.a;
import s0.a.b.a0.l.c;
import s0.a.b.b0.a0;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.d;
import s0.a.b.f0.r;
import s0.a.b.k0.f;
import s0.a.b.k0.g;
import s0.a.b.k0.i;
import s0.a.b.k0.j;
import s0.a.b.l;
import s0.a.c.n.e;
import s0.a.c.n.k;
import s0.a.c.n.s;
import s0.a.e.b.b0.c.h3;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private e dheParameters;
    private BigInteger g;
    private final d mqvAgreement;
    private k mqvParameters;
    private BigInteger p;
    private byte[] result;
    private final b unifiedAgreement;
    private BigInteger x;

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new b(), (l) new a(new v()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new b(), (l) new r(new v()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new b(), (l) new a(new w()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new b(), (l) new r(new w()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new b(), (l) new a(new x()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new b(), (l) new r(new x()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new b(), (l) new a(new y()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new b(), (l) new r(new y()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new b(), (l) new a(new a0()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new b(), (l) new r(new a0()));
        }
    }

    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new c(new v()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new a(new v()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new r(new v()));
        }
    }

    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new a(new w()));
        }
    }

    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new r(new w()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new a(new x()));
        }
    }

    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new r(new x()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new a(new y()));
        }
    }

    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new r(new y()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new a(new a0()));
        }
    }

    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new r(new a0()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", (d) new h(), (l) new a(new v()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", (d) new h(), (l) new r(new v()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", (d) new h(), (l) new a(new w()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", (d) new h(), (l) new r(new w()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", (d) new h(), (l) new a(new x()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", (d) new h(), (l) new r(new x()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", (d) new h(), (l) new a(new y()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", (d) new h(), (l) new r(new y()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", (d) new h(), (l) new a(new a0()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", (d) new h(), (l) new r(new a0()));
        }
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", (l) null);
    }

    public KeyAgreementSpi(String str, b bVar, l lVar) {
        super(str, lVar);
        this.unifiedAgreement = bVar;
        this.mqvAgreement = null;
    }

    public KeyAgreementSpi(String str, d dVar, l lVar) {
        super(str, lVar);
        this.unifiedAgreement = null;
        this.mqvAgreement = dVar;
    }

    public KeyAgreementSpi(String str, l lVar) {
        super(str, lVar);
        this.unifiedAgreement = null;
        this.mqvAgreement = null;
    }

    private i generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("private key not a DHPrivateKey");
        } else if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).engineGetKeyParameters();
        } else {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            return new i(dHPrivateKey.getX(), new s0.a.b.k0.h(params.getP(), params.getG(), (BigInteger) null, params.getL()));
        }
    }

    private j generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("public key not a DHPublicKey");
        } else if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params = dHPublicKey.getParams();
            return params instanceof s0.a.c.n.b ? new j(dHPublicKey.getY(), ((s0.a.c.n.b) params).a()) : new j(dHPublicKey.getY(), new s0.a.b.k0.h(params.getP(), params.getG(), (BigInteger) null, params.getL()));
        }
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        int bitLength = (this.p.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    public byte[] calcSecret() {
        return this.result;
    }

    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.x == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        } else if (key instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            if (!dHPublicKey.getParams().getG().equals(this.g) || !dHPublicKey.getParams().getP().equals(this.p)) {
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            }
            BigInteger y = dHPublicKey.getY();
            if (y != null && y.compareTo(TWO) >= 0) {
                BigInteger bigInteger = this.p;
                BigInteger bigInteger2 = ONE;
                if (y.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                    if (this.unifiedAgreement != null) {
                        if (z) {
                            j generatePublicKeyParameter = generatePublicKeyParameter((PublicKey) key);
                            Objects.requireNonNull(this.dheParameters);
                            j generatePublicKeyParameter2 = generatePublicKeyParameter((PublicKey) null);
                            Objects.requireNonNull(generatePublicKeyParameter, "staticPublicKey cannot be null");
                            Objects.requireNonNull(generatePublicKeyParameter2, "ephemeralPublicKey cannot be null");
                            if (generatePublicKeyParameter.d.equals(generatePublicKeyParameter2.d)) {
                                b bVar = this.unifiedAgreement;
                                Objects.requireNonNull(bVar);
                                s0.a.b.a0.a aVar = new s0.a.b.a0.a();
                                s0.a.b.a0.a aVar2 = new s0.a.b.a0.a();
                                aVar.init(bVar.a.c);
                                BigInteger b = aVar.b(generatePublicKeyParameter);
                                aVar2.init(bVar.a.d);
                                BigInteger b2 = aVar2.b(generatePublicKeyParameter2);
                                int bitLength = (bVar.a.c.d.d.bitLength() + 7) / 8;
                                byte[] bArr = new byte[(bitLength * 2)];
                                s0.a.g.b.a(b2, bArr, 0, bitLength);
                                s0.a.g.b.a(b, bArr, bitLength, bitLength);
                                this.result = bArr;
                                return null;
                            }
                            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
                        }
                        throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
                    } else if (this.mqvAgreement == null) {
                        BigInteger modPow = y.modPow(this.x, this.p);
                        if (modPow.compareTo(bigInteger2) != 0) {
                            this.result = bigIntToBytes(modPow);
                            if (z) {
                                return null;
                            }
                            return new BCDHPublicKey(modPow, dHPublicKey.getParams());
                        }
                        throw new InvalidKeyException("Shared key can't be 1");
                    } else if (z) {
                        j generatePublicKeyParameter3 = generatePublicKeyParameter((PublicKey) key);
                        Objects.requireNonNull(this.mqvParameters);
                        this.result = bigIntToBytes(this.mqvAgreement.b(new g(generatePublicKeyParameter3, generatePublicKeyParameter((PublicKey) null))));
                        return null;
                    } else {
                        throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
                    }
                }
            }
            throw new InvalidKeyException("Invalid DH PublicKey");
        } else {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
    }

    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        if (this.x != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        if (this.x != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(BaseAgreementSpi.trimZeroes(this.result), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.x != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            BigInteger x2 = dHPrivateKey.getX();
            this.x = x2;
            this.result = bigIntToBytes(x2);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            if (algorithmParameterSpec == null) {
                this.p = dHPrivateKey.getParams().getP();
                this.g = dHPrivateKey.getParams().getG();
            } else if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                this.p = dHParameterSpec.getP();
                this.g = dHParameterSpec.getG();
                this.dheParameters = null;
                this.ukmParameters = null;
            } else if (algorithmParameterSpec instanceof e) {
                if (this.unifiedAgreement != null) {
                    this.p = dHPrivateKey.getParams().getP();
                    this.g = dHPrivateKey.getParams().getG();
                    e eVar = (e) algorithmParameterSpec;
                    this.dheParameters = eVar;
                    this.ukmParameters = eVar.a();
                    Objects.requireNonNull(this.dheParameters);
                    b bVar = this.unifiedAgreement;
                    i generatePrivateKeyParameter = generatePrivateKeyParameter(dHPrivateKey);
                    Objects.requireNonNull(this.dheParameters);
                    s0.a.b.k0.k kVar = new s0.a.b.k0.k(generatePrivateKeyParameter, generatePrivateKeyParameter((PrivateKey) null), (j) null);
                    Objects.requireNonNull(bVar);
                    bVar.a = kVar;
                } else {
                    throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
                }
            } else if (algorithmParameterSpec instanceof k) {
                if (this.mqvAgreement != null) {
                    this.p = dHPrivateKey.getParams().getP();
                    this.g = dHPrivateKey.getParams().getG();
                    this.mqvParameters = (k) algorithmParameterSpec;
                    this.ukmParameters = h3.I((byte[]) null);
                    Objects.requireNonNull(this.mqvParameters);
                    d dVar = this.mqvAgreement;
                    i generatePrivateKeyParameter2 = generatePrivateKeyParameter(dHPrivateKey);
                    Objects.requireNonNull(this.mqvParameters);
                    dVar.init(new f(generatePrivateKeyParameter2, generatePrivateKeyParameter((PrivateKey) null), (j) null));
                } else {
                    throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
                }
            } else if (!(algorithmParameterSpec instanceof s)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            } else if (this.kdf != null) {
                this.p = dHPrivateKey.getParams().getP();
                this.g = dHPrivateKey.getParams().getG();
                this.dheParameters = null;
                this.ukmParameters = ((s) algorithmParameterSpec).a();
            } else {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            BigInteger x2 = dHPrivateKey.getX();
            this.x = x2;
            this.result = bigIntToBytes(x2);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }
}
