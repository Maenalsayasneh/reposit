package s0.a.b.n0;

import i0.d.a.a.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import s0.a.b.b0.d0;
import s0.a.b.j;
import s0.a.b.k0.b0;
import s0.a.b.k0.b1;
import s0.a.b.k0.c0;
import s0.a.b.k0.d1;
import s0.a.b.k0.w;
import s0.a.b.k0.z;
import s0.a.b.n;
import s0.a.b.v;
import s0.a.e.b.c;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.e.b.i;
import s0.a.g.b;
import s0.a.g.k.d;

public class r implements v, c {
    public final b g = new q();
    public final n h;
    public final a i;
    public w j;
    public h k;
    public z l;
    public byte[] m;

    public r() {
        s sVar = s.a;
        d0 d0Var = new d0();
        this.i = sVar;
        this.h = d0Var;
    }

    public boolean a(byte[] bArr) {
        try {
            BigInteger[] a = this.i.a(this.j.j, bArr);
            return e(a[0], a[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public byte[] b() throws CryptoException {
        byte[] d = d();
        BigInteger bigInteger = this.j.j;
        BigInteger bigInteger2 = new BigInteger(1, d);
        BigInteger bigInteger3 = ((b0) this.l).q;
        i iVar = new i();
        while (true) {
            BigInteger a = this.g.a();
            BigInteger mod = bigInteger2.add(iVar.a(this.j.i, a).q().d().t()).mod(bigInteger);
            BigInteger bigInteger4 = c.a;
            if (!mod.equals(bigInteger4) && !mod.add(a).equals(bigInteger)) {
                BigInteger mod2 = b.j(bigInteger, bigInteger3.add(c.b)).multiply(a.subtract(mod.multiply(bigInteger3)).mod(bigInteger)).mod(bigInteger);
                if (!mod2.equals(bigInteger4)) {
                    try {
                        return this.i.b(this.j.j, mod, mod2);
                    } catch (Exception e) {
                        throw new CryptoException(a.a0(e, a.P0("unable to encode signature: ")), e);
                    }
                }
            }
        }
    }

    public final void c(n nVar, g gVar) {
        byte[] e = gVar.e();
        nVar.update(e, 0, e.length);
    }

    public final byte[] d() {
        byte[] bArr = new byte[this.h.getDigestSize()];
        this.h.doFinal(bArr, 0);
        this.h.reset();
        byte[] bArr2 = this.m;
        if (bArr2 != null) {
            this.h.update(bArr2, 0, bArr2.length);
        }
        return bArr;
    }

    public final boolean e(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = this.j.j;
        BigInteger bigInteger4 = c.b;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            return false;
        }
        BigInteger bigInteger5 = new BigInteger(1, d());
        BigInteger mod = bigInteger.add(bigInteger2).mod(bigInteger3);
        if (mod.equals(c.a)) {
            return false;
        }
        h q = m0.r.t.a.r.m.a1.a.M3(this.j.i, bigInteger2, ((c0) this.l).q, mod).q();
        if (q.m()) {
            return false;
        }
        return bigInteger5.add(q.d().t()).mod(bigInteger3).equals(bigInteger);
    }

    public void init(boolean z, s0.a.b.i iVar) {
        byte[] bArr;
        h hVar;
        if (iVar instanceof b1) {
            b1 b1Var = (b1) iVar;
            s0.a.b.i iVar2 = b1Var.c;
            byte[] bArr2 = b1Var.d;
            if (bArr2.length < 8192) {
                s0.a.b.i iVar3 = iVar2;
                bArr = bArr2;
                iVar = iVar3;
            } else {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
        } else {
            bArr = d.b("31323334353637383132333435363738");
        }
        if (z) {
            if (iVar instanceof d1) {
                d1 d1Var = (d1) iVar;
                z zVar = (z) d1Var.d;
                this.l = zVar;
                w wVar = zVar.d;
                this.j = wVar;
                this.g.c(wVar.j, d1Var.c);
            } else {
                z zVar2 = (z) iVar;
                this.l = zVar2;
                w wVar2 = zVar2.d;
                this.j = wVar2;
                this.g.c(wVar2.j, j.a());
            }
            hVar = new i().a(this.j.i, ((b0) this.l).q).q();
        } else {
            z zVar3 = (z) iVar;
            this.l = zVar3;
            this.j = zVar3.d;
            hVar = ((c0) zVar3).q;
        }
        this.k = hVar;
        this.h.reset();
        n nVar = this.h;
        int length = bArr.length * 8;
        nVar.update((byte) ((length >> 8) & 255));
        nVar.update((byte) (length & 255));
        nVar.update(bArr, 0, bArr.length);
        c(this.h, this.j.g.b);
        c(this.h, this.j.g.c);
        c(this.h, this.j.i.d());
        c(this.h, this.j.i.e());
        c(this.h, this.k.d());
        c(this.h, this.k.e());
        int digestSize = this.h.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        this.h.doFinal(bArr3, 0);
        this.m = bArr3;
        this.h.update(bArr3, 0, digestSize);
    }

    public void update(byte b) {
        this.h.update(b);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.h.update(bArr, i2, i3);
    }

    public r(n nVar) {
        s sVar = s.a;
        this.i = sVar;
        this.h = nVar;
    }
}
