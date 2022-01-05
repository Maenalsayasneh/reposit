package s0.a.a.d3;

import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.e;
import s0.a.e.b.h;

public class j extends m {
    public final o c;
    public e d;
    public h q;

    public j(e eVar, byte[] bArr) {
        this.d = eVar;
        this.c = new x0(h3.I(bArr));
    }

    public j(h hVar, boolean z) {
        this.q = hVar.q();
        this.c = new x0(hVar.i(z));
    }

    public r c() {
        return this.c;
    }

    public synchronized h s() {
        if (this.q == null) {
            this.q = this.d.h(this.c.c).q();
        }
        return this.q;
    }
}
