package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import s0.a.a.g2.a;
import s0.a.a.n;

public class ECGOST {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.ecgost.";
    private static final String PREFIX_COMMON = "org.bouncycastle.jcajce.provider.asymmetric.ec.";
    private static final String PREFIX_GOST_2012 = "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
            n nVar = a.m;
            registerOid(configurableProvider, nVar, "ECGOST3410", new KeyFactorySpi());
            registerOid(configurableProvider, a.z, "ECGOST3410", new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, nVar, "ECGOST3410");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
            configurableProvider.addAlgorithm("Signature.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
            StringBuilder f1 = i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410", "KeyAgreement.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi$ECVKO");
            f1.append("Alg.Alias.KeyAgreement.");
            f1.append(nVar);
            configurableProvider.addAlgorithm(f1.toString(), "ECGOST3410");
            i0.d.a.a.a.w(i0.d.a.a.a.e1(configurableProvider, "Alg.Alias.KeyAgreement.GOST-3410-2001", "ECGOST3410", "Alg.Alias.KeyAgreement."), a.y, configurableProvider, "ECGOST3410");
            configurableProvider.addAlgorithm("AlgorithmParameters.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            configurableProvider.addAlgorithm("AlgorithmParameters.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.GOST-3410-2001", "ECGOST3410");
            addSignatureAlgorithm(configurableProvider, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", a.o);
            configurableProvider.addAlgorithm("KeyFactory.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2012", "ECGOST3410-2012");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410-2012", "ECGOST3410-2012");
            n nVar2 = s0.a.a.x2.a.g;
            registerOid(configurableProvider, nVar2, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            n nVar3 = s0.a.a.x2.a.l;
            registerOid(configurableProvider, nVar3, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, nVar2, "ECGOST3410-2012");
            n nVar4 = s0.a.a.x2.a.h;
            registerOid(configurableProvider, nVar4, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            n nVar5 = s0.a.a.x2.a.m;
            registerOid(configurableProvider, nVar5, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, nVar4, "ECGOST3410-2012");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST3410-2012", "ECGOST3410-2012");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2012", "ECGOST3410-2012");
            configurableProvider.addAlgorithm("Signature.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECGOST3410-2012-256", "ECGOST3410-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST-3410-2012-256", "ECGOST3410-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST3411WITHECGOST3410-2012-256", "ECGOST3410-2012-256");
            addSignatureAlgorithm(configurableProvider, "GOST3411-2012-256", "ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256", s0.a.a.x2.a.i);
            configurableProvider.addAlgorithm("Signature.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECGOST3410-2012-512", "ECGOST3410-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST-3410-2012-512", "ECGOST3410-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST3411WITHECGOST3410-2012-512", "ECGOST3410-2012-512");
            addSignatureAlgorithm(configurableProvider, "GOST3411-2012-512", "ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512", s0.a.a.x2.a.j);
            StringBuilder f12 = i0.d.a.a.a.f1(configurableProvider, "KeyAgreement.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO256", "KeyAgreement.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO512");
            f12.append("Alg.Alias.KeyAgreement.");
            f12.append(nVar3);
            configurableProvider.addAlgorithm(f12.toString(), "ECGOST3410-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.KeyAgreement." + nVar5, "ECGOST3410-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.KeyAgreement." + nVar2, "ECGOST3410-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.KeyAgreement." + nVar4, "ECGOST3410-2012-512");
        }
    }
}
