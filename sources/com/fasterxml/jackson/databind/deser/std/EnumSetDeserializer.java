package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.d;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Objects;

public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements c {
    public final i Y1;
    public final boolean Z1;
    public final Boolean a2;
    public final JavaType x;
    public d<Enum<?>> y;

    public EnumSetDeserializer(JavaType javaType, d<?> dVar) {
        super((Class<?>) EnumSet.class);
        this.x = javaType;
        if (javaType.I()) {
            this.y = null;
            this.a2 = null;
            this.Y1 = null;
            this.Z1 = false;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d dVar;
        JsonFormat.Feature feature = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        JsonFormat.Value t02 = t0(deserializationContext, beanProperty, EnumSet.class);
        Boolean b = t02 != null ? t02.b(feature) : null;
        d dVar2 = this.y;
        if (dVar2 == null) {
            dVar = deserializationContext.y(this.x, beanProperty);
        } else {
            dVar = deserializationContext.R(dVar2, beanProperty, this.x);
        }
        i r02 = r0(deserializationContext, beanProperty, dVar);
        if (Objects.equals(this.a2, b) && this.y == dVar && this.Y1 == dVar) {
            return this;
        }
        return new EnumSetDeserializer(this, dVar, r02, b);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        EnumSet<E> noneOf = EnumSet.noneOf(this.x.c);
        if (!jsonParser.F0()) {
            z0(jsonParser, deserializationContext, noneOf);
        } else {
            y0(jsonParser, deserializationContext, noneOf);
        }
        return noneOf;
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        EnumSet enumSet = (EnumSet) obj;
        if (!jsonParser.F0()) {
            z0(jsonParser, deserializationContext, enumSet);
        } else {
            y0(jsonParser, deserializationContext, enumSet);
        }
        return enumSet;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException, JsonProcessingException {
        return bVar.c(jsonParser, deserializationContext);
    }

    public AccessPattern i() {
        return AccessPattern.DYNAMIC;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return EnumSet.noneOf(this.x.c);
    }

    public boolean p() {
        return this.x.q == null;
    }

    public LogicalType q() {
        return LogicalType.Collection;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public final EnumSet<?> y0(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Enum enumR;
        while (true) {
            try {
                JsonToken M0 = jsonParser.M0();
                if (M0 == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (M0 != JsonToken.VALUE_NULL) {
                    enumR = this.y.d(jsonParser, deserializationContext);
                } else if (!this.Z1) {
                    enumR = (Enum) this.Y1.b(deserializationContext);
                }
                if (enumR != null) {
                    enumSet.add(enumR);
                }
            } catch (Exception e) {
                throw JsonMappingException.i(e, enumSet, enumSet.size());
            }
        }
    }

    public EnumSet<?> z0(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Boolean bool = this.a2;
        if (!(bool == Boolean.TRUE || (bool == null && deserializationContext.d0(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            deserializationContext.V(EnumSet.class, jsonParser);
            throw null;
        } else if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
            try {
                Enum d = this.y.d(jsonParser, deserializationContext);
                if (d != null) {
                    enumSet.add(d);
                }
                return enumSet;
            } catch (Exception e) {
                throw JsonMappingException.i(e, enumSet, enumSet.size());
            }
        } else {
            deserializationContext.T(this.x, jsonParser);
            throw null;
        }
    }

    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, d<?> dVar, i iVar, Boolean bool) {
        super((StdDeserializer<?>) enumSetDeserializer);
        this.x = enumSetDeserializer.x;
        this.y = dVar;
        this.Y1 = iVar;
        this.Z1 = NullsConstantProvider.a(iVar);
        this.a2 = bool;
    }
}
