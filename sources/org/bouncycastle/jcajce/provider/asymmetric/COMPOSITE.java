package org.bouncycastle.jcajce.provider.asymmetric;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.a.q2.c;
import s0.a.a.s;
import s0.a.a.w2.p;

public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    /* access modifiers changed from: private */
    public static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    public static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        public PrivateKey generatePrivate(p pVar) throws IOException {
            s B = s.B(pVar.t().c);
            PrivateKey[] privateKeyArr = new PrivateKey[B.size()];
            for (int i = 0; i != B.size(); i++) {
                p s = p.s(B.D(i));
                privateKeyArr[i] = this.provider.getKeyInfoConverter(s.d.c).generatePrivate(s);
            }
            return new CompositePrivateKey(privateKeyArr);
        }

        public PublicKey generatePublic(m0 m0Var) throws IOException {
            s B = s.B(m0Var.d.B());
            PublicKey[] publicKeyArr = new PublicKey[B.size()];
            for (int i = 0; i != B.size(); i++) {
                m0 s = m0.s(B.D(i));
                publicKeyArr[i] = this.provider.getKeyInfoConverter(s.c.c).generatePublic(s);
            }
            return new CompositePublicKey(publicKeyArr);
        }
    }

    public static class KeyFactory extends BaseKeyFactorySpi {
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(p.s(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(m0.s(key.getEncoded()));
                }
                throw new InvalidKeyException("key not recognized");
            } catch (IOException e) {
                throw new InvalidKeyException(a.V(e, a.P0("key could not be parsed: ")));
            }
        }

        public PrivateKey generatePrivate(p pVar) throws IOException {
            return COMPOSITE.baseConverter.generatePrivate(pVar);
        }

        public PublicKey generatePublic(m0 m0Var) throws IOException {
            return COMPOSITE.baseConverter.generatePublic(m0Var);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder e1 = a.e1(configurableProvider, "KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            n nVar = c.z;
            StringBuilder d1 = a.d1(e1, nVar, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.");
            d1.append(nVar);
            configurableProvider.addAlgorithm(d1.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(nVar, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        compositeAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
