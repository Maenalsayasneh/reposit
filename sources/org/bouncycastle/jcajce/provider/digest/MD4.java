package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.w2.n;
import s0.a.b.b0.o;
import s0.a.b.h;
import s0.a.b.h0.g;

public class MD4 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new o());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new o((o) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new o()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD4", 128, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = MD4.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$Digest", configurableProvider, "MessageDigest.MD4");
            Y0.append("Alg.Alias.MessageDigest.");
            StringBuilder d1 = a.d1(Y0, n.W, configurableProvider, "MD4", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "MD4", d1.toString(), a.n0(str, "$KeyGenerator"));
        }
    }

    private MD4() {
    }
}
