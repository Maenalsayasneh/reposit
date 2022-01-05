package i0.f.a.c;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.util.Collection;

/* compiled from: JsonDeserializer */
public abstract class d<T> implements i {

    /* compiled from: JsonDeserializer */
    public static abstract class a extends d<Object> {
    }

    public T b(DeserializationContext deserializationContext) throws JsonMappingException {
        return null;
    }

    public abstract T d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException;

    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        deserializationContext.M(this);
        return d(jsonParser, deserializationContext);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.b(jsonParser, deserializationContext);
    }

    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        deserializationContext.M(this);
        return f(jsonParser, deserializationContext, bVar);
    }

    public SettableBeanProperty h(String str) {
        StringBuilder T0 = i0.d.a.a.a.T0("Cannot handle managed/back reference '", str, "': type: value deserializer of type ");
        T0.append(getClass().getName());
        T0.append(" does not support them");
        throw new IllegalArgumentException(T0.toString());
    }

    public AccessPattern i() {
        return AccessPattern.DYNAMIC;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return b(deserializationContext);
    }

    public Collection<Object> l() {
        return null;
    }

    public ObjectIdReader m() {
        return null;
    }

    public Class<?> n() {
        return null;
    }

    public boolean p() {
        return this instanceof AbstractDeserializer;
    }

    public LogicalType q() {
        return null;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return null;
    }

    public d<T> w(NameTransformer nameTransformer) {
        return this;
    }
}
