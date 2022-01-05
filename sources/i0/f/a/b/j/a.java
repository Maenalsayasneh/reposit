package i0.f.a.b.j;

import i0.f.a.b.i.b;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ByteSourceJsonBootstrapper */
public final class a {
    public final b a;
    public final InputStream b;
    public final byte[] c;
    public int d;
    public int e;
    public final boolean f;
    public boolean g = true;
    public int h;

    public a(b bVar, byte[] bArr, int i, int i2) {
        this.a = bVar;
        this.b = null;
        this.c = bArr;
        this.d = i;
        this.e = i + i2;
        this.f = false;
    }

    public final boolean a(int i) {
        if ((65280 & i) == 0) {
            this.g = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.g = false;
        }
        this.h = 2;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: i0.f.a.b.i.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.io.InputStreamReader} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (a(r5 >>> 16) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        if (a((r5[r9 + 1] & 255) | ((r5[r9] & 255) << 8)) != false) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonParser b(int r29, i0.f.a.b.d r30, i0.f.a.b.k.a r31, i0.f.a.b.k.b r32, int r33) throws java.io.IOException {
        /*
            r28 = this;
            r0 = r28
            r1 = r32
            r2 = r33
            int r3 = r0.d
            r4 = 4
            boolean r5 = r0.c(r4)
            r6 = 0
            r7 = 1
            r8 = 2
            r9 = 16
            r10 = 8
            if (r5 == 0) goto L_0x00c1
            byte[] r5 = r0.c
            int r11 = r0.d
            byte r12 = r5[r11]
            int r12 = r12 << 24
            int r13 = r11 + 1
            byte r13 = r5[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r9
            r12 = r12 | r13
            int r13 = r11 + 2
            byte r14 = r5[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r10
            r12 = r12 | r14
            int r14 = r11 + 3
            byte r5 = r5[r14]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r12
            r12 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            java.lang.String r15 = "3412"
            r16 = 0
            if (r5 == r12) goto L_0x00bd
            r12 = -131072(0xfffffffffffe0000, float:NaN)
            java.lang.String r10 = "2143"
            if (r5 == r12) goto L_0x007d
            r12 = 65279(0xfeff, float:9.1475E-41)
            if (r5 == r12) goto L_0x0075
            r11 = 65534(0xfffe, float:9.1833E-41)
            if (r5 == r11) goto L_0x0071
            int r9 = r5 >>> 16
            if (r9 != r12) goto L_0x0058
            r0.d = r13
            r0.h = r8
            r0.g = r7
            goto L_0x0084
        L_0x0058:
            if (r9 != r11) goto L_0x0061
            r0.d = r13
            r0.h = r8
            r0.g = r6
            goto L_0x0084
        L_0x0061:
            int r9 = r5 >>> 8
            r11 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r9 != r11) goto L_0x006f
            r0.d = r14
            r0.h = r7
            r0.g = r7
            goto L_0x0084
        L_0x006f:
            r9 = r6
            goto L_0x0085
        L_0x0071:
            r0.d(r10)
            throw r16
        L_0x0075:
            r0.g = r7
            int r11 = r11 + r4
            r0.d = r11
            r0.h = r4
            goto L_0x0084
        L_0x007d:
            int r11 = r11 + r4
            r0.d = r11
            r0.h = r4
            r0.g = r6
        L_0x0084:
            r9 = r7
        L_0x0085:
            if (r9 == 0) goto L_0x0088
            goto L_0x00de
        L_0x0088:
            int r9 = r5 >> 8
            if (r9 != 0) goto L_0x008f
            r0.g = r7
            goto L_0x0097
        L_0x008f:
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r5
            if (r9 != 0) goto L_0x009b
            r0.g = r6
        L_0x0097:
            r0.h = r4
            r9 = r7
            goto L_0x00a8
        L_0x009b:
            r9 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r9 = r9 & r5
            if (r9 == 0) goto L_0x00b9
            r9 = -65281(0xffffffffffff00ff, float:NaN)
            r9 = r9 & r5
            if (r9 == 0) goto L_0x00b5
            r9 = r6
        L_0x00a8:
            if (r9 == 0) goto L_0x00ab
            goto L_0x00de
        L_0x00ab:
            r9 = 16
            int r5 = r5 >>> r9
            boolean r5 = r0.a(r5)
            if (r5 == 0) goto L_0x00df
            goto L_0x00de
        L_0x00b5:
            r0.d(r10)
            throw r16
        L_0x00b9:
            r0.d(r15)
            throw r16
        L_0x00bd:
            r0.d(r15)
            throw r16
        L_0x00c1:
            boolean r5 = r0.c(r8)
            if (r5 == 0) goto L_0x00df
            byte[] r5 = r0.c
            int r9 = r0.d
            byte r10 = r5[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 8
            int r10 = r10 << r11
            int r9 = r9 + r7
            byte r5 = r5[r9]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r10
            boolean r5 = r0.a(r5)
            if (r5 == 0) goto L_0x00df
        L_0x00de:
            r6 = r7
        L_0x00df:
            java.lang.String r5 = "Internal error"
            if (r6 != 0) goto L_0x00e6
            com.fasterxml.jackson.core.JsonEncoding r4 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L_0x010a
        L_0x00e6:
            int r6 = r0.h
            if (r6 == r7) goto L_0x0108
            if (r6 == r8) goto L_0x00fe
            if (r6 != r4) goto L_0x00f8
            boolean r4 = r0.g
            if (r4 == 0) goto L_0x00f5
            com.fasterxml.jackson.core.JsonEncoding r4 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L_0x010a
        L_0x00f5:
            com.fasterxml.jackson.core.JsonEncoding r4 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L_0x010a
        L_0x00f8:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r5)
            throw r1
        L_0x00fe:
            boolean r4 = r0.g
            if (r4 == 0) goto L_0x0105
            com.fasterxml.jackson.core.JsonEncoding r4 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L_0x010a
        L_0x0105:
            com.fasterxml.jackson.core.JsonEncoding r4 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L_0x010a
        L_0x0108:
            com.fasterxml.jackson.core.JsonEncoding r4 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L_0x010a:
            i0.f.a.b.i.b r6 = r0.a
            r6.b = r4
            int r6 = r0.d
            int r26 = r6 - r3
            com.fasterxml.jackson.core.JsonEncoding r3 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            if (r4 != r3) goto L_0x0148
            com.fasterxml.jackson.core.JsonFactory$Feature r3 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES
            boolean r3 = r3.enabledIn(r2)
            if (r3 == 0) goto L_0x0148
            r3 = r31
            i0.f.a.b.k.a r22 = r3.q(r2)
            i0.f.a.b.j.g r1 = new i0.f.a.b.j.g
            i0.f.a.b.i.b r2 = r0.a
            java.io.InputStream r3 = r0.b
            byte[] r4 = r0.c
            int r5 = r0.d
            int r6 = r0.e
            boolean r7 = r0.f
            r17 = r1
            r18 = r2
            r19 = r29
            r20 = r3
            r21 = r30
            r23 = r4
            r24 = r5
            r25 = r6
            r27 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x0148:
            i0.f.a.b.j.f r3 = new i0.f.a.b.j.f
            i0.f.a.b.i.b r9 = r0.a
            com.fasterxml.jackson.core.JsonEncoding r4 = r9.b
            int r6 = r4.bits()
            r7 = 8
            if (r6 == r7) goto L_0x017c
            r7 = 16
            if (r6 == r7) goto L_0x017c
            r4 = 32
            if (r6 != r4) goto L_0x0176
            i0.f.a.b.i.h r4 = new i0.f.a.b.i.h
            i0.f.a.b.i.b r11 = r0.a
            java.io.InputStream r12 = r0.b
            byte[] r13 = r0.c
            int r14 = r0.d
            int r15 = r0.e
            com.fasterxml.jackson.core.JsonEncoding r5 = r11.b
            boolean r16 = r5.isBigEndian()
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r11 = r4
            goto L_0x01ab
        L_0x0176:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r5)
            throw r1
        L_0x017c:
            java.io.InputStream r12 = r0.b
            if (r12 != 0) goto L_0x018c
            java.io.ByteArrayInputStream r12 = new java.io.ByteArrayInputStream
            byte[] r5 = r0.c
            int r6 = r0.d
            int r7 = r0.e
            r12.<init>(r5, r6, r7)
            goto L_0x01a1
        L_0x018c:
            int r5 = r0.d
            int r6 = r0.e
            if (r5 >= r6) goto L_0x01a1
            i0.f.a.b.i.d r5 = new i0.f.a.b.i.d
            i0.f.a.b.i.b r11 = r0.a
            byte[] r13 = r0.c
            int r14 = r0.d
            int r15 = r0.e
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            r12 = r5
        L_0x01a1:
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            java.lang.String r4 = r4.getJavaName()
            r5.<init>(r12, r4)
            r11 = r5
        L_0x01ab:
            i0.f.a.b.k.b r13 = new i0.f.a.b.k.b
            int r4 = r1.c
            java.util.concurrent.atomic.AtomicReference<i0.f.a.b.k.b$b> r5 = r1.b
            java.lang.Object r5 = r5.get()
            i0.f.a.b.k.b$b r5 = (i0.f.a.b.k.b.C0119b) r5
            r13.<init>(r1, r2, r4, r5)
            r8 = r3
            r10 = r29
            r12 = r30
            r8.<init>(r9, r10, r11, r12, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.a.b(int, i0.f.a.b.d, i0.f.a.b.k.a, i0.f.a.b.k.b, int):com.fasterxml.jackson.core.JsonParser");
    }

    public boolean c(int i) throws IOException {
        int i2;
        int i3 = this.e - this.d;
        while (i3 < i) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.c;
                int i4 = this.e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.e += i2;
            i3 += i2;
        }
        return true;
    }

    public final void d(String str) throws IOException {
        throw new CharConversionException(i0.d.a.a.a.o0("Unsupported UCS-4 endianness (", str, ") detected"));
    }
}
