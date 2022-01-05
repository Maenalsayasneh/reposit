package h0.i.h;

/* compiled from: Pools */
public class d<T> {
    public final Object[] a;
    public int b;

    public d(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    public boolean b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (this.a[i2] == t) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
