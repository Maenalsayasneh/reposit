package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.q2.b;
import s0.a.a.s;
import s0.a.b.e;
import s0.a.b.e0.b0;
import s0.a.b.h;
import s0.a.b.h0.a;
import s0.a.b.i0.c;
import s0.a.b.j;
import s0.a.e.b.b0.c.h3;

public final class IDEA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("IDEA");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;

        public byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return new b(engineGetEncoded("RAW")).getEncoded();
            }
            if (!str.equals("RAW")) {
                return null;
            }
            byte[] bArr = this.iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            byte[] bArr2 = new byte[bArr.length];
            this.iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equals("RAW")) {
                engineInit(bArr);
            } else if (str.equals("ASN.1")) {
                byte[] bArr2 = null;
                o oVar = (bArr instanceof b ? (b) bArr : bArr != null ? new b(s.B(bArr)) : null).c;
                if (oVar != null) {
                    bArr2 = h3.I(oVar.c);
                }
                engineInit(bArr2);
            } else {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        public String engineToString() {
            return "IDEA Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new b0()), 64);
        }
    }

    public static class CFB8Mac extends BaseMac {
        public CFB8Mac() {
            super(new s0.a.b.h0.b(new b0()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new b0());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("IDEA", 128, new h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new a(new b0()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = IDEA.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(sb, str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.IDEA"), str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.IDEA"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2");
            i0.d.a.a.a.u(i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE"), str, "$ECB", configurableProvider, "Cipher.IDEA");
            n nVar = s0.a.a.q2.c.i;
            configurableProvider.addAlgorithm("Cipher", nVar, str + "$CBC");
            i0.d.a.a.a.v(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider, "KeyGenerator", nVar, i0.d.a.a.a.y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(new StringBuilder(), str, "$PBEWithSHAAndIDEA", configurableProvider, "Cipher.PBEWITHSHAANDIDEA-CBC"), str, "$KeyGen", configurableProvider, "KeyGenerator.IDEA"), str, "$KeyGen"), str), "$PBEWithSHAAndIDEAKeyGen", configurableProvider, "SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", str), "$Mac", configurableProvider, "Mac.IDEAMAC");
            configurableProvider.addAlgorithm("Mac.IDEAMAC/CFB8", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.Mac.IDEA", "IDEAMAC", str, "$CFB8Mac"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    public static class PBEWithSHAAndIDEA extends BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super((e) new c(new b0()));
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super("PBEwithSHAandIDEA-CBC", (n) null, true, 2, 1, 128, 64);
        }
    }

    private IDEA() {
    }
}
