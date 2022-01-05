package m0.r.t.a.r.e.a.x;

import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;

/* compiled from: typeEnhancement.kt */
public final class c<T> {
    public final T a;
    public final f b;

    public c(T t, f fVar) {
        this.a = t;
        this.b = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && i.a(this.b, cVar.b);
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        f fVar = this.b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EnhancementResult(result=");
        P0.append(this.a);
        P0.append(", enhancementAnnotations=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
