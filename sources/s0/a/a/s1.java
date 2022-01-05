package s0.a.a;

import java.io.IOException;

public class s1 extends z {
    public s1(boolean z, int i, e eVar) {
        super(z, i, eVar);
    }

    public r A() {
        return this;
    }

    public void t(q qVar, boolean z) throws IOException {
        r A = this.q.c().A();
        qVar.m(z, (this.d || A.y()) ? 160 : 128, this.c);
        if (this.d) {
            qVar.i(A.u());
        }
        qVar.c().l(A, this.d);
    }

    public int u() throws IOException {
        int u = this.q.c().A().u();
        if (this.d) {
            return a2.a(u) + a2.b(this.c) + u;
        }
        return a2.b(this.c) + (u - 1);
    }

    public boolean y() {
        return this.d || this.q.c().A().y();
    }
}
