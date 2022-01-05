package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
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
import i0.f.a.c.t.f;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty {
    public final AnnotatedMethod h2;
    public final Method i2;

    public SetterlessProperty(j jVar, JavaType javaType, b bVar, a aVar, AnnotatedMethod annotatedMethod) {
        super(jVar, javaType, bVar, aVar);
        this.h2 = annotatedMethod;
        this.i2 = annotatedMethod.x;
    }

    public final void I(Object obj, Object obj2) throws IOException {
        throw new UnsupportedOperationException(i0.d.a.a.a.y0(i0.d.a.a.a.P0("Should never call `set()` on setterless property ('"), this.x.q, "')"));
    }

    public Object J(Object obj, Object obj2) throws IOException {
        I(obj, obj2);
        throw null;
    }

    public SettableBeanProperty O(PropertyName propertyName) {
        return new SetterlessProperty(this, propertyName);
    }

    public SettableBeanProperty Q(i iVar) {
        return new SetterlessProperty(this, this.a2, iVar);
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
        return new SetterlessProperty(this, dVar, iVar);
    }

    public AnnotatedMember a() {
        return this.h2;
    }

    public final void k(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
            if (this.b2 == null) {
                try {
                    Object invoke = this.i2.invoke(obj, (Object[]) null);
                    if (invoke != null) {
                        this.a2.e(jsonParser, deserializationContext, invoke);
                        return;
                    }
                    deserializationContext.n(this.y, String.format("Problem deserializing 'setterless' property '%s': get method returned null", new Object[]{this.x.q}));
                    throw null;
                } catch (Exception e) {
                    f.J(e);
                    f.K(e);
                    Throwable s = f.s(e);
                    throw new JsonMappingException((Closeable) jsonParser, f.j(s), s);
                }
            } else {
                deserializationContext.n(this.y, String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", new Object[]{this.x.q}));
                throw null;
            }
        }
    }

    public Object l(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        k(jsonParser, deserializationContext, obj);
        return obj;
    }

    public void n(DeserializationConfig deserializationConfig) {
        this.h2.g(deserializationConfig.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, d<?> dVar, i iVar) {
        super(setterlessProperty, dVar, iVar);
        this.h2 = setterlessProperty.h2;
        this.i2 = setterlessProperty.i2;
    }

    public SetterlessProperty(SetterlessProperty setterlessProperty, PropertyName propertyName) {
        super(setterlessProperty, propertyName);
        this.h2 = setterlessProperty.h2;
        this.i2 = setterlessProperty.i2;
    }
}
