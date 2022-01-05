package i0.f.a.c.p.f;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.p.c;

/* compiled from: TypeIdResolverBase */
public abstract class j implements c {
    public final TypeFactory a;
    public final JavaType b;

    public j(JavaType javaType, TypeFactory typeFactory) {
        this.b = javaType;
        this.a = typeFactory;
    }

    public void c(JavaType javaType) {
    }

    public String f() {
        return e((Object) null, this.b.c);
    }
}
