package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.r2.b;
import s0.a.a.w2.n;
import s0.a.b.b0.w;
import s0.a.b.h;
import s0.a.b.h0.g;

public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new w());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new w((w) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new w()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-224");
            StringBuilder b1 = a.b1(a.d1(a.e1(configurableProvider, "Alg.Alias.MessageDigest.SHA224", "SHA-224", "Alg.Alias.MessageDigest."), b.f, configurableProvider, "SHA-224", str), "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA224", str);
            b1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", b1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA224", n.Z);
        }
    }

    private SHA224() {
    }
}
