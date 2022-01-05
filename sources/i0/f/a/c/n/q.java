package i0.f.a.c.n;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* compiled from: TypeResolutionContext */
public interface q {

    /* compiled from: TypeResolutionContext */
    public static class a implements q {
        public final TypeFactory c;
        public final TypeBindings d;

        public a(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.c = typeFactory;
            this.d = typeBindings;
        }

        public JavaType a(Type type) {
            return this.c.b((i0.f.a.c.s.a) null, type, this.d);
        }
    }

    /* compiled from: TypeResolutionContext */
    public static class b implements q {
        public final TypeFactory c;

        public b(TypeFactory typeFactory) {
            this.c = typeFactory;
        }

        public JavaType a(Type type) {
            return this.c.b((i0.f.a.c.s.a) null, type, TypeFactory.q);
        }
    }

    JavaType a(Type type);
}
