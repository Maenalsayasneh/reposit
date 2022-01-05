package m0.r.t.a.r.c.v0.b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.f;
import m0.r.t.a.r.e.a.w.w;

/* compiled from: ReflectJavaArrayType.kt */
public final class g extends u implements f {
    public final Type a;
    public final u b;
    public final Collection<a> c;

    public g(Type type) {
        u uVar;
        u gVar;
        i.e(type, "reflectType");
        this.a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            i.d(genericComponentType, "genericComponentType");
            i.e(genericComponentType, "type");
            boolean z = genericComponentType instanceof Class;
            if (z) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    uVar = new t(cls);
                    this.b = uVar;
                    this.c = EmptyList.c;
                }
            }
            if ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) {
                gVar = new g(genericComponentType);
            } else if (genericComponentType instanceof WildcardType) {
                gVar = new x((WildcardType) genericComponentType);
            } else {
                gVar = new j(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    i.d(componentType, "getComponentType()");
                    i.e(componentType, "type");
                    if (componentType.isPrimitive()) {
                        gVar = new t(componentType);
                    } else if ((componentType instanceof GenericArrayType) || componentType.isArray()) {
                        gVar = new g(componentType);
                    } else if (componentType instanceof WildcardType) {
                        gVar = new x((WildcardType) componentType);
                    } else {
                        gVar = new j(componentType);
                    }
                }
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Not an array type (");
            P0.append(type.getClass());
            P0.append("): ");
            P0.append(type);
            throw new IllegalArgumentException(P0.toString());
        }
        uVar = gVar;
        this.b = uVar;
        this.c = EmptyList.c;
    }

    public Type Q() {
        return this.a;
    }

    public Collection<a> getAnnotations() {
        return this.c;
    }

    public boolean m() {
        return false;
    }

    public w n() {
        return this.b;
    }
}
