package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.z2.b;
import s0.a.b.b0.t;
import s0.a.b.h;
import s0.a.b.h0.g;

public class RIPEMD256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new t());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new t((t) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new t()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD256", 256, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD256.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$Digest", configurableProvider, "MessageDigest.RIPEMD256");
            Y0.append("Alg.Alias.MessageDigest.");
            StringBuilder d1 = a.d1(Y0, b.d, configurableProvider, "RIPEMD256", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD256", d1.toString(), a.n0(str, "$KeyGenerator"));
        }
    }

    private RIPEMD256() {
    }
}
