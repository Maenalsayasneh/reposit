package i0.f.a.b.h;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import i0.d.a.a.a;
import i0.f.a.b.i.e;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: ParserMinimalBase */
public abstract class c extends JsonParser {
    public static final BigInteger Y1;
    public static final BigInteger Z1;
    public static final BigInteger a2;
    public static final BigDecimal b2;
    public static final BigDecimal c2;
    public static final BigDecimal d2;
    public static final BigDecimal e2;
    public static final byte[] q = new byte[0];
    public static final int[] x = new int[0];
    public static final BigInteger y;
    public JsonToken f2;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        y = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        Y1 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        Z1 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(RecyclerView.FOREVER_NS);
        a2 = valueOf4;
        b2 = new BigDecimal(valueOf3);
        c2 = new BigDecimal(valueOf4);
        d2 = new BigDecimal(valueOf);
        e2 = new BigDecimal(valueOf2);
    }

    public c(int i) {
        super(i);
    }

    public static final String W0(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return a.g0("(CTRL-CHAR, code ", i, ")");
        }
        if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c + "' (code " + i + ")";
    }

    public boolean A0(int i) {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return i == 0;
        }
        if (jsonToken.id() == i) {
            return true;
        }
        return false;
    }

    @Deprecated
    public int C() {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public boolean D0() {
        return this.f2 == JsonToken.VALUE_NUMBER_INT;
    }

    public boolean F0() {
        return this.f2 == JsonToken.START_ARRAY;
    }

    public boolean I0() {
        return this.f2 == JsonToken.START_OBJECT;
    }

    public JsonToken N0() throws IOException {
        JsonToken M0 = M0();
        return M0 == JsonToken.FIELD_NAME ? M0() : M0;
    }

    public JsonParser U0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken M0 = M0();
            if (M0 == null) {
                X0();
                return this;
            } else if (M0.isStructStart()) {
                i++;
            } else if (M0.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (M0 == JsonToken.NOT_AVAILABLE) {
                a1("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                throw null;
            }
        }
    }

    public void V0(String str, i0.f.a.b.m.c cVar, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.d(str, cVar);
        } catch (IllegalArgumentException e) {
            throw new JsonParseException(this, e.getMessage());
        }
    }

    public abstract void X0() throws JsonParseException;

    public String Y0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public String Z0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    public final void a1(String str, Object obj) throws JsonParseException {
        throw new JsonParseException(this, String.format(str, new Object[]{obj}));
    }

    public final void b1(String str, Object obj, Object obj2) throws JsonParseException {
        throw new JsonParseException(this, String.format(str, new Object[]{obj, obj2}));
    }

    public void c1() throws JsonParseException {
        StringBuilder P0 = a.P0(" in ");
        P0.append(this.f2);
        d1(P0.toString(), this.f2);
        throw null;
    }

    public void d1(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, a.n0("Unexpected end-of-input", str));
    }

    public void e() {
        if (this.f2 != null) {
            this.f2 = null;
        }
    }

    public void e1(JsonToken jsonToken) throws JsonParseException {
        d1(jsonToken != JsonToken.VALUE_STRING ? (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value", jsonToken);
        throw null;
    }

    public void f1(int i, String str) throws JsonParseException {
        if (i >= 0) {
            String format = String.format("Unexpected character (%s)", new Object[]{W0(i)});
            if (str != null) {
                format = a.o0(format, ": ", str);
            }
            throw new JsonParseException(this, format);
        }
        c1();
        throw null;
    }

    public void g1(int i) throws JsonParseException {
        StringBuilder P0 = a.P0("Illegal character (");
        P0.append(W0((char) i));
        P0.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw new JsonParseException(this, P0.toString());
    }

    public void h1() throws IOException {
        i1(Z(), this.f2);
        throw null;
    }

    public JsonToken i() {
        return this.f2;
    }

    public int i0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return I();
        }
        return m0(0);
    }

    public void i1(String str, JsonToken jsonToken) throws IOException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{Y0(str), Integer.MIN_VALUE, Integer.MAX_VALUE}), jsonToken, Integer.TYPE);
    }

    public void j1() throws IOException {
        k1(Z());
        throw null;
    }

    public int k() {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public void k1(String str) throws IOException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{Y0(str), Long.MIN_VALUE, Long.valueOf(RecyclerView.FOREVER_NS)}), this.f2, Long.TYPE);
    }

    public void l1(int i, String str) throws JsonParseException {
        throw new JsonParseException(this, a.o0(String.format("Unexpected character (%s) in numeric value", new Object[]{W0(i)}), ": ", str));
    }

    public int m0(int i) throws IOException {
        String trim;
        int length;
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return I();
        }
        if (jsonToken == null) {
            return i;
        }
        int id = jsonToken.id();
        int i2 = 0;
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object G = G();
                    if (G instanceof Number) {
                        return ((Number) G).intValue();
                    }
                    return i;
                default:
                    return i;
            }
        } else {
            String Z = Z();
            if ("null".equals(Z)) {
                return 0;
            }
            String str = e.a;
            if (Z == null || (length = trim.length()) == 0) {
                return i;
            }
            char charAt = (trim = Z.trim()).charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                char charAt2 = trim.charAt(i2);
                if (charAt2 > '9' || charAt2 < '0') {
                    try {
                        return (int) e.c(trim);
                    } catch (NumberFormatException unused) {
                        return i;
                    }
                } else {
                    i2++;
                }
            }
            return Integer.parseInt(trim);
        }
    }

    public long n0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return J();
        }
        return p0(0);
    }

    public long p0(long j) throws IOException {
        String trim;
        int length;
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return J();
        }
        if (jsonToken == null) {
            return j;
        }
        int id = jsonToken.id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object G = G();
                    if (G instanceof Number) {
                        return ((Number) G).longValue();
                    }
                    return j;
                default:
                    return j;
            }
        } else {
            String Z = Z();
            if ("null".equals(Z)) {
                return 0;
            }
            String str = e.a;
            if (Z == null || (length = trim.length()) == 0) {
                return j;
            }
            int i = 0;
            char charAt = (trim = Z.trim()).charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i = 1;
            }
            while (i < length) {
                char charAt2 = trim.charAt(i);
                if (charAt2 > '9' || charAt2 < '0') {
                    try {
                        return (long) e.c(trim);
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                } else {
                    i++;
                }
            }
            return Long.parseLong(trim);
        }
    }

    public String r0() throws IOException {
        return u0((String) null);
    }

    public String u0(String str) throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return Z();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return y();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : Z();
    }

    public boolean v0() {
        return this.f2 != null;
    }

    public boolean y0(JsonToken jsonToken) {
        return this.f2 == jsonToken;
    }

    public JsonToken z() {
        return this.f2;
    }
}
