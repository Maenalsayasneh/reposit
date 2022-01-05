package n0.c.k;

import java.util.Arrays;
import m0.n.b.i;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class f extends w0<boolean[]> {
    public boolean[] a;
    public int b;

    public f(boolean[] zArr) {
        i.e(zArr, "bufferWithData");
        this.a = zArr;
        this.b = zArr.length;
        b(10);
    }

    public Object a() {
        boolean[] copyOf = Arrays.copyOf(this.a, this.b);
        i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public int d() {
        return this.b;
    }
}
