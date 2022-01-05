package s0.a.a.c2;

import java.util.Iterator;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.g.a;

public class f extends m implements Iterable {
    public final e[] c;

    public f(s sVar) {
        this.c = new e[sVar.size()];
        int i = 0;
        while (true) {
            e[] eVarArr = this.c;
            if (i != eVarArr.length) {
                eVarArr[i] = e.t(sVar.D(i));
                i++;
            } else {
                return;
            }
        }
    }

    public f(e[] eVarArr) {
        e[] eVarArr2 = new e[eVarArr.length];
        this.c = eVarArr2;
        System.arraycopy(eVarArr, 0, eVarArr2, 0, eVarArr.length);
    }

    public r c() {
        return new b1(this.c);
    }

    public Iterator<e> iterator() {
        return new a(this.c);
    }
}
