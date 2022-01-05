package s0.a.f.b.h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s0.a.a.n;
import s0.a.a.r2.b;

public final class s {
    public static final Map<Integer, s> a;
    public final r b;
    public final int c;
    public final int d;
    public final n e;
    public final int f;
    public final String g;
    public final int h;
    public final j i;

    static {
        HashMap hashMap = new HashMap();
        n nVar = b.c;
        hashMap.put(1, new s(10, nVar));
        hashMap.put(2, new s(16, nVar));
        hashMap.put(3, new s(20, nVar));
        n nVar2 = b.e;
        hashMap.put(4, new s(10, nVar2));
        hashMap.put(5, new s(16, nVar2));
        hashMap.put(6, new s(20, nVar2));
        n nVar3 = b.m;
        hashMap.put(7, new s(10, nVar3));
        hashMap.put(8, new s(16, nVar3));
        hashMap.put(9, new s(20, nVar3));
        n nVar4 = b.n;
        hashMap.put(10, new s(10, nVar4));
        hashMap.put(11, new s(16, nVar4));
        hashMap.put(12, new s(20, nVar4));
        a = Collections.unmodifiableMap(hashMap);
    }

    public s(int i2, n nVar) {
        if (i2 >= 2) {
            Objects.requireNonNull(nVar, "digest == null");
            this.c = i2;
            int i3 = 2;
            while (true) {
                int i4 = this.c;
                if (i3 > i4) {
                    throw new IllegalStateException("should never happen...");
                } else if ((i4 - i3) % 2 == 0) {
                    this.d = i3;
                    String str = c.b.get(nVar);
                    if (str != null) {
                        this.g = str;
                        this.e = nVar;
                        j jVar = new j(nVar);
                        this.i = jVar;
                        int i5 = jVar.b;
                        this.h = i5;
                        int i6 = jVar.c;
                        this.f = i6;
                        int i7 = jVar.d;
                        Map<String, b> map = b.a;
                        Objects.requireNonNull(str, "algorithmName == null");
                        this.b = b.a.get(b.b(str, i5, i6, i7, i2));
                        return;
                    }
                    throw new IllegalArgumentException("unrecognized digest oid: " + nVar);
                } else {
                    i3++;
                }
            }
        } else {
            throw new IllegalArgumentException("height must be >= 2");
        }
    }

    public h a() {
        return new h(this.i);
    }
}
