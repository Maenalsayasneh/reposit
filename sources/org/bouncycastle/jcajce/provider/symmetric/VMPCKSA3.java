package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e0.d1;
import s0.a.b.h;

public final class VMPCKSA3 {

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new d1(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC-KSA3", 128, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = VMPCKSA3.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(sb, str, "$Base", configurableProvider, "Cipher.VMPC-KSA3"), str, "$KeyGen", configurableProvider, "KeyGenerator.VMPC-KSA3");
        }
    }

    private VMPCKSA3() {
    }
}
