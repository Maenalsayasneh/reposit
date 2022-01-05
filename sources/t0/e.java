package t0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: CallAdapter */
public interface e<R, T> {

    /* compiled from: CallAdapter */
    public static abstract class a {
        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, w wVar);
    }

    Type a();

    T b(d<R> dVar);
}
