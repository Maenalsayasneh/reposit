package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e0.e1;
import s0.a.b.h;

public final class XSalsa20 {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "XSalsa20 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new e1(), 24);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XSalsa20", 256, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = XSalsa20.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(sb, str, "$Base", configurableProvider, "Cipher.XSALSA20"), str, "$KeyGen", configurableProvider, "KeyGenerator.XSALSA20"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.XSALSA20");
        }
    }

    private XSalsa20() {
    }
}
