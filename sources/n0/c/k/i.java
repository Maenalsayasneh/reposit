package n0.c.k;

import java.util.Arrays;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class i extends w0<byte[]> {
    public byte[] a;
    public int b;

    public i(byte[] bArr) {
        m0.n.b.i.e(bArr, "bufferWithData");
        this.a = bArr;
        this.b = bArr.length;
        b(10);
    }

    public Object a() {
        byte[] copyOf = Arrays.copyOf(this.a, this.b);
        m0.n.b.i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            m0.n.b.i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public int d() {
        return this.b;
    }
}
