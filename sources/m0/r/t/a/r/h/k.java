package m0.r.t.a.r.h;

import i0.j.f.p.h;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import m0.r.t.a.r.h.c;

/* compiled from: LiteralByteString */
public class k extends c {
    public final byte[] d;
    public int q = 0;

    /* compiled from: LiteralByteString */
    public class b implements c.a {
        public int c = 0;
        public final int d;

        public b(a aVar) {
            this.d = k.this.d.length;
        }

        public byte b() {
            try {
                byte[] bArr = k.this.d;
                int i = this.c;
                this.c = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public boolean hasNext() {
            return this.c < this.d;
        }

        public Object next() {
            return Byte.valueOf(b());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public k(byte[] bArr) {
        this.d = bArr;
    }

    public void A(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.d, C() + i, i2);
    }

    public boolean B(k kVar, int i, int i2) {
        if (i2 > kVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= kVar.size()) {
            byte[] bArr = this.d;
            byte[] bArr2 = kVar.d;
            int C = C() + i2;
            int C2 = C();
            int C3 = kVar.C() + i;
            while (C2 < C) {
                if (bArr[C2] != bArr2[C3]) {
                    return false;
                }
                C2++;
                C3++;
            }
            return true;
        } else {
            int size2 = kVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int C() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || size() != ((c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof k) {
            return B((k) obj, 0, size());
        }
        if (obj instanceof o) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(i0.d.a.a.a.y0(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public int hashCode() {
        int i = this.q;
        if (i == 0) {
            int size = size();
            i = v(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.q = i;
        }
        return i;
    }

    public void k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.d, i, bArr, i2, i3);
    }

    public int o() {
        return 0;
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        int C = C();
        return h.A2(this.d, C, size() + C);
    }

    public int size() {
        return this.d.length;
    }

    /* renamed from: t */
    public c.a iterator() {
        return new b((a) null);
    }

    public int v(int i, int i2, int i3) {
        byte[] bArr = this.d;
        int C = C() + i2;
        for (int i4 = C; i4 < C + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int w(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.C()
            int r0 = r0 + r9
            byte[] r9 = r7.d
            int r10 = r10 + r0
            if (r8 == 0) goto L_0x008d
            if (r0 < r10) goto L_0x000e
            goto L_0x0091
        L_0x000e:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L_0x0027
            r8 = -62
            if (r1 < r8) goto L_0x0024
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r0 = r8
            goto L_0x008d
        L_0x0024:
            r8 = r3
            goto L_0x0091
        L_0x0027:
            r5 = -16
            if (r1 >= r5) goto L_0x0054
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L_0x003f
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r8 < r10) goto L_0x003c
            int r8 = i0.j.f.p.h.U1(r1, r0)
            goto L_0x0091
        L_0x003c:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x003f:
            if (r8 > r4) goto L_0x0024
            r5 = -96
            if (r1 != r2) goto L_0x0047
            if (r8 < r5) goto L_0x0024
        L_0x0047:
            r2 = -19
            if (r1 != r2) goto L_0x004d
            if (r8 >= r5) goto L_0x0024
        L_0x004d:
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x0054:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            r5 = 0
            if (r2 != 0) goto L_0x0068
            int r8 = r0 + 1
            byte r2 = r9[r0]
            if (r8 < r10) goto L_0x0066
            int r8 = i0.j.f.p.h.U1(r1, r2)
            goto L_0x0091
        L_0x0066:
            r0 = r8
            goto L_0x006b
        L_0x0068:
            int r8 = r8 >> 16
            byte r5 = (byte) r8
        L_0x006b:
            if (r5 != 0) goto L_0x0079
            int r8 = r0 + 1
            byte r5 = r9[r0]
            if (r8 < r10) goto L_0x0078
            int r8 = i0.j.f.p.h.V1(r1, r2, r5)
            goto L_0x0091
        L_0x0078:
            r0 = r8
        L_0x0079:
            if (r2 > r4) goto L_0x0024
            int r8 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r8
            int r8 = r2 >> 30
            if (r8 != 0) goto L_0x0024
            if (r5 > r4) goto L_0x0024
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x008d:
            int r8 = i0.j.f.p.h.i3(r9, r0, r10)
        L_0x0091:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.h.k.w(int, int, int):int");
    }

    public int x() {
        return this.q;
    }

    public String y(String str) throws UnsupportedEncodingException {
        byte[] bArr = this.d;
        return new String(bArr, 0, bArr.length, str);
    }
}
