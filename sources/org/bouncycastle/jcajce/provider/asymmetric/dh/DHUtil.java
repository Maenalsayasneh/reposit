package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import s0.a.b.k0.h;
import s0.a.e.b.b0.c.h3;
import s0.a.g.e;
import s0.a.g.j;

public class DHUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, h hVar) {
        return new e(h3.S(bigInteger.toByteArray(), hVar.d.toByteArray(), hVar.c.toByteArray()), 160).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        BigInteger modPow = hVar.c.modPow(bigInteger, hVar.d);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, hVar));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("              Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = j.a;
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, hVar));
        stringBuffer.append("]");
        stringBuffer.append(str2);
        stringBuffer.append("             Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
