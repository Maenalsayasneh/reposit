package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import i0.f.a.b.e;
import i0.f.a.b.m.d;
import i0.f.a.c.b;
import i0.f.a.c.n.i;
import i0.f.a.c.p.a;
import java.io.Serializable;

public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    public static final e f2 = new DefaultPrettyPrinter();
    public static final int g2 = MapperConfig.c(SerializationFeature.class);
    public final e h2;
    public final int i2;
    public final int j2;
    public final int k2;
    public final int l2;
    public final int m2;

    public SerializationConfig(BaseSettings baseSettings, a aVar, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, aVar, simpleMixInResolver, rootNameLookup, configOverrides);
        this.i2 = g2;
        this.h2 = f2;
        this.j2 = 0;
        this.k2 = 0;
        this.l2 = 0;
        this.m2 = 0;
    }

    public void A(JsonGenerator jsonGenerator) {
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this.i2) && jsonGenerator.q == null) {
            e eVar = this.h2;
            if (eVar instanceof d) {
                eVar = (e) ((d) eVar).e();
            }
            if (eVar != null) {
                jsonGenerator.C(eVar);
            }
        }
        boolean enabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.i2);
        int i = this.k2;
        if (i != 0 || enabledIn) {
            int i3 = this.j2;
            if (enabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i3 |= mask;
                i |= mask;
            }
            jsonGenerator.v(i3, i);
        }
        int i4 = this.m2;
        if (i4 != 0) {
            jsonGenerator.q(this.l2, i4);
        }
    }

    public b C(JavaType javaType) {
        BasicClassIntrospector basicClassIntrospector = (BasicClassIntrospector) this.d.q;
        i b = basicClassIntrospector.b(this, javaType);
        if (b != null) {
            return b;
        }
        i a = basicClassIntrospector.a(this, javaType);
        return a == null ? new i(basicClassIntrospector.d(this, javaType, this, true)) : a;
    }

    public final boolean E(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this.i2) != 0;
    }

    public MapperConfigBase v(int i) {
        return new SerializationConfig(this, i, this.i2, this.j2, this.k2, this.l2, this.m2);
    }

    public SerializationConfig(SerializationConfig serializationConfig, int i, int i3, int i4, int i5, int i6, int i7) {
        super(serializationConfig, i);
        this.i2 = i3;
        this.h2 = serializationConfig.h2;
        this.j2 = i4;
        this.k2 = i5;
        this.l2 = i6;
        this.m2 = i7;
    }
}
