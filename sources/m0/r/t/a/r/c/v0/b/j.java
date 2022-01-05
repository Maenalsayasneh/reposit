package m0.r.t.a.r.c.v0.b;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.r.t.a.r.e.a.w.i;
import m0.r.t.a.r.e.a.w.w;
import m0.r.t.a.r.g.b;

/* compiled from: ReflectJavaClassifierType.kt */
public final class j extends u implements m0.r.t.a.r.e.a.w.j {
    public final Type a;
    public final i b;

    public j(Type type) {
        i iVar;
        m0.n.b.i.e(type, "reflectType");
        this.a = type;
        if (type instanceof Class) {
            iVar = new h((Class) type);
        } else if (type instanceof TypeVariable) {
            iVar = new v((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new h((Class) rawType);
        } else {
            StringBuilder P0 = a.P0("Not a classifier type (");
            P0.append(type.getClass());
            P0.append("): ");
            P0.append(type);
            throw new IllegalStateException(P0.toString());
        }
        this.b = iVar;
    }

    public List<w> E() {
        Object obj;
        Object obj2;
        List<Type> d = ReflectClassUtilKt.d(this.a);
        ArrayList arrayList = new ArrayList(h.K(d, 10));
        for (Type type : d) {
            m0.n.b.i.e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    obj = new t(cls);
                    arrayList.add(obj);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                obj2 = new g(type);
            } else if (type instanceof WildcardType) {
                obj2 = new x((WildcardType) type);
            } else {
                obj2 = new j(type);
            }
            obj = obj2;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public Type Q() {
        return this.a;
    }

    public i c() {
        return this.b;
    }

    public m0.r.t.a.r.e.a.w.a f(b bVar) {
        m0.n.b.i.e(bVar, "fqName");
        return null;
    }

    public Collection<m0.r.t.a.r.e.a.w.a> getAnnotations() {
        return EmptyList.c;
    }

    public boolean m() {
        return false;
    }

    public String o() {
        return this.a.toString();
    }

    public boolean v() {
        Type type = this.a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        m0.n.b.i.d(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    public String w() {
        throw new UnsupportedOperationException(m0.n.b.i.k("Type not found: ", this.a));
    }
}
