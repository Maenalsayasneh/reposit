package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.d;
import i0.f.a.c.l.c;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements c {
    public final b Y1;
    public final d<Object> Z1;
    public final JavaType x;
    public final ValueInstantiator y;

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, b bVar, d<?> dVar) {
        super(javaType);
        this.y = valueInstantiator;
        this.x = javaType;
        this.Z1 = dVar;
        this.Y1 = bVar;
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d dVar;
        d dVar2 = this.Z1;
        if (dVar2 == null) {
            dVar = deserializationContext.y(this.x.a(), beanProperty);
        } else {
            dVar = deserializationContext.R(dVar2, beanProperty, this.x.a());
        }
        b bVar = this.Y1;
        if (bVar != null) {
            bVar = bVar.f(beanProperty);
        }
        if (dVar == this.Z1 && bVar == this.Y1) {
            return this;
        }
        AtomicReferenceDeserializer atomicReferenceDeserializer = (AtomicReferenceDeserializer) this;
        return new AtomicReferenceDeserializer(atomicReferenceDeserializer.x, atomicReferenceDeserializer.y, bVar, dVar);
    }

    public T d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        ValueInstantiator valueInstantiator = this.y;
        if (valueInstantiator != null) {
            return e(jsonParser, deserializationContext, valueInstantiator.C(deserializationContext));
        }
        b bVar = this.Y1;
        if (bVar == null) {
            obj = this.Z1.d(jsonParser, deserializationContext);
        } else {
            obj = this.Z1.f(jsonParser, deserializationContext, bVar);
        }
        return new AtomicReference(obj);
    }

    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        Object obj;
        Object obj2;
        if (this.Z1.v(deserializationContext.q).equals(Boolean.FALSE) || this.Y1 != null) {
            b bVar = this.Y1;
            if (bVar == null) {
                obj = this.Z1.d(jsonParser, deserializationContext);
            } else {
                obj = this.Z1.f(jsonParser, deserializationContext, bVar);
            }
        } else {
            Object obj3 = ((AtomicReference) t).get();
            if (obj3 == null) {
                b bVar2 = this.Y1;
                if (bVar2 == null) {
                    obj2 = this.Z1.d(jsonParser, deserializationContext);
                } else {
                    obj2 = this.Z1.f(jsonParser, deserializationContext, bVar2);
                }
                return new AtomicReference(obj2);
            }
            obj = this.Z1.e(jsonParser, deserializationContext, obj3);
        }
        T t2 = (AtomicReference) t;
        t2.set(obj);
        return t2;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return b(deserializationContext);
        }
        b bVar2 = this.Y1;
        if (bVar2 == null) {
            return d(jsonParser, deserializationContext);
        }
        return new AtomicReference(bVar2.b(jsonParser, deserializationContext));
    }

    public AccessPattern i() {
        return AccessPattern.DYNAMIC;
    }

    public LogicalType q() {
        d<Object> dVar = this.Z1;
        if (dVar != null) {
            return dVar.q();
        }
        return null;
    }

    public ValueInstantiator u0() {
        return this.y;
    }

    public JavaType v0() {
        return this.x;
    }
}
