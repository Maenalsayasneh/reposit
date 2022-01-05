package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e;
import s0.a.b.e0.w;
import s0.a.b.f;
import s0.a.b.h;
import s0.a.b.h0.c;
import s0.a.b.i0.i;
import s0.a.b.i0.j;
import s0.a.b.i0.k;
import s0.a.b.i0.l;

public class GOST3412_2015 {

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new i(new w()), false, 128);
        }
    }

    public static class CTR extends BaseBlockCipher {
        public CTR() {
            super(new f(new k(new w())), true, 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new w());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new f(new j(new w(), 128)), false, 128);
        }
    }

    public static class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new f(new j(new w(), 8)), false, 128);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("GOST3412-2015", i, new h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new c(new w()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST3412_2015.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$ECB", configurableProvider, "Cipher.GOST3412-2015"), str, "$GCFB", configurableProvider, "Cipher.GOST3412-2015/CFB"), str, "$GCFB8", configurableProvider, "Cipher.GOST3412-2015/CFB8"), str, "$OFB", configurableProvider, "Cipher.GOST3412-2015/OFB"), str, "$CBC", configurableProvider, "Cipher.GOST3412-2015/CBC"), str, "$CTR", configurableProvider, "Cipher.GOST3412-2015/CTR"), str, "$KeyGen", configurableProvider, "KeyGenerator.GOST3412-2015"), str, "$Mac", configurableProvider, "Mac.GOST3412MAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new l(new w())), false, 128);
        }
    }
}
