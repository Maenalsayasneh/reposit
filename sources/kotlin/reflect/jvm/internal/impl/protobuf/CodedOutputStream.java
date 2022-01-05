package kotlin.reflect.jvm.internal.impl.protobuf;

import i0.d.a.a.a;
import java.io.IOException;
import java.io.OutputStream;
import m0.r.t.a.r.h.c;
import m0.r.t.a.r.h.l;

public final class CodedOutputStream {
    public final byte[] a;
    public final int b;
    public int c;
    public int d = 0;
    public final OutputStream e;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.e = outputStream;
        this.a = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public static int a(c cVar) {
        return cVar.size() + g(cVar.size());
    }

    public static int b(int i, int i2) {
        return i(i) + d(i2);
    }

    public static int c(int i, int i2) {
        return d(i2) + i(i);
    }

    public static int d(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int e(int i, l lVar) {
        int i2 = i(i);
        int e2 = lVar.e();
        return i2 + g(e2) + e2;
    }

    public static int f(l lVar) {
        int e2 = lVar.e();
        return g(e2) + e2;
    }

    public static int g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int h(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int i(int i) {
        return g((i << 3) | 0);
    }

    public static CodedOutputStream k(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public void A(int i, int i2) throws IOException {
        y((i << 3) | i2);
    }

    public void j() throws IOException {
        if (this.e != null) {
            l();
        }
    }

    public final void l() throws IOException {
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public void m(c cVar) throws IOException {
        y(cVar.size());
        u(cVar);
    }

    public void n(int i, int i2) throws IOException {
        y((i << 3) | 0);
        if (i2 >= 0) {
            y(i2);
        } else {
            z((long) i2);
        }
    }

    public void o(int i) throws IOException {
        if (i >= 0) {
            y(i);
        } else {
            z((long) i);
        }
    }

    public void p(int i, int i2) throws IOException {
        y((i << 3) | 0);
        if (i2 >= 0) {
            y(i2);
        } else {
            z((long) i2);
        }
    }

    public void q(int i) throws IOException {
        if (i >= 0) {
            y(i);
        } else {
            z((long) i);
        }
    }

    public void r(int i, l lVar) throws IOException {
        y((i << 3) | 2);
        y(lVar.e());
        lVar.d(this);
    }

    public void s(l lVar) throws IOException {
        y(lVar.e());
        lVar.d(this);
    }

    public void t(int i) throws IOException {
        byte b2 = (byte) i;
        if (this.c == this.b) {
            l();
        }
        byte[] bArr = this.a;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b2;
        this.d++;
    }

    public void u(c cVar) throws IOException {
        int size = cVar.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= size) {
            cVar.j(this.a, 0, i2, size);
            this.c += size;
            this.d += size;
            return;
        }
        cVar.j(this.a, 0, i2, i3);
        int i4 = i3 + 0;
        int i5 = size - i3;
        this.c = this.b;
        this.d += i3;
        l();
        if (i5 <= this.b) {
            cVar.j(this.a, i4, 0, i5);
            this.c = i5;
        } else {
            OutputStream outputStream = this.e;
            if (i4 < 0) {
                throw new IndexOutOfBoundsException(a.Q(30, "Source offset < 0: ", i4));
            } else if (i5 >= 0) {
                int i6 = i4 + i5;
                if (i6 > cVar.size()) {
                    throw new IndexOutOfBoundsException(a.Q(39, "Source end offset exceeded: ", i6));
                } else if (i5 > 0) {
                    cVar.A(outputStream, i4, i5);
                }
            } else {
                throw new IndexOutOfBoundsException(a.Q(23, "Length < 0: ", i5));
            }
        }
        this.d += i5;
    }

    public void v(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, this.a, i2, length);
            this.c += length;
            this.d += length;
            return;
        }
        System.arraycopy(bArr, 0, this.a, i2, i3);
        int i4 = i3 + 0;
        int i5 = length - i3;
        this.c = this.b;
        this.d += i3;
        l();
        if (i5 <= this.b) {
            System.arraycopy(bArr, i4, this.a, 0, i5);
            this.c = i5;
        } else {
            this.e.write(bArr, i4, i5);
        }
        this.d += i5;
    }

    public void w(int i) throws IOException {
        t(i & 255);
        t((i >> 8) & 255);
        t((i >> 16) & 255);
        t((i >> 24) & 255);
    }

    public void x(long j) throws IOException {
        t(((int) j) & 255);
        t(((int) (j >> 8)) & 255);
        t(((int) (j >> 16)) & 255);
        t(((int) (j >> 24)) & 255);
        t(((int) (j >> 32)) & 255);
        t(((int) (j >> 40)) & 255);
        t(((int) (j >> 48)) & 255);
        t(((int) (j >> 56)) & 255);
    }

    public void y(int i) throws IOException {
        while ((i & -128) != 0) {
            t((i & 127) | 128);
            i >>>= 7;
        }
        t(i);
    }

    public void z(long j) throws IOException {
        while ((-128 & j) != 0) {
            t((((int) j) & 127) | 128);
            j >>>= 7;
        }
        t((int) j);
    }
}
