package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.c3.b;
import s0.a.a.r;
import s0.a.a.w2.l;
import s0.a.a.w2.n;

public class PBEPBKDF2 {
    /* access modifiers changed from: private */
    public static final Map prfCodes;

    public static class AlgParams extends BaseAlgorithmParameters {
        public l params;

        public byte[] engineGetEncoded() {
            try {
                return this.params.r("DER");
            } catch (IOException e) {
                StringBuilder P0 = a.P0("Oooops! ");
                P0.append(e.toString());
                throw new RuntimeException(P0.toString());
            }
        }

        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.params = new l(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount(), 0, (b) null);
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            this.params = l.s(r.x(bArr));
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameters format in PBKDF2 parameters object");
        }

        public String engineToString() {
            return "PBKDF2 Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                l lVar = this.params;
                return new PBEParameterSpec(lVar.d.c, lVar.t().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
        }
    }

    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int defaultDigest;
        private int scheme;

        public BasePBKDF2(String str, int i) {
            this(str, i, 1);
        }

        public BasePBKDF2(String str, int i, int i2) {
            super(str, n.P);
            this.scheme = i;
            this.defaultDigest = i2;
        }

        private int getDigestCode(s0.a.a.n nVar) throws InvalidKeySpecException {
            Integer num = (Integer) PBEPBKDF2.prfCodes.get(nVar);
            if (num != null) {
                return num.intValue();
            }
            throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm " + nVar);
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    return new PBKDF2Key(pBEKeySpec.getPassword(), this.scheme == 1 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    StringBuilder P0 = a.P0("positive iteration count required: ");
                    P0.append(pBEKeySpec.getIterationCount());
                    throw new InvalidKeySpecException(P0.toString());
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    StringBuilder P02 = a.P0("positive key length required: ");
                    P02.append(pBEKeySpec.getKeyLength());
                    throw new InvalidKeySpecException(P02.toString());
                } else if (pBEKeySpec.getPassword().length == 0) {
                    throw new IllegalArgumentException("password empty");
                } else if (pBEKeySpec instanceof s0.a.c.n.n) {
                    int digestCode = getDigestCode(((s0.a.c.n.n) pBEKeySpec).c.c);
                    int keyLength = pBEKeySpec.getKeyLength();
                    return new BCPBEKey(this.algName, this.algOid, this.scheme, digestCode, keyLength, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, digestCode, keyLength));
                } else {
                    int i = this.defaultDigest;
                    int keyLength2 = pBEKeySpec.getKeyLength();
                    return new BCPBEKey(this.algName, this.algOid, this.scheme, i, keyLength2, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, i, keyLength2));
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPBKDF2.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$AlgParams", configurableProvider, "AlgorithmParameters.PBKDF2");
            Y0.append("Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar = n.P;
            a.v(a.d1(Y0, nVar, configurableProvider, "PBKDF2", str), "$PBKDF2withUTF8", configurableProvider, "SecretKeyFactory.PBKDF2");
            StringBuilder f1 = a.f1(configurableProvider, "Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2", "Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
            f1.append("Alg.Alias.SecretKeyFactory.");
            f1.append(nVar);
            configurableProvider.addAlgorithm(f1.toString(), "PBKDF2");
            a.u(new StringBuilder(), str, "$PBKDF2with8BIT", configurableProvider, "SecretKeyFactory.PBKDF2WITHASCII");
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.f1(configurableProvider, "Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII", "Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII"), str, "$PBKDF2withSHA224", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA224"), str, "$PBKDF2withSHA256", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA256"), str, "$PBKDF2withSHA384", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA384"), str, "$PBKDF2withSHA512", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA512"), str, "$PBKDF2withSHA3_224", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA3-224"), str, "$PBKDF2withSHA3_256", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA3-256"), str, "$PBKDF2withSHA3_384", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA3-384"), str, "$PBKDF2withSHA3_512", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA3-512"), str, "$PBKDF2withGOST3411", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACGOST3411"), str, "$PBKDF2withSM3", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSM3");
        }
    }

    public static class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super("PBKDF2", 1);
        }
    }

    public static class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super("PBKDF2", 5, 6);
        }
    }

    public static class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super("PBKDF2", 5, 7);
        }
    }

    public static class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super("PBKDF2", 5, 4);
        }
    }

    public static class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super("PBKDF2", 5, 8);
        }
    }

    public static class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super("PBKDF2", 5, 10);
        }
    }

    public static class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super("PBKDF2", 5, 11);
        }
    }

    public static class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super("PBKDF2", 5, 12);
        }
    }

    public static class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super("PBKDF2", 5, 13);
        }
    }

    public static class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super("PBKDF2", 5, 9);
        }
    }

    public static class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super("PBKDF2", 5, 14);
        }
    }

    public static class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super("PBKDF2", 5);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        prfCodes = hashMap;
        hashMap.put(s0.a.a.g2.a.c, 6);
        hashMap.put(n.Y, 1);
        hashMap.put(n.a0, 4);
        hashMap.put(n.Z, 7);
        hashMap.put(n.b0, 8);
        hashMap.put(n.c0, 9);
        hashMap.put(s0.a.a.r2.b.p, 11);
        hashMap.put(s0.a.a.r2.b.o, 10);
        hashMap.put(s0.a.a.r2.b.q, 12);
        hashMap.put(s0.a.a.r2.b.r, 13);
        hashMap.put(s0.a.a.j2.b.q, 14);
    }

    private PBEPBKDF2() {
    }
}
