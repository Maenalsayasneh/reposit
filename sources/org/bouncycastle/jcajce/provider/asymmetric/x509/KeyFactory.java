package org.bouncycastle.jcajce.provider.asymmetric.x509;

import i0.d.a.a.a;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.m0;
import s0.a.a.w2.p;

public class KeyFactory extends KeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                p s = p.s(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(s);
                if (privateKey != null) {
                    return privateKey;
                }
                throw new InvalidKeySpecException("no factory found for OID: " + s.d.c);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder P0 = a.P0("Unknown KeySpec type: ");
            P0.append(keySpec.getClass().getName());
            throw new InvalidKeySpecException(P0.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                m0 s = m0.s(((X509EncodedKeySpec) keySpec).getEncoded());
                PublicKey publicKey = BouncyCastleProvider.getPublicKey(s);
                if (publicKey != null) {
                    return publicKey;
                }
                throw new InvalidKeySpecException("no factory found for OID: " + s.c.c);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder P0 = a.P0("Unknown KeySpec type: ");
            P0.append(keySpec.getClass().getName());
            throw new InvalidKeySpecException(P0.toString());
        }
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("not implemented yet " + key);
    }
}
