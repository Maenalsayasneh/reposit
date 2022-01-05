package s0.a.f.b.h;

import i0.d.a.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s0.a.a.n;
import s0.a.a.r2.b;

public final class o {
    public static final Map<Integer, o> a;
    public final r b;
    public final s c;
    public final int d;
    public final int e;

    static {
        HashMap hashMap = new HashMap();
        n nVar = b.c;
        hashMap.put(1, new o(20, 2, nVar));
        a.t1(20, 4, nVar, hashMap, 2);
        a.t1(40, 2, nVar, hashMap, 3);
        a.t1(40, 4, nVar, hashMap, 4);
        a.t1(40, 8, nVar, hashMap, 5);
        a.t1(60, 3, nVar, hashMap, 6);
        a.t1(60, 6, nVar, hashMap, 7);
        a.t1(60, 12, nVar, hashMap, 8);
        n nVar2 = b.e;
        hashMap.put(9, new o(20, 2, nVar2));
        a.t1(20, 4, nVar2, hashMap, 10);
        a.t1(40, 2, nVar2, hashMap, 11);
        a.t1(40, 4, nVar2, hashMap, 12);
        a.t1(40, 8, nVar2, hashMap, 13);
        a.t1(60, 3, nVar2, hashMap, 14);
        a.t1(60, 6, nVar2, hashMap, 15);
        a.t1(60, 12, nVar2, hashMap, 16);
        n nVar3 = b.m;
        hashMap.put(17, new o(20, 2, nVar3));
        a.t1(20, 4, nVar3, hashMap, 18);
        a.t1(40, 2, nVar3, hashMap, 19);
        a.t1(40, 4, nVar3, hashMap, 20);
        a.t1(40, 8, nVar3, hashMap, 21);
        a.t1(60, 3, nVar3, hashMap, 22);
        a.t1(60, 6, nVar3, hashMap, 23);
        a.t1(60, 12, nVar3, hashMap, 24);
        n nVar4 = b.n;
        hashMap.put(25, new o(20, 2, nVar4));
        a.t1(20, 4, nVar4, hashMap, 26);
        a.t1(40, 2, nVar4, hashMap, 27);
        a.t1(40, 4, nVar4, hashMap, 28);
        a.t1(40, 8, nVar4, hashMap, 29);
        a.t1(60, 3, nVar4, hashMap, 30);
        a.t1(60, 6, nVar4, hashMap, 31);
        a.t1(60, 12, nVar4, hashMap, 32);
        a = Collections.unmodifiableMap(hashMap);
    }

    public o(int i, int i2, n nVar) {
        this.d = i;
        this.e = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                s sVar = new s(i3, nVar);
                this.c = sVar;
                String str = sVar.g;
                int i4 = sVar.h;
                int i5 = sVar.f;
                int i6 = sVar.i.d;
                Map<String, a> map = a.a;
                Objects.requireNonNull(str, "algorithmName == null");
                this.b = a.a.get(a.b(str, i4, i5, i6, i, i2));
                return;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }
}
