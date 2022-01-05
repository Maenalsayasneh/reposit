package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.Map;
import s0.a.a.r2.b;
import s0.a.a.t2.a;
import s0.a.a.w2.n;

public class SecretKeyUtil {
    private static Map keySizes;

    static {
        HashMap hashMap = new HashMap();
        keySizes = hashMap;
        hashMap.put(n.R.d, 192);
        keySizes.put(b.u, 128);
        keySizes.put(b.C, 192);
        keySizes.put(b.K, 256);
        keySizes.put(a.a, 128);
        keySizes.put(a.b, 192);
        keySizes.put(a.c, 256);
    }

    public static int getKeySize(s0.a.a.n nVar) {
        Integer num = (Integer) keySizes.get(nVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
