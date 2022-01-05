package m0.r.t.a.r.c.v0.b;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.u;

/* compiled from: ReflectJavaPrimitiveType.kt */
public final class t extends u implements u {
    public final Class<?> a;
    public final Collection<a> b = EmptyList.c;

    public t(Class<?> cls) {
        i.e(cls, "reflectType");
        this.a = cls;
    }

    public Type Q() {
        return this.a;
    }

    public Collection<a> getAnnotations() {
        return this.b;
    }

    public PrimitiveType getType() {
        if (i.a(this.a, Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(this.a.getName()).getPrimitiveType();
    }

    public boolean m() {
        return false;
    }
}
