package m0.q;

/* compiled from: _Ranges.kt */
public class i {
    public static final long a(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final int b(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    public static final int c(int i, b<Integer> bVar) {
        m0.n.b.i.e(bVar, "range");
        if (bVar instanceof a) {
            Comparable valueOf = Integer.valueOf(i);
            a aVar = (a) bVar;
            m0.n.b.i.e(valueOf, "$this$coerceIn");
            m0.n.b.i.e(aVar, "range");
            if (!aVar.isEmpty()) {
                if (aVar.b(valueOf, aVar.c()) && !aVar.b(aVar.c(), valueOf)) {
                    valueOf = aVar.c();
                } else if (aVar.b(aVar.j(), valueOf) && !aVar.b(valueOf, aVar.j())) {
                    valueOf = aVar.j();
                }
                return ((Number) valueOf).intValue();
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
        }
        e eVar = (e) bVar;
        if (eVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
        } else if (i < eVar.c().intValue()) {
            return eVar.c().intValue();
        } else {
            return i > eVar.j().intValue() ? eVar.j().intValue() : i;
        }
    }

    public static final c d(int i, int i2) {
        return new c(i, i2, -1);
    }

    public static final c e(c cVar, int i) {
        m0.n.b.i.e(cVar, "$this$step");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        m0.n.b.i.e(valueOf, "step");
        if (z) {
            int i2 = cVar.c;
            int i3 = cVar.d;
            if (cVar.q <= 0) {
                i = -i;
            }
            return new c(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final e f(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new e(i, i2 - 1);
        }
        e eVar = e.y;
        return e.x;
    }
}
