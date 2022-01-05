package s0.a.e.b;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;
import s0.a.e.b.g;
import s0.a.e.b.h;

public abstract class e {
    public s0.a.e.c.a a;
    public g b;
    public g c;
    public BigInteger d;
    public BigInteger e;
    public int f = 0;
    public s0.a.e.b.c0.c g = null;
    public b h = null;

    public static abstract class a extends e {
        public BigInteger[] i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r6, int r7, int r8, int r9) {
            /*
                r5 = this;
                if (r7 == 0) goto L_0x004c
                r0 = 2
                r1 = 1
                r2 = 3
                r3 = 0
                if (r8 != 0) goto L_0x001f
                if (r9 != 0) goto L_0x0017
                int[] r8 = new int[r2]
                r8[r3] = r3
                r8[r1] = r7
                r8[r0] = r6
                s0.a.e.c.e r6 = s0.a.e.c.b.a(r8)
                goto L_0x0035
            L_0x0017:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be 0 if k2 == 0"
                r6.<init>(r7)
                throw r6
            L_0x001f:
                if (r8 <= r7) goto L_0x0044
                if (r9 <= r8) goto L_0x003c
                r4 = 5
                int[] r4 = new int[r4]
                r4[r3] = r3
                r4[r1] = r7
                r4[r0] = r8
                r4[r2] = r9
                r7 = 4
                r4[r7] = r6
                s0.a.e.c.e r6 = s0.a.e.c.b.a(r4)
            L_0x0035:
                r5.<init>(r6)
                r6 = 0
                r5.i = r6
                return
            L_0x003c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be > k2"
                r6.<init>(r7)
                throw r6
            L_0x0044:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k2 must be > k1"
                r6.<init>(r7)
                throw r6
            L_0x004c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k1 must be > 0"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.e.a.<init>(int, int, int, int):void");
        }

        public h e(BigInteger bigInteger, BigInteger bigInteger2) {
            g k = k(bigInteger);
            g k2 = k(bigInteger2);
            int i2 = this.f;
            if (i2 == 5 || i2 == 6) {
                if (!k.i()) {
                    k2 = k2.d(k).a(k);
                } else if (!k2.o().equals(this.c)) {
                    throw new IllegalArgumentException();
                }
            }
            return f(k, k2);
        }

        public h i(int i2, BigInteger bigInteger) {
            g gVar;
            g k = k(bigInteger);
            if (k.i()) {
                gVar = this.c.n();
            } else {
                g w = w(k.o().g().j(this.c).a(this.b).a(k));
                if (w != null) {
                    boolean s = w.s();
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    if (s != z) {
                        w = w.b();
                    }
                    int i3 = this.f;
                    gVar = (i3 == 5 || i3 == 6) ? w.a(k) : w.j(k);
                } else {
                    gVar = null;
                }
            }
            if (gVar != null) {
                return f(k, gVar);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public boolean o(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= l();
        }

        public g s(SecureRandom secureRandom) {
            BigInteger e;
            BigInteger e2;
            int l = l();
            do {
                e = s0.a.g.b.e(l, secureRandom);
            } while (e.signum() <= 0);
            g k = k(e);
            do {
                e2 = s0.a.g.b.e(l, secureRandom);
            } while (e2.signum() <= 0);
            return k.j(k(e2));
        }

        public boolean v() {
            return this.d != null && this.e != null && this.c.h() && (this.b.i() || this.b.h());
        }

        public g w(g gVar) {
            g gVar2;
            g.a aVar = (g.a) gVar;
            boolean v = aVar.v();
            if (v && aVar.w() != 0) {
                return null;
            }
            int l = l();
            if ((l & 1) != 0) {
                g u = aVar.u();
                if (v || u.o().a(u).a(gVar).i()) {
                    return u;
                }
                return null;
            } else if (gVar.i()) {
                return gVar;
            } else {
                g k = k(c.a);
                Random random = new Random();
                do {
                    g k2 = k(new BigInteger(l, random));
                    g gVar3 = gVar;
                    gVar2 = k;
                    for (int i2 = 1; i2 < l; i2++) {
                        g o = gVar3.o();
                        gVar2 = gVar2.o().a(o.j(k2));
                        gVar3 = o.a(gVar);
                    }
                    if (!gVar3.i()) {
                        return null;
                    }
                } while (gVar2.o().a(gVar2).i());
                return gVar2;
            }
        }
    }

    public static abstract class b extends e {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.math.BigInteger r4) {
            /*
                r3 = this;
                s0.a.e.c.a r0 = s0.a.e.c.b.a
                int r0 = r4.bitLength()
                int r1 = r4.signum()
                if (r1 <= 0) goto L_0x002b
                r1 = 2
                if (r0 < r1) goto L_0x002b
                r2 = 3
                if (r0 >= r2) goto L_0x0021
                int r0 = r4.intValue()
                if (r0 == r1) goto L_0x001e
                if (r0 == r2) goto L_0x001b
                goto L_0x0021
            L_0x001b:
                s0.a.e.c.a r4 = s0.a.e.c.b.b
                goto L_0x0027
            L_0x001e:
                s0.a.e.c.a r4 = s0.a.e.c.b.a
                goto L_0x0027
            L_0x0021:
                s0.a.e.c.f r0 = new s0.a.e.c.f
                r0.<init>(r4)
                r4 = r0
            L_0x0027:
                r3.<init>(r4)
                return
            L_0x002b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "'characteristic' must be >= 2"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.e.b.<init>(java.math.BigInteger):void");
        }

        public static BigInteger v(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger e = s0.a.g.b.e(bigInteger.bitLength(), secureRandom);
                if (e.signum() > 0 && e.compareTo(bigInteger) < 0) {
                    return e;
                }
            }
        }

        public h i(int i, BigInteger bigInteger) {
            g k = k(bigInteger);
            g n = k.o().a(this.b).j(k).a(this.c).n();
            if (n != null) {
                boolean s = n.s();
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                if (s != z) {
                    n = n.m();
                }
                return f(k, n);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public boolean o(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(this.a.c()) < 0;
        }

        public g s(SecureRandom secureRandom) {
            BigInteger c = this.a.c();
            return k(v(secureRandom, c)).j(k(v(secureRandom, c)));
        }
    }

    public class c {
        public int a;
        public s0.a.e.b.c0.c b;
        public b c;

        public c(int i, s0.a.e.b.c0.c cVar, b bVar) {
            this.a = i;
            this.b = cVar;
            this.c = bVar;
        }

        public e a() {
            if (e.this.t(this.a)) {
                e a2 = e.this.a();
                if (a2 != e.this) {
                    synchronized (a2) {
                        a2.f = this.a;
                        a2.g = this.b;
                        a2.h = this.c;
                    }
                    return a2;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
    }

    public static class d extends a {
        public int j;
        public int k;
        public int l;
        public int m;
        public h.d n;

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.n = new h.d(this, (g) null, (g) null);
            this.b = k(bigInteger);
            this.c = k(bigInteger2);
            this.f = 6;
        }

        public d(int i, int i2, int i3, int i4, g gVar, g gVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger;
            this.e = bigInteger2;
            this.n = new h.d(this, (g) null, (g) null);
            this.b = gVar;
            this.c = gVar2;
            this.f = 6;
        }

        public d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        public e a() {
            return new d(this.j, this.k, this.l, this.m, this.b, this.c, this.d, this.e);
        }

        public a c(h[] hVarArr, int i, int i2) {
            int i3 = (this.j + 63) >>> 6;
            int i4 = this.l;
            int[] iArr = i4 == 0 && this.m == 0 ? new int[]{this.k} : new int[]{this.k, i4, this.m};
            long[] jArr = new long[(i2 * i3 * 2)];
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                h hVar = hVarArr[i + i6];
                long[] jArr2 = ((g.c) hVar.c).j.q;
                System.arraycopy(jArr2, 0, jArr, i5, jArr2.length);
                int i7 = i5 + i3;
                long[] jArr3 = ((g.c) hVar.d).j.q;
                System.arraycopy(jArr3, 0, jArr, i7, jArr3.length);
                i5 = i7 + i3;
            }
            return new f(this, i2, i3, jArr, iArr);
        }

        public b d() {
            if (v()) {
                return new y();
            }
            s0.a.e.b.c0.c cVar = this.g;
            return cVar instanceof s0.a.e.b.c0.c ? new l(this, cVar) : new t();
        }

        public h f(g gVar, g gVar2) {
            return new h.d(this, gVar, gVar2);
        }

        public h g(g gVar, g gVar2, g[] gVarArr) {
            return new h.d(this, gVar, gVar2, gVarArr);
        }

        public g k(BigInteger bigInteger) {
            return new g.c(this.j, this.k, this.l, this.m, bigInteger);
        }

        public int l() {
            return this.j;
        }

        public h m() {
            return this.n;
        }

        public boolean t(int i) {
            return i == 0 || i == 1 || i == 6;
        }
    }

    /* renamed from: s0.a.e.b.e$e  reason: collision with other inner class name */
    public static class C0302e extends b {
        public BigInteger i;
        public BigInteger j;
        public h.e k;

        public C0302e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.i = bigInteger;
            int i2 = g.d.g;
            int bitLength = bigInteger.bitLength();
            this.j = (bitLength < 96 || bigInteger.shiftRight(bitLength + -64).longValue() != -1) ? null : c.b.shiftLeft(bitLength).subtract(bigInteger);
            this.k = new h.e(this, (g) null, (g) null);
            this.b = k(bigInteger2);
            this.c = k(bigInteger3);
            this.d = bigInteger4;
            this.e = bigInteger5;
            this.f = 4;
        }

        public C0302e(BigInteger bigInteger, BigInteger bigInteger2, g gVar, g gVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = bigInteger2;
            this.k = new h.e(this, (g) null, (g) null);
            this.b = gVar;
            this.c = gVar2;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.f = 4;
        }

        public e a() {
            return new C0302e(this.i, this.j, this.b, this.c, this.d, this.e);
        }

        public h f(g gVar, g gVar2) {
            return new h.e(this, gVar, gVar2);
        }

        public h g(g gVar, g gVar2, g[] gVarArr) {
            return new h.e(this, gVar, gVar2, gVarArr);
        }

        public g k(BigInteger bigInteger) {
            return new g.d(this.i, this.j, bigInteger);
        }

        public int l() {
            return this.i.bitLength();
        }

        public h m() {
            return this.k;
        }

        public h n(h hVar) {
            int i2;
            if (this == hVar.b || this.f != 2 || hVar.m() || ((i2 = hVar.b.f) != 2 && i2 != 3 && i2 != 4)) {
                return e.super.n(hVar);
            }
            return new h.e(this, k(hVar.c.t()), k(hVar.d.t()), new g[]{k(hVar.e[0].t())});
        }

        public boolean t(int i2) {
            return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 4;
        }
    }

    public e(s0.a.e.c.a aVar) {
        this.a = aVar;
    }

    public abstract e a();

    public synchronized c b() {
        return new c(this.f, this.g, this.h);
    }

    public a c(h[] hVarArr, int i, int i2) {
        int l = (l() + 7) >>> 3;
        byte[] bArr = new byte[(i2 * l * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            byte[] byteArray = hVar.c.t().toByteArray();
            byte[] byteArray2 = hVar.d.t().toByteArray();
            int i5 = 1;
            int i6 = byteArray.length > l ? 1 : 0;
            int length = byteArray.length - i6;
            if (byteArray2.length <= l) {
                i5 = 0;
            }
            int length2 = byteArray2.length - i5;
            int i7 = i3 + l;
            System.arraycopy(byteArray, i6, bArr, i7 - length, length);
            i3 = i7 + l;
            System.arraycopy(byteArray2, i5, bArr, i3 - length2, length2);
        }
        return new d(this, i2, l, bArr);
    }

    public b d() {
        s0.a.e.b.c0.c cVar = this.g;
        return cVar instanceof s0.a.e.b.c0.c ? new l(this, cVar) : new t();
    }

    public h e(BigInteger bigInteger, BigInteger bigInteger2) {
        return f(k(bigInteger), k(bigInteger2));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof e) && j((e) obj));
    }

    public abstract h f(g gVar, g gVar2);

    public abstract h g(g gVar, g gVar2, g[] gVarArr);

    public h h(byte[] bArr) {
        h hVar;
        int l = (l() + 7) / 8;
        boolean z = false;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 == 2 || b2 == 3) {
                if (bArr.length == l + 1) {
                    hVar = i(b2 & 1, s0.a.g.b.h(bArr, 1, l));
                    if (!hVar.l(true, true)) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b2 != 4) {
                if (b2 != 6 && b2 != 7) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid point encoding 0x");
                    P0.append(Integer.toString(b2, 16));
                    throw new IllegalArgumentException(P0.toString());
                } else if (bArr.length == (l * 2) + 1) {
                    BigInteger h2 = s0.a.g.b.h(bArr, 1, l);
                    BigInteger h3 = s0.a.g.b.h(bArr, l + 1, l);
                    boolean testBit = h3.testBit(0);
                    if (b2 == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        hVar = u(h2, h3);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (l * 2) + 1) {
                hVar = u(s0.a.g.b.h(bArr, 1, l), s0.a.g.b.h(bArr, l + 1, l));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            hVar = m();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b2 == 0 || !hVar.m()) {
            return hVar;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public int hashCode() {
        return (this.a.hashCode() ^ Integer.rotateLeft(this.b.t().hashCode(), 8)) ^ Integer.rotateLeft(this.c.t().hashCode(), 16);
    }

    public abstract h i(int i, BigInteger bigInteger);

    public boolean j(e eVar) {
        return this == eVar || (eVar != null && this.a.equals(eVar.a) && this.b.t().equals(eVar.b.t()) && this.c.t().equals(eVar.c.t()));
    }

    public abstract g k(BigInteger bigInteger);

    public abstract int l();

    public abstract h m();

    public h n(h hVar) {
        if (this == hVar.b) {
            return hVar;
        }
        if (hVar.m()) {
            return m();
        }
        h q = hVar.q();
        return e(q.c.t(), q.j().t());
    }

    public abstract boolean o(BigInteger bigInteger);

    public void p(h[] hVarArr) {
        q(hVarArr, 0, hVarArr.length, (g) null);
    }

    public void q(h[] hVarArr, int i, int i2, g gVar) {
        if (i < 0 || i2 < 0 || i > hVarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        int i3 = 0;
        while (i3 < i2) {
            h hVar = hVarArr[i + i3];
            if (hVar == null || this == hVar.b) {
                i3++;
            } else {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
        int i4 = this.f;
        if (i4 != 0 && i4 != 5) {
            g[] gVarArr = new g[i2];
            int[] iArr = new int[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i + i6;
                h hVar2 = hVarArr[i7];
                if (hVar2 != null && (gVar != null || !hVar2.n())) {
                    gVarArr[i5] = hVar2.k(0);
                    iArr[i5] = i7;
                    i5++;
                }
            }
            if (i5 != 0) {
                g[] gVarArr2 = new g[i5];
                gVarArr2[0] = gVarArr[0];
                int i8 = 0;
                while (true) {
                    i8++;
                    if (i8 >= i5) {
                        break;
                    }
                    gVarArr2[i8] = gVarArr2[i8 - 1].j(gVarArr[0 + i8]);
                }
                int i9 = i8 - 1;
                if (gVar != null) {
                    gVarArr2[i9] = gVarArr2[i9].j(gVar);
                }
                g g2 = gVarArr2[i9].g();
                while (i9 > 0) {
                    int i10 = i9 - 1;
                    int i11 = i9 + 0;
                    g gVar2 = gVarArr[i11];
                    gVarArr[i11] = gVarArr2[i10].j(g2);
                    g2 = g2.j(gVar2);
                    i9 = i10;
                }
                gVarArr[0] = g2;
                for (int i12 = 0; i12 < i5; i12++) {
                    int i13 = iArr[i12];
                    hVarArr[i13] = hVarArr[i13].r(gVarArr[i12]);
                }
            }
        } else if (gVar != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    public o r(h hVar, String str, n nVar) {
        Hashtable hashtable;
        o a2;
        if (this == hVar.b) {
            synchronized (hVar) {
                hashtable = hVar.f;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    hVar.f = hashtable;
                }
            }
            synchronized (hashtable) {
                o oVar = (o) hashtable.get(str);
                a2 = nVar.a(oVar);
                if (a2 != oVar) {
                    hashtable.put(str, a2);
                }
            }
            return a2;
        }
        throw new IllegalArgumentException("'point' must be non-null and on this curve");
    }

    public abstract g s(SecureRandom secureRandom);

    public boolean t(int i) {
        return i == 0;
    }

    public h u(BigInteger bigInteger, BigInteger bigInteger2) {
        h e2 = e(bigInteger, bigInteger2);
        if (e2.l(false, true)) {
            return e2;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }
}
