package s0.a.b.n0;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.k0.k1;
import s0.a.b.n;
import s0.a.b.v;
import s0.a.g.b;

public class t implements v {
    public n g;
    public a h;
    public k1 i;
    public int j;
    public int k;
    public byte[] l;

    public t(a aVar, n nVar) {
        this.h = aVar;
        this.g = nVar;
        Integer num = n.a.get(nVar.getAlgorithmName());
        if (num != null) {
            this.j = num.intValue();
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("no valid trailer for digest: ");
        P0.append(nVar.getAlgorithmName());
        throw new IllegalArgumentException(P0.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if ((r4.intValue() & 15) == 12) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            s0.a.b.a r1 = r3.h     // Catch:{ Exception -> 0x005c }
            int r2 = r4.length     // Catch:{ Exception -> 0x005c }
            byte[] r4 = r1.b(r4, r0, r2)     // Catch:{ Exception -> 0x005c }
            r3.l = r4     // Catch:{ Exception -> 0x005c }
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.l
            r4.<init>(r1, r2)
            int r1 = r4.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            s0.a.b.k0.k1 r1 = r3.i
            java.math.BigInteger r1 = r1.x
            java.math.BigInteger r4 = r1.subtract(r4)
            int r1 = r4.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L_0x005c
        L_0x002d:
            int r0 = r3.j
            r3.d(r0)
            byte[] r0 = r3.l
            int r0 = r0.length
            byte[] r4 = s0.a.g.b.b(r0, r4)
            byte[] r0 = r3.l
            boolean r0 = s0.a.e.b.b0.c.h3.U(r0, r4)
            int r1 = r3.j
            r2 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r2) goto L_0x0054
            if (r0 != 0) goto L_0x0054
            byte[] r0 = r3.l
            int r1 = r0.length
            int r1 = r1 + -2
            r2 = 64
            r0[r1] = r2
            boolean r0 = s0.a.e.b.b0.c.h3.U(r0, r4)
        L_0x0054:
            byte[] r1 = r3.l
            r3.c(r1)
            r3.c(r4)
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.n0.t.a(byte[]):boolean");
    }

    public byte[] b() throws CryptoException {
        d(this.j);
        a aVar = this.h;
        byte[] bArr = this.l;
        BigInteger bigInteger = new BigInteger(1, aVar.b(bArr, 0, bArr.length));
        c(this.l);
        return b.b(b.i(this.i.x), bigInteger.min(this.i.x.subtract(bigInteger)));
    }

    public final void c(byte[] bArr) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            bArr[i2] = 0;
        }
    }

    public final void d(int i2) {
        int i3;
        int digestSize = this.g.getDigestSize();
        if (i2 == 188) {
            byte[] bArr = this.l;
            i3 = (bArr.length - digestSize) - 1;
            this.g.doFinal(bArr, i3);
            byte[] bArr2 = this.l;
            bArr2[bArr2.length - 1] = -68;
        } else {
            byte[] bArr3 = this.l;
            int length = (bArr3.length - digestSize) - 2;
            this.g.doFinal(bArr3, length);
            byte[] bArr4 = this.l;
            bArr4[bArr4.length - 2] = (byte) (i2 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i2;
            i3 = length;
        }
        this.l[0] = 107;
        for (int i4 = i3 - 2; i4 != 0; i4--) {
            this.l[i4] = -69;
        }
        this.l[i3 - 1] = -70;
    }

    public void init(boolean z, i iVar) {
        k1 k1Var = (k1) iVar;
        this.i = k1Var;
        this.h.init(z, k1Var);
        int bitLength = this.i.x.bitLength();
        this.k = bitLength;
        this.l = new byte[((bitLength + 7) / 8)];
        this.g.reset();
    }

    public void update(byte b) {
        this.g.update(b);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.g.update(bArr, i2, i3);
    }
}
