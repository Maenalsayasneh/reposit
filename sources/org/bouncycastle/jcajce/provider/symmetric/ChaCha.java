package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.b.e0.l;
import s0.a.b.e0.m;
import s0.a.b.h;
import s0.a.b.i0.b;
import s0.a.b.i0.g;

public final class ChaCha {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    public static class AlgParamsCC1305 extends IvAlgorithmParameters {
        public String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new m(), 8);
        }
    }

    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new l(), 12);
        }
    }

    public static class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((b) new g(), true, 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new h());
        }
    }

    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ChaCha.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$Base", configurableProvider, "Cipher.CHACHA"), str, "$KeyGen", configurableProvider, "KeyGenerator.CHACHA"), str, "$Base7539", configurableProvider, "Cipher.CHACHA7539"), str, "$KeyGen7539", configurableProvider, "KeyGenerator.CHACHA7539"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            StringBuilder f1 = a.f1(configurableProvider, "Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539", "Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            f1.append("Alg.Alias.KeyGenerator.");
            n nVar = s0.a.a.w2.n.f67t0;
            a.w(a.d1(a.d1(a.d1(a.b1(a.b1(a.d1(f1, nVar, configurableProvider, "CHACHA7539", str), "$BaseCC20P1305", configurableProvider, "Cipher.CHACHA20-POLY1305", str), "$AlgParamsCC1305", configurableProvider, "AlgorithmParameters.CHACHA20-POLY1305", "Alg.Alias.Cipher."), nVar, configurableProvider, "CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters."), nVar, configurableProvider, "CHACHA20-POLY1305", "Alg.Alias.Cipher.OID."), nVar, configurableProvider, "CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.OID."), nVar, configurableProvider, "CHACHA20-POLY1305");
        }
    }

    private ChaCha() {
    }
}
