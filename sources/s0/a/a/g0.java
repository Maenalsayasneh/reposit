package s0.a.a;

import java.io.IOException;

public class g0 extends s {
    public g0() {
    }

    public g0(e eVar) {
        super(eVar);
    }

    public g0(f fVar) {
        super(fVar);
    }

    public g0(e[] eVarArr) {
        super(eVarArr);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.h(z, 48, this.c);
    }

    public int u() throws IOException {
        int i = 0;
        for (e c : this.c) {
            i += c.c().u();
        }
        return i + 2 + 2;
    }
}
