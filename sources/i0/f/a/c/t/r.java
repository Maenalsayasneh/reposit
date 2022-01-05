package i0.f.a.c.t;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import i0.f.a.b.c;
import i0.f.a.b.d;
import i0.f.a.b.j.e;
import i0.f.a.b.m.f;
import i0.f.a.b.m.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* compiled from: TokenBuffer */
public class r extends JsonGenerator {
    public static final int x = JsonGenerator.Feature.collectDefaults();
    public c Y1;
    public int Z1;
    public boolean a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public b e2;
    public b f2;
    public int g2;
    public Object h2;
    public Object i2;
    public boolean j2;
    public e k2;
    public d y;

    /* compiled from: TokenBuffer */
    public static final class a extends i0.f.a.b.h.c {
        public d g2;
        public final boolean h2;
        public final boolean i2;
        public b j2;
        public int k2;
        public s l2;
        public boolean m2;
        public transient i0.f.a.b.m.c n2;
        public JsonLocation o2 = null;

        public a(b bVar, d dVar, boolean z, boolean z2, c cVar) {
            super(0);
            s sVar;
            this.j2 = bVar;
            this.k2 = -1;
            this.g2 = dVar;
            if (cVar == null) {
                sVar = new s();
            } else {
                sVar = new s(cVar, (JsonLocation) null);
            }
            this.l2 = sVar;
            this.h2 = z;
            this.i2 = z2;
        }

        public BigDecimal E() throws IOException {
            Number N = N();
            if (N instanceof BigDecimal) {
                return (BigDecimal) N;
            }
            int ordinal = M().ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return BigDecimal.valueOf(N.longValue());
            }
            if (ordinal != 2) {
                return BigDecimal.valueOf(N.doubleValue());
            }
            return new BigDecimal((BigInteger) N);
        }

        public double F() throws IOException {
            return N().doubleValue();
        }

        public Object G() {
            if (this.f2 == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return m1();
            }
            return null;
        }

        public float H() throws IOException {
            return N().floatValue();
        }

        public int I() throws IOException {
            Number N = this.f2 == JsonToken.VALUE_NUMBER_INT ? (Number) m1() : N();
            if (!(N instanceof Integer)) {
                if (!((N instanceof Short) || (N instanceof Byte))) {
                    if (N instanceof Long) {
                        long longValue = N.longValue();
                        int i = (int) longValue;
                        if (((long) i) == longValue) {
                            return i;
                        }
                        h1();
                        throw null;
                    }
                    if (N instanceof BigInteger) {
                        BigInteger bigInteger = (BigInteger) N;
                        if (i0.f.a.b.h.c.y.compareTo(bigInteger) > 0 || i0.f.a.b.h.c.Y1.compareTo(bigInteger) < 0) {
                            h1();
                            throw null;
                        }
                    } else if ((N instanceof Double) || (N instanceof Float)) {
                        double doubleValue = N.doubleValue();
                        if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                            return (int) doubleValue;
                        }
                        h1();
                        throw null;
                    } else if (N instanceof BigDecimal) {
                        BigDecimal bigDecimal = (BigDecimal) N;
                        if (i0.f.a.b.h.c.d2.compareTo(bigDecimal) > 0 || i0.f.a.b.h.c.e2.compareTo(bigDecimal) < 0) {
                            h1();
                            throw null;
                        }
                    } else {
                        k.a();
                        throw null;
                    }
                    return N.intValue();
                }
            }
            return N.intValue();
        }

        public long J() throws IOException {
            Number N = this.f2 == JsonToken.VALUE_NUMBER_INT ? (Number) m1() : N();
            if (!(N instanceof Long)) {
                if (!((N instanceof Integer) || (N instanceof Short) || (N instanceof Byte))) {
                    if (N instanceof BigInteger) {
                        BigInteger bigInteger = (BigInteger) N;
                        if (i0.f.a.b.h.c.Z1.compareTo(bigInteger) > 0 || i0.f.a.b.h.c.a2.compareTo(bigInteger) < 0) {
                            j1();
                            throw null;
                        }
                    } else if ((N instanceof Double) || (N instanceof Float)) {
                        double doubleValue = N.doubleValue();
                        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
                            return (long) doubleValue;
                        }
                        j1();
                        throw null;
                    } else if (N instanceof BigDecimal) {
                        BigDecimal bigDecimal = (BigDecimal) N;
                        if (i0.f.a.b.h.c.b2.compareTo(bigDecimal) > 0 || i0.f.a.b.h.c.c2.compareTo(bigDecimal) < 0) {
                            j1();
                            throw null;
                        }
                    } else {
                        k.a();
                        throw null;
                    }
                    return N.longValue();
                }
            }
            return N.longValue();
        }

        public boolean J0() {
            if (this.f2 != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object m1 = m1();
            if (m1 instanceof Double) {
                Double d = (Double) m1;
                if (d.isNaN() || d.isInfinite()) {
                    return true;
                }
                return false;
            } else if (!(m1 instanceof Float)) {
                return false;
            } else {
                Float f = (Float) m1;
                if (f.isNaN() || f.isInfinite()) {
                    return true;
                }
                return false;
            }
        }

        public String K0() throws IOException {
            b bVar;
            JsonToken jsonToken;
            if (!this.m2 && (bVar = this.j2) != null) {
                int i = this.k2 + 1;
                if (i < 16 && bVar.k(i) == (jsonToken = JsonToken.FIELD_NAME)) {
                    this.k2 = i;
                    this.f2 = jsonToken;
                    Object obj = this.j2.d[i];
                    String obj2 = obj instanceof String ? (String) obj : obj.toString();
                    this.l2.e = obj2;
                    return obj2;
                } else if (M0() == JsonToken.FIELD_NAME) {
                    return f();
                }
            }
            return null;
        }

        public JsonParser.NumberType M() throws IOException {
            Number N = N();
            if (N instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (N instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (N instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (N instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (N instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (N instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (N instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        public JsonToken M0() throws IOException {
            b bVar;
            s sVar;
            if (this.m2 || (bVar = this.j2) == null) {
                return null;
            }
            int i = this.k2 + 1;
            this.k2 = i;
            if (i >= 16) {
                this.k2 = 0;
                b bVar2 = bVar.b;
                this.j2 = bVar2;
                if (bVar2 == null) {
                    return null;
                }
            }
            JsonToken k = this.j2.k(this.k2);
            this.f2 = k;
            if (k == JsonToken.FIELD_NAME) {
                Object m1 = m1();
                this.l2.e = m1 instanceof String ? (String) m1 : m1.toString();
            } else if (k == JsonToken.START_OBJECT) {
                s sVar2 = this.l2;
                sVar2.b++;
                this.l2 = new s(sVar2, 2, -1);
            } else if (k == JsonToken.START_ARRAY) {
                s sVar3 = this.l2;
                sVar3.b++;
                this.l2 = new s(sVar3, 1, -1);
            } else if (k == JsonToken.END_OBJECT || k == JsonToken.END_ARRAY) {
                s sVar4 = this.l2;
                c cVar = sVar4.c;
                if (cVar instanceof s) {
                    sVar = (s) cVar;
                } else if (cVar == null) {
                    sVar = new s();
                } else {
                    sVar = new s(cVar, sVar4.d);
                }
                this.l2 = sVar;
            } else {
                this.l2.b++;
            }
            return this.f2;
        }

        public final Number N() throws IOException {
            JsonToken jsonToken = this.f2;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
                P0.append(this.f2);
                P0.append(") not numeric, cannot use numeric value accessors");
                throw new JsonParseException(this, P0.toString());
            }
            Object m1 = m1();
            if (m1 instanceof Number) {
                return (Number) m1;
            }
            if (m1 instanceof String) {
                String str = (String) m1;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } else if (m1 == null) {
                return null;
            } else {
                throw new IllegalStateException(i0.d.a.a.a.c0(m1, i0.d.a.a.a.P0("Internal error: entry should be a Number, but is of type ")));
            }
        }

        public Object Q() {
            return this.j2.f(this.k2);
        }

        public int Q0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] n = n(base64Variant);
            if (n == null) {
                return 0;
            }
            outputStream.write(n, 0, n.length);
            return n.length;
        }

        public c T() {
            return this.l2;
        }

        public f<StreamReadCapability> U() {
            return JsonParser.c;
        }

        public void X0() throws JsonParseException {
            k.a();
            throw null;
        }

        public String Z() {
            JsonToken jsonToken = this.f2;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object m1 = m1();
                if (m1 instanceof String) {
                    return (String) m1;
                }
                Annotation[] annotationArr = f.a;
                if (m1 == null) {
                    return null;
                }
                return m1.toString();
            } else if (jsonToken == null) {
                return null;
            } else {
                int ordinal = jsonToken.ordinal();
                if (ordinal != 8 && ordinal != 9) {
                    return this.f2.asString();
                }
                Object m12 = m1();
                Annotation[] annotationArr2 = f.a;
                if (m12 == null) {
                    return null;
                }
                return m12.toString();
            }
        }

        public boolean a() {
            return this.i2;
        }

        public boolean b() {
            return this.h2;
        }

        public char[] b0() {
            String Z = Z();
            if (Z == null) {
                return null;
            }
            return Z.toCharArray();
        }

        public int c0() {
            String Z = Z();
            if (Z == null) {
                return 0;
            }
            return Z.length();
        }

        public void close() throws IOException {
            if (!this.m2) {
                this.m2 = true;
            }
        }

        public int d0() {
            return 0;
        }

        public String f() {
            JsonToken jsonToken = this.f2;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                return this.l2.c.a();
            }
            return this.l2.e;
        }

        public JsonLocation f0() {
            return w();
        }

        public Object g0() {
            return this.j2.g(this.k2);
        }

        public BigInteger l() throws IOException {
            Number N = N();
            if (N instanceof BigInteger) {
                return (BigInteger) N;
            }
            if (M() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) N).toBigInteger();
            }
            return BigInteger.valueOf(N.longValue());
        }

        public final Object m1() {
            b bVar = this.j2;
            return bVar.d[this.k2];
        }

        public byte[] n(Base64Variant base64Variant) throws IOException, JsonParseException {
            if (this.f2 == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object m1 = m1();
                if (m1 instanceof byte[]) {
                    return (byte[]) m1;
                }
            }
            if (this.f2 == JsonToken.VALUE_STRING) {
                String Z = Z();
                if (Z == null) {
                    return null;
                }
                i0.f.a.b.m.c cVar = this.n2;
                if (cVar == null) {
                    cVar = new i0.f.a.b.m.c((i0.f.a.b.m.a) null, 100);
                    this.n2 = cVar;
                } else {
                    cVar.i();
                }
                V0(Z, cVar, base64Variant);
                return cVar.k();
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
            P0.append(this.f2);
            P0.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            throw new JsonParseException(this, P0.toString());
        }

        public d v() {
            return this.g2;
        }

        public JsonLocation w() {
            JsonLocation jsonLocation = this.o2;
            return jsonLocation == null ? JsonLocation.c : jsonLocation;
        }

        public boolean w0() {
            return false;
        }

        public String y() {
            return f();
        }
    }

    /* compiled from: TokenBuffer */
    public static final class b {
        public static final JsonToken[] a;
        public b b;
        public long c;
        public final Object[] d = new Object[16];
        public TreeMap<Integer, Object> e;

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            a = jsonTokenArr;
            System.arraycopy(JsonToken.values(), 1, jsonTokenArr, 1, Math.min(15, 12));
        }

        public b a(int i, JsonToken jsonToken) {
            if (i < 16) {
                long ordinal = (long) jsonToken.ordinal();
                if (i > 0) {
                    ordinal <<= i << 2;
                }
                this.c |= ordinal;
                return null;
            }
            b bVar = new b();
            this.b = bVar;
            bVar.c = ((long) jsonToken.ordinal()) | bVar.c;
            return this.b;
        }

        public b b(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                h(i, jsonToken, obj);
                return null;
            }
            b bVar = new b();
            this.b = bVar;
            bVar.h(0, jsonToken, obj);
            return this.b;
        }

        public b c(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                i(i, jsonToken, obj, obj2);
                return null;
            }
            b bVar = new b();
            this.b = bVar;
            bVar.i(0, jsonToken, obj, obj2);
            return this.b;
        }

        public b d(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                j(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            b bVar = new b();
            this.b = bVar;
            bVar.j(0, jsonToken, obj, obj2, obj3);
            return this.b;
        }

        public final void e(int i, Object obj, Object obj2) {
            if (this.e == null) {
                this.e = new TreeMap<>();
            }
            if (obj != null) {
                this.e.put(Integer.valueOf(i + i + 1), obj);
            }
            if (obj2 != null) {
                this.e.put(Integer.valueOf(i + i), obj2);
            }
        }

        public Object f(int i) {
            TreeMap<Integer, Object> treeMap = this.e;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i + i + 1));
        }

        public Object g(int i) {
            TreeMap<Integer, Object> treeMap = this.e;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i + i));
        }

        public final void h(int i, JsonToken jsonToken, Object obj) {
            this.d[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.c |= ordinal;
        }

        public final void i(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.c = ordinal | this.c;
            e(i, obj, obj2);
        }

        public final void j(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this.d[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.c = ordinal | this.c;
            e(i, obj2, obj3);
        }

        public JsonToken k(int i) {
            long j = this.c;
            if (i > 0) {
                j >>= i << 2;
            }
            return a[((int) j) & 15];
        }
    }

    public r(d dVar, boolean z) {
        boolean z2 = false;
        this.j2 = false;
        this.y = null;
        this.Z1 = x;
        this.k2 = e.m((i0.f.a.b.j.b) null);
        b bVar = new b();
        this.f2 = bVar;
        this.e2 = bVar;
        this.g2 = 0;
        this.a2 = z;
        this.b2 = z;
        this.c2 = (z || z) ? true : z2;
    }

    public static r e1(JsonParser jsonParser) throws IOException {
        r rVar = new r(jsonParser, (DeserializationContext) null);
        rVar.i1(jsonParser);
        return rVar;
    }

    public void A0(String str) throws IOException {
        c1();
        throw null;
    }

    public void C0(char[] cArr, int i, int i3) throws IOException {
        c1();
        throw null;
    }

    public void F0(String str) throws IOException {
        Y0(JsonToken.VALUE_EMBEDDED_OBJECT, new p(str));
    }

    public int I(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public final void I0() throws IOException {
        this.k2.q();
        W0(JsonToken.START_ARRAY);
        this.k2 = this.k2.i();
    }

    public void K0(Object obj) throws IOException {
        this.k2.q();
        W0(JsonToken.START_ARRAY);
        this.k2 = this.k2.j(obj);
    }

    public void L0(Object obj, int i) throws IOException {
        this.k2.q();
        W0(JsonToken.START_ARRAY);
        this.k2 = this.k2.j(obj);
    }

    public void M(Base64Variant base64Variant, byte[] bArr, int i, int i3) throws IOException {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        u0(bArr2);
    }

    public final void M0() throws IOException {
        this.k2.q();
        W0(JsonToken.START_OBJECT);
        this.k2 = this.k2.k();
    }

    public void N0(Object obj) throws IOException {
        this.k2.q();
        W0(JsonToken.START_OBJECT);
        this.k2 = this.k2.l(obj);
    }

    public void O(boolean z) throws IOException {
        X0(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public void O0(Object obj, int i) throws IOException {
        this.k2.q();
        W0(JsonToken.START_OBJECT);
        this.k2 = this.k2.l(obj);
    }

    public void P0(i0.f.a.b.f fVar) throws IOException {
        if (fVar == null) {
            X0(JsonToken.VALUE_NULL);
        } else {
            Y0(JsonToken.VALUE_STRING, fVar);
        }
    }

    public void Q(Object obj) throws IOException {
        Y0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public void Q0(String str) throws IOException {
        if (str == null) {
            X0(JsonToken.VALUE_NULL);
        } else {
            Y0(JsonToken.VALUE_STRING, str);
        }
    }

    public void R0(char[] cArr, int i, int i3) throws IOException {
        Q0(new String(cArr, i, i3));
    }

    public void S0(Object obj) {
        this.h2 = obj;
        this.j2 = true;
    }

    public final void T() throws IOException {
        T0(JsonToken.END_ARRAY);
        e eVar = this.k2.c;
        if (eVar != null) {
            this.k2 = eVar;
        }
    }

    public final void T0(JsonToken jsonToken) {
        b a3 = this.f2.a(this.g2, jsonToken);
        if (a3 == null) {
            this.g2++;
            return;
        }
        this.f2 = a3;
        this.g2 = 1;
    }

    public final void U() throws IOException {
        T0(JsonToken.END_OBJECT);
        e eVar = this.k2.c;
        if (eVar != null) {
            this.k2 = eVar;
        }
    }

    public final void U0(Object obj) {
        b bVar;
        if (this.j2) {
            bVar = this.f2.d(this.g2, JsonToken.FIELD_NAME, obj, this.i2, this.h2);
        } else {
            bVar = this.f2.b(this.g2, JsonToken.FIELD_NAME, obj);
        }
        if (bVar == null) {
            this.g2++;
            return;
        }
        this.f2 = bVar;
        this.g2 = 1;
    }

    public final void V0(StringBuilder sb) {
        Object f = this.f2.f(this.g2 - 1);
        if (f != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(f));
            sb.append(']');
        }
        Object g = this.f2.g(this.g2 - 1);
        if (g != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(g));
            sb.append(']');
        }
    }

    public final void W0(JsonToken jsonToken) {
        b bVar;
        if (this.j2) {
            bVar = this.f2.c(this.g2, jsonToken, this.i2, this.h2);
        } else {
            bVar = this.f2.a(this.g2, jsonToken);
        }
        if (bVar == null) {
            this.g2++;
            return;
        }
        this.f2 = bVar;
        this.g2 = 1;
    }

    public final void X0(JsonToken jsonToken) {
        b bVar;
        this.k2.q();
        if (this.j2) {
            bVar = this.f2.c(this.g2, jsonToken, this.i2, this.h2);
        } else {
            bVar = this.f2.a(this.g2, jsonToken);
        }
        if (bVar == null) {
            this.g2++;
            return;
        }
        this.f2 = bVar;
        this.g2 = 1;
    }

    public final void Y0(JsonToken jsonToken, Object obj) {
        b bVar;
        this.k2.q();
        if (this.j2) {
            bVar = this.f2.d(this.g2, jsonToken, obj, this.i2, this.h2);
        } else {
            bVar = this.f2.b(this.g2, jsonToken, obj);
        }
        if (bVar == null) {
            this.g2++;
            return;
        }
        this.f2 = bVar;
        this.g2 = 1;
    }

    public void Z(i0.f.a.b.f fVar) throws IOException {
        this.k2.p(fVar.getValue());
        U0(fVar);
    }

    public final void Z0(JsonParser jsonParser) throws IOException {
        Object g02 = jsonParser.g0();
        this.h2 = g02;
        if (g02 != null) {
            this.j2 = true;
        }
        Object Q = jsonParser.Q();
        this.i2 = Q;
        if (Q != null) {
            this.j2 = true;
        }
    }

    public void a1(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken M0 = jsonParser.M0();
            if (M0 != null) {
                int ordinal = M0.ordinal();
                if (ordinal == 1) {
                    if (this.c2) {
                        Z0(jsonParser);
                    }
                    M0();
                } else if (ordinal == 2) {
                    U();
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else if (ordinal == 3) {
                    if (this.c2) {
                        Z0(jsonParser);
                    }
                    I0();
                } else if (ordinal == 4) {
                    T();
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else if (ordinal != 5) {
                    b1(jsonParser, M0);
                } else {
                    if (this.c2) {
                        Z0(jsonParser);
                    }
                    b0(jsonParser.f());
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void b0(String str) throws IOException {
        this.k2.p(str);
        U0(str);
    }

    public final void b1(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this.c2) {
            Z0(jsonParser);
        }
        switch (jsonToken.ordinal()) {
            case 6:
                u0(jsonParser.G());
                return;
            case 7:
                if (jsonParser.w0()) {
                    R0(jsonParser.b0(), jsonParser.d0(), jsonParser.c0());
                    return;
                } else {
                    Q0(jsonParser.Z());
                    return;
                }
            case 8:
                int ordinal = jsonParser.M().ordinal();
                if (ordinal == 0) {
                    g0(jsonParser.I());
                    return;
                } else if (ordinal != 2) {
                    i0(jsonParser.J());
                    return;
                } else {
                    p0(jsonParser.l());
                    return;
                }
            case 9:
                if (this.d2) {
                    n0(jsonParser.E());
                    return;
                }
                Y0(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.O());
                return;
            case 10:
                O(true);
                return;
            case 11:
                O(false);
                return;
            case 12:
                X0(JsonToken.VALUE_NULL);
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    public void c0() throws IOException {
        X0(JsonToken.VALUE_NULL);
    }

    public void c1() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public void close() throws IOException {
    }

    public void d0(double d) throws IOException {
        Y0(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public r d1(r rVar) throws IOException {
        if (!this.a2) {
            this.a2 = rVar.a2;
        }
        if (!this.b2) {
            this.b2 = rVar.b2;
        }
        this.c2 = this.a2 || this.b2;
        JsonParser f1 = rVar.f1();
        while (f1.M0() != null) {
            i1(f1);
        }
        return this;
    }

    public boolean e() {
        return this.b2;
    }

    public boolean f() {
        return this.a2;
    }

    public void f0(float f) throws IOException {
        Y0(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public JsonParser f1() {
        return new a(this.e2, this.y, this.a2, this.b2, this.Y1);
    }

    public void flush() throws IOException {
    }

    public void g0(int i) throws IOException {
        Y0(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public JsonParser g1(JsonParser jsonParser) {
        a aVar = new a(this.e2, jsonParser.v(), this.a2, this.b2, this.Y1);
        aVar.o2 = jsonParser.f0();
        return aVar;
    }

    public JsonParser h1() throws IOException {
        a aVar = new a(this.e2, this.y, this.a2, this.b2, this.Y1);
        aVar.M0();
        return aVar;
    }

    public JsonGenerator i(JsonGenerator.Feature feature) {
        this.Z1 = (~feature.getMask()) & this.Z1;
        return this;
    }

    public void i0(long j) throws IOException {
        Y0(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public void i1(JsonParser jsonParser) throws IOException {
        JsonToken i = jsonParser.i();
        if (i == JsonToken.FIELD_NAME) {
            if (this.c2) {
                Z0(jsonParser);
            }
            b0(jsonParser.f());
            i = jsonParser.M0();
        } else if (i == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int ordinal = i.ordinal();
        if (ordinal == 1) {
            if (this.c2) {
                Z0(jsonParser);
            }
            M0();
            a1(jsonParser);
        } else if (ordinal == 2) {
            U();
        } else if (ordinal == 3) {
            if (this.c2) {
                Z0(jsonParser);
            }
            I0();
            a1(jsonParser);
        } else if (ordinal != 4) {
            b1(jsonParser, i);
        } else {
            T();
        }
    }

    public int k() {
        return this.Z1;
    }

    public c l() {
        return this.k2;
    }

    public void m0(String str) throws IOException {
        Y0(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public boolean n(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.Z1) != 0;
    }

    public void n0(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            X0(JsonToken.VALUE_NULL);
        } else {
            Y0(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void p0(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            X0(JsonToken.VALUE_NULL);
        } else {
            Y0(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void r0(short s) throws IOException {
        Y0(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    public String toString() {
        int i;
        StringBuilder P0 = i0.d.a.a.a.P0("[TokenBuffer: ");
        JsonParser f1 = f1();
        boolean z = false;
        if (this.a2 || this.b2) {
            z = true;
            i = 0;
        } else {
            i = 0;
        }
        while (true) {
            try {
                JsonToken M0 = f1.M0();
                if (M0 == null) {
                    break;
                }
                if (z) {
                    V0(P0);
                }
                if (i < 100) {
                    if (i > 0) {
                        P0.append(", ");
                    }
                    P0.append(M0.toString());
                    if (M0 == JsonToken.FIELD_NAME) {
                        P0.append('(');
                        P0.append(f1.f());
                        P0.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            P0.append(" ... (truncated ");
            P0.append(i - 100);
            P0.append(" entries)");
        }
        P0.append(']');
        return P0.toString();
    }

    public void u0(Object obj) throws IOException {
        if (obj == null) {
            X0(JsonToken.VALUE_NULL);
        } else if (obj.getClass() == byte[].class || (obj instanceof p)) {
            Y0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            d dVar = this.y;
            if (dVar == null) {
                Y0(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                dVar.a(this, obj);
            }
        }
    }

    public JsonGenerator v(int i, int i3) {
        this.Z1 = (i & i3) | (this.Z1 & (~i3));
        return this;
    }

    public void v0(Object obj) {
        this.i2 = obj;
        this.j2 = true;
    }

    public void w0(char c) throws IOException {
        c1();
        throw null;
    }

    @Deprecated
    public JsonGenerator y(int i) {
        this.Z1 = i;
        return this;
    }

    public void y0(i0.f.a.b.f fVar) throws IOException {
        c1();
        throw null;
    }

    public r(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean z = false;
        this.j2 = false;
        this.y = jsonParser.v();
        this.Y1 = jsonParser.T();
        this.Z1 = x;
        this.k2 = e.m((i0.f.a.b.j.b) null);
        b bVar = new b();
        this.f2 = bVar;
        this.e2 = bVar;
        this.g2 = 0;
        this.a2 = jsonParser.b();
        boolean a3 = jsonParser.a();
        this.b2 = a3;
        this.c2 = this.a2 || a3;
        this.d2 = deserializationContext != null ? deserializationContext.d0(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : z;
    }
}
