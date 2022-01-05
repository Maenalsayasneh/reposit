package m0.r.t.a.r.j.p;

import m0.n.b.i;
import m0.r.t.a.r.g.a;

/* compiled from: ClassLiteralValue.kt */
public final class f {
    public final a a;
    public final int b;

    public f(a aVar, int i) {
        i.e(aVar, "classId");
        this.a = aVar;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i3 = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
