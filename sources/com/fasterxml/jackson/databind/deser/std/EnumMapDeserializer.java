package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import i0.f.a.c.d;
import i0.f.a.c.h;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.l.j;
import i0.f.a.c.l.m.f;
import i0.f.a.c.l.m.g;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.util.EnumMap;

public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements c, j {
    public final Class<?> a2;
    public h b2;
    public d<Object> c2;
    public final b d2;
    public final ValueInstantiator e2;
    public d<Object> f2;
    public PropertyBasedCreator g2;

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, h hVar, d<?> dVar, b bVar, i iVar) {
        super(javaType, (i) null, (Boolean) null);
        this.a2 = ((MapLikeType) javaType).c2.c;
        this.b2 = null;
        this.c2 = dVar;
        this.d2 = bVar;
        this.e2 = valueInstantiator;
    }

    public EnumMap<?, ?> A0(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this.e2;
        if (valueInstantiator == null) {
            return new EnumMap<>(this.a2);
        }
        try {
            if (valueInstantiator.k()) {
                return (EnumMap) this.e2.C(deserializationContext);
            }
            deserializationContext.O(this.d, this.e2, (JsonParser) null, "no default constructor found", new Object[0]);
            throw null;
        } catch (IOException e) {
            f.H(deserializationContext, e);
            throw null;
        }
    }

    public EnumMap<?, ?> B0(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String str;
        Object obj;
        jsonParser.S0(enumMap);
        d<Object> dVar = this.c2;
        b bVar = this.d2;
        if (jsonParser.I0()) {
            str = jsonParser.K0();
        } else {
            JsonToken i = jsonParser.i();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (i == jsonToken) {
                str = jsonParser.f();
            } else if (i == JsonToken.END_OBJECT) {
                return enumMap;
            } else {
                deserializationContext.q0(this, jsonToken, (String) null, new Object[0]);
                throw null;
            }
        }
        while (str != null) {
            Enum enumR = (Enum) this.b2.a(str, deserializationContext);
            JsonToken M0 = jsonParser.M0();
            if (enumR != null) {
                try {
                    if (M0 == JsonToken.VALUE_NULL) {
                        if (!this.Y1) {
                            obj = this.y.b(deserializationContext);
                        }
                    } else if (bVar == null) {
                        obj = dVar.d(jsonParser, deserializationContext);
                    } else {
                        obj = dVar.f(jsonParser, deserializationContext, bVar);
                    }
                    enumMap.put(enumR, obj);
                } catch (Exception e) {
                    z0(deserializationContext, e, enumMap, str);
                    throw null;
                }
            } else if (deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                jsonParser.U0();
            } else {
                deserializationContext.Z(this.a2, str, "value not one of declared Enum instance names for %s", this.x.q());
                throw null;
            }
            str = jsonParser.K0();
        }
        return enumMap;
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d dVar;
        h hVar = this.b2;
        if (hVar == null) {
            hVar = deserializationContext.A(this.x.q(), beanProperty);
        }
        h hVar2 = hVar;
        d dVar2 = this.c2;
        JavaType l = this.x.l();
        if (dVar2 == null) {
            dVar = deserializationContext.y(l, beanProperty);
        } else {
            dVar = deserializationContext.R(dVar2, beanProperty, l);
        }
        d dVar3 = dVar;
        b bVar = this.d2;
        if (bVar != null) {
            bVar = bVar.f(beanProperty);
        }
        b bVar2 = bVar;
        i r02 = r0(deserializationContext, beanProperty, dVar3);
        if (hVar2 == this.b2 && r02 == this.y && dVar3 == this.c2 && bVar2 == this.d2) {
            return this;
        }
        return new EnumMapDeserializer(this, hVar2, dVar3, bVar2, r02);
    }

    public void c(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this.e2;
        if (valueInstantiator == null) {
            return;
        }
        if (valueInstantiator.l()) {
            JavaType J = this.e2.J(deserializationContext.q);
            if (J != null) {
                this.f2 = deserializationContext.y(J, (BeanProperty) null);
                return;
            }
            JavaType javaType = this.x;
            deserializationContext.n(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{javaType, this.e2.getClass().getName()}));
            throw null;
        } else if (this.e2.i()) {
            JavaType G = this.e2.G(deserializationContext.q);
            if (G != null) {
                this.f2 = deserializationContext.y(G, (BeanProperty) null);
                return;
            }
            JavaType javaType2 = this.x;
            deserializationContext.n(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{javaType2, this.e2.getClass().getName()}));
            throw null;
        } else if (this.e2.g()) {
            this.g2 = PropertyBasedCreator.b(deserializationContext, this.e2, this.e2.M(deserializationContext.q), deserializationContext.e0(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String str;
        Object obj;
        PropertyBasedCreator propertyBasedCreator = this.g2;
        if (propertyBasedCreator != null) {
            g gVar = new g(jsonParser, deserializationContext, propertyBasedCreator.a, (ObjectIdReader) null);
            if (jsonParser.I0()) {
                str = jsonParser.K0();
            } else {
                str = jsonParser.y0(JsonToken.FIELD_NAME) ? jsonParser.f() : null;
            }
            while (str != null) {
                JsonToken M0 = jsonParser.M0();
                SettableBeanProperty settableBeanProperty = propertyBasedCreator.c.get(str);
                if (settableBeanProperty == null) {
                    Enum enumR = (Enum) this.b2.a(str, deserializationContext);
                    if (enumR != null) {
                        try {
                            if (M0 != JsonToken.VALUE_NULL) {
                                b bVar = this.d2;
                                if (bVar == null) {
                                    obj = this.c2.d(jsonParser, deserializationContext);
                                } else {
                                    obj = this.c2.f(jsonParser, deserializationContext, bVar);
                                }
                            } else if (!this.Y1) {
                                obj = this.y.b(deserializationContext);
                            }
                            gVar.h = new f.b(gVar.h, obj, enumR);
                        } catch (Exception e) {
                            z0(deserializationContext, e, this.x.c, str);
                            throw null;
                        }
                    } else if (deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        jsonParser.M0();
                        jsonParser.U0();
                    } else {
                        deserializationContext.Z(this.a2, str, "value not one of declared Enum instance names for %s", this.x.q());
                        throw null;
                    }
                } else if (gVar.b(settableBeanProperty, settableBeanProperty.i(jsonParser, deserializationContext))) {
                    jsonParser.M0();
                    try {
                        EnumMap enumMap = (EnumMap) propertyBasedCreator.a(deserializationContext, gVar);
                        B0(jsonParser, deserializationContext, enumMap);
                        return enumMap;
                    } catch (Exception e3) {
                        z0(deserializationContext, e3, this.x.c, str);
                        throw null;
                    }
                }
                str = jsonParser.K0();
            }
            try {
                return (EnumMap) propertyBasedCreator.a(deserializationContext, gVar);
            } catch (Exception e4) {
                z0(deserializationContext, e4, this.x.c, str);
                throw null;
            }
        } else {
            d<Object> dVar = this.f2;
            if (dVar != null) {
                return (EnumMap) this.e2.E(deserializationContext, dVar.d(jsonParser, deserializationContext));
            }
            int k = jsonParser.k();
            if (!(k == 1 || k == 2)) {
                if (k == 3) {
                    return (EnumMap) I(jsonParser, deserializationContext);
                }
                if (k != 5) {
                    if (k == 6) {
                        return (EnumMap) M(jsonParser, deserializationContext);
                    }
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                }
            }
            EnumMap<?, ?> A0 = A0(deserializationContext);
            B0(jsonParser, deserializationContext, A0);
            return A0;
        }
    }

    public /* bridge */ /* synthetic */ Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        EnumMap enumMap = (EnumMap) obj;
        B0(jsonParser, deserializationContext, enumMap);
        return enumMap;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.d(jsonParser, deserializationContext);
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return A0(deserializationContext);
    }

    public boolean p() {
        return this.c2 == null && this.b2 == null && this.d2 == null;
    }

    public LogicalType q() {
        return LogicalType.Map;
    }

    public ValueInstantiator u0() {
        return this.e2;
    }

    public d<Object> y0() {
        return this.c2;
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, h hVar, d<?> dVar, b bVar, i iVar) {
        super((ContainerDeserializerBase<?>) enumMapDeserializer, iVar, enumMapDeserializer.Z1);
        this.a2 = enumMapDeserializer.a2;
        this.b2 = hVar;
        this.c2 = dVar;
        this.d2 = bVar;
        this.e2 = enumMapDeserializer.e2;
        this.f2 = enumMapDeserializer.f2;
        this.g2 = enumMapDeserializer.g2;
    }
}
