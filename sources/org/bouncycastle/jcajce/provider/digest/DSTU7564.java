package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.a3.e;
import s0.a.a.n;
import s0.a.b.b0.c;
import s0.a.b.h;
import s0.a.b.h0.d;

public class DSTU7564 {

    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i) {
            super(new c(i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new c((c) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new d(256));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new d(384));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new d(512));
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new h());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", 384, new h());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = DSTU7564.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$Digest256", configurableProvider, "MessageDigest.DSTU7564-256"), str, "$Digest384", configurableProvider, "MessageDigest.DSTU7564-384"), str, "$Digest512", configurableProvider, "MessageDigest.DSTU7564-512");
            a.q(str, "$Digest256", configurableProvider, "MessageDigest", e.d);
            a.q(str, "$Digest384", configurableProvider, "MessageDigest", e.e);
            n nVar = e.f;
            configurableProvider.addAlgorithm("MessageDigest", nVar, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", a.y0(new StringBuilder(), str, "$HashMac256"), a.n0(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", a.y0(new StringBuilder(), str, "$HashMac384"), a.n0(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", a.y0(new StringBuilder(), str, "$HashMac512"), a.n0(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "DSTU7564-256", e.g);
            addHMACAlias(configurableProvider, "DSTU7564-384", e.h);
            addHMACAlias(configurableProvider, "DSTU7564-512", e.i);
        }
    }

    private DSTU7564() {
    }
}
