package org.bouncycastle.jcajce.provider.util;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import s0.a.a.n;

public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, n nVar) {
        String o02 = a.o0(str, "WITH", str2);
        String o03 = a.o0(str, "with", str2);
        String o04 = a.o0(str, "With", str2);
        String o05 = a.o0(str, "/", str2);
        configurableProvider.addAlgorithm("Signature." + o02, str3);
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.Signature.");
        a.w(a.d1(a.a1(a.a1(a.a1(sb, o03, configurableProvider, o02, "Alg.Alias.Signature."), o04, configurableProvider, o02, "Alg.Alias.Signature."), o05, configurableProvider, o02, "Alg.Alias.Signature."), nVar, configurableProvider, o02, "Alg.Alias.Signature.OID."), nVar, configurableProvider, o02);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, n nVar) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.Signature.");
        a.w(a.d1(sb, nVar, configurableProvider, str, "Alg.Alias.Signature.OID."), nVar, configurableProvider, str);
    }

    public void registerOid(ConfigurableProvider configurableProvider, n nVar, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + nVar, str);
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.KeyPairGenerator.");
        a.w(sb, nVar, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(nVar, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, n nVar, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar, str);
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.AlgorithmParameters.");
        a.w(sb, nVar, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, n nVar, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + nVar, str);
    }
}
