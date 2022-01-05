package s0.a.f.b.h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import s0.a.e.b.b0.c.h3;
import s0.a.g.d;

public final class t extends m implements d {
    public final byte[] Y1;
    public final byte[] Z1;
    public volatile BDS a2;
    public final s q;
    public final byte[] x;
    public final byte[] y;

    public static class b {
        public final s a;
        public int b = 0;
        public int c = -1;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public byte[] g = null;
        public BDS h = null;

        public b(s sVar) {
            this.a = sVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(s0.a.f.b.h.t.b r10, s0.a.f.b.h.t.a r11) {
        /*
            r9 = this;
            s0.a.f.b.h.s r11 = r10.a
            java.lang.String r0 = r11.g
            r1 = 1
            r9.<init>(r1, r0)
            r9.q = r11
            int r0 = r11.h
            byte[] r2 = r10.d
            if (r2 == 0) goto L_0x001e
            int r3 = r2.length
            if (r3 != r0) goto L_0x0016
            r9.x = r2
            goto L_0x0022
        L_0x0016:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "size of secretKeySeed needs to be equal size of digest"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            byte[] r3 = new byte[r0]
            r9.x = r3
        L_0x0022:
            byte[] r3 = r10.e
            if (r3 == 0) goto L_0x0034
            int r4 = r3.length
            if (r4 != r0) goto L_0x002c
            r9.y = r3
            goto L_0x0038
        L_0x002c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "size of secretKeyPRF needs to be equal size of digest"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            byte[] r3 = new byte[r0]
            r9.y = r3
        L_0x0038:
            byte[] r3 = r10.f
            if (r3 == 0) goto L_0x004a
            int r4 = r3.length
            if (r4 != r0) goto L_0x0042
            r9.Y1 = r3
            goto L_0x004e
        L_0x0042:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "size of publicSeed needs to be equal size of digest"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            byte[] r4 = new byte[r0]
            r9.Y1 = r4
        L_0x004e:
            byte[] r4 = r10.g
            if (r4 == 0) goto L_0x0060
            int r5 = r4.length
            if (r5 != r0) goto L_0x0058
            r9.Z1 = r4
            goto L_0x0064
        L_0x0058:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "size of root needs to be equal size of digest"
            r10.<init>(r11)
            throw r10
        L_0x0060:
            byte[] r0 = new byte[r0]
            r9.Z1 = r0
        L_0x0064:
            org.bouncycastle.pqc.crypto.xmss.BDS r0 = r10.h
            if (r0 == 0) goto L_0x0069
            goto L_0x00a2
        L_0x0069:
            int r0 = r10.b
            int r4 = r11.c
            int r4 = r1 << r4
            int r5 = r4 + -2
            if (r0 >= r5) goto L_0x00a5
            if (r3 == 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00a5
            org.bouncycastle.pqc.crypto.xmss.BDS r0 = new org.bouncycastle.pqc.crypto.xmss.BDS
            s0.a.f.b.h.g$b r4 = new s0.a.f.b.h.g$b
            r4.<init>()
            s0.a.f.b.h.l r4 = r4.e()
            s0.a.f.b.h.g r4 = (s0.a.f.b.h.g) r4
            int r5 = r10.b
            s0.a.f.b.h.h r6 = r11.a()
            int r7 = r11.c
            int r11 = r11.d
            int r8 = r1 << r7
            int r8 = r8 - r1
            r0.<init>((s0.a.f.b.h.h) r6, (int) r7, (int) r11, (int) r8)
            r0.a(r3, r2, r4)
        L_0x0097:
            int r11 = r0.c2
            if (r11 >= r5) goto L_0x00a2
            r0.b(r3, r2, r4)
            r11 = 0
            r0.d2 = r11
            goto L_0x0097
        L_0x00a2:
            r9.a2 = r0
            goto L_0x00bb
        L_0x00a5:
            org.bouncycastle.pqc.crypto.xmss.BDS r2 = new org.bouncycastle.pqc.crypto.xmss.BDS
            int r4 = r4 - r1
            s0.a.f.b.h.h r3 = r11.a()
            int r5 = r11.c
            int r11 = r11.d
            r2.<init>((s0.a.f.b.h.h) r3, (int) r5, (int) r11, (int) r0)
            r2.e2 = r4
            r2.c2 = r0
            r2.d2 = r1
            r9.a2 = r2
        L_0x00bb:
            int r10 = r10.c
            if (r10 < 0) goto L_0x00ce
            org.bouncycastle.pqc.crypto.xmss.BDS r11 = r9.a2
            int r11 = r11.e2
            if (r10 != r11) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "maxIndex set but not reflected in state"
            r10.<init>(r11)
            throw r10
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.h.t.<init>(s0.a.f.b.h.t$b, s0.a.f.b.h.t$a):void");
    }

    public byte[] a() {
        byte[] R;
        synchronized (this) {
            int i = this.q.h;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[(i + i4)];
            h3.B1(this.a2.c2, bArr, 0);
            h3.o0(bArr, this.x, 4);
            h3.o0(bArr, this.y, i2);
            h3.o0(bArr, this.Y1, i3);
            h3.o0(bArr, this.Z1, i4);
            try {
                BDS bds = this.a2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(bds);
                objectOutputStream.flush();
                R = h3.R(bArr, byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
