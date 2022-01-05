package i0.f.a.c.t;

import com.fasterxml.jackson.databind.JavaType;
import i0.d.a.a.a;

/* compiled from: TypeKey */
public class t {
    public int a;
    public Class<?> b;
    public JavaType c;
    public boolean d;

    public t() {
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != t.class) {
            return false;
        }
        t tVar = (t) obj;
        if (tVar.d != this.d) {
            return false;
        }
        Class<?> cls = this.b;
        if (cls == null) {
            return this.c.equals(tVar.c);
        }
        if (tVar.b == cls) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        if (this.b != null) {
            StringBuilder P0 = a.P0("{class: ");
            a.p(this.b, P0, ", typed? ");
            return a.D0(P0, this.d, "}");
        }
        StringBuilder P02 = a.P0("{type: ");
        P02.append(this.c);
        P02.append(", typed? ");
        return a.D0(P02, this.d, "}");
    }

    public t(Class<?> cls, boolean z) {
        int i;
        this.b = cls;
        this.c = null;
        this.d = z;
        if (z) {
            i = cls.getName().hashCode() + 1;
        } else {
            i = cls.getName().hashCode();
        }
        this.a = i;
    }

    public t(JavaType javaType, boolean z) {
        int i;
        this.c = javaType;
        this.b = null;
        this.d = z;
        if (z) {
            i = javaType.d - 2;
        } else {
            i = javaType.d - 1;
        }
        this.a = i;
    }
}
