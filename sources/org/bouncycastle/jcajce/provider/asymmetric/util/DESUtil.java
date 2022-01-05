package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.HashSet;
import java.util.Set;
import s0.a.a.n;
import s0.a.a.v2.b;
import s0.a.g.j;

public class DESUtil {
    private static final Set<String> des;

    static {
        HashSet hashSet = new HashSet();
        des = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(b.b.d);
        n nVar = s0.a.a.w2.n.R;
        hashSet.add(nVar.d);
        hashSet.add(nVar.d);
        hashSet.add(s0.a.a.w2.n.M0.d);
    }

    public static boolean isDES(String str) {
        return des.contains(j.g(str));
    }

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }
}
