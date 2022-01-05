package s0.a.a;

import java.io.IOException;

public class b1 extends s {
    public int d = -1;

    public b1() {
    }

    public b1(e eVar) {
        super(eVar);
    }

    public b1(f fVar) {
        super(fVar);
    }

    public b1(e[] eVarArr) {
        super(eVarArr);
    }

    public b1(e[] eVarArr, boolean z) {
        super(eVarArr, z);
    }

    public r A() {
        return this;
    }

    public final int G() throws IOException {
        if (this.d < 0) {
            int i = 0;
            for (e c : this.c) {
                i += c.c().z().u();
            }
            this.d = i;
        }
        return this.d;
    }

    public void t(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.a.write(48);
        }
        z0 b = qVar.b();
        int length = this.c.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            qVar.i(G());
            while (i < length) {
                this.c[i].c().z().t(b, true);
                i++;
            }
            return;
        }
        r[] rVarArr = new r[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            r z2 = this.c[i3].c().z();
            rVarArr[i3] = z2;
            i2 += z2.u();
        }
        this.d = i2;
        qVar.i(i2);
        while (i < length) {
            rVarArr[i].t(b, true);
            i++;
        }
    }

    public int u() throws IOException {
        int G = G();
        return a2.a(G) + 1 + G;
    }

    public r z() {
        return this;
    }
}
