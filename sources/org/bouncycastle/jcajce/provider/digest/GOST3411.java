package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import s0.a.a.n;
import s0.a.b.b0.d;
import s0.a.b.b0.f;
import s0.a.b.b0.g;
import s0.a.b.h;

public class GOST3411 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new d());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new d((d) this.digest);
            return digest;
        }
    }

    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new f());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new f((f) this.digest);
            return digest2012_256;
        }
    }

    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new g());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new g((g) this.digest);
            return digest2012_512;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new s0.a.b.h0.g(new d()));
        }
    }

    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new s0.a.b.h0.g(new f()));
        }
    }

    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new s0.a.b.h0.g(new g()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new h());
        }
    }

    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new h());
        }
    }

    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = GOST3411.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.GOST3411");
            StringBuilder f1 = a.f1(configurableProvider, "Alg.Alias.MessageDigest.GOST", "GOST3411", "Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            f1.append("Alg.Alias.MessageDigest.");
            n nVar = s0.a.a.g2.a.b;
            StringBuilder d1 = a.d1(f1, nVar, configurableProvider, "GOST3411", str);
            d1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "GOST3411", d1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "GOST3411", nVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            a.v(sb2, "$Digest2012_256", configurableProvider, "MessageDigest.GOST3411-2012-256");
            StringBuilder f12 = a.f1(configurableProvider, "Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256", "Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            f12.append("Alg.Alias.MessageDigest.");
            StringBuilder d12 = a.d1(f12, s0.a.a.x2.a.c, configurableProvider, "GOST3411-2012-256", str);
            d12.append("$HashMac2012_256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", d12.toString(), a.n0(str, "$KeyGenerator2012_256"));
            addHMACAlias(configurableProvider, "GOST3411-2012-256", s0.a.a.x2.a.e);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            a.v(sb3, "$Digest2012_512", configurableProvider, "MessageDigest.GOST3411-2012-512");
            StringBuilder f13 = a.f1(configurableProvider, "Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512", "Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            f13.append("Alg.Alias.MessageDigest.");
            StringBuilder d13 = a.d1(f13, s0.a.a.x2.a.d, configurableProvider, "GOST3411-2012-512", str);
            d13.append("$HashMac2012_512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", d13.toString(), a.n0(str, "$KeyGenerator2012_512"));
            addHMACAlias(configurableProvider, "GOST3411-2012-512", s0.a.a.x2.a.f);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            a.w(a.b1(sb4, "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACGOST3411", "Alg.Alias.SecretKeyFactory."), nVar, configurableProvider, "PBEWITHHMACGOST3411");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", (n) null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}
