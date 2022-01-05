package s0.a.c.n;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import s0.a.a.g2.a;
import s0.a.a.n;
import s0.a.b.e0.u;
import s0.a.e.b.b0.c.h3;

public class h implements AlgorithmParameterSpec {
    public static Map a;
    public byte[] b;
    public byte[] c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(a.h, "E-A");
        a.put(a.i, "E-B");
        a.put(a.j, "E-C");
        a.put(a.k, "E-D");
        a.put(s0.a.a.x2.a.t, "Param-Z");
    }

    public h(n nVar, byte[] bArr) {
        String str = (String) a.get(nVar);
        if (str != null) {
            this.b = null;
            this.c = null;
            this.c = u.g(str);
            this.b = h3.I(bArr);
            return;
        }
        throw new IllegalArgumentException("unknown OID: " + nVar);
    }

    public byte[] a() {
        return h3.I(this.b);
    }

    public byte[] b() {
        return h3.I(this.c);
    }

    public byte[] c() {
        return h3.I(this.c);
    }

    public h(byte[] bArr, byte[] bArr2) {
        this.b = null;
        this.c = null;
        byte[] bArr3 = new byte[bArr.length];
        this.c = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        byte[] bArr4 = new byte[bArr2.length];
        this.b = bArr4;
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
    }
}
