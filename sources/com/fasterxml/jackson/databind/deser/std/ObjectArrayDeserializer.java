package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.d;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import i0.f.a.c.t.n;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;

@a
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements c {
    public final boolean a2;
    public final Class<?> b2;
    public d<Object> c2;
    public final b d2;
    public final Object[] e2;

    public ObjectArrayDeserializer(JavaType javaType, d<Object> dVar, b bVar) {
        super(javaType, (i) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> cls = arrayType.c2.c;
        this.b2 = cls;
        this.a2 = cls == Object.class;
        this.c2 = dVar;
        this.d2 = bVar;
        this.e2 = (Object[]) arrayType.d2;
    }

    public Object[] A0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        Object[] objArr;
        Boolean bool = this.Z1;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.d0(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
                b bVar = this.d2;
                if (bVar == null) {
                    obj = this.c2.d(jsonParser, deserializationContext);
                } else {
                    obj = this.c2.f(jsonParser, deserializationContext, bVar);
                }
            } else if (this.Y1) {
                return this.e2;
            } else {
                obj = this.y.b(deserializationContext);
            }
            if (this.a2) {
                objArr = new Object[1];
            } else {
                objArr = (Object[]) Array.newInstance(this.b2, 1);
            }
            objArr[0] = obj;
            return objArr;
        } else if (!jsonParser.y0(JsonToken.VALUE_STRING)) {
            deserializationContext.T(this.x, jsonParser);
            throw null;
        } else if (this.b2 != Byte.class) {
            return (Object[]) M(jsonParser, deserializationContext);
        } else {
            byte[] n = jsonParser.n(deserializationContext.I());
            Byte[] bArr = new Byte[n.length];
            int length = n.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.valueOf(n[i]);
            }
            return bArr;
        }
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d dVar;
        d dVar2 = this.c2;
        Class<?> cls = this.x.c;
        JsonFormat.Feature feature = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        JsonFormat.Value t02 = t0(deserializationContext, beanProperty, cls);
        Boolean b = t02 != null ? t02.b(feature) : null;
        d s02 = s0(deserializationContext, beanProperty, dVar2);
        JavaType l = this.x.l();
        if (s02 == null) {
            dVar = deserializationContext.y(l, beanProperty);
        } else {
            dVar = deserializationContext.R(s02, beanProperty, l);
        }
        d dVar3 = dVar;
        b bVar = this.d2;
        if (bVar != null) {
            bVar = bVar.f(beanProperty);
        }
        b bVar2 = bVar;
        i r02 = r0(deserializationContext, beanProperty, dVar3);
        if (Objects.equals(b, this.Z1) && r02 == this.y && dVar3 == this.c2 && bVar2 == this.d2) {
            return this;
        }
        return new ObjectArrayDeserializer(this, dVar3, bVar2, r02, b);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Object[] objArr;
        Object obj;
        if (!jsonParser.F0()) {
            return A0(jsonParser, deserializationContext);
        }
        n g02 = deserializationContext.g0();
        Object[] g = g02.g();
        b bVar = this.d2;
        int i = 0;
        while (true) {
            try {
                JsonToken M0 = jsonParser.M0();
                if (M0 == JsonToken.END_ARRAY) {
                    break;
                }
                if (M0 == JsonToken.VALUE_NULL) {
                    if (!this.Y1) {
                        obj = this.y.b(deserializationContext);
                    }
                } else if (bVar == null) {
                    obj = this.c2.d(jsonParser, deserializationContext);
                } else {
                    obj = this.c2.f(jsonParser, deserializationContext, bVar);
                }
                if (i >= g.length) {
                    g = g02.c(g);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    g[i] = obj;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    throw JsonMappingException.i(e, g, g02.c + i);
                }
            } catch (Exception e3) {
                e = e3;
                throw JsonMappingException.i(e, g, g02.c + i);
            }
        }
        if (this.a2) {
            objArr = g02.e(g, i);
        } else {
            objArr = g02.f(g, i, this.b2);
        }
        deserializationContext.r0(g02);
        return objArr;
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object[] objArr;
        Object obj2;
        Object[] objArr2 = (Object[]) obj;
        if (!jsonParser.F0()) {
            Object[] A0 = A0(jsonParser, deserializationContext);
            if (A0 == null) {
                return objArr2;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[(A0.length + length)];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            System.arraycopy(A0, 0, objArr3, length, A0.length);
            return objArr3;
        }
        n g02 = deserializationContext.g0();
        int length2 = objArr2.length;
        Object[] h = g02.h(objArr2, length2);
        b bVar = this.d2;
        while (true) {
            try {
                JsonToken M0 = jsonParser.M0();
                if (M0 == JsonToken.END_ARRAY) {
                    break;
                }
                if (M0 == JsonToken.VALUE_NULL) {
                    if (!this.Y1) {
                        obj2 = this.y.b(deserializationContext);
                    }
                } else if (bVar == null) {
                    obj2 = this.c2.d(jsonParser, deserializationContext);
                } else {
                    obj2 = this.c2.f(jsonParser, deserializationContext, bVar);
                }
                if (length2 >= h.length) {
                    h = g02.c(h);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    h[length2] = obj2;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.i(e, h, g02.c + length2);
                }
            } catch (Exception e3) {
                e = e3;
                throw JsonMappingException.i(e, h, g02.c + length2);
            }
        }
        if (this.a2) {
            objArr = g02.e(h, length2);
        } else {
            objArr = g02.f(h, length2, this.b2);
        }
        Object[] objArr4 = objArr;
        deserializationContext.r0(g02);
        return objArr4;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return (Object[]) bVar.c(jsonParser, deserializationContext);
    }

    public AccessPattern i() {
        return AccessPattern.CONSTANT;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return this.e2;
    }

    public boolean p() {
        return this.c2 == null && this.d2 == null;
    }

    public LogicalType q() {
        return LogicalType.Array;
    }

    public d<Object> y0() {
        return this.c2;
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, d<Object> dVar, b bVar, i iVar, Boolean bool) {
        super((ContainerDeserializerBase<?>) objectArrayDeserializer, iVar, bool);
        this.b2 = objectArrayDeserializer.b2;
        this.a2 = objectArrayDeserializer.a2;
        this.e2 = objectArrayDeserializer.e2;
        this.c2 = dVar;
        this.d2 = bVar;
    }
}
