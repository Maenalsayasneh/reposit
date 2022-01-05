package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import s0.a.b.k0.q0;
import s0.a.e.b.b0.c.h3;
import s0.a.g.e;
import s0.a.g.j;

public class GOSTUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, q0 q0Var) {
        return new e(h3.S(bigInteger.toByteArray(), q0Var.c.toByteArray(), q0Var.q.toByteArray()), 160).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, q0 q0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        BigInteger modPow = q0Var.q.modPow(bigInteger, q0Var.c);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, q0Var));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("                  Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, q0 q0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, q0Var));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("                 Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
