package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import s0.a.b.a;
import s0.a.b.d0.b;
import s0.a.b.e0.n0;
import s0.a.b.j;
import s0.a.b.k0.d1;
import s0.a.b.n;
import s0.a.c.o.c;

public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut = new BaseCipherSpi.ErasableOutputStream();
    private a cipher;
    private AlgorithmParameters engineParams;
    private final c helper = new s0.a.c.o.a();
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly = false;
    private boolean publicKeyOnly = false;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super((a) new s0.a.b.d0.a(new n0()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super((a) new n0());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super((a) new s0.a.b.d0.c(new n0()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new s0.a.b.d0.c(new n0()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new s0.a.b.d0.c(new n0()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        try {
            initFromSpec(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public CipherSpi(a aVar) {
        this.cipher = aVar;
    }

    public CipherSpi(boolean z, boolean z2, a aVar) {
        this.publicKeyOnly = z;
        this.privateKeyOnly = z2;
        this.cipher = aVar;
    }

    private byte[] getOutput() throws BadPaddingException {
        try {
            byte[] b = this.cipher.b(this.bOut.getBuf(), 0, this.bOut.size());
            this.bOut.erase();
            return b;
        } catch (InvalidCipherTextException e) {
            throw new BadBlockException("unable to decrypt block", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new BadBlockException("unable to decrypt block", e2);
        } catch (Throwable th) {
            this.bOut.erase();
            throw th;
        }
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        n digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.cipher = new b(new n0(), digest, digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.paramSpec = oAEPParameterSpec;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("no match on OAEP constructor for digest algorithm: ");
        P0.append(mGF1ParameterSpec.getDigestAlgorithm());
        throw new NoSuchPaddingException(P0.toString());
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (bArr != null) {
                this.bOut.write(bArr, i, i2);
            }
            if (this.cipher instanceof n0) {
                if (this.bOut.size() > this.cipher.a() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
                }
            } else if (this.bOut.size() > this.cipher.a()) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            byte[] output = getOutput();
            for (int i4 = 0; i4 != output.length; i4++) {
                bArr2[i3 + i4] = output[i4];
            }
            return output.length;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            this.bOut.write(bArr, i, i2);
        }
        if (this.cipher instanceof n0) {
            if (this.bOut.size() > this.cipher.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.bOut.size() > this.cipher.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return getOutput();
    }

    public int engineGetBlockSize() {
        try {
            return this.cipher.a();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    public int engineGetKeySize(Key key) {
        BigInteger modulus;
        if (key instanceof RSAPrivateKey) {
            modulus = ((RSAPrivateKey) key).getModulus();
        } else if (key instanceof RSAPublicKey) {
            modulus = ((RSAPublicKey) key).getModulus();
        } else {
            throw new IllegalArgumentException("not an RSA key!");
        }
        return modulus.bitLength();
    }

    public int engineGetOutputSize(int i) {
        try {
            return this.cipher.c();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters f = this.helper.f("OAEP");
                this.engineParams = f;
                f.init(this.paramSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("cannot recognise parameters: ");
                P0.append(e.toString());
                throw new InvalidAlgorithmParameterException(P0.toString(), e);
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Eeeek! ");
            P0.append(e.toString());
            throw new InvalidKeyException(P0.toString(), e);
        }
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        d1 d1Var;
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof OAEPParameterSpec)) {
            if (key instanceof RSAPublicKey) {
                if (!this.privateKeyOnly || i != 1) {
                    d1Var = RSAUtil.generatePublicKeyParameter((RSAPublicKey) key);
                } else {
                    throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
                }
            } else if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            } else if (!this.publicKeyOnly || i != 1) {
                d1Var = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) key);
            } else {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            if (algorithmParameterSpec != null) {
                OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
                this.paramSpec = algorithmParameterSpec;
                if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(s0.a.a.w2.n.u.d)) {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                } else if (oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                    n digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
                    if (digest != null) {
                        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
                        n digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
                        if (digest2 != null) {
                            this.cipher = new b(new n0(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("no match on MGF digest algorithm: ");
                            P0.append(mGF1ParameterSpec.getDigestAlgorithm());
                            throw new InvalidAlgorithmParameterException(P0.toString());
                        }
                    } else {
                        StringBuilder P02 = i0.d.a.a.a.P0("no match on digest algorithm: ");
                        P02.append(oAEPParameterSpec.getDigestAlgorithm());
                        throw new InvalidAlgorithmParameterException(P02.toString());
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("unkown MGF parameters");
                }
            }
            if (!(this.cipher instanceof n0)) {
                if (secureRandom == null) {
                    secureRandom = j.a();
                }
                d1Var = new d1(d1Var, secureRandom);
            }
            this.bOut.reset();
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new InvalidParameterException(i0.d.a.a.a.g0("unknown opmode ", i, " passed to RSA"));
                        }
                    }
                }
                this.cipher.init(false, d1Var);
                return;
            }
            this.cipher.init(true, d1Var);
            return;
        }
        StringBuilder P03 = i0.d.a.a.a.P0("unknown parameter type: ");
        P03.append(algorithmParameterSpec.getClass().getName());
        throw new InvalidAlgorithmParameterException(P03.toString());
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String g = s0.a.g.j.g(str);
        if (!g.equals("NONE") && !g.equals("ECB")) {
            if (g.equals("1")) {
                this.privateKeyOnly = true;
                this.publicKeyOnly = false;
            } else if (g.equals("2")) {
                this.privateKeyOnly = false;
                this.publicKeyOnly = true;
            } else {
                throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("can't support mode ", str));
            }
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        a aVar;
        OAEPParameterSpec oAEPParameterSpec;
        String g = s0.a.g.j.g(str);
        if (g.equals("NOPADDING")) {
            aVar = new n0();
        } else if (g.equals("PKCS1PADDING")) {
            aVar = new s0.a.b.d0.c(new n0());
        } else if (g.equals("ISO9796-1PADDING")) {
            aVar = new s0.a.b.d0.a(new n0());
        } else {
            if (g.equals("OAEPWITHMD5ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPPADDING") || g.equals("OAEPWITHSHA1ANDMGF1PADDING") || g.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
                oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
            } else if (g.equals("OAEPWITHSHA224ANDMGF1PADDING") || g.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA256ANDMGF1PADDING") || g.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA384ANDMGF1PADDING") || g.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA512ANDMGF1PADDING") || g.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT);
            } else if (g.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT);
            } else {
                throw new NoSuchPaddingException(i0.d.a.a.a.n0(str, " unavailable with RSA."));
            }
            initFromSpec(oAEPParameterSpec);
            return;
        }
        this.cipher = aVar;
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.bOut.write(bArr, i, i2);
        if (this.cipher instanceof n0) {
            if (this.bOut.size() <= this.cipher.a() + 1) {
                return 0;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        } else if (this.bOut.size() <= this.cipher.a()) {
            return 0;
        } else {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.bOut.write(bArr, i, i2);
        if (this.cipher instanceof n0) {
            if (this.bOut.size() <= this.cipher.a() + 1) {
                return null;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        } else if (this.bOut.size() <= this.cipher.a()) {
            return null;
        } else {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
    }
}
