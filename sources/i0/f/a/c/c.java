package i0.f.a.c;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.d.a.a.a;
import i0.f.a.a.z;
import i0.f.a.c.n.n;
import i0.f.a.c.t.f;
import i0.f.a.c.t.g;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: DatabindContext */
public abstract class c {
    public String a(String str, String str2) {
        return str2 == null ? str : a.o0(str, ": ", str2);
    }

    public final String b(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public String c(String str) {
        if (str == null) {
            return "[N/A]";
        }
        Object[] objArr = new Object[1];
        if (str.length() > 500) {
            str = str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
        }
        objArr[0] = str;
        return String.format("\"%s\"", objArr);
    }

    public <T> T d(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        StringBuilder P0 = a.P0("Configured `PolymorphicTypeValidator` (of type ");
        P0.append(f.f(polymorphicTypeValidator));
        P0.append(") denied resolution");
        throw k(javaType, str, P0.toString());
    }

    public <T> T e(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        StringBuilder P0 = a.P0("Configured `PolymorphicTypeValidator` (of type ");
        P0.append(f.f(polymorphicTypeValidator));
        P0.append(") denied resolution");
        throw k(javaType, str, P0.toString());
    }

    public JavaType f(Type type) {
        if (type == null) {
            return null;
        }
        return i().b((i0.f.a.c.s.a) null, type, TypeFactory.q);
    }

    public g<Object, Object> g(i0.f.a.c.n.a aVar, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj instanceof Class) {
            Class<g.a> cls = (Class) obj;
            if (cls == g.a.class || f.v(cls)) {
                return null;
            }
            if (g.class.isAssignableFrom(cls)) {
                MapperConfig<?> h = h();
                Objects.requireNonNull(h.d);
                return (g) f.i(cls, h.b());
            }
            throw new IllegalStateException(a.Y(cls, a.P0("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(a.d0(obj, a.P0("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    public abstract MapperConfig<?> h();

    public abstract TypeFactory i();

    public abstract JsonMappingException k(JavaType javaType, String str, String str2);

    public ObjectIdGenerator<?> l(i0.f.a.c.n.a aVar, n nVar) throws JsonMappingException {
        Class<? extends ObjectIdGenerator<?>> cls = nVar.c;
        MapperConfig<?> h = h();
        Objects.requireNonNull(h.d);
        return ((ObjectIdGenerator) f.i(cls, h.b())).b(nVar.e);
    }

    public z m(i0.f.a.c.n.a aVar, n nVar) {
        Class<? extends z> cls = nVar.d;
        MapperConfig<?> h = h();
        Objects.requireNonNull(h.d);
        return (z) f.i(cls, h.b());
    }

    public abstract <T> T n(JavaType javaType, String str) throws JsonMappingException;

    public <T> T p(Class<?> cls, String str) throws JsonMappingException {
        return n(f(cls), str);
    }
}
