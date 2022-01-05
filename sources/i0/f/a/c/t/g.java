package i0.f.a.c.t;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* compiled from: Converter */
public interface g<IN, OUT> {

    /* compiled from: Converter */
    public static abstract class a implements g<Object, Object> {
    }

    OUT a(IN in);

    JavaType b(TypeFactory typeFactory);

    JavaType c(TypeFactory typeFactory);
}
