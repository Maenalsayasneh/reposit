package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.a.n;
import s0.a.b.b0.g0;
import s0.a.b.h;
import s0.a.b.h0.g;

public class Tiger {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new g0());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new g0((g0) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new g0()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Tiger.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "TIGER", a.y0(a.Y0(a.Y0(sb, str, "$Digest", configurableProvider, "MessageDigest.TIGER"), str, "$Digest", configurableProvider, "MessageDigest.Tiger"), str, "$HashMac"), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "TIGER", s0.a.a.l2.a.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            a.v(sb2, "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACTIGER");
        }
    }

    public static class PBEWithHashMac extends BaseMac {
        public PBEWithHashMac() {
            super(new g(new g0()), 2, 3, 192);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", (n) null, false, 2, 3, 192, 0);
        }
    }

    public static class TigerHmac extends BaseMac {
        public TigerHmac() {
            super(new g(new g0()));
        }
    }

    private Tiger() {
    }
}
