package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class g extends m {
    public byte[] Y1;
    public k c;
    public n d;
    public k q;
    public byte[][] x;
    public byte[][] y;

    public g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.c = new k(0);
        this.q = new k((long) i);
        this.x = h3.X(sArr);
        this.y = h3.X(sArr2);
        this.Y1 = h3.V(sArr3);
    }

    public g(s sVar) {
        if (sVar.D(0) instanceof k) {
            this.c = k.B(sVar.D(0));
        } else {
            this.d = n.D(sVar.D(0));
        }
        this.q = k.B(sVar.D(1));
        s B = s.B(sVar.D(2));
        this.x = new byte[B.size()][];
        for (int i = 0; i < B.size(); i++) {
            this.x[i] = o.B(B.D(i)).c;
        }
        s sVar2 = (s) sVar.D(3);
        this.y = new byte[sVar2.size()][];
        for (int i2 = 0; i2 < sVar2.size(); i2++) {
            this.y[i2] = o.B(sVar2.D(i2)).c;
        }
        this.Y1 = o.B(((s) sVar.D(4)).D(0)).c;
    }

    public r c() {
        f fVar = new f(10);
        e eVar = this.c;
        if (eVar == null) {
            eVar = this.d;
        }
        fVar.a(eVar);
        fVar.a(this.q);
        f fVar2 = new f(10);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.x;
            if (i2 >= bArr.length) {
                break;
            }
            fVar2.a(new x0(bArr[i2]));
            i2++;
        }
        fVar.a(new b1(fVar2));
        f fVar3 = new f(10);
        while (true) {
            byte[][] bArr2 = this.y;
            if (i < bArr2.length) {
                fVar3.a(new x0(bArr2[i]));
                i++;
            } else {
                fVar.a(new b1(fVar3));
                f fVar4 = new f(10);
                fVar4.a(new x0(this.Y1));
                fVar.a(new b1(fVar4));
                return new b1(fVar);
            }
        }
    }
}
