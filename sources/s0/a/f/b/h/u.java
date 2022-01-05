package s0.a.f.b.h;

import java.io.IOException;
import s0.a.e.b.b0.c.h3;
import s0.a.g.d;

public final class u extends m implements d {
    public final byte[] Y1;
    public final s q;
    public final int x;
    public final byte[] y;

    public static class b {
        public final s a;
        public byte[] b = null;
        public byte[] c = null;
        public byte[] d = null;

        public b(s sVar) {
            this.a = sVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(s0.a.f.b.h.u.b r5, s0.a.f.b.h.u.a r6) {
        /*
            r4 = this;
            s0.a.f.b.h.s r6 = r5.a
            java.lang.String r0 = r6.g
            r1 = 0
            r4.<init>(r1, r0)
            r4.q = r6
            int r0 = r6.h
            byte[] r2 = r5.d
            if (r2 == 0) goto L_0x0049
            int r5 = r2.length
            int r6 = r0 + r0
            if (r5 != r6) goto L_0x0026
            r4.x = r1
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r2, r1, r0)
            r4.y = r5
            int r5 = r0 + 0
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r2, r5, r0)
            r4.Y1 = r5
            goto L_0x0082
        L_0x0026:
            int r5 = r2.length
            int r6 = r0 + 4
            int r3 = r6 + r0
            if (r5 != r3) goto L_0x0041
            int r5 = s0.a.e.b.b0.c.h3.y(r2, r1)
            r4.x = r5
            r5 = 4
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r2, r5, r0)
            r4.y = r5
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r2, r6, r0)
            r4.Y1 = r5
            goto L_0x0082
        L_0x0041:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "public key has wrong size"
            r5.<init>(r6)
            throw r5
        L_0x0049:
            s0.a.f.b.h.r r6 = r6.b
            if (r6 == 0) goto L_0x0054
            int r6 = r6.a()
            r4.x = r6
            goto L_0x0056
        L_0x0054:
            r4.x = r1
        L_0x0056:
            byte[] r6 = r5.b
            if (r6 == 0) goto L_0x0068
            int r1 = r6.length
            if (r1 != r0) goto L_0x0060
            r4.y = r6
            goto L_0x006c
        L_0x0060:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "length of root must be equal to length of digest"
            r5.<init>(r6)
            throw r5
        L_0x0068:
            byte[] r6 = new byte[r0]
            r4.y = r6
        L_0x006c:
            byte[] r5 = r5.c
            if (r5 == 0) goto L_0x007e
            int r6 = r5.length
            if (r6 != r0) goto L_0x0076
            r4.Y1 = r5
            goto L_0x0082
        L_0x0076:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "length of publicSeed must be equal to length of digest"
            r5.<init>(r6)
            throw r5
        L_0x007e:
            byte[] r5 = new byte[r0]
            r4.Y1 = r5
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.h.u.<init>(s0.a.f.b.h.u$b, s0.a.f.b.h.u$a):void");
    }

    public byte[] getEncoded() throws IOException {
        byte[] bArr;
        int i = this.q.h;
        int i2 = 0;
        int i3 = this.x;
        if (i3 != 0) {
            bArr = new byte[(i + 4 + i)];
            h3.B1(i3, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[(i + i)];
        }
        h3.o0(bArr, this.y, i2);
        h3.o0(bArr, this.Y1, i2 + i);
        return bArr;
    }
}
