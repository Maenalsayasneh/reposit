package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.d;
import s0.a.a.e1;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.z;

public class q0 extends m implements d {
    public w c;
    public w d;

    public q0(z zVar) {
        int i = zVar.c;
        if (i == 0) {
            this.c = w.t(z.B(zVar.C()));
        } else if (i == 1) {
            this.d = w.t(z.B(zVar.C()));
        } else {
            StringBuilder P0 = a.P0("unknown tag: ");
            P0.append(zVar.c);
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public r c() {
        w wVar = this.c;
        return wVar != null ? new e1(true, 0, wVar) : new e1(true, 1, this.d);
    }
}
