package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: BuiltInsLoader.kt */
public final class BuiltInsLoader$Companion$Instance$2 extends Lambda implements a<BuiltInsLoader> {
    public static final BuiltInsLoader$Companion$Instance$2 c = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    public Object invoke() {
        Class<BuiltInsLoader> cls = BuiltInsLoader.class;
        ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
        i.d(load, "implementations");
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) g.v(load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
