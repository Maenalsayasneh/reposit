package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.List;

public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    public final PropertyMetadata c;
    public transient List<PropertyName> d;

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this.c = propertyMetadata == null ? PropertyMetadata.q : propertyMetadata;
    }

    public boolean c() {
        Boolean bool = this.c.x;
        return bool != null && bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.annotation.JsonFormat.Value e(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2, java.lang.Class<?> r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r2.h(r3)
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r2.e()
            if (r2 == 0) goto L_0x0015
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r1.a()
            if (r0 == 0) goto L_0x0015
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r2.p(r0)
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001d
            if (r2 != 0) goto L_0x001c
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.BeanProperty.f
        L_0x001c:
            return r2
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r3.f(r2)
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.e(com.fasterxml.jackson.databind.cfg.MapperConfig, java.lang.Class):com.fasterxml.jackson.annotation.JsonFormat$Value");
    }

    public PropertyMetadata f() {
        return this.c;
    }

    public JsonInclude.Value g(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector e = mapperConfig.e();
        AnnotatedMember a = a();
        if (a == null) {
            return mapperConfig.i(cls);
        }
        JsonInclude.Value g = mapperConfig.g(cls, a.e());
        if (e == null) {
            return g;
        }
        JsonInclude.Value V = e.V(a);
        if (g == null) {
            return V;
        }
        return g.a(V);
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this.c = concreteBeanPropertyBase.c;
    }
}
