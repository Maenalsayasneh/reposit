package s0.a.b.i0;

import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.e.b.b0.c.h3;

public class i implements e {
    public int a;
    public int b = 16;
    public byte[] c;
    public byte[] d;
    public e e;
    public boolean f = false;
    public boolean g;

    public i(e eVar) {
        this.e = eVar;
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.g) {
            byte[] p02 = h3.p0(this.c, this.b);
            int i3 = this.b;
            if (bArr.length < i3 + i) {
                i3 = bArr.length - i;
            }
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            byte[] L3 = a.L3(bArr3, p02);
            int length = L3.length;
            byte[] bArr4 = new byte[length];
            this.e.a(L3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i2, length);
            if (bArr2.length <= i2 + L3.length) {
                return length;
            }
            c(bArr4);
            return length;
        }
        byte[] p03 = h3.p0(this.c, this.b);
        int i4 = this.b;
        if (bArr.length < i4 + i) {
            i4 = bArr.length - i;
        }
        byte[] bArr5 = new byte[i4];
        System.arraycopy(bArr, i, bArr5, 0, i4);
        byte[] bArr6 = new byte[i4];
        this.e.a(bArr5, 0, bArr6, 0);
        byte[] L32 = a.L3(bArr6, p03);
        System.arraycopy(L32, 0, bArr2, i2, L32.length);
        if (bArr2.length > i2 + L32.length) {
            c(bArr5);
        }
        return L32.length;
    }

    public int b() {
        return this.b;
    }

    public final void c(byte[] bArr) {
        byte[] t = a.t(this.c, this.a - this.b);
        System.arraycopy(t, 0, this.c, 0, t.length);
        System.arraycopy(bArr, 0, this.c, t.length, this.a - t.length);
    }

    public String getAlgorithmName() {
        return this.e.getAlgorithmName() + "/CBC";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r6 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r6 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r5, s0.a.b.i r6) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            r4.g = r5
            boolean r0 = r6 instanceof s0.a.b.k0.c1
            r1 = 0
            if (r0 == 0) goto L_0x0034
            s0.a.b.k0.c1 r6 = (s0.a.b.k0.c1) r6
            byte[] r0 = r6.c
            int r2 = r0.length
            int r3 = r4.b
            if (r2 < r3) goto L_0x002c
            int r2 = r0.length
            r4.a = r2
            byte[] r3 = new byte[r2]
            r4.c = r3
            byte[] r2 = new byte[r2]
            r4.d = r2
            byte[] r0 = s0.a.e.b.b0.c.h3.I(r0)
            r4.d = r0
            byte[] r2 = r4.c
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            s0.a.b.i r6 = r6.d
            if (r6 == 0) goto L_0x004a
            goto L_0x0045
        L_0x002c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Parameter m must blockSize <= m"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            int r0 = r4.b
            r4.a = r0
            byte[] r2 = new byte[r0]
            r4.c = r2
            byte[] r3 = new byte[r0]
            r4.d = r3
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)
            if (r6 == 0) goto L_0x004a
        L_0x0045:
            s0.a.b.e r0 = r4.e
            r0.init(r5, r6)
        L_0x004a:
            r5 = 1
            r4.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.i.init(boolean, s0.a.b.i):void");
    }

    public void reset() {
        if (this.f) {
            byte[] bArr = this.d;
            System.arraycopy(bArr, 0, this.c, 0, bArr.length);
            this.e.reset();
        }
    }
}
