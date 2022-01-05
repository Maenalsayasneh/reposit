package kotlin.reflect;

import i0.j.f.p.h;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m0.n.b.i;
import m0.r.r;

/* compiled from: TypesJVM.kt */
public final class ParameterizedTypeImpl implements ParameterizedType, Type {
    public final Type[] c;
    public final Class<?> d;
    public final Type q;

    public ParameterizedTypeImpl(Class<?> cls, Type type, List<? extends Type> list) {
        i.e(cls, "rawType");
        i.e(list, "typeArguments");
        this.d = cls;
        this.q = type;
        Object[] array = list.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.c = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return i.a(this.d, parameterizedType.getRawType()) && i.a(this.q, parameterizedType.getOwnerType()) && Arrays.equals(this.c, parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.c;
    }

    public Type getOwnerType() {
        return this.q;
    }

    public Type getRawType() {
        return this.d;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.q;
        if (type != null) {
            sb.append(r.a(type));
            sb.append("$");
            sb.append(this.d.getSimpleName());
        } else {
            sb.append(r.a(this.d));
        }
        Type[] typeArr = this.c;
        if (!(typeArr.length == 0)) {
            h.D2(typeArr, sb, ", ", "<", ">", -1, "...", ParameterizedTypeImpl$getTypeName$1$1.c);
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        Type type = this.q;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.c);
    }

    public String toString() {
        return getTypeName();
    }
}
