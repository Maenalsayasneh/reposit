package q0.h0.j;

import com.instabug.library.model.NetworkLog;
import com.instabug.library.networkv2.request.RequestMethod;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m0.j.g;
import okio.ByteString;
import q0.h0.c;
import q0.h0.j.o;
import r0.f;
import r0.i;
import r0.y;

/* compiled from: Hpack.kt */
public final class b {
    public static final a[] a;
    public static final Map<ByteString, Integer> b;
    public static final b c = new b();

    /* compiled from: Hpack.kt */
    public static final class a {
        public final List<a> a;
        public final i b;
        public a[] c;
        public int d;
        public int e;
        public int f;
        public final int g;
        public int h;

        public a(y yVar, int i, int i2, int i3) {
            i2 = (i3 & 4) != 0 ? i : i2;
            m0.n.b.i.e(yVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            this.g = i;
            this.h = i2;
            this.a = new ArrayList();
            this.b = m0.r.t.a.r.m.a1.a.c0(yVar);
            this.c = new a[8];
            this.d = 7;
        }

        public final void a() {
            g.q(this.c, (Object) null, 0, 0, 6);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        public final int b(int i) {
            return this.d + 1 + i;
        }

        public final int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    i2 = this.d;
                    if (length < i2 || i <= 0) {
                        a[] aVarArr = this.c;
                        System.arraycopy(aVarArr, i2 + 1, aVarArr, i2 + 1 + i3, this.e);
                        this.d += i3;
                    } else {
                        a aVar = this.c[length];
                        m0.n.b.i.c(aVar);
                        int i4 = aVar.g;
                        i -= i4;
                        this.f -= i4;
                        this.e--;
                        i3++;
                    }
                }
                a[] aVarArr2 = this.c;
                System.arraycopy(aVarArr2, i2 + 1, aVarArr2, i2 + 1 + i3, this.e);
                this.d += i3;
            }
            return i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.ByteString d(int r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                q0.h0.j.b r1 = q0.h0.j.b.c
                q0.h0.j.a[] r1 = q0.h0.j.b.a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0019
                q0.h0.j.b r0 = q0.h0.j.b.c
                q0.h0.j.a[] r0 = q0.h0.j.b.a
                r5 = r0[r5]
                okio.ByteString r5 = r5.h
                goto L_0x0032
            L_0x0019:
                q0.h0.j.b r1 = q0.h0.j.b.c
                q0.h0.j.a[] r1 = q0.h0.j.b.a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.b(r1)
                if (r1 < 0) goto L_0x0033
                q0.h0.j.a[] r2 = r4.c
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0033
                r5 = r2[r1]
                m0.n.b.i.c(r5)
                okio.ByteString r5 = r5.h
            L_0x0032:
                return r5
            L_0x0033:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.b.a.d(int):okio.ByteString");
        }

        public final void e(int i, a aVar) {
            this.a.add(aVar);
            int i2 = aVar.g;
            if (i != -1) {
                a aVar2 = this.c[this.d + 1 + i];
                m0.n.b.i.c(aVar2);
                i2 -= aVar2.g;
            }
            int i3 = this.h;
            if (i2 > i3) {
                a();
                return;
            }
            int c2 = c((this.f + i2) - i3);
            if (i == -1) {
                int i4 = this.e + 1;
                a[] aVarArr = this.c;
                if (i4 > aVarArr.length) {
                    a[] aVarArr2 = new a[(aVarArr.length * 2)];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.d = this.c.length - 1;
                    this.c = aVarArr2;
                }
                int i5 = this.d;
                this.d = i5 - 1;
                this.c[i5] = aVar;
                this.e++;
            } else {
                this.c[this.d + 1 + i + c2 + i] = aVar;
            }
            this.f += i2;
        }

        public final ByteString f() throws IOException {
            byte readByte = this.b.readByte();
            byte[] bArr = c.a;
            byte b2 = readByte & 255;
            byte b3 = 0;
            boolean z = (b2 & 128) == 128;
            long g2 = (long) g(b2, 127);
            if (!z) {
                return this.b.j(g2);
            }
            f fVar = new f();
            o oVar = o.d;
            i iVar = this.b;
            m0.n.b.i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
            m0.n.b.i.e(fVar, "sink");
            o.a aVar = o.c;
            int i = 0;
            for (long j = 0; j < g2; j++) {
                byte readByte2 = iVar.readByte();
                byte[] bArr2 = c.a;
                b3 = (b3 << 8) | (readByte2 & 255);
                i += 8;
                while (i >= 8) {
                    int i2 = i - 8;
                    o.a[] aVarArr = aVar.a;
                    m0.n.b.i.c(aVarArr);
                    aVar = aVarArr[(b3 >>> i2) & 255];
                    m0.n.b.i.c(aVar);
                    if (aVar.a == null) {
                        fVar.I(aVar.b);
                        i -= aVar.c;
                        aVar = o.c;
                    } else {
                        i = i2;
                    }
                }
            }
            while (i > 0) {
                o.a[] aVarArr2 = aVar.a;
                m0.n.b.i.c(aVarArr2);
                o.a aVar2 = aVarArr2[(b3 << (8 - i)) & 255];
                m0.n.b.i.c(aVar2);
                if (aVar2.a != null || aVar2.c > i) {
                    break;
                }
                fVar.I(aVar2.b);
                i -= aVar2.c;
                aVar = o.c;
            }
            return fVar.X();
        }

        public final int g(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.b.readByte();
                byte[] bArr = c.a;
                byte b2 = readByte & 255;
                if ((b2 & 128) == 0) {
                    return i2 + (b2 << i4);
                }
                i2 += (b2 & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: q0.h0.j.b$b  reason: collision with other inner class name */
    /* compiled from: Hpack.kt */
    public static final class C0289b {
        public int a;
        public boolean b;
        public int c;
        public a[] d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final boolean i;
        public final f j;

        public C0289b(int i2, boolean z, f fVar, int i3) {
            i2 = (i3 & 1) != 0 ? 4096 : i2;
            z = (i3 & 2) != 0 ? true : z;
            m0.n.b.i.e(fVar, "out");
            this.h = i2;
            this.i = z;
            this.j = fVar;
            this.a = Integer.MAX_VALUE;
            this.c = i2;
            this.d = new a[8];
            this.e = 7;
        }

        public final void a() {
            g.q(this.d, (Object) null, 0, 0, 6);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
        }

        public final int b(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i3 = this.e;
                    if (length < i3 || i2 <= 0) {
                        a[] aVarArr = this.d;
                        System.arraycopy(aVarArr, i3 + 1, aVarArr, i3 + 1 + i4, this.f);
                        a[] aVarArr2 = this.d;
                        int i5 = this.e;
                        Arrays.fill(aVarArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.e += i4;
                    } else {
                        a aVar = this.d[length];
                        m0.n.b.i.c(aVar);
                        i2 -= aVar.g;
                        int i6 = this.g;
                        a aVar2 = this.d[length];
                        m0.n.b.i.c(aVar2);
                        this.g = i6 - aVar2.g;
                        this.f--;
                        i4++;
                    }
                }
                a[] aVarArr3 = this.d;
                System.arraycopy(aVarArr3, i3 + 1, aVarArr3, i3 + 1 + i4, this.f);
                a[] aVarArr22 = this.d;
                int i52 = this.e;
                Arrays.fill(aVarArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.e += i4;
            }
            return i4;
        }

        public final void c(a aVar) {
            int i2 = aVar.g;
            int i3 = this.c;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.g + i2) - i3);
            int i4 = this.f + 1;
            a[] aVarArr = this.d;
            if (i4 > aVarArr.length) {
                a[] aVarArr2 = new a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.e = this.d.length - 1;
                this.d = aVarArr2;
            }
            int i5 = this.e;
            this.e = i5 - 1;
            this.d[i5] = aVar;
            this.f++;
            this.g += i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(okio.ByteString r11) throws java.io.IOException {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                m0.n.b.i.e(r11, r0)
                boolean r0 = r10.i
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x009a
                q0.h0.j.o r0 = q0.h0.j.o.d
                java.lang.String r0 = "bytes"
                m0.n.b.i.e(r11, r0)
                int r0 = r11.e()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x001b:
                if (r5 >= r0) goto L_0x002e
                byte r8 = r11.i(r5)
                byte[] r9 = q0.h0.c.a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = q0.h0.j.o.b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x001b
            L_0x002e:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.e()
                if (r0 >= r5) goto L_0x009a
                r0.f r0 = new r0.f
                r0.<init>()
                q0.h0.j.o r5 = q0.h0.j.o.d
                java.lang.String r5 = "source"
                m0.n.b.i.e(r11, r5)
                java.lang.String r5 = "sink"
                m0.n.b.i.e(r0, r5)
                int r5 = r11.e()
                r6 = r3
                r3 = r2
            L_0x0052:
                if (r2 >= r5) goto L_0x0078
                byte r4 = r11.i(r2)
                byte[] r8 = q0.h0.c.a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = q0.h0.j.o.a
                r8 = r8[r4]
                byte[] r9 = q0.h0.j.o.b
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x0068:
                r4 = 8
                if (r3 < r4) goto L_0x0075
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.u(r4)
                goto L_0x0068
            L_0x0075:
                int r2 = r2 + 1
                goto L_0x0052
            L_0x0078:
                if (r3 <= 0) goto L_0x0087
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.u(r11)
            L_0x0087:
                okio.ByteString r11 = r0.X()
                int r0 = r11.e()
                r2 = 128(0x80, float:1.794E-43)
                r10.f(r0, r1, r2)
                r0.f r0 = r10.j
                r0.F(r11)
                goto L_0x00a6
            L_0x009a:
                int r0 = r11.e()
                r10.f(r0, r1, r2)
                r0.f r0 = r10.j
                r0.F(r11)
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.b.C0289b.d(okio.ByteString):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(java.util.List<q0.h0.j.a> r13) throws java.io.IOException {
            /*
                r12 = this;
                java.lang.String r0 = "headerBlock"
                m0.n.b.i.e(r13, r0)
                boolean r0 = r12.b
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r12.a
                int r2 = r12.c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r12.f(r0, r4, r3)
            L_0x0017:
                r12.b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.a = r0
                int r0 = r12.c
                r12.f(r0, r4, r3)
            L_0x0023:
                int r0 = r13.size()
                r2 = r1
            L_0x0028:
                if (r2 >= r0) goto L_0x0107
                java.lang.Object r3 = r13.get(r2)
                q0.h0.j.a r3 = (q0.h0.j.a) r3
                okio.ByteString r4 = r3.h
                okio.ByteString r4 = r4.q()
                okio.ByteString r5 = r3.i
                q0.h0.j.b r6 = q0.h0.j.b.c
                java.util.Map<okio.ByteString, java.lang.Integer> r6 = q0.h0.j.b.b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x0070
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x0050
                goto L_0x006e
            L_0x0050:
                if (r8 < r6) goto L_0x006e
                q0.h0.j.a[] r8 = q0.h0.j.b.a
                int r9 = r6 + -1
                r9 = r8[r9]
                okio.ByteString r9 = r9.i
                boolean r9 = m0.n.b.i.a(r9, r5)
                if (r9 == 0) goto L_0x0061
                goto L_0x0071
            L_0x0061:
                r8 = r8[r6]
                okio.ByteString r8 = r8.i
                boolean r8 = m0.n.b.i.a(r8, r5)
                if (r8 == 0) goto L_0x006e
                int r8 = r6 + 1
                goto L_0x0072
            L_0x006e:
                r8 = r7
                goto L_0x0072
            L_0x0070:
                r6 = r7
            L_0x0071:
                r8 = r6
            L_0x0072:
                if (r8 != r7) goto L_0x00b4
                int r9 = r12.e
                int r9 = r9 + 1
                q0.h0.j.a[] r10 = r12.d
                int r10 = r10.length
            L_0x007b:
                if (r9 >= r10) goto L_0x00b4
                q0.h0.j.a[] r11 = r12.d
                r11 = r11[r9]
                m0.n.b.i.c(r11)
                okio.ByteString r11 = r11.h
                boolean r11 = m0.n.b.i.a(r11, r4)
                if (r11 == 0) goto L_0x00b1
                q0.h0.j.a[] r11 = r12.d
                r11 = r11[r9]
                m0.n.b.i.c(r11)
                okio.ByteString r11 = r11.i
                boolean r11 = m0.n.b.i.a(r11, r5)
                if (r11 == 0) goto L_0x00a5
                int r8 = r12.e
                int r9 = r9 - r8
                q0.h0.j.b r8 = q0.h0.j.b.c
                q0.h0.j.a[] r8 = q0.h0.j.b.a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00b4
            L_0x00a5:
                if (r6 != r7) goto L_0x00b1
                int r6 = r12.e
                int r6 = r9 - r6
                q0.h0.j.b r11 = q0.h0.j.b.c
                q0.h0.j.a[] r11 = q0.h0.j.b.a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00b1:
                int r9 = r9 + 1
                goto L_0x007b
            L_0x00b4:
                if (r8 == r7) goto L_0x00be
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.f(r8, r3, r4)
                goto L_0x0103
            L_0x00be:
                r8 = 64
                if (r6 != r7) goto L_0x00d1
                r0.f r6 = r12.j
                r6.I(r8)
                r12.d(r4)
                r12.d(r5)
                r12.c(r3)
                goto L_0x0103
            L_0x00d1:
                okio.ByteString r7 = q0.h0.j.a.a
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "prefix"
                m0.n.b.i.e(r7, r9)
                int r9 = r7.e()
                boolean r7 = r4.l(r1, r7, r1, r9)
                if (r7 == 0) goto L_0x00f8
                okio.ByteString r7 = q0.h0.j.a.f
                boolean r4 = m0.n.b.i.a(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00f8
                r3 = 15
                r12.f(r6, r3, r1)
                r12.d(r5)
                goto L_0x0103
            L_0x00f8:
                r4 = 63
                r12.f(r6, r4, r8)
                r12.d(r5)
                r12.c(r3)
            L_0x0103:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0107:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.b.C0289b.e(java.util.List):void");
        }

        public final void f(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.j.I(i2 | i4);
                return;
            }
            this.j.I(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.j.I(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.j.I(i5);
        }
    }

    static {
        a aVar = new a(a.f, "");
        ByteString byteString = a.c;
        ByteString byteString2 = a.d;
        ByteString byteString3 = a.e;
        ByteString byteString4 = a.b;
        a[] aVarArr = {aVar, new a(byteString, (String) RequestMethod.GET), new a(byteString, (String) RequestMethod.POST), new a(byteString2, "/"), new a(byteString2, "/index.html"), new a(byteString3, "http"), new a(byteString3, "https"), new a(byteString4, "200"), new a(byteString4, "204"), new a(byteString4, "206"), new a(byteString4, "304"), new a(byteString4, "400"), new a(byteString4, "404"), new a(byteString4, "500"), new a("accept-charset", ""), new a("accept-encoding", "gzip, deflate"), new a("accept-language", ""), new a("accept-ranges", ""), new a("accept", ""), new a("access-control-allow-origin", ""), new a("age", ""), new a("allow", ""), new a("authorization", ""), new a("cache-control", ""), new a("content-disposition", ""), new a("content-encoding", ""), new a("content-language", ""), new a("content-length", ""), new a("content-location", ""), new a("content-range", ""), new a((String) NetworkLog.CONTENT_TYPE, ""), new a("cookie", ""), new a("date", ""), new a("etag", ""), new a("expect", ""), new a("expires", ""), new a("from", ""), new a("host", ""), new a("if-match", ""), new a("if-modified-since", ""), new a("if-none-match", ""), new a("if-range", ""), new a("if-unmodified-since", ""), new a("last-modified", ""), new a("link", ""), new a("location", ""), new a("max-forwards", ""), new a("proxy-authenticate", ""), new a("proxy-authorization", ""), new a("range", ""), new a("referer", ""), new a("refresh", ""), new a("retry-after", ""), new a("server", ""), new a("set-cookie", ""), new a("strict-transport-security", ""), new a("transfer-encoding", ""), new a("user-agent", ""), new a("vary", ""), new a("via", ""), new a("www-authenticate", "")};
        a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        int length = aVarArr.length;
        for (int i = 0; i < length; i++) {
            a[] aVarArr2 = a;
            if (!linkedHashMap.containsKey(aVarArr2[i].h)) {
                linkedHashMap.put(aVarArr2[i].h, Integer.valueOf(i));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m0.n.b.i.d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        b = unmodifiableMap;
    }

    public final ByteString a(ByteString byteString) throws IOException {
        m0.n.b.i.e(byteString, "name");
        int e = byteString.e();
        for (int i = 0; i < e; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte i2 = byteString.i(i);
            if (b2 <= i2 && b3 >= i2) {
                StringBuilder P0 = i0.d.a.a.a.P0("PROTOCOL_ERROR response malformed: mixed case name: ");
                P0.append(byteString.v());
                throw new IOException(P0.toString());
            }
        }
        return byteString;
    }
}
