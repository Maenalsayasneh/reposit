package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.a.n;
import s0.a.b.e;
import s0.a.b.e0.a1;
import s0.a.b.e0.u0;
import s0.a.b.f;
import s0.a.b.f0.w;
import s0.a.b.h;
import s0.a.b.h0.l;
import s0.a.b.i0.c;
import s0.a.b.i0.t;

public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new c(new u0()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new s0.a.b.i0.e(new u0(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new u0();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.Serpent"), str, "$KeyGen", configurableProvider, "KeyGenerator.Serpent"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.Serpent"), str, "$TECB", configurableProvider, "Cipher.Tnepres"), str, "$TKeyGen", configurableProvider, "KeyGenerator.Tnepres"), str, "$TAlgParams", configurableProvider, "AlgorithmParameters.Tnepres");
            a.q(str, "$ECB", configurableProvider, "Cipher", s0.a.a.k2.a.c);
            a.q(str, "$ECB", configurableProvider, "Cipher", s0.a.a.k2.a.g);
            a.q(str, "$ECB", configurableProvider, "Cipher", s0.a.a.k2.a.k);
            a.q(str, "$CBC", configurableProvider, "Cipher", s0.a.a.k2.a.d);
            a.q(str, "$CBC", configurableProvider, "Cipher", s0.a.a.k2.a.h);
            a.q(str, "$CBC", configurableProvider, "Cipher", s0.a.a.k2.a.l);
            a.q(str, "$CFB", configurableProvider, "Cipher", s0.a.a.k2.a.f);
            a.q(str, "$CFB", configurableProvider, "Cipher", s0.a.a.k2.a.j);
            a.q(str, "$CFB", configurableProvider, "Cipher", s0.a.a.k2.a.n);
            a.q(str, "$OFB", configurableProvider, "Cipher", s0.a.a.k2.a.e);
            a.q(str, "$OFB", configurableProvider, "Cipher", s0.a.a.k2.a.i);
            n nVar = s0.a.a.k2.a.m;
            configurableProvider.addAlgorithm("Cipher", nVar, str + "$OFB");
            addGMacAlgorithm(configurableProvider, "SERPENT", a.y0(new StringBuilder(), str, "$SerpentGMAC"), a.n0(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "TNEPRES", a.y0(new StringBuilder(), str, "$TSerpentGMAC"), a.n0(str, "$TKeyGen"));
            addPoly1305Algorithm(configurableProvider, "SERPENT", a.y0(new StringBuilder(), str, "$Poly1305"), a.n0(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new t(new u0(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new u0()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new w());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new s0.a.b.h0.e(new s0.a.b.i0.n(new u0())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public e get() {
                    return new a1();
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new h());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new s0.a.b.h0.e(new s0.a.b.i0.n(new a1())));
        }
    }

    private Serpent() {
    }
}
