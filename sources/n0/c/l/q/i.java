package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Arrays;
import java.util.Objects;
import m0.r.t.a.r.m.a1.a;

/* compiled from: JsonReader.kt */
public final class i {
    public int a;
    public byte b = 12;
    public int c;
    public int d = -1;
    public int e;
    public char[] f = new char[16];
    public final String g;

    public i(String str) {
        m0.n.b.i.e(str, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.g = str;
        g();
    }

    public static /* synthetic */ Void d(i iVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = iVar.a;
        }
        iVar.c(str, i);
        throw null;
    }

    public final void a(char c2) {
        int i = this.e;
        char[] cArr = this.f;
        if (i >= cArr.length) {
            char[] copyOf = Arrays.copyOf(cArr, cArr.length * 2);
            m0.n.b.i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f = copyOf;
        }
        char[] cArr2 = this.f;
        int i2 = this.e;
        this.e = i2 + 1;
        cArr2[i2] = c2;
    }

    public final void b(String str, int i, int i2) {
        int i3 = i2 - i;
        int i4 = this.e;
        int i5 = i4 + i3;
        char[] cArr = this.f;
        if (i5 > cArr.length) {
            int length = cArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i5);
            m0.n.b.i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f = copyOf;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            this.f[i4 + i6] = str.charAt(i + i6);
        }
        this.e += i3;
    }

    public final Void c(String str, int i) {
        m0.n.b.i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        throw a.q(i, str, this.g);
    }

    public final int e(String str, int i) {
        if (i < str.length()) {
            char charAt = str.charAt(i);
            if ('0' <= charAt && '9' >= charAt) {
                return charAt - '0';
            }
            char c2 = 'a';
            if ('a' > charAt || 'f' < charAt) {
                c2 = 'A';
                if ('A' > charAt || 'F' < charAt) {
                    c("Invalid toHexChar char '" + charAt + "' in unicode escape", this.a);
                    throw null;
                }
            }
            return (charAt - c2) + 10;
        }
        c("Unexpected EOF during unicode escape", i);
        throw null;
    }

    public final boolean f() {
        byte b2 = this.b;
        return b2 == 0 || b2 == 1 || b2 == 6 || b2 == 8 || b2 == 10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r12 = this;
            java.lang.String r0 = r12.g
            int r1 = r12.a
        L_0x0004:
            int r2 = r0.length()
            r3 = 12
            if (r1 >= r2) goto L_0x0121
            char r2 = r0.charAt(r1)
            byte r2 = m0.r.t.a.r.m.a1.a.v0(r2)
            r4 = 0
            r5 = 4
            r6 = 1
            if (r2 == 0) goto L_0x00e3
            if (r2 == r6) goto L_0x0029
            r3 = 3
            if (r2 == r3) goto L_0x0026
            r12.c = r1
            r12.b = r2
            int r1 = r1 + r6
            r12.a = r1
            return
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0029:
            r12.c = r1
            r12.e = r4
            int r1 = r1 + r6
            int r2 = r0.length()
            java.lang.String r7 = "EOF"
            r8 = 0
            if (r1 >= r2) goto L_0x00df
            r2 = r1
            r9 = r2
        L_0x0039:
            char r10 = r0.charAt(r2)
            r11 = 34
            if (r10 == r11) goto L_0x00ca
            char r10 = r0.charAt(r2)
            r11 = 92
            if (r10 != r11) goto L_0x00bc
            r12.b(r0, r9, r2)
            int r2 = r2 + 1
            int r9 = r0.length()
            if (r2 >= r9) goto L_0x0056
            r9 = r6
            goto L_0x0057
        L_0x0056:
            r9 = r4
        L_0x0057:
            if (r9 == 0) goto L_0x00b6
            int r9 = r2 + 1
            char r2 = r0.charAt(r2)
            r10 = 117(0x75, float:1.64E-43)
            if (r2 != r10) goto L_0x0088
            int r2 = r9 + 1
            int r9 = r12.e(r0, r9)
            int r9 = r9 << r3
            int r10 = r2 + 1
            int r2 = r12.e(r0, r2)
            int r2 = r2 << 8
            int r9 = r9 + r2
            int r2 = r10 + 1
            int r10 = r12.e(r0, r10)
            int r10 = r10 << r5
            int r9 = r9 + r10
            int r10 = r2 + 1
            int r2 = r12.e(r0, r2)
            int r2 = r2 + r9
            char r2 = (char) r2
            r12.a(r2)
            r9 = r10
            goto L_0x009a
        L_0x0088:
            if (r2 >= r10) goto L_0x008f
            char[] r10 = n0.c.l.q.c.a
            char r10 = r10[r2]
            goto L_0x0090
        L_0x008f:
            r10 = r4
        L_0x0090:
            if (r10 == 0) goto L_0x0094
            r11 = r6
            goto L_0x0095
        L_0x0094:
            r11 = r4
        L_0x0095:
            if (r11 == 0) goto L_0x009c
            r12.a(r10)
        L_0x009a:
            r2 = r9
            goto L_0x0039
        L_0x009c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid escaped char '"
            r0.append(r1)
            r0.append(r2)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.c(r0, r9)
            throw r8
        L_0x00b6:
            java.lang.String r0 = "Unexpected EOF after escape character"
            r12.c(r0, r2)
            throw r8
        L_0x00bc:
            int r2 = r2 + 1
            int r10 = r0.length()
            if (r2 >= r10) goto L_0x00c6
            goto L_0x0039
        L_0x00c6:
            r12.c(r7, r2)
            throw r8
        L_0x00ca:
            if (r9 != r1) goto L_0x00d3
            r12.d = r9
            int r0 = r2 - r9
            r12.e = r0
            goto L_0x00d9
        L_0x00d3:
            r12.b(r0, r9, r2)
            r0 = -1
            r12.d = r0
        L_0x00d9:
            int r2 = r2 + r6
            r12.a = r2
            r12.b = r6
            return
        L_0x00df:
            r12.c(r7, r1)
            throw r8
        L_0x00e3:
            r12.c = r1
            r12.d = r1
        L_0x00e7:
            int r2 = r0.length()
            if (r1 >= r2) goto L_0x00fa
            char r2 = r0.charAt(r1)
            byte r2 = m0.r.t.a.r.m.a1.a.v0(r2)
            if (r2 != 0) goto L_0x00fa
            int r1 = r1 + 1
            goto L_0x00e7
        L_0x00fa:
            r12.a = r1
            int r2 = r12.d
            int r1 = r1 - r2
            r12.e = r1
            if (r1 == r5) goto L_0x0104
            goto L_0x0115
        L_0x0104:
            r1 = r4
        L_0x0105:
            if (r1 >= r5) goto L_0x011a
            int r3 = r2 + r1
            char r3 = r0.charAt(r3)
            java.lang.String r7 = "null"
            char r7 = r7.charAt(r1)
            if (r3 == r7) goto L_0x0117
        L_0x0115:
            r6 = r4
            goto L_0x011a
        L_0x0117:
            int r1 = r1 + 1
            goto L_0x0105
        L_0x011a:
            if (r6 == 0) goto L_0x011e
            r4 = 10
        L_0x011e:
            r12.b = r4
            return
        L_0x0121:
            r12.c = r1
            r12.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.q.i.g():void");
    }

    public final String h() {
        byte b2 = this.b;
        if (b2 == 0 || b2 == 1) {
            return i(true);
        }
        c("Expected string or non-null literal", this.c);
        throw null;
    }

    public final String i(boolean z) {
        String str;
        int i = this.d;
        if (i < 0) {
            char[] cArr = this.f;
            int i2 = this.e + 0;
            m0.n.b.i.e(cArr, "$this$concatToString");
            int length = cArr.length;
            if (i2 > length) {
                StringBuilder R0 = i0.d.a.a.a.R0("startIndex: ", 0, ", endIndex: ", i2, ", size: ");
                R0.append(length);
                throw new IndexOutOfBoundsException(R0.toString());
            } else if (i2 >= 0) {
                str = new String(cArr, 0, i2 - 0);
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.h0("startIndex: ", 0, " > endIndex: ", i2));
            }
        } else {
            String str2 = this.g;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.substring(i, this.e + i);
            m0.n.b.i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (z) {
            g();
        }
        return str;
    }

    public final String j() {
        byte b2 = this.b;
        if (b2 == 1) {
            return i(true);
        }
        if (b2 != 10) {
            c("Expected string literal with quotes.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", this.c);
            throw null;
        }
        c("Expected string literal but 'null' literal was found.\nUse 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.", this.c);
        throw null;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("JsonReader(source='");
        P0.append(this.g);
        P0.append("', currentPosition=");
        P0.append(this.a);
        P0.append(", tokenClass=");
        P0.append(this.b);
        P0.append(", tokenPosition=");
        P0.append(this.c);
        P0.append(", offset=");
        return i0.d.a.a.a.s0(P0, this.d, ')');
    }
}
