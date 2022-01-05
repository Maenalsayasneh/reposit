package h0.f;

/* compiled from: SparseArrayCompat */
public class i<E> implements Cloneable {
    public static final Object c = new Object();
    public boolean d = false;
    public int[] q;
    public Object[] x;
    public int y;

    public i() {
        int e = d.e(10);
        this.q = new int[e];
        this.x = new Object[e];
    }

    public void b(int i, E e) {
        int i2 = this.y;
        if (i2 == 0 || i > this.q[i2 - 1]) {
            if (this.d && i2 >= this.q.length) {
                d();
            }
            int i3 = this.y;
            if (i3 >= this.q.length) {
                int e2 = d.e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.q;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.x;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.q = iArr;
                this.x = objArr;
            }
            this.q[i3] = i;
            this.x[i3] = e;
            this.y = i3 + 1;
            return;
        }
        h(i, e);
    }

    /* renamed from: c */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.q = (int[]) this.q.clone();
            iVar.x = (Object[]) this.x.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.y;
        int[] iArr = this.q;
        Object[] objArr = this.x;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != c) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.d = false;
        this.y = i2;
    }

    public E e(int i) {
        return f(i, (Object) null);
    }

    public E f(int i, E e) {
        int a = d.a(this.q, this.y, i);
        if (a >= 0) {
            E[] eArr = this.x;
            if (eArr[a] != c) {
                return eArr[a];
            }
        }
        return e;
    }

    public int g(int i) {
        if (this.d) {
            d();
        }
        return this.q[i];
    }

    public void h(int i, E e) {
        int a = d.a(this.q, this.y, i);
        if (a >= 0) {
            this.x[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.y;
        if (i2 < i3) {
            Object[] objArr = this.x;
            if (objArr[i2] == c) {
                this.q[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.d && i3 >= this.q.length) {
            d();
            i2 = ~d.a(this.q, this.y, i);
        }
        int i4 = this.y;
        if (i4 >= this.q.length) {
            int e2 = d.e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.x;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.q = iArr;
            this.x = objArr2;
        }
        int i5 = this.y;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.q;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.x;
            System.arraycopy(objArr4, i2, objArr4, i6, this.y - i2);
        }
        this.q[i2] = i;
        this.x[i2] = e;
        this.y++;
    }

    public int i() {
        if (this.d) {
            d();
        }
        return this.y;
    }

    public E j(int i) {
        if (this.d) {
            d();
        }
        return this.x[i];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.y * 28);
        sb.append('{');
        for (int i = 0; i < this.y; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(g(i));
            sb.append('=');
            Object j = j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
