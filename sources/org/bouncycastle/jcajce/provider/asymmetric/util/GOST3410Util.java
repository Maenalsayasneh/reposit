package org.bouncycastle.jcajce.provider.asymmetric.util;

import i0.d.a.a.a;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import s0.a.b.k0.b;
import s0.a.b.k0.q0;
import s0.a.b.k0.r0;
import s0.a.b.k0.s0;
import s0.a.d.e.l;
import s0.a.d.e.n;

public class GOST3410Util {
    public static b generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof GOST3410PrivateKey) {
            GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) privateKey;
            n nVar = ((l) gOST3410PrivateKey.getParameters()).a;
            return new r0(gOST3410PrivateKey.getX(), new q0(nVar.a, nVar.b, nVar.c));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof GOST3410PublicKey) {
            GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) publicKey;
            n nVar = ((l) gOST3410PublicKey.getParameters()).a;
            return new s0(gOST3410PublicKey.getY(), new q0(nVar.a, nVar.b, nVar.c));
        }
        StringBuilder P0 = a.P0("can't identify GOST3410 public key: ");
        P0.append(publicKey.getClass().getName());
        throw new InvalidKeyException(P0.toString());
    }
}
