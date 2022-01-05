package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import s0.a.a.c3.m0;
import s0.a.a.d3.m;
import s0.a.a.n;
import s0.a.a.v2.b;
import s0.a.a.w2.p;
import s0.a.d.e.j;
import s0.a.d.e.k;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof j ? new BCElGamalPrivateKey((j) keySpec) : keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof k ? new BCElGamalPublicKey((k) keySpec) : keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        } else if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof ElGamalPublicKey) {
            return new BCElGamalPublicKey((ElGamalPublicKey) key);
        }
        if (key instanceof ElGamalPrivateKey) {
            return new BCElGamalPrivateKey((ElGamalPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        n nVar = pVar.d.c;
        if (nVar.w(s0.a.a.w2.n.G)) {
            return new BCElGamalPrivateKey(pVar);
        }
        if (nVar.w(m.U1)) {
            return new BCElGamalPrivateKey(pVar);
        }
        if (nVar.w(b.i)) {
            return new BCElGamalPrivateKey(pVar);
        }
        throw new IOException(a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        n nVar = m0Var.c.c;
        if (nVar.w(s0.a.a.w2.n.G)) {
            return new BCElGamalPublicKey(m0Var);
        }
        if (nVar.w(m.U1)) {
            return new BCElGamalPublicKey(m0Var);
        }
        if (nVar.w(b.i)) {
            return new BCElGamalPublicKey(m0Var);
        }
        throw new IOException(a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }
}
