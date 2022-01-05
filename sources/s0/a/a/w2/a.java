package s0.a.a.w2;

import s0.a.a.e;
import s0.a.a.g0;
import s0.a.a.m;
import s0.a.a.o1;
import s0.a.a.r;
import s0.a.a.s;

public class a extends m {
    public c[] c;
    public boolean d = true;

    public a(s sVar) {
        this.c = new c[sVar.size()];
        int i = 0;
        while (true) {
            c[] cVarArr = this.c;
            if (i != cVarArr.length) {
                cVarArr[i] = c.s(sVar.D(i));
                i++;
            } else {
                this.d = sVar instanceof g0;
                return;
            }
        }
    }

    public a(c[] cVarArr) {
        int length = cVarArr.length;
        c[] cVarArr2 = new c[length];
        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
        this.c = cVarArr2;
    }

    public r c() {
        return this.d ? new g0((e[]) this.c) : new o1((e[]) this.c);
    }
}
