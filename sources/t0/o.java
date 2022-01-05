package t0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import q0.f0;
import t0.h;

@IgnoreJRERequirement
/* compiled from: OptionalConverterFactory */
public final class o extends h.a {
    public static final h.a a = new o();

    @IgnoreJRERequirement
    /* compiled from: OptionalConverterFactory */
    public static final class a<T> implements h<f0, Optional<T>> {
        public final h<f0, T> a;

        public a(h<f0, T> hVar) {
            this.a = hVar;
        }

        public Object a(Object obj) throws IOException {
            return Optional.ofNullable(this.a.a((f0) obj));
        }
    }

    public h<f0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.f(type) != Optional.class) {
            return null;
        }
        return new a(wVar.e(a0.e(0, (ParameterizedType) type), annotationArr));
    }
}
