package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.d.a.a.a;
import i0.f.a.b.i.e;
import i0.f.a.c.d;
import i0.f.a.c.l.i;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import i0.f.a.c.t.g;
import i0.f.a.c.t.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public abstract class StdDeserializer<T> extends d<T> implements Serializable {
    public static final int c = (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask());
    public final Class<?> d;
    public final JavaType q;

    static {
        DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask();
        DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();
    }

    public StdDeserializer(Class<?> cls) {
        this.d = cls;
        this.q = null;
    }

    public static final boolean R(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public CoercionAction A(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction w = deserializationContext.w(LogicalType.Integer, cls, CoercionInputShape.Float);
        if (w == CoercionAction.Fail) {
            Number N = jsonParser.N();
            StringBuilder P0 = a.P0("Floating-point value (");
            P0.append(jsonParser.Z());
            P0.append(")");
            x(deserializationContext, w, cls, N, P0.toString());
        }
        return w;
    }

    public CoercionAction C(DeserializationContext deserializationContext, String str, LogicalType logicalType, Class<?> cls) throws IOException {
        if (str.isEmpty()) {
            CoercionAction w = deserializationContext.w(logicalType, cls, CoercionInputShape.EmptyString);
            x(deserializationContext, w, cls, str, "empty String (\"\")");
            return w;
        } else if (R(str)) {
            CoercionAction x = deserializationContext.x(logicalType, cls, CoercionAction.Fail);
            x(deserializationContext, x, cls, str, "blank String (all whitespace)");
            return x;
        } else if (deserializationContext.c0(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.TryConvert;
        } else {
            CoercionAction w2 = deserializationContext.w(logicalType, cls, CoercionInputShape.String);
            if (w2 != CoercionAction.Fail) {
                return w2;
            }
            deserializationContext.m0(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, H());
            throw null;
        }
    }

    public boolean E(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        if (!Q(str)) {
            return false;
        }
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.e0(mapperFeature)) {
            return true;
        }
        n0(deserializationContext, true, mapperFeature, "String \"null\"");
        throw null;
    }

    public Boolean F(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction w = deserializationContext.w(LogicalType.Boolean, cls, CoercionInputShape.Integer);
        int ordinal = w.ordinal();
        if (ordinal == 0) {
            Number N = jsonParser.N();
            StringBuilder P0 = a.P0("Integer value (");
            P0.append(jsonParser.Z());
            P0.append(")");
            x(deserializationContext, w, cls, N, P0.toString());
            return Boolean.FALSE;
        } else if (ordinal == 2) {
            return null;
        } else {
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
            boolean z = true;
            if (jsonParser.M() != JsonParser.NumberType.INT) {
                return Boolean.valueOf(!"0".equals(jsonParser.Z()));
            }
            if (jsonParser.I() == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public Object G(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i = deserializationContext.x;
        if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i)) {
            return jsonParser.l();
        }
        if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(i)) {
            return Long.valueOf(jsonParser.J());
        }
        return jsonParser.N();
    }

    public String H() {
        String str;
        JavaType v02 = v0();
        boolean z = false;
        if (v02 == null || v02.Q()) {
            Class<?> n = n();
            if (n.isArray() || Collection.class.isAssignableFrom(n) || Map.class.isAssignableFrom(n)) {
                z = true;
            }
            str = f.n(n);
        } else {
            if (v02.G() || v02.d()) {
                z = true;
            }
            str = f.t(v02);
        }
        if (z) {
            return a.n0("element of ", str);
        }
        return a.n0(str, " value");
    }

    public T I(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction N = N(deserializationContext);
        boolean d0 = deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (d0 || N != CoercionAction.Fail) {
            JsonToken M0 = jsonParser.M0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (M0 == jsonToken) {
                int ordinal = N.ordinal();
                if (ordinal == 1 || ordinal == 2) {
                    return b(deserializationContext);
                }
                if (ordinal == 3) {
                    return k(deserializationContext);
                }
            } else if (d0) {
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                if (jsonParser.y0(jsonToken2)) {
                    String format = String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", new Object[]{f.E(this.d), jsonToken2, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"});
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.U(javaType, jsonParser.i(), jsonParser, format, new Object[0]);
                    throw null;
                }
                T d2 = d(jsonParser, deserializationContext);
                if (jsonParser.M0() == jsonToken) {
                    return d2;
                }
                w0(deserializationContext);
                throw null;
            }
        }
        JavaType javaType2 = this.q;
        if (javaType2 == null) {
            javaType2 = deserializationContext.q(this.d);
        }
        deserializationContext.U(javaType2, JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
        throw null;
    }

    public Object J(DeserializationContext deserializationContext, CoercionAction coercionAction, Class cls) throws IOException {
        int ordinal = coercionAction.ordinal();
        if (ordinal == 0) {
            x(deserializationContext, coercionAction, cls, "", "empty String (\"\")");
            return null;
        } else if (ordinal != 3) {
            return null;
        } else {
            return k(deserializationContext);
        }
    }

    public T M(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator u02 = u0();
        Class<?> n = n();
        String r02 = jsonParser.r0();
        if (u02 != null && u02.h()) {
            return u02.z(deserializationContext, r02);
        }
        if (r02.isEmpty()) {
            return J(deserializationContext, deserializationContext.w(q(), n, CoercionInputShape.EmptyString), n);
        }
        if (R(r02)) {
            return J(deserializationContext, deserializationContext.x(q(), n, CoercionAction.Fail), n);
        }
        if (u02 != null) {
            r02 = r02.trim();
            if (u02.e() && deserializationContext.w(LogicalType.Integer, Integer.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return u02.w(deserializationContext, g0(deserializationContext, r02));
            }
            if (u02.f() && deserializationContext.w(LogicalType.Integer, Long.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return u02.x(deserializationContext, k0(deserializationContext, r02));
            }
            if (u02.c() && deserializationContext.w(LogicalType.Boolean, Boolean.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                String trim = r02.trim();
                if ("true".equals(trim)) {
                    return u02.q(deserializationContext, true);
                }
                if ("false".equals(trim)) {
                    return u02.q(deserializationContext, false);
                }
            }
        }
        deserializationContext.O(n, u02, deserializationContext.Z1, "no String-argument constructor/factory method to deserialize from String value ('%s')", r02);
        throw null;
    }

    public CoercionAction N(DeserializationContext deserializationContext) {
        return deserializationContext.w(q(), n(), CoercionInputShape.EmptyArray);
    }

    public final i O(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, d<?> dVar) throws JsonMappingException {
        if (nulls == Nulls.FAIL) {
            if (beanProperty == null) {
                return NullsFailProvider.a(deserializationContext.q(dVar.n()));
            }
            return new NullsFailProvider(beanProperty.b(), beanProperty.getType());
        } else if (nulls == Nulls.AS_EMPTY) {
            if (dVar == null) {
                return null;
            }
            if (!(dVar instanceof BeanDeserializerBase) || ((BeanDeserializerBase) dVar).Z1.k()) {
                AccessPattern i = dVar.i();
                if (i == AccessPattern.ALWAYS_NULL) {
                    return NullsConstantProvider.d;
                }
                if (i != AccessPattern.CONSTANT) {
                    return new NullsAsEmptyProvider(dVar);
                }
                Object k = dVar.k(deserializationContext);
                if (k == null) {
                    return NullsConstantProvider.d;
                }
                return new NullsConstantProvider(k);
            }
            JavaType type = beanProperty.getType();
            deserializationContext.n(type, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{type}));
            throw null;
        } else if (nulls == Nulls.SKIP) {
            return NullsConstantProvider.c;
        } else {
            return null;
        }
    }

    public boolean Q(String str) {
        return "null".equals(str);
    }

    public boolean T(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'f') {
            return "false".equals(str);
        }
        if (charAt != 'F') {
            return false;
        }
        if ("FALSE".equals(str) || "False".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean U(String str) {
        return "NaN".equals(str);
    }

    public final boolean V(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean W(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public boolean X(String str) {
        char charAt = str.charAt(0);
        if (charAt == 't') {
            return "true".equals(str);
        }
        if (charAt != 'T') {
            return false;
        }
        if ("TRUE".equals(str) || "True".equals(str)) {
            return true;
        }
        return false;
    }

    public final Boolean Z(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        int k = jsonParser.k();
        if (k == 1) {
            deserializationContext.V(cls, jsonParser);
            throw null;
        } else if (k == 3) {
            return (Boolean) I(jsonParser, deserializationContext);
        } else {
            if (k == 6) {
                String Z = jsonParser.Z();
                CoercionAction C = C(deserializationContext, Z, LogicalType.Boolean, cls);
                if (C == CoercionAction.AsNull) {
                    return null;
                }
                if (C == CoercionAction.AsEmpty) {
                    return Boolean.FALSE;
                }
                String trim = Z.trim();
                int length = trim.length();
                if (length == 4) {
                    if (X(trim)) {
                        return Boolean.TRUE;
                    }
                } else if (length == 5 && T(trim)) {
                    return Boolean.FALSE;
                }
                if (E(deserializationContext, trim)) {
                    return null;
                }
                deserializationContext.Z(cls, trim, "only \"true\" or \"false\" recognized", new Object[0]);
                throw null;
            } else if (k == 7) {
                return F(jsonParser, deserializationContext, cls);
            } else {
                switch (k) {
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    default:
                        deserializationContext.V(cls, jsonParser);
                        throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a0(com.fasterxml.jackson.core.JsonParser r7, com.fasterxml.jackson.databind.DeserializationContext r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r7.k()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0088
            r3 = 3
            if (r0 == r3) goto L_0x006f
            r3 = 6
            r4 = 0
            if (r0 == r3) goto L_0x0028
            r3 = 7
            if (r0 == r3) goto L_0x001b
            switch(r0) {
                case 9: goto L_0x001a;
                case 10: goto L_0x0019;
                case 11: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0082
        L_0x0016:
            r6.p0(r8)
        L_0x0019:
            return r4
        L_0x001a:
            return r2
        L_0x001b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Boolean r7 = r6.F(r7, r8, r1)
            boolean r7 = r0.equals(r7)
            return r7
        L_0x0028:
            java.lang.String r7 = r7.Z()
            com.fasterxml.jackson.databind.type.LogicalType r0 = com.fasterxml.jackson.databind.type.LogicalType.Boolean
            java.lang.Class r3 = java.lang.Boolean.TYPE
            com.fasterxml.jackson.databind.cfg.CoercionAction r0 = r6.C(r8, r7, r0, r3)
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
            if (r0 != r5) goto L_0x003c
            r6.p0(r8)
            return r4
        L_0x003c:
            com.fasterxml.jackson.databind.cfg.CoercionAction r5 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
            if (r0 != r5) goto L_0x0041
            return r4
        L_0x0041:
            java.lang.String r7 = r7.trim()
            int r0 = r7.length()
            r5 = 4
            if (r0 != r5) goto L_0x0053
            boolean r0 = r6.X(r7)
            if (r0 == 0) goto L_0x005d
            return r2
        L_0x0053:
            r2 = 5
            if (r0 != r2) goto L_0x005d
            boolean r0 = r6.T(r7)
            if (r0 == 0) goto L_0x005d
            return r4
        L_0x005d:
            boolean r0 = r6.Q(r7)
            if (r0 == 0) goto L_0x0067
            r6.q0(r8, r7)
            return r4
        L_0x0067:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            r8.Z(r3, r7, r2, r0)
            throw r1
        L_0x006f:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r8.d0(r0)
            if (r0 == 0) goto L_0x0082
            r7.M0()
            boolean r0 = r6.a0(r7, r8)
            r6.o0(r7, r8)
            return r0
        L_0x0082:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r8.V(r0, r7)
            throw r1
        L_0x0088:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r8.V(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.a0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):boolean");
    }

    public final byte b0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        boolean z = true;
        if (k != 1) {
            if (k != 3) {
                if (k == 11) {
                    p0(deserializationContext);
                    return 0;
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, LogicalType.Integer, Byte.TYPE);
                    if (C == CoercionAction.AsNull || C == CoercionAction.AsEmpty) {
                        return 0;
                    }
                    String trim = Z.trim();
                    if (Q(trim)) {
                        q0(deserializationContext, trim);
                        return 0;
                    }
                    try {
                        int d2 = e.d(trim);
                        if (d2 >= -128 && d2 <= 255) {
                            z = false;
                        }
                        if (!z) {
                            return (byte) d2;
                        }
                        deserializationContext.Z(this.d, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid `byte` value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7) {
                    return jsonParser.q();
                } else {
                    if (k == 8) {
                        CoercionAction A = A(jsonParser, deserializationContext, Byte.TYPE);
                        if (A == CoercionAction.AsNull || A == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.q();
                    }
                }
            } else if (deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.M0();
                byte b0 = b0(jsonParser, deserializationContext);
                o0(jsonParser, deserializationContext);
                return b0;
            }
            deserializationContext.T(deserializationContext.q(Byte.TYPE), jsonParser);
            throw null;
        }
        deserializationContext.V(Byte.TYPE, jsonParser);
        throw null;
    }

    public Date c0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        if (k == 1) {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        } else if (k == 3) {
            CoercionAction N = N(deserializationContext);
            boolean d0 = deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (d0 || N != CoercionAction.Fail) {
                if (jsonParser.M0() == JsonToken.END_ARRAY) {
                    int ordinal = N.ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        return (Date) b(deserializationContext);
                    }
                    if (ordinal == 3) {
                        return (Date) k(deserializationContext);
                    }
                } else if (d0) {
                    Date c0 = c0(jsonParser, deserializationContext);
                    o0(jsonParser, deserializationContext);
                    return c0;
                }
            }
            DeserializationContext deserializationContext2 = deserializationContext;
            deserializationContext2.U(deserializationContext.q(this.d), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
            throw null;
        } else if (k == 11) {
            return (Date) b(deserializationContext);
        } else {
            if (k == 6) {
                String trim = jsonParser.Z().trim();
                try {
                    if (trim.isEmpty()) {
                        if (C(deserializationContext, trim, q(), n()).ordinal() != 3) {
                            return null;
                        }
                        return new Date(0);
                    } else if (Q(trim)) {
                        return null;
                    } else {
                        return deserializationContext.h0(trim);
                    }
                } catch (IllegalArgumentException e) {
                    deserializationContext.Z(this.d, trim, "not a valid representation (error: %s)", f.j(e));
                    throw null;
                }
            } else if (k == 7) {
                try {
                    return new Date(jsonParser.J());
                } catch (JsonParseException | InputCoercionException unused) {
                    deserializationContext.Y(this.d, jsonParser.N(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0]);
                    throw null;
                }
            } else {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            }
        }
    }

    public final double d0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        if (k != 1) {
            if (k != 3) {
                if (k == 11) {
                    p0(deserializationContext);
                    return 0.0d;
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    Double y = y(Z);
                    if (y != null) {
                        return y.doubleValue();
                    }
                    CoercionAction C = C(deserializationContext, Z, LogicalType.Integer, Double.TYPE);
                    if (C == CoercionAction.AsNull || C == CoercionAction.AsEmpty) {
                        return 0.0d;
                    }
                    String trim = Z.trim();
                    if (Q(trim)) {
                        q0(deserializationContext, trim);
                        return 0.0d;
                    }
                    try {
                        if ("2.2250738585072012e-308".equals(trim)) {
                            return Double.MIN_NORMAL;
                        }
                        return Double.parseDouble(trim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(Double.TYPE, trim, "not a valid `double` value (as String to convert)", new Object[0]);
                        throw null;
                    }
                } else if (k == 7 || k == 8) {
                    return jsonParser.F();
                }
            } else if (deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.M0();
                double d0 = d0(jsonParser, deserializationContext);
                o0(jsonParser, deserializationContext);
                return d0;
            }
            deserializationContext.V(Double.TYPE, jsonParser);
            throw null;
        }
        deserializationContext.V(Double.TYPE, jsonParser);
        throw null;
    }

    public final float e0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        if (k != 1) {
            if (k != 3) {
                if (k == 11) {
                    p0(deserializationContext);
                    return 0.0f;
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    Float z = z(Z);
                    if (z != null) {
                        return z.floatValue();
                    }
                    CoercionAction C = C(deserializationContext, Z, LogicalType.Integer, Float.TYPE);
                    if (C == CoercionAction.AsNull || C == CoercionAction.AsEmpty) {
                        return 0.0f;
                    }
                    String trim = Z.trim();
                    if (Q(trim)) {
                        q0(deserializationContext, trim);
                        return 0.0f;
                    }
                    try {
                        return Float.parseFloat(trim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(Float.TYPE, trim, "not a valid `float` value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7 || k == 8) {
                    return jsonParser.H();
                }
            } else if (deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.M0();
                float e0 = e0(jsonParser, deserializationContext);
                o0(jsonParser, deserializationContext);
                return e0;
            }
            deserializationContext.V(Float.TYPE, jsonParser);
            throw null;
        }
        deserializationContext.V(Float.TYPE, jsonParser);
        throw null;
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
        return bVar.b(jsonParser, deserializationContext);
    }

    public final int f0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        if (k != 1) {
            if (k != 3) {
                if (k == 11) {
                    p0(deserializationContext);
                    return 0;
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, LogicalType.Integer, Integer.TYPE);
                    if (C == CoercionAction.AsNull || C == CoercionAction.AsEmpty) {
                        return 0;
                    }
                    String trim = Z.trim();
                    if (!Q(trim)) {
                        return g0(deserializationContext, trim);
                    }
                    q0(deserializationContext, trim);
                    return 0;
                } else if (k == 7) {
                    return jsonParser.I();
                } else {
                    if (k == 8) {
                        CoercionAction A = A(jsonParser, deserializationContext, Integer.TYPE);
                        if (A == CoercionAction.AsNull || A == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.i0();
                    }
                }
            } else if (deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.M0();
                int f0 = f0(jsonParser, deserializationContext);
                o0(jsonParser, deserializationContext);
                return f0;
            }
            deserializationContext.V(Integer.TYPE, jsonParser);
            throw null;
        }
        deserializationContext.V(Integer.TYPE, jsonParser);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[Catch:{ IllegalArgumentException -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[Catch:{ IllegalArgumentException -> 0x0049 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g0(com.fasterxml.jackson.databind.DeserializationContext r9, java.lang.String r10) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r2 = r10.length()     // Catch:{ IllegalArgumentException -> 0x0049 }
            r3 = 9
            if (r2 <= r3) goto L_0x0044
            long r2 = java.lang.Long.parseLong(r10)     // Catch:{ IllegalArgumentException -> 0x0049 }
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1
            if (r4 < 0) goto L_0x0020
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r4 = r1
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            if (r4 != 0) goto L_0x0025
            int r9 = (int) r2     // Catch:{ IllegalArgumentException -> 0x0049 }
            return r9
        L_0x0025:
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.lang.String r3 = "Overflow: numeric value (%s) out of range of int (%d -%d)"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalArgumentException -> 0x0049 }
            r4[r1] = r10     // Catch:{ IllegalArgumentException -> 0x0049 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x0049 }
            r4[r5] = r6     // Catch:{ IllegalArgumentException -> 0x0049 }
            r5 = 2
            r6 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x0049 }
            r4[r5] = r6     // Catch:{ IllegalArgumentException -> 0x0049 }
            r9.Z(r2, r10, r3, r4)     // Catch:{ IllegalArgumentException -> 0x0049 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0049 }
        L_0x0044:
            int r9 = i0.f.a.b.i.e.d(r10)     // Catch:{ IllegalArgumentException -> 0x0049 }
            return r9
        L_0x0049:
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "not a valid `int` value"
            r9.Z(r2, r10, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.g0(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String):int");
    }

    public final Integer h0(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        int k = jsonParser.k();
        if (k == 1) {
            deserializationContext.V(cls, jsonParser);
            throw null;
        } else if (k == 3) {
            return (Integer) I(jsonParser, deserializationContext);
        } else {
            if (k == 11) {
                return (Integer) b(deserializationContext);
            }
            if (k == 6) {
                String Z = jsonParser.Z();
                CoercionAction C = C(deserializationContext, Z, q(), this.d);
                if (C == CoercionAction.AsNull) {
                    return (Integer) b(deserializationContext);
                }
                if (C == CoercionAction.AsEmpty) {
                    return (Integer) k(deserializationContext);
                }
                String trim = Z.trim();
                if (E(deserializationContext, trim)) {
                    return (Integer) b(deserializationContext);
                }
                return Integer.valueOf(g0(deserializationContext, trim));
            } else if (k == 7) {
                return Integer.valueOf(jsonParser.I());
            } else {
                if (k != 8) {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                }
                CoercionAction A = A(jsonParser, deserializationContext, cls);
                if (A == CoercionAction.AsNull) {
                    return (Integer) b(deserializationContext);
                }
                if (A == CoercionAction.AsEmpty) {
                    return (Integer) k(deserializationContext);
                }
                return Integer.valueOf(jsonParser.i0());
            }
        }
    }

    public final Long i0(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        int k = jsonParser.k();
        if (k == 1) {
            deserializationContext.V(cls, jsonParser);
            throw null;
        } else if (k == 3) {
            return (Long) I(jsonParser, deserializationContext);
        } else {
            if (k == 11) {
                return (Long) b(deserializationContext);
            }
            if (k == 6) {
                String Z = jsonParser.Z();
                CoercionAction C = C(deserializationContext, Z, q(), this.d);
                if (C == CoercionAction.AsNull) {
                    return (Long) b(deserializationContext);
                }
                if (C == CoercionAction.AsEmpty) {
                    return (Long) k(deserializationContext);
                }
                String trim = Z.trim();
                if (E(deserializationContext, trim)) {
                    return (Long) b(deserializationContext);
                }
                return Long.valueOf(k0(deserializationContext, trim));
            } else if (k == 7) {
                return Long.valueOf(jsonParser.J());
            } else {
                if (k != 8) {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                }
                CoercionAction A = A(jsonParser, deserializationContext, cls);
                if (A == CoercionAction.AsNull) {
                    return (Long) b(deserializationContext);
                }
                if (A == CoercionAction.AsEmpty) {
                    return (Long) k(deserializationContext);
                }
                return Long.valueOf(jsonParser.n0());
            }
        }
    }

    public final long j0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        if (k != 1) {
            if (k != 3) {
                if (k == 11) {
                    p0(deserializationContext);
                    return 0;
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, LogicalType.Integer, Long.TYPE);
                    if (C == CoercionAction.AsNull || C == CoercionAction.AsEmpty) {
                        return 0;
                    }
                    String trim = Z.trim();
                    if (!Q(trim)) {
                        return k0(deserializationContext, trim);
                    }
                    q0(deserializationContext, trim);
                    return 0;
                } else if (k == 7) {
                    return jsonParser.J();
                } else {
                    if (k == 8) {
                        CoercionAction A = A(jsonParser, deserializationContext, Long.TYPE);
                        if (A == CoercionAction.AsNull || A == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.n0();
                    }
                }
            } else if (deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.M0();
                long j02 = j0(jsonParser, deserializationContext);
                o0(jsonParser, deserializationContext);
                return j02;
            }
            deserializationContext.V(Long.TYPE, jsonParser);
            throw null;
        }
        deserializationContext.V(Long.TYPE, jsonParser);
        throw null;
    }

    public final long k0(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return e.f(str);
        } catch (IllegalArgumentException unused) {
            deserializationContext.Z(Long.TYPE, str, "not a valid `long` value", new Object[0]);
            throw null;
        }
    }

    public final short l0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int k = jsonParser.k();
        boolean z = true;
        if (k != 1) {
            if (k != 3) {
                if (k == 11) {
                    p0(deserializationContext);
                    return 0;
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, LogicalType.Integer, Short.TYPE);
                    if (C == CoercionAction.AsNull || C == CoercionAction.AsEmpty) {
                        return 0;
                    }
                    String trim = Z.trim();
                    if (Q(trim)) {
                        q0(deserializationContext, trim);
                        return 0;
                    }
                    try {
                        int d2 = e.d(trim);
                        if (d2 >= -32768 && d2 <= 32767) {
                            z = false;
                        }
                        if (!z) {
                            return (short) d2;
                        }
                        deserializationContext.Z(Short.TYPE, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(Short.TYPE, trim, "not a valid `short` value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7) {
                    return jsonParser.Y();
                } else {
                    if (k == 8) {
                        CoercionAction A = A(jsonParser, deserializationContext, Short.TYPE);
                        if (A == CoercionAction.AsNull || A == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.Y();
                    }
                }
            } else if (deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jsonParser.M0();
                short l02 = l0(jsonParser, deserializationContext);
                o0(jsonParser, deserializationContext);
                return l02;
            }
            deserializationContext.T(deserializationContext.q(Short.TYPE), jsonParser);
            throw null;
        }
        deserializationContext.V(Short.TYPE, jsonParser);
        throw null;
    }

    public final String m0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            return jsonParser.Z();
        }
        if (jsonParser.y0(JsonToken.VALUE_EMBEDDED_OBJECT)) {
            Object G = jsonParser.G();
            if (G instanceof byte[]) {
                return deserializationContext.I().g((byte[]) G, false);
            }
            if (G == null) {
                return null;
            }
            return G.toString();
        } else if (!jsonParser.y0(JsonToken.START_OBJECT)) {
            String r02 = jsonParser.r0();
            if (r02 != null) {
                return r02;
            }
            deserializationContext.V(String.class, jsonParser);
            throw null;
        } else {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }
    }

    public Class<?> n() {
        return this.d;
    }

    public void n0(DeserializationContext deserializationContext, boolean z, Enum<?> enumR, String str) throws JsonMappingException {
        deserializationContext.m0(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, H(), z ? "enable" : "disable", enumR.getDeclaringClass().getSimpleName(), enumR.name());
        throw null;
    }

    public void o0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.M0() != JsonToken.END_ARRAY) {
            w0(deserializationContext);
            throw null;
        }
    }

    public final void p0(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.d0(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.m0(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", H());
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.fasterxml.jackson.databind.DeserializationFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.fasterxml.jackson.databind.MapperFeature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.String r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r6.e0(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000c
            r1 = r3
            goto L_0x0015
        L_0x000c:
            com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r1 = r6.d0(r0)
            if (r1 == 0) goto L_0x002d
            r1 = r2
        L_0x0015:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x001e
            java.lang.String r7 = "empty String (\"\")"
            goto L_0x0028
        L_0x001e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            java.lang.String r7 = "String \"%s\""
            java.lang.String r7 = java.lang.String.format(r7, r3)
        L_0x0028:
            r5.n0(r6, r1, r0, r7)
            r6 = 0
            throw r6
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.q0(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String):void");
    }

    public i r0(DeserializationContext deserializationContext, BeanProperty beanProperty, d<?> dVar) throws JsonMappingException {
        Nulls nulls = beanProperty != null ? beanProperty.f().c2 : null;
        if (nulls == Nulls.SKIP) {
            return NullsConstantProvider.c;
        }
        if (nulls != Nulls.FAIL) {
            i O = O(deserializationContext, beanProperty, nulls, dVar);
            return O != null ? O : dVar;
        } else if (beanProperty == null) {
            JavaType q2 = deserializationContext.q(dVar.n());
            if (q2.G()) {
                q2 = q2.l();
            }
            return NullsFailProvider.a(q2);
        } else {
            return new NullsFailProvider(beanProperty.b(), beanProperty.getType().l());
        }
    }

    public d<?> s0(DeserializationContext deserializationContext, BeanProperty beanProperty, d<?> dVar) throws JsonMappingException {
        AnnotatedMember a;
        Object h;
        AnnotationIntrospector G = deserializationContext.G();
        if (!Y(G, beanProperty) || (a = beanProperty.a()) == null || (h = G.h(a)) == null) {
            return dVar;
        }
        g<Object, Object> g = deserializationContext.g(beanProperty.a(), h);
        JavaType b = g.b(deserializationContext.i());
        d<Object> dVar2 = dVar;
        if (dVar == null) {
            dVar2 = deserializationContext.y(b, beanProperty);
        }
        return new StdDelegatingDeserializer(g, b, dVar2);
    }

    public JsonFormat.Value t0(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.e(deserializationContext.q, cls);
        }
        return deserializationContext.q.h(cls);
    }

    public ValueInstantiator u0() {
        return null;
    }

    public JavaType v0() {
        return this.q;
    }

    public void w0(DeserializationContext deserializationContext) throws IOException {
        deserializationContext.q0(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", n().getName());
        throw null;
    }

    public CoercionAction x(DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, Object obj, String str) throws IOException {
        if (coercionAction != CoercionAction.Fail) {
            return coercionAction;
        }
        throw new InvalidFormatException(deserializationContext.Z1, deserializationContext.b("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, H()), obj, cls);
    }

    public void x0(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        Class<?> cls;
        if (obj == null) {
            obj = n();
        }
        for (h hVar = deserializationContext.q.g2; hVar != null; hVar = hVar.b) {
            Objects.requireNonNull((i0.f.a.c.l.e) hVar.a);
        }
        if (!deserializationContext.d0(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.U0();
            return;
        }
        Collection<Object> l = l();
        JsonParser jsonParser2 = deserializationContext.Z1;
        int i = UnrecognizedPropertyException.Y1;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Class<?> cls2 = cls;
        UnrecognizedPropertyException unrecognizedPropertyException = new UnrecognizedPropertyException(jsonParser2, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", new Object[]{str, cls2.getName()}), jsonParser2.w(), cls2, str, l);
        unrecognizedPropertyException.g(obj, str);
        throw unrecognizedPropertyException;
    }

    public Double y(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && U(str)) {
                    return Double.valueOf(Double.NaN);
                }
                return null;
            } else if (W(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            } else {
                return null;
            }
        } else if (V(str)) {
            return Double.valueOf(Double.NEGATIVE_INFINITY);
        } else {
            return null;
        }
    }

    public Float z(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && U(str)) {
                    return Float.valueOf(Float.NaN);
                }
                return null;
            } else if (W(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            } else {
                return null;
            }
        } else if (V(str)) {
            return Float.valueOf(Float.NEGATIVE_INFINITY);
        } else {
            return null;
        }
    }

    public StdDeserializer(JavaType javaType) {
        Class cls;
        if (javaType == null) {
            cls = Object.class;
        } else {
            cls = javaType.c;
        }
        this.d = cls;
        this.q = javaType;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this.d = stdDeserializer.d;
        this.q = stdDeserializer.q;
    }
}
