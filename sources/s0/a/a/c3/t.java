package s0.a.a.c3;

import s0.a.a.d;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v;
import s0.a.a.z;
import s0.a.g.j;

public class t extends m implements d {
    public e c;
    public int d;

    public t(int i, e eVar) {
        this.d = i;
        this.c = eVar;
    }

    public t(z zVar) {
        int i = zVar.c;
        this.d = i;
        if (i == 0) {
            this.c = new x(s.C(zVar, false));
        } else {
            this.c = v.D(zVar, false);
        }
    }

    public static t t(z zVar) {
        z B = z.B(zVar.C());
        return (B == null || (B instanceof t)) ? (t) B : new t(B);
    }

    public r c() {
        return new e1(false, this.d, this.c);
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
        String str;
        String str2;
        String str3 = j.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str3);
        if (this.d == 0) {
            str2 = this.c.toString();
            str = "fullName";
        } else {
            str2 = this.c.toString();
            str = "nameRelativeToCRLIssuer";
        }
        s(stringBuffer, str3, str, str2);
        stringBuffer.append("]");
        stringBuffer.append(str3);
        return stringBuffer.toString();
    }
}
