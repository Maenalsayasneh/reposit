package i0.f.a.b.i;

import i0.d.a.a.a;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: UTF32Reader */
public class h extends Reader {
    public final boolean Y1;
    public char Z1 = 0;
    public int a2;
    public int b2;
    public final b c;
    public final boolean c2;
    public InputStream d;
    public char[] d2;
    public byte[] q;
    public int x;
    public int y;

    public h(b bVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.c = bVar;
        this.d = inputStream;
        this.q = bArr;
        this.x = i;
        this.y = i2;
        this.Y1 = z;
        this.c2 = inputStream != null ? true : z2;
    }

    public final void a() {
        byte[] bArr = this.q;
        if (bArr != null) {
            this.q = null;
            this.c.g(bArr);
        }
    }

    public final void b(int i, int i2) throws IOException {
        int i3 = this.b2 + i;
        int i4 = this.a2;
        StringBuilder R0 = a.R0("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed ", i2, ", at char #");
        R0.append(i4);
        R0.append(", byte #");
        R0.append(i3);
        R0.append(")");
        throw new CharConversionException(R0.toString());
    }

    public void close() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            this.d = null;
            a();
            inputStream.close();
        }
    }

    public int read() throws IOException {
        if (this.d2 == null) {
            this.d2 = new char[1];
        }
        if (read(this.d2, 0, 1) < 1) {
            return -1;
        }
        return this.d2[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r13, int r14, int r15) throws java.io.IOException {
        /*
            r12 = this;
            byte[] r0 = r12.q
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 1
            if (r15 >= r2) goto L_0x000a
            return r15
        L_0x000a:
            if (r14 < 0) goto L_0x0165
            int r3 = r14 + r15
            int r4 = r13.length
            if (r3 > r4) goto L_0x0165
            char r15 = r12.Z1
            r4 = 0
            r5 = 4
            if (r15 == 0) goto L_0x001f
            int r0 = r14 + 1
            r13[r14] = r15
            r12.Z1 = r4
            goto L_0x009e
        L_0x001f:
            int r15 = r12.y
            int r6 = r12.x
            int r7 = r15 - r6
            if (r7 >= r5) goto L_0x009d
            int r8 = r12.b2
            int r15 = r15 - r7
            int r15 = r15 + r8
            r12.b2 = r15
            java.lang.String r15 = "Strange I/O stream, returned 0 bytes on read"
            r8 = 0
            if (r7 <= 0) goto L_0x003c
            if (r6 <= 0) goto L_0x0039
            java.lang.System.arraycopy(r0, r6, r0, r4, r7)
            r12.x = r4
        L_0x0039:
            r12.y = r7
            goto L_0x005f
        L_0x003c:
            r12.x = r4
            java.io.InputStream r6 = r12.d
            if (r6 != 0) goto L_0x0044
            r0 = r1
            goto L_0x0048
        L_0x0044:
            int r0 = r6.read(r0)
        L_0x0048:
            if (r0 >= r2) goto L_0x005d
            r12.y = r4
            if (r0 >= 0) goto L_0x0057
            boolean r15 = r12.c2
            if (r15 == 0) goto L_0x0055
            r12.a()
        L_0x0055:
            r15 = r4
            goto L_0x008f
        L_0x0057:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r15)
            throw r13
        L_0x005d:
            r12.y = r0
        L_0x005f:
            int r0 = r12.y
            if (r0 >= r5) goto L_0x008e
            java.io.InputStream r6 = r12.d
            if (r6 != 0) goto L_0x0069
            r0 = r1
            goto L_0x0071
        L_0x0069:
            byte[] r9 = r12.q
            int r10 = r9.length
            int r10 = r10 - r0
            int r0 = r6.read(r9, r0, r10)
        L_0x0071:
            if (r0 >= r2) goto L_0x0088
            if (r0 >= 0) goto L_0x0082
            boolean r13 = r12.c2
            if (r13 == 0) goto L_0x007c
            r12.a()
        L_0x007c:
            int r13 = r12.y
            r12.b(r13, r5)
            throw r8
        L_0x0082:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r15)
            throw r13
        L_0x0088:
            int r6 = r12.y
            int r6 = r6 + r0
            r12.y = r6
            goto L_0x005f
        L_0x008e:
            r15 = r2
        L_0x008f:
            if (r15 != 0) goto L_0x009d
            if (r7 != 0) goto L_0x0094
            return r1
        L_0x0094:
            int r13 = r12.y
            int r14 = r12.x
            int r13 = r13 - r14
            r12.b(r13, r5)
            throw r8
        L_0x009d:
            r0 = r14
        L_0x009e:
            int r15 = r12.y
            int r15 = r15 - r5
        L_0x00a1:
            if (r0 >= r3) goto L_0x015e
            int r5 = r12.x
            boolean r6 = r12.Y1
            if (r6 == 0) goto L_0x00c6
            byte[] r6 = r12.q
            byte r7 = r6[r5]
            int r7 = r7 << 8
            int r8 = r5 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            int r8 = r5 + 2
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r9 = r5 + 3
            byte r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r8
            goto L_0x00e5
        L_0x00c6:
            byte[] r6 = r12.q
            byte r7 = r6[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = r5 + 2
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r5 + 3
            byte r6 = r6[r9]
            int r6 = r6 << 8
            r6 = r6 | r8
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x00e5:
            int r5 = r5 + 4
            r12.x = r5
            if (r7 == 0) goto L_0x0156
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r8 = r7 + -1
            r9 = 16
            int r8 = r8 << r9
            r6 = r6 | r8
            if (r7 > r9) goto L_0x0112
            int r7 = r0 + 1
            r8 = 55296(0xd800, float:7.7486E-41)
            int r9 = r6 >> 10
            int r9 = r9 + r8
            char r8 = (char) r9
            r13[r0] = r8
            r0 = 56320(0xdc00, float:7.8921E-41)
            r8 = r6 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r8
            if (r7 < r3) goto L_0x010f
            char r13 = (char) r6
            r12.Z1 = r13
            r0 = r7
            goto L_0x015e
        L_0x010f:
            r6 = r0
            r0 = r7
            goto L_0x0156
        L_0x0112:
            int r0 = r0 - r14
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r14 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r4] = r14
            java.lang.String r14 = " (above 0x%08x)"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            int r14 = r12.b2
            int r15 = r12.x
            int r14 = r14 + r15
            int r14 = r14 + r1
            int r15 = r12.a2
            int r15 = r15 + r0
            java.io.CharConversionException r0 = new java.io.CharConversionException
            java.lang.String r1 = "Invalid UTF-32 character 0x"
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r6)
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " at char #"
            r1.append(r13)
            r1.append(r15)
            java.lang.String r13 = ", byte #"
            r1.append(r13)
            java.lang.String r13 = ")"
            java.lang.String r13 = i0.d.a.a.a.u0(r1, r14, r13)
            r0.<init>(r13)
            throw r0
        L_0x0156:
            int r7 = r0 + 1
            char r6 = (char) r6
            r13[r0] = r6
            r0 = r7
            if (r5 <= r15) goto L_0x00a1
        L_0x015e:
            int r0 = r0 - r14
            int r13 = r12.a2
            int r13 = r13 + r0
            r12.a2 = r13
            return r0
        L_0x0165:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "read(buf,"
            java.lang.String r2 = ","
            java.lang.String r3 = "), cbuf["
            java.lang.StringBuilder r14 = i0.d.a.a.a.R0(r1, r14, r2, r15, r3)
            int r13 = r13.length
            java.lang.String r15 = "]"
            java.lang.String r13 = i0.d.a.a.a.u0(r14, r13, r15)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.i.h.read(char[], int, int):int");
    }
}
