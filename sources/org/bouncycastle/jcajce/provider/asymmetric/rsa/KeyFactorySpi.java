package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import s0.a.a.c3.m0;
import s0.a.a.n;
import s0.a.a.w2.p;
import s0.a.a.w2.s;
import s0.a.b.k0.b;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;
import s0.a.c.n.l;
import s0.a.c.n.m;
import s0.a.d.e.q;
import s0.a.d.e.r;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(p.s(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                try {
                    return new BCRSAPrivateCrtKey(s.s(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception unused) {
                    throw new ExtendedInvalidKeySpecException(a.b0(e, a.P0("unable to process key spec: ")), e);
                }
            }
        } else if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec) keySpec);
        } else {
            if (keySpec instanceof RSAPrivateKeySpec) {
                return new BCRSAPrivateKey((RSAPrivateKeySpec) keySpec);
            }
            if (keySpec instanceof l) {
                b c = s0.a.b.o0.a.c(((l) keySpec).getEncoded());
                if (c instanceof l1) {
                    return new BCRSAPrivateCrtKey((l1) c);
                }
                throw new InvalidKeySpecException("open SSH public key is not RSA private key");
            }
            StringBuilder P0 = a.P0("unknown KeySpec type: ");
            P0.append(keySpec.getClass().getName());
            throw new InvalidKeySpecException(P0.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof RSAPublicKeySpec) {
            return new BCRSAPublicKey((RSAPublicKeySpec) keySpec);
        }
        if (!(keySpec instanceof m)) {
            return super.engineGeneratePublic(keySpec);
        }
        b S2 = m0.r.t.a.r.m.a1.a.S2(((m) keySpec).getEncoded());
        if (S2 instanceof k1) {
            return new BCRSAPublicKey((k1) S2);
        }
        throw new InvalidKeySpecException("Open SSH public key is not RSA public key");
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(RSAPublicKeySpec.class)) && (key instanceof RSAPublicKey)) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        } else if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(RSAPrivateCrtKeySpec.class)) && (key instanceof RSAPrivateCrtKey)) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        } else if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(RSAPrivateKeySpec.class)) && (key instanceof RSAPrivateKey)) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        } else if (cls.isAssignableFrom(m.class) && (key instanceof RSAPublicKey)) {
            try {
                return new m(m0.r.t.a.r.m.a1.a.m1(new k1(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent())));
            } catch (IOException e) {
                throw new IllegalArgumentException(a.V(e, a.P0("unable to produce encoding: ")));
            }
        } else if (cls.isAssignableFrom(l.class) && (key instanceof RSAPrivateCrtKey)) {
            try {
                return new l(s0.a.b.o0.a.b(new l1(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient())));
            } catch (IOException e2) {
                throw new IllegalArgumentException(a.V(e2, a.P0("unable to produce encoding: ")));
            }
        } else if (cls.isAssignableFrom(r.class) && (key instanceof RSAPublicKey)) {
            try {
                return new r(m0.r.t.a.r.m.a1.a.m1(new k1(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent())));
            } catch (IOException e3) {
                throw new IllegalArgumentException(a.V(e3, a.P0("unable to produce encoding: ")));
            }
        } else if (!cls.isAssignableFrom(q.class) || !(key instanceof RSAPrivateCrtKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            try {
                return new q(s0.a.b.o0.a.b(new l1(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient())));
            } catch (IOException e4) {
                throw new IllegalArgumentException(a.V(e4, a.P0("unable to produce encoding: ")));
            }
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof RSAPublicKey) {
            return new BCRSAPublicKey((RSAPublicKey) key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey) key);
        }
        if (key instanceof RSAPrivateKey) {
            return new BCRSAPrivateKey((RSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        n nVar = pVar.d.c;
        if (RSAUtil.isRsaOid(nVar)) {
            s s = s.s(pVar.u());
            return s.b2.intValue() == 0 ? new BCRSAPrivateKey(pVar.d, s) : new BCRSAPrivateCrtKey(pVar);
        }
        throw new IOException(a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        n nVar = m0Var.c.c;
        if (RSAUtil.isRsaOid(nVar)) {
            return new BCRSAPublicKey(m0Var);
        }
        throw new IOException(a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }
}
