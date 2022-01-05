package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass$innerClassNames$1 extends Lambda implements l<Class<?>, Boolean> {
    public static final ReflectJavaClass$innerClassNames$1 c = new ReflectJavaClass$innerClassNames$1();

    public ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        i.d(simpleName, "it.simpleName");
        return Boolean.valueOf(simpleName.length() == 0);
    }
}
