package m0.q;

/* compiled from: Ranges.kt */
public final class e extends c implements b<Integer> {
    public static final e x = new e(1, 0);
    public static final e y = null;

    public e(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (!(this.c == eVar.c && this.d == eVar.d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.c * 31) + this.d;
    }

    public boolean isEmpty() {
        return this.c > this.d;
    }

    public boolean k(int i) {
        return this.c <= i && i <= this.d;
    }

    /* renamed from: o */
    public Integer j() {
        return Integer.valueOf(this.d);
    }

    /* renamed from: r */
    public Integer c() {
        return Integer.valueOf(this.c);
    }

    public String toString() {
        return this.c + ".." + this.d;
    }
}
