package m0.r;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: TypesJVM.kt */
public final class s implements WildcardType, Type {
    public static final s c = new s((Type) null, (Type) null);
    public static final a d = new a((f) null);
    public final Type q;
    public final Type x;

    /* compiled from: TypesJVM.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public s(Type type, Type type2) {
        this.q = type;
        this.x = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    public Type[] getLowerBounds() {
        Type type = this.x;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        if (this.x != null) {
            StringBuilder P0 = i0.d.a.a.a.P0("? super ");
            P0.append(r.a(this.x));
            return P0.toString();
        }
        Type type = this.q;
        if (type == null || !(!i.a(type, Object.class))) {
            return "?";
        }
        StringBuilder P02 = i0.d.a.a.a.P0("? extends ");
        P02.append(r.a(this.q));
        return P02.toString();
    }

    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.q;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
