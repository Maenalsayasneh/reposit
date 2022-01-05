package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import s0.a.b.a;
import s0.a.b.d0.b;
import s0.a.b.d0.c;
import s0.a.b.e0.t;
import s0.a.b.k0.d1;
import s0.a.b.n;
import s0.a.g.j;

public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut = new BaseCipherSpi.ErasableOutputStream();
    private a cipher;
    private AlgorithmParameters engineParams;
    private AlgorithmParameterSpec paramSpec;

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new t());
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new c(new t()));
        }
    }

    public CipherSpi(a aVar) {
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
            this.cipher = new b(new t(), digest, digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
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
            if (this.cipher instanceof t) {
                if (this.bOut.size() > this.cipher.a() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
                }
            } else if (this.bOut.size() > this.cipher.a()) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
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
        if (this.cipher instanceof t) {
            if (this.bOut.size() > this.cipher.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.bOut.size() > this.cipher.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return getOutput();
    }

    public int engineGetBlockSize() {
        return this.cipher.a();
    }

    public int engineGetKeySize(Key key) {
        if (key instanceof s0.a.d.d.b) {
            return ((s0.a.d.d.b) key).getParameters().a.bitLength();
        }
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not an ElGamal key!");
    }

    public int engineGetOutputSize(int i) {
        return this.cipher.c();
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("OAEP");
                this.engineParams = createParametersInstance;
                createParametersInstance.init(this.paramSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
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
        a aVar;
        if (key instanceof DHPublicKey) {
            d1Var = ElGamalUtil.generatePublicKeyParameter((PublicKey) key);
        } else if (key instanceof DHPrivateKey) {
            d1Var = ElGamalUtil.generatePrivateKeyParameter((PrivateKey) key);
        } else {
            throw new InvalidKeyException("unknown key type passed to ElGamal");
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
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
                        this.cipher = new b(new t(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
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
        } else if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        if (secureRandom != null) {
            d1Var = new d1(d1Var, secureRandom);
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException(i0.d.a.a.a.g0("unknown opmode ", i, " passed to ElGamal"));
                    }
                }
            }
            aVar = this.cipher;
            z = false;
            aVar.init(z, d1Var);
        }
        aVar = this.cipher;
        aVar.init(z, d1Var);
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String g = j.g(str);
        if (!g.equals("NONE") && !g.equals("ECB")) {
            throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("can't support mode ", str));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        a aVar;
        OAEPParameterSpec oAEPParameterSpec;
        String g = j.g(str);
        if (g.equals("NOPADDING")) {
            aVar = new t();
        } else if (g.equals("PKCS1PADDING")) {
            aVar = new c(new t());
        } else if (g.equals("ISO9796-1PADDING")) {
            aVar = new s0.a.b.d0.a(new t());
        } else {
            if (!g.equals("OAEPPADDING")) {
                if (g.equals("OAEPWITHMD5ANDMGF1PADDING")) {
                    oAEPParameterSpec = new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT);
                } else if (!g.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
                    if (g.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
                        oAEPParameterSpec = new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT);
                    } else if (g.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
                        oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
                    } else if (g.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
                        oAEPParameterSpec = new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT);
                    } else if (g.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
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
                        throw new NoSuchPaddingException(i0.d.a.a.a.n0(str, " unavailable with ElGamal."));
                    }
                }
                initFromSpec(oAEPParameterSpec);
                return;
            }
            oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
            initFromSpec(oAEPParameterSpec);
            return;
        }
        this.cipher = aVar;
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.bOut.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.bOut.write(bArr, i, i2);
        return null;
    }
}
