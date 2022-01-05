package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.m0;
import s0.a.a.g2.a;
import s0.a.a.n;
import s0.a.a.w2.p;
import s0.a.d.e.e;
import s0.a.d.e.f;
import s0.a.d.e.g;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof f ? new BCECGOST3410PrivateKey((f) keySpec) : keySpec instanceof ECPrivateKeySpec ? new BCECGOST3410PrivateKey((ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof g ? new BCECGOST3410PublicKey((g) keySpec, BouncyCastleProvider.CONFIGURATION) : keySpec instanceof ECPublicKeySpec ? new BCECGOST3410PublicKey((ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            e ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.a, ecImplicitlyCa.b), ecImplicitlyCa));
        } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            e ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.a, ecImplicitlyCa2.b), ecImplicitlyCa2));
        } else if (cls.isAssignableFrom(g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new g(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new g(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        } else if (!cls.isAssignableFrom(f.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new f(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new f(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        n nVar = pVar.d.c;
        if (nVar.w(a.m)) {
            return new BCECGOST3410PrivateKey(pVar);
        }
        if (nVar.w(a.z)) {
            return new BCECGOST3410PrivateKey(pVar);
        }
        if (nVar.w(a.y)) {
            return new BCECGOST3410PrivateKey(pVar);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        n nVar = m0Var.c.c;
        if (nVar.w(a.m)) {
            return new BCECGOST3410PublicKey(m0Var);
        }
        if (nVar.w(a.z)) {
            return new BCECGOST3410PublicKey(m0Var);
        }
        if (nVar.w(a.y)) {
            return new BCECGOST3410PublicKey(m0Var);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }
}
