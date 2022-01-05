package i0.f.a.c.m;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import i0.f.a.c.n.a;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* compiled from: Java7SupportImpl */
public class d extends c {
    public d() {
        Class<Transient> cls = Transient.class;
        Class<ConstructorProperties> cls2 = ConstructorProperties.class;
    }

    public PropertyName a(AnnotatedParameter annotatedParameter) {
        ConstructorProperties c;
        AnnotatedWithParams annotatedWithParams = annotatedParameter.q;
        if (annotatedWithParams == null || (c = annotatedWithParams.c(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] value = c.value();
        int i = annotatedParameter.y;
        if (i < value.length) {
            return PropertyName.a(value[i]);
        }
        return null;
    }

    public Boolean b(a aVar) {
        Transient c = aVar.c(Transient.class);
        if (c != null) {
            return Boolean.valueOf(c.value());
        }
        return null;
    }

    public Boolean c(a aVar) {
        if (aVar.c(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
