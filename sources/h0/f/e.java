package h0.f;

/* compiled from: LongSparseArray */
public class e<E> implements Cloneable {
    public static final Object c = new Object();
    public boolean d;
    public long[] q;
    public Object[] x;
    public int y;

    public e() {
        this(10);
    }

    public void c() {
        int i = this.y;
        Object[] objArr = this.x;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.y = 0;
        this.d = false;
    }

    /* renamed from: d */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.q = (long[]) this.q.clone();
            eVar.x = (Object[]) this.x.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void g() {
        int i = this.y;
        long[] jArr = this.q;
        Object[] objArr = this.x;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != c) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.d = false;
        this.y = i2;
    }

    public E h(long j) {
        return j(j, (Object) null);
    }

    public E j(long j, E e) {
        int b = d.b(this.q, this.y, j);
        if (b >= 0) {
            E[] eArr = this.x;
            if (eArr[b] != c) {
                return eArr[b];
            }
        }
        return e;
    }

    public long m(int i) {
        if (this.d) {
            g();
        }
        return this.q[i];
    }

    public void o(long j, E e) {
        int b = d.b(this.q, this.y, j);
        if (b >= 0) {
            this.x[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.y;
        if (i < i2) {
            Object[] objArr = this.x;
            if (objArr[i] == c) {
                this.q[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.d && i2 >= this.q.length) {
            g();
            i = ~d.b(this.q, this.y, j);
        }
        int i3 = this.y;
        if (i3 >= this.q.length) {
            int f = d.f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.x;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.q = jArr;
            this.x = objArr2;
        }
        int i4 = this.y;
        if (i4 - i != 0) {
            long[] jArr3 = this.q;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.x;
            System.arraycopy(objArr4, i, objArr4, i5, this.y - i);
        }
        this.q[i] = j;
        this.x[i] = e;
        this.y++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.q
            int r1 = r2.y
            int r3 = h0.f.d.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.x
            r0 = r4[r3]
            java.lang.Object r1 = c
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.d = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.f.e.p(long):void");
    }

    public int r() {
        if (this.d) {
            g();
        }
        return this.y;
    }

    public E s(int i) {
        if (this.d) {
            g();
        }
        return this.x[i];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.y * 28);
        sb.append('{');
        for (int i = 0; i < this.y; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m(i));
            sb.append('=');
            Object s = s(i);
            if (s != this) {
                sb.append(s);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i) {
        this.d = false;
        if (i == 0) {
            this.q = d.b;
            this.x = d.c;
            return;
        }
        int f = d.f(i);
        this.q = new long[f];
        this.x = new Object[f];
    }
}
