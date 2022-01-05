package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class i0 extends m {
    public n c;
    public s d;

    public i0(s sVar) {
        if (sVar.size() < 1 || sVar.size() > 2) {
            throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
        }
        this.c = n.D(sVar.D(0));
        if (sVar.size() > 1) {
            this.d = s.B(sVar.D(1));
        }
    }

    public static i0 s(Object obj) {
        return (obj == null || (obj instanceof i0)) ? (i0) obj : new i0(s.B(obj));
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        s sVar = this.d;
        if (sVar != null) {
            fVar.a(sVar);
        }
        return new b1(fVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Policy information: ");
        stringBuffer.append(this.c);
        if (this.d != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < this.d.size(); i++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                e D = this.d.D(i);
                stringBuffer2.append(D instanceof j0 ? (j0) D : D != null ? new j0(s.B(D)) : null);
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
