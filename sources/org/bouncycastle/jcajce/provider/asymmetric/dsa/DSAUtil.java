package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import i0.d.a.a.a;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import s0.a.a.c3.m0;
import s0.a.a.d3.m;
import s0.a.a.n;
import s0.a.a.v2.b;
import s0.a.b.k0.p;
import s0.a.b.k0.q;
import s0.a.e.b.b0.c.h3;
import s0.a.g.e;

public class DSAUtil {
    public static final n[] dsaOids = {m.N1, b.g, m.O1};

    public static String generateKeyFingerprint(BigInteger bigInteger, DSAParams dSAParams) {
        return new e(h3.T(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray()), 160).toString();
    }

    public static s0.a.b.k0.b generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new q(dSAPrivateKey.getX(), new p(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException("can't identify DSA private key.");
    }

    public static s0.a.b.k0.b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(m0.s(publicKey.getEncoded())).engineGetKeyParameters();
        } catch (Exception unused) {
            StringBuilder P0 = a.P0("can't identify DSA public key: ");
            P0.append(publicKey.getClass().getName());
            throw new InvalidKeyException(P0.toString());
        }
    }

    public static boolean isDsaOid(n nVar) {
        int i = 0;
        while (true) {
            n[] nVarArr = dsaOids;
            if (i == nVarArr.length) {
                return false;
            }
            if (nVar.w(nVarArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static p toDSAParameters(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new p(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
