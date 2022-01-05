package s0.a.a.c3;

import s0.a.a.c;
import s0.a.a.n;
import s0.a.a.o;

public class v0 {
    public static final n a = new n("2.5.29.21");
    public static final n b = new n("2.5.29.29");
    public boolean c;
    public o d;

    static {
        new n("2.5.29.9");
        new n("2.5.29.14");
        new n("2.5.29.15");
        new n("2.5.29.16");
        new n("2.5.29.17");
        new n("2.5.29.18");
        new n("2.5.29.19");
        new n("2.5.29.20");
        new n("2.5.29.23");
        new n("2.5.29.24");
        new n("2.5.29.27");
        new n("2.5.29.28");
        new n("2.5.29.30");
        new n("2.5.29.31");
        new n("2.5.29.32");
        new n("2.5.29.33");
        new n("2.5.29.35");
        new n("2.5.29.36");
        new n("2.5.29.37");
        new n("2.5.29.46");
        new n("2.5.29.54");
        new n("1.3.6.1.5.5.7.1.1");
        new n("1.3.6.1.5.5.7.1.11");
        new n("1.3.6.1.5.5.7.1.12");
        new n("1.3.6.1.5.5.7.1.2");
        new n("1.3.6.1.5.5.7.1.3");
        new n("1.3.6.1.5.5.7.1.4");
        new n("2.5.29.56");
        new n("2.5.29.55");
    }

    public v0(c cVar, o oVar) {
        this.c = cVar.E();
        this.d = oVar;
    }

    public v0(boolean z, o oVar) {
        this.c = z;
        this.d = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!v0Var.d.w(this.d) || v0Var.c != this.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.c) {
            return this.d.hashCode();
        }
        return ~this.d.hashCode();
    }
}
