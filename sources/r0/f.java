package r0;

import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import m0.j.g;
import m0.n.b.i;
import okio.ByteString;
import okio.SegmentedByteString;
import r0.a0.b;

/* compiled from: Buffer.kt */
public final class f implements i, h, Cloneable, ByteChannel {
    public u c;
    public long d;

    public h A() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r10 != r11) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        r0.c = r15.a();
        r0.v.a(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        r15.b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (r6 != false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.d
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00bd
            r1 = -7
            r5 = 0
            r6 = r5
            r7 = r6
        L_0x000f:
            r0.u r8 = r0.c
            m0.n.b.i.c(r8)
            byte[] r9 = r8.a
            int r10 = r8.b
            int r11 = r8.c
        L_0x001a:
            r12 = 1
            if (r10 >= r11) goto L_0x009c
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x006b
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x006b
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0044
            r15 = r8
            r16 = r9
            if (r12 != 0) goto L_0x003e
            long r8 = (long) r14
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r8 = 10
            long r3 = r3 * r8
            long r8 = (long) r14
            long r3 = r3 + r8
            goto L_0x0079
        L_0x0044:
            r0.f r1 = new r0.f
            r1.<init>()
            r1.B0(r3)
            r1.I(r13)
            if (r7 != 0) goto L_0x0054
            r1.readByte()
        L_0x0054:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            java.lang.String r1 = r1.w()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006b:
            r15 = r8
            r16 = r9
            r8 = 45
            byte r8 = (byte) r8
            if (r13 != r8) goto L_0x0081
            if (r5 != 0) goto L_0x0081
            r7 = 1
            long r1 = r1 - r7
            r7 = r12
        L_0x0079:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r8 = r15
            r9 = r16
            goto L_0x001a
        L_0x0081:
            if (r5 == 0) goto L_0x0085
            r6 = r12
            goto L_0x009d
        L_0x0085:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = m0.r.t.a.r.m.a1.a.c4(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009c:
            r15 = r8
        L_0x009d:
            if (r10 != r11) goto L_0x00a9
            r0.u r8 = r15.a()
            r0.c = r8
            r0.v.a(r15)
            goto L_0x00ac
        L_0x00a9:
            r8 = r15
            r8.b = r10
        L_0x00ac:
            if (r6 != 0) goto L_0x00b2
            r0.u r8 = r0.c
            if (r8 != 0) goto L_0x000f
        L_0x00b2:
            long r1 = r0.d
            long r5 = (long) r5
            long r1 = r1 - r5
            r0.d = r1
            if (r7 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            long r3 = -r3
        L_0x00bc:
            return r3
        L_0x00bd:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.f.B():long");
    }

    public final ByteString C(int i) {
        if (i == 0) {
            return ByteString.c;
        }
        m0.r.t.a.r.m.a1.a.A0(this.d, 0, (long) i);
        u uVar = this.c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            i.c(uVar);
            int i5 = uVar.c;
            int i6 = uVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                uVar = uVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        u uVar2 = this.c;
        int i7 = 0;
        while (i2 < i) {
            i.c(uVar2);
            bArr[i7] = uVar2.a;
            i2 += uVar2.c - uVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uVar2.b;
            uVar2.d = true;
            i7++;
            uVar2 = uVar2.f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public String D(long j) throws EOFException {
        if (j >= 0) {
            long j2 = RecyclerView.FOREVER_NS;
            if (j != RecyclerView.FOREVER_NS) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long l = l(b, 0, j2);
            if (l != -1) {
                return r0.a0.a.a(this, l);
            }
            if (j2 < this.d && i(j2 - 1) == ((byte) 13) && i(j2) == b) {
                return r0.a0.a.a(this, j2);
            }
            f fVar = new f();
            f(fVar, 0, Math.min((long) 32, this.d));
            StringBuilder P0 = i0.d.a.a.a.P0("\\n not found: limit=");
            P0.append(Math.min(this.d, j));
            P0.append(" content=");
            P0.append(fVar.X().f());
            P0.append(8230);
            throw new EOFException(P0.toString());
        }
        throw new IllegalArgumentException(i0.d.a.a.a.k0("limit < 0: ", j).toString());
    }

    public final u E(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            u uVar = this.c;
            if (uVar == null) {
                u b = v.b();
                this.c = b;
                b.g = b;
                b.f = b;
                return b;
            }
            i.c(uVar);
            u uVar2 = uVar.g;
            i.c(uVar2);
            if (uVar2.c + i <= 8192 && uVar2.e) {
                return uVar2;
            }
            u b2 = v.b();
            uVar2.b(b2);
            return b2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r8 != r9) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r14.c = r6.a();
        r0.v.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r1 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long E0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.d
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            r0.u r6 = r14.c
            m0.n.b.i.c(r6)
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L_0x0016:
            if (r8 >= r9) goto L_0x008d
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0027
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0027
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0027:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0032
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0072
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0072
        L_0x003c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0050:
            r0.f r0 = new r0.f
            r0.<init>()
            r0.W(r4)
            r0.I(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r0 = r0.w()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x008d
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r2 = m0.r.t.a.r.m.a1.a.c4(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            if (r8 != r9) goto L_0x0099
            r0.u r7 = r6.a()
            r14.c = r7
            r0.v.a(r6)
            goto L_0x009b
        L_0x0099:
            r6.b = r8
        L_0x009b:
            if (r1 != 0) goto L_0x00a1
            r0.u r6 = r14.c
            if (r6 != 0) goto L_0x000b
        L_0x00a1:
            long r1 = r14.d
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.d = r1
            return r4
        L_0x00a8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.f.E0():long");
    }

    public f F(ByteString byteString) {
        i.e(byteString, "byteString");
        byteString.w(this, 0, byteString.e());
        return this;
    }

    public f G(byte[] bArr) {
        i.e(bArr, Stripe3ds2AuthParams.FIELD_SOURCE);
        H(bArr, 0, bArr.length);
        return this;
    }

    public InputStream G0() {
        return new a(this);
    }

    public f H(byte[] bArr, int i, int i2) {
        i.e(bArr, Stripe3ds2AuthParams.FIELD_SOURCE);
        long j = (long) i2;
        m0.r.t.a.r.m.a1.a.A0((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            u E = E(1);
            int min = Math.min(i3 - i, 8192 - E.c);
            int i4 = i + min;
            g.g(bArr, E.a, E.c, i, i4);
            E.c += min;
            i = i4;
        }
        this.d += j;
        return this;
    }

    public int H0(q qVar) {
        i.e(qVar, "options");
        int b = r0.a0.a.b(this, qVar, false);
        if (b == -1) {
            return -1;
        }
        skip((long) qVar.d[b].e());
        return b;
    }

    public f I(int i) {
        u E = E(1);
        byte[] bArr = E.a;
        int i2 = E.c;
        E.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.d++;
        return this;
    }

    public /* bridge */ /* synthetic */ h K(String str) {
        U(str);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef A[LOOP:0: B:67:0x00eb->B:69:0x00ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ff  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r0.f B0(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            r13 = 48
            r12.I(r13)
            goto L_0x0111
        L_0x000d:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x001e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
            java.lang.String r13 = "-9223372036854775808"
            r12.U(r13)
            goto L_0x0111
        L_0x001d:
            r3 = r4
        L_0x001e:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x0066
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003e
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003b
            goto L_0x00de
        L_0x003b:
            r4 = 2
            goto L_0x00de
        L_0x003e:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0046
            r2 = 3
            goto L_0x0092
        L_0x0046:
            r2 = 4
            goto L_0x0092
        L_0x0048:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005a
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0058
            r2 = 5
            goto L_0x0092
        L_0x0058:
            r2 = 6
            goto L_0x0092
        L_0x005a:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0063
            r2 = 7
            goto L_0x0092
        L_0x0063:
            r2 = 8
            goto L_0x0092
        L_0x0066:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            r4 = 9
            goto L_0x00de
        L_0x0082:
            r4 = r5
            goto L_0x00de
        L_0x0084:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            r2 = 11
            goto L_0x0092
        L_0x0090:
            r2 = 12
        L_0x0092:
            r4 = r2
            goto L_0x00de
        L_0x0094:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b8
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a9
            r4 = 13
            goto L_0x00de
        L_0x00a9:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b5
            r2 = 14
            goto L_0x0092
        L_0x00b5:
            r2 = 15
            goto L_0x0092
        L_0x00b8:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d0
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cd
            r4 = 16
            goto L_0x00de
        L_0x00cd:
            r4 = 17
            goto L_0x00de
        L_0x00d0:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00dc
            r4 = 18
            goto L_0x00de
        L_0x00dc:
            r4 = 19
        L_0x00de:
            if (r3 == 0) goto L_0x00e2
            int r4 = r4 + 1
        L_0x00e2:
            r0.u r2 = r12.E(r4)
            byte[] r6 = r2.a
            int r7 = r2.c
            int r7 = r7 + r4
        L_0x00eb:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00fd
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = r0.a0.a.a
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00eb
        L_0x00fd:
            if (r3 == 0) goto L_0x0106
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x0106:
            int r13 = r2.c
            int r13 = r13 + r4
            r2.c = r13
            long r13 = r12.d
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.d = r13
        L_0x0111:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.f.B0(long):r0.f");
    }

    /* renamed from: N */
    public f W(long j) {
        if (j == 0) {
            I(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            u E = E(i);
            byte[] bArr = E.a;
            int i2 = E.c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = r0.a0.a.a[(int) (15 & j)];
                j >>>= 4;
            }
            E.c += i;
            this.d += (long) i;
        }
        return this;
    }

    public f O(int i) {
        u E = E(4);
        byte[] bArr = E.a;
        int i2 = E.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        E.c = i5 + 1;
        this.d += 4;
        return this;
    }

    public String P(Charset charset) {
        i.e(charset, "charset");
        return v(this.d, charset);
    }

    public f Q(int i) {
        u E = E(2);
        byte[] bArr = E.a;
        int i2 = E.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        E.c = i3 + 1;
        this.d += 2;
        return this;
    }

    public /* bridge */ /* synthetic */ h R(byte[] bArr, int i, int i2) {
        H(bArr, i, i2);
        return this;
    }

    public void S(f fVar, long j) {
        int i;
        u uVar;
        u uVar2;
        i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        if (fVar != this) {
            m0.r.t.a.r.m.a1.a.A0(fVar.d, 0, j);
            while (j > 0) {
                u uVar3 = fVar.c;
                i.c(uVar3);
                int i2 = uVar3.c;
                u uVar4 = fVar.c;
                i.c(uVar4);
                if (j < ((long) (i2 - uVar4.b))) {
                    u uVar5 = this.c;
                    if (uVar5 != null) {
                        i.c(uVar5);
                        uVar = uVar5.g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.e) {
                        if ((((long) uVar.c) + j) - ((long) (uVar.d ? 0 : uVar.b)) <= ((long) 8192)) {
                            u uVar6 = fVar.c;
                            i.c(uVar6);
                            uVar6.d(uVar, (int) j);
                            fVar.d -= j;
                            this.d += j;
                            return;
                        }
                    }
                    u uVar7 = fVar.c;
                    i.c(uVar7);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= uVar7.c - uVar7.b) {
                        if (i3 >= 1024) {
                            uVar2 = uVar7.c();
                        } else {
                            uVar2 = v.b();
                            byte[] bArr = uVar7.a;
                            byte[] bArr2 = uVar2.a;
                            int i4 = uVar7.b;
                            g.i(bArr, bArr2, 0, i4, i4 + i3, 2);
                        }
                        uVar2.c = uVar2.b + i3;
                        uVar7.b += i3;
                        u uVar8 = uVar7.g;
                        i.c(uVar8);
                        uVar8.b(uVar2);
                        fVar.c = uVar2;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                u uVar9 = fVar.c;
                i.c(uVar9);
                long j2 = (long) (uVar9.c - uVar9.b);
                fVar.c = uVar9.a();
                u uVar10 = this.c;
                if (uVar10 == null) {
                    this.c = uVar9;
                    uVar9.g = uVar9;
                    uVar9.f = uVar9;
                } else {
                    i.c(uVar10);
                    u uVar11 = uVar10.g;
                    i.c(uVar11);
                    uVar11.b(uVar9);
                    u uVar12 = uVar9.g;
                    if (uVar12 != uVar9) {
                        i.c(uVar12);
                        if (uVar12.e) {
                            int i5 = uVar9.c - uVar9.b;
                            u uVar13 = uVar9.g;
                            i.c(uVar13);
                            int i6 = 8192 - uVar13.c;
                            u uVar14 = uVar9.g;
                            i.c(uVar14);
                            if (uVar14.d) {
                                i = 0;
                            } else {
                                u uVar15 = uVar9.g;
                                i.c(uVar15);
                                i = uVar15.b;
                            }
                            if (i5 <= i6 + i) {
                                u uVar16 = uVar9.g;
                                i.c(uVar16);
                                uVar9.d(uVar16, i5);
                                uVar9.a();
                                v.a(uVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.d -= j2;
                this.d += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public f T(String str, int i, int i2, Charset charset) {
        i.e(str, "string");
        i.e(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder Q0 = i0.d.a.a.a.Q0("endIndex > string.length: ", i2, " > ");
                    Q0.append(str.length());
                    throw new IllegalArgumentException(Q0.toString().toString());
                } else if (i.a(charset, m0.t.a.a)) {
                    Y(str, i, i2);
                    return this;
                } else {
                    String substring = str.substring(i, i2);
                    i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                    H(bytes, 0, bytes.length);
                    return this;
                }
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.h0("endIndex < beginIndex: ", i2, " < ", i).toString());
            }
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.e0("beginIndex < 0: ", i).toString());
        }
    }

    public f U(String str) {
        i.e(str, "string");
        Y(str, 0, str.length());
        return this;
    }

    public long V(y yVar) throws IOException {
        i.e(yVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        long j = 0;
        while (true) {
            long q02 = yVar.q0(this, (long) 8192);
            if (q02 == -1) {
                return j;
            }
            j += q02;
        }
    }

    public ByteString X() {
        return j(this.d);
    }

    public f Y(String str, int i, int i2) {
        char charAt;
        i.e(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            u E = E(1);
                            byte[] bArr = E.a;
                            int i3 = E.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = E.c;
                                    int i6 = (i3 + i) - i5;
                                    E.c = i5 + i6;
                                    this.d += (long) i6;
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = E.c;
                            int i62 = (i3 + i) - i52;
                            E.c = i52 + i62;
                            this.d += (long) i62;
                        } else {
                            if (charAt2 < 2048) {
                                u E2 = E(2);
                                byte[] bArr2 = E2.a;
                                int i7 = E2.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                E2.c = i7 + 2;
                                this.d += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                u E3 = E(3);
                                byte[] bArr3 = E3.a;
                                int i8 = E3.c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                E3.c = i8 + 3;
                                this.d += 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    I(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    u E4 = E(4);
                                    byte[] bArr4 = E4.a;
                                    int i11 = E4.c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    E4.c = i11 + 4;
                                    this.d += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder Q0 = i0.d.a.a.a.Q0("endIndex > string.length: ", i2, " > ");
                Q0.append(str.length());
                throw new IllegalArgumentException(Q0.toString().toString());
            }
            throw new IllegalArgumentException(i0.d.a.a.a.h0("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(i0.d.a.a.a.e0("beginIndex < 0: ", i).toString());
    }

    public f Z(int i) {
        String str;
        if (i < 128) {
            I(i);
        } else if (i < 2048) {
            u E = E(2);
            byte[] bArr = E.a;
            int i2 = E.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            E.c = i2 + 2;
            this.d += 2;
        } else if (55296 <= i && 57343 >= i) {
            I(63);
        } else if (i < 65536) {
            u E2 = E(3);
            byte[] bArr2 = E2.a;
            int i3 = E2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            E2.c = i3 + 3;
            this.d += 3;
        } else if (i <= 1114111) {
            u E3 = E(4);
            byte[] bArr3 = E3.a;
            int i4 = E3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            E3.c = i4 + 4;
            this.d += 4;
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Unexpected code point: 0x");
            if (i != 0) {
                char[] cArr = b.a;
                int i5 = 0;
                char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i5 < 8 && cArr2[i5] == '0') {
                    i5++;
                }
                str = new String(cArr2, i5, 8 - i5);
            } else {
                str = "0";
            }
            P0.append(str);
            throw new IllegalArgumentException(P0.toString());
        }
        return this;
    }

    public boolean a0(long j) {
        return this.d >= j;
    }

    /* renamed from: b */
    public f clone() {
        f fVar = new f();
        if (this.d != 0) {
            u uVar = this.c;
            i.c(uVar);
            u c2 = uVar.c();
            fVar.c = c2;
            c2.g = c2;
            c2.f = c2;
            for (u uVar2 = uVar.f; uVar2 != uVar; uVar2 = uVar2.f) {
                u uVar3 = c2.g;
                i.c(uVar3);
                i.c(uVar2);
                uVar3.b(uVar2.c());
            }
            fVar.d = this.d;
        }
        return fVar;
    }

    public f c() {
        return this;
    }

    public void close() {
    }

    public z d() {
        return z.a;
    }

    public final long e() {
        long j = this.d;
        if (j == 0) {
            return 0;
        }
        u uVar = this.c;
        i.c(uVar);
        u uVar2 = uVar.g;
        i.c(uVar2);
        int i = uVar2.c;
        if (i < 8192 && uVar2.e) {
            j -= (long) (i - uVar2.b);
        }
        return j;
    }

    public String e0() throws EOFException {
        return D(RecyclerView.FOREVER_NS);
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof r0.f
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.d
            r0.f r1 = (r0.f) r1
            long r6 = r1.d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            r0.u r4 = r0.c
            m0.n.b.i.c(r4)
            r0.u r1 = r1.c
            m0.n.b.i.c(r1)
            int r5 = r4.b
            int r8 = r1.b
            r9 = r6
        L_0x0032:
            long r11 = r0.d
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.c
            int r11 = r11 - r5
            int r12 = r1.c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.c
            if (r5 != r13) goto L_0x006b
            r0.u r4 = r4.f
            m0.n.b.i.c(r4)
            int r5 = r4.b
        L_0x006b:
            int r13 = r1.c
            if (r8 != r13) goto L_0x0076
            r0.u r1 = r1.f
            m0.n.b.i.c(r1)
            int r8 = r1.b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.f.equals(java.lang.Object):boolean");
    }

    public final f f(f fVar, long j, long j2) {
        i.e(fVar, "out");
        m0.r.t.a.r.m.a1.a.A0(this.d, j, j2);
        if (j2 != 0) {
            fVar.d += j2;
            u uVar = this.c;
            while (true) {
                i.c(uVar);
                int i = uVar.c;
                int i2 = uVar.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                uVar = uVar.f;
            }
            while (j2 > 0) {
                i.c(uVar);
                u c2 = uVar.c();
                int i3 = c2.b + ((int) j);
                c2.b = i3;
                c2.c = Math.min(i3 + ((int) j2), c2.c);
                u uVar2 = fVar.c;
                if (uVar2 == null) {
                    c2.g = c2;
                    c2.f = c2;
                    fVar.c = c2;
                } else {
                    i.c(uVar2);
                    u uVar3 = uVar2.g;
                    i.c(uVar3);
                    uVar3.b(c2);
                }
                j2 -= (long) (c2.c - c2.b);
                uVar = uVar.f;
                j = 0;
            }
        }
        return this;
    }

    public void flush() {
    }

    public byte[] h0(long j) throws EOFException {
        int i = 0;
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount: ", j).toString());
        } else if (this.d >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            i.e(bArr, "sink");
            while (i < i2) {
                int read = read(bArr, i, i2 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public int hashCode() {
        u uVar = this.c;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uVar.c;
            for (int i3 = uVar.b; i3 < i2; i3++) {
                i = (i * 31) + uVar.a[i3];
            }
            uVar = uVar.f;
            i.c(uVar);
        } while (uVar != this.c);
        return i;
    }

    public final byte i(long j) {
        m0.r.t.a.r.m.a1.a.A0(this.d, j, 1);
        u uVar = this.c;
        if (uVar != null) {
            long j2 = this.d;
            if (j2 - j < j) {
                while (j2 > j) {
                    uVar = uVar.g;
                    i.c(uVar);
                    j2 -= (long) (uVar.c - uVar.b);
                }
                i.c(uVar);
                return uVar.a[(int) ((((long) uVar.b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                long j4 = ((long) (uVar.c - uVar.b)) + j3;
                if (j4 > j) {
                    i.c(uVar);
                    return uVar.a[(int) ((((long) uVar.b) + j) - j3)];
                }
                uVar = uVar.f;
                i.c(uVar);
                j3 = j4;
            }
        } else {
            i.c((Object) null);
            return null.a[(int) ((((long) null.b) + j) - -1)];
        }
    }

    public boolean isOpen() {
        return true;
    }

    public ByteString j(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount: ", j).toString());
        } else if (this.d < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new ByteString(h0(j));
        } else {
            ByteString C = C((int) j);
            skip(j);
            return C;
        }
    }

    public /* bridge */ /* synthetic */ h k0(byte[] bArr) {
        G(bArr);
        return this;
    }

    public long l(byte b, long j, long j2) {
        u uVar;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.d;
            if (j2 > j4) {
                j2 = j4;
            }
            if (!(j == j2 || (uVar = this.c) == null)) {
                if (j4 - j < j) {
                    while (j4 > j) {
                        uVar = uVar.g;
                        i.c(uVar);
                        j4 -= (long) (uVar.c - uVar.b);
                    }
                    while (j4 < j2) {
                        byte[] bArr = uVar.a;
                        int min = (int) Math.min((long) uVar.c, (((long) uVar.b) + j2) - j4);
                        for (int i = (int) ((((long) uVar.b) + j) - j4); i < min; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - uVar.b)) + j4;
                            }
                        }
                        j4 += (long) (uVar.c - uVar.b);
                        uVar = uVar.f;
                        i.c(uVar);
                        j = j4;
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (uVar.c - uVar.b)) + j3;
                        if (j5 > j) {
                            break;
                        }
                        uVar = uVar.f;
                        i.c(uVar);
                        j3 = j5;
                    }
                    while (j3 < j2) {
                        byte[] bArr2 = uVar.a;
                        int min2 = (int) Math.min((long) uVar.c, (((long) uVar.b) + j2) - j3);
                        for (int i2 = (int) ((((long) uVar.b) + j) - j3); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - uVar.b)) + j3;
                            }
                        }
                        j3 += (long) (uVar.c - uVar.b);
                        uVar = uVar.f;
                        i.c(uVar);
                        j = j3;
                    }
                }
            }
            return -1;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("size=");
        P0.append(this.d);
        P0.append(" fromIndex=");
        P0.append(j);
        P0.append(" toIndex=");
        P0.append(j2);
        throw new IllegalArgumentException(P0.toString().toString());
    }

    public /* bridge */ /* synthetic */ h l0(ByteString byteString) {
        F(byteString);
        return this;
    }

    public /* bridge */ /* synthetic */ h m(int i) {
        Q(i);
        return this;
    }

    public long n(ByteString byteString) {
        long j;
        int i;
        int i2;
        int i3;
        i.e(byteString, "targetBytes");
        i.e(byteString, "targetBytes");
        u uVar = this.c;
        if (uVar == null) {
            return -1;
        }
        long j2 = this.d;
        long j3 = 0;
        if (j2 - 0 < 0) {
            while (j2 > 0) {
                uVar = uVar.g;
                i.c(uVar);
                j2 -= (long) (uVar.c - uVar.b);
            }
            if (byteString.e() == 2) {
                byte i4 = byteString.i(0);
                byte i5 = byteString.i(1);
                while (j < this.d) {
                    byte[] bArr = uVar.a;
                    i2 = (int) ((((long) uVar.b) + j3) - j);
                    int i6 = uVar.c;
                    while (i2 < i6) {
                        byte b = bArr[i2];
                        if (!(b == i4 || b == i5)) {
                            i2++;
                        }
                    }
                    j3 = ((long) (uVar.c - uVar.b)) + j;
                    uVar = uVar.f;
                    i.c(uVar);
                    j2 = j3;
                }
                return -1;
            }
            byte[] g = byteString.g();
            while (j < this.d) {
                byte[] bArr2 = uVar.a;
                i = (int) ((((long) uVar.b) + j3) - j);
                int i7 = uVar.c;
                while (i < i7) {
                    byte b2 = bArr2[i];
                    for (byte b3 : g) {
                        if (b2 == b3) {
                            i3 = uVar.b;
                            return ((long) (i2 - i3)) + j;
                        }
                    }
                    i++;
                }
                j3 = ((long) (uVar.c - uVar.b)) + j;
                uVar = uVar.f;
                i.c(uVar);
                j2 = j3;
            }
            return -1;
        }
        j = 0;
        while (true) {
            long j4 = ((long) (uVar.c - uVar.b)) + j;
            if (j4 > 0) {
                break;
            }
            uVar = uVar.f;
            i.c(uVar);
            j = j4;
        }
        if (byteString.e() == 2) {
            byte i8 = byteString.i(0);
            byte i9 = byteString.i(1);
            while (j < this.d) {
                byte[] bArr3 = uVar.a;
                int i10 = (int) ((((long) uVar.b) + j3) - j);
                int i11 = uVar.c;
                while (i2 < i11) {
                    byte b4 = bArr3[i2];
                    if (!(b4 == i8 || b4 == i9)) {
                        i10 = i2 + 1;
                    }
                }
                j3 = ((long) (uVar.c - uVar.b)) + j;
                uVar = uVar.f;
                i.c(uVar);
                j = j3;
            }
            return -1;
        }
        byte[] g2 = byteString.g();
        while (j < this.d) {
            byte[] bArr4 = uVar.a;
            int i12 = (int) ((((long) uVar.b) + j3) - j);
            int i13 = uVar.c;
            while (i < i13) {
                byte b5 = bArr4[i];
                for (byte b6 : g2) {
                    if (b5 == b6) {
                        i3 = uVar.b;
                        return ((long) (i2 - i3)) + j;
                    }
                }
                i12 = i + 1;
            }
            j3 = ((long) (uVar.c - uVar.b)) + j;
            uVar = uVar.f;
            i.c(uVar);
            j = j3;
        }
        return -1;
        i3 = uVar.b;
        return ((long) (i2 - i3)) + j;
    }

    public /* bridge */ /* synthetic */ h o(int i) {
        O(i);
        return this;
    }

    public short q() throws EOFException {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public long q0(f fVar, long j) {
        i.e(fVar, "sink");
        if (j >= 0) {
            long j2 = this.d;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            fVar.S(this, j);
            return j;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount < 0: ", j).toString());
    }

    public byte[] r() {
        return h0(this.d);
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        i.e(byteBuffer, "sink");
        u uVar = this.c;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.c - uVar.b);
        byteBuffer.put(uVar.a, uVar.b, min);
        int i = uVar.b + min;
        uVar.b = i;
        this.d -= (long) min;
        if (i == uVar.c) {
            this.c = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        if (this.d != 0) {
            u uVar = this.c;
            i.c(uVar);
            int i = uVar.b;
            int i2 = uVar.c;
            int i3 = i + 1;
            byte b = uVar.a[i];
            this.d--;
            if (i3 == i2) {
                this.c = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public int readInt() throws EOFException {
        if (this.d >= 4) {
            u uVar = this.c;
            i.c(uVar);
            int i = uVar.b;
            int i2 = uVar.c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.d -= 4;
            if (i6 == i2) {
                this.c = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (this.d >= 2) {
            u uVar = this.c;
            i.c(uVar);
            int i = uVar.b;
            int i2 = uVar.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.d -= 2;
            if (i4 == i2) {
                this.c = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public long s0(w wVar) throws IOException {
        i.e(wVar, "sink");
        long j = this.d;
        if (j > 0) {
            ((f) wVar).S(this, j);
        }
        return j;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            u uVar = this.c;
            if (uVar != null) {
                int min = (int) Math.min(j, (long) (uVar.c - uVar.b));
                long j2 = (long) min;
                this.d -= j2;
                j -= j2;
                int i = uVar.b + min;
                uVar.b = i;
                if (i == uVar.c) {
                    this.c = uVar.a();
                    v.a(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public boolean t() {
        return this.d == 0;
    }

    public String toString() {
        long j = this.d;
        if (j <= ((long) Integer.MAX_VALUE)) {
            return C((int) j).toString();
        }
        StringBuilder P0 = i0.d.a.a.a.P0("size > Int.MAX_VALUE: ");
        P0.append(this.d);
        throw new IllegalStateException(P0.toString().toString());
    }

    public /* bridge */ /* synthetic */ h u(int i) {
        I(i);
        return this;
    }

    public String v(long j, Charset charset) throws EOFException {
        i.e(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("byteCount: ", j).toString());
        } else if (this.d < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            u uVar = this.c;
            i.c(uVar);
            int i2 = uVar.b;
            if (((long) i2) + j > ((long) uVar.c)) {
                return new String(h0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(uVar.a, i2, i3, charset);
            int i4 = uVar.b + i3;
            uVar.b = i4;
            this.d -= j;
            if (i4 == uVar.c) {
                this.c = uVar.a();
                v.a(uVar);
            }
            return str;
        }
    }

    public String w() {
        return v(this.d, m0.t.a.a);
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        i.e(byteBuffer, Stripe3ds2AuthParams.FIELD_SOURCE);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            u E = E(1);
            int min = Math.min(i, 8192 - E.c);
            byteBuffer.get(E.a, E.c, min);
            i -= min;
            E.c += min;
        }
        this.d += (long) remaining;
        return remaining;
    }

    public String y(long j) throws EOFException {
        return v(j, m0.t.a.a);
    }

    public int z() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.d != 0) {
            byte i2 = i(0);
            int i3 = 1;
            if ((i2 & 128) == 0) {
                b2 = i2 & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((i2 & 224) == 192) {
                b2 = i2 & 31;
                i = 2;
                b = 128;
            } else if ((i2 & 240) == 224) {
                b2 = i2 & 15;
                i = 3;
                b = 2048;
            } else if ((i2 & 248) == 240) {
                b2 = i2 & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.d >= j) {
                while (i3 < i) {
                    long j2 = (long) i3;
                    byte i4 = i(j2);
                    if ((i4 & 192) == 128) {
                        b2 = (b2 << 6) | (i4 & 63);
                        i3++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            StringBuilder Q0 = i0.d.a.a.a.Q0("size < ", i, ": ");
            Q0.append(this.d);
            Q0.append(" (to read code point prefixed 0x");
            Q0.append(m0.r.t.a.r.m.a1.a.c4(i2));
            Q0.append(')');
            throw new EOFException(Q0.toString());
        }
        throw new EOFException();
    }

    public void z0(long j) throws EOFException {
        if (this.d < j) {
            throw new EOFException();
        }
    }

    /* compiled from: Buffer.kt */
    public static final class a extends InputStream {
        public final /* synthetic */ f c;

        public a(f fVar) {
            this.c = fVar;
        }

        public int available() {
            return (int) Math.min(this.c.d, (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            f fVar = this.c;
            if (fVar.d > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.c + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            i.e(bArr, "sink");
            return this.c.read(bArr, i, i2);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        i.e(bArr, "sink");
        m0.r.t.a.r.m.a1.a.A0((long) bArr.length, (long) i, (long) i2);
        u uVar = this.c;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i2, uVar.c - uVar.b);
        byte[] bArr2 = uVar.a;
        int i3 = uVar.b;
        g.g(bArr2, bArr, i, i3, i3 + min);
        int i4 = uVar.b + min;
        uVar.b = i4;
        this.d -= (long) min;
        if (i4 != uVar.c) {
            return min;
        }
        this.c = uVar.a();
        v.a(uVar);
        return min;
    }
}
