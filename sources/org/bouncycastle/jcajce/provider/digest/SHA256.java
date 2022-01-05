package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.a.n;
import s0.a.a.r2.b;
import s0.a.b.b0.x;
import s0.a.b.h;
import s0.a.b.h0.g;

public class SHA256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new x());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new x((x) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new x()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", 256, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA256.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-256");
            StringBuilder e1 = a.e1(configurableProvider, "Alg.Alias.MessageDigest.SHA256", "SHA-256", "Alg.Alias.MessageDigest.");
            n nVar = b.c;
            a.v(a.d1(e1, nVar, configurableProvider, "SHA-256", str), "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACSHA256");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            addHMACAlgorithm(configurableProvider, "SHA256", a.M0(configurableProvider, "Mac.PBEWITHHMACSHA256", a.M0(configurableProvider, "Alg.Alias.SecretKeyFactory." + nVar, "PBEWITHHMACSHA256", str, "$HashMac"), str, "$HashMac"), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA256", s0.a.a.w2.n.a0);
            addHMACAlias(configurableProvider, "SHA256", nVar);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", (n) null, false, 2, 4, 256, 0);
        }
    }

    private SHA256() {
    }
}
