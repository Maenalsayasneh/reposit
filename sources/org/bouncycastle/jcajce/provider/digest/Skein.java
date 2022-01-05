package org.bouncycastle.jcajce.provider.digest;

import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.b.b0.e0;
import s0.a.b.h;
import s0.a.b.h0.g;
import s0.a.b.h0.o;

public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i) {
            super(new e0(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new e0((e0) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i) {
            super(new e0(256, i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new e0((e0) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i) {
            super(new e0(512, i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new e0((e0) this.digest);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(384);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(384);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, new h());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", 384, new h());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new h());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new h());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new h());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new h());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new h());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new h());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new h());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new h());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new h());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", 384, new h());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new h());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new g(new e0(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new g(new e0(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 384)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new g(new e0(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 512)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new g(new e0(256, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new g(new e0(256, 160)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new g(new e0(256, 224)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new g(new e0(256, 256)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new g(new e0(512, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new g(new e0(512, 160)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new g(new e0(512, 224)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new g(new e0(512, 256)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new g(new e0(512, 384)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new g(new e0(512, 512)));
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i, int i2) {
            String h02 = a.h0("Skein-MAC-", i, "-", i2);
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$SkeinMac_");
            sb.append(i);
            sb.append("_");
            sb.append(i2);
            configurableProvider.addAlgorithm("Mac." + h02, sb.toString());
            configurableProvider.addAlgorithm(a.M0(configurableProvider, "Alg.Alias.Mac.Skein-MAC" + i + "/" + i2, h02, "KeyGenerator.", h02), str + "$SkeinMacKeyGenerator_" + i + "_" + i2);
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.Skein-MAC" + i + "/" + i2, h02);
        }

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "Skein-256-128", a.y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$Digest_256_128", configurableProvider, "MessageDigest.Skein-256-128"), str, "$Digest_256_160", configurableProvider, "MessageDigest.Skein-256-160"), str, "$Digest_256_224", configurableProvider, "MessageDigest.Skein-256-224"), str, "$Digest_256_256", configurableProvider, "MessageDigest.Skein-256-256"), str, "$Digest_512_128", configurableProvider, "MessageDigest.Skein-512-128"), str, "$Digest_512_160", configurableProvider, "MessageDigest.Skein-512-160"), str, "$Digest_512_224", configurableProvider, "MessageDigest.Skein-512-224"), str, "$Digest_512_256", configurableProvider, "MessageDigest.Skein-512-256"), str, "$Digest_512_384", configurableProvider, "MessageDigest.Skein-512-384"), str, "$Digest_512_512", configurableProvider, "MessageDigest.Skein-512-512"), str, "$Digest_1024_384", configurableProvider, "MessageDigest.Skein-1024-384"), str, "$Digest_1024_512", configurableProvider, "MessageDigest.Skein-1024-512"), str, "$Digest_1024_1024", configurableProvider, "MessageDigest.Skein-1024-1024"), str, "$HashMac_256_128"), a.n0(str, "$HMacKeyGenerator_256_128"));
            addHMACAlgorithm(configurableProvider, "Skein-256-160", a.y0(new StringBuilder(), str, "$HashMac_256_160"), a.n0(str, "$HMacKeyGenerator_256_160"));
            addHMACAlgorithm(configurableProvider, "Skein-256-224", a.y0(new StringBuilder(), str, "$HashMac_256_224"), a.n0(str, "$HMacKeyGenerator_256_224"));
            addHMACAlgorithm(configurableProvider, "Skein-256-256", a.y0(new StringBuilder(), str, "$HashMac_256_256"), a.n0(str, "$HMacKeyGenerator_256_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-128", a.y0(new StringBuilder(), str, "$HashMac_512_128"), a.n0(str, "$HMacKeyGenerator_512_128"));
            addHMACAlgorithm(configurableProvider, "Skein-512-160", a.y0(new StringBuilder(), str, "$HashMac_512_160"), a.n0(str, "$HMacKeyGenerator_512_160"));
            addHMACAlgorithm(configurableProvider, "Skein-512-224", a.y0(new StringBuilder(), str, "$HashMac_512_224"), a.n0(str, "$HMacKeyGenerator_512_224"));
            addHMACAlgorithm(configurableProvider, "Skein-512-256", a.y0(new StringBuilder(), str, "$HashMac_512_256"), a.n0(str, "$HMacKeyGenerator_512_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-384", a.y0(new StringBuilder(), str, "$HashMac_512_384"), a.n0(str, "$HMacKeyGenerator_512_384"));
            addHMACAlgorithm(configurableProvider, "Skein-512-512", a.y0(new StringBuilder(), str, "$HashMac_512_512"), a.n0(str, "$HMacKeyGenerator_512_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", a.y0(new StringBuilder(), str, "$HashMac_1024_384"), a.n0(str, "$HMacKeyGenerator_1024_384"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", a.y0(new StringBuilder(), str, "$HashMac_1024_512"), a.n0(str, "$HMacKeyGenerator_1024_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", a.y0(new StringBuilder(), str, "$HashMac_1024_1024"), a.n0(str, "$HMacKeyGenerator_1024_1024"));
            addSkeinMacAlgorithm(configurableProvider, 256, 128);
            addSkeinMacAlgorithm(configurableProvider, 256, 160);
            addSkeinMacAlgorithm(configurableProvider, 256, 224);
            addSkeinMacAlgorithm(configurableProvider, 256, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 128);
            addSkeinMacAlgorithm(configurableProvider, 512, 160);
            addSkeinMacAlgorithm(configurableProvider, 512, 224);
            addSkeinMacAlgorithm(configurableProvider, 512, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 384);
            addSkeinMacAlgorithm(configurableProvider, 512, 512);
            addSkeinMacAlgorithm(configurableProvider, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 384);
            addSkeinMacAlgorithm(configurableProvider, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 512);
            addSkeinMacAlgorithm(configurableProvider, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, new h());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", 384, new h());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new h());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new h());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new h());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new h());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new h());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new h());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new h());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new h());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new h());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", 384, new h());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new h());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new o(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new o(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 384));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new o(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 512));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new o(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new o(256, 160));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new o(256, 224));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new o(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new o(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new o(512, 160));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new o(512, 224));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new o(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new o(512, 384));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new o(512, 512));
        }
    }

    private Skein() {
    }
}
