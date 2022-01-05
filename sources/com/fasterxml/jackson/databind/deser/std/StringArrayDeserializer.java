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
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import i0.f.a.c.t.n;
import java.io.IOException;
import java.util.Objects;

@a
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements c {
    public static final String[] x = new String[0];
    public static final StringArrayDeserializer y = new StringArrayDeserializer();
    public d<String> Y1;
    public final i Z1;
    public final Boolean a2;
    public final boolean b2;

    public StringArrayDeserializer() {
        super((Class<?>) String[].class);
        this.Y1 = null;
        this.Z1 = null;
        this.a2 = null;
        this.b2 = NullsConstantProvider.a((i) null);
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        d dVar;
        d s02 = s0(deserializationContext, beanProperty, this.Y1);
        JavaType q = deserializationContext.q(String.class);
        if (s02 == null) {
            dVar = deserializationContext.y(q, beanProperty);
        } else {
            dVar = deserializationContext.R(s02, beanProperty, q);
        }
        JsonFormat.Feature feature = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        JsonFormat.Value t02 = t0(deserializationContext, beanProperty, String[].class);
        Boolean b = t02 != null ? t02.b(feature) : null;
        i r02 = r0(deserializationContext, beanProperty, dVar);
        if (dVar != null && f.y(dVar)) {
            dVar = null;
        }
        if (this.Y1 == dVar && Objects.equals(this.a2, b) && this.Z1 == r02) {
            return this;
        }
        return new StringArrayDeserializer(dVar, r02, b);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        if (!jsonParser.F0()) {
            return z0(jsonParser, deserializationContext);
        }
        if (this.Y1 != null) {
            return y0(jsonParser, deserializationContext, (String[]) null);
        }
        n g02 = deserializationContext.g0();
        Object[] g = g02.g();
        int i = 0;
        while (true) {
            try {
                String L0 = jsonParser.L0();
                if (L0 == null) {
                    JsonToken i2 = jsonParser.i();
                    if (i2 == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) g02.f(g, i, String.class);
                        deserializationContext.r0(g02);
                        return strArr;
                    } else if (i2 != JsonToken.VALUE_NULL) {
                        L0 = m0(jsonParser, deserializationContext);
                    } else if (!this.b2) {
                        L0 = (String) this.Z1.b(deserializationContext);
                    }
                }
                if (i >= g.length) {
                    g = g02.c(g);
                    i = 0;
                }
                int i3 = i + 1;
                try {
                    g[i] = L0;
                    i = i3;
                } catch (Exception e) {
                    e = e;
                    i = i3;
                    throw JsonMappingException.i(e, g, g02.c + i);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.i(e, g, g02.c + i);
            }
        }
    }

    public Object e(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String[] strArr = (String[]) obj;
        if (!jsonParser.F0()) {
            String[] z0 = z0(jsonParser, deserializationContext);
            if (z0 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[(z0.length + length)];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(z0, 0, strArr2, length, z0.length);
            return strArr2;
        } else if (this.Y1 != null) {
            return y0(jsonParser, deserializationContext, strArr);
        } else {
            n g02 = deserializationContext.g0();
            int length2 = strArr.length;
            Object[] h = g02.h(strArr, length2);
            while (true) {
                try {
                    String L0 = jsonParser.L0();
                    if (L0 == null) {
                        JsonToken i = jsonParser.i();
                        if (i == JsonToken.END_ARRAY) {
                            String[] strArr3 = (String[]) g02.f(h, length2, String.class);
                            deserializationContext.r0(g02);
                            return strArr3;
                        } else if (i != JsonToken.VALUE_NULL) {
                            L0 = m0(jsonParser, deserializationContext);
                        } else if (this.b2) {
                            return x;
                        } else {
                            L0 = (String) this.Z1.b(deserializationContext);
                        }
                    }
                    if (length2 >= h.length) {
                        h = g02.c(h);
                        length2 = 0;
                    }
                    int i2 = length2 + 1;
                    try {
                        h[length2] = L0;
                        length2 = i2;
                    } catch (Exception e) {
                        e = e;
                        length2 = i2;
                        throw JsonMappingException.i(e, h, g02.c + length2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, h, g02.c + length2);
                }
            }
        }
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.c(jsonParser, deserializationContext);
    }

    public AccessPattern i() {
        return AccessPattern.CONSTANT;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return x;
    }

    public LogicalType q() {
        return LogicalType.Array;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public final String[] y0(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        Object[] objArr;
        int i;
        String str;
        Class<String> cls = String.class;
        n g02 = deserializationContext.g0();
        if (strArr == null) {
            objArr = g02.g();
            i = 0;
        } else {
            i = strArr.length;
            objArr = g02.h(strArr, i);
        }
        d<String> dVar = this.Y1;
        while (true) {
            try {
                if (jsonParser.L0() == null) {
                    JsonToken i2 = jsonParser.i();
                    if (i2 == JsonToken.END_ARRAY) {
                        String[] strArr2 = (String[]) g02.f(objArr, i, cls);
                        deserializationContext.r0(g02);
                        return strArr2;
                    } else if (i2 != JsonToken.VALUE_NULL) {
                        str = dVar.d(jsonParser, deserializationContext);
                    } else if (!this.b2) {
                        str = (String) this.Z1.b(deserializationContext);
                    }
                } else {
                    str = dVar.d(jsonParser, deserializationContext);
                }
                if (i >= objArr.length) {
                    objArr = g02.c(objArr);
                    i = 0;
                }
                int i3 = i + 1;
                try {
                    objArr[i] = str;
                    i = i3;
                } catch (Exception e) {
                    e = e;
                    i = i3;
                    throw JsonMappingException.i(e, cls, i);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.i(e, cls, i);
            }
        }
    }

    public final String[] z0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        Boolean bool = this.a2;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.d0(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.y0(JsonToken.VALUE_NULL)) {
                str = (String) this.Z1.b(deserializationContext);
            } else {
                str = m0(jsonParser, deserializationContext);
            }
            return new String[]{str};
        } else if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            return (String[]) M(jsonParser, deserializationContext);
        } else {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }
    }

    public StringArrayDeserializer(d<?> dVar, i iVar, Boolean bool) {
        super((Class<?>) String[].class);
        this.Y1 = dVar;
        this.Z1 = iVar;
        this.a2 = bool;
        this.b2 = NullsConstantProvider.a(iVar);
    }
}
