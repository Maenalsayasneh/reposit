package s0.a.a;

import java.io.IOException;

public class i0 extends v {
    public i0(e eVar) {
        super(eVar);
    }

    public i0(f fVar) {
        super(fVar, false);
    }

    public i0(boolean z, e[] eVarArr) {
        super(z, eVarArr);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.h(z, 49, this.c);
    }

    public int u() throws IOException {
        int i = 0;
        for (e c : this.c) {
            i += c.c().u();
        }
        return i + 2 + 2;
    }
}
