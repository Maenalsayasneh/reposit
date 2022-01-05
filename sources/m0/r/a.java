package m0.r;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import m0.n.b.i;

/* compiled from: TypesJVM.kt */
public final class a implements GenericArrayType, Type {
    public final Type c;

    public a(Type type) {
        i.e(type, "elementType");
        this.c = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && i.a(this.c, ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.c;
    }

    public String getTypeName() {
        return r.a(this.c) + "[]";
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
