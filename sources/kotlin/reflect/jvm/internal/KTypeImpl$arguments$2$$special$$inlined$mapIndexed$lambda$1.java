package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: KTypeImpl.kt */
public final class KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1 extends Lambda implements a<Type> {
    public final /* synthetic */ int c;
    public final /* synthetic */ KTypeImpl$arguments$2 d;
    public final /* synthetic */ c q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(int i, KTypeImpl$arguments$2 kTypeImpl$arguments$2, c cVar, k kVar) {
        super(0);
        this.c = i;
        this.d = kTypeImpl$arguments$2;
        this.q = cVar;
    }

    public Object invoke() {
        Type i = this.d.c.i();
        if (i instanceof Class) {
            Class cls = (Class) i;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            i.d(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
            return componentType;
        } else if (i instanceof GenericArrayType) {
            if (this.c == 0) {
                Type genericComponentType = ((GenericArrayType) i).getGenericComponentType();
                i.d(genericComponentType, "javaType.genericComponentType");
                return genericComponentType;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Array type has been queried for a non-0th argument: ");
            P0.append(this.d.c);
            throw new KotlinReflectionInternalError(P0.toString());
        } else if (i instanceof ParameterizedType) {
            Type type = (Type) ((List) this.q.getValue()).get(this.c);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                i.d(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) h.I0(lowerBounds);
                if (type2 != null) {
                    type = type2;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    i.d(upperBounds, "argument.upperBounds");
                    type = (Type) h.H0(upperBounds);
                }
            }
            i.d(type, "if (argument !is Wildcar…ument.upperBounds.first()");
            return type;
        } else {
            StringBuilder P02 = i0.d.a.a.a.P0("Non-generic type has been queried for arguments: ");
            P02.append(this.d.c);
            throw new KotlinReflectionInternalError(P02.toString());
        }
    }
}
