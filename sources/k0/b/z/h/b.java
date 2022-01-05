package k0.b.z.h;

import i0.j.f.p.h;

/* compiled from: OpenHashSet */
public final class b<T> {
    public int a;
    public int b;
    public int c;
    public T[] d;

    public b(int i, float f) {
        int G3 = h.G3(i);
        this.a = G3 - 1;
        this.c = (int) (f * ((float) G3));
        this.d = new Object[G3];
    }

    public static int b(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.d;
        int i = this.a;
        int b2 = b(t.hashCode()) & i;
        T t3 = tArr[b2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                b2 = (b2 + 1) & i;
                t2 = tArr[b2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[b2] = t;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 >= this.c) {
            T[] tArr2 = this.d;
            int length = tArr2.length;
            int i3 = length << 1;
            int i4 = i3 - 1;
            T[] tArr3 = new Object[i3];
            while (true) {
                int i5 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int b3 = b(tArr2[length].hashCode()) & i4;
                if (tArr3[b3] != null) {
                    do {
                        b3 = (b3 + 1) & i4;
                    } while (tArr3[b3] != null);
                }
                tArr3[b3] = tArr2[length];
                i2 = i5;
            }
            this.a = i4;
            this.c = (int) (((float) i3) * 0.75f);
            this.d = tArr3;
        }
        return true;
    }

    public boolean c(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int b2 = b(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= b2 || b2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= b2 && b2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
