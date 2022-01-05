package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import s0.a.a.c3.y0;
import s0.a.a.n;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;
import s0.a.g.e;

public class RSAUtil {
    public static final n[] rsaOids = {s0.a.a.w2.n.n, y0.T0, s0.a.a.w2.n.t, s0.a.a.w2.n.w};

    public static String generateExponentFingerprint(BigInteger bigInteger) {
        return new e(bigInteger.toByteArray(), 32).toString();
    }

    public static String generateKeyFingerprint(BigInteger bigInteger) {
        return new e(bigInteger.toByteArray(), 160).toString();
    }

    public static k1 generatePrivateKeyParameter(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof BCRSAPrivateKey) {
            return ((BCRSAPrivateKey) rSAPrivateKey).engineGetKeyParameters();
        }
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new k1(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new l1(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    public static k1 generatePublicKeyParameter(RSAPublicKey rSAPublicKey) {
        return rSAPublicKey instanceof BCRSAPublicKey ? ((BCRSAPublicKey) rSAPublicKey).engineGetKeyParameters() : new k1(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static boolean isRsaOid(n nVar) {
        int i = 0;
        while (true) {
            n[] nVarArr = rsaOids;
            if (i == nVarArr.length) {
                return false;
            }
            if (nVar.w(nVarArr[i])) {
                return true;
            }
            i++;
        }
    }
}
