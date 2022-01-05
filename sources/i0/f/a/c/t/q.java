package i0.f.a.c.t;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.n.j;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: SimpleBeanPropertyDefinition */
public class q extends j {
    public final JsonInclude.Value Y1;
    public final AnnotationIntrospector d;
    public final AnnotatedMember q;
    public final PropertyMetadata x;
    public final PropertyName y;

    public q(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.d = annotationIntrospector;
        this.q = annotatedMember;
        this.y = propertyName;
        this.x = propertyMetadata == null ? PropertyMetadata.d : propertyMetadata;
        this.Y1 = value;
    }

    public static q L(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        JsonInclude.Value value;
        JsonInclude.Include include2;
        if (include == null || include == (include2 = JsonInclude.Include.USE_DEFAULTS)) {
            value = j.c;
        } else {
            JsonInclude.Value value2 = JsonInclude.Value.c;
            if (include != include2) {
                value = new JsonInclude.Value(include, (JsonInclude.Include) null, (Class<?>) null, (Class<?>) null);
            } else {
                value = JsonInclude.Value.c;
            }
        }
        return new q(mapperConfig.e(), annotatedMember, propertyName, propertyMetadata, value);
    }

    public AnnotatedMethod B() {
        AnnotatedMember annotatedMember = this.q;
        if (!(annotatedMember instanceof AnnotatedMethod) || ((AnnotatedMethod) annotatedMember).x() != 1) {
            return null;
        }
        return (AnnotatedMethod) this.q;
    }

    public PropertyName C() {
        AnnotationIntrospector annotationIntrospector = this.d;
        if (!(annotationIntrospector == null || this.q == null)) {
            Objects.requireNonNull(annotationIntrospector);
        }
        return null;
    }

    public boolean D() {
        return this.q instanceof AnnotatedParameter;
    }

    public boolean E() {
        return this.q instanceof AnnotatedField;
    }

    public boolean F(PropertyName propertyName) {
        return this.y.equals(propertyName);
    }

    public boolean G() {
        return B() != null;
    }

    public boolean H() {
        return false;
    }

    public boolean I() {
        return false;
    }

    public PropertyName b() {
        return this.y;
    }

    public PropertyMetadata f() {
        return this.x;
    }

    public String getName() {
        return this.y.q;
    }

    public JsonInclude.Value l() {
        return this.Y1;
    }

    public AnnotatedParameter s() {
        AnnotatedMember annotatedMember = this.q;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    public Iterator<AnnotatedParameter> t() {
        AnnotatedMember annotatedMember = this.q;
        AnnotatedParameter annotatedParameter = annotatedMember instanceof AnnotatedParameter ? (AnnotatedParameter) annotatedMember : null;
        if (annotatedParameter == null) {
            return f.c;
        }
        return Collections.singleton(annotatedParameter).iterator();
    }

    public AnnotatedField u() {
        AnnotatedMember annotatedMember = this.q;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    public AnnotatedMethod v() {
        AnnotatedMember annotatedMember = this.q;
        if (!(annotatedMember instanceof AnnotatedMethod) || ((AnnotatedMethod) annotatedMember).x() != 0) {
            return null;
        }
        return (AnnotatedMethod) this.q;
    }

    public AnnotatedMember w() {
        return this.q;
    }

    public JavaType y() {
        AnnotatedMember annotatedMember = this.q;
        if (annotatedMember == null) {
            return TypeFactory.v();
        }
        return annotatedMember.f();
    }

    public Class<?> z() {
        AnnotatedMember annotatedMember = this.q;
        if (annotatedMember == null) {
            return Object.class;
        }
        return annotatedMember.e();
    }
}
