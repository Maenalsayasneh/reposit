package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.n.j;
import i0.f.a.c.p.b;
import i0.f.a.c.t.a;
import java.io.IOException;
import java.lang.reflect.Method;

public final class MethodProperty extends SettableBeanProperty {
    public final AnnotatedMethod h2;
    public final transient Method i2;
    public final boolean j2;

    public MethodProperty(j jVar, JavaType javaType, b bVar, a aVar, AnnotatedMethod annotatedMethod) {
        super(jVar, javaType, bVar, aVar);
        this.h2 = annotatedMethod;
        this.i2 = annotatedMethod.x;
        this.j2 = NullsConstantProvider.a(this.c2);
    }

    public final void I(Object obj, Object obj2) throws IOException {
        try {
            this.i2.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            d((JsonParser) null, e, obj2);
            throw null;
        }
    }

    public Object J(Object obj, Object obj2) throws IOException {
        try {
            Object invoke = this.i2.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e) {
            d((JsonParser) null, e, obj2);
            throw null;
        }
    }

    public SettableBeanProperty O(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
    }

    public SettableBeanProperty Q(i iVar) {
        return new MethodProperty(this, this.a2, iVar);
    }

    public SettableBeanProperty T(d<?> dVar) {
        d<Object> dVar2 = this.a2;
        if (dVar2 == dVar) {
            return this;
        }
        i iVar = this.c2;
        if (dVar2 == iVar) {
            iVar = dVar;
        }
        return new MethodProperty(this, dVar, iVar);
    }

    public AnnotatedMember a() {
        return this.h2;
    }

    public void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
            b bVar = this.b2;
            if (bVar == null) {
                Object d = this.a2.d(jsonParser, deserializationContext);
                if (d != null) {
                    obj2 = d;
                } else if (!this.j2) {
                    obj2 = this.c2.b(deserializationContext);
                } else {
                    return;
                }
            } else {
                obj2 = this.a2.f(jsonParser, deserializationContext, bVar);
            }
        } else if (!this.j2) {
            obj2 = this.c2.b(deserializationContext);
        } else {
            return;
        }
        try {
            this.i2.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            d(jsonParser, e, obj2);
            throw null;
        }
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
            b bVar = this.b2;
            if (bVar == null) {
                Object d = this.a2.d(jsonParser, deserializationContext);
                if (d != null) {
                    obj2 = d;
                } else if (this.j2) {
                    return obj;
                } else {
                    obj2 = this.c2.b(deserializationContext);
                }
            } else {
                obj2 = this.a2.f(jsonParser, deserializationContext, bVar);
            }
        } else if (this.j2) {
            return obj;
        } else {
            obj2 = this.c2.b(deserializationContext);
        }
        try {
            Object invoke = this.i2.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e) {
            d(jsonParser, e, obj2);
            throw null;
        }
    }

    public void n(DeserializationConfig deserializationConfig) {
        this.h2.g(deserializationConfig.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public MethodProperty(MethodProperty methodProperty, d<?> dVar, i iVar) {
        super(methodProperty, dVar, iVar);
        this.h2 = methodProperty.h2;
        this.i2 = methodProperty.i2;
        this.j2 = NullsConstantProvider.a(iVar);
    }

    public MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this.h2 = methodProperty.h2;
        this.i2 = methodProperty.i2;
        this.j2 = methodProperty.j2;
    }
}
