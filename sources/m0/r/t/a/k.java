package m0.r.t.a;

import m0.n.a.a;

/* compiled from: ReflectProperties */
public class k<T> extends l<T> {
    public final a<T> d;
    public volatile Object q;

    public k(a<T> aVar) {
        if (aVar != null) {
            this.q = null;
            this.d = aVar;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
    }

    public T invoke() {
        T t = this.q;
        if (t == null) {
            T invoke = this.d.invoke();
            this.q = invoke == null ? l.c : invoke;
            return invoke;
        } else if (t == l.c) {
            return null;
        } else {
            return t;
        }
    }
}
