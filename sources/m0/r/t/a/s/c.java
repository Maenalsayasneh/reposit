package m0.r.t.a.s;

/* compiled from: IntTree */
public final class c<V> {
    public static final c<Object> a = new c<>();
    public final long b;
    public final V c;
    public final c<V> d;
    public final c<V> e;
    public final int f;

    public c() {
        this.f = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public V a(long j) {
        if (this.f == 0) {
            return null;
        }
        long j2 = this.b;
        if (j < j2) {
            return this.d.a(j - j2);
        }
        if (j > j2) {
            return this.e.a(j - j2);
        }
        return this.c;
    }

    public c<V> b(long j, V v) {
        if (this.f == 0) {
            return new c(j, v, this, this);
        }
        long j2 = this.b;
        if (j < j2) {
            return c(this.d.b(j - j2, v), this.e);
        }
        if (j > j2) {
            return c(this.d, this.e.b(j - j2, v));
        }
        if (v == this.c) {
            return this;
        }
        return new c(j, v, this.d, this.e);
    }

    public final c<V> c(c<V> cVar, c<V> cVar2) {
        c<V> cVar3 = cVar;
        c<V> cVar4 = cVar2;
        if (cVar3 == this.d && cVar4 == this.e) {
            return this;
        }
        long j = this.b;
        V v = this.c;
        int i = cVar3.f;
        int i2 = cVar4.f;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                c<V> cVar5 = cVar3.d;
                c<V> cVar6 = cVar3.e;
                if (cVar6.f < cVar5.f * 2) {
                    long j2 = cVar3.b;
                    return new c(j2 + j, cVar3.c, cVar5, new c(-j2, v, cVar6.d(cVar6.b + j2), cVar2));
                }
                c<V> cVar7 = cVar6.d;
                c<V> cVar8 = cVar6.e;
                long j3 = cVar6.b;
                long j4 = cVar3.b + j3 + j;
                V v2 = cVar6.c;
                c cVar9 = new c(-j3, cVar3.c, cVar5, cVar7.d(cVar7.b + j3));
                long j5 = cVar3.b;
                long j6 = cVar6.b;
                return new c<>(j4, v2, cVar9, new c((-j5) - j6, v, cVar8.d(cVar8.b + j6 + j5), cVar2));
            } else if (i2 >= i * 5) {
                c<V> cVar10 = cVar4.d;
                c<V> cVar11 = cVar4.e;
                if (cVar10.f < cVar11.f * 2) {
                    long j7 = cVar4.b;
                    c<V> cVar12 = cVar;
                    return new c<>(j7 + j, cVar4.c, new c(-j7, v, cVar12, cVar10.d(cVar10.b + j7)), cVar11);
                }
                c<V> cVar13 = cVar10.d;
                c<V> cVar14 = cVar10.e;
                long j8 = cVar10.b;
                long j9 = cVar4.b;
                long j10 = j8 + j9 + j;
                V v3 = cVar10.c;
                c cVar15 = new c((-j9) - j8, v, cVar, cVar13.d(cVar13.b + j8 + j9));
                long j11 = cVar10.b;
                return new c<>(j10, v3, cVar15, new c(-j11, cVar4.c, cVar14.d(cVar14.b + j11), cVar11));
            }
        }
        return new c(j, v, cVar, cVar2);
    }

    public final c<V> d(long j) {
        if (this.f == 0 || j == this.b) {
            return this;
        }
        return new c(j, this.c, this.d, this.e);
    }

    public c(long j, V v, c<V> cVar, c<V> cVar2) {
        this.b = j;
        this.c = v;
        this.d = cVar;
        this.e = cVar2;
        this.f = cVar.f + 1 + cVar2.f;
    }
}
