package com.fasterxml.jackson.core;

import i0.f.a.b.a;
import i0.f.a.b.c;
import i0.f.a.b.e;
import i0.f.a.b.m.f;
import i0.f.a.c.t.r;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonGenerator implements Closeable, Flushable {
    public static final f<StreamWriteCapability> c;
    public static final f<StreamWriteCapability> d;
    public e q;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
        }

        public static int collectDefaults() {
            Feature[] values = values();
            int i = 0;
            for (int i2 = 0; i2 < 10; i2++) {
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

    static {
        f<StreamWriteCapability> a = f.a(StreamWriteCapability.values());
        c = a;
        d = a.b(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        a.b(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    public abstract void A0(String str) throws IOException;

    public JsonGenerator C(e eVar) {
        this.q = eVar;
        return this;
    }

    public abstract void C0(char[] cArr, int i, int i2) throws IOException;

    public void D0(i0.f.a.b.f fVar) throws IOException {
        F0(fVar.getValue());
    }

    public JsonGenerator E(i0.f.a.b.f fVar) {
        throw new UnsupportedOperationException();
    }

    public void F(double[] dArr, int i, int i2) throws IOException {
        a(dArr.length, i, i2);
        L0(dArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            d0(dArr[i]);
            i++;
        }
        T();
    }

    public abstract void F0(String str) throws IOException;

    public void G(int[] iArr, int i, int i2) throws IOException {
        a(iArr.length, i, i2);
        L0(iArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            g0(iArr[i]);
            i++;
        }
        T();
    }

    public void H(long[] jArr, int i, int i2) throws IOException {
        a(jArr.length, i, i2);
        L0(jArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            i0(jArr[i]);
            i++;
        }
        T();
    }

    public abstract int I(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    public abstract void I0() throws IOException;

    public int J(InputStream inputStream, int i) throws IOException {
        return I(a.b, inputStream, i);
    }

    @Deprecated
    public void J0(int i) throws IOException {
        I0();
    }

    public void K0(Object obj) throws IOException {
        I0();
        w(obj);
    }

    public void L0(Object obj, int i) throws IOException {
        J0(i);
        w(obj);
    }

    public abstract void M(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    public abstract void M0() throws IOException;

    public void N(byte[] bArr) throws IOException {
        M(a.b, bArr, 0, bArr.length);
    }

    public void N0(Object obj) throws IOException {
        M0();
        w(obj);
    }

    public abstract void O(boolean z) throws IOException;

    public void O0(Object obj, int i) throws IOException {
        M0();
        w(obj);
    }

    public abstract void P0(i0.f.a.b.f fVar) throws IOException;

    public void Q(Object obj) throws IOException {
        if (obj == null) {
            c0();
        } else if (obj instanceof byte[]) {
            N((byte[]) obj);
        } else {
            throw new JsonGenerationException(i0.d.a.a.a.c0(obj, i0.d.a.a.a.P0("No native support for writing embedded objects of type ")), this);
        }
    }

    public abstract void Q0(String str) throws IOException;

    public abstract void R0(char[] cArr, int i, int i2) throws IOException;

    public void S0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public abstract void T() throws IOException;

    public abstract void U() throws IOException;

    public void Y(long j) throws IOException {
        b0(Long.toString(j));
    }

    public abstract void Z(i0.f.a.b.f fVar) throws IOException;

    public final void a(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)}));
        }
    }

    public boolean b() {
        return this instanceof r;
    }

    public abstract void b0(String str) throws IOException;

    public abstract void c0() throws IOException;

    public abstract void close() throws IOException;

    public abstract void d0(double d2) throws IOException;

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void f0(float f) throws IOException;

    public abstract void flush() throws IOException;

    public abstract void g0(int i) throws IOException;

    public abstract JsonGenerator i(Feature feature);

    public abstract void i0(long j) throws IOException;

    public abstract int k();

    public abstract c l();

    public abstract void m0(String str) throws IOException;

    public abstract boolean n(Feature feature);

    public abstract void n0(BigDecimal bigDecimal) throws IOException;

    public abstract void p0(BigInteger bigInteger) throws IOException;

    public JsonGenerator q(int i, int i2) {
        return this;
    }

    public void r0(short s) throws IOException {
        g0(s);
    }

    public abstract void u0(Object obj) throws IOException;

    public JsonGenerator v(int i, int i2) {
        return y((i & i2) | (k() & (~i2)));
    }

    public void v0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void w(Object obj) {
        c l = l();
        if (l != null) {
            l.g(obj);
        }
    }

    public abstract void w0(char c2) throws IOException;

    @Deprecated
    public abstract JsonGenerator y(int i);

    public void y0(i0.f.a.b.f fVar) throws IOException {
        A0(fVar.getValue());
    }

    public JsonGenerator z(int i) {
        return this;
    }
}
