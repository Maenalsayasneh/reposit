package m0.r.t.a.r.c.v0.b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import m0.r.t.a.r.e.a.w.h;
import m0.r.t.a.r.e.a.w.w;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class i extends c implements h {
    public final Class<?> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(d dVar, Class<?> cls) {
        super(dVar);
        m0.n.b.i.e(cls, "klass");
        this.b = cls;
    }

    public w c() {
        Class<?> cls = this.b;
        m0.n.b.i.e(cls, "type");
        if (cls.isPrimitive()) {
            return new t(cls);
        }
        if ((cls instanceof GenericArrayType) || cls.isArray()) {
            return new g(cls);
        }
        if (cls instanceof WildcardType) {
            return new x((WildcardType) cls);
        }
        return new j(cls);
    }
}
