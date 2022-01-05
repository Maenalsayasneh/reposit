package s0.a.a.c2;

import s0.a.a.d;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class i extends m implements d {
    public final int c;
    public final m d;

    public i(e eVar) {
        m mVar;
        if ((eVar instanceof s) || (eVar instanceof j)) {
            this.c = 0;
            mVar = j.s(eVar);
        } else if (eVar instanceof z) {
            this.c = 1;
            mVar = l.s(((z) eVar).C());
        } else {
            throw new IllegalArgumentException("Unknown check object in integrity check.");
        }
        this.d = mVar;
    }

    public r c() {
        m mVar = this.d;
        return mVar instanceof l ? new e1(0, mVar) : mVar.c();
    }
}
