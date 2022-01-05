package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import s0.a.a.n;
import s0.a.a.r2.b;
import s0.a.b.b0.c0;
import s0.a.b.b0.z;
import s0.a.b.h;
import s0.a.b.h0.g;

public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new z(i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new z((z) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i, int i2) {
            super(new c0(i), i2);
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new c0((c0) this.digest);
            return bCMessageDigest;
        }

        public byte[] engineDigest() {
            int i = this.digestSize;
            byte[] bArr = new byte[i];
            ((s0.a.b.z) this.digest).b(bArr, 0, i);
            return bArr;
        }
    }

    public static class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    public static class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(224);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i) {
            super(new g(new z(i)));
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(224);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i) {
            super(a.e0("HMACSHA3-", i), i, new h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(sb, str, "$Digest224", configurableProvider, "MessageDigest.SHA3-224"), str, "$Digest256", configurableProvider, "MessageDigest.SHA3-256"), str, "$Digest384", configurableProvider, "MessageDigest.SHA3-384"), str, "$Digest512", configurableProvider, "MessageDigest.SHA3-512");
            a.q(str, "$Digest224", configurableProvider, "MessageDigest", b.i);
            a.q(str, "$Digest256", configurableProvider, "MessageDigest", b.j);
            a.q(str, "$Digest384", configurableProvider, "MessageDigest", b.k);
            n nVar = b.l;
            configurableProvider.addAlgorithm("MessageDigest", nVar, str + "$Digest512");
            a.u(a.Y0(new StringBuilder(), str, "$DigestShake256_512", configurableProvider, "MessageDigest.SHAKE256-512"), str, "$DigestShake128_256", configurableProvider, "MessageDigest.SHAKE128-256");
            a.q(str, "$DigestShake256_512", configurableProvider, "MessageDigest", b.n);
            a.q(str, "$DigestShake128_256", configurableProvider, "MessageDigest", b.m);
            addHMACAlgorithm(configurableProvider, "SHA3-224", a.y0(a.f1(configurableProvider, "Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512", "Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256"), str, "$HashMac224"), a.n0(str, "$KeyGenerator224"));
            addHMACAlias(configurableProvider, "SHA3-224", b.o);
            addHMACAlgorithm(configurableProvider, "SHA3-256", str + "$HashMac256", a.n0(str, "$KeyGenerator256"));
            addHMACAlias(configurableProvider, "SHA3-256", b.p);
            addHMACAlgorithm(configurableProvider, "SHA3-384", str + "$HashMac384", a.n0(str, "$KeyGenerator384"));
            addHMACAlias(configurableProvider, "SHA3-384", b.q);
            addHMACAlgorithm(configurableProvider, "SHA3-512", str + "$HashMac512", a.n0(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "SHA3-512", b.r);
        }
    }

    private SHA3() {
    }
}
