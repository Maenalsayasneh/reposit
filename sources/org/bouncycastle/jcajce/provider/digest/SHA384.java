package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.r2.b;
import s0.a.a.w2.n;
import s0.a.b.b0.y;
import s0.a.b.h;
import s0.a.b.h0.g;
import s0.a.b.h0.k;

public class SHA384 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new y());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new y((y) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new y()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", 384, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA384.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-384");
            StringBuilder b1 = a.b1(a.b1(a.d1(a.e1(configurableProvider, "Alg.Alias.MessageDigest.SHA384", "SHA-384", "Alg.Alias.MessageDigest."), b.d, configurableProvider, "SHA-384", str), "$OldSHA384", configurableProvider, "Mac.OLDHMACSHA384", str), "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA384", str);
            b1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA384", b1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA384", n.b0);
        }
    }

    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new k(new y()));
        }
    }

    private SHA384() {
    }
}
