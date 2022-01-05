package s0.a.f.b.h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import s0.a.e.b.b0.c.h3;
import s0.a.g.d;

public final class p extends n implements d {
    public final byte[] Y1;
    public final byte[] Z1;
    public volatile long a2;
    public volatile BDSStateMap b2;
    public final o q;
    public final byte[] x;
    public final byte[] y;

    public static class b {
        public final o a;
        public long b = 0;
        public long c = -1;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public byte[] g = null;
        public BDSStateMap h = null;

        public b(o oVar) {
            this.a = oVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(s0.a.f.b.h.p.b r7, s0.a.f.b.h.p.a r8) {
        /*
            r6 = this;
            s0.a.f.b.h.o r1 = r7.a
            s0.a.f.b.h.s r8 = r1.c
            java.lang.String r0 = r8.g
            r2 = 1
            r6.<init>(r2, r0)
            r6.q = r1
            int r8 = r8.h
            long r2 = r7.b
            r6.a2 = r2
            byte[] r5 = r7.d
            if (r5 == 0) goto L_0x0024
            int r0 = r5.length
            if (r0 != r8) goto L_0x001c
            r6.x = r5
            goto L_0x0028
        L_0x001c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "size of secretKeySeed needs to be equal size of digest"
            r7.<init>(r8)
            throw r7
        L_0x0024:
            byte[] r0 = new byte[r8]
            r6.x = r0
        L_0x0028:
            byte[] r0 = r7.e
            if (r0 == 0) goto L_0x003a
            int r2 = r0.length
            if (r2 != r8) goto L_0x0032
            r6.y = r0
            goto L_0x003e
        L_0x0032:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "size of secretKeyPRF needs to be equal size of digest"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            byte[] r0 = new byte[r8]
            r6.y = r0
        L_0x003e:
            byte[] r4 = r7.f
            if (r4 == 0) goto L_0x0050
            int r0 = r4.length
            if (r0 != r8) goto L_0x0048
            r6.Y1 = r4
            goto L_0x0054
        L_0x0048:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "size of publicSeed needs to be equal size of digest"
            r7.<init>(r8)
            throw r7
        L_0x0050:
            byte[] r0 = new byte[r8]
            r6.Y1 = r0
        L_0x0054:
            byte[] r0 = r7.g
            if (r0 == 0) goto L_0x0066
            int r2 = r0.length
            if (r2 != r8) goto L_0x005e
            r6.Z1 = r0
            goto L_0x006a
        L_0x005e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "size of root needs to be equal size of digest"
            r7.<init>(r8)
            throw r7
        L_0x0066:
            byte[] r8 = new byte[r8]
            r6.Z1 = r8
        L_0x006a:
            org.bouncycastle.pqc.crypto.xmss.BDSStateMap r8 = r7.h
            if (r8 == 0) goto L_0x006f
            goto L_0x0090
        L_0x006f:
            long r2 = r7.b
            int r8 = r1.d
            boolean r8 = s0.a.e.b.b0.c.h3.G1(r8, r2)
            if (r8 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0086
            org.bouncycastle.pqc.crypto.xmss.BDSStateMap r8 = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap
            long r2 = r7.b
            r0 = r8
            r0.<init>(r1, r2, r4, r5)
            goto L_0x0090
        L_0x0086:
            org.bouncycastle.pqc.crypto.xmss.BDSStateMap r8 = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap
            long r0 = r7.c
            r2 = 1
            long r0 = r0 + r2
            r8.<init>(r0)
        L_0x0090:
            r6.b2 = r8
            long r7 = r7.c
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            org.bouncycastle.pqc.crypto.xmss.BDSStateMap r0 = r6.b2
            long r0 = r0.d
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "maxIndex set but not reflected in state"
            r7.<init>(r8)
            throw r7
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.h.p.<init>(s0.a.f.b.h.p$b, s0.a.f.b.h.p$a):void");
    }

    public byte[] a() {
        byte[] R;
        synchronized (this) {
            o oVar = this.q;
            int i = oVar.c.h;
            int i2 = (oVar.d + 7) / 8;
            byte[] bArr = new byte[(i2 + i + i + i + i)];
            h3.o0(bArr, h3.s3(this.a2, i2), 0);
            int i3 = i2 + 0;
            h3.o0(bArr, this.x, i3);
            int i4 = i3 + i;
            h3.o0(bArr, this.y, i4);
            int i5 = i4 + i;
            h3.o0(bArr, this.Y1, i5);
            h3.o0(bArr, this.Z1, i5 + i);
            try {
                BDSStateMap bDSStateMap = this.b2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(bDSStateMap);
                objectOutputStream.flush();
                R = h3.R(bArr, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
            }
        }
        return R;
    }

    public byte[] getEncoded() throws IOException {
        byte[] a3;
        synchronized (this) {
            a3 = a();
        }
        return a3;
    }
}
