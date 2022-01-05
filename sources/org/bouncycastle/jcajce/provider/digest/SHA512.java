package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.r2.b;
import s0.a.a.w2.n;
import s0.a.b.b0.a0;
import s0.a.b.b0.b0;
import s0.a.b.h;
import s0.a.b.h0.g;
import s0.a.b.h0.k;

public class SHA512 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new a0());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new a0((a0) this.digest);
            return digest;
        }
    }

    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i) {
            super(new b0(i));
        }

        public Object clone() throws CloneNotSupportedException {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new b0((b0) this.digest);
            return digestT;
        }
    }

    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new a0()));
        }
    }

    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new g(new b0(224)));
        }
    }

    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new g(new b0(256)));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new h());
        }
    }

    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new h());
        }
    }

    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA512.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-512");
            a.v(a.d1(a.e1(configurableProvider, "Alg.Alias.MessageDigest.SHA512", "SHA-512", "Alg.Alias.MessageDigest."), b.e, configurableProvider, "SHA-512", str), "$DigestT224", configurableProvider, "MessageDigest.SHA-512/224");
            a.v(a.d1(a.e1(configurableProvider, "Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224", "Alg.Alias.MessageDigest."), b.g, configurableProvider, "SHA-512/224", str), "$DigestT256", configurableProvider, "MessageDigest.SHA-512/256");
            StringBuilder b1 = a.b1(a.b1(a.d1(a.e1(configurableProvider, "Alg.Alias.MessageDigest.SHA512256", "SHA-512/256", "Alg.Alias.MessageDigest."), b.h, configurableProvider, "SHA-512/256", str), "$OldSHA512", configurableProvider, "Mac.OLDHMACSHA512", str), "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA512", str);
            b1.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", b1.toString(), a.n0(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA512", n.c0);
            addHMACAlgorithm(configurableProvider, "SHA512/224", str + "$HashMacT224", a.n0(str, "$KeyGeneratorT224"));
            addHMACAlgorithm(configurableProvider, "SHA512/256", a.y0(new StringBuilder(), str, "$HashMacT256"), a.n0(str, "$KeyGeneratorT256"));
        }
    }

    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new k(new a0()));
        }
    }

    private SHA512() {
    }
}
