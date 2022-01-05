package s0.a.a;

import java.io.IOException;

public class q1 extends v {
    public int q = -1;

    public q1() {
    }

    public q1(e eVar) {
        super(eVar);
    }

    public q1(f fVar) {
        super(fVar, false);
    }

    public q1(boolean z, e[] eVarArr) {
        super(z, eVarArr);
    }

    public r A() {
        return this;
    }

    public final int G() throws IOException {
        if (this.q < 0) {
            int i = 0;
            for (e c : this.c) {
                i += c.c().A().u();
            }
            this.q = i;
        }
        return this.q;
    }

    public void t(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.a.write(49);
        }
        q c = qVar.c();
        int length = this.c.length;
        int i = 0;
        if (this.q >= 0 || length > 16) {
            qVar.i(G());
            while (i < length) {
                c.l(this.c[i].c(), true);
                i++;
            }
            return;
        }
        r[] rVarArr = new r[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            r A = this.c[i3].c().A();
            rVarArr[i3] = A;
            i2 += A.u();
        }
        this.q = i2;
        qVar.i(i2);
        while (i < length) {
            c.l(rVarArr[i], true);
            i++;
        }
    }

    public int u() throws IOException {
        int G = G();
        return a2.a(G) + 1 + G;
    }
}
