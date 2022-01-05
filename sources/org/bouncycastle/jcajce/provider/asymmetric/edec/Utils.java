package org.bouncycastle.jcajce.provider.asymmetric.edec;

import s0.a.b.k0.b;
import s0.a.b.k0.f0;
import s0.a.b.k0.i0;
import s0.a.b.k0.q1;
import s0.a.b.k0.t1;
import s0.a.e.b.b0.c.h3;
import s0.a.g.e;
import s0.a.g.j;
import s0.a.g.k.d;

public class Utils {
    private static String generateKeyFingerprint(byte[] bArr) {
        return new e(bArr, 160).toString();
    }

    public static boolean isValidPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !isValidPrefix(bArr, bArr);
        }
        byte b = 0;
        for (int i = 0; i != bArr.length; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        return b == 0;
    }

    public static String keyToString(String str, String str2, b bVar) {
        byte[] bArr;
        StringBuffer stringBuffer = new StringBuffer();
        String str3 = j.a;
        if (bVar instanceof t1) {
            bArr = h3.I(((t1) bVar).d);
        } else if (bVar instanceof i0) {
            bArr = ((i0) bVar).getEncoded();
        } else if (bVar instanceof q1) {
            bArr = h3.I(((q1) bVar).d);
        } else {
            bArr = ((f0) bVar).getEncoded();
        }
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(" [");
        stringBuffer.append(generateKeyFingerprint(bArr));
        stringBuffer.append("]");
        stringBuffer.append(str3);
        stringBuffer.append("    public data: ");
        stringBuffer.append(d.f(bArr));
        stringBuffer.append(str3);
        return stringBuffer.toString();
    }
}
