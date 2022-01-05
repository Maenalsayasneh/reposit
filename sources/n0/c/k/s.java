package n0.c.k;

import java.util.Arrays;
import m0.n.b.i;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class s extends w0<float[]> {
    public float[] a;
    public int b;

    public s(float[] fArr) {
        i.e(fArr, "bufferWithData");
        this.a = fArr;
        this.b = fArr.length;
        b(10);
    }

    public Object a() {
        float[] copyOf = Arrays.copyOf(this.a, this.b);
        i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public int d() {
        return this.b;
    }
}
