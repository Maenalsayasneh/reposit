package m0.r.t.a.r.c.v0.b;

import i0.j.f.p.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.a0;
import m0.r.t.a.r.e.a.w.w;

/* compiled from: ReflectJavaWildcardType.kt */
public final class x extends u implements a0 {
    public final WildcardType a;
    public final Collection<a> b = EmptyList.c;

    public x(WildcardType wildcardType) {
        i.e(wildcardType, "reflectType");
        this.a = wildcardType;
    }

    public w A() {
        w gVar;
        t tVar;
        Type[] upperBounds = this.a.getUpperBounds();
        Type[] lowerBounds = this.a.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException(i.k("Wildcard types with many bounds are not yet supported: ", this.a));
        }
        if (lowerBounds.length == 1) {
            i.d(lowerBounds, "lowerBounds");
            Object S3 = h.S3(lowerBounds);
            i.d(S3, "lowerBounds.single()");
            Type type = (Type) S3;
            i.e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    tVar = new t(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                gVar = new g(type);
                return gVar;
            }
            if (type instanceof WildcardType) {
                gVar = new x((WildcardType) type);
            } else {
                gVar = new j(type);
            }
            return gVar;
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            i.d(upperBounds, "upperBounds");
            Type type2 = (Type) h.S3(upperBounds);
            if (i.a(type2, Object.class)) {
                return null;
            }
            i.d(type2, "ub");
            i.e(type2, "type");
            boolean z2 = type2 instanceof Class;
            if (z2) {
                Class cls2 = (Class) type2;
                if (cls2.isPrimitive()) {
                    tVar = new t(cls2);
                }
            }
            if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                gVar = new g(type2);
                return gVar;
            }
            if (type2 instanceof WildcardType) {
                gVar = new x((WildcardType) type2);
            } else {
                gVar = new j(type2);
            }
            return gVar;
        }
        return tVar;
    }

    public boolean I() {
        Type[] upperBounds = this.a.getUpperBounds();
        i.d(upperBounds, "reflectType.upperBounds");
        return !i.a(h.I0(upperBounds), Object.class);
    }

    public Type Q() {
        return this.a;
    }

    public Collection<a> getAnnotations() {
        return this.b;
    }

    public boolean m() {
        return false;
    }
}
