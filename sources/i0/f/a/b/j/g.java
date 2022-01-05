package i0.f.a.b.j;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import i0.f.a.b.d;
import i0.f.a.b.h.b;
import i0.f.a.b.i.a;
import i0.f.a.b.m.c;
import i0.f.a.b.m.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: UTF8StreamJsonParser */
public class g extends b {
    public static final int G2 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int H2 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int I2 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int J2 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int K2 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int L2 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int M2 = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int N2 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] O2 = a.d;
    public static final int[] P2 = a.c;
    public d Q2;
    public final i0.f.a.b.k.a R2;
    public int[] S2 = new int[16];
    public boolean T2;
    public int U2;
    public int V2;
    public int W2;
    public int X2;
    public InputStream Y2;
    public byte[] Z2;
    public boolean a3;

    public g(i0.f.a.b.i.b bVar, int i, InputStream inputStream, d dVar, i0.f.a.b.k.a aVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(bVar, i);
        this.Y2 = inputStream;
        this.Q2 = dVar;
        this.R2 = aVar;
        this.Z2 = bArr;
        this.j2 = i2;
        this.k2 = i3;
        this.n2 = i2 - i4;
        this.l2 = (long) ((-i2) + i4);
        this.a3 = z;
    }

    public static final int d2(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    public final int A2() throws IOException {
        while (true) {
            int i = this.j2;
            if (i >= this.k2) {
                return B2();
            }
            byte[] bArr = this.Z2;
            int i2 = i + 1;
            this.j2 = i2;
            byte b = bArr[i] & 255;
            if (b > 32) {
                if (b != 47 && b != 35) {
                    return b;
                }
                this.j2 = i2 - 1;
                return B2();
            } else if (b != 32) {
                if (b == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (b == 13) {
                    r2();
                } else if (b != 9) {
                    g1(b);
                    throw null;
                }
            }
        }
    }

    public final int B2() throws IOException {
        byte b;
        while (true) {
            if (this.j2 < this.k2 || U1()) {
                byte[] bArr = this.Z2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        u2();
                    } else if (b != 35 || !E2()) {
                        return b;
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (b == 13) {
                    r2();
                } else if (b != 9) {
                    g1(b);
                    throw null;
                }
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("Unexpected end-of-input within/between ");
                P0.append(this.r2.h());
                P0.append(" entries");
                throw new JsonParseException(this, P0.toString());
            }
        }
        return b;
    }

    public final int C2() throws IOException {
        if (this.j2 < this.k2 || U1()) {
            byte[] bArr = this.Z2;
            int i = this.j2;
            int i2 = i + 1;
            this.j2 = i2;
            byte b = bArr[i] & 255;
            if (b <= 32) {
                if (b != 32) {
                    if (b == 10) {
                        this.m2++;
                        this.n2 = i2;
                    } else if (b == 13) {
                        r2();
                    } else if (b != 9) {
                        g1(b);
                        throw null;
                    }
                }
                while (true) {
                    int i3 = this.j2;
                    if (i3 >= this.k2) {
                        return D2();
                    }
                    byte[] bArr2 = this.Z2;
                    int i4 = i3 + 1;
                    this.j2 = i4;
                    byte b2 = bArr2[i3] & 255;
                    if (b2 > 32) {
                        if (b2 != 47 && b2 != 35) {
                            return b2;
                        }
                        this.j2 = i4 - 1;
                        return D2();
                    } else if (b2 != 32) {
                        if (b2 == 10) {
                            this.m2++;
                            this.n2 = i4;
                        } else if (b2 == 13) {
                            r2();
                        } else if (b2 != 9) {
                            g1(b2);
                            throw null;
                        }
                    }
                }
            } else if (b != 47 && b != 35) {
                return b;
            } else {
                this.j2 = i2 - 1;
                return D2();
            }
        } else {
            X0();
            return -1;
        }
    }

    public final int D2() throws IOException {
        byte b;
        while (true) {
            if (this.j2 < this.k2 || U1()) {
                byte[] bArr = this.Z2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        u2();
                    } else if (b != 35 || !E2()) {
                        return b;
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (b == 13) {
                    r2();
                } else if (b != 9) {
                    g1(b);
                    throw null;
                }
            } else {
                X0();
                return -1;
            }
        }
        return b;
    }

    public final boolean E2() throws IOException {
        if ((this.d & N2) == 0) {
            return false;
        }
        v2();
        return true;
    }

    public final void F2() {
        this.p2 = this.m2;
        int i = this.j2;
        this.o2 = this.l2 + ((long) i);
        this.q2 = i - this.n2;
    }

    public final void G1(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) K1(i2))) {
            p2(str.substring(0, i));
            throw null;
        }
    }

    public final int G2() throws IOException {
        if (this.j2 >= this.k2 && !U1()) {
            return 48;
        }
        byte[] bArr = this.Z2;
        int i = this.j2;
        byte b = bArr[i] & 255;
        if (b < 48 || b > 57) {
            return 48;
        }
        if ((this.d & H2) != 0) {
            this.j2 = i + 1;
            if (b == 48) {
                do {
                    if (this.j2 >= this.k2 && !U1()) {
                        break;
                    }
                    byte[] bArr2 = this.Z2;
                    int i2 = this.j2;
                    b = bArr2[i2] & 255;
                    if (b < 48 || b > 57) {
                        return 48;
                    }
                    this.j2 = i2 + 1;
                } while (b == 48);
            }
            return b;
        }
        throw new JsonParseException(this, i0.d.a.a.a.n0("Invalid numeric value: ", "Leading zeroes not allowed"));
    }

    public final void H1() throws JsonParseException {
        F2();
        if (this.r2.d()) {
            this.r2 = this.r2.i();
        } else {
            y1(93, '}');
            throw null;
        }
    }

    public final void H2(int i) throws IOException {
        int i2 = this.j2 + 1;
        this.j2 = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.m2++;
            this.n2 = i2;
        } else if (i == 13) {
            r2();
        } else if (i != 32) {
            f1(i, "Expected space separating root-level values");
            throw null;
        }
    }

    public final void I1() throws JsonParseException {
        F2();
        if (this.r2.e()) {
            this.r2 = this.r2.i();
        } else {
            y1(125, ']');
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String I2(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            i0.f.a.b.m.i r8 = r0.t2
            char[] r8 = r8.i()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00fe
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00eb
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r6 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
            r13 = r6
            goto L_0x0057
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x0057
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x00e6
            r12 = r12 & 7
            r13 = r7
        L_0x0057:
            int r14 = r10 + r13
            if (r14 > r4) goto L_0x00dd
            int r14 = r10 >> 2
            r14 = r1[r14]
            r16 = r10 & 3
            int r16 = 3 - r16
            int r16 = r16 << 3
            int r14 = r14 >> r16
            int r10 = r10 + 1
            r15 = r14 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r15 != r5) goto L_0x00d8
            int r12 = r12 << 6
            r14 = r14 & 63
            r12 = r12 | r14
            if (r13 <= r6) goto L_0x00b4
            int r6 = r10 >> 2
            r6 = r1[r6]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r10 = r10 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            if (r14 != r5) goto L_0x00af
            int r12 = r12 << 6
            r6 = r6 & 63
            r6 = r6 | r12
            r12 = 2
            if (r13 <= r12) goto L_0x00ac
            int r12 = r10 >> 2
            r12 = r1[r12]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r12 = r12 >> r14
            int r10 = r10 + 1
            r14 = r12 & 192(0xc0, float:2.69E-43)
            if (r14 != r5) goto L_0x00a5
            int r5 = r6 << 6
            r6 = r12 & 63
            r5 = r5 | r6
            r12 = r5
            goto L_0x00b4
        L_0x00a5:
            r1 = r12 & 255(0xff, float:3.57E-43)
            r0.n2(r1)
            r5 = 0
            throw r5
        L_0x00ac:
            r5 = r12
            r12 = r6
            goto L_0x00b5
        L_0x00af:
            r5 = 0
            r0.n2(r6)
            throw r5
        L_0x00b4:
            r5 = 2
        L_0x00b5:
            if (r13 <= r5) goto L_0x00eb
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00c4
            i0.f.a.b.m.i r5 = r0.t2
            char[] r5 = r5.k()
            r8 = r5
        L_0x00c4:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
            goto L_0x00eb
        L_0x00d8:
            r0.n2(r14)
            r1 = 0
            throw r1
        L_0x00dd:
            r1 = 0
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            java.lang.String r3 = " in field name"
            r0.d1(r3, r2)
            throw r1
        L_0x00e6:
            r1 = 0
            r0.m2(r12)
            throw r1
        L_0x00eb:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00f5
            i0.f.a.b.m.i r5 = r0.t2
            char[] r5 = r5.k()
            r8 = r5
        L_0x00f5:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00fe:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x010b
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x010b:
            i0.f.a.b.k.a r3 = r0.R2
            java.lang.String r1 = r3.h(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.g.I2(int[], int, int):java.lang.String");
    }

    public final byte[] J1(Base64Variant base64Variant) throws IOException {
        c r1 = r1();
        while (true) {
            if (this.j2 >= this.k2) {
                V1();
            }
            byte[] bArr = this.Z2;
            int i = this.j2;
            this.j2 = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                int f = base64Variant.f(b);
                if (f < 0) {
                    if (b == 34) {
                        return r1.k();
                    }
                    f = p1(base64Variant, b, 0);
                    if (f < 0) {
                        continue;
                    }
                }
                if (this.j2 >= this.k2) {
                    V1();
                }
                byte[] bArr2 = this.Z2;
                int i2 = this.j2;
                this.j2 = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                int f2 = base64Variant.f(b2);
                if (f2 < 0) {
                    f2 = p1(base64Variant, b2, 1);
                }
                int i3 = (f << 6) | f2;
                if (this.j2 >= this.k2) {
                    V1();
                }
                byte[] bArr3 = this.Z2;
                int i4 = this.j2;
                this.j2 = i4 + 1;
                byte b3 = bArr3[i4] & 255;
                int f3 = base64Variant.f(b3);
                if (f3 < 0) {
                    if (f3 != -2) {
                        if (b3 == 34) {
                            r1.b(i3 >> 4);
                            if (!base64Variant.Z1) {
                                return r1.k();
                            }
                            this.j2--;
                            t1(base64Variant);
                            throw null;
                        }
                        f3 = p1(base64Variant, b3, 2);
                    }
                    if (f3 == -2) {
                        if (this.j2 >= this.k2) {
                            V1();
                        }
                        byte[] bArr4 = this.Z2;
                        int i5 = this.j2;
                        this.j2 = i5 + 1;
                        byte b4 = bArr4[i5] & 255;
                        if (base64Variant.m(b4) || p1(base64Variant, b4, 3) == -2) {
                            r1.b(i3 >> 4);
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("expected padding character '");
                            P0.append(base64Variant.y);
                            P0.append("'");
                            throw D1(base64Variant, b4, 3, P0.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | f3;
                if (this.j2 >= this.k2) {
                    V1();
                }
                byte[] bArr5 = this.Z2;
                int i7 = this.j2;
                this.j2 = i7 + 1;
                byte b5 = bArr5[i7] & 255;
                int f4 = base64Variant.f(b5);
                if (f4 < 0) {
                    if (f4 != -2) {
                        if (b5 == 34) {
                            r1.f(i6 >> 2);
                            if (!base64Variant.Z1) {
                                return r1.k();
                            }
                            this.j2--;
                            t1(base64Variant);
                            throw null;
                        }
                        f4 = p1(base64Variant, b5, 3);
                    }
                    if (f4 == -2) {
                        r1.f(i6 >> 2);
                    }
                }
                r1.e((i6 << 6) | f4);
            }
        }
    }

    public final String J2(int i, int i2) throws JsonParseException {
        int d2 = d2(i, i2);
        String m = this.R2.m(d2);
        if (m != null) {
            return m;
        }
        int[] iArr = this.S2;
        iArr[0] = d2;
        return I2(iArr, 1, i2);
    }

    public String K0() throws IOException {
        JsonToken jsonToken;
        this.y2 = 0;
        JsonToken jsonToken2 = this.f2;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            b2();
            return null;
        }
        if (this.T2) {
            w2();
        }
        int C2 = C2();
        if (C2 < 0) {
            close();
            this.f2 = null;
            return null;
        }
        this.x2 = null;
        if (C2 == 93) {
            H1();
            this.f2 = JsonToken.END_ARRAY;
            return null;
        } else if (C2 == 125) {
            I1();
            this.f2 = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this.r2.l()) {
                if (C2 == 44) {
                    C2 = A2();
                    if ((this.d & G2) != 0 && (C2 == 93 || C2 == 125)) {
                        if (C2 == 125) {
                            I1();
                            this.f2 = JsonToken.END_OBJECT;
                        } else {
                            H1();
                            this.f2 = JsonToken.END_ARRAY;
                        }
                        return null;
                    }
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("was expecting comma to separate ");
                    P0.append(this.r2.h());
                    P0.append(" entries");
                    f1(C2, P0.toString());
                    throw null;
                }
            }
            if (!this.r2.e()) {
                F2();
                c2(C2);
                return null;
            }
            this.W2 = this.m2;
            int i = this.j2;
            this.V2 = i;
            this.X2 = i - this.n2;
            String g2 = g2(C2);
            this.r2.n(g2);
            this.f2 = jsonToken3;
            int s2 = s2();
            F2();
            if (s2 == 34) {
                this.T2 = true;
                this.s2 = JsonToken.VALUE_STRING;
                return g2;
            }
            if (s2 == 45) {
                jsonToken = h2();
            } else if (s2 == 46) {
                jsonToken = f2();
            } else if (s2 == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (s2 == 102) {
                W1();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (s2 == 110) {
                X1();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (s2 == 116) {
                a2();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (s2 != 123) {
                switch (s2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = j2(s2);
                        break;
                    default:
                        jsonToken = T1(s2);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this.s2 = jsonToken;
            return g2;
        }
    }

    public int K1(int i) throws IOException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i3 & 224) == 192) {
            i2 = i3 & 31;
            c = 1;
        } else if ((i3 & 240) == 224) {
            i2 = i3 & 15;
            c = 2;
        } else if ((i3 & 248) == 240) {
            i2 = i3 & 7;
            c = 3;
        } else {
            m2(i3 & 255);
            throw null;
        }
        int N22 = N2();
        if ((N22 & 192) == 128) {
            int i4 = (i2 << 6) | (N22 & 63);
            if (c <= 1) {
                return i4;
            }
            int N23 = N2();
            if ((N23 & 192) == 128) {
                int i5 = (i4 << 6) | (N23 & 63);
                if (c <= 2) {
                    return i5;
                }
                int N24 = N2();
                if ((N24 & 192) == 128) {
                    return (i5 << 6) | (N24 & 63);
                }
                n2(N24 & 255);
                throw null;
            }
            n2(N23 & 255);
            throw null;
        }
        n2(N22 & 255);
        throw null;
    }

    public final String K2(int i, int i2, int i3) throws JsonParseException {
        int d2 = d2(i2, i3);
        String n = this.R2.n(i, d2);
        if (n != null) {
            return n;
        }
        int[] iArr = this.S2;
        iArr[0] = i;
        iArr[1] = d2;
        return I2(iArr, 2, i3);
    }

    public String L0() throws IOException {
        if (this.f2 == JsonToken.FIELD_NAME) {
            this.v2 = false;
            JsonToken jsonToken = this.s2;
            this.s2 = null;
            this.f2 = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this.r2 = this.r2.j(this.p2, this.q2);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this.r2 = this.r2.k(this.p2, this.q2);
                }
                return null;
            } else if (!this.T2) {
                return this.t2.h();
            } else {
                this.T2 = false;
                return P1();
            }
        } else if (M0() == JsonToken.VALUE_STRING) {
            return Z();
        } else {
            return null;
        }
    }

    public final int L1(int i) throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i2 = this.j2;
        int i3 = i2 + 1;
        this.j2 = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        o2(b & 255, i3);
        throw null;
    }

    public final String L2(int i, int i2, int i3, int i4) throws JsonParseException {
        int d2 = d2(i3, i4);
        String o = this.R2.o(i, i2, d2);
        if (o != null) {
            return o;
        }
        int[] iArr = this.S2;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = d2(d2, i4);
        return I2(iArr, 3, i4);
    }

    public JsonToken M0() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.f2;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return b2();
        }
        this.y2 = 0;
        if (this.T2) {
            w2();
        }
        int C2 = C2();
        if (C2 < 0) {
            close();
            this.f2 = null;
            return null;
        }
        this.x2 = null;
        if (C2 == 93) {
            H1();
            JsonToken jsonToken4 = JsonToken.END_ARRAY;
            this.f2 = jsonToken4;
            return jsonToken4;
        } else if (C2 == 125) {
            I1();
            JsonToken jsonToken5 = JsonToken.END_OBJECT;
            this.f2 = jsonToken5;
            return jsonToken5;
        } else {
            if (this.r2.l()) {
                if (C2 == 44) {
                    C2 = A2();
                    if ((this.d & G2) != 0 && (C2 == 93 || C2 == 125)) {
                        if (C2 == 125) {
                            I1();
                            JsonToken jsonToken6 = JsonToken.END_OBJECT;
                            this.f2 = jsonToken6;
                            return jsonToken6;
                        }
                        H1();
                        JsonToken jsonToken7 = JsonToken.END_ARRAY;
                        this.f2 = jsonToken7;
                        return jsonToken7;
                    }
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("was expecting comma to separate ");
                    P0.append(this.r2.h());
                    P0.append(" entries");
                    f1(C2, P0.toString());
                    throw null;
                }
            }
            if (!this.r2.e()) {
                F2();
                return c2(C2);
            }
            this.W2 = this.m2;
            int i = this.j2;
            this.V2 = i;
            this.X2 = i - this.n2;
            this.r2.n(g2(C2));
            this.f2 = jsonToken3;
            int s2 = s2();
            F2();
            if (s2 == 34) {
                this.T2 = true;
                this.s2 = JsonToken.VALUE_STRING;
                return this.f2;
            }
            if (s2 == 45) {
                jsonToken = h2();
            } else if (s2 == 46) {
                jsonToken = f2();
            } else if (s2 == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (s2 == 102) {
                W1();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (s2 == 110) {
                X1();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (s2 == 116) {
                a2();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (s2 != 123) {
                switch (s2) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = j2(s2);
                        break;
                    default:
                        jsonToken = T1(s2);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this.s2 = jsonToken;
            return this.f2;
        }
    }

    public final int M1(int i) throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        int i2 = i & 15;
        byte[] bArr = this.Z2;
        int i3 = this.j2;
        int i4 = i3 + 1;
        this.j2 = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            if (i4 >= this.k2) {
                V1();
            }
            byte[] bArr2 = this.Z2;
            int i5 = this.j2;
            int i6 = i5 + 1;
            this.j2 = i6;
            byte b3 = bArr2[i5];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            o2(b3 & 255, i6);
            throw null;
        }
        o2(b & 255, i4);
        throw null;
    }

    public final String M2(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = b.C1(iArr, iArr.length);
            this.S2 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = d2(i2, i3);
        String p = this.R2.p(iArr, i4);
        return p == null ? I2(iArr, i4, i3) : p;
    }

    public final int N1(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this.Z2;
        int i3 = this.j2;
        int i4 = i3 + 1;
        this.j2 = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            int i5 = i4 + 1;
            this.j2 = i5;
            byte b3 = bArr[i4];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            o2(b3 & 255, i5);
            throw null;
        }
        o2(b & 255, i4);
        throw null;
    }

    public final int N2() throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i = this.j2;
        this.j2 = i + 1;
        return bArr[i] & 255;
    }

    public final int O1(int i) throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i2 = this.j2;
        int i3 = i2 + 1;
        this.j2 = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            byte b2 = ((i & 7) << 6) | (b & 63);
            if (i3 >= this.k2) {
                V1();
            }
            byte[] bArr2 = this.Z2;
            int i4 = this.j2;
            int i5 = i4 + 1;
            this.j2 = i5;
            byte b3 = bArr2[i4];
            if ((b3 & 192) == 128) {
                byte b4 = (b2 << 6) | (b3 & 63);
                if (i5 >= this.k2) {
                    V1();
                }
                byte[] bArr3 = this.Z2;
                int i6 = this.j2;
                int i7 = i6 + 1;
                this.j2 = i7;
                byte b5 = bArr3[i6];
                if ((b5 & 192) == 128) {
                    return ((b4 << 6) | (b5 & 63)) - 65536;
                }
                o2(b5 & 255, i7);
                throw null;
            }
            o2(b3 & 255, i5);
            throw null;
        }
        o2(b & 255, i3);
        throw null;
    }

    public final String O2(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = P2;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    if (r10 > 0) {
                        if (i >= iArr.length) {
                            iArr = b.C1(iArr, iArr.length);
                            this.S2 = iArr;
                        }
                        iArr[i] = d2(r8, r10);
                        i++;
                    }
                    String p = this.R2.p(iArr, i);
                    return p == null ? I2(iArr, i, r10) : p;
                }
                if (i3 != 92) {
                    z1(i3, "name");
                } else {
                    i3 = q1();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = b.C1(iArr, iArr.length);
                            this.S2 = iArr;
                        }
                        iArr[i] = r8;
                        i++;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i6 = (r8 << 8) | (i3 >> 12) | 224;
                        int i7 = r10 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = b.C1(iArr, iArr.length);
                                this.S2 = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        r8 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = b.C1(iArr, iArr.length);
                    this.S2 = iArr;
                }
                iArr[i] = r8;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.j2 < this.k2 || U1()) {
                byte[] bArr = this.Z2;
                int i8 = this.j2;
                this.j2 = i8 + 1;
                i3 = bArr[i8] & 255;
            } else {
                d1(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    public String P1() throws IOException {
        int i = this.j2;
        if (i >= this.k2) {
            V1();
            i = this.j2;
        }
        int i2 = 0;
        char[] i3 = this.t2.i();
        int[] iArr = O2;
        int min = Math.min(this.k2, i3.length + i);
        byte[] bArr = this.Z2;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                i3[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.j2 = i + 1;
                return this.t2.s(i2);
            }
        }
        this.j2 = i;
        R1(i3, i2);
        return this.t2.h();
    }

    public final String P2(int i, int i2, int i3) throws IOException {
        return O2(this.S2, 0, i, i2, i3);
    }

    public int Q0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.T2 || this.f2 != JsonToken.VALUE_STRING) {
            byte[] n = n(base64Variant);
            outputStream.write(n);
            return n.length;
        }
        byte[] d = this.h2.d();
        try {
            return k2(base64Variant, outputStream, d);
        } finally {
            this.h2.e(d);
        }
    }

    public void Q1() throws IOException {
        int i = this.j2;
        if (i >= this.k2) {
            V1();
            i = this.j2;
        }
        int i2 = 0;
        char[] i3 = this.t2.i();
        int[] iArr = O2;
        int min = Math.min(this.k2, i3.length + i);
        byte[] bArr = this.Z2;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                i3[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.j2 = i + 1;
                this.t2.j = i2;
                return;
            }
        }
        this.j2 = i;
        R1(i3, i2);
    }

    public final String Q2(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.S2;
        iArr[0] = i;
        return O2(iArr, 1, i2, i3, i4);
    }

    public final void R1(char[] cArr, int i) throws IOException {
        int[] iArr = O2;
        byte[] bArr = this.Z2;
        while (true) {
            int i2 = this.j2;
            if (i2 >= this.k2) {
                V1();
                i2 = this.j2;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.t2.l();
                i = 0;
            }
            int min = Math.min(this.k2, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.j2 = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (iArr[i5] != 0) {
                    this.j2 = i4;
                    if (i5 == 34) {
                        this.t2.j = i;
                        return;
                    }
                    int i6 = iArr[i5];
                    if (i6 == 1) {
                        i5 = q1();
                    } else if (i6 == 2) {
                        i5 = L1(i5);
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            int O1 = O1(i5);
                            int i7 = i + 1;
                            cArr[i] = (char) (55296 | (O1 >> 10));
                            if (i7 >= cArr.length) {
                                cArr = this.t2.l();
                                i = 0;
                            } else {
                                i = i7;
                            }
                            i5 = (O1 & 1023) | 56320;
                        } else if (i5 < 32) {
                            z1(i5, "string value");
                        } else {
                            l2(i5);
                            throw null;
                        }
                    } else if (this.k2 - i4 >= 2) {
                        i5 = N1(i5);
                    } else {
                        i5 = M1(i5);
                    }
                    if (i >= cArr.length) {
                        cArr = this.t2.l();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    public final String R2(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.S2;
        iArr[0] = i;
        iArr[1] = i2;
        return O2(iArr, 2, i3, i4, i5);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public com.fasterxml.jackson.core.JsonToken S1(
/*
Method generation error in method: i0.f.a.b.j.g.S1(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r13 != 44) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r12.r2.d() == false) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x00ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken T1(int r13) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            r1 = 39
            r2 = 0
            r3 = 1
            if (r13 == r1) goto L_0x00a2
            r1 = 73
            if (r13 == r1) goto L_0x0087
            r1 = 78
            if (r13 == r1) goto L_0x006c
            r1 = 93
            if (r13 == r1) goto L_0x0045
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 == r1) goto L_0x0066
            r1 = 43
            if (r13 == r1) goto L_0x0021
            r0 = 44
            if (r13 == r0) goto L_0x004f
            goto L_0x015a
        L_0x0021:
            int r13 = r12.j2
            int r1 = r12.k2
            if (r13 < r1) goto L_0x0034
            boolean r13 = r12.U1()
            if (r13 == 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            com.fasterxml.jackson.core.JsonToken r13 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r12.e1(r13)
            throw r2
        L_0x0034:
            byte[] r13 = r12.Z2
            int r1 = r12.j2
            int r2 = r1 + 1
            r12.j2 = r2
            byte r13 = r13[r1]
            r13 = r13 & 255(0xff, float:3.57E-43)
            com.fasterxml.jackson.core.JsonToken r13 = r12.S1(r13, r0)
            return r13
        L_0x0045:
            i0.f.a.b.j.d r0 = r12.r2
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x004f
            goto L_0x015a
        L_0x004f:
            i0.f.a.b.j.d r0 = r12.r2
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0066
            int r0 = r12.d
            int r1 = J2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0066
            int r13 = r12.j2
            int r13 = r13 - r3
            r12.j2 = r13
            com.fasterxml.jackson.core.JsonToken r13 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r13
        L_0x0066:
            java.lang.String r0 = "expected a value"
            r12.f1(r13, r0)
            throw r2
        L_0x006c:
            java.lang.String r13 = "NaN"
            r12.Y1(r13, r3)
            int r0 = r12.d
            int r1 = I2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x007f
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r13 = r12.E1(r13, r0)
            return r13
        L_0x007f:
            com.fasterxml.jackson.core.JsonParseException r13 = new com.fasterxml.jackson.core.JsonParseException
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r13.<init>(r12, r0)
            throw r13
        L_0x0087:
            java.lang.String r13 = "Infinity"
            r12.Y1(r13, r3)
            int r0 = r12.d
            int r1 = I2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009a
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r13 = r12.E1(r13, r0)
            return r13
        L_0x009a:
            com.fasterxml.jackson.core.JsonParseException r13 = new com.fasterxml.jackson.core.JsonParseException
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r13.<init>(r12, r0)
            throw r13
        L_0x00a2:
            int r4 = r12.d
            int r5 = K2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x015a
            i0.f.a.b.m.i r13 = r12.t2
            char[] r13 = r13.i()
            int[] r4 = O2
            byte[] r5 = r12.Z2
            r6 = r0
        L_0x00b4:
            int r7 = r12.j2
            int r8 = r12.k2
            if (r7 < r8) goto L_0x00bd
            r12.V1()
        L_0x00bd:
            int r7 = r13.length
            if (r6 < r7) goto L_0x00c7
            i0.f.a.b.m.i r13 = r12.t2
            char[] r13 = r13.l()
            r6 = r0
        L_0x00c7:
            int r7 = r12.k2
            int r8 = r12.j2
            int r9 = r13.length
            int r9 = r9 - r6
            int r9 = r9 + r8
            if (r9 >= r7) goto L_0x00d1
            r7 = r9
        L_0x00d1:
            int r8 = r12.j2
            if (r8 >= r7) goto L_0x00b4
            int r9 = r8 + 1
            r12.j2 = r9
            byte r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 == r1) goto L_0x00eb
            r10 = r4[r8]
            if (r10 == 0) goto L_0x00e4
            goto L_0x00eb
        L_0x00e4:
            int r9 = r6 + 1
            char r8 = (char) r8
            r13[r6] = r8
            r6 = r9
            goto L_0x00d1
        L_0x00eb:
            if (r8 != r1) goto L_0x00f4
            i0.f.a.b.m.i r13 = r12.t2
            r13.j = r6
            com.fasterxml.jackson.core.JsonToken r13 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            return r13
        L_0x00f4:
            r7 = r4[r8]
            if (r7 == r3) goto L_0x0144
            r10 = 2
            if (r7 == r10) goto L_0x013f
            r11 = 3
            if (r7 == r11) goto L_0x0130
            r9 = 4
            if (r7 == r9) goto L_0x010e
            r13 = 32
            if (r8 >= r13) goto L_0x010a
            java.lang.String r13 = "string value"
            r12.z1(r8, r13)
        L_0x010a:
            r12.l2(r8)
            throw r2
        L_0x010e:
            int r7 = r12.O1(r8)
            int r8 = r6 + 1
            r9 = 55296(0xd800, float:7.7486E-41)
            int r10 = r7 >> 10
            r9 = r9 | r10
            char r9 = (char) r9
            r13[r6] = r9
            int r6 = r13.length
            if (r8 < r6) goto L_0x0128
            i0.f.a.b.m.i r13 = r12.t2
            char[] r13 = r13.l()
            r6 = r0
            goto L_0x0129
        L_0x0128:
            r6 = r8
        L_0x0129:
            r8 = 56320(0xdc00, float:7.8921E-41)
            r7 = r7 & 1023(0x3ff, float:1.434E-42)
            r7 = r7 | r8
            goto L_0x0148
        L_0x0130:
            int r7 = r12.k2
            int r7 = r7 - r9
            if (r7 < r10) goto L_0x013a
            int r7 = r12.N1(r8)
            goto L_0x0148
        L_0x013a:
            int r7 = r12.M1(r8)
            goto L_0x0148
        L_0x013f:
            int r7 = r12.L1(r8)
            goto L_0x0148
        L_0x0144:
            char r7 = r12.q1()
        L_0x0148:
            int r8 = r13.length
            if (r6 < r8) goto L_0x0152
            i0.f.a.b.m.i r13 = r12.t2
            char[] r13 = r13.l()
            r6 = r0
        L_0x0152:
            int r8 = r6 + 1
            char r7 = (char) r7
            r13[r6] = r7
            r6 = r8
            goto L_0x00b4
        L_0x015a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r13)
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            char r13 = (char) r13
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = r12.A1()
            r12.q2(r13, r0)
            throw r2
        L_0x0176:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = r12.A1()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.f1(r13, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.g.T1(int):com.fasterxml.jackson.core.JsonToken");
    }

    public f<StreamReadCapability> U() {
        return b.g2;
    }

    public final boolean U1() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.Y2;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.Z2), 0, length);
        if (read > 0) {
            int i = this.k2;
            this.l2 += (long) i;
            this.n2 -= i;
            this.V2 -= i;
            this.j2 = 0;
            this.k2 = read;
            return true;
        }
        n1();
        if (read == 0) {
            throw new IOException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("InputStream.read() returned 0 characters when trying to read "), this.Z2.length, " bytes"));
        }
        return false;
    }

    public void V1() throws IOException {
        if (!U1()) {
            c1();
            throw null;
        }
    }

    public final void W1() throws IOException {
        byte b;
        int i = this.j2;
        if (i + 4 < this.k2) {
            byte[] bArr = this.Z2;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 115) {
                        int i5 = i4 + 1;
                        if (bArr[i4] == 101 && ((b = bArr[i5] & 255) < 48 || b == 93 || b == 125)) {
                            this.j2 = i5;
                            return;
                        }
                    }
                }
            }
        }
        Z1("false", 1);
    }

    public final void X1() throws IOException {
        byte b;
        int i = this.j2;
        if (i + 3 < this.k2) {
            byte[] bArr = this.Z2;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 108 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.j2 = i4;
                        return;
                    }
                }
            }
        }
        Z1("null", 1);
    }

    public final void Y1(String str, int i) throws IOException {
        int length = str.length();
        if (this.j2 + length >= this.k2) {
            Z1(str, i);
            return;
        }
        while (this.Z2[this.j2] == str.charAt(i)) {
            int i2 = this.j2 + 1;
            this.j2 = i2;
            i++;
            if (i >= length) {
                byte b = this.Z2[i2] & 255;
                if (b >= 48 && b != 93 && b != 125) {
                    G1(str, i, b);
                    return;
                }
                return;
            }
        }
        p2(str.substring(0, i));
        throw null;
    }

    public String Z() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.T2) {
                return this.t2.h();
            }
            this.T2 = false;
            return P1();
        } else if (jsonToken == null) {
            return null;
        } else {
            int id = jsonToken.id();
            if (id == 5) {
                return this.r2.f;
            }
            if (id == 6 || id == 7 || id == 8) {
                return this.t2.h();
            }
            return jsonToken.asString();
        }
    }

    public final void Z1(String str, int i) throws IOException {
        int i2;
        byte b;
        int length = str.length();
        do {
            if ((this.j2 < this.k2 || U1()) && this.Z2[this.j2] == str.charAt(i)) {
                i2 = this.j2 + 1;
                this.j2 = i2;
                i++;
            } else {
                p2(str.substring(0, i));
                throw null;
            }
        } while (i < length);
        if ((i2 < this.k2 || U1()) && (b = this.Z2[this.j2] & 255) >= 48 && b != 93 && b != 125) {
            G1(str, i, b);
        }
    }

    public final void a2() throws IOException {
        byte b;
        int i = this.j2;
        if (i + 3 < this.k2) {
            byte[] bArr = this.Z2;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i2 + 1;
                if (bArr[i2] == 117) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 101 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.j2 = i4;
                        return;
                    }
                }
            }
        }
        Z1("true", 1);
    }

    public char[] b0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this.f2.asCharArray();
                }
            } else if (this.T2) {
                this.T2 = false;
                Q1();
            }
            return this.t2.n();
        }
        if (!this.v2) {
            String str = this.r2.f;
            int length = str.length();
            char[] cArr = this.u2;
            if (cArr == null) {
                i0.f.a.b.i.b bVar = this.h2;
                bVar.a(bVar.i);
                char[] b = bVar.d.b(3, length);
                bVar.i = b;
                this.u2 = b;
            } else if (cArr.length < length) {
                this.u2 = new char[length];
            }
            str.getChars(0, length, this.u2, 0);
            this.v2 = true;
        }
        return this.u2;
    }

    public final JsonToken b2() {
        this.v2 = false;
        JsonToken jsonToken = this.s2;
        this.s2 = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.r2 = this.r2.j(this.p2, this.q2);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.r2 = this.r2.k(this.p2, this.q2);
        }
        this.f2 = jsonToken;
        return jsonToken;
    }

    public int c0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this.r2.f.length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this.f2.asCharArray().length;
            }
        } else if (this.T2) {
            this.T2 = false;
            Q1();
        }
        return this.t2.t();
    }

    public final JsonToken c2(int i) throws IOException {
        if (i == 34) {
            this.T2 = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f2 = jsonToken;
            return jsonToken;
        } else if (i == 45) {
            JsonToken h2 = h2();
            this.f2 = h2;
            return h2;
        } else if (i == 46) {
            JsonToken f2 = f2();
            this.f2 = f2;
            return f2;
        } else if (i == 91) {
            this.r2 = this.r2.j(this.p2, this.q2);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f2 = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            W1();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f2 = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            X1();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f2 = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            a2();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f2 = jsonToken5;
            return jsonToken5;
        } else if (i != 123) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken j2 = j2(i);
                    this.f2 = j2;
                    return j2;
                default:
                    JsonToken T1 = T1(i);
                    this.f2 = T1;
                    return T1;
            }
        } else {
            this.r2 = this.r2.k(this.p2, this.q2);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f2 = jsonToken6;
            return jsonToken6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d0() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f2
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3.T2
            if (r0 == 0) goto L_0x001d
            r3.T2 = r1
            r3.Q1()
        L_0x001d:
            i0.f.a.b.m.i r0 = r3.t2
            int r0 = r0.o()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.g.d0():int");
    }

    public final JsonToken e2(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        boolean z2;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.t2.l();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i4 = 0;
            while (true) {
                if (this.j2 >= this.k2 && !U1()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.Z2;
                int i5 = this.j2;
                this.j2 = i5 + 1;
                i2 = bArr[i5] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = this.t2.l();
                        i = 0;
                    }
                    cArr[i] = (char) i2;
                    i++;
                }
            }
            z2 = false;
            if (i4 == 0) {
                l1(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i >= cArr.length) {
                cArr = this.t2.l();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) r12;
            if (this.j2 >= this.k2) {
                V1();
            }
            byte[] bArr2 = this.Z2;
            int i7 = this.j2;
            this.j2 = i7 + 1;
            byte b = bArr2[i7] & 255;
            if (b == 45 || b == 43) {
                if (i6 >= cArr.length) {
                    cArr = this.t2.l();
                    i6 = 0;
                }
                int i8 = i6 + 1;
                cArr[i6] = (char) b;
                if (this.j2 >= this.k2) {
                    V1();
                }
                byte[] bArr3 = this.Z2;
                int i9 = this.j2;
                this.j2 = i9 + 1;
                b = bArr3[i9] & 255;
                i6 = i8;
            }
            r12 = b;
            int i10 = 0;
            while (true) {
                if (r12 < 48 || r12 > 57) {
                    break;
                }
                i10++;
                if (i6 >= cArr.length) {
                    cArr = this.t2.l();
                    i6 = 0;
                }
                int i11 = i6 + 1;
                cArr[i6] = (char) r12;
                if (this.j2 >= this.k2 && !U1()) {
                    z2 = true;
                    i6 = i11;
                    break;
                }
                byte[] bArr4 = this.Z2;
                int i12 = this.j2;
                this.j2 = i12 + 1;
                r12 = bArr4[i12] & 255;
                i6 = i11;
            }
            if (i10 != 0) {
                i = i6;
            } else {
                l1(r12, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.j2--;
            if (this.r2.f()) {
                H2(r12);
            }
        }
        this.t2.j = i;
        this.E2 = z;
        this.F2 = i3;
        this.y2 = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public JsonLocation f0() {
        if (this.f2 == JsonToken.FIELD_NAME) {
            return new JsonLocation(s1(), this.l2 + ((long) (this.V2 - 1)), -1, this.W2, this.X2);
        }
        return new JsonLocation(s1(), this.o2 - 1, -1, this.p2, this.q2);
    }

    public final JsonToken f2() throws IOException {
        if (!C0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return T1(46);
        }
        return e2(this.t2.i(), 0, 46, false, 0);
    }

    public final String g2(int i) throws IOException {
        String p;
        int i2;
        int i3;
        byte b = i;
        int i4 = 0;
        if (b != 34) {
            if (b != 39 || (this.d & K2) == 0) {
                if ((this.d & L2) != 0) {
                    int[] iArr = a.f;
                    if (iArr[b] == 0) {
                        int i5 = 0;
                        int[] iArr2 = this.S2;
                        int i6 = 0;
                        while (true) {
                            if (i4 < 4) {
                                i4++;
                                i5 = b | (i5 << 8);
                            } else {
                                if (i6 >= iArr2.length) {
                                    iArr2 = b.C1(iArr2, iArr2.length);
                                    this.S2 = iArr2;
                                }
                                iArr2[i6] = i5;
                                i5 = b;
                                i6++;
                                i4 = 1;
                            }
                            if (this.j2 < this.k2 || U1()) {
                                byte[] bArr = this.Z2;
                                int i7 = this.j2;
                                b = bArr[i7] & 255;
                                if (iArr[b] != 0) {
                                    if (i4 > 0) {
                                        if (i6 >= iArr2.length) {
                                            int[] C1 = b.C1(iArr2, iArr2.length);
                                            this.S2 = C1;
                                            iArr2 = C1;
                                        }
                                        iArr2[i6] = i5;
                                        i6++;
                                    }
                                    p = this.R2.p(iArr2, i6);
                                    if (p == null) {
                                        p = I2(iArr2, i6, i4);
                                    }
                                } else {
                                    this.j2 = i7 + 1;
                                }
                            } else {
                                d1(" in field name", JsonToken.FIELD_NAME);
                                throw null;
                            }
                        }
                    } else {
                        f1(b, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                        throw null;
                    }
                } else {
                    f1((char) K1(i), "was expecting double-quote to start field name");
                    throw null;
                }
            } else if (this.j2 < this.k2 || U1()) {
                byte[] bArr2 = this.Z2;
                int i8 = this.j2;
                this.j2 = i8 + 1;
                char c = bArr2[i8] & 255;
                if (c == '\'') {
                    return "";
                }
                int[] iArr3 = this.S2;
                int[] iArr4 = P2;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (c != '\'') {
                    if (!(iArr4[c] == 0 || c == '\"')) {
                        if (c != '\\') {
                            z1(c, "name");
                        } else {
                            c = q1();
                        }
                        if (c > 127) {
                            if (i3 >= 4) {
                                if (i10 >= iArr3.length) {
                                    iArr3 = b.C1(iArr3, iArr3.length);
                                    this.S2 = iArr3;
                                }
                                iArr3[i10] = i2;
                                i2 = 0;
                                i10++;
                                i3 = 0;
                            }
                            int i12 = i2 << 8;
                            if (c < 2048) {
                                i2 = i12 | (c >> 6) | 192;
                                i3++;
                            } else {
                                int i13 = i12 | (c >> 12) | 224;
                                int i14 = i3 + 1;
                                if (i14 >= 4) {
                                    if (i10 >= iArr3.length) {
                                        iArr3 = b.C1(iArr3, iArr3.length);
                                        this.S2 = iArr3;
                                    }
                                    iArr3[i10] = i13;
                                    i13 = 0;
                                    i10++;
                                    i14 = 0;
                                }
                                i2 = (i13 << 8) | ((c >> 6) & 63) | 128;
                                i3 = i14 + 1;
                            }
                            c = (c & '?') | 128;
                        }
                    }
                    if (i3 < 4) {
                        i9 = i3 + 1;
                        i11 = c | (i2 << 8);
                    } else {
                        if (i10 >= iArr3.length) {
                            iArr3 = b.C1(iArr3, iArr3.length);
                            this.S2 = iArr3;
                        }
                        iArr3[i10] = i2;
                        i11 = c;
                        i10++;
                        i9 = 1;
                    }
                    if (this.j2 < this.k2 || U1()) {
                        byte[] bArr3 = this.Z2;
                        int i15 = this.j2;
                        this.j2 = i15 + 1;
                        c = bArr3[i15] & 255;
                    } else {
                        d1(" in field name", JsonToken.FIELD_NAME);
                        throw null;
                    }
                }
                if (i3 > 0) {
                    if (i10 >= iArr3.length) {
                        int[] C12 = b.C1(iArr3, iArr3.length);
                        this.S2 = C12;
                        iArr3 = C12;
                    }
                    iArr3[i10] = d2(i2, i3);
                    i10++;
                }
                p = this.R2.p(iArr3, i10);
                if (p == null) {
                    return I2(iArr3, i10, i3);
                }
            } else {
                d1(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
                throw null;
            }
            return p;
        }
        int i16 = this.j2;
        int i17 = i16 + 13;
        int i18 = this.k2;
        if (i17 <= i18) {
            byte[] bArr4 = this.Z2;
            int[] iArr5 = P2;
            int i19 = i16 + 1;
            this.j2 = i19;
            byte b2 = bArr4[i16] & 255;
            if (iArr5[b2] == 0) {
                int i20 = i19 + 1;
                this.j2 = i20;
                byte b3 = bArr4[i19] & 255;
                if (iArr5[b3] == 0) {
                    byte b4 = (b2 << 8) | b3;
                    int i21 = i20 + 1;
                    this.j2 = i21;
                    byte b5 = bArr4[i20] & 255;
                    if (iArr5[b5] == 0) {
                        byte b6 = (b4 << 8) | b5;
                        int i22 = i21 + 1;
                        this.j2 = i22;
                        byte b7 = bArr4[i21] & 255;
                        if (iArr5[b7] == 0) {
                            int i23 = b7 | (b6 << 8);
                            int i24 = i22 + 1;
                            this.j2 = i24;
                            byte b8 = bArr4[i22] & 255;
                            if (iArr5[b8] == 0) {
                                this.U2 = i23;
                                int i25 = i24 + 1;
                                this.j2 = i25;
                                byte b9 = bArr4[i24] & 255;
                                if (iArr5[b9] == 0) {
                                    byte b10 = b9 | (b8 << 8);
                                    int i26 = i25 + 1;
                                    this.j2 = i26;
                                    byte b11 = bArr4[i25] & 255;
                                    if (iArr5[b11] == 0) {
                                        byte b12 = (b10 << 8) | b11;
                                        int i27 = i26 + 1;
                                        this.j2 = i27;
                                        byte b13 = bArr4[i26] & 255;
                                        if (iArr5[b13] == 0) {
                                            int i28 = b13 | (b12 << 8);
                                            int i29 = i27 + 1;
                                            this.j2 = i29;
                                            byte b14 = bArr4[i27] & 255;
                                            if (iArr5[b14] == 0) {
                                                int i30 = i29 + 1;
                                                this.j2 = i30;
                                                byte b15 = bArr4[i29] & 255;
                                                if (iArr5[b15] == 0) {
                                                    byte b16 = (b14 << 8) | b15;
                                                    int i31 = i30 + 1;
                                                    this.j2 = i31;
                                                    byte b17 = bArr4[i30] & 255;
                                                    if (iArr5[b17] == 0) {
                                                        byte b18 = (b16 << 8) | b17;
                                                        int i32 = i31 + 1;
                                                        this.j2 = i32;
                                                        byte b19 = bArr4[i31] & 255;
                                                        if (iArr5[b19] == 0) {
                                                            int i33 = (b18 << 8) | b19;
                                                            this.j2 = i32 + 1;
                                                            byte b20 = bArr4[i32] & 255;
                                                            if (iArr5[b20] == 0) {
                                                                int[] iArr6 = this.S2;
                                                                iArr6[0] = i23;
                                                                iArr6[1] = i28;
                                                                iArr6[2] = i33;
                                                                int i34 = 3;
                                                                while (true) {
                                                                    int i35 = this.j2;
                                                                    if (i35 + 4 <= this.k2) {
                                                                        int i36 = i35 + 1;
                                                                        this.j2 = i36;
                                                                        byte b21 = bArr4[i35] & 255;
                                                                        if (iArr5[b21] == 0) {
                                                                            byte b22 = b21 | (b20 << 8);
                                                                            int i37 = i36 + 1;
                                                                            this.j2 = i37;
                                                                            byte b23 = bArr4[i36] & 255;
                                                                            if (iArr5[b23] == 0) {
                                                                                byte b24 = (b22 << 8) | b23;
                                                                                int i38 = i37 + 1;
                                                                                this.j2 = i38;
                                                                                byte b25 = bArr4[i37] & 255;
                                                                                if (iArr5[b25] == 0) {
                                                                                    int i39 = (b24 << 8) | b25;
                                                                                    this.j2 = i38 + 1;
                                                                                    b20 = bArr4[i38] & 255;
                                                                                    if (iArr5[b20] == 0) {
                                                                                        int[] iArr7 = this.S2;
                                                                                        if (i34 >= iArr7.length) {
                                                                                            this.S2 = b.C1(iArr7, i34);
                                                                                        }
                                                                                        this.S2[i34] = i39;
                                                                                        i34++;
                                                                                    } else if (b20 == 34) {
                                                                                        return M2(this.S2, i34, i39, 4);
                                                                                    } else {
                                                                                        return O2(this.S2, i34, i39, b20, 4);
                                                                                    }
                                                                                } else if (b25 == 34) {
                                                                                    return M2(this.S2, i34, b24, 3);
                                                                                } else {
                                                                                    return O2(this.S2, i34, b24, b25, 3);
                                                                                }
                                                                            } else if (b23 == 34) {
                                                                                return M2(this.S2, i34, b22, 2);
                                                                            } else {
                                                                                return O2(this.S2, i34, b22, b23, 2);
                                                                            }
                                                                        } else if (b21 == 34) {
                                                                            return M2(this.S2, i34, b20, 1);
                                                                        } else {
                                                                            return O2(this.S2, i34, b20, b21, 1);
                                                                        }
                                                                    } else {
                                                                        return O2(this.S2, i34, 0, b20, 0);
                                                                    }
                                                                }
                                                            } else if (b20 == 34) {
                                                                return L2(i23, i28, i33, 4);
                                                            } else {
                                                                return R2(i23, i28, i33, b20, 4);
                                                            }
                                                        } else if (b19 == 34) {
                                                            return L2(i23, i28, b18, 3);
                                                        } else {
                                                            return R2(i23, i28, b18, b19, 3);
                                                        }
                                                    } else if (b17 == 34) {
                                                        return L2(i23, i28, b16, 2);
                                                    } else {
                                                        return R2(i23, i28, b16, b17, 2);
                                                    }
                                                } else if (b15 == 34) {
                                                    return L2(i23, i28, b14, 1);
                                                } else {
                                                    return R2(i23, i28, b14, b15, 1);
                                                }
                                            } else if (b14 == 34) {
                                                return K2(i23, i28, 4);
                                            } else {
                                                return Q2(i23, i28, b14, 4);
                                            }
                                        } else if (b13 == 34) {
                                            return K2(i23, b12, 3);
                                        } else {
                                            return Q2(i23, b12, b13, 3);
                                        }
                                    } else if (b11 == 34) {
                                        return K2(i23, b10, 2);
                                    } else {
                                        return Q2(i23, b10, b11, 2);
                                    }
                                } else if (b9 == 34) {
                                    return K2(i23, b8, 1);
                                } else {
                                    return Q2(i23, b8, b9, 1);
                                }
                            } else if (b8 == 34) {
                                return J2(i23, 4);
                            } else {
                                return P2(i23, b8, 4);
                            }
                        } else if (b7 == 34) {
                            return J2(b6, 3);
                        } else {
                            return P2(b6, b7, 3);
                        }
                    } else if (b5 == 34) {
                        return J2(b4, 2);
                    } else {
                        return P2(b4, b5, 2);
                    }
                } else if (b3 == 34) {
                    return J2(b2, 1);
                } else {
                    return P2(b2, b3, 1);
                }
            } else if (b2 == 34) {
                return "";
            } else {
                return P2(0, b2, 0);
            }
        } else if (i16 < i18 || U1()) {
            byte[] bArr5 = this.Z2;
            int i40 = this.j2;
            this.j2 = i40 + 1;
            byte b26 = bArr5[i40] & 255;
            if (b26 == 34) {
                return "";
            }
            return O2(this.S2, 0, 0, b26, 0);
        } else {
            d1(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
            throw null;
        }
    }

    public JsonToken h2() throws IOException {
        int i;
        byte b;
        char[] i2 = this.t2.i();
        i2[0] = '-';
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i3 = this.j2;
        this.j2 = i3 + 1;
        int i4 = bArr[i3] & 255;
        if (i4 <= 48) {
            if (i4 != 48) {
                return S1(i4, true);
            }
            i4 = G2();
        } else if (i4 > 57) {
            return S1(i4, true);
        }
        int i5 = 2;
        i2[1] = (char) i4;
        int min = Math.min(this.k2, (this.j2 + i2.length) - 2);
        int i6 = 1;
        while (true) {
            int i7 = this.j2;
            if (i7 >= min) {
                return i2(i2, i5, true, i6);
            }
            byte[] bArr2 = this.Z2;
            i = i7 + 1;
            this.j2 = i;
            b = bArr2[i7] & 255;
            if (b >= 48 && b <= 57) {
                i6++;
                i2[i5] = (char) b;
                i5++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return e2(i2, i5, b, true, i6);
        }
        this.j2 = i - 1;
        this.t2.j = i5;
        if (this.r2.f()) {
            H2(b);
        }
        return F1(true, i6);
    }

    public int i0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.m0(0);
        }
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

    public final JsonToken i2(char[] cArr, int i, boolean z, int i2) throws IOException {
        int i3;
        byte b;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            if (this.j2 < this.k2 || U1()) {
                byte[] bArr = this.Z2;
                int i6 = this.j2;
                i3 = i6 + 1;
                this.j2 = i3;
                b = bArr[i6] & 255;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        cArr2 = this.t2.l();
                        i4 = 0;
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                this.t2.j = i4;
                this.E2 = z;
                this.F2 = i5;
                this.y2 = 0;
                return JsonToken.VALUE_NUMBER_INT;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return e2(cArr2, i4, b, z, i5);
        }
        this.j2 = i3 - 1;
        this.t2.j = i4;
        if (this.r2.f()) {
            H2(this.Z2[this.j2] & 255);
        }
        this.E2 = z;
        this.F2 = i5;
        this.y2 = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public JsonToken j2(int i) throws IOException {
        int i2;
        byte b;
        char[] i3 = this.t2.i();
        if (i == 48) {
            i = G2();
        }
        i3[0] = (char) i;
        int min = Math.min(this.k2, (this.j2 + i3.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int i6 = this.j2;
            if (i6 >= min) {
                return i2(i3, i4, false, i5);
            }
            byte[] bArr = this.Z2;
            i2 = i6 + 1;
            this.j2 = i2;
            b = bArr[i6] & 255;
            if (b >= 48 && b <= 57) {
                i5++;
                i3[i4] = (char) b;
                i4++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return e2(i3, i4, b, false, i5);
        }
        this.j2 = i2 - 1;
        this.t2.j = i4;
        if (this.r2.f()) {
            H2(b);
        }
        return F1(false, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0120, code lost:
        r6 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int k2(com.fasterxml.jackson.core.Base64Variant r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r3.length
            r5 = 3
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x000e:
            int r9 = r0.j2
            int r10 = r0.k2
            if (r9 < r10) goto L_0x0017
            r17.V1()
        L_0x0017:
            byte[] r9 = r0.Z2
            int r10 = r0.j2
            int r11 = r10 + 1
            r0.j2 = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 32
            if (r9 <= r10) goto L_0x000e
            int r10 = r1.f(r9)
            r11 = 34
            if (r10 >= 0) goto L_0x003a
            if (r9 != r11) goto L_0x0033
            goto L_0x0121
        L_0x0033:
            int r10 = r0.p1(r1, r9, r6)
            if (r10 >= 0) goto L_0x003a
            goto L_0x000e
        L_0x003a:
            if (r7 <= r4) goto L_0x0041
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            goto L_0x0042
        L_0x0041:
            r6 = r7
        L_0x0042:
            int r7 = r0.j2
            int r9 = r0.k2
            if (r7 < r9) goto L_0x004b
            r17.V1()
        L_0x004b:
            byte[] r7 = r0.Z2
            int r9 = r0.j2
            int r12 = r9 + 1
            r0.j2 = r12
            byte r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r1.f(r7)
            r12 = 1
            if (r9 >= 0) goto L_0x0062
            int r9 = r0.p1(r1, r7, r12)
        L_0x0062:
            int r7 = r10 << 6
            r7 = r7 | r9
            int r9 = r0.j2
            int r10 = r0.k2
            if (r9 < r10) goto L_0x006e
            r17.V1()
        L_0x006e:
            byte[] r9 = r0.Z2
            int r10 = r0.j2
            int r13 = r10 + 1
            r0.j2 = r13
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r1.f(r9)
            r13 = -2
            r14 = 0
            r15 = 2
            if (r10 >= 0) goto L_0x00eb
            if (r10 == r13) goto L_0x00a3
            if (r9 != r11) goto L_0x009e
            int r4 = r7 >> 4
            int r5 = r6 + 1
            byte r4 = (byte) r4
            r3[r6] = r4
            boolean r4 = r1.Z1
            if (r4 != 0) goto L_0x0095
            r7 = r5
            goto L_0x0120
        L_0x0095:
            int r2 = r0.j2
            int r2 = r2 - r12
            r0.j2 = r2
            r17.t1(r18)
            throw r14
        L_0x009e:
            int r9 = r0.p1(r1, r9, r15)
            r10 = r9
        L_0x00a3:
            if (r10 != r13) goto L_0x00eb
            int r9 = r0.j2
            int r10 = r0.k2
            if (r9 < r10) goto L_0x00ae
            r17.V1()
        L_0x00ae:
            byte[] r9 = r0.Z2
            int r10 = r0.j2
            int r11 = r10 + 1
            r0.j2 = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            boolean r10 = r1.m(r9)
            if (r10 != 0) goto L_0x00e0
            int r10 = r0.p1(r1, r9, r5)
            if (r10 != r13) goto L_0x00c7
            goto L_0x00e0
        L_0x00c7:
            java.lang.String r2 = "expected padding character '"
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            char r3 = r1.y
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = r0.D1(r1, r9, r5, r2)
            throw r1
        L_0x00e0:
            int r7 = r7 >> 4
            int r9 = r6 + 1
            byte r7 = (byte) r7
            r3[r6] = r7
            r6 = 0
            r7 = r9
            goto L_0x000e
        L_0x00eb:
            int r5 = r7 << 6
            r5 = r5 | r10
            int r7 = r0.j2
            int r9 = r0.k2
            if (r7 < r9) goto L_0x00f7
            r17.V1()
        L_0x00f7:
            byte[] r7 = r0.Z2
            int r9 = r0.j2
            int r10 = r9 + 1
            r0.j2 = r10
            byte r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r1.f(r7)
            if (r9 >= 0) goto L_0x0159
            if (r9 == r13) goto L_0x013f
            if (r7 != r11) goto L_0x0133
            int r4 = r5 >> 2
            int r5 = r6 + 1
            int r7 = r4 >> 8
            byte r7 = (byte) r7
            r3[r6] = r7
            int r6 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r1.Z1
            if (r4 != 0) goto L_0x012a
            r7 = r6
        L_0x0120:
            r6 = 0
        L_0x0121:
            r0.T2 = r6
            if (r7 <= 0) goto L_0x0129
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L_0x0129:
            return r8
        L_0x012a:
            int r2 = r0.j2
            int r2 = r2 - r12
            r0.j2 = r2
            r17.t1(r18)
            throw r14
        L_0x0133:
            r9 = 0
            r10 = 3
            int r7 = r0.p1(r1, r7, r10)
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x0141
        L_0x013f:
            r7 = 0
            r10 = 3
        L_0x0141:
            if (r9 != r13) goto L_0x015b
            int r5 = r5 >> 2
            int r9 = r6 + 1
            int r11 = r5 >> 8
            byte r11 = (byte) r11
            r3[r6] = r11
            int r6 = r9 + 1
            byte r5 = (byte) r5
            r3[r9] = r5
            r5 = r10
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x000e
        L_0x0159:
            r7 = 0
            r10 = 3
        L_0x015b:
            int r5 = r5 << 6
            r5 = r5 | r9
            int r9 = r6 + 1
            int r11 = r5 >> 16
            byte r11 = (byte) r11
            r3[r6] = r11
            int r6 = r9 + 1
            int r11 = r5 >> 8
            byte r11 = (byte) r11
            r3[r9] = r11
            int r9 = r6 + 1
            byte r5 = (byte) r5
            r3[r6] = r5
            r6 = r7
            r7 = r9
            r5 = r10
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.g.k2(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    public void l2(int i) throws JsonParseException {
        if (i < 32) {
            g1(i);
            throw null;
        } else {
            m2(i);
            throw null;
        }
    }

    public int m0(int i) throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.m0(i);
        }
        int i2 = this.y2;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return v1();
            }
            if ((i2 & 1) == 0) {
                B1();
            }
        }
        return this.z2;
    }

    public void m2(int i) throws JsonParseException {
        throw new JsonParseException(this, i0.d.a.a.a.R(i, i0.d.a.a.a.P0("Invalid UTF-8 start byte 0x")));
    }

    public byte[] n(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING || (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && this.x2 != null)) {
            if (this.T2) {
                try {
                    this.x2 = J1(base64Variant);
                    this.T2 = false;
                } catch (IllegalArgumentException e) {
                    throw new JsonParseException(this, "Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
                }
            } else if (this.x2 == null) {
                c r1 = r1();
                V0(Z(), r1, base64Variant);
                this.x2 = r1.k();
            }
            return this.x2;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
        P0.append(this.f2);
        P0.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw new JsonParseException(this, P0.toString());
    }

    public void n1() throws IOException {
        if (this.Y2 != null) {
            if (this.h2.c || C0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.Y2.close();
            }
            this.Y2 = null;
        }
    }

    public void n2(int i) throws JsonParseException {
        throw new JsonParseException(this, i0.d.a.a.a.R(i, i0.d.a.a.a.P0("Invalid UTF-8 middle byte 0x")));
    }

    public void o2(int i, int i2) throws JsonParseException {
        this.j2 = i2;
        n2(i);
        throw null;
    }

    public void p2(String str) throws IOException {
        q2(str, A1());
        throw null;
    }

    public char q1() throws IOException {
        if (this.j2 < this.k2 || U1()) {
            byte[] bArr = this.Z2;
            int i = this.j2;
            this.j2 = i + 1;
            byte b = bArr[i];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char K1 = (char) K1(b);
                u1(K1);
                return K1;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.j2 < this.k2 || U1()) {
                    byte[] bArr2 = this.Z2;
                    int i4 = this.j2;
                    this.j2 = i4 + 1;
                    byte b2 = bArr2[i4] & 255;
                    int i5 = a.i[b2];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        f1(b2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    d1(" in character escape sequence", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i3;
        }
        d1(" in character escape sequence", JsonToken.VALUE_STRING);
        throw null;
    }

    public void q2(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.j2 >= this.k2 && !U1()) {
                break;
            }
            byte[] bArr = this.Z2;
            int i = this.j2;
            this.j2 = i + 1;
            char K1 = (char) K1(bArr[i]);
            if (!Character.isJavaIdentifierPart(K1)) {
                break;
            }
            sb.append(K1);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        b1("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    public String r0() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.T2) {
                return this.t2.h();
            }
            this.T2 = false;
            return P1();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return y();
        } else {
            return super.u0((String) null);
        }
    }

    public final void r2() throws IOException {
        if (this.j2 < this.k2 || U1()) {
            byte[] bArr = this.Z2;
            int i = this.j2;
            if (bArr[i] == 10) {
                this.j2 = i + 1;
            }
        }
        this.m2++;
        this.n2 = this.j2;
    }

    public final int s2() throws IOException {
        int i = this.j2;
        if (i + 4 >= this.k2) {
            return t2(false);
        }
        byte[] bArr = this.Z2;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.j2 = i2;
            byte b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    int i3 = i2 + 1;
                    this.j2 = i3;
                    byte b3 = bArr[i3];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return t2(true);
                        }
                        this.j2 = i3 + 1;
                        return b3;
                    }
                }
                return t2(true);
            } else if (b2 == 47 || b2 == 35) {
                return t2(true);
            } else {
                this.j2 = i2 + 1;
                return b2;
            }
        } else {
            if (b == 32 || b == 9) {
                int i4 = i + 1;
                this.j2 = i4;
                b = bArr[i4];
            }
            if (b != 58) {
                return t2(false);
            }
            int i5 = this.j2 + 1;
            this.j2 = i5;
            byte b4 = bArr[i5];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    int i6 = i5 + 1;
                    this.j2 = i6;
                    byte b5 = bArr[i6];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return t2(true);
                        }
                        this.j2 = i6 + 1;
                        return b5;
                    }
                }
                return t2(true);
            } else if (b4 == 47 || b4 == 35) {
                return t2(true);
            } else {
                this.j2 = i5 + 1;
                return b4;
            }
        }
    }

    public final int t2(boolean z) throws IOException {
        while (true) {
            if (this.j2 < this.k2 || U1()) {
                byte[] bArr = this.Z2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        u2();
                    } else if (b != 35 || !E2()) {
                        if (z) {
                            return b;
                        }
                        if (b == 58) {
                            z = true;
                        } else {
                            f1(b, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.m2++;
                    this.n2 = i2;
                } else if (b == 13) {
                    r2();
                } else if (b != 9) {
                    g1(b);
                    throw null;
                }
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0(" within/between ");
                P0.append(this.r2.h());
                P0.append(" entries");
                d1(P0.toString(), (JsonToken) null);
                throw null;
            }
        }
    }

    public String u0(String str) throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.T2) {
                return this.t2.h();
            }
            this.T2 = false;
            return P1();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return y();
        } else {
            return super.u0(str);
        }
    }

    public final void u2() throws IOException {
        if ((this.d & M2) == 0) {
            f1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.j2 < this.k2 || U1()) {
            byte[] bArr = this.Z2;
            int i = this.j2;
            this.j2 = i + 1;
            byte b = bArr[i] & 255;
            if (b == 47) {
                v2();
            } else if (b == 42) {
                int[] iArr = a.g;
                while (true) {
                    if (this.j2 >= this.k2 && !U1()) {
                        break;
                    }
                    byte[] bArr2 = this.Z2;
                    int i2 = this.j2;
                    int i3 = i2 + 1;
                    this.j2 = i3;
                    byte b2 = bArr2[i2] & 255;
                    int i4 = iArr[b2];
                    if (i4 != 0) {
                        if (i4 == 2) {
                            x2();
                        } else if (i4 == 3) {
                            y2();
                        } else if (i4 == 4) {
                            z2();
                        } else if (i4 == 10) {
                            this.m2++;
                            this.n2 = i3;
                        } else if (i4 == 13) {
                            r2();
                        } else if (i4 == 42) {
                            if (i3 >= this.k2 && !U1()) {
                                break;
                            }
                            byte[] bArr3 = this.Z2;
                            int i5 = this.j2;
                            if (bArr3[i5] == 47) {
                                this.j2 = i5 + 1;
                                return;
                            }
                        } else {
                            l2(b2);
                            throw null;
                        }
                    }
                }
                d1(" in a comment", (JsonToken) null);
                throw null;
            } else {
                f1(b, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            d1(" in a comment", (JsonToken) null);
            throw null;
        }
    }

    public d v() {
        return this.Q2;
    }

    public final void v2() throws IOException {
        int[] iArr = a.g;
        while (true) {
            if (this.j2 < this.k2 || U1()) {
                byte[] bArr = this.Z2;
                int i = this.j2;
                int i2 = i + 1;
                this.j2 = i2;
                byte b = bArr[i] & 255;
                int i3 = iArr[b];
                if (i3 != 0) {
                    if (i3 == 2) {
                        x2();
                    } else if (i3 == 3) {
                        y2();
                    } else if (i3 == 4) {
                        z2();
                    } else if (i3 == 10) {
                        this.m2++;
                        this.n2 = i2;
                        return;
                    } else if (i3 == 13) {
                        r2();
                        return;
                    } else if (i3 != 42 && i3 < 0) {
                        l2(b);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public JsonLocation w() {
        return new JsonLocation(s1(), this.l2 + ((long) this.j2), -1, this.m2, (this.j2 - this.n2) + 1);
    }

    public void w2() throws IOException {
        this.T2 = false;
        int[] iArr = O2;
        byte[] bArr = this.Z2;
        while (true) {
            int i = this.j2;
            int i2 = this.k2;
            if (i >= i2) {
                V1();
                i = this.j2;
                i2 = this.k2;
            }
            while (true) {
                if (i >= i2) {
                    this.j2 = i;
                    break;
                }
                int i3 = i + 1;
                byte b = bArr[i] & 255;
                if (iArr[b] != 0) {
                    this.j2 = i3;
                    if (b != 34) {
                        int i4 = iArr[b];
                        if (i4 == 1) {
                            q1();
                        } else if (i4 == 2) {
                            x2();
                        } else if (i4 == 3) {
                            y2();
                        } else if (i4 == 4) {
                            z2();
                        } else if (b < 32) {
                            z1(b, "string value");
                        } else {
                            l2(b);
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    public void x1() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        this.t2.p();
        char[] cArr = this.u2;
        if (cArr != null) {
            this.u2 = null;
            this.h2.f(cArr);
        }
        this.R2.s();
        if (this.a3 && (bArr = this.Z2) != null && bArr != (bArr2 = i0.f.a.b.h.c.q)) {
            this.Z2 = bArr2;
            this.h2.g(bArr);
        }
    }

    public final void x2() throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i = this.j2;
        int i2 = i + 1;
        this.j2 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            o2(b & 255, i2);
            throw null;
        }
    }

    public final void y2() throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i = this.j2;
        int i2 = i + 1;
        this.j2 = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.k2) {
                V1();
            }
            byte[] bArr2 = this.Z2;
            int i3 = this.j2;
            int i4 = i3 + 1;
            this.j2 = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) != 128) {
                o2(b2 & 255, i4);
                throw null;
            }
            return;
        }
        o2(b & 255, i2);
        throw null;
    }

    public final void z2() throws IOException {
        if (this.j2 >= this.k2) {
            V1();
        }
        byte[] bArr = this.Z2;
        int i = this.j2;
        int i2 = i + 1;
        this.j2 = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.k2) {
                V1();
            }
            byte[] bArr2 = this.Z2;
            int i3 = this.j2;
            int i4 = i3 + 1;
            this.j2 = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) == 128) {
                if (i4 >= this.k2) {
                    V1();
                }
                byte[] bArr3 = this.Z2;
                int i5 = this.j2;
                int i6 = i5 + 1;
                this.j2 = i6;
                byte b3 = bArr3[i5];
                if ((b3 & 192) != 128) {
                    o2(b3 & 255, i6);
                    throw null;
                }
                return;
            }
            o2(b2 & 255, i4);
            throw null;
        }
        o2(b & 255, i2);
        throw null;
    }
}
