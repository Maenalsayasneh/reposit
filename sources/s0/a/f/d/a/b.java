package s0.a.f.d.a;

import i0.d.a.a.a;
import s0.a.e.b.b0.c.h3;

public class b {
    public int a = 0;
    public int b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(byte[] r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.a = r0
            int r1 = r10.length
            java.lang.String r2 = "byte array is not an encoded finite field"
            r3 = 4
            if (r1 != r3) goto L_0x005f
            byte r1 = r10[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            byte r4 = r10[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r1 = r1 | r4
            r4 = 2
            byte r5 = r10[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r1 = r1 | r5
            r5 = 3
            byte r10 = r10[r5]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            r10 = r10 | r1
            r9.b = r10
            if (r10 != 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            int r1 = s0.a.e.b.b0.c.h3.x0(r10)
            int r1 = r1 >>> r3
            r5 = r0
        L_0x0033:
            if (r5 >= r1) goto L_0x004d
            int r4 = s0.a.e.b.b0.c.h3.q2(r4, r4, r10)
            r6 = r4 ^ 2
            r7 = r6
            r6 = r10
        L_0x003d:
            if (r6 == 0) goto L_0x0047
            int r7 = s0.a.e.b.b0.c.h3.I2(r7, r6)
            r8 = r7
            r7 = r6
            r6 = r8
            goto L_0x003d
        L_0x0047:
            if (r7 == r3) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 == 0) goto L_0x0059
            int r10 = r9.b
            int r10 = s0.a.e.b.b0.c.h3.x0(r10)
            r9.a = r10
            return
        L_0x0059:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        L_0x005f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.d.a.b.<init>(byte[]):void");
    }

    public byte[] a() {
        int i = this.b;
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    public int b(int i) {
        int i2 = (1 << this.a) - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = b(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = d(i3, i);
            }
            i = d(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public boolean c(int i) {
        int i2 = this.a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public int d(int i, int i2) {
        return h3.q2(i, i2, this.b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        String str;
        StringBuilder P0 = a.P0("Finite Field GF(2^");
        P0.append(this.a);
        P0.append(") = GF(2)[X]/<");
        int i = this.b;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? "1" : "";
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str2 = str2 + "+x^" + i3;
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        return a.y0(P0, str, "> ");
    }
}
