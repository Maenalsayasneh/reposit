package s0.a.a.u2;

import i0.d.a.a.a;
import s0.a.a.d;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.z;

public class c extends m implements d {
    public int c;
    public e d;

    public c() {
        this.c = 0;
        this.d = v0.c;
    }

    public c(z zVar) {
        e eVar;
        int i = zVar.c;
        this.c = i;
        if (i != 0) {
            if (i == 1) {
                eVar = l.s(s.C(zVar, false));
                this.d = eVar;
            } else if (i != 2) {
                StringBuilder P0 = a.P0("Unknown tag encountered: ");
                P0.append(zVar.c);
                throw new IllegalArgumentException(P0.toString());
            }
        }
        eVar = v0.c;
        this.d = eVar;
    }

    public r c() {
        return new e1(false, this.c, this.d);
    }
}
