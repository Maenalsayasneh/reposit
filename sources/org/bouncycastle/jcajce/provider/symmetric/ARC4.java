package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.w2.n;
import s0.a.b.e0.g0;
import s0.a.b.h;

public final class ARC4 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new g0(), 0);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("RC4", 128, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ARC4.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(sb, str, "$Base", configurableProvider, "Cipher.ARC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", n.T, "ARC4");
            a.u(a.f1(configurableProvider, "Alg.Alias.Cipher.ARCFOUR", "ARC4", "Alg.Alias.Cipher.RC4", "ARC4"), str, "$KeyGen", configurableProvider, "KeyGenerator.ARC4");
            StringBuilder Y0 = a.Y0(a.Y0(a.f1(configurableProvider, "Alg.Alias.KeyGenerator.RC4", "ARC4", "Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4"), str, "$PBEWithSHAAnd128BitKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND128BITRC4"), str, "$PBEWithSHAAnd40BitKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND40BITRC4");
            Y0.append("Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar = n.G0;
            StringBuilder d1 = a.d1(Y0, nVar, configurableProvider, "PKCS12PBE", "Alg.Alias.AlgorithmParameters.");
            s0.a.a.n nVar2 = n.H0;
            a.w(d1, nVar2, configurableProvider, "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
            a.u(a.Y0(a.f1(configurableProvider, "Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE"), str, "$PBEWithSHAAnd128Bit", configurableProvider, "Cipher.PBEWITHSHAAND128BITRC4"), str, "$PBEWithSHAAnd40Bit", configurableProvider, "Cipher.PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", nVar2, "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", nVar2, "PBEWITHSHAAND40BITRC4");
        }
    }

    public static class PBEWithSHAAnd128Bit extends BaseStreamCipher {
        public PBEWithSHAAnd128Bit() {
            super(new g0(), 0, 128, 1);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", n.G0, true, 2, 1, 128, 0);
        }
    }

    public static class PBEWithSHAAnd40Bit extends BaseStreamCipher {
        public PBEWithSHAAnd40Bit() {
            super(new g0(), 0, 40, 1);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", n.G0, true, 2, 1, 40, 0);
        }
    }

    private ARC4() {
    }
}
