package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.a.n;
import s0.a.a.v2.b;
import s0.a.b.b0.v;
import s0.a.b.h;
import s0.a.b.h0.g;

public class SHA1 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new v());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new v((v) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new v()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", 160, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA1.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-1");
            StringBuilder f1 = a.f1(configurableProvider, "Alg.Alias.MessageDigest.SHA1", "SHA-1", "Alg.Alias.MessageDigest.SHA", "SHA-1");
            f1.append("Alg.Alias.MessageDigest.");
            n nVar = b.f;
            StringBuilder d1 = a.d1(f1, nVar, configurableProvider, "SHA-1", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA1", d1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA1", s0.a.a.w2.n.Y);
            addHMACAlias(configurableProvider, "SHA1", s0.a.a.l2.a.g);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            a.v(a.b1(sb2, "$SHA1Mac", configurableProvider, "Mac.PBEWITHHMACSHA", str), "$SHA1Mac", configurableProvider, "Mac.PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + nVar, "PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA1", a.M0(configurableProvider, "Alg.Alias.Mac." + nVar, "PBEWITHHMACSHA", str, "$PBEWithMacKeyFactory"));
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", (n) null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new g(new v()));
        }
    }

    private SHA1() {
    }
}
