package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.b.k0.b;
import s0.a.b.k0.p;
import s0.a.b.k0.q;
import s0.a.b.k0.r;
import s0.a.b.o0.a;
import s0.a.c.n.l;
import s0.a.c.n.m;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        b c = a.c(((l) keySpec).getEncoded());
        if (c instanceof q) {
            q qVar = (q) c;
            BigInteger bigInteger = qVar.q;
            p pVar = qVar.d;
            return engineGeneratePrivate(new DSAPrivateKeySpec(bigInteger, pVar.q, pVar.d, pVar.c));
        }
        throw new IllegalArgumentException("openssh private key is not dsa privare key");
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("invalid KeySpec: "))) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else if (!(keySpec instanceof m)) {
            return super.engineGeneratePublic(keySpec);
        } else {
            b S2 = m0.r.t.a.r.m.a1.a.S2(((m) keySpec).getEncoded());
            if (S2 instanceof r) {
                r rVar = (r) S2;
                BigInteger bigInteger = rVar.y;
                p pVar = rVar.d;
                return engineGeneratePublic(new DSAPublicKeySpec(bigInteger, pVar.q, pVar.d, pVar.c));
            }
            throw new IllegalArgumentException("openssh public key is not dsa public key");
        }
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        } else if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        } else if (cls.isAssignableFrom(m.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new m(m0.r.t.a.r.m.a1.a.m1(new r(dSAPublicKey2.getY(), new p(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("unable to produce encoding: ")));
            }
        } else if (cls.isAssignableFrom(l.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new l(a.b(new q(dSAPrivateKey2.getX(), new p(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e2) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e2, i0.d.a.a.a.P0("unable to produce encoding: ")));
            }
        } else if (cls.isAssignableFrom(s0.a.d.e.r.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey3 = (DSAPublicKey) key;
            try {
                return new s0.a.d.e.r(m0.r.t.a.r.m.a1.a.m1(new r(dSAPublicKey3.getY(), new p(dSAPublicKey3.getParams().getP(), dSAPublicKey3.getParams().getQ(), dSAPublicKey3.getParams().getG()))));
            } catch (IOException e3) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e3, i0.d.a.a.a.P0("unable to produce encoding: ")));
            }
        } else if (!cls.isAssignableFrom(s0.a.d.e.q.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DSAPrivateKey dSAPrivateKey3 = (DSAPrivateKey) key;
            try {
                return new s0.a.d.e.q(a.b(new q(dSAPrivateKey3.getX(), new p(dSAPrivateKey3.getParams().getP(), dSAPrivateKey3.getParams().getQ(), dSAPrivateKey3.getParams().getG()))));
            } catch (IOException e4) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e4, i0.d.a.a.a.P0("unable to produce encoding: ")));
            }
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(s0.a.a.w2.p pVar) throws IOException {
        n nVar = pVar.d.c;
        if (DSAUtil.isDsaOid(nVar)) {
            return new BCDSAPrivateKey(pVar);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        n nVar = m0Var.c.c;
        if (DSAUtil.isDsaOid(nVar)) {
            return new BCDSAPublicKey(m0Var);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }
}
