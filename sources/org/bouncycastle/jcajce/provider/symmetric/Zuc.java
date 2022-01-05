package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import s0.a.b.e0.h1;
import s0.a.b.e0.j1;
import s0.a.b.h;
import s0.a.b.h0.q;
import s0.a.b.h0.r;

public class Zuc {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Zuc IV";
        }
    }

    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new h());
        }
    }

    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", 256, new h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Zuc.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$Zuc128", configurableProvider, "Cipher.ZUC-128"), str, "$KeyGen128", configurableProvider, "KeyGenerator.ZUC-128"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.ZUC-128"), str, "$Zuc256", configurableProvider, "Cipher.ZUC-256"), str, "$KeyGen256", configurableProvider, "KeyGenerator.ZUC-256"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.ZUC-256"), str, "$ZucMac128", configurableProvider, "Mac.ZUC-128"), str, "$ZucMac256", configurableProvider, "Mac.ZUC-256");
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", a.M0(configurableProvider, "Mac.ZUC-256-64", a.M0(configurableProvider, "Alg.Alias.Mac.ZUC-256-128", "ZUC-256", str, "$ZucMac256_64"), str, "$ZucMac256_32"));
        }
    }

    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new h1(), 16, 128);
        }
    }

    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new j1(), 25, 256);
        }
    }

    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new q());
        }
    }

    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new r(128));
        }
    }

    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new r(32));
        }
    }

    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new r(64));
        }
    }

    private Zuc() {
    }
}
