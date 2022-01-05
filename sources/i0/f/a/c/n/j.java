package i0.f.a.c.n;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import i0.f.a.c.t.f;
import i0.f.a.c.t.m;
import java.util.Iterator;

/* compiled from: BeanPropertyDefinition */
public abstract class j implements m {
    public static final JsonInclude.Value c = JsonInclude.Value.c;

    public abstract AnnotatedMethod B();

    public abstract PropertyName C();

    public abstract boolean D();

    public abstract boolean E();

    public boolean F(PropertyName propertyName) {
        return b().equals(propertyName);
    }

    public abstract boolean G();

    public abstract boolean H();

    public boolean I() {
        return H();
    }

    public boolean K() {
        return false;
    }

    public abstract PropertyName b();

    public abstract PropertyMetadata f();

    public abstract String getName();

    public boolean i() {
        Object s = s();
        if (s == null && (s = B()) == null) {
            s = u();
        }
        return s != null;
    }

    public boolean j() {
        return r() != null;
    }

    public abstract JsonInclude.Value l();

    public n n() {
        return null;
    }

    public AnnotationIntrospector.ReferenceProperty o() {
        return null;
    }

    public Class<?>[] q() {
        return null;
    }

    public AnnotatedMember r() {
        AnnotatedMethod v = v();
        return v == null ? u() : v;
    }

    public abstract AnnotatedParameter s();

    public Iterator<AnnotatedParameter> t() {
        return f.c;
    }

    public abstract AnnotatedField u();

    public abstract AnnotatedMethod v();

    public abstract AnnotatedMember w();

    public abstract JavaType y();

    public abstract Class<?> z();
}
