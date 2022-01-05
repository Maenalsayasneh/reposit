package i0.f.a.b.j;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.b.d;
import i0.f.a.b.e;
import i0.f.a.b.f;
import i0.f.a.b.i.a;
import i0.f.a.b.i.b;
import i0.f.a.b.m.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: WriterBasedJsonGenerator */
public class h extends c {
    public static final char[] h2 = ((char[]) a.a.clone());
    public final Writer i2;
    public char j2;
    public char[] k2;
    public int l2;
    public int m2;
    public int n2;
    public char[] o2;

    public h(b bVar, int i, d dVar, Writer writer, char c) {
        super(bVar, i, dVar);
        int[] iArr;
        this.i2 = writer;
        bVar.a(bVar.h);
        char[] b = bVar.d.b(1, 0);
        bVar.h = b;
        this.k2 = b;
        this.n2 = b.length;
        this.j2 = c;
        if (c != '\"') {
            if (c == '\"') {
                iArr = a.h;
            } else {
                a.C0117a aVar = a.C0117a.a;
                int[] iArr2 = aVar.b[c];
                if (iArr2 == null) {
                    iArr2 = Arrays.copyOf(a.h, 128);
                    if (iArr2[c] == 0) {
                        iArr2[c] = -1;
                    }
                    aVar.b[c] = iArr2;
                }
                iArr = iArr2;
            }
            this.d2 = iArr;
        }
    }

    public void A0(String str) throws IOException {
        int length = str.length();
        int i = this.n2 - this.m2;
        if (i == 0) {
            Z0();
            i = this.n2 - this.m2;
        }
        if (i >= length) {
            str.getChars(0, length, this.k2, this.m2);
            this.m2 += length;
            return;
        }
        int i3 = this.n2;
        int i4 = this.m2;
        int i5 = i3 - i4;
        str.getChars(0, i5, this.k2, i4);
        this.m2 += i5;
        Z0();
        int length2 = str.length() - i5;
        while (true) {
            int i6 = this.n2;
            if (length2 > i6) {
                int i7 = i5 + i6;
                str.getChars(i5, i7, this.k2, 0);
                this.l2 = 0;
                this.m2 = i6;
                Z0();
                length2 -= i6;
                i5 = i7;
            } else {
                str.getChars(i5, i5 + length2, this.k2, 0);
                this.l2 = 0;
                this.m2 = length2;
                return;
            }
        }
    }

    public void C0(char[] cArr, int i, int i3) throws IOException {
        if (i3 < 32) {
            if (i3 > this.n2 - this.m2) {
                Z0();
            }
            System.arraycopy(cArr, i, this.k2, this.m2, i3);
            this.m2 += i3;
            return;
        }
        Z0();
        this.i2.write(cArr, i, i3);
    }

    public int I(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        V0("write a binary value");
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i3 = this.m2;
        this.m2 = i3 + 1;
        cArr[i3] = this.j2;
        byte[] d = this.c2.d();
        if (i < 0) {
            try {
                i = d1(base64Variant, inputStream, d);
            } catch (Throwable th) {
                this.c2.e(d);
                throw th;
            }
        } else {
            int e1 = e1(base64Variant, inputStream, d, i);
            if (e1 > 0) {
                throw new JsonGenerationException("Too few bytes available: missing " + e1 + " bytes (out of " + i + ")", this);
            }
        }
        this.c2.e(d);
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr2 = this.k2;
        int i4 = this.m2;
        this.m2 = i4 + 1;
        cArr2[i4] = this.j2;
        return i;
    }

    public void I0() throws IOException {
        V0("start an array");
        this.a2 = this.a2.i();
        e eVar = this.q;
        if (eVar != null) {
            eVar.g(this);
            return;
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = '[';
    }

    public void K0(Object obj) throws IOException {
        V0("start an array");
        this.a2 = this.a2.j(obj);
        e eVar = this.q;
        if (eVar != null) {
            eVar.g(this);
            return;
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = '[';
    }

    public void L0(Object obj, int i) throws IOException {
        V0("start an array");
        this.a2 = this.a2.j(obj);
        e eVar = this.q;
        if (eVar != null) {
            eVar.g(this);
            return;
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i3 = this.m2;
        this.m2 = i3 + 1;
        cArr[i3] = '[';
    }

    public void M(Base64Variant base64Variant, byte[] bArr, int i, int i3) throws IOException, JsonGenerationException {
        V0("write a binary value");
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i4 = this.m2;
        this.m2 = i4 + 1;
        cArr[i4] = this.j2;
        int i5 = i3 + i;
        int i6 = i5 - 3;
        int i7 = this.n2 - 6;
        int i8 = base64Variant.Y1 >> 2;
        while (i <= i6) {
            if (this.m2 > i7) {
                Z0();
            }
            int i9 = i + 1;
            int i10 = i9 + 1;
            int i11 = i10 + 1;
            int h = base64Variant.h((((bArr[i] << 8) | (bArr[i9] & 255)) << 8) | (bArr[i10] & 255), this.k2, this.m2);
            this.m2 = h;
            i8--;
            if (i8 <= 0) {
                char[] cArr2 = this.k2;
                int i12 = h + 1;
                this.m2 = i12;
                cArr2[h] = '\\';
                this.m2 = i12 + 1;
                cArr2[i12] = 'n';
                i8 = base64Variant.Y1 >> 2;
            }
            i = i11;
        }
        int i13 = i5 - i;
        if (i13 > 0) {
            if (this.m2 > i7) {
                Z0();
            }
            int i14 = i + 1;
            int i15 = bArr[i] << 16;
            if (i13 == 2) {
                i15 |= (bArr[i14] & 255) << 8;
            }
            this.m2 = base64Variant.i(i15, i13, this.k2, this.m2);
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr3 = this.k2;
        int i16 = this.m2;
        this.m2 = i16 + 1;
        cArr3[i16] = this.j2;
    }

    public void M0() throws IOException {
        V0("start an object");
        this.a2 = this.a2.k();
        e eVar = this.q;
        if (eVar != null) {
            eVar.a(this);
            return;
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = '{';
    }

    public void N0(Object obj) throws IOException {
        V0("start an object");
        this.a2 = this.a2.l(obj);
        e eVar = this.q;
        if (eVar != null) {
            eVar.a(this);
            return;
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = '{';
    }

    public void O(boolean z) throws IOException {
        int i;
        V0("write a boolean value");
        if (this.m2 + 5 >= this.n2) {
            Z0();
        }
        int i3 = this.m2;
        char[] cArr = this.k2;
        if (z) {
            cArr[i3] = 't';
            int i4 = i3 + 1;
            cArr[i4] = 'r';
            int i5 = i4 + 1;
            cArr[i5] = 'u';
            i = i5 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i3] = 'f';
            int i6 = i3 + 1;
            cArr[i6] = 'a';
            int i7 = i6 + 1;
            cArr[i7] = 'l';
            int i8 = i7 + 1;
            cArr[i8] = 's';
            i = i8 + 1;
            cArr[i] = 'e';
        }
        this.m2 = i + 1;
    }

    public void P0(f fVar) throws IOException {
        V0("write a string");
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        int i3 = i + 1;
        this.m2 = i3;
        cArr[i] = this.j2;
        int c = fVar.c(cArr, i3);
        if (c < 0) {
            char[] a = fVar.a();
            int length = a.length;
            if (length < 32) {
                if (length > this.n2 - this.m2) {
                    Z0();
                }
                System.arraycopy(a, 0, this.k2, this.m2, length);
                this.m2 += length;
            } else {
                Z0();
                this.i2.write(a, 0, length);
            }
            if (this.m2 >= this.n2) {
                Z0();
            }
            char[] cArr2 = this.k2;
            int i4 = this.m2;
            this.m2 = i4 + 1;
            cArr2[i4] = this.j2;
            return;
        }
        int i5 = this.m2 + c;
        this.m2 = i5;
        if (i5 >= this.n2) {
            Z0();
        }
        char[] cArr3 = this.k2;
        int i6 = this.m2;
        this.m2 = i6 + 1;
        cArr3[i6] = this.j2;
    }

    public void Q0(String str) throws IOException {
        V0("write a string");
        if (str == null) {
            f1();
            return;
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = this.j2;
        h1(str);
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr2 = this.k2;
        int i3 = this.m2;
        this.m2 = i3 + 1;
        cArr2[i3] = this.j2;
    }

    public void R0(char[] cArr, int i, int i3) throws IOException {
        char c;
        V0("write a string");
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr2 = this.k2;
        int i4 = this.m2;
        this.m2 = i4 + 1;
        cArr2[i4] = this.j2;
        int i5 = this.e2;
        if (i5 != 0) {
            int i6 = i3 + i;
            int[] iArr = this.d2;
            int min = Math.min(iArr.length, i5 + 1);
            int i7 = 0;
            while (i < i6) {
                int i8 = i;
                while (true) {
                    c = cArr[i8];
                    if (c >= min) {
                        if (c > i5) {
                            i7 = -1;
                            break;
                        }
                    } else {
                        i7 = iArr[c];
                        if (i7 != 0) {
                            break;
                        }
                    }
                    i8++;
                    if (i8 >= i6) {
                        break;
                    }
                }
                int i9 = i8 - i;
                if (i9 < 32) {
                    if (this.m2 + i9 > this.n2) {
                        Z0();
                    }
                    if (i9 > 0) {
                        System.arraycopy(cArr, i, this.k2, this.m2, i9);
                        this.m2 += i9;
                    }
                } else {
                    Z0();
                    this.i2.write(cArr, i, i9);
                }
                if (i8 >= i6) {
                    break;
                }
                i = i8 + 1;
                Y0(c, i7);
            }
        } else {
            int i10 = i3 + i;
            int[] iArr2 = this.d2;
            int length = iArr2.length;
            while (i < i10) {
                int i11 = i;
                do {
                    char c2 = cArr[i11];
                    if ((c2 < length && iArr2[c2] != 0) || (i11 = i11 + 1) >= i10) {
                        int i12 = i11 - i;
                    }
                    char c22 = cArr[i11];
                    break;
                } while ((i11 = i11 + 1) >= i10);
                int i122 = i11 - i;
                if (i122 < 32) {
                    if (this.m2 + i122 > this.n2) {
                        Z0();
                    }
                    if (i122 > 0) {
                        System.arraycopy(cArr, i, this.k2, this.m2, i122);
                        this.m2 += i122;
                    }
                } else {
                    Z0();
                    this.i2.write(cArr, i, i122);
                }
                if (i11 >= i10) {
                    break;
                }
                i = i11 + 1;
                char c3 = cArr[i11];
                Y0(c3, iArr2[c3]);
            }
        }
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr3 = this.k2;
        int i13 = this.m2;
        this.m2 = i13 + 1;
        cArr3[i13] = this.j2;
    }

    public void T() throws IOException {
        if (this.a2.d()) {
            e eVar = this.q;
            if (eVar != null) {
                eVar.k(this, this.a2.b + 1);
            } else {
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr = this.k2;
                int i = this.m2;
                this.m2 = i + 1;
                cArr[i] = ']';
            }
            e eVar2 = this.a2;
            eVar2.g = null;
            this.a2 = eVar2.c;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Current context not Array but ");
        P0.append(this.a2.h());
        throw new JsonGenerationException(P0.toString(), this);
    }

    public void U() throws IOException {
        if (this.a2.e()) {
            e eVar = this.q;
            if (eVar != null) {
                eVar.f(this, this.a2.b + 1);
            } else {
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr = this.k2;
                int i = this.m2;
                this.m2 = i + 1;
                cArr[i] = '}';
            }
            e eVar2 = this.a2;
            eVar2.g = null;
            this.a2 = eVar2.c;
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Current context not Object but ");
        P0.append(this.a2.h());
        throw new JsonGenerationException(P0.toString(), this);
    }

    public final void V0(String str) throws IOException {
        char c;
        int q = this.a2.q();
        e eVar = this.q;
        if (eVar == null) {
            if (q == 1) {
                c = ',';
            } else if (q == 2) {
                c = ':';
            } else if (q == 3) {
                f fVar = this.f2;
                if (fVar != null) {
                    A0(fVar.getValue());
                    return;
                }
                return;
            } else if (q == 5) {
                W0(str);
                throw null;
            } else {
                return;
            }
            if (this.m2 >= this.n2) {
                Z0();
            }
            char[] cArr = this.k2;
            int i = this.m2;
            this.m2 = i + 1;
            cArr[i] = c;
        } else if (q != 0) {
            if (q == 1) {
                eVar.c(this);
            } else if (q == 2) {
                eVar.l(this);
            } else if (q == 3) {
                eVar.b(this);
            } else if (q != 5) {
                k.a();
                throw null;
            } else {
                W0(str);
                throw null;
            }
        } else if (this.a2.d()) {
            this.q.h(this);
        } else if (this.a2.e()) {
            this.q.d(this);
        }
    }

    public final char[] X0() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.o2 = cArr;
        return cArr;
    }

    public final void Y0(char c, int i) throws IOException, JsonGenerationException {
        int i3;
        if (i >= 0) {
            if (this.m2 + 2 > this.n2) {
                Z0();
            }
            char[] cArr = this.k2;
            int i4 = this.m2;
            int i5 = i4 + 1;
            this.m2 = i5;
            cArr[i4] = '\\';
            this.m2 = i5 + 1;
            cArr[i5] = (char) i;
        } else if (i != -2) {
            if (this.m2 + 5 >= this.n2) {
                Z0();
            }
            int i6 = this.m2;
            char[] cArr2 = this.k2;
            int i7 = i6 + 1;
            cArr2[i6] = '\\';
            int i8 = i7 + 1;
            cArr2[i7] = 'u';
            if (c > 255) {
                int i9 = 255 & (c >> 8);
                int i10 = i8 + 1;
                char[] cArr3 = h2;
                cArr2[i8] = cArr3[i9 >> 4];
                i3 = i10 + 1;
                cArr2[i10] = cArr3[i9 & 15];
                c = (char) (c & 255);
            } else {
                int i11 = i8 + 1;
                cArr2[i8] = '0';
                i3 = i11 + 1;
                cArr2[i11] = '0';
            }
            int i12 = i3 + 1;
            char[] cArr4 = h2;
            cArr2[i3] = cArr4[c >> 4];
            cArr2[i12] = cArr4[c & 15];
            this.m2 = i12 + 1;
        } else {
            Objects.requireNonNull((Object) null);
            throw null;
        }
    }

    public void Z(f fVar) throws IOException {
        int p = this.a2.p(fVar.getValue());
        if (p != 4) {
            boolean z = p == 1;
            e eVar = this.q;
            if (eVar != null) {
                if (z) {
                    eVar.i(this);
                } else {
                    eVar.d(this);
                }
                char[] a = fVar.a();
                if (this.g2) {
                    C0(a, 0, a.length);
                    return;
                }
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr = this.k2;
                int i = this.m2;
                this.m2 = i + 1;
                cArr[i] = this.j2;
                C0(a, 0, a.length);
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr2 = this.k2;
                int i3 = this.m2;
                this.m2 = i3 + 1;
                cArr2[i3] = this.j2;
                return;
            }
            if (this.m2 + 1 >= this.n2) {
                Z0();
            }
            if (z) {
                char[] cArr3 = this.k2;
                int i4 = this.m2;
                this.m2 = i4 + 1;
                cArr3[i4] = ',';
            }
            if (this.g2) {
                char[] a2 = fVar.a();
                C0(a2, 0, a2.length);
                return;
            }
            char[] cArr4 = this.k2;
            int i5 = this.m2;
            int i6 = i5 + 1;
            this.m2 = i6;
            cArr4[i5] = this.j2;
            int c = fVar.c(cArr4, i6);
            if (c < 0) {
                char[] a3 = fVar.a();
                C0(a3, 0, a3.length);
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr5 = this.k2;
                int i7 = this.m2;
                this.m2 = i7 + 1;
                cArr5[i7] = this.j2;
                return;
            }
            int i8 = this.m2 + c;
            this.m2 = i8;
            if (i8 >= this.n2) {
                Z0();
            }
            char[] cArr6 = this.k2;
            int i9 = this.m2;
            this.m2 = i9 + 1;
            cArr6[i9] = this.j2;
            return;
        }
        throw new JsonGenerationException("Can not write a field name, expecting a value", this);
    }

    public void Z0() throws IOException {
        int i = this.m2;
        int i3 = this.l2;
        int i4 = i - i3;
        if (i4 > 0) {
            this.l2 = 0;
            this.m2 = 0;
            this.i2.write(this.k2, i3, i4);
        }
    }

    public final int a1(char[] cArr, int i, int i3, char c, int i4) throws IOException, JsonGenerationException {
        int i5;
        if (i4 >= 0) {
            if (i <= 1 || i >= i3) {
                char[] cArr2 = this.o2;
                if (cArr2 == null) {
                    cArr2 = X0();
                }
                cArr2[1] = (char) i4;
                this.i2.write(cArr2, 0, 2);
                return i;
            }
            int i6 = i - 2;
            cArr[i6] = '\\';
            cArr[i6 + 1] = (char) i4;
            return i6;
        } else if (i4 == -2) {
            Objects.requireNonNull((Object) null);
            throw null;
        } else if (i <= 5 || i >= i3) {
            char[] cArr3 = this.o2;
            if (cArr3 == null) {
                cArr3 = X0();
            }
            this.l2 = this.m2;
            if (c > 255) {
                int i7 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr4 = h2;
                cArr3[10] = cArr4[i7 >> 4];
                cArr3[11] = cArr4[i7 & 15];
                cArr3[12] = cArr4[c2 >> 4];
                cArr3[13] = cArr4[c2 & 15];
                this.i2.write(cArr3, 8, 6);
                return i;
            }
            char[] cArr5 = h2;
            cArr3[6] = cArr5[c >> 4];
            cArr3[7] = cArr5[c & 15];
            this.i2.write(cArr3, 2, 6);
            return i;
        } else {
            int i8 = i - 6;
            int i9 = i8 + 1;
            cArr[i8] = '\\';
            int i10 = i9 + 1;
            cArr[i9] = 'u';
            if (c > 255) {
                int i11 = (c >> 8) & 255;
                int i12 = i10 + 1;
                char[] cArr6 = h2;
                cArr[i10] = cArr6[i11 >> 4];
                i5 = i12 + 1;
                cArr[i12] = cArr6[i11 & 15];
                c = (char) (c & 255);
            } else {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i5 = i13 + 1;
                cArr[i13] = '0';
            }
            int i14 = i5 + 1;
            char[] cArr7 = h2;
            cArr[i5] = cArr7[c >> 4];
            cArr[i14] = cArr7[c & 15];
            return i14 - 5;
        }
    }

    public void b0(String str) throws IOException {
        int p = this.a2.p(str);
        if (p != 4) {
            boolean z = p == 1;
            e eVar = this.q;
            if (eVar != null) {
                if (z) {
                    eVar.i(this);
                } else {
                    eVar.d(this);
                }
                if (this.g2) {
                    h1(str);
                    return;
                }
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr = this.k2;
                int i = this.m2;
                this.m2 = i + 1;
                cArr[i] = this.j2;
                h1(str);
                if (this.m2 >= this.n2) {
                    Z0();
                }
                char[] cArr2 = this.k2;
                int i3 = this.m2;
                this.m2 = i3 + 1;
                cArr2[i3] = this.j2;
                return;
            }
            if (this.m2 + 1 >= this.n2) {
                Z0();
            }
            if (z) {
                char[] cArr3 = this.k2;
                int i4 = this.m2;
                this.m2 = i4 + 1;
                cArr3[i4] = ',';
            }
            if (this.g2) {
                h1(str);
                return;
            }
            char[] cArr4 = this.k2;
            int i5 = this.m2;
            this.m2 = i5 + 1;
            cArr4[i5] = this.j2;
            h1(str);
            if (this.m2 >= this.n2) {
                Z0();
            }
            char[] cArr5 = this.k2;
            int i6 = this.m2;
            this.m2 = i6 + 1;
            cArr5[i6] = this.j2;
            return;
        }
        throw new JsonGenerationException("Can not write a field name, expecting a value", this);
    }

    public final void b1(char c, int i) throws IOException, JsonGenerationException {
        int i3;
        if (i >= 0) {
            int i4 = this.m2;
            if (i4 >= 2) {
                int i5 = i4 - 2;
                this.l2 = i5;
                char[] cArr = this.k2;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i;
                return;
            }
            char[] cArr2 = this.o2;
            if (cArr2 == null) {
                cArr2 = X0();
            }
            this.l2 = this.m2;
            cArr2[1] = (char) i;
            this.i2.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i6 = this.m2;
            if (i6 >= 6) {
                char[] cArr3 = this.k2;
                int i7 = i6 - 6;
                this.l2 = i7;
                cArr3[i7] = '\\';
                int i8 = i7 + 1;
                cArr3[i8] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr4 = h2;
                    cArr3[i10] = cArr4[i9 >> 4];
                    i3 = i10 + 1;
                    cArr3[i3] = cArr4[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr3[i11] = '0';
                    i3 = i11 + 1;
                    cArr3[i3] = '0';
                }
                int i12 = i3 + 1;
                char[] cArr5 = h2;
                cArr3[i12] = cArr5[c >> 4];
                cArr3[i12 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.o2;
            if (cArr6 == null) {
                cArr6 = X0();
            }
            this.l2 = this.m2;
            if (c > 255) {
                int i13 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = h2;
                cArr6[10] = cArr7[i13 >> 4];
                cArr6[11] = cArr7[i13 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.i2.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = h2;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.i2.write(cArr6, 2, 6);
        } else {
            Objects.requireNonNull((Object) null);
            throw null;
        }
    }

    public void c0() throws IOException {
        V0("write a null");
        f1();
    }

    public final int c1(InputStream inputStream, byte[] bArr, int i, int i3, int i4) throws IOException {
        int i5 = 0;
        while (i < i3) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int min = Math.min(i4, bArr.length);
        do {
            int i6 = min - i5;
            if (i6 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i5, i6);
            if (read < 0) {
                return i5;
            }
            i5 += read;
        } while (i5 < 3);
        return i5;
    }

    public void close() throws IOException {
        if (this.k2 != null && n(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                e eVar = this.a2;
                if (!eVar.d()) {
                    if (!eVar.e()) {
                        break;
                    }
                    U();
                } else {
                    T();
                }
            }
        }
        Z0();
        this.l2 = 0;
        this.m2 = 0;
        if (this.i2 != null) {
            if (this.c2.c || n(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.i2.close();
            } else if (n(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.i2.flush();
            }
        }
        char[] cArr = this.k2;
        if (cArr != null) {
            this.k2 = null;
            b bVar = this.c2;
            Objects.requireNonNull(bVar);
            bVar.c(cArr, bVar.h);
            bVar.h = null;
            bVar.d.d.set(1, cArr);
        }
    }

    public void d0(double d) throws IOException {
        if (!this.Z1) {
            String str = i0.f.a.b.i.f.a;
            if (!(Double.isNaN(d) || Double.isInfinite(d)) || !n(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                V0("write a number");
                A0(String.valueOf(d));
                return;
            }
        }
        Q0(String.valueOf(d));
    }

    public final int d1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i = this.n2 - 6;
        int i3 = 2;
        int i4 = base64Variant.Y1 >> 2;
        int i5 = -3;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 > i5) {
                i7 = c1(inputStream, bArr, i6, i7, bArr.length);
                if (i7 < 3) {
                    break;
                }
                i5 = i7 - 3;
                i6 = 0;
            }
            if (this.m2 > i) {
                Z0();
            }
            int i9 = i6 + 1;
            int i10 = i9 + 1;
            i6 = i10 + 1;
            i8 += 3;
            int h = base64Variant.h((((bArr[i9] & 255) | (bArr[i6] << 8)) << 8) | (bArr[i10] & 255), this.k2, this.m2);
            this.m2 = h;
            i4--;
            if (i4 <= 0) {
                char[] cArr = this.k2;
                int i11 = h + 1;
                this.m2 = i11;
                cArr[h] = '\\';
                this.m2 = i11 + 1;
                cArr[i11] = 'n';
                i4 = base64Variant.Y1 >> 2;
            }
        }
        if (i7 <= 0) {
            return i8;
        }
        if (this.m2 > i) {
            Z0();
        }
        int i12 = bArr[0] << 16;
        if (1 < i7) {
            i12 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i13 = i8 + i3;
        this.m2 = base64Variant.i(i12, i3, this.k2, this.m2);
        return i13;
    }

    public final int e1(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int c1;
        int i3 = this.n2 - 6;
        int i4 = 2;
        int i5 = base64Variant.Y1 >> 2;
        int i6 = -3;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i7 > i6) {
                i8 = c1(inputStream, bArr, i7, i8, i);
                if (i8 < 3) {
                    i7 = 0;
                    break;
                }
                i6 = i8 - 3;
                i7 = 0;
            }
            if (this.m2 > i3) {
                Z0();
            }
            int i9 = i7 + 1;
            int i10 = i9 + 1;
            i7 = i10 + 1;
            i -= 3;
            int h = base64Variant.h((((bArr[i9] & 255) | (bArr[i7] << 8)) << 8) | (bArr[i10] & 255), this.k2, this.m2);
            this.m2 = h;
            i5--;
            if (i5 <= 0) {
                char[] cArr = this.k2;
                int i11 = h + 1;
                this.m2 = i11;
                cArr[h] = '\\';
                this.m2 = i11 + 1;
                cArr[i11] = 'n';
                i5 = base64Variant.Y1 >> 2;
            }
        }
        if (i <= 0 || (c1 = c1(inputStream, bArr, i7, i8, i)) <= 0) {
            return i;
        }
        if (this.m2 > i3) {
            Z0();
        }
        int i12 = bArr[0] << 16;
        if (1 < c1) {
            i12 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this.m2 = base64Variant.i(i12, i4, this.k2, this.m2);
        return i - i4;
    }

    public void f0(float f) throws IOException {
        if (!this.Z1) {
            String str = i0.f.a.b.i.f.a;
            if (!(Float.isNaN(f) || Float.isInfinite(f)) || !n(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                V0("write a number");
                A0(String.valueOf(f));
                return;
            }
        }
        Q0(String.valueOf(f));
    }

    public final void f1() throws IOException {
        if (this.m2 + 4 >= this.n2) {
            Z0();
        }
        int i = this.m2;
        char[] cArr = this.k2;
        cArr[i] = 'n';
        int i3 = i + 1;
        cArr[i3] = 'u';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        int i5 = i4 + 1;
        cArr[i5] = 'l';
        this.m2 = i5 + 1;
    }

    public void flush() throws IOException {
        Z0();
        if (this.i2 != null && n(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.i2.flush();
        }
    }

    public void g0(int i) throws IOException {
        V0("write a number");
        if (this.Z1) {
            if (this.m2 + 13 >= this.n2) {
                Z0();
            }
            char[] cArr = this.k2;
            int i3 = this.m2;
            int i4 = i3 + 1;
            this.m2 = i4;
            cArr[i3] = this.j2;
            int d = i0.f.a.b.i.f.d(i, cArr, i4);
            this.m2 = d;
            char[] cArr2 = this.k2;
            this.m2 = d + 1;
            cArr2[d] = this.j2;
            return;
        }
        if (this.m2 + 11 >= this.n2) {
            Z0();
        }
        this.m2 = i0.f.a.b.i.f.d(i, this.k2, this.m2);
    }

    public final void g1(String str) throws IOException {
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = this.j2;
        A0(str);
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr2 = this.k2;
        int i3 = this.m2;
        this.m2 = i3 + 1;
        cArr2[i3] = this.j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        r5 = r6.l2;
        r4 = r4 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010d, code lost:
        if (r4 <= 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010f, code lost:
        r6.i2.write(r3, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0114, code lost:
        r3 = r6.k2;
        r4 = r6.m2;
        r6.m2 = r4 + 1;
        r3 = r3[r4];
        b1(r3, r0[r3]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x012a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h1(java.lang.String r19) throws java.io.IOException {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            int r0 = r19.length()
            int r1 = r6.n2
            r8 = -1
            r9 = 0
            if (r0 <= r1) goto L_0x00a6
            r18.Z0()
            int r10 = r19.length()
            r0 = r9
        L_0x0016:
            int r1 = r6.n2
            int r2 = r0 + r1
            if (r2 <= r10) goto L_0x001e
            int r1 = r10 - r0
        L_0x001e:
            r11 = r1
            int r12 = r0 + r11
            char[] r1 = r6.k2
            r7.getChars(r0, r12, r1, r9)
            int r13 = r6.e2
            if (r13 == 0) goto L_0x006e
            int[] r14 = r6.d2
            int r0 = r14.length
            int r1 = r13 + 1
            int r15 = java.lang.Math.min(r0, r1)
            r0 = r9
            r1 = r0
            r2 = r1
        L_0x0036:
            if (r0 >= r11) goto L_0x00a0
        L_0x0038:
            char[] r3 = r6.k2
            char r4 = r3[r0]
            if (r4 >= r15) goto L_0x0043
            r2 = r14[r4]
            if (r2 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0043:
            if (r4 <= r13) goto L_0x0048
            r16 = r8
            goto L_0x004e
        L_0x0048:
            int r0 = r0 + 1
            if (r0 < r11) goto L_0x0038
        L_0x004c:
            r16 = r2
        L_0x004e:
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x005a
            java.io.Writer r5 = r6.i2
            r5.write(r3, r1, r2)
            if (r0 < r11) goto L_0x005a
            goto L_0x00a0
        L_0x005a:
            int r17 = r0 + 1
            char[] r1 = r6.k2
            r0 = r18
            r2 = r17
            r3 = r11
            r5 = r16
            int r1 = r0.a1(r1, r2, r3, r4, r5)
            r2 = r16
            r0 = r17
            goto L_0x0036
        L_0x006e:
            int[] r13 = r6.d2
            int r14 = r13.length
            r0 = r9
            r1 = r0
        L_0x0073:
            if (r0 >= r11) goto L_0x00a0
        L_0x0075:
            char[] r2 = r6.k2
            char r4 = r2[r0]
            if (r4 >= r14) goto L_0x0080
            r3 = r13[r4]
            if (r3 == 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            int r0 = r0 + 1
            if (r0 < r11) goto L_0x0075
        L_0x0084:
            int r3 = r0 - r1
            if (r3 <= 0) goto L_0x0090
            java.io.Writer r5 = r6.i2
            r5.write(r2, r1, r3)
            if (r0 < r11) goto L_0x0090
            goto L_0x00a0
        L_0x0090:
            int r15 = r0 + 1
            char[] r1 = r6.k2
            r5 = r13[r4]
            r0 = r18
            r2 = r15
            r3 = r11
            int r1 = r0.a1(r1, r2, r3, r4, r5)
            r0 = r15
            goto L_0x0073
        L_0x00a0:
            if (r12 < r10) goto L_0x00a3
            return
        L_0x00a3:
            r0 = r12
            goto L_0x0016
        L_0x00a6:
            int r2 = r6.m2
            int r2 = r2 + r0
            if (r2 <= r1) goto L_0x00ae
            r18.Z0()
        L_0x00ae:
            char[] r1 = r6.k2
            int r2 = r6.m2
            r7.getChars(r9, r0, r1, r2)
            int r1 = r6.e2
            if (r1 == 0) goto L_0x00f4
            int r2 = r6.m2
            int r2 = r2 + r0
            int[] r0 = r6.d2
            int r3 = r0.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
        L_0x00c5:
            int r4 = r6.m2
            if (r4 >= r2) goto L_0x012a
        L_0x00c9:
            char[] r4 = r6.k2
            int r5 = r6.m2
            char r7 = r4[r5]
            if (r7 >= r3) goto L_0x00d6
            r9 = r0[r7]
            if (r9 == 0) goto L_0x00ed
            goto L_0x00d9
        L_0x00d6:
            if (r7 <= r1) goto L_0x00ed
            r9 = r8
        L_0x00d9:
            int r10 = r6.l2
            int r5 = r5 - r10
            if (r5 <= 0) goto L_0x00e3
            java.io.Writer r11 = r6.i2
            r11.write(r4, r10, r5)
        L_0x00e3:
            int r4 = r6.m2
            int r4 = r4 + 1
            r6.m2 = r4
            r6.b1(r7, r9)
            goto L_0x00c5
        L_0x00ed:
            int r5 = r5 + 1
            r6.m2 = r5
            if (r5 < r2) goto L_0x00c9
            goto L_0x012a
        L_0x00f4:
            int r1 = r6.m2
            int r1 = r1 + r0
            int[] r0 = r6.d2
            int r2 = r0.length
        L_0x00fa:
            int r3 = r6.m2
            if (r3 >= r1) goto L_0x012a
        L_0x00fe:
            char[] r3 = r6.k2
            int r4 = r6.m2
            char r5 = r3[r4]
            if (r5 >= r2) goto L_0x0124
            r5 = r0[r5]
            if (r5 == 0) goto L_0x0124
            int r5 = r6.l2
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0114
            java.io.Writer r7 = r6.i2
            r7.write(r3, r5, r4)
        L_0x0114:
            char[] r3 = r6.k2
            int r4 = r6.m2
            int r5 = r4 + 1
            r6.m2 = r5
            char r3 = r3[r4]
            r4 = r0[r3]
            r6.b1(r3, r4)
            goto L_0x00fa
        L_0x0124:
            int r4 = r4 + 1
            r6.m2 = r4
            if (r4 < r1) goto L_0x00fe
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.j.h.h1(java.lang.String):void");
    }

    public void i0(long j) throws IOException {
        V0("write a number");
        if (this.Z1) {
            if (this.m2 + 23 >= this.n2) {
                Z0();
            }
            char[] cArr = this.k2;
            int i = this.m2;
            int i3 = i + 1;
            this.m2 = i3;
            cArr[i] = this.j2;
            int e = i0.f.a.b.i.f.e(j, cArr, i3);
            this.m2 = e;
            char[] cArr2 = this.k2;
            this.m2 = e + 1;
            cArr2[e] = this.j2;
            return;
        }
        if (this.m2 + 21 >= this.n2) {
            Z0();
        }
        this.m2 = i0.f.a.b.i.f.e(j, this.k2, this.m2);
    }

    public void m0(String str) throws IOException {
        V0("write a number");
        if (str == null) {
            f1();
        } else if (this.Z1) {
            g1(str);
        } else {
            A0(str);
        }
    }

    public void n0(BigDecimal bigDecimal) throws IOException {
        V0("write a number");
        if (bigDecimal == null) {
            f1();
        } else if (this.Z1) {
            g1(T0(bigDecimal));
        } else {
            A0(T0(bigDecimal));
        }
    }

    public void p0(BigInteger bigInteger) throws IOException {
        V0("write a number");
        if (bigInteger == null) {
            f1();
        } else if (this.Z1) {
            g1(bigInteger.toString());
        } else {
            A0(bigInteger.toString());
        }
    }

    public void r0(short s) throws IOException {
        V0("write a number");
        if (this.Z1) {
            if (this.m2 + 8 >= this.n2) {
                Z0();
            }
            char[] cArr = this.k2;
            int i = this.m2;
            int i3 = i + 1;
            this.m2 = i3;
            cArr[i] = this.j2;
            int d = i0.f.a.b.i.f.d(s, cArr, i3);
            this.m2 = d;
            char[] cArr2 = this.k2;
            this.m2 = d + 1;
            cArr2[d] = this.j2;
            return;
        }
        if (this.m2 + 6 >= this.n2) {
            Z0();
        }
        this.m2 = i0.f.a.b.i.f.d(s, this.k2, this.m2);
    }

    public void w0(char c) throws IOException {
        if (this.m2 >= this.n2) {
            Z0();
        }
        char[] cArr = this.k2;
        int i = this.m2;
        this.m2 = i + 1;
        cArr[i] = c;
    }

    public void y0(f fVar) throws IOException {
        int b = fVar.b(this.k2, this.m2);
        if (b < 0) {
            A0(fVar.getValue());
        } else {
            this.m2 += b;
        }
    }
}
