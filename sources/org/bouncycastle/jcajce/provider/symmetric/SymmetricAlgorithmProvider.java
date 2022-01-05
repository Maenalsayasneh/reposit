package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder V0 = a.V0(str, "-CMAC", configurableProvider, a.z0(new StringBuilder(), "Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.");
        V0.append(str);
        V0.append("-CMAC");
        configurableProvider.addAlgorithm(V0.toString(), str3);
        String z0 = a.z0(new StringBuilder(), "Alg.Alias.KeyGenerator.", str, "CMAC");
        configurableProvider.addAlgorithm(z0, str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder V0 = a.V0(str, "-GMAC", configurableProvider, a.z0(new StringBuilder(), "Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.");
        V0.append(str);
        V0.append("-GMAC");
        configurableProvider.addAlgorithm(V0.toString(), str3);
        String z0 = a.z0(new StringBuilder(), "Alg.Alias.KeyGenerator.", str, "GMAC");
        configurableProvider.addAlgorithm(z0, str + "-GMAC");
    }

    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        StringBuilder a1 = a.a1(a.V0("POLY1305-", str, configurableProvider, "Alg.Alias.Mac.POLY1305" + str, "KeyGenerator.POLY1305-"), str, configurableProvider, str3, "Alg.Alias.KeyGenerator.POLY1305");
        a1.append(str);
        String sb = a1.toString();
        configurableProvider.addAlgorithm(sb, "POLY1305-" + str);
    }
}
