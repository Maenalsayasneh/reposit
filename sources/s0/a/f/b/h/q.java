package s0.a.f.b.h;

import java.io.IOException;
import s0.a.e.b.b0.c.h3;
import s0.a.g.d;

public final class q extends n implements d {
    public final byte[] Y1;
    public final o q;
    public final int x;
    public final byte[] y;

    public static class b {
        public final o a;
        public byte[] b = null;
        public byte[] c = null;
        public byte[] d = null;

        public b(o oVar) {
            this.a = oVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(s0.a.f.b.h.q.b r5, s0.a.f.b.h.q.a r6) {
        /*
            r4 = this;
            s0.a.f.b.h.o r6 = r5.a
            s0.a.f.b.h.s r0 = r6.c
            java.lang.String r1 = r0.g
            r2 = 0
            r4.<init>(r2, r1)
            r4.q = r6
            int r0 = r0.h
            byte[] r1 = r5.d
            if (r1 == 0) goto L_0x004b
            int r5 = r1.length
            int r6 = r0 + r0
            if (r5 != r6) goto L_0x0028
            r4.x = r2
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r1, r2, r0)
            r4.y = r5
            int r5 = r0 + 0
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r1, r5, r0)
            r4.Y1 = r5
            goto L_0x0084
        L_0x0028:
            int r5 = r1.length
            int r6 = r0 + 4
            int r3 = r6 + r0
            if (r5 != r3) goto L_0x0043
            int r5 = s0.a.e.b.b0.c.h3.y(r1, r2)
            r4.x = r5
            r5 = 4
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r1, r5, r0)
            r4.y = r5
            byte[] r5 = s0.a.e.b.b0.c.h3.O0(r1, r6, r0)
            r4.Y1 = r5
            goto L_0x0084
        L_0x0043:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "public key has wrong size"
            r5.<init>(r6)
            throw r5
        L_0x004b:
            s0.a.f.b.h.r r6 = r6.b
            if (r6 == 0) goto L_0x0056
            int r6 = r6.a()
            r4.x = r6
            goto L_0x0058
        L_0x0056:
            r4.x = r2
        L_0x0058:
            byte[] r6 = r5.b
            if (r6 == 0) goto L_0x006a
            int r1 = r6.length
            if (r1 != r0) goto L_0x0062
            r4.y = r6
            goto L_0x006e
        L_0x0062:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "length of root must be equal to length of digest"
            r5.<init>(r6)
            throw r5
        L_0x006a:
            byte[] r6 = new byte[r0]
            r4.y = r6
        L_0x006e:
            byte[] r5 = r5.c
            if (r5 == 0) goto L_0x0080
            int r6 = r5.length
            if (r6 != r0) goto L_0x0078
            r4.Y1 = r5
            goto L_0x0084
        L_0x0078:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "length of publicSeed must be equal to length of digest"
            r5.<init>(r6)
            throw r5
        L_0x0080:
            byte[] r5 = new byte[r0]
            r4.Y1 = r5
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.h.q.<init>(s0.a.f.b.h.q$b, s0.a.f.b.h.q$a):void");
    }

    public byte[] a() {
        byte[] bArr;
        int i = this.q.c.h;
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

    public byte[] getEncoded() throws IOException {
        return a();
    }
}
