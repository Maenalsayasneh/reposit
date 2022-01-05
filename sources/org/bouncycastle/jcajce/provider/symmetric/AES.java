package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
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
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.a.e2.b;
import s0.a.b.e0.a;
import s0.a.b.e0.k0;
import s0.a.b.e0.m0;
import s0.a.b.f;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.c;
import s0.a.b.h0.e;
import s0.a.b.h0.l;
import s0.a.b.i;
import s0.a.b.i0.d;
import s0.a.b.i0.n;
import s0.a.b.i0.t;
import s0.a.b.j;
import s0.a.b.s;

public final class AES {
    /* access modifiers changed from: private */
    public static final Map<String, String> generalAesAttributes;

    public static class AESCCMMAC extends BaseMac {

        public static class CCMMac implements s {
            private final d ccm;
            private int macLength;

            private CCMMac() {
                this.ccm = new d(new a());
                this.macLength = 8;
            }

            public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
                try {
                    return this.ccm.doFinal(bArr, 0);
                } catch (InvalidCipherTextException e) {
                    StringBuilder P0 = i0.d.a.a.a.P0("exception on doFinal(): ");
                    P0.append(e.toString());
                    throw new IllegalStateException(P0.toString());
                }
            }

            public String getAlgorithmName() {
                return this.ccm.getAlgorithmName() + "Mac";
            }

            public int getMacSize() {
                return this.macLength;
            }

            public void init(i iVar) throws IllegalArgumentException {
                this.ccm.init(true, iVar);
                d dVar = this.ccm;
                int i = dVar.f;
                System.arraycopy(dVar.h, 0, new byte[i], 0, i);
                this.macLength = i;
            }

            public void reset() {
                this.ccm.f();
            }

            public void update(byte b) throws IllegalStateException {
                this.ccm.i.write(b);
            }

            public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
                this.ccm.i.write(bArr, i, i2);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new c(new a()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new e(new n(new a())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("AES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("CCM");
                createParametersInstance.init(new s0.a.a.e2.a(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GCM");
                createParametersInstance.init(new b(bArr, 16).getEncoded());
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "AES IV";
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private s0.a.a.e2.a ccmParams;

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
                this.ccmParams = s0.a.a.e2.a.s(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof s0.a.c.n.a) {
                s0.a.c.n.a aVar = (s0.a.c.n.a) algorithmParameterSpec;
                this.ccmParams = new s0.a.a.e2.a(aVar.getIV(), aVar.b / 8);
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("AlgorithmParameterSpec class not recognized: ");
                P0.append(algorithmParameterSpec.getClass().getName());
                throw new InvalidParameterSpecException(P0.toString());
            }
        }

        public void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = s0.a.a.e2.a.s(bArr);
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.ccmParams = s0.a.a.e2.a.s(bArr);
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
            super((s0.a.b.e) new s0.a.b.i0.c(new a()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((s0.a.b.i0.a) new d(new a()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new s0.a.b.i0.e(new a(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public s0.a.b.e get() {
                    return new a();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super((s0.a.b.i0.a) new n(new a()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", (s0.a.a.n) null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super("AES", i, new h());
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
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        public void configure(ConfigurableProvider configurableProvider) {
            ConfigurableProvider configurableProvider2 = configurableProvider;
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$AlgParams", configurableProvider2, "AlgorithmParameters.AES");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            StringBuilder f1 = i0.d.a.a.a.f1(configurableProvider2, "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES", "Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            f1.append("Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar = s0.a.a.r2.b.u;
            StringBuilder d1 = i0.d.a.a.a.d1(f1, nVar, configurableProvider2, "AES", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar2 = s0.a.a.r2.b.C;
            StringBuilder d12 = i0.d.a.a.a.d1(d1, nVar2, configurableProvider2, "AES", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar3 = s0.a.a.r2.b.K;
            StringBuilder b1 = i0.d.a.a.a.b1(i0.d.a.a.a.d1(d12, nVar3, configurableProvider2, "AES", str), "$AlgParamsGCM", configurableProvider2, "AlgorithmParameters.GCM", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar4 = s0.a.a.r2.b.y;
            StringBuilder d13 = i0.d.a.a.a.d1(b1, nVar4, configurableProvider2, "GCM", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar5 = s0.a.a.r2.b.G;
            StringBuilder d14 = i0.d.a.a.a.d1(d13, nVar5, configurableProvider2, "GCM", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar6 = s0.a.a.r2.b.O;
            StringBuilder b12 = i0.d.a.a.a.b1(i0.d.a.a.a.d1(d14, nVar6, configurableProvider2, "GCM", str), "$AlgParamsCCM", configurableProvider2, "AlgorithmParameters.CCM", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar7 = s0.a.a.r2.b.z;
            StringBuilder d15 = i0.d.a.a.a.d1(b12, nVar7, configurableProvider2, "CCM", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar8 = s0.a.a.r2.b.H;
            StringBuilder d16 = i0.d.a.a.a.d1(d15, nVar8, configurableProvider2, "CCM", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar9 = s0.a.a.r2.b.P;
            s0.a.a.n nVar10 = nVar6;
            i0.d.a.a.a.v(i0.d.a.a.a.d1(d16, nVar9, configurableProvider2, "CCM", str), "$AlgParamGen", configurableProvider2, "AlgorithmParameterGenerator.AES");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            StringBuilder f12 = i0.d.a.a.a.f1(configurableProvider2, "Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES", "Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            f12.append("Alg.Alias.AlgorithmParameterGenerator.");
            f12.append(nVar);
            configurableProvider2.addAlgorithm(f12.toString(), "AES");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar2, "AES");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar3, "AES");
            configurableProvider2.addAttributes("Cipher.AES", AES.generalAesAttributes);
            configurableProvider2.addAlgorithm("Cipher.AES", str + "$ECB");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            s0.a.a.n nVar11 = s0.a.a.r2.b.t;
            i0.d.a.a.a.q(str, "$ECB", configurableProvider2, "Cipher", nVar11);
            s0.a.a.n nVar12 = s0.a.a.r2.b.B;
            i0.d.a.a.a.q(str, "$ECB", configurableProvider2, "Cipher", nVar12);
            s0.a.a.n nVar13 = nVar12;
            s0.a.a.n nVar14 = s0.a.a.r2.b.J;
            s0.a.a.n nVar15 = nVar11;
            configurableProvider2.addAlgorithm("Cipher", nVar14, str + "$ECB");
            configurableProvider2.addAlgorithm("Cipher", nVar3, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar, i0.d.a.a.a.y0(new StringBuilder(), str, "$CBC"), str), "$CBC", configurableProvider2, "Cipher", nVar2), str, "$CBC"));
            s0.a.a.n nVar16 = s0.a.a.r2.b.v;
            i0.d.a.a.a.q(str, "$OFB", configurableProvider2, "Cipher", nVar16);
            s0.a.a.n nVar17 = s0.a.a.r2.b.D;
            s0.a.a.n nVar18 = nVar3;
            i0.d.a.a.a.q(str, "$OFB", configurableProvider2, "Cipher", nVar17);
            s0.a.a.n nVar19 = s0.a.a.r2.b.L;
            s0.a.a.n nVar20 = nVar14;
            i0.d.a.a.a.q(str, "$OFB", configurableProvider2, "Cipher", nVar19);
            s0.a.a.n nVar21 = s0.a.a.r2.b.w;
            s0.a.a.n nVar22 = nVar19;
            i0.d.a.a.a.q(str, "$CFB", configurableProvider2, "Cipher", nVar21);
            s0.a.a.n nVar23 = s0.a.a.r2.b.E;
            s0.a.a.n nVar24 = nVar17;
            i0.d.a.a.a.q(str, "$CFB", configurableProvider2, "Cipher", nVar23);
            s0.a.a.n nVar25 = s0.a.a.r2.b.M;
            s0.a.a.n nVar26 = nVar23;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            s0.a.a.n nVar27 = nVar2;
            sb2.append("$CFB");
            configurableProvider2.addAlgorithm("Cipher", nVar25, sb2.toString());
            configurableProvider2.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider2.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            s0.a.a.n nVar28 = s0.a.a.r2.b.x;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar28, "AESWRAP");
            s0.a.a.n nVar29 = nVar28;
            s0.a.a.n nVar30 = s0.a.a.r2.b.F;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar30, "AESWRAP");
            s0.a.a.n nVar31 = nVar30;
            s0.a.a.n nVar32 = s0.a.a.r2.b.N;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar32, "AESWRAP");
            s0.a.a.n nVar33 = nVar32;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider2.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            s0.a.a.n nVar34 = nVar25;
            i0.d.a.a.a.v(sb3, "$WrapPad", configurableProvider2, "Cipher.AESWRAPPAD");
            s0.a.a.n nVar35 = s0.a.a.r2.b.A;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar35, "AESWRAPPAD");
            s0.a.a.n nVar36 = s0.a.a.r2.b.I;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar36, "AESWRAPPAD");
            s0.a.a.n nVar37 = nVar36;
            s0.a.a.n nVar38 = s0.a.a.r2.b.Q;
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar38, "AESWRAPPAD");
            s0.a.a.n nVar39 = nVar35;
            configurableProvider2.addAlgorithm("AlgorithmParameterGenerator.CCM", i0.d.a.a.a.M0(configurableProvider2, "Cipher.AESRFC5649WRAP", i0.d.a.a.a.M0(configurableProvider2, "Cipher.AESRFC3211WRAP", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.AESKWP", "AESWRAPPAD", str, "$RFC3211Wrap"), str, "$RFC5649Wrap"), str, "$AlgParamGenCCM"));
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar7, "CCM");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar8, "CCM");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar9, "CCM");
            configurableProvider2.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            i0.d.a.a.a.v(sb4, "$CCM", configurableProvider2, "Cipher.CCM");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar7, "CCM");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar8, "CCM");
            s0.a.a.n nVar40 = nVar5;
            StringBuilder d17 = i0.d.a.a.a.d1(i0.d.a.a.a.d1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "Alg.Alias.Cipher", nVar9, "CCM", str), "$AlgParamGenGCM", configurableProvider2, "AlgorithmParameterGenerator.GCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar4, configurableProvider2, "GCM", "Alg.Alias.AlgorithmParameterGenerator."), nVar40, configurableProvider2, "GCM", "Alg.Alias.AlgorithmParameterGenerator.");
            s0.a.a.n nVar41 = nVar10;
            d17.append(nVar41);
            configurableProvider2.addAlgorithm(d17.toString(), "GCM");
            configurableProvider2.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            i0.d.a.a.a.u(new StringBuilder(), str, "$GCM", configurableProvider2, "Cipher.GCM");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar4, "GCM");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher", nVar40, "GCM");
            s0.a.a.n nVar42 = nVar26;
            s0.a.a.n nVar43 = nVar18;
            s0.a.a.n nVar44 = nVar34;
            s0.a.a.n nVar45 = nVar31;
            s0.a.a.n nVar46 = nVar9;
            s0.a.a.n nVar47 = nVar39;
            s0.a.a.n nVar48 = nVar38;
            StringBuilder a1 = i0.d.a.a.a.a1(i0.d.a.a.a.a1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar48, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar47, i0.d.a.a.a.y0(i0.d.a.a.a.Y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar8, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar41, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar4, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar45, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar44, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar43, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar42, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar27, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar21, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "Alg.Alias.Cipher", nVar41, "GCM", str), "$KeyGen", configurableProvider2, "KeyGenerator.AES", str), "$KeyGen128", configurableProvider2, "KeyGenerator.2.16.840.1.101.3.4.2", str), "$KeyGen192", configurableProvider2, "KeyGenerator.2.16.840.1.101.3.4.22", str), "$KeyGen256", configurableProvider2, "KeyGenerator.2.16.840.1.101.3.4.42", str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar15), str, "$KeyGen128"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar16), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar13), str, "$KeyGen192"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar24), str, "$KeyGen192"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar20), str, "$KeyGen256"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar22), str, "$KeyGen256"), str), "$KeyGen", configurableProvider2, "KeyGenerator.AESWRAP", str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar29), str, "$KeyGen192"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar33), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar40), str, "$KeyGen256"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar7), str, "$KeyGen192"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar46), str, "$KeyGen", configurableProvider2, "KeyGenerator.AESWRAPPAD"), str, "$KeyGen128"), str), "$KeyGen192", configurableProvider2, "KeyGenerator", nVar37), str, "$KeyGen256"), str), "$AESCMAC", configurableProvider2, "Mac.AESCMAC", str), "$AESCCMMAC", configurableProvider2, "Mac.AESCCMMAC", "Alg.Alias.Mac."), nVar7.d, configurableProvider2, "AESCCMMAC", "Alg.Alias.Mac."), nVar8.d, configurableProvider2, "AESCCMMAC", "Alg.Alias.Mac.");
            a1.append(nVar46.d);
            configurableProvider2.addAlgorithm(a1.toString(), "AESCCMMAC");
            s0.a.a.n nVar49 = s0.a.a.c2.a.g;
            String str2 = "Alg.Alias.Cipher";
            configurableProvider2.addAlgorithm(str2, nVar49, "PBEWITHSHAAND128BITAES-CBC-BC");
            s0.a.a.n nVar50 = s0.a.a.c2.a.h;
            configurableProvider2.addAlgorithm(str2, nVar50, "PBEWITHSHAAND192BITAES-CBC-BC");
            s0.a.a.n nVar51 = s0.a.a.c2.a.i;
            configurableProvider2.addAlgorithm(str2, nVar51, "PBEWITHSHAAND256BITAES-CBC-BC");
            s0.a.a.n nVar52 = s0.a.a.c2.a.j;
            configurableProvider2.addAlgorithm(str2, nVar52, "PBEWITHSHA256AND128BITAES-CBC-BC");
            s0.a.a.n nVar53 = s0.a.a.c2.a.k;
            configurableProvider2.addAlgorithm(str2, nVar53, "PBEWITHSHA256AND192BITAES-CBC-BC");
            s0.a.a.n nVar54 = s0.a.a.c2.a.l;
            i0.d.a.a.a.v(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, str2, nVar54, "PBEWITHSHA256AND256BITAES-CBC-BC", str), "$PBEWithSHA1AESCBC128", configurableProvider2, "Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str), "$PBEWithSHA1AESCBC192", configurableProvider2, "Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str), "$PBEWithSHA1AESCBC256", configurableProvider2, "Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str), "$PBEWithSHA256AESCBC128", configurableProvider2, "Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str), "$PBEWithSHA256AESCBC192", configurableProvider2, "Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str), "$PBEWithSHA256AESCBC256", configurableProvider2, "Cipher.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            i0.d.a.a.a.u(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.f1(configurableProvider2, "Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC", "Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC"), str, "$PBEWithAESCBC", configurableProvider2, "Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL"), str, "$PBEWithAESCBC", configurableProvider2, "Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL"), str, "$PBEWithAESCBC", configurableProvider2, "Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL"), str, "$KeyFactory", configurableProvider2, "SecretKeyFactory.AES");
            s0.a.a.n nVar55 = s0.a.a.r2.b.s;
            configurableProvider2.addAlgorithm("SecretKeyFactory", nVar55, str + "$KeyFactory");
            i0.d.a.a.a.u(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(new StringBuilder(), str, "$PBEWithMD5And128BitAESCBCOpenSSL", configurableProvider2, "SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL"), str, "$PBEWithMD5And192BitAESCBCOpenSSL", configurableProvider2, "SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL"), str, "$PBEWithMD5And256BitAESCBCOpenSSL", configurableProvider2, "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL"), str, "$PBEWithSHAAnd128BitAESBC", configurableProvider2, "SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC"), str, "$PBEWithSHAAnd192BitAESBC", configurableProvider2, "SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC"), str, "$PBEWithSHAAnd256BitAESBC", configurableProvider2, "SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC"), str, "$PBEWithSHA256And128BitAESBC", configurableProvider2, "SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC"), str, "$PBEWithSHA256And192BitAESBC", configurableProvider2, "SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC"), str, "$PBEWithSHA256And256BitAESBC", configurableProvider2, "SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar49, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar50, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar51, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar52, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar53, "PBEWITHSHA256AND192BITAES-CBC-BC");
            s0.a.a.n nVar56 = nVar54;
            configurableProvider2.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar56, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider2.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            StringBuilder f13 = i0.d.a.a.a.f1(configurableProvider2, "Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            String str3 = "Alg.Alias.AlgorithmParameters.";
            f13.append(str3);
            StringBuilder a12 = i0.d.a.a.a.a1(i0.d.a.a.a.a1(i0.d.a.a.a.a1(i0.d.a.a.a.a1(i0.d.a.a.a.a1(i0.d.a.a.a.a1(f13, nVar49.d, configurableProvider2, "PKCS12PBE", str3), nVar50.d, configurableProvider2, "PKCS12PBE", str3), nVar51.d, configurableProvider2, "PKCS12PBE", str3), nVar52.d, configurableProvider2, "PKCS12PBE", str3), nVar53.d, configurableProvider2, "PKCS12PBE", str3), nVar56.d, configurableProvider2, "PKCS12PBE", str);
            a12.append("$AESGMAC");
            String str4 = "AES";
            addGMacAlgorithm(configurableProvider2, str4, a12.toString(), i0.d.a.a.a.n0(str, "$KeyGen128"));
            addPoly1305Algorithm(configurableProvider2, str4, i0.d.a.a.a.y0(new StringBuilder(), str, "$Poly1305"), i0.d.a.a.a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new t(new a(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super((s0.a.b.e) new s0.a.b.i0.c(new a()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", (s0.a.a.n) null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", (s0.a.a.n) null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", (s0.a.a.n) null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new s0.a.b.i0.c(new a()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new s0.a.b.i0.c(new a()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new s0.a.b.i0.c(new a()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new s0.a.b.i0.c(new a()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new s0.a.b.i0.c(new a()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new s0.a.b.i0.c(new a()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", (s0.a.a.n) null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", (s0.a.a.n) null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", (s0.a.a.n) null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", (s0.a.a.n) null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", (s0.a.a.n) null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", (s0.a.a.n) null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new a()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new w());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new k0(new a()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new m0(new a()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new s0.a.b.e0.b());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new s0.a.b.e0.c());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalAesAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }
}
