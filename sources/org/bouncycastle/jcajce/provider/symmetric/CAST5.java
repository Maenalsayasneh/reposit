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
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.a.q2.a;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.b.e;
import s0.a.b.e0.h;
import s0.a.b.i0.c;
import s0.a.b.j;
import s0.a.e.b.b0.c.h3;

public final class CAST5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("CAST5");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private int keyLength = 128;

        public byte[] engineGetEncoded() {
            byte[] bArr = this.iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return new a(engineGetEncoded(), this.keyLength).getEncoded();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            byte[] bArr2 = new byte[bArr.length];
            this.iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                r i = new s0.a.a.j(bArr).i();
                a aVar = i instanceof a ? (a) i : i != null ? new a(s.B(i)) : null;
                this.keyLength = aVar.c.I();
                this.iv = h3.I(aVar.d.c);
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        public String engineToString() {
            return "CAST5 Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new h()), 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new h());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST5", 128, new s0.a.b.h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = CAST5.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$AlgParams", configurableProvider, "AlgorithmParameters.CAST5");
            i0.d.a.a.a.u(i0.d.a.a.a.f1(configurableProvider, "AlgorithmParameterGenerator.CAST5", i0.d.a.a.a.M0(configurableProvider, "Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5", str, "$AlgParamGen"), "Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5"), str, "$ECB", configurableProvider, "Cipher.CAST5");
            n nVar = s0.a.a.q2.c.h;
            configurableProvider.addAlgorithm("Cipher", nVar, str + "$CBC");
            i0.d.a.a.a.u(new StringBuilder(), str, "$KeyGen", configurableProvider, "KeyGenerator.CAST5");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator", nVar, "CAST5");
        }
    }

    private CAST5() {
    }
}
