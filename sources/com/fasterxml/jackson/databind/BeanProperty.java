package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import i0.f.a.c.t.m;
import java.io.Serializable;

public interface BeanProperty extends m {
    public static final JsonFormat.Value f = new JsonFormat.Value();

    public static class Std implements BeanProperty, Serializable {
        public final PropertyName c;
        public final JavaType d;
        public final PropertyName q;
        public final PropertyMetadata x;
        public final AnnotatedMember y;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this.c = propertyName;
            this.d = javaType;
            this.q = propertyName2;
            this.x = propertyMetadata;
            this.y = annotatedMember;
        }

        public AnnotatedMember a() {
            return this.y;
        }

        public PropertyName b() {
            return this.c;
        }

        public JsonFormat.Value e(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.Value p;
            JsonFormat.Value h = mapperConfig.h(cls);
            AnnotationIntrospector e = mapperConfig.e();
            if (e == null || (annotatedMember = this.y) == null || (p = e.p(annotatedMember)) == null) {
                return h;
            }
            return h.f(p);
        }

        public PropertyMetadata f() {
            return this.x;
        }

        public JsonInclude.Value g(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.Value V;
            JsonInclude.Value g = mapperConfig.g(cls, this.d.c);
            AnnotationIntrospector e = mapperConfig.e();
            if (e == null || (annotatedMember = this.y) == null || (V = e.V(annotatedMember)) == null) {
                return g;
            }
            return g.a(V);
        }

        public String getName() {
            return this.c.q;
        }

        public JavaType getType() {
            return this.d;
        }
    }

    static {
        JsonInclude.Value value = JsonInclude.Value.c;
    }

    AnnotatedMember a();

    PropertyName b();

    JsonFormat.Value e(MapperConfig<?> mapperConfig, Class<?> cls);

    PropertyMetadata f();

    JsonInclude.Value g(MapperConfig<?> mapperConfig, Class<?> cls);

    String getName();

    JavaType getType();
}
