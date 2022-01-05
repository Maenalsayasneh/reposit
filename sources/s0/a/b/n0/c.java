package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.j;
import s0.a.b.k;
import s0.a.b.k0.n;
import s0.a.b.k0.p;
import s0.a.b.k0.q;
import s0.a.b.k0.r;
import s0.a.g.b;

public class c implements k {
    public final b g;
    public n h;
    public SecureRandom i;

    public c() {
        this.g = new q();
    }

    public c(b bVar) {
        this.g = bVar;
    }

    public BigInteger[] a(byte[] bArr) {
        p pVar = this.h.d;
        BigInteger bigInteger = pVar.d;
        BigInteger c = c(bigInteger, bArr);
        BigInteger bigInteger2 = ((q) this.h).q;
        if (this.g.b()) {
            this.g.d(bigInteger, bigInteger2, bArr);
        } else {
            this.g.c(bigInteger, this.i);
        }
        BigInteger a = this.g.a();
        BigInteger mod = pVar.c.modPow(a.add(b.e(7, j.b(this.i)).add(BigInteger.valueOf(128)).multiply(bigInteger)), pVar.q).mod(bigInteger);
        return new BigInteger[]{mod, b.j(bigInteger, a).multiply(c.add(bigInteger2.multiply(mod))).mod(bigInteger)};
    }

    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        p pVar = this.h.d;
        BigInteger bigInteger3 = pVar.d;
        BigInteger c = c(bigInteger3, bArr);
        BigInteger valueOf = BigInteger.valueOf(0);
        if (valueOf.compareTo(bigInteger) >= 0 || bigInteger3.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || bigInteger3.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger k = b.k(bigInteger3, bigInteger2);
        BigInteger mod = c.multiply(k).mod(bigInteger3);
        BigInteger mod2 = bigInteger.multiply(k).mod(bigInteger3);
        BigInteger bigInteger4 = pVar.q;
        return pVar.c.modPow(mod, bigInteger4).multiply(((r) this.h).y.modPow(mod2, bigInteger4)).mod(bigInteger4).mod(bigInteger3).equals(bigInteger);
    }

    public final BigInteger c(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    public BigInteger getOrder() {
        return this.h.d.d;
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
            s0.a.b.k0.q r1 = (s0.a.b.k0.q) r1
            r2.h = r1
            java.security.SecureRandom r4 = r4.c
            goto L_0x001a
        L_0x0012:
            s0.a.b.k0.q r4 = (s0.a.b.k0.q) r4
            goto L_0x0017
        L_0x0015:
            s0.a.b.k0.r r4 = (s0.a.b.k0.r) r4
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
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.n0.c.init(boolean, s0.a.b.i):void");
    }
}
