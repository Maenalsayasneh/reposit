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
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.a.e2.a;
import s0.a.a.e2.b;
import s0.a.b.e;
import s0.a.b.e0.d;
import s0.a.b.e0.k0;
import s0.a.b.f;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.l;
import s0.a.b.i0.c;
import s0.a.b.i0.n;
import s0.a.b.i0.t;
import s0.a.b.j;

public final class ARIA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("ARIA");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "ARIA IV";
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private a ccmParams;

        public byte[] engineGetEncoded() throws IOException {
            return this.ccmParams.getEncoded();
        }

        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = a.s(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof s0.a.c.n.a) {
                s0.a.c.n.a aVar = (s0.a.c.n.a) algorithmParameterSpec;
                this.ccmParams = new a(aVar.getIV(), aVar.b / 8);
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("AlgorithmParameterSpec class not recognized: ");
                P0.append(algorithmParameterSpec.getClass().getName());
                throw new InvalidParameterSpecException(P0.toString());
            }
        }

        public void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = a.s(bArr);
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.ccmParams = a.s(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        public String engineToString() {
            return "CCM";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                if (GcmSpecUtil.gcmSpecExists()) {
                    return GcmSpecUtil.extractGcmSpec(this.ccmParams.c());
                }
                return new s0.a.c.n.a(this.ccmParams.t(), this.ccmParams.d * 8);
            } else if (cls == s0.a.c.n.a.class) {
                return new s0.a.c.n.a(this.ccmParams.t(), this.ccmParams.d * 8);
            } else {
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.ccmParams.t());
                }
                throw new InvalidParameterSpecException(i0.d.a.a.a.W(cls, i0.d.a.a.a.P0("AlgorithmParameterSpec not recognized: ")));
            }
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private b gcmParams;

        public byte[] engineGetEncoded() throws IOException {
            return this.gcmParams.getEncoded();
        }

        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof s0.a.c.n.a) {
                s0.a.c.n.a aVar = (s0.a.c.n.a) algorithmParameterSpec;
                this.gcmParams = new b(aVar.getIV(), aVar.b / 8);
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("AlgorithmParameterSpec class not recognized: ");
                P0.append(algorithmParameterSpec.getClass().getName());
                throw new InvalidParameterSpecException(P0.toString());
            }
        }

        public void engineInit(byte[] bArr) throws IOException {
            this.gcmParams = b.s(bArr);
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.gcmParams = b.s(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        public String engineToString() {
            return "GCM";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                if (GcmSpecUtil.gcmSpecExists()) {
                    return GcmSpecUtil.extractGcmSpec(this.gcmParams.c());
                }
                return new s0.a.c.n.a(this.gcmParams.t(), this.gcmParams.d * 8);
            } else if (cls == s0.a.c.n.a.class) {
                return new s0.a.c.n.a(this.gcmParams.t(), this.gcmParams.d * 8);
            } else {
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.gcmParams.t());
                }
                throw new InvalidParameterSpecException(i0.d.a.a.a.W(cls, i0.d.a.a.a.P0("AlgorithmParameterSpec not recognized: ")));
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new d()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((s0.a.b.i0.a) new s0.a.b.i0.d(new d()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new s0.a.b.i0.e(new d(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new d();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super((s0.a.b.i0.a) new n(new d()));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new s0.a.b.h0.e(new n(new d())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", (s0.a.a.n) null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("ARIA", i, new h());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = ARIA.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            ConfigurableProvider configurableProvider2 = configurableProvider;
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$AlgParams", configurableProvider2, "AlgorithmParameters.ARIA");
            s0.a.a.n nVar = s0.a.a.s2.a.e;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters", nVar, "ARIA");
            s0.a.a.n nVar2 = s0.a.a.s2.a.i;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters", nVar2, "ARIA");
            s0.a.a.n nVar3 = s0.a.a.s2.a.m;
            i0.d.a.a.a.v(i0.d.a.a.a.g1(configurableProvider2, "Alg.Alias.AlgorithmParameters", nVar3, "ARIA", str), "$AlgParamGen", configurableProvider2, "AlgorithmParameterGenerator.ARIA");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar, "ARIA");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar2, "ARIA");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar3, "ARIA");
            s0.a.a.n nVar4 = s0.a.a.s2.a.g;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar4, "ARIA");
            s0.a.a.n nVar5 = s0.a.a.s2.a.k;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar5, "ARIA");
            s0.a.a.n nVar6 = s0.a.a.s2.a.o;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar6, "ARIA");
            s0.a.a.n nVar7 = s0.a.a.s2.a.f;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar7, "ARIA");
            s0.a.a.n nVar8 = s0.a.a.s2.a.j;
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", nVar8, "ARIA");
            s0.a.a.n nVar9 = s0.a.a.s2.a.n;
            i0.d.a.a.a.v(i0.d.a.a.a.g1(configurableProvider2, "Alg.Alias.AlgorithmParameterGenerator", nVar9, "ARIA", str), "$ECB", configurableProvider2, "Cipher.ARIA");
            s0.a.a.n nVar10 = s0.a.a.s2.a.d;
            i0.d.a.a.a.q(str, "$ECB", configurableProvider2, "Cipher", nVar10);
            s0.a.a.n nVar11 = s0.a.a.s2.a.h;
            i0.d.a.a.a.q(str, "$ECB", configurableProvider2, "Cipher", nVar11);
            s0.a.a.n nVar12 = s0.a.a.s2.a.l;
            s0.a.a.n nVar13 = nVar11;
            configurableProvider2.addAlgorithm("Cipher", nVar12, str + "$ECB");
            i0.d.a.a.a.v(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar6, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar4, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar8, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar3, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar, i0.d.a.a.a.y0(new StringBuilder(), str, "$CBC"), str), "$CBC", configurableProvider2, "Cipher", nVar2), str, "$CBC"), str), "$CFB", configurableProvider2, "Cipher", nVar7), str, "$CFB"), str), "$CFB", configurableProvider2, "Cipher", nVar9), str, "$OFB"), str), "$OFB", configurableProvider2, "Cipher", nVar5), str, "$OFB"), str), "$RFC3211Wrap", configurableProvider2, "Cipher.ARIARFC3211WRAP", str), "$Wrap", configurableProvider2, "Cipher.ARIAWRAP");
            s0.a.a.n nVar14 = s0.a.a.s2.a.v;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar14, "ARIAWRAP");
            s0.a.a.n nVar15 = nVar6;
            s0.a.a.n nVar16 = s0.a.a.s2.a.w;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar16, "ARIAWRAP");
            s0.a.a.n nVar17 = nVar5;
            s0.a.a.n nVar18 = s0.a.a.s2.a.x;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar18, "ARIAWRAP");
            s0.a.a.n nVar19 = nVar4;
            configurableProvider2.addAlgorithm("Cipher.ARIAWRAPPAD", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.ARIAKW", "ARIAWRAP", str, "$WrapPad"));
            s0.a.a.n nVar20 = s0.a.a.s2.a.y;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar20, "ARIAWRAPPAD");
            s0.a.a.n nVar21 = s0.a.a.s2.a.z;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar21, "ARIAWRAPPAD");
            s0.a.a.n nVar22 = nVar8;
            s0.a.a.n nVar23 = s0.a.a.s2.a.A;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar23, "ARIAWRAPPAD");
            s0.a.a.n nVar24 = nVar9;
            s0.a.a.n nVar25 = nVar17;
            StringBuilder g1 = i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar25, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar24, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar7, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar2, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar12, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar10, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar21, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar18, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar14, i0.d.a.a.a.M0(configurableProvider2, "KeyGenerator.ARIA", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD", str, "$KeyGen"), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar16), str, "$KeyGen256"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar20), str, "$KeyGen192"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar23), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar13), str, "$KeyGen256"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar), str, "$KeyGen192"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar3), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar22), str, "$KeyGen256"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar19), str, "$KeyGen192"), str);
            g1.append("$KeyGen256");
            configurableProvider2.addAlgorithm("KeyGenerator", nVar15, g1.toString());
            s0.a.a.n nVar26 = s0.a.a.s2.a.s;
            i0.d.a.a.a.q(str, "$KeyGen128", configurableProvider2, "KeyGenerator", nVar26);
            s0.a.a.n nVar27 = s0.a.a.s2.a.t;
            i0.d.a.a.a.q(str, "$KeyGen192", configurableProvider2, "KeyGenerator", nVar27);
            s0.a.a.n nVar28 = s0.a.a.s2.a.u;
            i0.d.a.a.a.q(str, "$KeyGen256", configurableProvider2, "KeyGenerator", nVar28);
            s0.a.a.n nVar29 = s0.a.a.s2.a.p;
            i0.d.a.a.a.q(str, "$KeyGen128", configurableProvider2, "KeyGenerator", nVar29);
            s0.a.a.n nVar30 = s0.a.a.s2.a.q;
            i0.d.a.a.a.q(str, "$KeyGen192", configurableProvider2, "KeyGenerator", nVar30);
            s0.a.a.n nVar31 = s0.a.a.s2.a.r;
            configurableProvider2.addAlgorithm("KeyGenerator", nVar31, str + "$KeyGen256");
            i0.d.a.a.a.u(new StringBuilder(), str, "$KeyFactory", configurableProvider2, "SecretKeyFactory.ARIA");
            String str2 = "ARIA";
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar, str2);
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar2, str2);
            String str3 = "$AlgParamGen";
            i0.d.a.a.a.v(i0.d.a.a.a.d1(i0.d.a.a.a.d1(i0.d.a.a.a.d1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "Alg.Alias.SecretKeyFactory", nVar3, str2, str), str3, configurableProvider2, "AlgorithmParameterGenerator.ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar26, configurableProvider2, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar27, configurableProvider2, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar28, configurableProvider2, "ARIACCM", str), "$CCM", configurableProvider2, "Cipher.ARIACCM");
            String str4 = "Alg.Alias.Cipher";
            configurableProvider2.addAlgorithm(str4, nVar26, "CCM");
            configurableProvider2.addAlgorithm(str4, nVar27, "CCM");
            i0.d.a.a.a.v(i0.d.a.a.a.d1(i0.d.a.a.a.d1(i0.d.a.a.a.d1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, str4, nVar28, "CCM", str), str3, configurableProvider2, "AlgorithmParameterGenerator.ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar29, configurableProvider2, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar30, configurableProvider2, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar31, configurableProvider2, "ARIAGCM", str), "$GCM", configurableProvider2, "Cipher.ARIAGCM");
            configurableProvider2.addAlgorithm(str4, nVar29, "ARIAGCM");
            configurableProvider2.addAlgorithm(str4, nVar30, "ARIAGCM");
            StringBuilder g12 = i0.d.a.a.a.g1(configurableProvider2, str4, nVar31, "ARIAGCM", str);
            g12.append("$GMAC");
            addGMacAlgorithm(configurableProvider2, str2, g12.toString(), i0.d.a.a.a.n0(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider2, str2, i0.d.a.a.a.y0(new StringBuilder(), str, "$Poly1305"), i0.d.a.a.a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new t(new d(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new d()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new w());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new k0(new d()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new s0.a.b.e0.e());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new s0.a.b.e0.f());
        }
    }

    private ARIA() {
    }
}
