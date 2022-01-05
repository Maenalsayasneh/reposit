package t0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import q0.d0;
import q0.f0;

/* compiled from: Converter */
public interface h<F, T> {

    /* compiled from: Converter */
    public static abstract class a {
        public h<?, d0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
            return null;
        }

        public h<f0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
            return null;
        }
    }

    T a(F f) throws IOException;
}
