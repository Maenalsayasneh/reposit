package s0.a.f.b.h;

import java.util.Objects;
import s0.a.e.b.b0.c.h3;

public final class k {
    public final byte[][] a;

    public k(j jVar, byte[][] bArr) {
        Objects.requireNonNull(jVar, "params == null");
        if (h3.l1(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == jVar.d) {
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i].length == jVar.b) {
                    i++;
                } else {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.a = h3.Q(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }
}
