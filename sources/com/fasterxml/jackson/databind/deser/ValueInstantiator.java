package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ValueInstantiator {
    public Object A(DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no array delegate creator specified", new Object[0]);
        throw null;
    }

    public Object C(DeserializationContext deserializationContext) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no default no-arguments constructor found", new Object[0]);
        throw null;
    }

    public Object E(DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no delegate creator specified", new Object[0]);
        throw null;
    }

    public AnnotatedWithParams F() {
        return null;
    }

    public JavaType G(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedWithParams H() {
        return null;
    }

    public AnnotatedWithParams I() {
        return null;
    }

    public JavaType J(DeserializationConfig deserializationConfig) {
        return null;
    }

    public SettableBeanProperty[] M(DeserializationConfig deserializationConfig) {
        return null;
    }

    public Class<?> N() {
        return Object.class;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof JsonLocationInstantiator;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean k() {
        return H() != null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return k() || l() || i() || g() || h() || e() || f() || d() || c();
    }

    public Object n(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw null;
    }

    public Object p(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw null;
    }

    public Object q(DeserializationContext deserializationContext, boolean z) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
        throw null;
    }

    public Object v(DeserializationContext deserializationContext, double d) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
        throw null;
    }

    public Object w(DeserializationContext deserializationContext, int i) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i));
        throw null;
    }

    public Object x(DeserializationContext deserializationContext, long j) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j));
        throw null;
    }

    public Object y(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        deserializationContext.O(N(), this, (JsonParser) null, "no creator with arguments specified", new Object[0]);
        throw null;
    }

    public Object z(DeserializationContext deserializationContext, String str) throws IOException {
        deserializationContext.O(N(), this, deserializationContext.Z1, "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw null;
    }

    public static class Base extends ValueInstantiator implements Serializable {
        public final Class<?> c;

        public Base(Class<?> cls) {
            this.c = cls;
        }

        public Class<?> N() {
            return this.c;
        }

        public Base(JavaType javaType) {
            this.c = javaType.c;
        }
    }
}
