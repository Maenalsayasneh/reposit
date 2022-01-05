package org.bouncycastle.jcajce.provider.asymmetric;

import i0.d.a.a.a;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import s0.a.a.j2.b;

public class GM {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.ec.";
    private static final Map<String, String> generalSm2Attributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        public void configure(ConfigurableProvider configurableProvider) {
            a.w(a.e1(configurableProvider, "Signature.SHA256WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sha256WithSM2", "Alg.Alias.Signature."), b.s, configurableProvider, "SHA256WITHSM2");
            a.w(a.e1(configurableProvider, "Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2", "Alg.Alias.Signature."), b.r, configurableProvider, "SM3WITHSM2");
            StringBuilder f1 = a.f1(configurableProvider, "Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2", "Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            f1.append("Alg.Alias.Cipher.");
            a.w(f1, b.e, configurableProvider, "SM2");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b", "Alg.Alias.Cipher."), b.m, configurableProvider, "SM2WITHBLAKE2B");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s", "Alg.Alias.Cipher."), b.n, configurableProvider, "SM2WITHBLAKE2S");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool", "Alg.Alias.Cipher."), b.l, configurableProvider, "SM2WITHWHIRLPOOL");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5", "Alg.Alias.Cipher."), b.o, configurableProvider, "SM2WITHMD5");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD", "Alg.Alias.Cipher."), b.k, configurableProvider, "SM2WITHRIPEMD160");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1", "Alg.Alias.Cipher."), b.f, configurableProvider, "SM2WITHSHA1");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224", "Alg.Alias.Cipher."), b.g, configurableProvider, "SM2WITHSHA224");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256", "Alg.Alias.Cipher."), b.h, configurableProvider, "SM2WITHSHA256");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384", "Alg.Alias.Cipher."), b.i, configurableProvider, "SM2WITHSHA384");
            a.w(a.e1(configurableProvider, "Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512", "Alg.Alias.Cipher."), b.j, configurableProvider, "SM2WITHSHA512");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalSm2Attributes = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
