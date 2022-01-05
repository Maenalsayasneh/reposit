package s0.a.a.c3;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.g.j;

public class x extends m {
    public final w[] c;

    public x(w wVar) {
        this.c = new w[]{wVar};
    }

    public x(s sVar) {
        this.c = new w[sVar.size()];
        for (int i = 0; i != sVar.size(); i++) {
            this.c[i] = w.t(sVar.D(i));
        }
    }

    public static x s(Object obj) {
        if (obj instanceof x) {
            return (x) obj;
        }
        if (obj != null) {
            return new x(s.B(obj));
        }
        return null;
    }

    public r c() {
        return new b1((e[]) this.c);
    }

    public w[] t() {
        w[] wVarArr = this.c;
        w[] wVarArr2 = new w[wVarArr.length];
        System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
        return wVarArr2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(str);
        for (int i = 0; i != this.c.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.c[i]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
