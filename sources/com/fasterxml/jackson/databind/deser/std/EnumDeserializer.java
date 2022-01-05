package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import i0.f.a.c.d;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

@a
public class EnumDeserializer extends StdScalarDeserializer<Object> implements c {
    public static final /* synthetic */ int x = 0;
    public final Enum<?> Y1;
    public final CompactStringObjectMap Z1;
    public CompactStringObjectMap a2;
    public final Boolean b2;
    public Object[] y;

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super((StdScalarDeserializer<?>) enumDeserializer);
        this.Z1 = enumDeserializer.Z1;
        this.y = enumDeserializer.y;
        this.Y1 = enumDeserializer.Y1;
        this.b2 = bool;
    }

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Class<?> cls = this.d;
        JsonFormat.Feature feature = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES;
        JsonFormat.Value t02 = t0(deserializationContext, beanProperty, cls);
        Boolean b = t02 != null ? t02.b(feature) : null;
        if (b == null) {
            b = this.b2;
        }
        if (Objects.equals(this.b2, b)) {
            return this;
        }
        return new EnumDeserializer(this, b);
    }

    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            return y0(jsonParser, deserializationContext, jsonParser.Z());
        }
        if (jsonParser.y0(JsonToken.VALUE_NUMBER_INT)) {
            int I = jsonParser.I();
            CoercionAction w = deserializationContext.w(LogicalType.Enum, this.d, CoercionInputShape.Integer);
            if (w == CoercionAction.Fail) {
                if (!deserializationContext.d0(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                    x(deserializationContext, w, this.d, Integer.valueOf(I), i0.d.a.a.a.g0("Integer value (", I, ")"));
                } else {
                    deserializationContext.Y(this.d, Integer.valueOf(I), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
                    throw null;
                }
            }
            int ordinal = w.ordinal();
            if (ordinal == 2) {
                return null;
            }
            if (ordinal == 3) {
                return this.Y1;
            }
            if (I >= 0) {
                Object[] objArr = this.y;
                if (I < objArr.length) {
                    return objArr[I];
                }
            }
            if (this.Y1 != null && deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.Y1;
            }
            if (deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            deserializationContext.Y(this.d, Integer.valueOf(I), "index value outside legal index range [0..%s]", Integer.valueOf(this.y.length - 1));
            throw null;
        } else if (jsonParser.I0()) {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        } else if (jsonParser.y0(JsonToken.START_ARRAY)) {
            return I(jsonParser, deserializationContext);
        } else {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        return this.Y1;
    }

    public boolean p() {
        return true;
    }

    public LogicalType q() {
        return LogicalType.Enum;
    }

    public Object y0(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        CompactStringObjectMap compactStringObjectMap;
        String trim;
        char charAt;
        Object obj;
        CoercionAction coercionAction;
        if (deserializationContext.d0(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
            compactStringObjectMap = this.a2;
            if (compactStringObjectMap == null) {
                synchronized (this) {
                    compactStringObjectMap = EnumResolver.d(deserializationContext.q, this.d).c();
                }
                this.a2 = compactStringObjectMap;
            }
        } else {
            compactStringObjectMap = this.Z1;
        }
        Object a = compactStringObjectMap.a(str);
        if (a != null || ((trim = str.trim()) != str && (a = compactStringObjectMap.a(trim)) != null)) {
            return a;
        }
        String trim2 = trim.trim();
        if (trim2.isEmpty()) {
            if (trim.isEmpty()) {
                coercionAction = deserializationContext.w(q(), n(), CoercionInputShape.EmptyString);
                x(deserializationContext, coercionAction, this.d, trim, "empty String (\"\")");
            } else {
                coercionAction = deserializationContext.x(q(), n(), CoercionAction.Fail);
                x(deserializationContext, coercionAction, this.d, trim, "blank String (all whitespace)");
            }
            int ordinal = coercionAction.ordinal();
            if (ordinal == 1 || ordinal == 3) {
                return this.Y1;
            }
            return null;
        }
        if (Boolean.TRUE.equals(this.b2)) {
            int length = compactStringObjectMap.x.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = compactStringObjectMap.x[i];
                    if (obj2 != null && ((String) obj2).equalsIgnoreCase(trim2)) {
                        obj = compactStringObjectMap.x[i + 1];
                        break;
                    }
                    i += 2;
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                return obj;
            }
        } else if (!deserializationContext.d0(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && (charAt = trim2.charAt(0)) >= '0' && charAt <= '9') {
            try {
                int parseInt = Integer.parseInt(trim2);
                if (!deserializationContext.e0(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    deserializationContext.Z(this.d, trim2, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                    throw null;
                } else if (parseInt >= 0) {
                    Object[] objArr = this.y;
                    if (parseInt < objArr.length) {
                        return objArr[parseInt];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this.Y1 != null && deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this.Y1;
        }
        if (deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        Class<?> cls = this.d;
        Object[] objArr2 = new Object[1];
        int length2 = compactStringObjectMap.x.length;
        ArrayList arrayList = new ArrayList(length2 >> 2);
        for (int i2 = 0; i2 < length2; i2 += 2) {
            Object obj3 = compactStringObjectMap.x[i2];
            if (obj3 != null) {
                arrayList.add((String) obj3);
            }
        }
        objArr2[0] = arrayList;
        deserializationContext.Z(cls, trim2, "not one of the values accepted for Enum class: %s", objArr2);
        throw null;
    }

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super((Class<?>) enumResolver.c);
        this.Z1 = enumResolver.c();
        this.y = enumResolver.d;
        this.Y1 = enumResolver.x;
        this.b2 = bool;
    }
}
