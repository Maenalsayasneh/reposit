package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.g.j;

public class k extends m {
    public s c = null;

    public k(s sVar) {
        this.c = sVar;
    }

    public static k t(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }

    public s[] s() {
        s sVar;
        s[] sVarArr = new s[this.c.size()];
        for (int i = 0; i != this.c.size(); i++) {
            e D = this.c.D(i);
            if (D == null || (D instanceof s)) {
                sVar = (s) D;
            } else if (D instanceof s) {
                sVar = new s((s) D);
            } else {
                StringBuilder P0 = a.P0("Invalid DistributionPoint: ");
                P0.append(D.getClass().getName());
                throw new IllegalArgumentException(P0.toString());
            }
            sVarArr[i] = sVar;
        }
        return sVarArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(str);
        s[] s = s();
        for (int i = 0; i != s.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(s[i]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
