package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.f.a.b.i.e;
import i0.f.a.c.j.a;
import i0.f.a.c.p.b;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class NumberDeserializers {
    public static final HashSet<String> a = new HashSet<>();

    @a
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer x = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            int k = jsonParser.k();
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (BigDecimal) I(jsonParser, deserializationContext);
            } else {
                if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, q(), n());
                    if (C == CoercionAction.AsNull) {
                        return null;
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return BigDecimal.ZERO;
                    }
                    String trim = Z.trim();
                    if (Q(trim)) {
                        return null;
                    }
                    try {
                        return new BigDecimal(trim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid representation", new Object[0]);
                        throw null;
                    }
                } else if (k == 7 || k == 8) {
                    return jsonParser.E();
                } else {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                }
            }
        }

        public Object k(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        public final LogicalType q() {
            return LogicalType.Float;
        }
    }

    @a
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer x = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.D0()) {
                return jsonParser.l();
            }
            int k = jsonParser.k();
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (BigInteger) I(jsonParser, deserializationContext);
            } else {
                if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, q(), n());
                    if (C == CoercionAction.AsNull) {
                        return null;
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return BigInteger.ZERO;
                    }
                    String trim = Z.trim();
                    if (Q(trim)) {
                        return null;
                    }
                    try {
                        return new BigInteger(trim);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid representation", new Object[0]);
                        throw null;
                    }
                } else if (k != 8) {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                } else {
                    CoercionAction A = A(jsonParser, deserializationContext, this.d);
                    if (A == CoercionAction.AsNull) {
                        return null;
                    }
                    if (A == CoercionAction.AsEmpty) {
                        return BigInteger.ZERO;
                    }
                    return jsonParser.E().toBigInteger();
                }
            }
        }

        public Object k(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        public final LogicalType q() {
            return LogicalType.Integer;
        }
    }

    @a
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        public static final BooleanDeserializer a2 = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        public static final BooleanDeserializer b2 = new BooleanDeserializer(Boolean.class, (Boolean) null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            JsonToken i = jsonParser.i();
            if (i == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (i == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this.Z1) {
                return Boolean.valueOf(a0(jsonParser, deserializationContext));
            }
            return Z(jsonParser, deserializationContext, this.d);
        }

        public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
            JsonToken i = jsonParser.i();
            if (i == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (i == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this.Z1) {
                return Boolean.valueOf(a0(jsonParser, deserializationContext));
            }
            return Z(jsonParser, deserializationContext, this.d);
        }
    }

    @a
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        public static final ByteDeserializer a2 = new ByteDeserializer(Byte.TYPE, (byte) 0);
        public static final ByteDeserializer b2 = new ByteDeserializer(Byte.class, (Byte) null);

        public ByteDeserializer(Class<Byte> cls, Byte b) {
            super(cls, LogicalType.Integer, b, (byte) 0);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.D0()) {
                return Byte.valueOf(jsonParser.q());
            }
            if (this.Z1) {
                return Byte.valueOf(b0(jsonParser, deserializationContext));
            }
            int k = jsonParser.k();
            boolean z = true;
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (Byte) I(jsonParser, deserializationContext);
            } else {
                if (k == 11) {
                    return (Byte) b(deserializationContext);
                }
                if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, q(), n());
                    if (C == CoercionAction.AsNull) {
                        return (Byte) b(deserializationContext);
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return (Byte) this.Y1;
                    }
                    String trim = Z.trim();
                    if (E(deserializationContext, trim)) {
                        return (Byte) b(deserializationContext);
                    }
                    try {
                        int d = e.d(trim);
                        if (d >= -128 && d <= 255) {
                            z = false;
                        }
                        if (!z) {
                            return Byte.valueOf((byte) d);
                        }
                        deserializationContext.Z(this.d, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid Byte value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7) {
                    return Byte.valueOf(jsonParser.q());
                } else {
                    if (k != 8) {
                        JavaType javaType = this.q;
                        if (javaType == null) {
                            javaType = deserializationContext.q(this.d);
                        }
                        deserializationContext.T(javaType, jsonParser);
                        throw null;
                    }
                    CoercionAction A = A(jsonParser, deserializationContext, this.d);
                    if (A == CoercionAction.AsNull) {
                        return (Byte) b(deserializationContext);
                    }
                    if (A == CoercionAction.AsEmpty) {
                        return (Byte) this.Y1;
                    }
                    return Byte.valueOf(jsonParser.q());
                }
            }
        }
    }

    @a
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        public static final CharacterDeserializer a2 = new CharacterDeserializer(Character.TYPE, 0);
        public static final CharacterDeserializer b2 = new CharacterDeserializer(Character.class, (Character) null);

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, 0);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            int k = jsonParser.k();
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (Character) I(jsonParser, deserializationContext);
            } else {
                if (k == 11) {
                    if (this.Z1) {
                        p0(deserializationContext);
                    }
                    return (Character) b(deserializationContext);
                } else if (k == 6) {
                    String Z = jsonParser.Z();
                    if (Z.length() == 1) {
                        return Character.valueOf(Z.charAt(0));
                    }
                    CoercionAction C = C(deserializationContext, Z, q(), n());
                    if (C == CoercionAction.AsNull) {
                        return (Character) b(deserializationContext);
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return (Character) this.Y1;
                    }
                    String trim = Z.trim();
                    if (E(deserializationContext, trim)) {
                        return (Character) b(deserializationContext);
                    }
                    deserializationContext.Z(this.d, trim, "Expected either Integer value code or 1-character String", new Object[0]);
                    throw null;
                } else if (k != 7) {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                } else {
                    CoercionAction w = deserializationContext.w(this.x, this.d, CoercionInputShape.Integer);
                    int ordinal = w.ordinal();
                    if (ordinal == 0) {
                        Class<?> cls = this.d;
                        Number N = jsonParser.N();
                        StringBuilder P0 = i0.d.a.a.a.P0("Integer value (");
                        P0.append(jsonParser.Z());
                        P0.append(")");
                        x(deserializationContext, w, cls, N, P0.toString());
                    } else if (ordinal != 2) {
                        if (ordinal == 3) {
                            return (Character) this.Y1;
                        }
                        int I = jsonParser.I();
                        if (I >= 0 && I <= 65535) {
                            return Character.valueOf((char) I);
                        }
                        deserializationContext.Y(this.d, Integer.valueOf(I), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                        throw null;
                    }
                    return (Character) b(deserializationContext);
                }
            }
        }
    }

    @a
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        public static final DoubleDeserializer a2 = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        public static final DoubleDeserializer b2 = new DoubleDeserializer(Double.class, (Double) null);

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, LogicalType.Float, d, Double.valueOf(0.0d));
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.y0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.F());
            }
            if (this.Z1) {
                return Double.valueOf(d0(jsonParser, deserializationContext));
            }
            return y0(jsonParser, deserializationContext);
        }

        public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
            if (jsonParser.y0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.F());
            }
            if (this.Z1) {
                return Double.valueOf(d0(jsonParser, deserializationContext));
            }
            return y0(jsonParser, deserializationContext);
        }

        public final Double y0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            double d;
            int k = jsonParser.k();
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (Double) I(jsonParser, deserializationContext);
            } else {
                if (k == 11) {
                    return (Double) b(deserializationContext);
                }
                if (k == 6) {
                    String Z = jsonParser.Z();
                    Double y = y(Z);
                    if (y != null) {
                        return y;
                    }
                    CoercionAction C = C(deserializationContext, Z, this.x, this.d);
                    if (C == CoercionAction.AsNull) {
                        return (Double) b(deserializationContext);
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return (Double) this.Y1;
                    }
                    String trim = Z.trim();
                    if (E(deserializationContext, trim)) {
                        return (Double) b(deserializationContext);
                    }
                    try {
                        if ("2.2250738585072012e-308".equals(trim)) {
                            d = Double.MIN_NORMAL;
                        } else {
                            d = Double.parseDouble(trim);
                        }
                        return Double.valueOf(d);
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid `Double` value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7 || k == 8) {
                    return Double.valueOf(jsonParser.F());
                } else {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                }
            }
        }
    }

    @a
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        public static final FloatDeserializer a2 = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        public static final FloatDeserializer b2 = new FloatDeserializer(Float.class, (Float) null);

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, LogicalType.Float, f, Float.valueOf(0.0f));
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.y0(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.H());
            }
            if (this.Z1) {
                return Float.valueOf(e0(jsonParser, deserializationContext));
            }
            int k = jsonParser.k();
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (Float) I(jsonParser, deserializationContext);
            } else {
                if (k == 11) {
                    return (Float) b(deserializationContext);
                }
                if (k == 6) {
                    String Z = jsonParser.Z();
                    Float z = z(Z);
                    if (z != null) {
                        return z;
                    }
                    CoercionAction C = C(deserializationContext, Z, q(), n());
                    if (C == CoercionAction.AsNull) {
                        return (Float) b(deserializationContext);
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return (Float) this.Y1;
                    }
                    String trim = Z.trim();
                    if (E(deserializationContext, trim)) {
                        return (Float) b(deserializationContext);
                    }
                    try {
                        return Float.valueOf(Float.parseFloat(trim));
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid `Float` value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7 || k == 8) {
                    return Float.valueOf(jsonParser.H());
                } else {
                    JavaType javaType = this.q;
                    if (javaType == null) {
                        javaType = deserializationContext.q(this.d);
                    }
                    deserializationContext.T(javaType, jsonParser);
                    throw null;
                }
            }
        }
    }

    @a
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        public static final IntegerDeserializer a2 = new IntegerDeserializer(Integer.TYPE, 0);
        public static final IntegerDeserializer b2 = new IntegerDeserializer(Integer.class, (Integer) null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.D0()) {
                return Integer.valueOf(jsonParser.I());
            }
            if (this.Z1) {
                return Integer.valueOf(f0(jsonParser, deserializationContext));
            }
            return h0(jsonParser, deserializationContext, Integer.class);
        }

        public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
            if (jsonParser.D0()) {
                return Integer.valueOf(jsonParser.I());
            }
            if (this.Z1) {
                return Integer.valueOf(f0(jsonParser, deserializationContext));
            }
            return h0(jsonParser, deserializationContext, Integer.class);
        }

        public boolean p() {
            return true;
        }
    }

    @a
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        public static final LongDeserializer a2 = new LongDeserializer(Long.TYPE, 0L);
        public static final LongDeserializer b2 = new LongDeserializer(Long.class, (Long) null);

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, LogicalType.Integer, l, 0L);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.D0()) {
                return Long.valueOf(jsonParser.J());
            }
            if (this.Z1) {
                return Long.valueOf(j0(jsonParser, deserializationContext));
            }
            return i0(jsonParser, deserializationContext, Long.class);
        }

        public boolean p() {
            return true;
        }
    }

    @a
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer x = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x00c7 A[EDGE_INSN: B:100:0x00c7->B:71:0x00c7 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6 A[Catch:{ IllegalArgumentException -> 0x010f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = r8.k()
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L_0x011e
                r3 = 3
                if (r0 == r3) goto L_0x0119
                r3 = 6
                if (r0 == r3) goto L_0x004e
                r1 = 7
                if (r0 == r1) goto L_0x003c
                r1 = 8
                if (r0 == r1) goto L_0x0024
                com.fasterxml.jackson.databind.JavaType r0 = r7.q
                if (r0 == 0) goto L_0x001a
                goto L_0x0020
            L_0x001a:
                java.lang.Class<?> r0 = r7.d
                com.fasterxml.jackson.databind.JavaType r0 = r9.q(r0)
            L_0x0020:
                r9.T(r0, r8)
                throw r2
            L_0x0024:
                com.fasterxml.jackson.databind.DeserializationFeature r0 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS
                boolean r9 = r9.d0(r0)
                if (r9 == 0) goto L_0x0037
                boolean r9 = r8.J0()
                if (r9 != 0) goto L_0x0037
                java.math.BigDecimal r8 = r8.E()
                return r8
            L_0x0037:
                java.lang.Number r8 = r8.N()
                return r8
            L_0x003c:
                int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.c
                boolean r0 = r9.a0(r0)
                if (r0 == 0) goto L_0x0049
                java.lang.Object r8 = r7.G(r8, r9)
                return r8
            L_0x0049:
                java.lang.Number r8 = r8.N()
                return r8
            L_0x004e:
                java.lang.String r8 = r8.Z()
                com.fasterxml.jackson.databind.type.LogicalType r0 = r7.q()
                java.lang.Class r3 = r7.n()
                com.fasterxml.jackson.databind.cfg.CoercionAction r0 = r7.C(r9, r8, r0, r3)
                com.fasterxml.jackson.databind.cfg.CoercionAction r3 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsNull
                if (r0 != r3) goto L_0x0063
                return r2
            L_0x0063:
                com.fasterxml.jackson.databind.cfg.CoercionAction r3 = com.fasterxml.jackson.databind.cfg.CoercionAction.AsEmpty
                if (r0 != r3) goto L_0x0068
                return r2
            L_0x0068:
                java.lang.String r8 = r8.trim()
                boolean r0 = r7.Q(r8)
                if (r0 == 0) goto L_0x0073
                return r2
            L_0x0073:
                boolean r0 = r7.W(r8)
                if (r0 == 0) goto L_0x0080
                r8 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                return r8
            L_0x0080:
                boolean r0 = r7.V(r8)
                if (r0 == 0) goto L_0x008d
                r8 = -4503599627370496(0xfff0000000000000, double:-Infinity)
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                return r8
            L_0x008d:
                boolean r0 = r7.U(r8)
                if (r0 == 0) goto L_0x009a
                r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                return r8
            L_0x009a:
                r0 = 0
                int r3 = r8.length()     // Catch:{ IllegalArgumentException -> 0x010f }
                if (r3 <= 0) goto L_0x00c6
                char r4 = r8.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x010f }
                r5 = 45
                if (r4 == r5) goto L_0x00b0
                r5 = 43
                if (r4 != r5) goto L_0x00ae
                goto L_0x00b0
            L_0x00ae:
                r4 = r0
                goto L_0x00b4
            L_0x00b0:
                if (r3 != r1) goto L_0x00b3
                goto L_0x00c6
            L_0x00b3:
                r4 = r1
            L_0x00b4:
                if (r4 >= r3) goto L_0x00c7
                char r5 = r8.charAt(r4)     // Catch:{ IllegalArgumentException -> 0x010f }
                r6 = 57
                if (r5 > r6) goto L_0x00c6
                r6 = 48
                if (r5 >= r6) goto L_0x00c3
                goto L_0x00c6
            L_0x00c3:
                int r4 = r4 + 1
                goto L_0x00b4
            L_0x00c6:
                r1 = r0
            L_0x00c7:
                if (r1 != 0) goto L_0x00dc
                com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS     // Catch:{ IllegalArgumentException -> 0x010f }
                boolean r1 = r9.d0(r1)     // Catch:{ IllegalArgumentException -> 0x010f }
                if (r1 == 0) goto L_0x00d7
                java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ IllegalArgumentException -> 0x010f }
                r1.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x010f }
                return r1
            L_0x00d7:
                java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x010f }
                return r8
            L_0x00dc:
                com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS     // Catch:{ IllegalArgumentException -> 0x010f }
                boolean r1 = r9.d0(r1)     // Catch:{ IllegalArgumentException -> 0x010f }
                if (r1 == 0) goto L_0x00ea
                java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ IllegalArgumentException -> 0x010f }
                r1.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x010f }
                return r1
            L_0x00ea:
                long r3 = java.lang.Long.parseLong(r8)     // Catch:{ IllegalArgumentException -> 0x010f }
                com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.USE_LONG_FOR_INTS     // Catch:{ IllegalArgumentException -> 0x010f }
                boolean r1 = r9.d0(r1)     // Catch:{ IllegalArgumentException -> 0x010f }
                if (r1 != 0) goto L_0x010a
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 > 0) goto L_0x010a
                r5 = -2147483648(0xffffffff80000000, double:NaN)
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x010a
                int r1 = (int) r3     // Catch:{ IllegalArgumentException -> 0x010f }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x010f }
                return r8
            L_0x010a:
                java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x010f }
                return r8
            L_0x010f:
                java.lang.Class<?> r1 = r7.d
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "not a valid number"
                r9.Z(r1, r8, r3, r0)
                throw r2
            L_0x0119:
                java.lang.Object r8 = r7.I(r8, r9)
                return r8
            L_0x011e:
                java.lang.Class<?> r0 = r7.d
                r9.V(r0, r8)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer.d(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object");
        }

        public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, b bVar) throws IOException {
            int k = jsonParser.k();
            if (k == 6 || k == 7 || k == 8) {
                return d(jsonParser, deserializationContext);
            }
            return bVar.e(jsonParser, deserializationContext);
        }

        public final LogicalType q() {
            return LogicalType.Integer;
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        public final T Y1;
        public final boolean Z1;
        public final LogicalType x;
        public final T y;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
            super((Class<?>) cls);
            this.x = logicalType;
            this.y = t;
            this.Y1 = t2;
            this.Z1 = cls.isPrimitive();
        }

        public final T b(DeserializationContext deserializationContext) throws JsonMappingException {
            if (!this.Z1 || !deserializationContext.d0(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                return this.y;
            }
            deserializationContext.m0(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", f.f(this.d));
            throw null;
        }

        public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
            return this.Y1;
        }

        public final LogicalType q() {
            return this.x;
        }
    }

    @a
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        public static final ShortDeserializer a2 = new ShortDeserializer(Short.TYPE, 0);
        public static final ShortDeserializer b2 = new ShortDeserializer(Short.class, (Short) null);

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            if (jsonParser.D0()) {
                return Short.valueOf(jsonParser.Y());
            }
            if (this.Z1) {
                return Short.valueOf(l0(jsonParser, deserializationContext));
            }
            int k = jsonParser.k();
            boolean z = true;
            if (k == 1) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (k == 3) {
                return (Short) I(jsonParser, deserializationContext);
            } else {
                if (k == 11) {
                    return (Short) b(deserializationContext);
                }
                if (k == 6) {
                    String Z = jsonParser.Z();
                    CoercionAction C = C(deserializationContext, Z, q(), n());
                    if (C == CoercionAction.AsNull) {
                        return (Short) b(deserializationContext);
                    }
                    if (C == CoercionAction.AsEmpty) {
                        return (Short) this.Y1;
                    }
                    String trim = Z.trim();
                    if (E(deserializationContext, trim)) {
                        return (Short) b(deserializationContext);
                    }
                    try {
                        int d = e.d(trim);
                        if (d >= -32768 && d <= 32767) {
                            z = false;
                        }
                        if (!z) {
                            return Short.valueOf((short) d);
                        }
                        deserializationContext.Z(this.d, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                        throw null;
                    } catch (IllegalArgumentException unused) {
                        deserializationContext.Z(this.d, trim, "not a valid Short value", new Object[0]);
                        throw null;
                    }
                } else if (k == 7) {
                    return Short.valueOf(jsonParser.Y());
                } else {
                    if (k != 8) {
                        JavaType javaType = this.q;
                        if (javaType == null) {
                            javaType = deserializationContext.q(this.d);
                        }
                        deserializationContext.T(javaType, jsonParser);
                        throw null;
                    }
                    CoercionAction A = A(jsonParser, deserializationContext, this.d);
                    if (A == CoercionAction.AsNull) {
                        return (Short) b(deserializationContext);
                    }
                    if (A == CoercionAction.AsEmpty) {
                        return (Short) this.Y1;
                    }
                    return Short.valueOf(jsonParser.Y());
                }
            }
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            a.add(clsArr[i].getName());
        }
    }
}
