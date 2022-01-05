package org.bouncycastle.jcajce.provider.digest;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;

public abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String n02 = a.n0("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + n02, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.Mac.HMAC-");
        StringBuilder a1 = a.a1(a.a1(a.a1(a.a1(sb, str, configurableProvider, n02, "Alg.Alias.Mac.HMAC/"), str, configurableProvider, n02, "KeyGenerator."), n02, configurableProvider, str3, "Alg.Alias.KeyGenerator.HMAC-"), str, configurableProvider, n02, "Alg.Alias.KeyGenerator.HMAC/");
        a1.append(str);
        configurableProvider.addAlgorithm(a1.toString(), n02);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, n nVar) {
        String n02 = a.n0("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + nVar, n02);
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.KeyGenerator.");
        a.w(sb, nVar, configurableProvider, n02);
    }
}
