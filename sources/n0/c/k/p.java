package n0.c.k;

import java.util.Arrays;
import m0.n.b.i;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class p extends w0<double[]> {
    public double[] a;
    public int b;

    public p(double[] dArr) {
        i.e(dArr, "bufferWithData");
        this.a = dArr;
        this.b = dArr.length;
        b(10);
    }

    public Object a() {
        double[] copyOf = Arrays.copyOf(this.a, this.b);
        i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public int d() {
        return this.b;
    }
}
