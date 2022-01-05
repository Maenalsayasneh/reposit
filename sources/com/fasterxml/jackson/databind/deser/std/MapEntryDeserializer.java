package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.c.d;
import i0.f.a.c.h;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

@a
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements c {
    public final h a2;
    public final d<Object> b2;
    public final b c2;

    public MapEntryDeserializer(JavaType javaType, h hVar, d<Object> dVar, b bVar) {
        super(javaType, (i) null, (Boolean) null);
        if (javaType.g() == 2) {
            this.a2 = hVar;
            this.b2 = dVar;
            this.c2 = bVar;
            return;
        }
        throw new IllegalArgumentException("Missing generic type information for " + javaType);
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d dVar;
        h hVar = this.a2;
        if (hVar == null) {
            hVar = deserializationContext.A(this.x.f(0), beanProperty);
        } else if (hVar instanceof i0.f.a.c.l.d) {
            hVar = ((i0.f.a.c.l.d) hVar).a(deserializationContext, beanProperty);
        }
        d s02 = s0(deserializationContext, beanProperty, this.b2);
        JavaType f = this.x.f(1);
        if (s02 == null) {
            dVar = deserializationContext.y(f, beanProperty);
        } else {
            dVar = deserializationContext.R(s02, beanProperty, f);
        }
        b bVar = this.c2;
        if (bVar != null) {
            bVar = bVar.f(beanProperty);
        }
        if (this.a2 == hVar && this.b2 == dVar && this.c2 == bVar) {
            return this;
        }
        return new MapEntryDeserializer(this, hVar, (d<Object>) dVar, bVar);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Object obj;
        JsonToken i = jsonParser.i();
        if (i == JsonToken.START_OBJECT) {
            i = jsonParser.M0();
        } else if (!(i == JsonToken.FIELD_NAME || i == JsonToken.END_OBJECT)) {
            if (i == JsonToken.START_ARRAY) {
                return (Map.Entry) I(jsonParser, deserializationContext);
            }
            JavaType javaType = this.q;
            if (javaType == null) {
                javaType = deserializationContext.q(this.d);
            }
            deserializationContext.T(javaType, jsonParser);
            throw null;
        }
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        if (i == jsonToken) {
            h hVar = this.a2;
            d<Object> dVar = this.b2;
            b bVar = this.c2;
            String f = jsonParser.f();
            Object a = hVar.a(f, deserializationContext);
            try {
                if (jsonParser.M0() == JsonToken.VALUE_NULL) {
                    obj = dVar.b(deserializationContext);
                } else if (bVar == null) {
                    obj = dVar.d(jsonParser, deserializationContext);
                } else {
                    obj = dVar.f(jsonParser, deserializationContext, bVar);
                }
                JsonToken M0 = jsonParser.M0();
                if (M0 == JsonToken.END_OBJECT) {
                    return new AbstractMap.SimpleEntry(a, obj);
                }
                if (M0 == jsonToken) {
                    deserializationContext.m0(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.f());
                    throw null;
                }
                deserializationContext.m0(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + M0, new Object[0]);
                throw null;
            } catch (Exception e) {
                z0(deserializationContext, e, Map.Entry.class, f);
                throw null;
            }
        } else if (i == JsonToken.END_OBJECT) {
            deserializationContext.m0(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            throw null;
        } else {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.d(jsonParser, deserializationContext);
    }

    public LogicalType q() {
        return LogicalType.Map;
    }

    public d<Object> y0() {
        return this.b2;
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, h hVar, d<Object> dVar, b bVar) {
        super((ContainerDeserializerBase<?>) mapEntryDeserializer, mapEntryDeserializer.y, mapEntryDeserializer.Z1);
        this.a2 = hVar;
        this.b2 = dVar;
        this.c2 = bVar;
    }
}
