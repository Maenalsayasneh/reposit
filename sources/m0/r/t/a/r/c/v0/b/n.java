package m0.r.t.a.r.c.v0.b;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.w;

/* compiled from: ReflectJavaField.kt */
public final class n extends p implements m0.r.t.a.r.e.a.w.n {
    public final Field a;

    public n(Field field) {
        i.e(field, "member");
        this.a = field;
    }

    public boolean F() {
        return this.a.isEnumConstant();
    }

    public boolean N() {
        return false;
    }

    public Member Q() {
        return this.a;
    }

    public w getType() {
        w wVar;
        Type genericType = this.a.getGenericType();
        i.d(genericType, "member.genericType");
        i.e(genericType, "type");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new t(cls);
            }
        }
        if ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) {
            wVar = new g(genericType);
        } else if (genericType instanceof WildcardType) {
            wVar = new x((WildcardType) genericType);
        } else {
            wVar = new j(genericType);
        }
        return wVar;
    }
}
