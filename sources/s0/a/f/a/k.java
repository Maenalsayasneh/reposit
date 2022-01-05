package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.a.z;
import s0.a.e.b.b0.c.h3;
import s0.a.g.b;

public class k extends m {
    public final byte[] Y1;
    public final byte[] Z1;
    public final byte[] a2;
    public final int c;
    public final long d;
    public final long q;
    public final byte[] x;
    public final byte[] y;

    public k(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = 0;
        this.d = j;
        this.x = h3.I(bArr);
        this.y = h3.I(bArr2);
        this.Y1 = h3.I(bArr3);
        this.Z1 = h3.I(bArr4);
        this.a2 = h3.I(bArr5);
        this.q = -1;
    }

    public k(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.c = 1;
        this.d = j;
        this.x = h3.I(bArr);
        this.y = h3.I(bArr2);
        this.Y1 = h3.I(bArr3);
        this.Z1 = h3.I(bArr4);
        this.a2 = h3.I(bArr5);
        this.q = j2;
    }

    public k(s sVar) {
        long j;
        s0.a.a.k B = s0.a.a.k.B(sVar.D(0));
        if (B.F(b.a) || B.F(b.b)) {
            this.c = B.I();
            if (sVar.size() == 2 || sVar.size() == 3) {
                s B2 = s.B(sVar.D(1));
                this.d = s0.a.a.k.B(B2.D(0)).K();
                this.x = h3.I(o.B(B2.D(1)).c);
                this.y = h3.I(o.B(B2.D(2)).c);
                this.Y1 = h3.I(o.B(B2.D(3)).c);
                this.Z1 = h3.I(o.B(B2.D(4)).c);
                if (B2.size() == 6) {
                    z B3 = z.B(B2.D(5));
                    if (B3.c == 0) {
                        j = s0.a.a.k.C(B3, false).K();
                    } else {
                        throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
                    }
                } else if (B2.size() == 5) {
                    j = -1;
                } else {
                    throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
                }
                this.q = j;
                if (sVar.size() == 3) {
                    this.a2 = h3.I(o.C(z.B(sVar.D(2)), true).c);
                } else {
                    this.a2 = null;
                }
            } else {
                throw new IllegalArgumentException("key sequence wrong size");
            }
        } else {
            throw new IllegalArgumentException("unknown version of sequence");
        }
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(this.q >= 0 ? new s0.a.a.k(1) : new s0.a.a.k(0));
        f fVar2 = new f(10);
        fVar2.a(new s0.a.a.k(this.d));
        fVar2.a(new x0(this.x));
        fVar2.a(new x0(this.y));
        fVar2.a(new x0(this.Y1));
        fVar2.a(new x0(this.Z1));
        long j = this.q;
        if (j >= 0) {
            fVar2.a(new e1(false, 0, new s0.a.a.k(j)));
        }
        fVar.a(new b1(fVar2));
        fVar.a(new e1(true, 0, new x0(this.a2)));
        return new b1(fVar);
    }
}
