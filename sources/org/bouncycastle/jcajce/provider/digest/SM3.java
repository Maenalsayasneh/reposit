package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.j2.b;
import s0.a.b.b0.d0;
import s0.a.b.h;
import s0.a.b.h0.g;

public class SM3 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new d0());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new d0((d0) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new d0()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSM3", 256, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SM3.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.SM3");
            StringBuilder f1 = a.f1(configurableProvider, "Alg.Alias.MessageDigest.SM3", "SM3", "Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
            f1.append("Alg.Alias.MessageDigest.");
            StringBuilder d1 = a.d1(f1, b.p, configurableProvider, "SM3", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SM3", d1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SM3", b.q);
        }
    }

    private SM3() {
    }
}
