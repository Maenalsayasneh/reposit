package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import i0.f.a.c.b;
import i0.f.a.c.l.e;
import i0.f.a.c.n.i;
import i0.f.a.c.p.a;
import i0.f.a.c.t.h;
import java.io.Serializable;

public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    public static final int f2 = MapperConfig.c(DeserializationFeature.class);
    public final h<e> g2;
    public final JsonNodeFactory h2;
    public final CoercionConfigs i2;
    public final ConstructorDetector j2;
    public final int k2;
    public final int l2;
    public final int m2;
    public final int n2;
    public final int o2;

    public DeserializationConfig(BaseSettings baseSettings, a aVar, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(baseSettings, aVar, simpleMixInResolver, rootNameLookup, configOverrides);
        this.k2 = f2;
        this.g2 = null;
        this.h2 = JsonNodeFactory.d;
        this.j2 = null;
        this.i2 = coercionConfigs;
        this.l2 = 0;
        this.m2 = 0;
        this.n2 = 0;
        this.o2 = 0;
    }

    public ConstructorDetector A() {
        ConstructorDetector constructorDetector = this.j2;
        return constructorDetector == null ? ConstructorDetector.c : constructorDetector;
    }

    public b C(JavaType javaType) {
        BasicClassIntrospector basicClassIntrospector = (BasicClassIntrospector) this.d.q;
        i b = basicClassIntrospector.b(this, javaType);
        if (b != null) {
            return b;
        }
        i a = basicClassIntrospector.a(this, javaType);
        return a == null ? new i(basicClassIntrospector.d(this, javaType, this, false)) : a;
    }

    public b E(JavaType javaType) {
        BasicClassIntrospector basicClassIntrospector = (BasicClassIntrospector) this.d.q;
        i b = basicClassIntrospector.b(this, javaType);
        if (b != null) {
            return b;
        }
        i a = basicClassIntrospector.a(this, javaType);
        return a == null ? new i(basicClassIntrospector.d(this, javaType, this, false)) : a;
    }

    public final boolean F(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this.k2) != 0;
    }

    public MapperConfigBase v(int i) {
        return new DeserializationConfig(this, i, this.k2, this.l2, this.m2, this.n2, this.o2);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, int i, int i3, int i4, int i5, int i6, int i7) {
        super(deserializationConfig, i);
        this.k2 = i3;
        this.g2 = deserializationConfig.g2;
        this.h2 = deserializationConfig.h2;
        this.i2 = deserializationConfig.i2;
        this.j2 = deserializationConfig.j2;
        this.l2 = i4;
        this.m2 = i5;
        this.n2 = i6;
        this.o2 = i7;
    }
}
