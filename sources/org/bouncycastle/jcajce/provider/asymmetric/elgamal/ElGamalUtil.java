package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import s0.a.b.k0.b;
import s0.a.b.k0.l0;
import s0.a.b.k0.m0;
import s0.a.b.k0.n0;

public class ElGamalUtil {
    public static b generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ElGamalPrivateKey) {
            ElGamalPrivateKey elGamalPrivateKey = (ElGamalPrivateKey) privateKey;
            return new m0(elGamalPrivateKey.getX(), new l0(elGamalPrivateKey.getParameters().a, elGamalPrivateKey.getParameters().b));
        } else if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new m0(dHPrivateKey.getX(), new l0(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ElGamalPublicKey) {
            ElGamalPublicKey elGamalPublicKey = (ElGamalPublicKey) publicKey;
            return new n0(elGamalPublicKey.getY(), new l0(elGamalPublicKey.getParameters().a, elGamalPublicKey.getParameters().b));
        } else if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new n0(dHPublicKey.getY(), new l0(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
    }
}
