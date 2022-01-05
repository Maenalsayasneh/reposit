package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.n;
import s0.a.b.b0.h0;
import s0.a.b.h;
import s0.a.b.h0.g;

public class Whirlpool {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new h0());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new h0((h0) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new h0()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACWHIRLPOOL", 512, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Whirlpool.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.WHIRLPOOL");
            n nVar = s0.a.a.o2.a.e;
            configurableProvider.addAlgorithm("MessageDigest", nVar, str + "$Digest");
            addHMACAlgorithm(configurableProvider, "WHIRLPOOL", a.y0(new StringBuilder(), str, "$HashMac"), a.n0(str, "$KeyGenerator"));
        }
    }

    private Whirlpool() {
    }
}
