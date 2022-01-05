package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import s0.a.a.q2.c;
import s0.a.b.b0.b;

public class Blake2s {

    public static class Blake2s128 extends BCMessageDigest implements Cloneable {
        public Blake2s128() {
            super(new b(128));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2s128 blake2s128 = (Blake2s128) super.clone();
            blake2s128.digest = new b((b) this.digest);
            return blake2s128;
        }
    }

    public static class Blake2s160 extends BCMessageDigest implements Cloneable {
        public Blake2s160() {
            super(new b(160));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2s160 blake2s160 = (Blake2s160) super.clone();
            blake2s160.digest = new b((b) this.digest);
            return blake2s160;
        }
    }

    public static class Blake2s224 extends BCMessageDigest implements Cloneable {
        public Blake2s224() {
            super(new b(224));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2s224 blake2s224 = (Blake2s224) super.clone();
            blake2s224.digest = new b((b) this.digest);
            return blake2s224;
        }
    }

    public static class Blake2s256 extends BCMessageDigest implements Cloneable {
        public Blake2s256() {
            super(new b(256));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2s256 blake2s256 = (Blake2s256) super.clone();
            blake2s256.digest = new b((b) this.digest);
            return blake2s256;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2s.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$Blake2s256", configurableProvider, "MessageDigest.BLAKE2S-256");
            Y0.append("Alg.Alias.MessageDigest.");
            a.w(a.b1(a.d1(a.b1(a.d1(a.b1(a.d1(Y0, c.x, configurableProvider, "BLAKE2S-256", str), "$Blake2s224", configurableProvider, "MessageDigest.BLAKE2S-224", "Alg.Alias.MessageDigest."), c.w, configurableProvider, "BLAKE2S-224", str), "$Blake2s160", configurableProvider, "MessageDigest.BLAKE2S-160", "Alg.Alias.MessageDigest."), c.v, configurableProvider, "BLAKE2S-160", str), "$Blake2s128", configurableProvider, "MessageDigest.BLAKE2S-128", "Alg.Alias.MessageDigest."), c.u, configurableProvider, "BLAKE2S-128");
        }
    }

    private Blake2s() {
    }
}
