package kotlin.jvm.internal;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.List;
import m0.j.g;
import m0.n.b.i;
import m0.r.d;
import m0.r.e;
import m0.r.n;
import m0.r.p;

/* compiled from: TypeReference.kt */
public final class TypeReference implements n {
    public final e c;
    public final List<p> d;
    public final boolean q;

    public TypeReference(e eVar, List<p> list, boolean z) {
        i.e(eVar, "classifier");
        i.e(list, "arguments");
        this.c = eVar;
        this.d = list;
        this.q = z;
    }

    public List<p> a() {
        return this.d;
    }

    public e c() {
        return this.c;
    }

    public boolean d() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            return i.a(this.c, typeReference.c) && i.a(this.d, typeReference.d) && this.q == typeReference.q;
        }
    }

    public final String h() {
        String str;
        String str2;
        e eVar = this.c;
        Class cls = null;
        if (!(eVar instanceof d)) {
            eVar = null;
        }
        d dVar = (d) eVar;
        if (dVar != null) {
            cls = h.l1(dVar);
        }
        if (cls == null) {
            str = this.c.toString();
        } else if (!cls.isArray()) {
            str = cls.getName();
        } else if (i.a(cls, boolean[].class)) {
            str = "kotlin.BooleanArray";
        } else if (i.a(cls, char[].class)) {
            str = "kotlin.CharArray";
        } else if (i.a(cls, byte[].class)) {
            str = "kotlin.ByteArray";
        } else if (i.a(cls, short[].class)) {
            str = "kotlin.ShortArray";
        } else if (i.a(cls, int[].class)) {
            str = "kotlin.IntArray";
        } else if (i.a(cls, float[].class)) {
            str = "kotlin.FloatArray";
        } else if (i.a(cls, long[].class)) {
            str = "kotlin.LongArray";
        } else {
            str = i.a(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        String str3 = "";
        if (this.d.isEmpty()) {
            str2 = str3;
        } else {
            str2 = g.E(this.d, ", ", "<", ">", 0, (CharSequence) null, new TypeReference$asString$args$1(this), 24);
        }
        if (this.q) {
            str3 = "?";
        }
        return a.o0(str, str2, str3);
    }

    public int hashCode() {
        return Boolean.valueOf(this.q).hashCode() + a.H(this.d, this.c.hashCode() * 31, 31);
    }

    public String toString() {
        return h() + " (Kotlin reflection is not available)";
    }
}
