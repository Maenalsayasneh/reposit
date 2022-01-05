package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.k;
import s0.a.b.k0.b0;
import s0.a.b.k0.w;
import s0.a.b.k0.z;
import s0.a.e.b.c;
import s0.a.e.b.i;
import s0.a.g.b;

public class e implements c, k {
    public final b g;
    public z h;
    public SecureRandom i;

    public e() {
        this.g = new q();
    }

    public e(b bVar) {
        this.g = bVar;
    }

    public BigInteger[] a(byte[] bArr) {
        w wVar = this.h.d;
        BigInteger bigInteger = wVar.j;
        BigInteger c = c(bigInteger, bArr);
        BigInteger bigInteger2 = ((b0) this.h).q;
        if (this.g.b()) {
            this.g.d(bigInteger, bigInteger2, bArr);
        } else {
            this.g.c(bigInteger, this.i);
        }
        i iVar = new i();
        while (true) {
            BigInteger a = this.g.a();
            BigInteger mod = iVar.a(wVar.i, a).q().d().t().mod(bigInteger);
            BigInteger bigInteger3 = c.a;
            if (!mod.equals(bigInteger3)) {
                BigInteger mod2 = b.j(bigInteger, a).multiply(c.add(bigInteger2.multiply(mod))).mod(bigInteger);
                if (!mod2.equals(bigInteger3)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(byte[] r6, java.math.BigInteger r7, java.math.BigInteger r8) {
        /*
            r5 = this;
            s0.a.b.k0.z r0 = r5.h
            s0.a.b.k0.w r0 = r0.d
            java.math.BigInteger r1 = r0.j
            java.math.BigInteger r6 = r5.c(r1, r6)
            java.math.BigInteger r2 = s0.a.e.b.c.b
            int r3 = r7.compareTo(r2)
            r4 = 0
            if (r3 < 0) goto L_0x00bd
            int r3 = r7.compareTo(r1)
            if (r3 < 0) goto L_0x001b
            goto L_0x00bd
        L_0x001b:
            int r2 = r8.compareTo(r2)
            if (r2 < 0) goto L_0x00bd
            int r2 = r8.compareTo(r1)
            if (r2 < 0) goto L_0x0029
            goto L_0x00bd
        L_0x0029:
            java.math.BigInteger r8 = s0.a.g.b.k(r1, r8)
            java.math.BigInteger r6 = r6.multiply(r8)
            java.math.BigInteger r6 = r6.mod(r1)
            java.math.BigInteger r8 = r7.multiply(r8)
            java.math.BigInteger r8 = r8.mod(r1)
            s0.a.e.b.h r0 = r0.i
            s0.a.b.k0.z r2 = r5.h
            s0.a.b.k0.c0 r2 = (s0.a.b.k0.c0) r2
            s0.a.e.b.h r2 = r2.q
            s0.a.e.b.h r6 = m0.r.t.a.r.m.a1.a.M3(r0, r6, r2, r8)
            boolean r8 = r6.m()
            if (r8 == 0) goto L_0x0050
            return r4
        L_0x0050:
            s0.a.e.b.e r8 = r6.b
            if (r8 == 0) goto L_0x00a8
            java.math.BigInteger r0 = r8.e
            if (r0 == 0) goto L_0x00a8
            java.math.BigInteger r2 = s0.a.e.b.c.f
            int r0 = r0.compareTo(r2)
            if (r0 > 0) goto L_0x00a8
            int r0 = r8.f
            r2 = 1
            if (r0 == r2) goto L_0x007f
            r3 = 2
            if (r0 == r3) goto L_0x0076
            r3 = 3
            if (r0 == r3) goto L_0x0076
            r3 = 4
            if (r0 == r3) goto L_0x0076
            r3 = 6
            if (r0 == r3) goto L_0x007f
            r3 = 7
            if (r0 == r3) goto L_0x007f
            r0 = 0
            goto L_0x0083
        L_0x0076:
            s0.a.e.b.g r0 = r6.k(r4)
            s0.a.e.b.g r0 = r0.o()
            goto L_0x0083
        L_0x007f:
            s0.a.e.b.g r0 = r6.k(r4)
        L_0x0083:
            if (r0 == 0) goto L_0x00a8
            boolean r3 = r0.i()
            if (r3 != 0) goto L_0x00a8
            s0.a.e.b.g r6 = r6.c
        L_0x008d:
            boolean r3 = r8.o(r7)
            if (r3 == 0) goto L_0x00a7
            s0.a.e.b.g r3 = r8.k(r7)
            s0.a.e.b.g r3 = r3.j(r0)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00a2
            return r2
        L_0x00a2:
            java.math.BigInteger r7 = r7.add(r1)
            goto L_0x008d
        L_0x00a7:
            return r4
        L_0x00a8:
            s0.a.e.b.h r6 = r6.q()
            s0.a.e.b.g r6 = r6.d()
            java.math.BigInteger r6 = r6.t()
            java.math.BigInteger r6 = r6.mod(r1)
            boolean r6 = r6.equals(r7)
            return r6
        L_0x00bd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.n0.e.b(byte[], java.math.BigInteger, java.math.BigInteger):boolean");
    }

    public BigInteger c(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    public BigInteger getOrder() {
        return this.h.d.j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r3, s0.a.b.i r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0015
            boolean r1 = r4 instanceof s0.a.b.k0.d1
            if (r1 == 0) goto L_0x0012
            s0.a.b.k0.d1 r4 = (s0.a.b.k0.d1) r4
            s0.a.b.i r1 = r4.d
            s0.a.b.k0.b0 r1 = (s0.a.b.k0.b0) r1
            r2.h = r1
            java.security.SecureRandom r4 = r4.c
            goto L_0x001a
        L_0x0012:
            s0.a.b.k0.b0 r4 = (s0.a.b.k0.b0) r4
            goto L_0x0017
        L_0x0015:
            s0.a.b.k0.c0 r4 = (s0.a.b.k0.c0) r4
        L_0x0017:
            r2.h = r4
            r4 = r0
        L_0x001a:
            if (r3 == 0) goto L_0x0026
            s0.a.b.n0.b r3 = r2.g
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x002d
            java.security.SecureRandom r0 = s0.a.b.j.b(r4)
        L_0x002d:
            r2.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.n0.e.init(boolean, s0.a.b.i):void");
    }
}
