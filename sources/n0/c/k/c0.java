package n0.c.k;

import java.util.Arrays;
import m0.n.b.i;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class c0 extends w0<int[]> {
    public int[] a;
    public int b;

    public c0(int[] iArr) {
        i.e(iArr, "bufferWithData");
        this.a = iArr;
        this.b = iArr.length;
        b(10);
    }

    public Object a() {
        int[] copyOf = Arrays.copyOf(this.a, this.b);
        i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public int d() {
        return this.b;
    }
}
