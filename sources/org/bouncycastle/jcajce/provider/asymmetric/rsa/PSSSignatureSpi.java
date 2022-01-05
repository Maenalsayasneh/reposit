package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import s0.a.b.a;
import s0.a.b.e0.n0;
import s0.a.b.k0.d1;
import s0.a.b.k0.k1;
import s0.a.b.n;
import s0.a.b.n0.o;
import s0.a.c.o.c;

public class PSSSignatureSpi extends SignatureSpi {
    private n contentDigest;
    private AlgorithmParameters engineParams;
    private final c helper;
    private boolean isInitState;
    private boolean isRaw;
    private k1 key;
    private n mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private o pss;
    private SecureRandom random;
    private int saltLength;
    private a signer;
    private byte trailer;

    public class NullPssDigest implements n {
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private n baseDigest;
        private boolean oddTime = true;

        public NullPssDigest(n nVar) {
            this.baseDigest = nVar;
        }

        public int doFinal(byte[] bArr, int i) {
            byte[] byteArray = this.bOut.toByteArray();
            if (this.oddTime) {
                System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.baseDigest.update(byteArray, 0, byteArray.length);
                this.baseDigest.doFinal(bArr, i);
            }
            reset();
            this.oddTime = !this.oddTime;
            return byteArray.length;
        }

        public String getAlgorithmName() {
            return "NULL";
        }

        public int getByteLength() {
            return 0;
        }

        public int getDigestSize() {
            return this.baseDigest.getDigestSize();
        }

        public void reset() {
            this.bOut.reset();
            this.baseDigest.reset();
        }

        public void update(byte b) {
            this.bOut.write(b);
        }

        public void update(byte[] bArr, int i, int i2) {
            this.bOut.write(bArr, i, i2);
        }
    }

    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new n0(), (PSSParameterSpec) null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new n0(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new n0(), (PSSParameterSpec) null, true);
        }
    }

    public PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec) {
        this(aVar, pSSParameterSpec, false);
    }

    public PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.helper = new s0.a.c.o.a();
        this.isInitState = true;
        this.signer = aVar;
        this.originalSpec = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.paramSpec = PSSParameterSpec.DEFAULT;
        } else {
            this.paramSpec = pSSParameterSpec;
        }
        this.mgfDigest = DigestFactory.getDigest(this.paramSpec.getDigestAlgorithm());
        this.saltLength = this.paramSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        this.isRaw = z;
        setupContentDigest();
    }

    private byte getTrailer(int i) {
        if (i == 1) {
            return -68;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void setupContentDigest() {
        this.contentDigest = this.isRaw ? new NullPssDigest(this.mgfDigest) : this.mgfDigest;
    }

    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters f = this.helper.f("PSS");
                this.engineParams = f;
                f.init(this.paramSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            this.key = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
            o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
            this.pss = oVar;
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                oVar.init(true, new d1(this.key, secureRandom));
            } else {
                oVar.init(true, this.key);
            }
            this.isInitState = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
    }

    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            this.key = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
            this.pss = oVar;
            oVar.init(false, this.key);
            this.isInitState = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
    }

    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null || (algorithmParameterSpec = this.originalSpec) != null) {
            if (!this.isInitState) {
                throw new ProviderException("cannot call setParameter in the middle of update");
            } else if (algorithmParameterSpec instanceof PSSParameterSpec) {
                PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
                PSSParameterSpec pSSParameterSpec2 = this.originalSpec;
                if (pSSParameterSpec2 != null && !DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                    StringBuilder P0 = i0.d.a.a.a.P0("parameter must be using ");
                    P0.append(this.originalSpec.getDigestAlgorithm());
                    throw new InvalidAlgorithmParameterException(P0.toString());
                } else if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !pSSParameterSpec.getMGFAlgorithm().equals(s0.a.a.w2.n.u.d)) {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                } else if (pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                    MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
                    if (DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                        n digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
                        if (digest != null) {
                            this.engineParams = null;
                            this.paramSpec = pSSParameterSpec;
                            this.mgfDigest = digest;
                            this.saltLength = pSSParameterSpec.getSaltLength();
                            this.trailer = getTrailer(this.paramSpec.getTrailerField());
                            setupContentDigest();
                            if (this.key != null) {
                                o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
                                this.pss = oVar;
                                k1 k1Var = this.key;
                                oVar.init(k1Var.c, k1Var);
                                return;
                            }
                            return;
                        }
                        StringBuilder P02 = i0.d.a.a.a.P0("no match on MGF digest algorithm: ");
                        P02.append(mGF1ParameterSpec.getDigestAlgorithm());
                        throw new InvalidAlgorithmParameterException(P02.toString());
                    }
                    throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
                } else {
                    throw new InvalidAlgorithmParameterException("unknown MGF parameters");
                }
            } else {
                throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
            }
        }
    }

    public byte[] engineSign() throws SignatureException {
        this.isInitState = true;
        try {
            return this.pss.b();
        } catch (CryptoException e) {
            throw new SignatureException(e.getMessage());
        }
    }

    public void engineUpdate(byte b) throws SignatureException {
        this.pss.g.update(b);
        this.isInitState = false;
    }

    public boolean engineVerify(byte[] bArr) throws SignatureException {
        this.isInitState = true;
        return this.pss.a(bArr);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.pss.g.update(bArr, i, i2);
        this.isInitState = false;
    }
}
