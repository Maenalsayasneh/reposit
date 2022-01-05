package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class h extends m {
    public a[] c;

    public h(s sVar) {
        if (sVar.size() >= 1) {
            this.c = new a[sVar.size()];
            for (int i = 0; i != sVar.size(); i++) {
                a[] aVarArr = this.c;
                e D = sVar.D(i);
                n nVar = a.c;
                aVarArr[i] = D instanceof a ? (a) D : D != null ? new a(s.B(D)) : null;
            }
            return;
        }
        throw new IllegalArgumentException("sequence may not be empty");
    }

    public r c() {
        return new b1((e[]) this.c);
    }

    public String toString() {
        return a.y0(a.P0("AuthorityInformationAccess: Oid("), this.c[0].d.d, ")");
    }
}
