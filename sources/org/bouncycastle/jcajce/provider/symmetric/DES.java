package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.b.e;
import s0.a.b.e0.k0;
import s0.a.b.e0.o;
import s0.a.b.h0.a;
import s0.a.b.h0.b;
import s0.a.b.h0.h;
import s0.a.b.i;
import s0.a.b.i0.c;
import s0.a.b.j;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.q;

public final class DES {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new o()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new a(new o()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new s0.a.b.h0.c(new o()));
        }
    }

    public static class DES64 extends BaseMac {
        public DES64() {
            super(new a(new o(), 64, (s0.a.b.j0.a) null));
        }
    }

    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new a(new o(), 64, new s0.a.b.j0.c()));
        }
    }

    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new h(new o(), 64, (s0.a.b.j0.a) null));
        }
    }

    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new h(new o(), 64, new s0.a.b.j0.c()));
        }
    }

    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new b(new o()));
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        public DESPBEKeyFactory(String str, n nVar, boolean z, int i, int i2, int i3, int i4) {
            super(str, nVar);
            this.forCipher = z;
            this.scheme = i;
            this.digest = i2;
            this.keySize = i3;
            this.ivSize = i4;
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    int i = this.scheme;
                    if (i != 0 && i != 4) {
                        return new BCPBEKey(this.algName, this.algOid, i, this.digest, this.keySize, this.ivSize, pBEKeySpec, (i) null);
                    }
                    return new PBKDF1Key(pBEKeySpec.getPassword(), this.scheme == 0 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
                }
                i makePBEParameters = this.forCipher ? PBE.Util.makePBEParameters(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, this.digest, this.keySize);
                s0.a.b.k0.c.c((makePBEParameters instanceof c1 ? (y0) ((c1) makePBEParameters).d : (y0) makePBEParameters).c);
                return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, makePBEParameters);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new o());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DES", (n) null);
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
        }

        public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            } else if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.algName);
            } else {
                if (DESKeySpec.class.isAssignableFrom(cls)) {
                    try {
                        return new DESKeySpec(secretKey.getEncoded());
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                } else {
                    throw new InvalidKeySpecException("Invalid KeySpec");
                }
            }
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("DES", 64, new s0.a.b.f0.a());
        }

        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.b(new q(j.a(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.a(), this.algName);
        }

        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = DES.class.getName();

        private void addAlias(ConfigurableProvider configurableProvider, n nVar, String str) {
            StringBuilder a1 = i0.d.a.a.a.a1(i0.d.a.a.a.P0("Alg.Alias.KeyGenerator."), nVar.d, configurableProvider, str, "Alg.Alias.KeyFactory.");
            a1.append(nVar.d);
            configurableProvider.addAlgorithm(a1.toString(), str);
        }

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$ECB", configurableProvider, "Cipher.DES");
            n nVar = s0.a.a.v2.b.b;
            i0.d.a.a.a.q(str, "$CBC", configurableProvider, "Cipher", nVar);
            addAlias(configurableProvider, nVar, "DES");
            i0.d.a.a.a.v(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.V0(str, "$RFC3211", configurableProvider, "Cipher.DESRFC3211WRAP", str), "$KeyGenerator", configurableProvider, "KeyGenerator.DES", str), "$KeyFactory", configurableProvider, "SecretKeyFactory.DES", str), "$CMAC", configurableProvider, "Mac.DESCMAC", str), "$CBCMAC", configurableProvider, "Mac.DESMAC");
            i0.d.a.a.a.u(i0.d.a.a.a.f1(configurableProvider, "Mac.DESMAC/CFB8", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Mac.DES", "DESMAC", str, "$DESCFB8"), "Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8"), str, "$DES64", configurableProvider, "Mac.DESMAC64");
            configurableProvider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Mac.DES64", "DESMAC64", str, "$DES64with7816d4"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            i0.d.a.a.a.u(i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING", "Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING"), str, "$DES9797Alg3", configurableProvider, "Mac.DESWITHISO9797");
            i0.d.a.a.a.u(i0.d.a.a.a.f1(configurableProvider, "Mac.ISO9797ALG3MAC", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797", str, "$DES9797Alg3"), "Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC"), str, "$DES9797Alg3with7816d4", configurableProvider, "Mac.ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            i0.d.a.a.a.v(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.d1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider, "Alg.Alias.AlgorithmParameters", nVar, "DES", str), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.DES", "Alg.Alias.AlgorithmParameterGenerator."), nVar, configurableProvider, "DES", str), "$PBEWithMD2", configurableProvider, "Cipher.PBEWITHMD2ANDDES", str), "$PBEWithMD5", configurableProvider, "Cipher.PBEWITHMD5ANDDES", str), "$PBEWithSHA1", configurableProvider, "Cipher.PBEWITHSHA1ANDDES");
            n nVar2 = s0.a.a.w2.n.I;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar2, "PBEWITHMD2ANDDES");
            n nVar3 = s0.a.a.w2.n.K;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar3, "PBEWITHMD5ANDDES");
            n nVar4 = s0.a.a.w2.n.M;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar4, "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            i0.d.a.a.a.u(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES", "Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES"), str, "$PBEWithMD2KeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHMD2ANDDES"), str, "$PBEWithMD5KeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHMD5ANDDES"), str, "$PBEWithSHA1KeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            StringBuilder f1 = i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES", "Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            f1.append("Alg.Alias.SecretKeyFactory.");
            f1.append(nVar2);
            configurableProvider.addAlgorithm(f1.toString(), "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + nVar3, "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + nVar4, "PBEWITHSHA1ANDDES");
        }
    }

    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new c(new o()), 0, 5, 64, 8);
        }
    }

    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", s0.a.a.w2.n.I, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new c(new o()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", s0.a.a.w2.n.K, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new c(new o()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", s0.a.a.w2.n.M, true, 0, 1, 64, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new k0(new o()), 8);
        }
    }

    private DES() {
    }
}
