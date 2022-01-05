package kotlin.jvm.internal;

import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.g;
import m0.n.b.i;
import m0.n.b.m;

public class AdaptedFunctionReference implements g, Serializable {
    public final int Y1;
    public final int Z1;
    public final Object c;
    public final Class d;
    public final String q;
    public final String x;
    public final boolean y;

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.c = obj;
        this.d = cls;
        this.q = str;
        this.x = str2;
        this.y = (i2 & 1) == 1;
        this.Y1 = i;
        this.Z1 = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        if (this.y != adaptedFunctionReference.y || this.Y1 != adaptedFunctionReference.Y1 || this.Z1 != adaptedFunctionReference.Z1 || !i.a(this.c, adaptedFunctionReference.c) || !i.a(this.d, adaptedFunctionReference.d) || !this.q.equals(adaptedFunctionReference.q) || !this.x.equals(adaptedFunctionReference.x)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return this.Y1;
    }

    public int hashCode() {
        Object obj = this.c;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.d;
        if (cls != null) {
            i = cls.hashCode();
        }
        return ((((a.F(this.x, a.F(this.q, (hashCode + i) * 31, 31), 31) + (this.y ? 1231 : 1237)) * 31) + this.Y1) * 31) + this.Z1;
    }

    public String toString() {
        return m.d(this);
    }
}
