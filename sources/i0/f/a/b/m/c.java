package i0.f.a.b.m;

import i0.d.a.a.a;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ByteArrayBuilder */
public final class c extends OutputStream {
    public static final byte[] c = new byte[0];
    public final LinkedList<byte[]> d;
    public int q;
    public byte[] x;
    public int y;

    public c() {
        this((a) null, 500);
    }

    public final void a() {
        int length = this.q + this.x.length;
        if (length >= 0) {
            this.q = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.d.add(this.x);
            this.x = new byte[max];
            this.y = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public void b(int i) {
        if (this.y >= this.x.length) {
            a();
        }
        byte[] bArr = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void close() {
    }

    public void e(int i) {
        int i2 = this.y;
        int i3 = i2 + 2;
        byte[] bArr = this.x;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.y = i4;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i4 + 1;
            this.y = i5;
            bArr[i4] = (byte) (i >> 8);
            this.y = i5 + 1;
            bArr[i5] = (byte) i;
            return;
        }
        b(i >> 16);
        b(i >> 8);
        b(i);
    }

    public void f(int i) {
        int i2 = this.y;
        int i3 = i2 + 1;
        byte[] bArr = this.x;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.y = i4;
            bArr[i2] = (byte) (i >> 8);
            this.y = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        b(i >> 8);
        b(i);
    }

    public void flush() {
    }

    public void i() {
        this.q = 0;
        this.y = 0;
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    public byte[] k() {
        int i = this.q + this.y;
        if (i == 0) {
            return c;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.x, 0, bArr, i2, this.y);
        int i3 = i2 + this.y;
        if (i3 == i) {
            if (!this.d.isEmpty()) {
                i();
            }
            return bArr;
        }
        throw new RuntimeException(a.j0("Internal error: total len assumed to be ", i, ", copied ", i3, " bytes"));
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public c(a aVar, int i) {
        this.d = new LinkedList<>();
        this.x = aVar == null ? new byte[(i > 131072 ? 131072 : i)] : aVar.a(2);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.x.length - this.y, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.x, this.y, min);
                i += min;
                this.y += min;
                i2 -= min;
            }
            if (i2 > 0) {
                a();
            } else {
                return;
            }
        }
    }

    public void write(int i) {
        b(i);
    }
}
