package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.z;
import s0.a.g.j;

public class s extends m {
    public t c;
    public k0 d;
    public x q;

    public s(t tVar, k0 k0Var, x xVar) {
        this.c = tVar;
        this.d = null;
        this.q = null;
    }

    public s(s0.a.a.s sVar) {
        for (int i = 0; i != sVar.size(); i++) {
            z B = z.B(sVar.D(i));
            int i2 = B.c;
            if (i2 == 0) {
                this.c = t.t(B);
            } else if (i2 == 1) {
                this.d = new k0(o0.E(B, false));
            } else if (i2 == 2) {
                this.q = new x(s0.a.a.s.C(B, false));
            } else {
                StringBuilder P0 = a.P0("Unknown tag encountered in structure: ");
                P0.append(B.c);
                throw new IllegalArgumentException(P0.toString());
            }
        }
    }

    public r c() {
        f fVar = new f(3);
        t tVar = this.c;
        if (tVar != null) {
            fVar.a(new e1(0, tVar));
        }
        k0 k0Var = this.d;
        if (k0Var != null) {
            fVar.a(new e1(false, 1, k0Var));
        }
        x xVar = this.q;
        if (xVar != null) {
            fVar.a(new e1(false, 2, xVar));
        }
        return new b1(fVar);
    }

    public final void s(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public String toString() {
        String str = j.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(str);
        t tVar = this.c;
        if (tVar != null) {
            s(stringBuffer, str, "distributionPoint", tVar.toString());
        }
        k0 k0Var = this.d;
        if (k0Var != null) {
            s(stringBuffer, str, "reasons", k0Var.e());
        }
        x xVar = this.q;
        if (xVar != null) {
            s(stringBuffer, str, "cRLIssuer", xVar.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
