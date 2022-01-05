package i0.f.a.c.m;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import i0.f.a.c.n.a;
import i0.f.a.c.t.f;

/* compiled from: Java7Support */
public abstract class c {
    public static final c a;

    static {
        c cVar;
        try {
            cVar = (c) f.i(Class.forName("i0.f.a.c.m.d"), false);
        } catch (Throwable unused) {
            cVar = null;
        }
        a = cVar;
    }

    public abstract PropertyName a(AnnotatedParameter annotatedParameter);

    public abstract Boolean b(a aVar);

    public abstract Boolean c(a aVar);
}
