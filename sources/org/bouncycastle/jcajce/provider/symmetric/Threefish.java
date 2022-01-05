package org.bouncycastle.jcajce.provider.symmetric;

import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.b.e;
import s0.a.b.e0.z0;
import s0.a.b.h;
import s0.a.b.h0.c;

public final class Threefish {

    public static class AlgParams_1024 extends IvAlgorithmParameters {
        public String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    public static class AlgParams_256 extends IvAlgorithmParameters {
        public String engineToString() {
            return "Threefish-256 IV";
        }
    }

    public static class AlgParams_512 extends IvAlgorithmParameters {
        public String engineToString() {
            return "Threefish-512 IV";
        }
    }

    public static class CMAC_1024 extends BaseMac {
        public CMAC_1024() {
            super(new c(new z0(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE)));
        }
    }

    public static class CMAC_256 extends BaseMac {
        public CMAC_256() {
            super(new c(new z0(256)));
        }
    }

    public static class CMAC_512 extends BaseMac {
        public CMAC_512() {
            super(new c(new z0(512)));
        }
    }

    public static class ECB_1024 extends BaseBlockCipher {
        public ECB_1024() {
            super((e) new z0(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super((e) new z0(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super((e) new z0(512));
        }
    }

    public static class KeyGen_1024 extends BaseKeyGenerator {
        public KeyGen_1024() {
            super("Threefish-1024", RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, new h());
        }
    }

    public static class KeyGen_256 extends BaseKeyGenerator {
        public KeyGen_256() {
            super("Threefish-256", 256, new h());
        }
    }

    public static class KeyGen_512 extends BaseKeyGenerator {
        public KeyGen_512() {
            super("Threefish-512", 512, new h());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Threefish.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$CMAC_256", configurableProvider, "Mac.Threefish-256CMAC"), str, "$CMAC_512", configurableProvider, "Mac.Threefish-512CMAC"), str, "$CMAC_1024", configurableProvider, "Mac.Threefish-1024CMAC"), str, "$ECB_256", configurableProvider, "Cipher.Threefish-256"), str, "$ECB_512", configurableProvider, "Cipher.Threefish-512"), str, "$ECB_1024", configurableProvider, "Cipher.Threefish-1024"), str, "$KeyGen_256", configurableProvider, "KeyGenerator.Threefish-256"), str, "$KeyGen_512", configurableProvider, "KeyGenerator.Threefish-512"), str, "$KeyGen_1024", configurableProvider, "KeyGenerator.Threefish-1024"), str, "$AlgParams_256", configurableProvider, "AlgorithmParameters.Threefish-256"), str, "$AlgParams_512", configurableProvider, "AlgorithmParameters.Threefish-512"), str, "$AlgParams_1024", configurableProvider, "AlgorithmParameters.Threefish-1024");
        }
    }

    private Threefish() {
    }
}
