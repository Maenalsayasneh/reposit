package m0.r.t.a.r.k.b;

import m0.n.b.i;
import m0.r.t.a.r.g.a;

/* compiled from: IncompatibleVersionErrorData.kt */
public final class n<T> {
    public final T a;
    public final T b;
    public final String c;
    public final a d;

    public n(T t, T t2, String str, a aVar) {
        i.e(str, "filePath");
        i.e(aVar, "classId");
        this.a = t;
        this.b = t2;
        this.c = str;
        this.d = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return i.a(this.a, nVar.a) && i.a(this.b, nVar.b) && i.a(this.c, nVar.c) && i.a(this.d, nVar.d);
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return this.d.hashCode() + i0.d.a.a.a.F(this.c, (hashCode + i) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("IncompatibleVersionErrorData(actualVersion=");
        P0.append(this.a);
        P0.append(", expectedVersion=");
        P0.append(this.b);
        P0.append(", filePath=");
        P0.append(this.c);
        P0.append(", classId=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }
}
