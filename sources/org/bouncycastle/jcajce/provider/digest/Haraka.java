package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import s0.a.b.b0.i;
import s0.a.b.b0.j;

public class Haraka {

    public static class Digest256 extends BCMessageDigest implements Cloneable {
        public Digest256() {
            super(new i());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest256 digest256 = (Digest256) super.clone();
            digest256.digest = new i((i) this.digest);
            return digest256;
        }
    }

    public static class Digest512 extends BCMessageDigest implements Cloneable {
        public Digest512() {
            super(new j());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest512 digest512 = (Digest512) super.clone();
            digest512.digest = new j((j) this.digest);
            return digest512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Haraka.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(sb, str, "$Digest256", configurableProvider, "MessageDigest.HARAKA-256"), str, "$Digest512", configurableProvider, "MessageDigest.HARAKA-512");
        }
    }

    private Haraka() {
    }
}
