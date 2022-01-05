package s0.a.a.c2;

import s0.a.a.b1;
import s0.a.a.c3.n;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.w2.f;

public class c extends m {
    public final f c;
    public final n[] d;

    public c(s sVar) {
        int i = 0;
        this.c = f.s(sVar.D(0));
        s B = s.B(sVar.D(1));
        this.d = new n[B.size()];
        while (true) {
            n[] nVarArr = this.d;
            if (i != nVarArr.length) {
                nVarArr[i] = n.s(B.D(i));
                i++;
            } else {
                return;
            }
        }
    }

    public c(f fVar, n[] nVarArr) {
        this.c = fVar;
        n[] nVarArr2 = new n[nVarArr.length];
        this.d = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
    }

    public static c t(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(s.B(obj));
        }
        return null;
    }

    public r c() {
        s0.a.a.f fVar = new s0.a.a.f(2);
        fVar.a(this.c);
        fVar.a(new b1((e[]) this.d));
        return new b1(fVar);
    }

    public n[] s() {
        n[] nVarArr = this.d;
        n[] nVarArr2 = new n[nVarArr.length];
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        return nVarArr2;
    }
}
