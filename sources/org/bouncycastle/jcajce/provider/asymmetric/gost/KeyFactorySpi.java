package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import s0.a.a.c3.m0;
import s0.a.a.g2.a;
import s0.a.a.w2.p;
import s0.a.d.e.l;
import s0.a.d.e.m;
import s0.a.d.e.n;
import s0.a.d.e.o;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof m ? new BCGOST3410PrivateKey((m) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof o ? new BCGOST3410PublicKey((o) keySpec) : super.engineGeneratePublic(keySpec);
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(o.class) && (key instanceof GOST3410PublicKey)) {
            GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) key;
            n nVar = ((l) gOST3410PublicKey.getParameters()).a;
            return new o(gOST3410PublicKey.getY(), nVar.a, nVar.b, nVar.c);
        } else if (!cls.isAssignableFrom(m.class) || !(key instanceof GOST3410PrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) key;
            n nVar2 = ((l) gOST3410PrivateKey.getParameters()).a;
            return new m(gOST3410PrivateKey.getX(), nVar2.a, nVar2.b, nVar2.c);
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof GOST3410PublicKey) {
            return new BCGOST3410PublicKey((GOST3410PublicKey) key);
        }
        if (key instanceof GOST3410PrivateKey) {
            return new BCGOST3410PrivateKey((GOST3410PrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        s0.a.a.n nVar = pVar.d.c;
        if (nVar.w(a.l)) {
            return new BCGOST3410PrivateKey(pVar);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        s0.a.a.n nVar = m0Var.c.c;
        if (nVar.w(a.l)) {
            return new BCGOST3410PublicKey(m0Var);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }
}
