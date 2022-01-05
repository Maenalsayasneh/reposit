package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.r;
import s0.a.a.w2.m;

public class PBEPKCS12 {

    public static class AlgParams extends BaseAlgorithmParameters {
        public m params;

        public byte[] engineGetEncoded() {
            try {
                return this.params.r("DER");
            } catch (IOException e) {
                StringBuilder P0 = a.P0("Oooops! ");
                P0.append(e.toString());
                throw new RuntimeException(P0.toString());
            }
        }

        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.params = new m(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            this.params = m.s(r.x(bArr));
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameters format in PKCS12 PBE parameters object");
        }

        public String engineToString() {
            return "PKCS12 PBE Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                m mVar = this.params;
                return new PBEParameterSpec(mVar.d.c, mVar.t().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPKCS12.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            a.u(new StringBuilder(), PREFIX, "$AlgParams", configurableProvider, "AlgorithmParameters.PKCS12PBE");
        }
    }

    private PBEPKCS12() {
    }
}
