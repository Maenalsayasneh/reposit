package m0.r.t.a.r.c.v0.b;

import java.lang.reflect.Type;
import java.util.Iterator;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.w;
import m0.r.t.a.r.g.b;

/* compiled from: ReflectJavaType.kt */
public abstract class u implements w {
    public abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof u) && i.a(Q(), ((u) obj).Q());
    }

    public a f(b bVar) {
        T t;
        i.e(this, "this");
        i.e(bVar, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            m0.r.t.a.r.g.a e = ((a) next).e();
            if (e != null) {
                t = e.b();
            }
            if (i.a(t, bVar)) {
                t = next;
                break;
            }
        }
        return (a) t;
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }
}
