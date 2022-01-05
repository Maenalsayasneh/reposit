package s0.a.a;

import java.io.IOException;

public class e1 extends z {
    public e1(int i, e eVar) {
        super(true, i, eVar);
    }

    public e1(boolean z, int i, e eVar) {
        super(z, i, eVar);
    }

    public r A() {
        return this;
    }

    public void t(q qVar, boolean z) throws IOException {
        r z2 = this.q.c().z();
        qVar.m(z, (this.d || z2.y()) ? 160 : 128, this.c);
        if (this.d) {
            qVar.i(z2.u());
        }
        z2.t(qVar.b(), this.d);
    }

    public int u() throws IOException {
        int u = this.q.c().z().u();
        if (this.d) {
            return a2.a(u) + a2.b(this.c) + u;
        }
        return a2.b(this.c) + (u - 1);
    }

    public boolean y() {
        return this.d || this.q.c().z().y();
    }

    public r z() {
        return this;
    }
}
