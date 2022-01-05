package i0.f.a.c;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.p.e;
import java.io.IOException;

/* compiled from: JsonSerializer */
public abstract class g<T> {

    /* compiled from: JsonSerializer */
    public static abstract class a extends g<Object> {
    }

    public Class<T> c() {
        return null;
    }

    public boolean d(i iVar, T t) {
        return t == null;
    }

    public boolean e() {
        return this instanceof UnwrappingBeanSerializer;
    }

    public abstract void f(T t, JsonGenerator jsonGenerator, i iVar) throws IOException;

    public void g(T t, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
        Class<?> c = c();
        if (c == null) {
            c = t.getClass();
        }
        iVar.n(iVar.f(c), String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[]{c.getName(), getClass().getName()}));
        throw null;
    }

    public g<T> h(NameTransformer nameTransformer) {
        return this;
    }

    public boolean i() {
        return false;
    }
}
