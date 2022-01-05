package i0.f.a.b.h;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import i0.d.a.a.a;
import i0.f.a.b.i.e;
import i0.f.a.b.j.d;
import i0.f.a.b.m.c;
import i0.f.a.b.m.f;
import i0.f.a.b.m.i;
import i0.f.a.b.m.k;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: ParserBase */
public abstract class b extends c {
    public static final f<StreamReadCapability> g2 = JsonParser.c;
    public long A2;
    public double B2;
    public BigInteger C2;
    public BigDecimal D2;
    public boolean E2;
    public int F2;
    public final i0.f.a.b.i.b h2;
    public boolean i2;
    public int j2;
    public int k2;
    public long l2;
    public int m2 = 1;
    public int n2;
    public long o2;
    public int p2 = 1;
    public int q2;
    public d r2;
    public JsonToken s2;
    public final i t2;
    public char[] u2;
    public boolean v2;
    public c w2;
    public byte[] x2;
    public int y2 = 0;
    public int z2;

    public b(i0.f.a.b.i.b bVar, int i) {
        super(i);
        this.h2 = bVar;
        this.t2 = new i(bVar.d);
        this.r2 = new d((d) null, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? new i0.f.a.b.j.b(this) : null, 0, 1, 0);
    }

    public static int[] C1(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    public String A1() throws IOException {
        return C0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public void B1() throws IOException {
        int i = this.y2;
        if ((i & 2) != 0) {
            long j = this.A2;
            int i3 = (int) j;
            if (((long) i3) == j) {
                this.z2 = i3;
            } else {
                i1(Z(), this.f2);
                throw null;
            }
        } else if ((i & 4) != 0) {
            if (c.y.compareTo(this.C2) > 0 || c.Y1.compareTo(this.C2) < 0) {
                h1();
                throw null;
            }
            this.z2 = this.C2.intValue();
        } else if ((i & 8) != 0) {
            double d = this.B2;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                h1();
                throw null;
            }
            this.z2 = (int) d;
        } else if ((i & 16) == 0) {
            k.a();
            throw null;
        } else if (c.d2.compareTo(this.D2) > 0 || c.e2.compareTo(this.D2) < 0) {
            h1();
            throw null;
        } else {
            this.z2 = this.D2.intValue();
        }
        this.y2 |= 1;
    }

    public IllegalArgumentException D1(Base64Variant base64Variant, int i, int i3, String str) throws IllegalArgumentException {
        String str2;
        boolean z = false;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[]{Integer.toHexString(i), Integer.valueOf(i3 + 1)});
        } else {
            if (i == base64Variant.y) {
                z = true;
            }
            if (z) {
                StringBuilder P0 = a.P0("Unexpected padding character ('");
                P0.append(base64Variant.y);
                P0.append("') as character #");
                P0.append(i3 + 1);
                P0.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
                str2 = P0.toString();
            } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
                StringBuilder P02 = a.P0("Illegal character (code 0x");
                P02.append(Integer.toHexString(i));
                P02.append(") in base64 content");
                str2 = P02.toString();
            } else {
                StringBuilder P03 = a.P0("Illegal character '");
                P03.append((char) i);
                P03.append("' (code 0x");
                P03.append(Integer.toHexString(i));
                P03.append(") in base64 content");
                str2 = P03.toString();
            }
        }
        if (str != null) {
            str2 = a.o0(str2, ": ", str);
        }
        return new IllegalArgumentException(str2);
    }

    public BigDecimal E() throws IOException {
        int i = this.y2;
        if ((i & 16) == 0) {
            if (i == 0) {
                w1(16);
            }
            int i3 = this.y2;
            if ((i3 & 16) == 0) {
                if ((i3 & 8) != 0) {
                    String Z = Z();
                    String str = e.a;
                    try {
                        this.D2 = new BigDecimal(Z);
                    } catch (NumberFormatException unused) {
                        throw e.a(Z);
                    }
                } else if ((i3 & 4) != 0) {
                    this.D2 = new BigDecimal(this.C2);
                } else if ((i3 & 2) != 0) {
                    this.D2 = BigDecimal.valueOf(this.A2);
                } else if ((i3 & 1) != 0) {
                    this.D2 = BigDecimal.valueOf((long) this.z2);
                } else {
                    k.a();
                    throw null;
                }
                this.y2 |= 16;
            }
        }
        return this.D2;
    }

    public final JsonToken E1(String str, double d) {
        i iVar = this.t2;
        iVar.c = null;
        iVar.d = -1;
        iVar.e = 0;
        iVar.k = str;
        iVar.l = null;
        if (iVar.g) {
            iVar.d();
        }
        iVar.j = 0;
        this.B2 = d;
        this.y2 = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public double F() throws IOException {
        int i = this.y2;
        if ((i & 8) == 0) {
            if (i == 0) {
                w1(8);
            }
            int i3 = this.y2;
            if ((i3 & 8) == 0) {
                if ((i3 & 16) != 0) {
                    this.B2 = this.D2.doubleValue();
                } else if ((i3 & 4) != 0) {
                    this.B2 = this.C2.doubleValue();
                } else if ((i3 & 2) != 0) {
                    this.B2 = (double) this.A2;
                } else if ((i3 & 1) != 0) {
                    this.B2 = (double) this.z2;
                } else {
                    k.a();
                    throw null;
                }
                this.y2 |= 8;
            }
        }
        return this.B2;
    }

    public final JsonToken F1(boolean z, int i) {
        this.E2 = z;
        this.F2 = i;
        this.y2 = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public float H() throws IOException {
        return (float) F();
    }

    public int I() throws IOException {
        int i = this.y2;
        if ((i & 1) == 0) {
            if (i == 0) {
                return v1();
            }
            if ((i & 1) == 0) {
                B1();
            }
        }
        return this.z2;
    }

    public long J() throws IOException {
        int i = this.y2;
        if ((i & 2) == 0) {
            if (i == 0) {
                w1(2);
            }
            int i3 = this.y2;
            if ((i3 & 2) == 0) {
                if ((i3 & 1) != 0) {
                    this.A2 = (long) this.z2;
                } else if ((i3 & 4) != 0) {
                    if (c.Z1.compareTo(this.C2) > 0 || c.a2.compareTo(this.C2) < 0) {
                        j1();
                        throw null;
                    }
                    this.A2 = this.C2.longValue();
                } else if ((i3 & 8) != 0) {
                    double d = this.B2;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        j1();
                        throw null;
                    }
                    this.A2 = (long) d;
                } else if ((i3 & 16) == 0) {
                    k.a();
                    throw null;
                } else if (c.b2.compareTo(this.D2) > 0 || c.c2.compareTo(this.D2) < 0) {
                    j1();
                    throw null;
                } else {
                    this.A2 = this.D2.longValue();
                }
                this.y2 |= 2;
            }
        }
        return this.A2;
    }

    public boolean J0() {
        if (this.f2 != JsonToken.VALUE_NUMBER_FLOAT || (this.y2 & 8) == 0) {
            return false;
        }
        double d = this.B2;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    public JsonParser.NumberType M() throws IOException {
        if (this.y2 == 0) {
            w1(0);
        }
        if (this.f2 == JsonToken.VALUE_NUMBER_INT) {
            int i = this.y2;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        } else if ((this.y2 & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        } else {
            return JsonParser.NumberType.DOUBLE;
        }
    }

    public Number N() throws IOException {
        if (this.y2 == 0) {
            w1(0);
        }
        if (this.f2 == JsonToken.VALUE_NUMBER_INT) {
            int i = this.y2;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.z2);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.A2);
            }
            if ((i & 4) != 0) {
                return this.C2;
            }
            k.a();
            throw null;
        }
        int i3 = this.y2;
        if ((i3 & 16) != 0) {
            return this.D2;
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.B2);
        }
        k.a();
        throw null;
    }

    public Number O() throws IOException {
        if (this.f2 == JsonToken.VALUE_NUMBER_INT) {
            if (this.y2 == 0) {
                w1(0);
            }
            int i = this.y2;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.z2);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.A2);
            }
            if ((i & 4) != 0) {
                return this.C2;
            }
            k.a();
            throw null;
        }
        if (this.y2 == 0) {
            w1(16);
        }
        int i3 = this.y2;
        if ((i3 & 16) != 0) {
            return this.D2;
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.B2);
        }
        k.a();
        throw null;
    }

    public JsonParser P0(int i, int i3) {
        int i4 = this.d;
        int i5 = (i & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this.d = i5;
            m1(i5, i6);
        }
        return this;
    }

    public void S0(Object obj) {
        this.r2.g = obj;
    }

    public i0.f.a.b.c T() {
        return this.r2;
    }

    @Deprecated
    public JsonParser T0(int i) {
        int i3 = this.d ^ i;
        if (i3 != 0) {
            this.d = i;
            m1(i, i3);
        }
        return this;
    }

    public void X0() throws JsonParseException {
        if (!this.r2.f()) {
            String str = this.r2.d() ? "Array" : "Object";
            d dVar = this.r2;
            d1(String.format(": expected close marker for %s (start marker at %s)", new Object[]{str, new JsonLocation(s1(), -1, dVar.h, dVar.i)}), (JsonToken) null);
            throw null;
        }
    }

    public void close() throws IOException {
        if (!this.i2) {
            this.j2 = Math.max(this.j2, this.k2);
            this.i2 = true;
            try {
                n1();
            } finally {
                x1();
            }
        }
    }

    public BigInteger l() throws IOException {
        int i = this.y2;
        if ((i & 4) == 0) {
            if (i == 0) {
                w1(4);
            }
            int i3 = this.y2;
            if ((i3 & 4) == 0) {
                if ((i3 & 16) != 0) {
                    this.C2 = this.D2.toBigInteger();
                } else if ((i3 & 2) != 0) {
                    this.C2 = BigInteger.valueOf(this.A2);
                } else if ((i3 & 1) != 0) {
                    this.C2 = BigInteger.valueOf((long) this.z2);
                } else if ((i3 & 8) != 0) {
                    this.C2 = BigDecimal.valueOf(this.B2).toBigInteger();
                } else {
                    k.a();
                    throw null;
                }
                this.y2 |= 4;
            }
        }
        return this.C2;
    }

    public void m1(int i, int i3) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i3 & mask) != 0 && (i & mask) != 0) {
            d dVar = this.r2;
            if (dVar.d == null) {
                dVar.d = new i0.f.a.b.j.b(this);
                this.r2 = dVar;
                return;
            }
            dVar.d = null;
            this.r2 = dVar;
        }
    }

    public abstract void n1() throws IOException;

    public final int o1(Base64Variant base64Variant, char c, int i) throws IOException {
        if (c == '\\') {
            char q1 = q1();
            if (q1 <= ' ' && i == 0) {
                return -1;
            }
            int e = base64Variant.e(q1);
            if (e >= 0 || (e == -2 && i >= 2)) {
                return e;
            }
            throw D1(base64Variant, q1, i, (String) null);
        }
        throw D1(base64Variant, c, i, (String) null);
    }

    public final int p1(Base64Variant base64Variant, int i, int i3) throws IOException {
        if (i == 92) {
            char q1 = q1();
            if (q1 <= ' ' && i3 == 0) {
                return -1;
            }
            int f = base64Variant.f(q1);
            if (f >= 0 || f == -2) {
                return f;
            }
            throw D1(base64Variant, q1, i3, (String) null);
        }
        throw D1(base64Variant, i, i3, (String) null);
    }

    public abstract char q1() throws IOException;

    public c r1() {
        c cVar = this.w2;
        if (cVar == null) {
            this.w2 = new c();
        } else {
            cVar.i();
        }
        return this.w2;
    }

    public Object s1() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.d)) {
            return this.h2.a;
        }
        return null;
    }

    public void t1(Base64Variant base64Variant) throws IOException {
        throw new JsonParseException(this, base64Variant.k());
    }

    public char u1(char c) throws JsonProcessingException {
        if (C0(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && C0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder P0 = a.P0("Unrecognized character escape ");
        P0.append(c.W0(c));
        throw new JsonParseException(this, P0.toString());
    }

    public int v1() throws IOException {
        if (this.i2) {
            throw new JsonParseException(this, "Internal error: _parseNumericValue called when parser instance closed");
        } else if (this.f2 != JsonToken.VALUE_NUMBER_INT || this.F2 > 9) {
            w1(1);
            if ((this.y2 & 1) == 0) {
                B1();
            }
            return this.z2;
        } else {
            int g = this.t2.g(this.E2);
            this.z2 = g;
            this.y2 = 1;
            return g;
        }
    }

    public boolean w0() {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.v2;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc A[Catch:{ NumberFormatException -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5 A[Catch:{ NumberFormatException -> 0x0101 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w1(int r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r1.i2
            if (r2 != 0) goto L_0x0161
            com.fasterxml.jackson.core.JsonToken r2 = r1.f2
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r4 = 8
            java.lang.String r5 = ")"
            java.lang.String r6 = "Malformed numeric value ("
            r7 = 0
            if (r2 != r3) goto L_0x011a
            int r2 = r1.F2
            r3 = 9
            r8 = 1
            if (r2 > r3) goto L_0x0029
            i0.f.a.b.m.i r0 = r1.t2
            boolean r2 = r1.E2
            int r0 = r0.g(r2)
            r1.z2 = r0
            r1.y2 = r8
            return
        L_0x0029:
            r3 = 18
            r9 = 2
            r10 = 0
            if (r2 > r3) goto L_0x0089
            i0.f.a.b.m.i r0 = r1.t2
            boolean r3 = r1.E2
            int r4 = r0.d
            if (r4 < 0) goto L_0x004d
            char[] r5 = r0.c
            if (r5 == 0) goto L_0x004d
            if (r3 == 0) goto L_0x0046
            int r4 = r4 + r8
            int r0 = r0.e
            int r0 = r0 - r8
            long r3 = i0.f.a.b.i.e.g(r5, r4, r0)
            goto L_0x0058
        L_0x0046:
            int r0 = r0.e
            long r3 = i0.f.a.b.i.e.g(r5, r4, r0)
            goto L_0x0062
        L_0x004d:
            if (r3 == 0) goto L_0x005a
            char[] r3 = r0.i
            int r0 = r0.j
            int r0 = r0 - r8
            long r3 = i0.f.a.b.i.e.g(r3, r8, r0)
        L_0x0058:
            long r3 = -r3
            goto L_0x0062
        L_0x005a:
            char[] r3 = r0.i
            int r0 = r0.j
            long r3 = i0.f.a.b.i.e.g(r3, r10, r0)
        L_0x0062:
            r0 = 10
            if (r2 != r0) goto L_0x0084
            boolean r0 = r1.E2
            if (r0 == 0) goto L_0x0077
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0084
            int r0 = (int) r3
            r1.z2 = r0
            r1.y2 = r8
            return
        L_0x0077:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0084
            int r0 = (int) r3
            r1.z2 = r0
            r1.y2 = r8
            return
        L_0x0084:
            r1.A2 = r3
            r1.y2 = r9
            return
        L_0x0089:
            i0.f.a.b.m.i r2 = r1.t2
            java.lang.String r2 = r2.h()
            int r3 = r1.F2     // Catch:{ NumberFormatException -> 0x0101 }
            i0.f.a.b.m.i r11 = r1.t2     // Catch:{ NumberFormatException -> 0x0101 }
            char[] r11 = r11.n()     // Catch:{ NumberFormatException -> 0x0101 }
            i0.f.a.b.m.i r12 = r1.t2     // Catch:{ NumberFormatException -> 0x0101 }
            int r12 = r12.o()     // Catch:{ NumberFormatException -> 0x0101 }
            boolean r13 = r1.E2     // Catch:{ NumberFormatException -> 0x0101 }
            if (r13 == 0) goto L_0x00a3
            int r12 = r12 + 1
        L_0x00a3:
            if (r13 == 0) goto L_0x00a8
            java.lang.String r13 = i0.f.a.b.i.e.a     // Catch:{ NumberFormatException -> 0x0101 }
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r13 = i0.f.a.b.i.e.b     // Catch:{ NumberFormatException -> 0x0101 }
        L_0x00aa:
            int r14 = r13.length()     // Catch:{ NumberFormatException -> 0x0101 }
            if (r3 >= r14) goto L_0x00b1
            goto L_0x00c9
        L_0x00b1:
            if (r3 <= r14) goto L_0x00b4
            goto L_0x00ca
        L_0x00b4:
            r3 = r10
        L_0x00b5:
            if (r3 >= r14) goto L_0x00c9
            int r15 = r12 + r3
            char r15 = r11[r15]     // Catch:{ NumberFormatException -> 0x0101 }
            char r16 = r13.charAt(r3)     // Catch:{ NumberFormatException -> 0x0101 }
            int r15 = r15 - r16
            if (r15 == 0) goto L_0x00c6
            if (r15 >= 0) goto L_0x00ca
            goto L_0x00c9
        L_0x00c6:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00c9:
            r10 = r8
        L_0x00ca:
            if (r10 == 0) goto L_0x00d5
            long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0101 }
            r1.A2 = r3     // Catch:{ NumberFormatException -> 0x0101 }
            r1.y2 = r9     // Catch:{ NumberFormatException -> 0x0101 }
            goto L_0x00f4
        L_0x00d5:
            if (r0 == r8) goto L_0x00f5
            if (r0 != r9) goto L_0x00da
            goto L_0x00f5
        L_0x00da:
            if (r0 == r4) goto L_0x00ec
            r3 = 32
            if (r0 != r3) goto L_0x00e1
            goto L_0x00ec
        L_0x00e1:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x0101 }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x0101 }
            r1.C2 = r0     // Catch:{ NumberFormatException -> 0x0101 }
            r0 = 4
            r1.y2 = r0     // Catch:{ NumberFormatException -> 0x0101 }
            goto L_0x00f4
        L_0x00ec:
            double r7 = i0.f.a.b.i.e.c(r2)     // Catch:{ NumberFormatException -> 0x0101 }
            r1.B2 = r7     // Catch:{ NumberFormatException -> 0x0101 }
            r1.y2 = r4     // Catch:{ NumberFormatException -> 0x0101 }
        L_0x00f4:
            return
        L_0x00f5:
            if (r0 != r8) goto L_0x00fd
            com.fasterxml.jackson.core.JsonToken r0 = r1.f2     // Catch:{ NumberFormatException -> 0x0101 }
            r1.i1(r2, r0)     // Catch:{ NumberFormatException -> 0x0101 }
            throw r7     // Catch:{ NumberFormatException -> 0x0101 }
        L_0x00fd:
            r1.k1(r2)     // Catch:{ NumberFormatException -> 0x0101 }
            throw r7     // Catch:{ NumberFormatException -> 0x0101 }
        L_0x0101:
            r0 = move-exception
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r6)
            java.lang.String r2 = r1.Z0(r2)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.fasterxml.jackson.core.JsonParseException r3 = new com.fasterxml.jackson.core.JsonParseException
            r3.<init>((com.fasterxml.jackson.core.JsonParser) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            throw r3
        L_0x011a:
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            if (r2 != r3) goto L_0x015b
            r2 = 16
            if (r0 != r2) goto L_0x012d
            i0.f.a.b.m.i r0 = r1.t2     // Catch:{ NumberFormatException -> 0x013c }
            java.math.BigDecimal r0 = r0.f()     // Catch:{ NumberFormatException -> 0x013c }
            r1.D2 = r0     // Catch:{ NumberFormatException -> 0x013c }
            r1.y2 = r2     // Catch:{ NumberFormatException -> 0x013c }
            goto L_0x013b
        L_0x012d:
            i0.f.a.b.m.i r0 = r1.t2     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.String r0 = r0.h()     // Catch:{ NumberFormatException -> 0x013c }
            double r2 = i0.f.a.b.i.e.c(r0)     // Catch:{ NumberFormatException -> 0x013c }
            r1.B2 = r2     // Catch:{ NumberFormatException -> 0x013c }
            r1.y2 = r4     // Catch:{ NumberFormatException -> 0x013c }
        L_0x013b:
            return
        L_0x013c:
            r0 = move-exception
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r6)
            i0.f.a.b.m.i r3 = r1.t2
            java.lang.String r3 = r3.h()
            java.lang.String r3 = r1.Z0(r3)
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.fasterxml.jackson.core.JsonParseException r3 = new com.fasterxml.jackson.core.JsonParseException
            r3.<init>((com.fasterxml.jackson.core.JsonParser) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            throw r3
        L_0x015b:
            java.lang.String r0 = "Current token (%s) not numeric, can not use numeric value accessors"
            r1.a1(r0, r2)
            throw r7
        L_0x0161:
            com.fasterxml.jackson.core.JsonParseException r0 = new com.fasterxml.jackson.core.JsonParseException
            java.lang.String r2 = "Internal error: _parseNumericValue called when parser instance closed"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.h.b.w1(int):void");
    }

    public abstract void x1() throws IOException;

    public String y() throws IOException {
        d dVar;
        JsonToken jsonToken = this.f2;
        if ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (dVar = this.r2.c) != null) {
            return dVar.f;
        }
        return this.r2.f;
    }

    public void y1(int i, char c) throws JsonParseException {
        d dVar = this.r2;
        throw new JsonParseException(this, String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i), Character.valueOf(c), dVar.h(), new JsonLocation(s1(), -1, dVar.h, dVar.i)}));
    }

    public void z1(int i, String str) throws JsonParseException {
        if (!C0(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            StringBuilder P0 = a.P0("Illegal unquoted character (");
            P0.append(c.W0((char) i));
            P0.append("): has to be escaped using backslash to be included in ");
            P0.append(str);
            throw new JsonParseException(this, P0.toString());
        }
    }
}
