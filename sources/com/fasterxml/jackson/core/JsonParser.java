package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import i0.d.a.a.a;
import i0.f.a.b.c;
import i0.f.a.b.d;
import i0.f.a.b.m.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonParser implements Closeable {
    public static final f<StreamReadCapability> c = f.a(StreamReadCapability.values());
    public int d;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }

        public static int collectDefaults() {
            Feature[] values = values();
            int i = 0;
            for (int i2 = 0; i2 < 15; i2++) {
                Feature feature = values[i2];
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser() {
    }

    public abstract boolean A0(int i);

    @Deprecated
    public abstract int C();

    public boolean C0(Feature feature) {
        return feature.enabledIn(this.d);
    }

    public boolean D0() {
        return i() == JsonToken.VALUE_NUMBER_INT;
    }

    public abstract BigDecimal E() throws IOException;

    public abstract double F() throws IOException;

    public boolean F0() {
        return i() == JsonToken.START_ARRAY;
    }

    public Object G() throws IOException {
        return null;
    }

    public abstract float H() throws IOException;

    public abstract int I() throws IOException;

    public boolean I0() {
        return i() == JsonToken.START_OBJECT;
    }

    public abstract long J() throws IOException;

    public boolean J0() throws IOException {
        return false;
    }

    public String K0() throws IOException {
        if (M0() == JsonToken.FIELD_NAME) {
            return y();
        }
        return null;
    }

    public String L0() throws IOException {
        if (M0() == JsonToken.VALUE_STRING) {
            return Z();
        }
        return null;
    }

    public abstract NumberType M() throws IOException;

    public abstract JsonToken M0() throws IOException;

    public abstract Number N() throws IOException;

    public abstract JsonToken N0() throws IOException;

    public Number O() throws IOException {
        return N();
    }

    public JsonParser O0(int i, int i2) {
        return this;
    }

    public JsonParser P0(int i, int i2) {
        return T0((i & i2) | (this.d & (~i2)));
    }

    public Object Q() throws IOException {
        return null;
    }

    public int Q0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        StringBuilder P0 = a.P0("Operation not supported by parser of type ");
        P0.append(getClass().getName());
        throw new UnsupportedOperationException(P0.toString());
    }

    public boolean R0() {
        return false;
    }

    public void S0(Object obj) {
        c T = T();
        if (T != null) {
            T.g(obj);
        }
    }

    public abstract c T();

    @Deprecated
    public JsonParser T0(int i) {
        this.d = i;
        return this;
    }

    public f<StreamReadCapability> U() {
        return c;
    }

    public abstract JsonParser U0() throws IOException;

    public short Y() throws IOException {
        int I = I();
        if (I >= -32768 && I <= 32767) {
            return (short) I;
        }
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", new Object[]{Z()}), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
    }

    public abstract String Z() throws IOException;

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract char[] b0() throws IOException;

    public abstract int c0() throws IOException;

    public abstract void close() throws IOException;

    public abstract int d0() throws IOException;

    public abstract void e();

    public String f() throws IOException {
        return y();
    }

    public abstract JsonLocation f0();

    public Object g0() throws IOException {
        return null;
    }

    public JsonToken i() {
        return z();
    }

    public int i0() throws IOException {
        return m0(0);
    }

    public int k() {
        return C();
    }

    public abstract BigInteger l() throws IOException;

    public int m0(int i) throws IOException {
        return i;
    }

    public abstract byte[] n(Base64Variant base64Variant) throws IOException;

    public long n0() throws IOException {
        return p0(0);
    }

    public long p0(long j) throws IOException {
        return j;
    }

    public byte q() throws IOException {
        int I = I();
        if (I >= -128 && I <= 255) {
            return (byte) I;
        }
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", new Object[]{Z()}), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
    }

    public String r0() throws IOException {
        return u0((String) null);
    }

    public abstract String u0(String str) throws IOException;

    public abstract d v();

    public abstract boolean v0();

    public abstract JsonLocation w();

    public abstract boolean w0();

    public abstract String y() throws IOException;

    public abstract boolean y0(JsonToken jsonToken);

    public abstract JsonToken z();

    public JsonParser(int i) {
        this.d = i;
    }
}
