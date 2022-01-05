package org.bouncycastle.crypto.util;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import s0.a.a.n;
import s0.a.a.y2.d;
import s0.a.b.c0.a;
import s0.a.e.b.e;

public class SSHNamedCurves {
    public static final Map<n, String> a = Collections.unmodifiableMap(new HashMap<n, String>() {
        {
            for (String next : SSHNamedCurves.b.keySet()) {
                put(SSHNamedCurves.b.get(next), next);
            }
        }
    });
    public static final Map<String, n> b = Collections.unmodifiableMap(new HashMap<String, n>() {
        {
            put("nistp256", d.H);
            put("nistp384", d.A);
            put("nistp521", d.B);
            put("nistk163", d.b);
            put("nistp192", d.G);
            put("nistp224", d.z);
            put("nistk233", d.s);
            put("nistb233", d.t);
            put("nistk283", d.m);
            put("nistk409", d.C);
            put("nistb409", d.D);
            put("nistt571", d.E);
        }
    });
    public static final Map<String, String> c = Collections.unmodifiableMap(new HashMap<String, String>() {
        {
            String[][] strArr = {new String[]{"secp256r1", "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
            for (int i = 0; i != 12; i++) {
                String[] strArr2 = strArr[i];
                put(strArr2[0], strArr2[1]);
            }
        }
    });
    public static HashMap<e, String> d = new HashMap<e, String>() {
        {
            Enumeration elements = a.K.elements();
            while (elements.hasMoreElements()) {
                String str = (String) elements.nextElement();
                put(a.e(str).q, str);
            }
        }
    };
}
