package s0.a.a.w2;

import i0.d.a.a.a;
import java.util.Enumeration;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.g0;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.z;

public class w extends m implements n {
    public v Y1;
    public k c;
    public v d;
    public c q;
    public v x;
    public v y;

    public w(k kVar, v vVar, c cVar, v vVar2, v vVar3, v vVar4) {
        this.c = kVar;
        this.d = vVar;
        this.q = cVar;
        this.x = vVar2;
        this.y = null;
        this.Y1 = vVar4;
    }

    public w(s sVar) {
        Enumeration E = sVar.E();
        this.c = (k) E.nextElement();
        this.d = (v) E.nextElement();
        this.q = c.s(E.nextElement());
        while (E.hasMoreElements()) {
            r rVar = (r) E.nextElement();
            if (rVar instanceof z) {
                z zVar = (z) rVar;
                int i = zVar.c;
                if (i == 0) {
                    this.x = v.D(zVar, false);
                } else if (i == 1) {
                    this.y = v.D(zVar, false);
                } else {
                    StringBuilder P0 = a.P0("unknown tag value ");
                    P0.append(zVar.c);
                    throw new IllegalArgumentException(P0.toString());
                }
            } else {
                this.Y1 = (v) rVar;
            }
        }
    }

    public static w s(Object obj) {
        if (obj instanceof w) {
            return (w) obj;
        }
        if (obj != null) {
            return new w(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(6);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        v vVar = this.x;
        if (vVar != null) {
            fVar.a(new e1(false, 0, vVar));
        }
        v vVar2 = this.y;
        if (vVar2 != null) {
            fVar.a(new e1(false, 1, vVar2));
        }
        fVar.a(this.Y1);
        return new g0(fVar);
    }
}
