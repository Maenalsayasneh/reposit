package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass$innerClassNames$2 extends Lambda implements l<Class<?>, d> {
    public static final ReflectJavaClass$innerClassNames$2 c = new ReflectJavaClass$innerClassNames$2();

    public ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!d.i(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return d.g(simpleName);
    }
}
