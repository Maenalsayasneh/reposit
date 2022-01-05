package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.a.n;
import s0.a.a.z2.b;
import s0.a.b.b0.s;
import s0.a.b.h;
import s0.a.b.h0.g;

public class RIPEMD160 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new s());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new s((s) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new s()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", 160, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD160.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            StringBuilder Y0 = a.Y0(sb, str, "$Digest", configurableProvider, "MessageDigest.RIPEMD160");
            Y0.append("Alg.Alias.MessageDigest.");
            StringBuilder d1 = a.d1(Y0, b.b, configurableProvider, "RIPEMD160", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD160", d1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "RIPEMD160", s0.a.a.l2.a.i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            a.v(a.b1(sb2, "$PBEWithHmacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACRIPEMD160", str), "$PBEWithHmac", configurableProvider, "Mac.PBEWITHHMACRIPEMD160");
        }
    }

    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new g(new s()), 2, 2, 160);
        }
    }

    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", (n) null, false, 2, 2, 160, 0);
        }
    }

    private RIPEMD160() {
    }
}
