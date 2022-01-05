package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.k.a;
import i0.f.a.c.k.b;
import i0.f.a.c.n.i;
import i0.f.a.c.n.k;
import java.io.Serializable;
import java.util.Objects;

public abstract class MapperConfig<T extends MapperConfig<T>> implements k.a, Serializable {
    public final int c;
    public final BaseSettings d;

    static {
        JsonInclude.Value value = JsonInclude.Value.c;
        JsonFormat.Value value2 = JsonFormat.Value.c;
    }

    public MapperConfig(BaseSettings baseSettings, int i) {
        this.d = baseSettings;
        this.c = i;
    }

    public static <F extends Enum<F> & a> int c(Class<F> cls) {
        int i = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            a aVar = (a) enumR;
            if (aVar.enabledByDefault()) {
                i |= aVar.getMask();
            }
        }
        return i;
    }

    public final boolean b() {
        return q(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public final JavaType d(Class<?> cls) {
        return this.d.d.b((i0.f.a.c.s.a) null, cls, TypeFactory.q);
    }

    public AnnotationIntrospector e() {
        if (q(MapperFeature.USE_ANNOTATIONS)) {
            return this.d.x;
        }
        return NopAnnotationIntrospector.c;
    }

    public abstract b f(Class<?> cls);

    public abstract JsonInclude.Value g(Class<?> cls, Class<?> cls2);

    public abstract JsonFormat.Value h(Class<?> cls);

    public abstract JsonInclude.Value i(Class<?> cls);

    public JsonInclude.Value k(Class<?> cls, JsonInclude.Value value) {
        b a = ((MapperConfigBase) this).e2.a(cls);
        if (a == null) {
            a = MapperConfigBase.q;
        }
        Objects.requireNonNull(a);
        return value;
    }

    public abstract VisibilityChecker<?> l(Class<?> cls, i0.f.a.c.n.b bVar);

    public i0.f.a.c.b m(JavaType javaType) {
        BasicClassIntrospector basicClassIntrospector = (BasicClassIntrospector) this.d.q;
        i b = basicClassIntrospector.b(this, javaType);
        return b == null ? i.i(this, javaType, basicClassIntrospector.c(this, javaType, this)) : b;
    }

    public i0.f.a.c.b n(Class<?> cls) {
        return m(this.d.d.b((i0.f.a.c.s.a) null, cls, TypeFactory.q));
    }

    public final boolean p() {
        return q(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean q(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this.c);
    }

    public MapperConfig(MapperConfig<T> mapperConfig, int i) {
        this.d = mapperConfig.d;
        this.c = i;
    }
}
