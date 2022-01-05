package s0.a.a.b3;

import s0.a.a.b1;
import s0.a.a.c1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.v;

public class b extends m {
    public v c;

    public b(n nVar, e eVar) {
        f fVar = new f(2);
        fVar.a(nVar);
        fVar.a(eVar);
        this.c = new c1((e) new b1(fVar));
    }

    public b(v vVar) {
        this.c = vVar;
    }

    public b(a[] aVarArr) {
        this.c = new c1((e[]) aVarArr);
    }

    public static b t(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(v.C(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }

    public a s() {
        e[] eVarArr = this.c.c;
        if (eVarArr.length == 0) {
            return null;
        }
        return a.s(eVarArr[0]);
    }

    public int size() {
        return this.c.c.length;
    }

    public a[] u() {
        int length = this.c.c.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i != length; i++) {
            aVarArr[i] = a.s(this.c.c[i]);
        }
        return aVarArr;
    }
}
