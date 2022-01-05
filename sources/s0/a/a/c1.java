package s0.a.a;

import java.io.IOException;

public class c1 extends v {
    public int q;

    public c1() {
        this.q = -1;
    }

    public c1(e eVar) {
        super(eVar);
        this.q = -1;
    }

    public c1(f fVar) {
        super(fVar, true);
        this.q = -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(boolean z, e[] eVarArr) {
        super(z, eVarArr);
        if (z) {
            this.q = -1;
            return;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    public c1(e[] eVarArr) {
        super(eVarArr, true);
        this.q = -1;
    }

    public r A() {
        return this;
    }

    public final int G() throws IOException {
        if (this.q < 0) {
            int i = 0;
            for (e c : this.c) {
                i += c.c().z().u();
            }
            this.q = i;
        }
        return this.q;
    }

    public void t(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.a.write(49);
        }
        z0 b = qVar.b();
        int length = this.c.length;
        int i = 0;
        if (this.q >= 0 || length > 16) {
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
        this.q = i2;
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
        return this.d ? this : super.z();
    }
}
