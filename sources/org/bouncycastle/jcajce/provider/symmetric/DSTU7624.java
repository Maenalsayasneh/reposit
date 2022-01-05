package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.a.n;
import s0.a.b.e;
import s0.a.b.e0.r;
import s0.a.b.e0.s;
import s0.a.b.f;
import s0.a.b.h;
import s0.a.b.h0.i;
import s0.a.b.i0.a;
import s0.a.b.i0.c;
import s0.a.b.i0.p;
import s0.a.b.i0.q;
import s0.a.b.i0.t;
import s0.a.b.j;

public class DSTU7624 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private final int ivLength;

        public AlgParamGen(int i) {
            this.ivLength = i / 8;
        }

        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DSTU7624");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "DSTU7624 IV";
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super((e) new c(new r(128)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super((e) new c(new r(256)), 256);
        }
    }

    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super((e) new c(new r(512)), 512);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super((a) new p(new r(128)));
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super((a) new p(new r(256)));
        }
    }

    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super((a) new p(new r(512)));
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new f(new s0.a.b.i0.e(new r(128), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new f(new s0.a.b.i0.e(new r(256), 256)), 256);
        }
    }

    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new f(new s0.a.b.i0.e(new r(512), 512)), 512);
        }
    }

    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new f(new q(new r(128))), 128);
        }
    }

    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new f(new q(new r(256))), 256);
        }
    }

    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new f(new q(new r(512))), 512);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new r(128);
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super((e) new r(128));
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super((e) new r(256));
        }
    }

    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super((e) new r(512));
        }
    }

    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super((e) new r(128));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super((e) new r(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super((e) new r(512));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super((a) new s0.a.b.i0.r(new r(128)));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super((a) new s0.a.b.i0.r(new r(256)));
        }
    }

    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super((a) new s0.a.b.i0.r(new r(512)));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new i(new s0.a.b.i0.r(new r(128)), 128));
        }
    }

    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new i(new s0.a.b.i0.r(new r(128)), 128));
        }
    }

    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new i(new s0.a.b.i0.r(new r(256)), 256));
        }
    }

    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new i(new s0.a.b.i0.r(new r(512)), 512));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("DSTU7624", i, new h());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = DSTU7624.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            ConfigurableProvider configurableProvider2 = configurableProvider;
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$AlgParams", configurableProvider2, "AlgorithmParameters.DSTU7624");
            n nVar = s0.a.a.a3.e.s;
            i0.d.a.a.a.q(str, "$AlgParams", configurableProvider2, "AlgorithmParameters", nVar);
            n nVar2 = s0.a.a.a3.e.t;
            i0.d.a.a.a.q(str, "$AlgParams", configurableProvider2, "AlgorithmParameters", nVar2);
            n nVar3 = s0.a.a.a3.e.u;
            configurableProvider2.addAlgorithm("AlgorithmParameters", nVar3, str + "$AlgParams");
            i0.d.a.a.a.v(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.b1(i0.d.a.a.a.g1(configurableProvider2, "AlgorithmParameterGenerator", nVar3, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "AlgorithmParameterGenerator", nVar, i0.d.a.a.a.y0(i0.d.a.a.a.Y0(new StringBuilder(), str, "$AlgParamGen128", configurableProvider2, "AlgorithmParameterGenerator.DSTU7624"), str, "$AlgParamGen128"), str), "$AlgParamGen256", configurableProvider2, "AlgorithmParameterGenerator", nVar2), str, "$AlgParamGen512"), str), "$ECB_128", configurableProvider2, "Cipher.DSTU7624", str), "$ECB_128", configurableProvider2, "Cipher.DSTU7624-128", str), "$ECB_256", configurableProvider2, "Cipher.DSTU7624-256", str), "$ECB_512", configurableProvider2, "Cipher.DSTU7624-512");
            n nVar4 = s0.a.a.a3.e.j;
            i0.d.a.a.a.q(str, "$ECB128", configurableProvider2, "Cipher", nVar4);
            n nVar5 = s0.a.a.a3.e.k;
            i0.d.a.a.a.q(str, "$ECB256", configurableProvider2, "Cipher", nVar5);
            n nVar6 = s0.a.a.a3.e.l;
            configurableProvider2.addAlgorithm("Cipher", nVar6, str + "$ECB512");
            configurableProvider2.addAlgorithm("Cipher", nVar3, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "Cipher", nVar, i0.d.a.a.a.y0(new StringBuilder(), str, "$CBC128"), str), "$CBC256", configurableProvider2, "Cipher", nVar2), str, "$CBC512"));
            n nVar7 = s0.a.a.a3.e.v;
            i0.d.a.a.a.q(str, "$OFB128", configurableProvider2, "Cipher", nVar7);
            n nVar8 = s0.a.a.a3.e.w;
            i0.d.a.a.a.q(str, "$OFB256", configurableProvider2, "Cipher", nVar8);
            n nVar9 = s0.a.a.a3.e.x;
            i0.d.a.a.a.q(str, "$OFB512", configurableProvider2, "Cipher", nVar9);
            n nVar10 = s0.a.a.a3.e.p;
            i0.d.a.a.a.q(str, "$CFB128", configurableProvider2, "Cipher", nVar10);
            n nVar11 = s0.a.a.a3.e.q;
            i0.d.a.a.a.q(str, "$CFB256", configurableProvider2, "Cipher", nVar11);
            n nVar12 = s0.a.a.a3.e.r;
            i0.d.a.a.a.q(str, "$CFB512", configurableProvider2, "Cipher", nVar12);
            n nVar13 = s0.a.a.a3.e.m;
            n nVar14 = nVar12;
            i0.d.a.a.a.q(str, "$CTR128", configurableProvider2, "Cipher", nVar13);
            n nVar15 = s0.a.a.a3.e.n;
            n nVar16 = nVar13;
            i0.d.a.a.a.q(str, "$CTR256", configurableProvider2, "Cipher", nVar15);
            n nVar17 = s0.a.a.a3.e.o;
            n nVar18 = nVar15;
            i0.d.a.a.a.q(str, "$CTR512", configurableProvider2, "Cipher", nVar17);
            n nVar19 = s0.a.a.a3.e.B;
            n nVar20 = nVar17;
            i0.d.a.a.a.q(str, "$CCM128", configurableProvider2, "Cipher", nVar19);
            n nVar21 = s0.a.a.a3.e.C;
            n nVar22 = nVar19;
            i0.d.a.a.a.q(str, "$CCM256", configurableProvider2, "Cipher", nVar21);
            n nVar23 = s0.a.a.a3.e.D;
            n nVar24 = nVar21;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            n nVar25 = nVar11;
            sb2.append("$CCM512");
            configurableProvider2.addAlgorithm("Cipher", nVar23, sb2.toString());
            i0.d.a.a.a.u(new StringBuilder(), str, "$Wrap", configurableProvider2, "Cipher.DSTU7624KW");
            StringBuilder e1 = i0.d.a.a.a.e1(configurableProvider2, "Cipher.DSTU7624-128KW", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW", str, "$Wrap128"), "Alg.Alias.Cipher.");
            n nVar26 = s0.a.a.a3.e.E;
            n nVar27 = nVar23;
            e1.append(nVar26.d);
            configurableProvider2.addAlgorithm(e1.toString(), "DSTU7624-128KW");
            n nVar28 = nVar10;
            StringBuilder e12 = i0.d.a.a.a.e1(configurableProvider2, "Cipher.DSTU7624-256KW", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW", str, "$Wrap256"), "Alg.Alias.Cipher.");
            n nVar29 = s0.a.a.a3.e.F;
            e12.append(nVar29.d);
            configurableProvider2.addAlgorithm(e12.toString(), "DSTU7624-256KW");
            n nVar30 = nVar9;
            StringBuilder e13 = i0.d.a.a.a.e1(configurableProvider2, "Cipher.DSTU7624-512KW", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW", str, "$Wrap512"), "Alg.Alias.Cipher.");
            n nVar31 = s0.a.a.a3.e.G;
            e13.append(nVar31.d);
            configurableProvider2.addAlgorithm(e13.toString(), "DSTU7624-512KW");
            StringBuilder e14 = i0.d.a.a.a.e1(configurableProvider2, "Mac.DSTU7624-128GMAC", i0.d.a.a.a.M0(configurableProvider2, "Mac.DSTU7624GMAC", i0.d.a.a.a.M0(configurableProvider2, "Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW", str, "$GMAC"), str, "$GMAC128"), "Alg.Alias.Mac.");
            n nVar32 = s0.a.a.a3.e.y;
            n nVar33 = nVar8;
            StringBuilder b1 = i0.d.a.a.a.b1(i0.d.a.a.a.a1(e14, nVar32.d, configurableProvider2, "DSTU7624-128GMAC", str), "$GMAC256", configurableProvider2, "Mac.DSTU7624-256GMAC", "Alg.Alias.Mac.");
            n nVar34 = s0.a.a.a3.e.z;
            n nVar35 = nVar34;
            StringBuilder b12 = i0.d.a.a.a.b1(i0.d.a.a.a.a1(b1, nVar34.d, configurableProvider2, "DSTU7624-256GMAC", str), "$GMAC512", configurableProvider2, "Mac.DSTU7624-512GMAC", "Alg.Alias.Mac.");
            n nVar36 = s0.a.a.a3.e.A;
            n nVar37 = nVar25;
            n nVar38 = nVar16;
            n nVar39 = nVar20;
            n nVar40 = nVar24;
            n nVar41 = nVar32;
            configurableProvider2.addAlgorithm("KeyGenerator", nVar36, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar41, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar40, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar39, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar38, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar37, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar30, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar7, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar2, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar6, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar4, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.g1(configurableProvider2, "KeyGenerator", nVar29, i0.d.a.a.a.y0(i0.d.a.a.a.c1(i0.d.a.a.a.b1(i0.d.a.a.a.a1(b12, nVar36.d, configurableProvider2, "DSTU7624-512GMAC", str), "$KeyGen", configurableProvider2, "KeyGenerator.DSTU7624", str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar26), str, "$KeyGen256"), str), "$KeyGen512", configurableProvider2, "KeyGenerator", nVar31), str, "$KeyGen128"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar5), str, "$KeyGen512"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar), str, "$KeyGen256"), str), "$KeyGen512", configurableProvider2, "KeyGenerator", nVar3), str, "$KeyGen128"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar33), str, "$KeyGen512"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar28), str, "$KeyGen256"), str), "$KeyGen512", configurableProvider2, "KeyGenerator", nVar14), str, "$KeyGen128"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar18), str, "$KeyGen512"), str), "$KeyGen128", configurableProvider2, "KeyGenerator", nVar22), str, "$KeyGen256"), str), "$KeyGen512", configurableProvider2, "KeyGenerator", nVar27), str, "$KeyGen128"), str), "$KeyGen256", configurableProvider2, "KeyGenerator", nVar35), str, "$KeyGen512"));
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new f(new t(new r(128), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new f(new t(new r(256), 256)), 256);
        }
    }

    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new f(new t(new r(512), 512)), 512);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new s(128));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new s(128));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new s(256));
        }
    }

    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new s(512));
        }
    }

    private DSTU7624() {
    }
}
