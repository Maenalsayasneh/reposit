package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.s;
import s0.a.a.w2.j;
import s0.a.a.w2.n;

public class PBEPBKDF1 {

    public static class AlgParams extends BaseAlgorithmParameters {
        public j params;

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
                this.params = new j(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            this.params = bArr instanceof j ? (j) bArr : bArr != null ? new j(s.B(bArr)) : null;
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameters format in PBKDF2 parameters object");
        }

        public String engineToString() {
            return "PBKDF1 Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                j jVar = this.params;
                return new PBEParameterSpec(jVar.d.c, jVar.c.E().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF1 PBE parameters object.");
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPBKDF1.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder Y0 = a.Y0(new StringBuilder(), PREFIX, "$AlgParams", configurableProvider, "AlgorithmParameters.PBKDF1");
            Y0.append("Alg.Alias.AlgorithmParameters.");
            a.w(a.d1(a.d1(a.d1(a.d1(Y0, n.I, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), n.K, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), n.L, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), n.M, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), n.N, configurableProvider, "PBKDF1");
        }
    }

    private PBEPBKDF1() {
    }
}
