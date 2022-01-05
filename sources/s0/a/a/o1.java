package s0.a.a;

import java.io.IOException;

public class o1 extends s {
    public int d = -1;

    public o1() {
    }

    public o1(e eVar) {
        super(eVar);
    }

    public o1(f fVar) {
        super(fVar);
    }

    public o1(e[] eVarArr) {
        super(eVarArr);
    }

    public o1(e[] eVarArr, boolean z) {
        super(eVarArr, z);
    }

    public r A() {
        return this;
    }

    public final int G() throws IOException {
        if (this.d < 0) {
            int i = 0;
            for (e c : this.c) {
                i += c.c().A().u();
            }
            this.d = i;
        }
        return this.d;
    }

    public void t(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.a.write(48);
        }
        q c = qVar.c();
        int length = this.c.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
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
        this.d = i2;
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
