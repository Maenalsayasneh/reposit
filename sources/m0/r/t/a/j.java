package m0.r.t.a;

import java.lang.ref.SoftReference;
import m0.n.a.a;

/* compiled from: ReflectProperties */
public class j<T> extends l<T> implements a<T> {
    public final a<T> d;
    public volatile SoftReference<Object> q;

    public j(T t, a<T> aVar) {
        if (aVar != null) {
            this.q = null;
            this.d = aVar;
            if (t != null) {
                this.q = new SoftReference<>(t);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
    }

    public T invoke() {
        T t;
        SoftReference<Object> softReference = this.q;
        if (softReference == null || (t = softReference.get()) == null) {
            T invoke = this.d.invoke();
            this.q = new SoftReference<>(invoke == null ? l.c : invoke);
            return invoke;
        } else if (t == l.c) {
            return null;
        } else {
            return t;
        }
    }
}
