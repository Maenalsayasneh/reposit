package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.j.e;
import i0.f.a.c.n.a;
import i0.f.a.c.n.b;
import i0.f.a.c.n.n;
import i0.f.a.c.p.d;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;

public abstract class AnnotationIntrospector implements Serializable {

    public static class ReferenceProperty {
        public final Type a;
        public final String b;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this.a = type;
            this.b = str;
        }
    }

    public PropertyName A(a aVar) {
        return null;
    }

    public Boolean A0(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType B0(MapperConfig<?> mapperConfig, a aVar, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public PropertyName C(a aVar) {
        return null;
    }

    public JavaType C0(MapperConfig<?> mapperConfig, a aVar, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public AnnotatedMethod D0(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public Object E(b bVar) {
        return null;
    }

    public Object F(a aVar) {
        return null;
    }

    public n G(a aVar) {
        return null;
    }

    public n H(a aVar, n nVar) {
        return nVar;
    }

    public Class<?> I(b bVar) {
        return null;
    }

    public e.a J(b bVar) {
        return null;
    }

    public JsonProperty.Access M(a aVar) {
        return null;
    }

    public List<PropertyName> N(a aVar) {
        return null;
    }

    public d<?> O(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String Q(a aVar) {
        return null;
    }

    public String R(a aVar) {
        return null;
    }

    public JsonIgnoreProperties.Value T(MapperConfig<?> mapperConfig, a aVar) {
        return U(aVar);
    }

    @Deprecated
    public JsonIgnoreProperties.Value U(a aVar) {
        return JsonIgnoreProperties.Value.c;
    }

    public JsonInclude.Value V(a aVar) {
        return JsonInclude.Value.c;
    }

    public JsonIncludeProperties.Value W(MapperConfig<?> mapperConfig, a aVar) {
        return JsonIncludeProperties.Value.c;
    }

    public Integer X(a aVar) {
        return null;
    }

    public d<?> Y(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty Z(AnnotatedMember annotatedMember) {
        return null;
    }

    public void a(MapperConfig<?> mapperConfig, b bVar, List<BeanPropertyWriter> list) {
    }

    public PropertyName a0(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    public VisibilityChecker<?> b(b bVar, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public PropertyName b0(b bVar) {
        return null;
    }

    public Object c(a aVar) {
        return null;
    }

    public Object c0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object d(a aVar) {
        return null;
    }

    public Object d0(a aVar) {
        return null;
    }

    public JsonCreator.Mode e(MapperConfig<?> mapperConfig, a aVar) {
        if (!v0(aVar)) {
            return null;
        }
        JsonCreator.Mode f = f(aVar);
        return f == null ? JsonCreator.Mode.DEFAULT : f;
    }

    public String[] e0(b bVar) {
        return null;
    }

    @Deprecated
    public JsonCreator.Mode f(a aVar) {
        return null;
    }

    public Boolean f0(a aVar) {
        return null;
    }

    public Enum<?> g(Class<Enum<?>> cls) {
        return null;
    }

    public JsonSerialize.Typing g0(a aVar) {
        return null;
    }

    public Object h(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object h0(a aVar) {
        return null;
    }

    public Object i(a aVar) {
        return null;
    }

    public JsonSetter.Value i0(a aVar) {
        return JsonSetter.Value.c;
    }

    public List<NamedType> j0(a aVar) {
        return null;
    }

    public Object k(a aVar) {
        return null;
    }

    public String k0(b bVar) {
        return null;
    }

    public void l(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public d<?> l0(MapperConfig<?> mapperConfig, b bVar, JavaType javaType) {
        return null;
    }

    public String[] m(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public NameTransformer m0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object n(a aVar) {
        return null;
    }

    public Object n0(b bVar) {
        return null;
    }

    public Class<?>[] o0(a aVar) {
        return null;
    }

    public JsonFormat.Value p(a aVar) {
        return JsonFormat.Value.c;
    }

    public Boolean p0(a aVar) {
        if (!(aVar instanceof AnnotatedMethod) || !q0((AnnotatedMethod) aVar)) {
            return null;
        }
        return Boolean.TRUE;
    }

    public String q(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public boolean q0(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean r0(a aVar) {
        return null;
    }

    public Boolean s0(MapperConfig<?> mapperConfig, a aVar) {
        return null;
    }

    public Boolean t0(a aVar) {
        if (!(aVar instanceof AnnotatedMethod) || !u0((AnnotatedMethod) aVar)) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Deprecated
    public boolean u0(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public JacksonInject.Value v(AnnotatedMember annotatedMember) {
        Object w = w(annotatedMember);
        if (w != null) {
            return JacksonInject.Value.a(w, (Boolean) null);
        }
        return null;
    }

    @Deprecated
    public boolean v0(a aVar) {
        return false;
    }

    @Deprecated
    public Object w(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean w0(AnnotatedMember annotatedMember) {
        return false;
    }

    public Object x(a aVar) {
        return null;
    }

    public Boolean x0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object y(a aVar) {
        return null;
    }

    public boolean y0(Annotation annotation) {
        return false;
    }

    public Boolean z(a aVar) {
        return null;
    }

    public Boolean z0(b bVar) {
        return null;
    }
}
