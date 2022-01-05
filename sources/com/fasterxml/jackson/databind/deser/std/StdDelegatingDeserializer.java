package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.d.a.a.a;
import i0.f.a.c.d;
import i0.f.a.c.l.c;
import i0.f.a.c.l.j;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import i0.f.a.c.t.g;
import java.io.IOException;

public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements c, j {
    public final d<Object> Y1;
    public final g<Object, T> x;
    public final JavaType y;

    public StdDelegatingDeserializer(g<?, T> gVar) {
        super((Class<?>) Object.class);
        this.x = gVar;
        this.y = null;
        this.Y1 = null;
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d<Object> dVar = this.Y1;
        if (dVar != null) {
            d<?> R = deserializationContext.R(dVar, beanProperty, this.y);
            if (R == this.Y1) {
                return this;
            }
            g<Object, T> gVar = this.x;
            JavaType javaType = this.y;
            f.M(StdDelegatingDeserializer.class, this, "withDelegate");
            return new StdDelegatingDeserializer(gVar, javaType, R);
        }
        JavaType b = this.x.b(deserializationContext.i());
        g<Object, T> gVar2 = this.x;
        d<Object> y2 = deserializationContext.y(b, beanProperty);
        f.M(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer(gVar2, b, y2);
    }

    public void c(DeserializationContext deserializationContext) throws JsonMappingException {
        d<Object> dVar = this.Y1;
        if (dVar != null && (dVar instanceof j)) {
            ((j) dVar).c(deserializationContext);
        }
    }

    public T d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object d = this.Y1.d(jsonParser, deserializationContext);
        if (d == null) {
            return null;
        }
        return this.x.a(d);
    }

    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this.y.c.isAssignableFrom(obj.getClass())) {
            return this.Y1.e(jsonParser, deserializationContext, obj);
        }
        throw new UnsupportedOperationException(String.format(a.c0(obj, a.P0("Cannot update object of type %s (using deserializer for type %s)")), new Object[]{this.y}));
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        Object d = this.Y1.d(jsonParser, deserializationContext);
        if (d == null) {
            return null;
        }
        return this.x.a(d);
    }

    public Class<?> n() {
        return this.Y1.n();
    }

    public LogicalType q() {
        return this.Y1.q();
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return this.Y1.v(deserializationConfig);
    }

    public StdDelegatingDeserializer(g<Object, T> gVar, JavaType javaType, d<?> dVar) {
        super(javaType);
        this.x = gVar;
        this.y = javaType;
        this.Y1 = dVar;
    }
}
