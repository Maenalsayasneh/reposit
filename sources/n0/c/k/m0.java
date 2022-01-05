package n0.c.k;

import java.util.Arrays;
import m0.n.b.i;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class m0 extends w0<long[]> {
    public long[] a;
    public int b;

    public m0(long[] jArr) {
        i.e(jArr, "bufferWithData");
        this.a = jArr;
        this.b = jArr.length;
        b(10);
    }

    public Object a() {
        long[] copyOf = Arrays.copyOf(this.a, this.b);
        i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public int d() {
        return this.b;
    }
}
