package i0.f.a.c.n;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* compiled from: Annotated */
public abstract class a {
    public abstract AnnotatedElement b();

    public abstract <A extends Annotation> A c(Class<A> cls);

    public abstract String d();

    public abstract Class<?> e();

    public abstract boolean equals(Object obj);

    public abstract JavaType f();

    public abstract int hashCode();

    public abstract String toString();
}
