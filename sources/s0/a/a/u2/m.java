package s0.a.a.u2;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.c3.v;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.i;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class m extends s0.a.a.m {
    public b c;
    public c d;
    public i q;
    public i x;
    public v y;

    public m(s sVar) {
        c cVar;
        v vVar;
        e D = sVar.D(0);
        this.c = D instanceof b ? (b) D : D != null ? new b(s.B(D)) : null;
        e D2 = sVar.D(1);
        if (D2 == null || (D2 instanceof c)) {
            cVar = (c) D2;
        } else if (D2 instanceof z) {
            cVar = new c((z) D2);
        } else {
            StringBuilder P0 = a.P0("unknown object in factory: ");
            P0.append(D2.getClass().getName());
            throw new IllegalArgumentException(P0.toString());
        }
        this.d = cVar;
        this.q = i.E(sVar.D(2));
        if (sVar.size() > 4) {
            this.x = i.F((z) sVar.D(3), true);
            vVar = v.u((z) sVar.D(4), true);
        } else if (sVar.size() > 3) {
            z zVar = (z) sVar.D(3);
            if (zVar.c == 0) {
                this.x = i.F(zVar, true);
                return;
            }
            vVar = v.t(s.C(zVar, true));
        } else {
            return;
        }
        this.y = vVar;
    }

    public static m s(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(5);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        i iVar = this.x;
        if (iVar != null) {
            fVar.a(new e1(true, 0, iVar));
        }
        v vVar = this.y;
        if (vVar != null) {
            fVar.a(new e1(true, 1, vVar));
        }
        return new b1(fVar);
    }
}
