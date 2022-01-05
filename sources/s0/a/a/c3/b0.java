package s0.a.a.c3;

import s0.a.a.c;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;
import s0.a.g.j;

public class b0 extends m {
    public boolean Y1;
    public s Z1;
    public t c;
    public boolean d;
    public boolean q;
    public k0 x;
    public boolean y;

    public b0(s sVar) {
        this.Z1 = sVar;
        for (int i = 0; i != sVar.size(); i++) {
            z B = z.B(sVar.D(i));
            int i2 = B.c;
            if (i2 == 0) {
                this.c = t.t(B);
            } else if (i2 == 1) {
                this.d = c.D(B, false).E();
            } else if (i2 == 2) {
                this.q = c.D(B, false).E();
            } else if (i2 == 3) {
                this.x = new k0(o0.E(B, false));
            } else if (i2 == 4) {
                this.y = c.D(B, false).E();
            } else if (i2 == 5) {
                this.Y1 = c.D(B, false).E();
            } else {
                throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
            }
        }
    }

    public static b0 u(Object obj) {
        if (obj instanceof b0) {
            return (b0) obj;
        }
        if (obj != null) {
            return new b0(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.Z1;
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

    public final String t(boolean z) {
        return z ? "true" : "false";
    }

    public String toString() {
        String str = j.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        t tVar = this.c;
        if (tVar != null) {
            s(stringBuffer, str, "distributionPoint", tVar.toString());
        }
        boolean z = this.d;
        if (z) {
            s(stringBuffer, str, "onlyContainsUserCerts", t(z));
        }
        boolean z2 = this.q;
        if (z2) {
            s(stringBuffer, str, "onlyContainsCACerts", t(z2));
        }
        k0 k0Var = this.x;
        if (k0Var != null) {
            s(stringBuffer, str, "onlySomeReasons", k0Var.e());
        }
        boolean z3 = this.Y1;
        if (z3) {
            s(stringBuffer, str, "onlyContainsAttributeCerts", t(z3));
        }
        boolean z4 = this.y;
        if (z4) {
            s(stringBuffer, str, "indirectCRL", t(z4));
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
