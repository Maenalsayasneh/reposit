package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.z2.b;
import s0.a.b.b0.r;
import s0.a.b.h;
import s0.a.b.h0.g;

public class RIPEMD128 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new r());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new r((r) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new r()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD128", 128, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD128.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$Digest", configurableProvider, "MessageDigest.RIPEMD128");
            Y0.append("Alg.Alias.MessageDigest.");
            StringBuilder d1 = a.d1(Y0, b.c, configurableProvider, "RIPEMD128", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD128", d1.toString(), a.n0(str, "$KeyGenerator"));
        }
    }

    private RIPEMD128() {
    }
}
