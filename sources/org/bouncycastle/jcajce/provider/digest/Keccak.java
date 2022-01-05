package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.b.b0.l;
import s0.a.b.h;
import s0.a.b.h0.g;

public class Keccak {

    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i) {
            super(new l(i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new l((l) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new g(new l(224)));
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new g(new l(256)));
        }
    }

    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new g(new l(288)));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new g(new l(384)));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new g(new l(512)));
        }
    }

    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", 224, new h());
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new h());
        }
    }

    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new h());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", 384, new h());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Keccak.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "KECCAK224", a.y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$Digest224", configurableProvider, "MessageDigest.KECCAK-224"), str, "$Digest288", configurableProvider, "MessageDigest.KECCAK-288"), str, "$Digest256", configurableProvider, "MessageDigest.KECCAK-256"), str, "$Digest384", configurableProvider, "MessageDigest.KECCAK-384"), str, "$Digest512", configurableProvider, "MessageDigest.KECCAK-512"), str, "$HashMac224"), a.n0(str, "$KeyGenerator224"));
            addHMACAlgorithm(configurableProvider, "KECCAK256", a.y0(new StringBuilder(), str, "$HashMac256"), a.n0(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "KECCAK288", a.y0(new StringBuilder(), str, "$HashMac288"), a.n0(str, "$KeyGenerator288"));
            addHMACAlgorithm(configurableProvider, "KECCAK384", a.y0(new StringBuilder(), str, "$HashMac384"), a.n0(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "KECCAK512", a.y0(new StringBuilder(), str, "$HashMac512"), a.n0(str, "$KeyGenerator512"));
        }
    }

    private Keccak() {
    }
}
