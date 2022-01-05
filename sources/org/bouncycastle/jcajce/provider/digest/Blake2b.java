package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import s0.a.a.q2.c;
import s0.a.b.b0.a;

public class Blake2b {

    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new a(160));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new a((a) this.digest);
            return blake2b160;
        }
    }

    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new a(256));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new a((a) this.digest);
            return blake2b256;
        }
    }

    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new a(384));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new a((a) this.digest);
            return blake2b384;
        }
    }

    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new a(512));
        }

        public Object clone() throws CloneNotSupportedException {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new a((a) this.digest);
            return blake2b512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2b.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = i0.d.a.a.a.Y0(sb, str, "$Blake2b512", configurableProvider, "MessageDigest.BLAKE2B-512");
            Y0.append("Alg.Alias.MessageDigest.");
            i0.d.a.a.a.w(i0.d.a.a.a.b1(i0.d.a.a.a.d1(i0.d.a.a.a.b1(i0.d.a.a.a.d1(i0.d.a.a.a.b1(i0.d.a.a.a.d1(Y0, c.t, configurableProvider, "BLAKE2B-512", str), "$Blake2b384", configurableProvider, "MessageDigest.BLAKE2B-384", "Alg.Alias.MessageDigest."), c.s, configurableProvider, "BLAKE2B-384", str), "$Blake2b256", configurableProvider, "MessageDigest.BLAKE2B-256", "Alg.Alias.MessageDigest."), c.r, configurableProvider, "BLAKE2B-256", str), "$Blake2b160", configurableProvider, "MessageDigest.BLAKE2B-160", "Alg.Alias.MessageDigest."), c.q, configurableProvider, "BLAKE2B-160");
        }
    }

    private Blake2b() {
    }
}
