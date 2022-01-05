package com.fasterxml.jackson.dataformat.cbor;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.util.InternCache;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.f.a.b.d;
import i0.f.a.b.h.c;
import i0.f.a.b.m.e;
import i0.f.a.b.m.f;
import i0.f.a.b.m.i;
import i0.f.a.b.m.k;
import i0.f.a.d.a.a;
import i0.f.a.d.a.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;

public class CBORParser extends c {
    public static final Charset g2 = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
    public static final int[] h2 = a.a;
    public static final double i2 = Math.pow(2.0d, 10.0d);
    public static final double j2 = Math.pow(2.0d, -14.0d);
    public static final BigInteger k2;
    public static final BigInteger l2;
    public static final BigInteger m2;
    public static final BigInteger n2;
    public static final BigDecimal o2;
    public static final BigDecimal p2;
    public static final BigDecimal q2;
    public static final BigDecimal r2;
    public static final BigInteger s2 = BigInteger.ONE.shiftLeft(63);
    public b A2;
    public final i B2;
    public i0.f.a.b.m.c C2 = null;
    public byte[] D2;
    public int E2;
    public int F2;
    public int G2 = -1;
    public boolean H2 = false;
    public int I2;
    public InputStream J2;
    public byte[] K2;
    public boolean L2;
    public final i0.f.a.b.k.a M2;
    public int[] N2 = c.x;
    public int O2;
    public int P2;
    public int Q2;
    public int R2 = 0;
    public int S2;
    public long T2;
    public float U2;
    public double V2;
    public BigInteger W2;
    public BigDecimal X2;
    public d t2;
    public final i0.f.a.b.i.b u2;
    public boolean v2;
    public int w2 = 0;
    public int x2 = 0;
    public long y2 = 0;
    public long z2 = 0;

    public enum Feature implements e {
        ;
        
        public final boolean _defaultState;
        public final int _mask;

        private Feature(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
        }

        public static int collectDefaults() {
            values();
            return 0;
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
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        k2 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        l2 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        m2 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(RecyclerView.FOREVER_NS);
        n2 = valueOf4;
        o2 = new BigDecimal(valueOf3);
        p2 = new BigDecimal(valueOf4);
        q2 = new BigDecimal(valueOf);
        r2 = new BigDecimal(valueOf2);
    }

    public CBORParser(i0.f.a.b.i.b bVar, int i, d dVar, i0.f.a.b.k.a aVar, InputStream inputStream, byte[] bArr, int i3, int i4, boolean z) {
        super(i);
        this.u2 = bVar;
        this.t2 = dVar;
        this.M2 = aVar;
        this.J2 = inputStream;
        this.K2 = bArr;
        this.w2 = i3;
        this.x2 = i4;
        this.L2 = z;
        this.B2 = new i(bVar.d);
        this.A2 = new b((b) null, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? new i0.f.a.b.j.b(this) : null, 0, -1);
    }

    public final String A1(int i) throws IOException {
        if (this.x2 - this.w2 < i) {
            if (i >= this.K2.length) {
                I1(i);
                return this.B2.h();
            }
            P1(i);
        }
        String F1 = F1(i);
        if (F1 == null) {
            return m1(i, C1(i));
        }
        this.w2 += i;
        return F1;
    }

    public final void B1(int i) throws IOException {
        String str;
        int i3 = (i >> 5) & 7;
        if (i3 == 0) {
            str = S1(i, false);
        } else if (i3 == 1) {
            str = S1(i, true);
        } else if (i3 == 2) {
            str = new String(G1(x1(i & 31)), g2);
        } else if ((i & 255) == 255) {
            Y1();
            throw null;
        } else {
            throw new JsonParseException(this, i0.d.a.a.a.g0("Unsupported major type (", i3, ") for CBOR Objects, not (yet?) supported, only Strings"));
        }
        this.A2.n(str);
    }

    public final String C1(int i) throws IOException {
        int i3;
        char[] i4 = this.B2.i();
        if (i4.length < i) {
            i iVar = this.B2;
            char[] cArr = iVar.i;
            if (cArr.length < i) {
                cArr = Arrays.copyOf(cArr, i);
                iVar.i = cArr;
            }
            i4 = cArr;
        }
        int i5 = this.w2;
        int i6 = i + i5;
        this.w2 = i6;
        int[] iArr = h2;
        byte[] bArr = this.K2;
        int i7 = 0;
        while (true) {
            byte b = bArr[i5] & 255;
            if (iArr[b] != 0) {
                while (i5 < i6) {
                    int i8 = i5 + 1;
                    byte b2 = bArr[i5] & 255;
                    int i9 = iArr[b2];
                    if (i9 != 0) {
                        if (i9 == 1) {
                            i3 = i8 + 1;
                            b2 = ((b2 & 31) << 6) | (bArr[i8] & 63);
                        } else if (i9 == 2) {
                            int i10 = i8 + 1;
                            byte b3 = ((b2 & 15) << 12) | ((bArr[i8] & 63) << 6);
                            i8 = i10 + 1;
                            b2 = b3 | (bArr[i10] & 63);
                        } else if (i9 == 3) {
                            int i11 = i8 + 1;
                            byte b4 = ((b2 & 7) << 18) | ((bArr[i8] & 63) << 12);
                            int i12 = i11 + 1;
                            byte b5 = b4 | ((bArr[i11] & 63) << 6);
                            i3 = i12 + 1;
                            int i13 = (b5 | (bArr[i12] & 63)) - 65536;
                            i4[i7] = (char) (55296 | (i13 >> 10));
                            b2 = (i13 & 1023) | 56320;
                            i7++;
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("Invalid byte ");
                            P0.append(Integer.toHexString(b2));
                            P0.append(" in Object name");
                            throw new JsonParseException(this, P0.toString());
                        }
                        i8 = i3;
                    }
                    i4[i7] = (char) b2;
                    i5 = i8;
                    i7++;
                }
                return this.B2.s(i7);
            }
            int i14 = i7 + 1;
            i4[i7] = (char) b;
            i5++;
            if (i5 == i6) {
                return this.B2.s(i14);
            }
            i7 = i14;
        }
    }

    public JsonToken D1(int i, int i3) throws IOException {
        if (i <= 24) {
            if (i < 24) {
                this.S2 = i;
            } else {
                if (this.w2 >= this.x2) {
                    c2();
                }
                byte[] bArr = this.K2;
                int i4 = this.w2;
                this.w2 = i4 + 1;
                byte b = bArr[i4] & 255;
                this.S2 = b;
                if (b < 32) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid second byte for simple value: 0x");
                    P0.append(Integer.toHexString(this.S2));
                    P0.append(" (only values 0x20 - 0xFF allowed)");
                    throw new JsonParseException(this, P0.toString());
                }
            }
            this.R2 = 1;
            return JsonToken.VALUE_NUMBER_INT;
        }
        O1(i3);
        throw null;
    }

    public BigDecimal E() throws IOException {
        int i = this.R2;
        if ((i & 16) == 0) {
            if (i == 0) {
                q1();
            }
            int i3 = this.R2;
            if ((i3 & 16) == 0) {
                if ((i3 & 40) != 0) {
                    String Z = Z();
                    String str = i0.f.a.b.i.e.a;
                    try {
                        this.X2 = new BigDecimal(Z);
                    } catch (NumberFormatException unused) {
                        throw i0.f.a.b.i.e.a(Z);
                    }
                } else if ((i3 & 4) != 0) {
                    this.X2 = new BigDecimal(this.W2);
                } else if ((i3 & 2) != 0) {
                    this.X2 = BigDecimal.valueOf(this.T2);
                } else if ((i3 & 1) != 0) {
                    this.X2 = BigDecimal.valueOf((long) this.S2);
                } else {
                    k.a();
                    throw null;
                }
                this.R2 |= 16;
            }
        }
        return this.X2;
    }

    public final int E1(int i) throws IOException {
        if (i <= 23) {
            return i;
        }
        int i3 = i - 24;
        if (i3 == 0) {
            return v1();
        }
        if (i3 == 1) {
            return s1();
        }
        if (i3 == 2) {
            return t1();
        }
        if (i3 == 3) {
            long u1 = u1();
            if (u1 >= -2147483648L && u1 <= 2147483647L) {
                return (int) u1;
            }
            throw new JsonParseException(this, i0.d.a.a.a.k0("Illegal Tag value: ", u1));
        }
        throw new JsonParseException(this, i0.d.a.a.a.R(i, i0.d.a.a.a.P0("Invalid low bits for Tag token: 0x")));
    }

    public double F() throws IOException {
        int i = this.R2;
        if ((i & 8) == 0) {
            if (i == 0) {
                q1();
            }
            int i3 = this.R2;
            if ((i3 & 8) == 0) {
                if ((i3 & 16) != 0) {
                    this.V2 = this.X2.doubleValue();
                } else if ((i3 & 32) != 0) {
                    this.V2 = (double) this.U2;
                } else if ((i3 & 4) != 0) {
                    this.V2 = this.W2.doubleValue();
                } else if ((i3 & 2) != 0) {
                    this.V2 = (double) this.T2;
                } else if ((i3 & 1) != 0) {
                    this.V2 = (double) this.S2;
                } else {
                    k.a();
                    throw null;
                }
                this.R2 |= 8;
            }
        }
        return this.V2;
    }

    public final String F1(int i) throws IOException {
        int i3;
        int[] iArr;
        int i4;
        if (this.x2 - this.w2 < i) {
            P1(i);
        }
        if (i < 5) {
            int i5 = this.w2;
            byte[] bArr = this.K2;
            int i6 = bArr[i5] & 255;
            if (i > 1) {
                int i7 = i5 + 1;
                i6 = (i6 << 8) + (bArr[i7] & 255);
                if (i > 2) {
                    int i8 = i7 + 1;
                    i6 = (bArr[i8] & 255) + (i6 << 8);
                    if (i > 3) {
                        i6 = (i6 << 8) + (bArr[i8 + 1] & 255);
                    }
                }
            }
            this.O2 = i6;
            return this.M2.m(i6);
        }
        byte[] bArr2 = this.K2;
        int i9 = this.w2;
        int i10 = i9 + 1;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = ((((((bArr2[i9] & 255) << 8) | (bArr2[i10] & 255)) << 8) | (bArr2[i11] & 255)) << 8) | (bArr2[i12] & 255);
        if (i < 9) {
            int i15 = i13 + 1;
            int i16 = bArr2[i13] & 255;
            int i17 = i - 5;
            if (i17 > 0) {
                int i18 = i16 << 8;
                int i19 = i15 + 1;
                int i20 = i18 + (bArr2[i15] & 255);
                if (i17 > 1) {
                    int i21 = i19 + 1;
                    i16 = (i20 << 8) + (bArr2[i19] & 255);
                    if (i17 > 2) {
                        i16 = (i16 << 8) + (bArr2[i21] & 255);
                    }
                } else {
                    i16 = i20;
                }
            }
            this.O2 = i14;
            this.P2 = i16;
            return this.M2.n(i14, i16);
        }
        int i22 = i13 + 1;
        int i23 = i22 + 1;
        int i24 = i23 + 1;
        int i25 = i24 + 1;
        int i26 = (((((bArr2[i22] & 255) | ((bArr2[i13] & 255) << 8)) << 8) | (bArr2[i23] & 255)) << 8) | (bArr2[i24] & 255);
        if (i < 13) {
            int i27 = i25 + 1;
            int i28 = bArr2[i25] & 255;
            int i29 = i - 9;
            if (i29 > 0) {
                int i30 = i28 << 8;
                int i31 = i27 + 1;
                int i32 = (bArr2[i27] & 255) + i30;
                if (i29 > 1) {
                    int i33 = i31 + 1;
                    i28 = (i32 << 8) + (bArr2[i31] & 255);
                    if (i29 > 2) {
                        i28 = (i28 << 8) + (bArr2[i33] & 255);
                    }
                } else {
                    i28 = i32;
                }
            }
            this.O2 = i14;
            this.P2 = i26;
            this.Q2 = i28;
            return this.M2.o(i14, i26, i28);
        }
        int i34 = (i + 3) >> 2;
        int[] iArr2 = this.N2;
        if (i34 > iArr2.length) {
            this.N2 = Arrays.copyOf(iArr2, i34 + 4);
        }
        int[] iArr3 = this.N2;
        iArr3[0] = i14;
        iArr3[1] = i26;
        int i35 = this.w2 + 8;
        int i36 = i - 8;
        byte[] bArr3 = this.K2;
        int i37 = 2;
        while (true) {
            int i38 = i35 + 1;
            int i39 = i38 + 1;
            int i40 = i39 + 1;
            i3 = i40 + 1;
            int i41 = ((((((bArr3[i35] & 255) << 8) | (bArr3[i38] & 255)) << 8) | (bArr3[i39] & 255)) << 8) | (bArr3[i40] & 255);
            iArr = this.N2;
            i4 = i37 + 1;
            iArr[i37] = i41;
            i36 -= 4;
            if (i36 <= 3) {
                break;
            }
            i35 = i3;
            i37 = i4;
        }
        if (i36 > 0) {
            int i42 = bArr3[i3] & 255;
            if (i36 > 1) {
                int i43 = i3 + 1;
                i42 = (i42 << 8) + (bArr3[i43] & 255);
                if (i36 > 2) {
                    i42 = (bArr3[i43 + 1] & 255) + (i42 << 8);
                }
            }
            iArr[i4] = i42;
            i4++;
        }
        return this.M2.p(iArr, i4);
    }

    public Object G() throws IOException {
        if (this.H2) {
            L1();
        }
        if (this.f2 == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.D2;
        }
        return null;
    }

    public byte[] G1(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return c.q;
            }
            i0.f.a.b.m.c cVar = this.C2;
            if (cVar == null) {
                this.C2 = new i0.f.a.b.m.c();
            } else {
                cVar.i();
            }
            i0.f.a.b.m.c cVar2 = this.C2;
            while (true) {
                if (this.w2 >= this.x2) {
                    c2();
                }
                byte[] bArr = this.K2;
                int i3 = this.w2;
                this.w2 = i3 + 1;
                byte b = bArr[i3] & 255;
                if (b == 255) {
                    return cVar2.k();
                }
                int i4 = b >> 5;
                if (i4 == 2) {
                    int x1 = x1(b & 31);
                    if (x1 >= 0) {
                        int i5 = x1;
                        while (true) {
                            if (i5 > 0) {
                                int i6 = this.x2;
                                int i7 = this.w2;
                                int i8 = i6 - i7;
                                if (i7 >= i6) {
                                    if (b2()) {
                                        i8 = this.x2 - this.w2;
                                    } else {
                                        V1(x1, x1 - i5);
                                        throw null;
                                    }
                                }
                                int min = Math.min(i8, i5);
                                cVar2.write(this.K2, this.w2, min);
                                this.w2 += min;
                                i5 -= min;
                            }
                        }
                    } else {
                        throw new JsonParseException(this, "Illegal chunked-length indicator within chunked-length value (type 2)");
                    }
                } else {
                    throw new JsonParseException(this, i0.d.a.a.a.e0("Mismatched chunk in chunked content: expected 2 but encountered ", i4));
                }
            }
        } else if (i > 250000) {
            i0.f.a.b.m.c cVar3 = new i0.f.a.b.m.c((i0.f.a.b.m.a) null, 125000);
            int i9 = i;
            while (i9 > 0) {
                int i10 = this.x2 - this.w2;
                if (i10 <= 0) {
                    if (b2()) {
                        i10 = this.x2 - this.w2;
                    } else {
                        V1(i, i - i9);
                        throw null;
                    }
                }
                int min2 = Math.min(i10, i9);
                cVar3.write(this.K2, this.w2, min2);
                this.w2 += min2;
                i9 -= min2;
            }
            return cVar3.k();
        } else {
            byte[] bArr2 = new byte[i];
            int i11 = 0;
            if (this.w2 < this.x2 || b2()) {
                int i12 = i;
                do {
                    int min3 = Math.min(i12, this.x2 - this.w2);
                    System.arraycopy(this.K2, this.w2, bArr2, i11, min3);
                    this.w2 += min3;
                    i11 += min3;
                    i12 -= min3;
                    if (i12 <= 0) {
                        return bArr2;
                    }
                } while (b2());
                V1(i, i11);
                throw null;
            }
            V1(i, 0);
            throw null;
        }
    }

    public float H() throws IOException {
        int i = this.R2;
        if ((i & 32) == 0) {
            if (i == 0) {
                q1();
            }
            int i3 = this.R2;
            if ((i3 & 32) == 0) {
                if ((i3 & 16) != 0) {
                    this.U2 = this.X2.floatValue();
                } else if ((i3 & 4) != 0) {
                    this.U2 = this.W2.floatValue();
                } else if ((i3 & 8) != 0) {
                    this.U2 = (float) this.V2;
                } else if ((i3 & 2) != 0) {
                    this.U2 = (float) this.T2;
                } else if ((i3 & 1) != 0) {
                    this.U2 = (float) this.S2;
                } else {
                    k.a();
                    throw null;
                }
                this.R2 |= 32;
            }
        }
        return this.U2;
    }

    public final void H1() throws IOException {
        int i;
        int i3;
        byte b;
        char[] i4 = this.B2.i();
        int[] iArr = h2;
        int length = i4.length;
        byte[] bArr = this.K2;
        this.F2 = this.w2;
        this.E2 = 0;
        int i5 = 0;
        while (true) {
            if (this.w2 >= this.F2) {
                if (this.E2 == 0) {
                    int w1 = w1(3);
                    if (w1 < 0) {
                        this.B2.j = i5;
                        return;
                    }
                    this.E2 = w1;
                    int i6 = this.w2 + w1;
                    int i7 = this.x2;
                    if (i6 <= i7) {
                        this.E2 = 0;
                        this.F2 = i6;
                    } else {
                        this.E2 = i6 - i7;
                        this.F2 = i7;
                    }
                }
                if (this.w2 >= this.x2) {
                    c2();
                    int i8 = this.w2 + this.E2;
                    int i9 = this.x2;
                    if (i8 <= i9) {
                        this.E2 = 0;
                        this.F2 = i8;
                    } else {
                        this.E2 = i8 - i9;
                        this.F2 = i9;
                    }
                }
            }
            int i10 = this.w2;
            this.w2 = i10 + 1;
            byte b2 = bArr[i10] & 255;
            int i11 = iArr[b2];
            if (i11 != 0 || i5 >= length) {
                if (i11 != 0) {
                    if (i11 == 1) {
                        i3 = R1();
                        if ((i3 & 192) == 128) {
                            b = b2 & 31;
                        } else {
                            X1(i3 & 255, this.w2);
                            throw null;
                        }
                    } else if (i11 == 2) {
                        byte b3 = b2 & 15;
                        int R1 = R1();
                        if ((R1 & 192) == 128) {
                            b = (b3 << 6) | (R1 & 63);
                            i3 = R1();
                            if ((i3 & 192) != 128) {
                                X1(i3 & 255, this.w2);
                                throw null;
                            }
                        } else {
                            X1(R1 & 255, this.w2);
                            throw null;
                        }
                    } else if (i11 == 3) {
                        int R12 = R1();
                        if ((R12 & 192) == 128) {
                            int i12 = ((b2 & 7) << 6) | (R12 & 63);
                            int R13 = R1();
                            if ((R13 & 192) == 128) {
                                int i13 = (i12 << 6) | (R13 & 63);
                                int R14 = R1();
                                if ((R14 & 192) == 128) {
                                    int i14 = ((i13 << 6) | (R14 & 63)) - 65536;
                                    if (i5 >= i4.length) {
                                        i4 = this.B2.l();
                                        length = i4.length;
                                        i5 = 0;
                                    }
                                    i4[i5] = (char) (55296 | (i14 >> 10));
                                    b2 = (i14 & 1023) | 56320;
                                    i5++;
                                } else {
                                    X1(R14 & 255, this.w2);
                                    throw null;
                                }
                            } else {
                                X1(R13 & 255, this.w2);
                                throw null;
                            }
                        } else {
                            X1(R12 & 255, this.w2);
                            throw null;
                        }
                    } else {
                        W1(b2);
                        throw null;
                    }
                    b2 = (b << 6) | (i3 & 63);
                }
                if (i5 >= length) {
                    i4 = this.B2.l();
                    length = i4.length;
                    i5 = 0;
                }
                i = i5 + 1;
                i4[i5] = (char) b2;
            } else {
                i = i5 + 1;
                i4[i5] = (char) b2;
            }
            i5 = i;
        }
    }

    public int I() throws IOException {
        int i = this.R2;
        if ((i & 1) == 0) {
            if (i == 0) {
                q1();
            }
            int i3 = this.R2;
            if ((i3 & 1) == 0) {
                if ((i3 & 2) != 0) {
                    long j = this.T2;
                    int i4 = (int) j;
                    if (((long) i4) == j) {
                        this.S2 = i4;
                    } else {
                        StringBuilder P0 = i0.d.a.a.a.P0("Numeric value (");
                        P0.append(Z());
                        P0.append(") out of range of int");
                        throw new JsonParseException(this, P0.toString());
                    }
                } else if ((i3 & 4) != 0) {
                    if (k2.compareTo(this.W2) > 0 || l2.compareTo(this.W2) < 0) {
                        h1();
                        throw null;
                    }
                    this.S2 = this.W2.intValue();
                } else if ((i3 & 8) != 0) {
                    double d = this.V2;
                    if (d < -2.147483648E9d || d > 2.147483647E9d) {
                        h1();
                        throw null;
                    }
                    this.S2 = (int) d;
                } else if ((i3 & 32) != 0) {
                    float f = this.U2;
                    double d2 = (double) f;
                    if (d2 < -2.147483648E9d || d2 > 2.147483647E9d) {
                        h1();
                        throw null;
                    }
                    this.S2 = (int) f;
                } else if ((i3 & 16) == 0) {
                    k.a();
                    throw null;
                } else if (q2.compareTo(this.X2) > 0 || r2.compareTo(this.X2) < 0) {
                    h1();
                    throw null;
                } else {
                    this.S2 = this.X2.intValue();
                }
                this.R2 |= 1;
            }
        }
        return this.S2;
    }

    public final void I1(int i) throws IOException {
        int i3;
        int i4;
        int i5;
        char[] i6 = this.B2.i();
        int[] iArr = h2;
        int length = i6.length;
        int i7 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                int Q1 = Q1() & 255;
                int i8 = iArr[Q1];
                if (i8 != 0 || i7 >= length) {
                    i -= i8;
                    if (i >= 0) {
                        if (i8 != 0) {
                            if (i8 == 1) {
                                i4 = Q1();
                                if ((i4 & 192) == 128) {
                                    i5 = Q1 & 31;
                                } else {
                                    X1(i4 & 255, this.w2);
                                    throw null;
                                }
                            } else if (i8 == 2) {
                                int i9 = Q1 & 15;
                                int Q12 = Q1();
                                if ((Q12 & 192) == 128) {
                                    i5 = (i9 << 6) | (Q12 & 63);
                                    i4 = Q1();
                                    if ((i4 & 192) != 128) {
                                        X1(i4 & 255, this.w2);
                                        throw null;
                                    }
                                } else {
                                    X1(Q12 & 255, this.w2);
                                    throw null;
                                }
                            } else if (i8 == 3) {
                                int Q13 = Q1();
                                if ((Q13 & 192) == 128) {
                                    int i10 = ((Q1 & 7) << 6) | (Q13 & 63);
                                    int Q14 = Q1();
                                    if ((Q14 & 192) == 128) {
                                        int i11 = (i10 << 6) | (Q14 & 63);
                                        int Q15 = Q1();
                                        if ((Q15 & 192) == 128) {
                                            int i12 = ((i11 << 6) | (Q15 & 63)) - 65536;
                                            if (i7 >= i6.length) {
                                                i6 = this.B2.l();
                                                length = i6.length;
                                                i7 = 0;
                                            }
                                            i6[i7] = (char) (55296 | (i12 >> 10));
                                            Q1 = (i12 & 1023) | 56320;
                                            i7++;
                                        } else {
                                            X1(Q15 & 255, this.w2);
                                            throw null;
                                        }
                                    } else {
                                        X1(Q14 & 255, this.w2);
                                        throw null;
                                    }
                                } else {
                                    X1(Q13 & 255, this.w2);
                                    throw null;
                                }
                            } else {
                                W1(Q1);
                                throw null;
                            }
                            Q1 = (i5 << 6) | (i4 & 63);
                        }
                        if (i7 >= length) {
                            i6 = this.B2.l();
                            length = i6.length;
                            i7 = 0;
                        }
                        i3 = i7 + 1;
                        i6[i7] = (char) Q1;
                    } else {
                        throw new JsonParseException(this, "Malformed UTF-8 character at the end of a (non-chunked) text segment");
                    }
                } else {
                    i3 = i7 + 1;
                    i6[i7] = (char) Q1;
                }
                i7 = i3;
            } else {
                this.B2.j = i7;
                return;
            }
        }
    }

    public long J() throws IOException {
        int i = this.R2;
        if ((i & 2) == 0) {
            if (i == 0) {
                q1();
            }
            int i3 = this.R2;
            if ((i3 & 2) == 0) {
                if ((i3 & 1) != 0) {
                    this.T2 = (long) this.S2;
                } else if ((i3 & 4) != 0) {
                    if (m2.compareTo(this.W2) > 0 || n2.compareTo(this.W2) < 0) {
                        j1();
                        throw null;
                    }
                    this.T2 = this.W2.longValue();
                } else if ((i3 & 8) != 0) {
                    double d = this.V2;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        j1();
                        throw null;
                    }
                    this.T2 = (long) d;
                } else if ((i3 & 32) != 0) {
                    float f = this.U2;
                    double d2 = (double) f;
                    if (d2 < -9.223372036854776E18d || d2 > 9.223372036854776E18d) {
                        h1();
                        throw null;
                    }
                    this.T2 = (long) f;
                } else if ((i3 & 16) == 0) {
                    k.a();
                    throw null;
                } else if (o2.compareTo(this.X2) > 0 || p2.compareTo(this.X2) < 0) {
                    j1();
                    throw null;
                } else {
                    this.T2 = this.X2.longValue();
                }
                this.R2 |= 2;
            }
        }
        return this.T2;
    }

    public boolean J0() {
        if (this.f2 != JsonToken.VALUE_NUMBER_FLOAT) {
            return false;
        }
        int i = this.R2;
        if ((i & 8) != 0) {
            double d = this.V2;
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                return true;
            }
            return false;
        } else if ((i & 32) == 0) {
            return false;
        } else {
            float f = this.U2;
            if (Float.isNaN(f) || Float.isInfinite(f)) {
                return true;
            }
            return false;
        }
    }

    public final String J1(int i) throws IOException {
        int i3;
        char[] i4 = this.B2.i();
        if (i4.length < i) {
            i iVar = this.B2;
            char[] cArr = iVar.i;
            if (cArr.length < i) {
                cArr = Arrays.copyOf(cArr, i);
                iVar.i = cArr;
            }
            i4 = cArr;
        }
        int i5 = 0;
        int i6 = this.w2;
        int i7 = i + i6;
        this.w2 = i7;
        byte[] bArr = this.K2;
        while (true) {
            byte b = bArr[i6];
            if (b >= 0) {
                int i8 = i5 + 1;
                i4[i5] = (char) b;
                i6++;
                if (i6 == i7) {
                    return this.B2.s(i8);
                }
                i5 = i8;
            } else {
                int[] iArr = h2;
                while (true) {
                    int i9 = i6 + 1;
                    byte b2 = bArr[i6] & 255;
                    int i10 = iArr[b2];
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i3 = i9 + 1;
                            b2 = ((b2 & 31) << 6) | (bArr[i9] & 63);
                        } else if (i10 == 2) {
                            int i11 = i9 + 1;
                            byte b3 = ((b2 & 15) << 12) | ((bArr[i9] & 63) << 6);
                            i9 = i11 + 1;
                            b2 = b3 | (bArr[i11] & 63);
                        } else if (i10 == 3) {
                            int i12 = i9 + 1;
                            byte b4 = ((b2 & 7) << 18) | ((bArr[i9] & 63) << 12);
                            int i13 = i12 + 1;
                            byte b5 = b4 | ((bArr[i12] & 63) << 6);
                            i3 = i13 + 1;
                            int i14 = (b5 | (bArr[i13] & 63)) - 65536;
                            i4[i5] = (char) (55296 | (i14 >> 10));
                            b2 = 56320 | (i14 & 1023);
                            i5++;
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("Invalid byte ");
                            P0.append(Integer.toHexString(b2));
                            P0.append(" in Unicode text block");
                            throw new JsonParseException(this, P0.toString());
                        }
                        i9 = i3;
                    }
                    int i15 = i5 + 1;
                    i4[i5] = (char) b2;
                    if (i9 >= i7) {
                        return this.B2.s(i15);
                    }
                    i6 = i9;
                    i5 = i15;
                }
            }
        }
    }

    public String K0() throws IOException {
        JsonToken jsonToken;
        String str;
        if (this.A2.e() && this.f2 != (jsonToken = JsonToken.FIELD_NAME)) {
            this.R2 = 0;
            if (this.H2) {
                a2();
            }
            this.z2 = this.y2 + ((long) this.w2);
            this.D2 = null;
            this.G2 = -1;
            if (!this.A2.k()) {
                this.A2 = this.A2.c;
                this.f2 = JsonToken.END_OBJECT;
                return null;
            }
            if (this.w2 >= this.x2) {
                c2();
            }
            byte[] bArr = this.K2;
            int i = this.w2;
            this.w2 = i + 1;
            byte b = bArr[i];
            if (((b >> 5) & 7) == 3) {
                byte b2 = b & 31;
                if (b2 > 23) {
                    int x1 = x1(b2);
                    if (x1 < 0) {
                        H1();
                        str = this.B2.h();
                    } else {
                        str = A1(x1);
                    }
                } else if (b2 == 0) {
                    str = "";
                } else {
                    String F1 = F1(b2);
                    if (F1 != null) {
                        this.w2 += b2;
                        str = F1;
                    } else {
                        str = m1(b2, C1(b2));
                    }
                }
                this.A2.n(str);
                this.f2 = jsonToken;
                return str;
            } else if (b != -1) {
                B1(b);
                this.f2 = jsonToken;
                return Z();
            } else if (!this.A2.l()) {
                this.A2 = this.A2.c;
                this.f2 = JsonToken.END_OBJECT;
                return null;
            } else {
                Y1();
                throw null;
            }
        } else if (M0() == JsonToken.FIELD_NAME) {
            return y();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r0 != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String K1(int r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            r7.H2 = r0
            int r1 = r8 >> 5
            r1 = r1 & 7
            r8 = r8 & 31
            r2 = 3
            if (r1 != r2) goto L_0x0083
            int r8 = r7.x1(r8)
            if (r8 > 0) goto L_0x0026
            if (r8 != 0) goto L_0x001c
            i0.f.a.b.m.i r8 = r7.B2
            r8.q()
            java.lang.String r8 = ""
            return r8
        L_0x001c:
            r7.H1()
            i0.f.a.b.m.i r8 = r7.B2
            java.lang.String r8 = r8.h()
            return r8
        L_0x0026:
            int r1 = r8 + 3
            int r1 = java.lang.Math.max(r1, r8)
            int r2 = r7.x2
            int r3 = r7.w2
            int r4 = r2 - r3
            if (r4 >= r1) goto L_0x007e
            byte[] r4 = r7.K2
            int r5 = r4.length
            if (r5 < r1) goto L_0x0074
            java.io.InputStream r5 = r7.J2
            if (r5 != 0) goto L_0x003e
            goto L_0x0071
        L_0x003e:
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0049
            if (r3 <= 0) goto L_0x0049
            java.lang.System.arraycopy(r4, r3, r4, r0, r2)
            r7.x2 = r2
            goto L_0x004b
        L_0x0049:
            r7.x2 = r0
        L_0x004b:
            long r2 = r7.y2
            int r4 = r7.w2
            long r4 = (long) r4
            long r2 = r2 + r4
            r7.y2 = r2
            r7.w2 = r0
        L_0x0055:
            int r2 = r7.x2
            r3 = 1
            if (r2 >= r1) goto L_0x0070
            java.io.InputStream r4 = r7.J2
            byte[] r5 = r7.K2
            int r6 = r5.length
            int r6 = r6 - r2
            int r2 = r4.read(r5, r2, r6)
            if (r2 >= r3) goto L_0x006a
            r7.r1()
            goto L_0x0071
        L_0x006a:
            int r3 = r7.x2
            int r3 = r3 + r2
            r7.x2 = r3
            goto L_0x0055
        L_0x0070:
            r0 = r3
        L_0x0071:
            if (r0 == 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            r7.I1(r8)
            i0.f.a.b.m.i r8 = r7.B2
            java.lang.String r8 = r8.h()
            return r8
        L_0x007e:
            java.lang.String r8 = r7.J1(r8)
            return r8
        L_0x0083:
            i0.f.a.b.m.k.a()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.dataformat.cbor.CBORParser.K1(int):java.lang.String");
    }

    public String L0() throws IOException {
        this.R2 = 0;
        if (this.H2) {
            a2();
        }
        this.z2 = this.y2 + ((long) this.w2);
        this.D2 = null;
        this.G2 = -1;
        if (this.A2.e()) {
            if (this.f2 != JsonToken.FIELD_NAME) {
                this.G2 = -1;
                if (!this.A2.k()) {
                    this.A2 = this.A2.c;
                    this.f2 = JsonToken.END_OBJECT;
                    return null;
                }
                this.f2 = y1();
                return null;
            }
        } else if (!this.A2.k()) {
            this.G2 = -1;
            this.A2 = this.A2.c;
            this.f2 = JsonToken.END_ARRAY;
            return null;
        }
        if (this.w2 < this.x2 || b2()) {
            byte[] bArr = this.K2;
            int i = this.w2;
            this.w2 = i + 1;
            byte b = bArr[i] & 255;
            int i3 = b >> 5;
            byte b2 = b & 31;
            if (i3 == 6) {
                this.G2 = Integer.valueOf(E1(b2)).intValue();
                if (this.w2 < this.x2 || b2()) {
                    byte[] bArr2 = this.K2;
                    int i4 = this.w2;
                    this.w2 = i4 + 1;
                    b = bArr2[i4] & 255;
                    i3 = b >> 5;
                    b2 = b & 31;
                } else {
                    M1();
                    return null;
                }
            } else {
                this.G2 = -1;
            }
            switch (i3) {
                case 0:
                    this.R2 = 1;
                    if (b2 <= 23) {
                        this.S2 = b2;
                    } else {
                        int i5 = b2 - 24;
                        if (i5 == 0) {
                            this.S2 = v1();
                        } else if (i5 == 1) {
                            this.S2 = s1();
                        } else if (i5 == 2) {
                            int t1 = t1();
                            if (t1 < 0) {
                                this.T2 = ((long) t1) & 4294967295L;
                                this.R2 = 2;
                            } else {
                                this.S2 = t1;
                            }
                        } else if (i5 == 3) {
                            long u1 = u1();
                            if (u1 >= 0) {
                                this.T2 = u1;
                                this.R2 = 2;
                            } else {
                                this.W2 = o1(u1);
                                this.R2 = 4;
                            }
                        } else {
                            O1(b);
                            throw null;
                        }
                    }
                    this.f2 = JsonToken.VALUE_NUMBER_INT;
                    return null;
                case 1:
                    this.R2 = 1;
                    if (b2 <= 23) {
                        this.S2 = (-b2) - 1;
                    } else {
                        int i6 = b2 - 24;
                        if (i6 == 0) {
                            this.S2 = (-v1()) - 1;
                        } else if (i6 == 1) {
                            this.S2 = (-s1()) - 1;
                        } else if (i6 == 2) {
                            int t12 = t1();
                            if (t12 < 0) {
                                this.T2 = (-(((long) t12) & 4294967295L)) - 1;
                                this.R2 = 2;
                            } else {
                                this.S2 = (-t12) - 1;
                            }
                        } else if (i6 == 3) {
                            long u12 = u1();
                            if (u12 >= 0) {
                                this.T2 = u12;
                                this.R2 = 2;
                            } else {
                                this.W2 = n1(u12);
                                this.R2 = 4;
                            }
                        } else {
                            O1(b);
                            throw null;
                        }
                    }
                    this.f2 = JsonToken.VALUE_NUMBER_INT;
                    return null;
                case 2:
                    this.I2 = b;
                    this.H2 = true;
                    this.f2 = JsonToken.VALUE_EMBEDDED_OBJECT;
                    return null;
                case 3:
                    this.I2 = b;
                    this.H2 = true;
                    this.f2 = JsonToken.VALUE_STRING;
                    return K1(b);
                case 4:
                    this.f2 = JsonToken.START_ARRAY;
                    this.A2 = this.A2.i(x1(b2));
                    return null;
                case 5:
                    this.f2 = JsonToken.START_OBJECT;
                    this.A2 = this.A2.j(x1(b2));
                    return null;
                case 6:
                    throw new JsonParseException(this, i0.d.a.a.a.u0(i0.d.a.a.a.P0("Multiple tags not allowed per value (first tag: "), this.G2, ")"));
                default:
                    switch (b2) {
                        case 20:
                            this.f2 = JsonToken.VALUE_FALSE;
                            return null;
                        case 21:
                            this.f2 = JsonToken.VALUE_TRUE;
                            return null;
                        case 22:
                            this.f2 = JsonToken.VALUE_NULL;
                            return null;
                        case 23:
                            this.f2 = JsonToken.VALUE_NULL;
                            return null;
                        case 25:
                            this.U2 = z1();
                            this.R2 = 32;
                            this.f2 = JsonToken.VALUE_NUMBER_FLOAT;
                            return null;
                        case 26:
                            this.U2 = Float.intBitsToFloat(t1());
                            this.R2 = 32;
                            this.f2 = JsonToken.VALUE_NUMBER_FLOAT;
                            return null;
                        case 27:
                            this.V2 = Double.longBitsToDouble(u1());
                            this.R2 = 8;
                            this.f2 = JsonToken.VALUE_NUMBER_FLOAT;
                            return null;
                        case 31:
                            if (!this.A2.d() || this.A2.l()) {
                                Y1();
                                throw null;
                            }
                            this.A2 = this.A2.c;
                            this.f2 = JsonToken.END_ARRAY;
                            return null;
                        default:
                            this.f2 = D1(b2, b);
                            return null;
                    }
            }
        } else {
            M1();
            return null;
        }
    }

    public void L1() throws IOException {
        this.H2 = false;
        int i = this.I2;
        int i3 = (i >> 5) & 7;
        int i4 = i & 31;
        if (i3 == 3) {
            int x1 = x1(i4);
            if (x1 > 0) {
                if (x1 > this.x2 - this.w2) {
                    if (x1 >= this.K2.length) {
                        I1(x1);
                        return;
                    }
                    P1(x1);
                }
                J1(x1);
            } else if (x1 < 0) {
                H1();
            } else {
                this.B2.q();
            }
        } else if (i3 == 2) {
            this.D2 = G1(x1(i4));
        } else {
            k.a();
            throw null;
        }
    }

    public JsonParser.NumberType M() throws IOException {
        if (this.R2 == 0) {
            q1();
        }
        if (this.f2 == JsonToken.VALUE_NUMBER_INT) {
            int i = this.R2;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        }
        int i3 = this.R2;
        if ((i3 & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        }
        if ((i3 & 8) != 0) {
            return JsonParser.NumberType.DOUBLE;
        }
        return JsonParser.NumberType.FLOAT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018b, code lost:
        if (M0() == com.fasterxml.jackson.core.JsonToken.END_ARRAY) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken M0() throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r0.R2 = r1
            boolean r1 = r0.H2
            if (r1 == 0) goto L_0x000c
            r16.a2()
        L_0x000c:
            long r1 = r0.y2
            int r3 = r0.w2
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.z2 = r1
            r1 = 0
            r0.D2 = r1
            i0.f.a.d.a.b r2 = r0.A2
            boolean r2 = r2.e()
            r3 = -1
            if (r2 == 0) goto L_0x0042
            com.fasterxml.jackson.core.JsonToken r2 = r0.f2
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r2 == r4) goto L_0x0057
            r0.G2 = r3
            i0.f.a.d.a.b r1 = r0.A2
            boolean r1 = r1.k()
            if (r1 != 0) goto L_0x003b
            i0.f.a.d.a.b r1 = r0.A2
            i0.f.a.d.a.b r1 = r1.c
            r0.A2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r0.f2 = r1
            return r1
        L_0x003b:
            com.fasterxml.jackson.core.JsonToken r1 = r16.y1()
            r0.f2 = r1
            return r1
        L_0x0042:
            i0.f.a.d.a.b r2 = r0.A2
            boolean r2 = r2.k()
            if (r2 != 0) goto L_0x0057
            r0.G2 = r3
            i0.f.a.d.a.b r1 = r0.A2
            i0.f.a.d.a.b r1 = r1.c
            r0.A2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            r0.f2 = r1
            return r1
        L_0x0057:
            int r2 = r0.w2
            int r4 = r0.x2
            if (r2 < r4) goto L_0x0067
            boolean r2 = r16.b2()
            if (r2 != 0) goto L_0x0067
            r16.M1()
            return r1
        L_0x0067:
            byte[] r2 = r0.K2
            int r4 = r0.w2
            int r5 = r4 + 1
            r0.w2 = r5
            byte r2 = r2[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r2 >> 5
            r5 = r2 & 31
            r6 = 6
            if (r4 != r6) goto L_0x00a9
            int r2 = r0.E1(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            r0.G2 = r2
            int r2 = r0.w2
            int r4 = r0.x2
            if (r2 < r4) goto L_0x0098
            boolean r2 = r16.b2()
            if (r2 != 0) goto L_0x0098
            r16.M1()
            return r1
        L_0x0098:
            byte[] r2 = r0.K2
            int r4 = r0.w2
            int r5 = r4 + 1
            r0.w2 = r5
            byte r2 = r2[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r2 >> 5
            r5 = r2 & 31
            goto L_0x00ab
        L_0x00a9:
            r0.G2 = r3
        L_0x00ab:
            r7 = 0
            r9 = 3
            java.lang.String r10 = ")"
            java.lang.String r11 = "Multiple tags not allowed per value (first tag: "
            r12 = 23
            r13 = 4
            r14 = 2
            r15 = 1
            switch(r4) {
                case 0: goto L_0x027a;
                case 1: goto L_0x021a;
                case 2: goto L_0x0208;
                case 3: goto L_0x01ff;
                case 4: goto L_0x00df;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00bc;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x02cc
        L_0x00bc:
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r11)
            int r2 = r0.G2
            java.lang.String r1 = i0.d.a.a.a.u0(r1, r2, r10)
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L_0x00cc:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            r0.f2 = r1
            int r1 = r0.x1(r5)
            i0.f.a.d.a.b r2 = r0.A2
            i0.f.a.d.a.b r1 = r2.j(r1)
            r0.A2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = r0.f2
            return r1
        L_0x00df:
            int r1 = r0.x1(r5)
            int r2 = r0.G2
            if (r2 < 0) goto L_0x01f2
            i0.f.a.d.a.b r4 = r0.A2
            i0.f.a.d.a.b r4 = r4.i(r1)
            r0.A2 = r4
            if (r2 == r13) goto L_0x00f7
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            r0.f2 = r1
            goto L_0x019b
        L_0x00f7:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            r0.f2 = r2
            if (r1 != r14) goto L_0x01e4
            boolean r1 = r16.p1()
            java.lang.String r2 = "Unexpected token ("
            if (r1 == 0) goto L_0x01cc
            int r1 = r16.I()
            int r1 = -r1
            boolean r4 = r16.p1()
            if (r4 == 0) goto L_0x01b4
            com.fasterxml.jackson.core.JsonParser$NumberType r4 = r16.M()
            com.fasterxml.jackson.core.JsonParser$NumberType r5 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER
            if (r4 != r5) goto L_0x0122
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.math.BigInteger r5 = r16.l()
            r4.<init>(r5, r1)
            goto L_0x012a
        L_0x0122:
            long r4 = r16.J()
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4, r1)
        L_0x012a:
            i0.f.a.d.a.b r1 = r0.A2
            boolean r1 = r1.k()
            if (r1 != 0) goto L_0x013f
            r0.G2 = r3
            i0.f.a.d.a.b r1 = r0.A2
            i0.f.a.d.a.b r1 = r1.c
            r0.A2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            r0.f2 = r1
            goto L_0x018f
        L_0x013f:
            byte[] r1 = r0.K2
            int r3 = r0.w2
            int r5 = r3 + 1
            r0.w2 = r5
            byte r1 = r1[r3]
            int r3 = r1 >> 5
            r3 = r3 & 7
            if (r3 != r6) goto L_0x0180
            r1 = r1 & 31
            int r1 = r0.E1(r1)
            int r3 = r0.w2
            int r5 = r0.x2
            if (r3 < r5) goto L_0x0165
            boolean r3 = r16.b2()
            if (r3 != 0) goto L_0x0165
            r16.M1()
            goto L_0x018e
        L_0x0165:
            byte[] r3 = r0.K2
            int r5 = r0.w2
            int r7 = r5 + 1
            r0.w2 = r7
            byte r3 = r3[r5]
            int r3 = r3 >> 5
            r3 = r3 & 7
            if (r3 == r6) goto L_0x0176
            goto L_0x0180
        L_0x0176:
            java.lang.String r1 = i0.d.a.a.a.g0(r11, r1, r10)
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L_0x0180:
            int r1 = r0.w2
            int r1 = r1 - r15
            r0.w2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = r16.M0()
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 != r3) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r15 = 0
        L_0x018f:
            if (r15 == 0) goto L_0x019c
            r0.X2 = r4
            r1 = 16
            r0.R2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            r0.f2 = r1
        L_0x019b:
            return r1
        L_0x019c:
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r2)
            com.fasterxml.jackson.core.JsonToken r2 = r0.f2
            r1.append(r2)
            java.lang.String r2 = ") after 2 elements of 'bigfloat' value"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L_0x01b4:
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r2)
            com.fasterxml.jackson.core.JsonToken r2 = r0.f2
            r1.append(r2)
            java.lang.String r2 = ") as the second part of 'bigfloat' value: should get VALUE_NUMBER_INT"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L_0x01cc:
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r2)
            com.fasterxml.jackson.core.JsonToken r2 = r0.f2
            r1.append(r2)
            java.lang.String r2 = ") as the first part of 'bigfloat' value: should get VALUE_NUMBER_INT"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L_0x01e4:
            java.lang.String r2 = "Unexpected array size ("
            java.lang.String r3 = ") for tagged 'bigfloat' value; should have exactly 2 number elements"
            java.lang.String r1 = i0.d.a.a.a.g0(r2, r1, r3)
            com.fasterxml.jackson.core.JsonParseException r2 = new com.fasterxml.jackson.core.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L_0x01f2:
            i0.f.a.d.a.b r2 = r0.A2
            i0.f.a.d.a.b r1 = r2.i(r1)
            r0.A2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            r0.f2 = r1
            return r1
        L_0x01ff:
            r0.I2 = r2
            r0.H2 = r15
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r0.f2 = r1
            return r1
        L_0x0208:
            r0.I2 = r2
            r0.H2 = r15
            int r1 = r0.G2
            if (r1 < 0) goto L_0x0215
            com.fasterxml.jackson.core.JsonToken r1 = r0.N1(r1)
            return r1
        L_0x0215:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT
            r0.f2 = r1
            return r1
        L_0x021a:
            r0.R2 = r15
            if (r5 > r12) goto L_0x0223
            int r1 = -r5
            int r1 = r1 - r15
            r0.S2 = r1
            goto L_0x0275
        L_0x0223:
            int r5 = r5 + -24
            if (r5 == 0) goto L_0x026d
            if (r5 == r15) goto L_0x0264
            r3 = 1
            if (r5 == r14) goto L_0x024b
            if (r5 != r9) goto L_0x0247
            long r1 = r16.u1()
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x023e
            long r1 = -r1
            long r1 = r1 - r3
            r0.T2 = r1
            r0.R2 = r14
            goto L_0x0275
        L_0x023e:
            java.math.BigInteger r1 = r0.n1(r1)
            r0.W2 = r1
            r0.R2 = r13
            goto L_0x0275
        L_0x0247:
            r0.O1(r2)
            throw r1
        L_0x024b:
            int r1 = r16.t1()
            if (r1 >= 0) goto L_0x025f
            long r1 = (long) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            long r1 = -r1
            long r1 = r1 - r3
            r0.T2 = r1
            r0.R2 = r14
            goto L_0x0275
        L_0x025f:
            int r1 = -r1
            int r1 = r1 - r15
            r0.S2 = r1
            goto L_0x0275
        L_0x0264:
            int r1 = r16.s1()
            int r1 = -r1
            int r1 = r1 - r15
            r0.S2 = r1
            goto L_0x0275
        L_0x026d:
            int r1 = r16.v1()
            int r1 = -r1
            int r1 = r1 - r15
            r0.S2 = r1
        L_0x0275:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r0.f2 = r1
            return r1
        L_0x027a:
            r0.R2 = r15
            if (r5 > r12) goto L_0x0281
            r0.S2 = r5
            goto L_0x02c7
        L_0x0281:
            int r5 = r5 + -24
            if (r5 == 0) goto L_0x02c1
            if (r5 == r15) goto L_0x02ba
            if (r5 == r14) goto L_0x02a5
            if (r5 != r9) goto L_0x02a1
            long r1 = r16.u1()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0298
            r0.T2 = r1
            r0.R2 = r14
            goto L_0x02c7
        L_0x0298:
            java.math.BigInteger r1 = r0.o1(r1)
            r0.W2 = r1
            r0.R2 = r13
            goto L_0x02c7
        L_0x02a1:
            r0.O1(r2)
            throw r1
        L_0x02a5:
            int r1 = r16.t1()
            if (r1 < 0) goto L_0x02ae
            r0.S2 = r1
            goto L_0x02c7
        L_0x02ae:
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r0.T2 = r1
            r0.R2 = r14
            goto L_0x02c7
        L_0x02ba:
            int r1 = r16.s1()
            r0.S2 = r1
            goto L_0x02c7
        L_0x02c1:
            int r1 = r16.v1()
            r0.S2 = r1
        L_0x02c7:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r0.f2 = r1
            return r1
        L_0x02cc:
            r3 = 32
            switch(r5) {
                case 20: goto L_0x0331;
                case 21: goto L_0x032c;
                case 22: goto L_0x0327;
                case 23: goto L_0x0322;
                case 24: goto L_0x02d1;
                case 25: goto L_0x0315;
                case 26: goto L_0x0304;
                case 27: goto L_0x02f1;
                case 28: goto L_0x02d1;
                case 29: goto L_0x02d1;
                case 30: goto L_0x02d1;
                case 31: goto L_0x02d2;
                default: goto L_0x02d1;
            }
        L_0x02d1:
            goto L_0x0336
        L_0x02d2:
            i0.f.a.d.a.b r2 = r0.A2
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x02ed
            i0.f.a.d.a.b r2 = r0.A2
            boolean r2 = r2.l()
            if (r2 != 0) goto L_0x02ed
            i0.f.a.d.a.b r1 = r0.A2
            i0.f.a.d.a.b r1 = r1.c
            r0.A2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            r0.f2 = r1
            return r1
        L_0x02ed:
            r16.Y1()
            throw r1
        L_0x02f1:
            long r1 = r16.u1()
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r0.V2 = r1
            r1 = 8
            r0.R2 = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            r0.f2 = r1
            return r1
        L_0x0304:
            int r1 = r16.t1()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.U2 = r1
            r0.R2 = r3
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            r0.f2 = r1
            return r1
        L_0x0315:
            float r1 = r16.z1()
            r0.U2 = r1
            r0.R2 = r3
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            r0.f2 = r1
            return r1
        L_0x0322:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r0.f2 = r1
            return r1
        L_0x0327:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r0.f2 = r1
            return r1
        L_0x032c:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            r0.f2 = r1
            return r1
        L_0x0331:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            r0.f2 = r1
            return r1
        L_0x0336:
            com.fasterxml.jackson.core.JsonToken r1 = r0.D1(r5, r2)
            r0.f2 = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.dataformat.cbor.CBORParser.M0():com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken M1() throws IOException {
        this.G2 = -1;
        close();
        X0();
        this.f2 = null;
        return null;
    }

    public Number N() throws IOException {
        if (this.R2 == 0) {
            q1();
        }
        if (this.f2 == JsonToken.VALUE_NUMBER_INT) {
            int i = this.R2;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.S2);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.T2);
            }
            if ((i & 4) != 0) {
                return this.W2;
            }
            return this.X2;
        }
        int i3 = this.R2;
        if ((i3 & 16) != 0) {
            return this.X2;
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.V2);
        }
        if ((i3 & 32) != 0) {
            return Float.valueOf(this.U2);
        }
        k.a();
        throw null;
    }

    public JsonToken N1(int i) throws IOException {
        boolean z;
        if (i == 2) {
            z = false;
        } else if (i == 3) {
            z = true;
        } else {
            JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
            this.f2 = jsonToken;
            return jsonToken;
        }
        L1();
        if (this.D2.length == 0) {
            this.W2 = BigInteger.ZERO;
        } else {
            BigInteger bigInteger = new BigInteger(this.D2);
            if (z) {
                bigInteger = bigInteger.negate();
            }
            this.W2 = bigInteger;
        }
        this.R2 = 4;
        this.G2 = -1;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        this.f2 = jsonToken2;
        return jsonToken2;
    }

    public final Number O() throws IOException {
        return N();
    }

    public void O1(int i) throws JsonParseException {
        int i3 = i & 255;
        if (i3 == 255) {
            throw new JsonParseException(this, "Mismatched BREAK byte (0xFF): encountered where value expected");
        }
        throw new JsonParseException(this, i0.d.a.a.a.R(i3, i0.d.a.a.a.P0("Invalid CBOR value token (first byte): 0x")));
    }

    public final void P1(int i) throws IOException {
        if (this.J2 != null) {
            int i3 = this.x2;
            int i4 = this.w2;
            int i5 = i3 - i4;
            if (i5 <= 0 || i4 <= 0) {
                this.x2 = 0;
            } else {
                byte[] bArr = this.K2;
                System.arraycopy(bArr, i4, bArr, 0, i5);
                this.x2 = i5;
            }
            this.y2 += (long) this.w2;
            this.w2 = 0;
            while (true) {
                int i6 = this.x2;
                if (i6 < i) {
                    InputStream inputStream = this.J2;
                    byte[] bArr2 = this.K2;
                    int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                    if (read < 1) {
                        r1();
                        if (read == 0) {
                            throw new IOException(i0.d.a.a.a.g0("InputStream.read() returned 0 characters when trying to read ", i5, " bytes"));
                        }
                        throw new JsonParseException(this, i0.d.a.a.a.j0("Needed to read ", i, " bytes, missed ", i, " before end-of-input"));
                    }
                    this.x2 += read;
                } else {
                    return;
                }
            }
        } else {
            throw new JsonParseException(this, i0.d.a.a.a.g0("Needed to read ", i, " bytes, reached end-of-input"));
        }
    }

    public int Q0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (this.f2 == JsonToken.VALUE_EMBEDDED_OBJECT) {
            int i = 0;
            if (!this.H2) {
                byte[] bArr = this.D2;
                if (bArr == null) {
                    return 0;
                }
                int length = bArr.length;
                outputStream.write(bArr, 0, length);
                return length;
            }
            this.H2 = false;
            int x1 = x1(this.I2 & 31);
            if (x1 >= 0) {
                T1(outputStream, x1);
                return x1;
            }
            while (true) {
                int w1 = w1(2);
                if (w1 < 0) {
                    return i;
                }
                T1(outputStream, w1);
                i += w1;
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
            P0.append(this.f2);
            P0.append(") not VALUE_EMBEDDED_OBJECT, can not access as binary");
            throw new JsonParseException(this, P0.toString());
        }
    }

    public final int Q1() throws IOException {
        int i = this.w2;
        if (i < this.x2) {
            byte b = this.K2[i];
            this.w2 = i + 1;
            return b;
        }
        c2();
        byte[] bArr = this.K2;
        int i3 = this.w2;
        this.w2 = i3 + 1;
        return bArr[i3];
    }

    public final int R1() throws IOException {
        int i = this.w2;
        if (i >= this.F2) {
            if (i >= this.x2) {
                c2();
                int i3 = this.E2;
                if (i3 > 0) {
                    int i4 = this.w2;
                    int i5 = i3 + i4;
                    int i6 = this.x2;
                    if (i5 <= i6) {
                        this.E2 = 0;
                        this.F2 = i5;
                    } else {
                        this.E2 = i5 - i6;
                        this.F2 = i6;
                    }
                    byte[] bArr = this.K2;
                    this.w2 = i4 + 1;
                    return bArr[i4];
                }
            }
            int w1 = w1(3);
            if (w1 >= 0) {
                int i7 = this.w2;
                int i8 = w1 + i7;
                int i9 = this.x2;
                if (i8 <= i9) {
                    this.E2 = 0;
                    this.F2 = i8;
                } else {
                    this.E2 = i8 - i9;
                    this.F2 = i9;
                }
                byte[] bArr2 = this.K2;
                this.w2 = i7 + 1;
                return bArr2[i7];
            }
            d1(": chunked Text ends with partial UTF-8 character", JsonToken.VALUE_STRING);
            throw null;
        }
        byte b = this.K2[i];
        this.w2 = i + 1;
        return b;
    }

    public String S1(int i, boolean z) throws IOException {
        int i3 = i & 31;
        if (i3 > 23) {
            switch (i3) {
                case 24:
                    i3 = v1();
                    break;
                case 25:
                    i3 = s1();
                    break;
                case 26:
                    i3 = t1();
                    if (i3 < 0) {
                        return String.valueOf(z ? (-(((long) i3) & 4294967295L)) - 1 : ((long) i3) & 4294967295L);
                    }
                    break;
                case 27:
                    long u1 = u1();
                    if (z) {
                        u1 = (-u1) - 1;
                    }
                    return String.valueOf(u1);
                default:
                    throw new JsonParseException(this, i0.d.a.a.a.R(i, i0.d.a.a.a.Q0("Invalid length indicator for ints (", i3, "), token 0x")));
            }
        }
        if (z) {
            i3 = (-i3) - 1;
        }
        return String.valueOf(i3);
    }

    public i0.f.a.b.c T() {
        return this.A2;
    }

    public final int T1(OutputStream outputStream, int i) throws IOException {
        int i3 = i;
        while (i3 > 0) {
            int i4 = this.x2;
            int i5 = this.w2;
            int i6 = i4 - i5;
            if (i5 >= i4) {
                if (b2()) {
                    i6 = this.x2 - this.w2;
                } else {
                    V1(i, i - i3);
                    throw null;
                }
            }
            int min = Math.min(i6, i3);
            outputStream.write(this.K2, this.w2, min);
            this.w2 += min;
            i3 -= min;
        }
        this.H2 = false;
        return i;
    }

    public f<StreamReadCapability> U() {
        return JsonParser.c;
    }

    public void U1() throws IOException {
        byte[] bArr;
        if (this.L2 && (bArr = this.K2) != null) {
            this.K2 = null;
            this.u2.g(bArr);
        }
        this.B2.p();
    }

    public void V1(int i, int i3) throws IOException {
        d1(String.format(" for Binary value: expected %d bytes, only found %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i3)}), this.f2);
        throw null;
    }

    public void W1(int i) throws JsonParseException {
        if (i < 32) {
            g1(i);
            throw null;
        }
        throw new JsonParseException(this, i0.d.a.a.a.R(i, i0.d.a.a.a.P0("Invalid UTF-8 start byte 0x")));
    }

    public void X0() throws JsonParseException {
        if (!this.A2.f()) {
            String str = this.A2.d() ? "Array" : "Object";
            b bVar = this.A2;
            Object obj = this.u2.a;
            Objects.requireNonNull(bVar);
            d1(String.format(": expected close marker for %s (start marker at %s)", new Object[]{str, new JsonLocation(obj, 1, -1, -1)}), (JsonToken) null);
            throw null;
        }
    }

    public void X1(int i, int i3) throws JsonParseException {
        this.w2 = i3;
        throw new JsonParseException(this, i0.d.a.a.a.R(i, i0.d.a.a.a.P0("Invalid UTF-8 middle byte 0x")));
    }

    public void Y1() throws IOException {
        if (!this.A2.f()) {
            StringBuilder P0 = i0.d.a.a.a.P0("Unexpected Break (0xFF) token in definite length (");
            P0.append(this.A2.e);
            P0.append(") ");
            P0.append(this.A2.e() ? "Object" : "Array");
            throw new JsonParseException(this, P0.toString());
        }
        throw new JsonParseException(this, "Unexpected Break (0xFF) token in Root context");
    }

    public String Z() throws IOException {
        JsonToken jsonToken = this.f2;
        if (this.H2 && jsonToken == JsonToken.VALUE_STRING) {
            return K1(this.I2);
        }
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.B2.h();
        }
        if (jsonToken == null) {
            return null;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.A2.f;
        }
        if (jsonToken.isNumeric()) {
            return N().toString();
        }
        return this.f2.asString();
    }

    public void Z1(int i) throws IOException {
        while (true) {
            int min = Math.min(i, this.x2 - this.w2);
            this.w2 += min;
            i -= min;
            if (i > 0) {
                c2();
            } else {
                return;
            }
        }
    }

    public void a2() throws IOException {
        this.H2 = false;
        int i = this.I2;
        int i3 = (i >> 5) & 7;
        if (i3 == 3 || i3 == 2) {
            int i4 = i & 31;
            if (i4 <= 23) {
                if (i4 > 0) {
                    Z1(i4);
                }
            } else if (i4 != 31) {
                switch (i4) {
                    case 24:
                        Z1(v1());
                        return;
                    case 25:
                        Z1(s1());
                        return;
                    case 26:
                        Z1(t1());
                        return;
                    case 27:
                        long u1 = u1();
                        while (u1 > 2147483647L) {
                            Z1(Integer.MAX_VALUE);
                            u1 -= 2147483647L;
                        }
                        Z1((int) u1);
                        return;
                    default:
                        O1(i);
                        throw null;
                }
            } else {
                while (true) {
                    if (this.w2 >= this.x2) {
                        c2();
                    }
                    byte[] bArr = this.K2;
                    int i5 = this.w2;
                    this.w2 = i5 + 1;
                    byte b = bArr[i5] & 255;
                    if (b != 255) {
                        int i6 = b >> 5;
                        if (i6 == i3) {
                            byte b2 = b & 31;
                            if (b2 <= 23) {
                                if (b2 > 0) {
                                    Z1(b2);
                                }
                            } else if (b2 != 31) {
                                switch (b2) {
                                    case 24:
                                        Z1(v1());
                                        break;
                                    case 25:
                                        Z1(s1());
                                        break;
                                    case 26:
                                        Z1(t1());
                                        break;
                                    case 27:
                                        long u12 = u1();
                                        while (u12 > 2147483647L) {
                                            Z1(Integer.MAX_VALUE);
                                            u12 -= 2147483647L;
                                        }
                                        Z1((int) u12);
                                        break;
                                    default:
                                        O1(this.I2);
                                        throw null;
                                }
                            } else {
                                throw new JsonParseException(this, i0.d.a.a.a.g0("Illegal chunked-length indicator within chunked-length value (type ", i3, ")"));
                            }
                        } else {
                            throw new JsonParseException(this, i0.d.a.a.a.h0("Mismatched chunk in chunked content: expected ", i3, " but encountered ", i6));
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            k.a();
            throw null;
        }
    }

    public char[] b0() throws IOException {
        if (this.f2 == null) {
            return null;
        }
        if (this.H2) {
            L1();
        }
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.B2.n();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.A2.f.toCharArray();
        }
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return N().toString().toCharArray();
        }
        return jsonToken.asCharArray();
    }

    public boolean b2() throws IOException {
        InputStream inputStream = this.J2;
        if (inputStream != null) {
            this.y2 += (long) this.x2;
            byte[] bArr = this.K2;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.w2 = 0;
                this.x2 = read;
                return true;
            }
            r1();
            if (read == 0) {
                throw new IOException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("InputStream.read() returned 0 characters when trying to read "), this.K2.length, " bytes"));
            }
        }
        return false;
    }

    public int c0() throws IOException {
        if (this.f2 == null) {
            return 0;
        }
        if (this.H2) {
            L1();
        }
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.B2.t();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.A2.f.length();
        }
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return N().toString().length();
        }
        return jsonToken.asCharArray().length;
    }

    public void c2() throws IOException {
        if (!b2()) {
            c1();
            throw null;
        }
    }

    public void close() throws IOException {
        if (!this.v2) {
            this.v2 = true;
            this.M2.s();
            try {
                r1();
            } finally {
                U1();
            }
        }
    }

    public int d0() throws IOException {
        return 0;
    }

    public JsonLocation f0() {
        Object obj = this.u2.a;
        long j = this.z2;
        return new JsonLocation(obj, j, -1, -1, (int) j);
    }

    public BigInteger l() throws IOException {
        int i = this.R2;
        if ((i & 4) == 0) {
            if (i == 0) {
                q1();
            }
            int i3 = this.R2;
            if ((i3 & 4) == 0) {
                if ((i3 & 16) != 0) {
                    this.W2 = this.X2.toBigInteger();
                } else if ((i3 & 2) != 0) {
                    this.W2 = BigInteger.valueOf(this.T2);
                } else if ((i3 & 1) != 0) {
                    this.W2 = BigInteger.valueOf((long) this.S2);
                } else if ((i3 & 8) != 0) {
                    this.W2 = BigDecimal.valueOf(this.V2).toBigInteger();
                } else if ((i3 & 32) != 0) {
                    this.W2 = BigDecimal.valueOf((double) this.U2).toBigInteger();
                } else {
                    k.a();
                    throw null;
                }
                this.R2 |= 4;
            }
        }
        return this.W2;
    }

    public final String m1(int i, String str) {
        if (i < 5) {
            i0.f.a.b.k.a aVar = this.M2;
            int i3 = this.O2;
            aVar.g();
            if (aVar.d) {
                str = InternCache.c.a(str);
            }
            int c = aVar.c(aVar.i(i3));
            int[] iArr = aVar.f;
            iArr[c] = i3;
            iArr[c + 3] = 1;
            aVar.l[c >> 2] = str;
            aVar.k++;
            return str;
        } else if (i < 9) {
            i0.f.a.b.k.a aVar2 = this.M2;
            int i4 = this.O2;
            int i5 = this.P2;
            aVar2.g();
            if (aVar2.d) {
                str = InternCache.c.a(str);
            }
            int c2 = aVar2.c(i5 == 0 ? aVar2.i(i4) : aVar2.j(i4, i5));
            int[] iArr2 = aVar2.f;
            iArr2[c2] = i4;
            iArr2[c2 + 1] = i5;
            iArr2[c2 + 3] = 2;
            aVar2.l[c2 >> 2] = str;
            aVar2.k++;
            return str;
        } else if (i < 13) {
            i0.f.a.b.k.a aVar3 = this.M2;
            int i6 = this.O2;
            int i7 = this.P2;
            int i8 = this.Q2;
            aVar3.g();
            if (aVar3.d) {
                str = InternCache.c.a(str);
            }
            int c3 = aVar3.c(aVar3.k(i6, i7, i8));
            int[] iArr3 = aVar3.f;
            iArr3[c3] = i6;
            iArr3[c3 + 1] = i7;
            iArr3[c3 + 2] = i8;
            iArr3[c3 + 3] = 3;
            aVar3.l[c3 >> 2] = str;
            aVar3.k++;
            return str;
        } else {
            return this.M2.h(str, this.N2, (i + 3) >> 2);
        }
    }

    public byte[] n(Base64Variant base64Variant) throws IOException {
        if (this.H2) {
            L1();
        }
        if (this.f2 == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.D2;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
        P0.append(this.f2);
        P0.append(") not VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw new JsonParseException(this, P0.toString());
    }

    public final BigInteger n1(long j) {
        return o1(j).negate().subtract(BigInteger.ONE);
    }

    public final BigInteger o1(long j) {
        return BigInteger.valueOf((j << 1) >>> 1).or(s2);
    }

    public final boolean p1() throws IOException {
        int i = -1;
        if (!this.A2.k()) {
            this.G2 = -1;
            this.A2 = this.A2.c;
            this.f2 = JsonToken.END_ARRAY;
            return false;
        } else if (this.w2 < this.x2 || b2()) {
            byte[] bArr = this.K2;
            int i3 = this.w2;
            this.w2 = i3 + 1;
            byte b = bArr[i3] & 255;
            int i4 = b >> 5;
            byte b2 = b & 31;
            if (i4 == 6) {
                i = E1(b2);
                if (this.w2 < this.x2 || b2()) {
                    byte[] bArr2 = this.K2;
                    int i5 = this.w2;
                    this.w2 = i5 + 1;
                    b = bArr2[i5] & 255;
                    i4 = b >> 5;
                    b2 = b & 31;
                } else {
                    M1();
                    return false;
                }
            }
            if (i4 == 0) {
                this.R2 = 1;
                if (b2 <= 23) {
                    this.S2 = b2;
                } else {
                    int i6 = b2 - 24;
                    if (i6 == 0) {
                        this.S2 = v1();
                    } else if (i6 == 1) {
                        this.S2 = s1();
                    } else if (i6 == 2) {
                        int t1 = t1();
                        if (t1 >= 0) {
                            this.S2 = t1;
                        } else {
                            this.T2 = ((long) t1) & 4294967295L;
                            this.R2 = 2;
                        }
                    } else if (i6 == 3) {
                        long u1 = u1();
                        if (u1 >= 0) {
                            this.T2 = u1;
                            this.R2 = 2;
                        } else {
                            this.W2 = o1(u1);
                            this.R2 = 4;
                        }
                    } else {
                        O1(b);
                        throw null;
                    }
                }
                this.f2 = JsonToken.VALUE_NUMBER_INT;
                return true;
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 6) {
                        throw new JsonParseException(this, i0.d.a.a.a.g0("Multiple tags not allowed per value (first tag: ", i, ")"));
                    }
                } else if (i >= 0) {
                    this.I2 = b;
                    this.H2 = true;
                    JsonToken N1 = N1(i);
                    this.f2 = N1;
                    if (N1 == JsonToken.VALUE_NUMBER_INT) {
                        return true;
                    }
                    return false;
                }
                this.w2--;
                M0();
                return false;
            } else {
                this.R2 = 1;
                if (b2 <= 23) {
                    this.S2 = (-b2) - 1;
                } else {
                    int i7 = b2 - 24;
                    if (i7 == 0) {
                        this.S2 = (-v1()) - 1;
                    } else if (i7 == 1) {
                        this.S2 = (-s1()) - 1;
                    } else if (i7 == 2) {
                        int t12 = t1();
                        if (t12 < 0) {
                            this.T2 = (-(((long) t12) & 4294967295L)) - 1;
                            this.R2 = 2;
                        } else {
                            this.S2 = (-t12) - 1;
                        }
                    } else if (i7 == 3) {
                        long u12 = u1();
                        if (u12 >= 0) {
                            this.T2 = (-u12) - 1;
                            this.R2 = 2;
                        } else {
                            this.W2 = n1(u12);
                            this.R2 = 4;
                        }
                    } else {
                        O1(b);
                        throw null;
                    }
                }
                this.f2 = JsonToken.VALUE_NUMBER_INT;
                return true;
            }
        } else {
            M1();
            return false;
        }
    }

    public void q1() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            StringBuilder P0 = i0.d.a.a.a.P0("Current token (");
            P0.append(this.f2);
            P0.append(") not numeric, can not use numeric value accessors");
            throw new JsonParseException(this, P0.toString());
        }
    }

    public String r0() throws IOException {
        if (this.H2 && this.f2 == JsonToken.VALUE_STRING) {
            return K1(this.I2);
        }
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this.B2.h();
        }
        if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) {
            return null;
        }
        return Z();
    }

    public void r1() throws IOException {
        if (this.J2 != null) {
            if (this.u2.c || C0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.J2.close();
            }
            this.J2 = null;
        }
    }

    public final int s1() throws IOException {
        int i = this.w2;
        int i3 = i + 1;
        int i4 = this.x2;
        if (i3 >= i4) {
            if (i >= i4) {
                c2();
            }
            byte[] bArr = this.K2;
            int i5 = this.w2;
            int i6 = i5 + 1;
            this.w2 = i6;
            byte b = bArr[i5] & 255;
            if (i6 >= this.x2) {
                c2();
            }
            byte[] bArr2 = this.K2;
            int i7 = this.w2;
            this.w2 = i7 + 1;
            return (b << 8) + (bArr2[i7] & 255);
        }
        byte[] bArr3 = this.K2;
        int i8 = ((bArr3[i] & 255) << 8) + (bArr3[i3] & 255);
        this.w2 = i + 2;
        return i8;
    }

    public final int t1() throws IOException {
        int i = this.w2;
        int i3 = i + 3;
        int i4 = this.x2;
        if (i3 >= i4) {
            if (i >= i4) {
                c2();
            }
            byte[] bArr = this.K2;
            int i5 = this.w2;
            int i6 = i5 + 1;
            this.w2 = i6;
            byte b = bArr[i5];
            if (i6 >= this.x2) {
                c2();
            }
            byte[] bArr2 = this.K2;
            int i7 = this.w2;
            int i8 = i7 + 1;
            this.w2 = i8;
            int i9 = (b << 8) + (bArr2[i7] & 255);
            if (i8 >= this.x2) {
                c2();
            }
            byte[] bArr3 = this.K2;
            int i10 = this.w2;
            int i11 = i10 + 1;
            this.w2 = i11;
            int i12 = (i9 << 8) + (bArr3[i10] & 255);
            if (i11 >= this.x2) {
                c2();
            }
            byte[] bArr4 = this.K2;
            int i13 = this.w2;
            this.w2 = i13 + 1;
            return (i12 << 8) + (bArr4[i13] & 255);
        }
        byte[] bArr5 = this.K2;
        int i14 = i + 1;
        int i15 = i14 + 1;
        int i16 = (bArr5[i] << 24) + ((bArr5[i14] & 255) << 16);
        int i17 = i15 + 1;
        int i18 = i16 + ((bArr5[i15] & 255) << 8) + (bArr5[i17] & 255);
        this.w2 = i17 + 1;
        return i18;
    }

    public String u0(String str) throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING || (jsonToken != null && jsonToken != JsonToken.VALUE_NULL && jsonToken.isScalarValue())) {
            return Z();
        }
        return str;
    }

    public final long u1() throws IOException {
        int i = this.w2;
        if (i + 7 >= this.x2) {
            return (((long) t1()) << 32) + ((((long) t1()) << 32) >>> 32);
        }
        byte[] bArr = this.K2;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i] << 24) + ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 + ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 + (bArr[i6] & 255);
        int i10 = i8 + 1;
        int i11 = i10 + 1;
        int i12 = (bArr[i8] << 24) + ((bArr[i10] & 255) << 16);
        int i13 = i11 + 1;
        int i14 = i12 + ((bArr[i11] & 255) << 8);
        this.w2 = i13 + 1;
        return (((long) i9) << 32) + ((((long) (i14 + (bArr[i13] & 255))) << 32) >>> 32);
    }

    public d v() {
        return this.t2;
    }

    public final int v1() throws IOException {
        if (this.w2 >= this.x2) {
            c2();
        }
        byte[] bArr = this.K2;
        int i = this.w2;
        this.w2 = i + 1;
        return bArr[i] & 255;
    }

    public JsonLocation w() {
        long j = this.y2 + ((long) this.w2);
        return new JsonLocation(this.u2.a, j, -1, -1, (int) j);
    }

    public boolean w0() {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.VALUE_STRING) {
            i iVar = this.B2;
            if (iVar.d >= 0 || iVar.l != null || iVar.k == null) {
                return true;
            }
            return false;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
        }
        return false;
    }

    public final int w1(int i) throws IOException {
        if (this.w2 >= this.x2) {
            c2();
        }
        byte[] bArr = this.K2;
        int i3 = this.w2;
        this.w2 = i3 + 1;
        byte b = bArr[i3] & 255;
        if (b == 255) {
            return -1;
        }
        int i4 = b >> 5;
        if (i4 == i) {
            int x1 = x1(b & 31);
            if (x1 >= 0) {
                return x1;
            }
            throw new JsonParseException(this, i0.d.a.a.a.g0("Illegal chunked-length indicator within chunked-length value (type ", i, ")"));
        }
        StringBuilder R0 = i0.d.a.a.a.R0("Mismatched chunk in chunked content: expected ", i, " but encountered ", i4, " (byte 0x");
        R0.append(Integer.toHexString(b));
        R0.append(")");
        throw new JsonParseException(this, R0.toString());
    }

    public final int x1(int i) throws IOException {
        if (i == 31) {
            return -1;
        }
        if (i <= 23) {
            return i;
        }
        int i3 = i - 24;
        if (i3 == 0) {
            return v1();
        }
        if (i3 == 1) {
            return s1();
        }
        if (i3 == 2) {
            return t1();
        }
        if (i3 == 3) {
            long u1 = u1();
            if (u1 >= 0 && u1 <= 2147483647L) {
                return (int) u1;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Illegal length for ");
            P0.append(this.f2);
            P0.append(": ");
            P0.append(u1);
            throw new JsonParseException(this, P0.toString());
        }
        StringBuilder P02 = i0.d.a.a.a.P0("Invalid length for ");
        P02.append(this.f2);
        P02.append(": 0x");
        P02.append(Integer.toHexString(i));
        throw new JsonParseException(this, P02.toString());
    }

    public String y() throws IOException {
        JsonToken jsonToken = this.f2;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            return this.A2.c.f;
        }
        return this.A2.f;
    }

    public final JsonToken y1() throws IOException {
        String str;
        if (this.w2 >= this.x2) {
            c2();
        }
        byte[] bArr = this.K2;
        int i = this.w2;
        this.w2 = i + 1;
        byte b = bArr[i];
        if (((b >> 5) & 7) == 3) {
            byte b2 = b & 31;
            if (b2 > 23) {
                int x1 = x1(b2);
                if (x1 < 0) {
                    H1();
                    str = this.B2.h();
                } else {
                    str = A1(x1);
                }
            } else if (b2 == 0) {
                str = "";
            } else {
                String F1 = F1(b2);
                if (F1 != null) {
                    this.w2 += b2;
                    str = F1;
                } else {
                    str = m1(b2, C1(b2));
                }
            }
            this.A2.n(str);
            return JsonToken.FIELD_NAME;
        } else if (b != -1) {
            B1(b);
            return JsonToken.FIELD_NAME;
        } else if (!this.A2.l()) {
            this.A2 = this.A2.c;
            return JsonToken.END_OBJECT;
        } else {
            Y1();
            throw null;
        }
    }

    public final float z1() throws IOException {
        int s1 = s1() & 65535;
        boolean z = (s1 >> 15) != 0;
        int i = (s1 >> 10) & 31;
        int i3 = s1 & 1023;
        if (i == 0) {
            float f = (float) ((((double) i3) / i2) * j2);
            return z ? -f : f;
        } else if (i != 31) {
            float pow = (float) (((((double) i3) / i2) + 1.0d) * Math.pow(2.0d, (double) (i - 15)));
            return z ? -pow : pow;
        } else if (i3 != 0) {
            return Float.NaN;
        } else {
            return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
    }
}
