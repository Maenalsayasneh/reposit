package s0.a.b.i0;

import java.util.Arrays;
import java.util.Objects;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i0.x.a;
import s0.a.b.i0.x.b;
import s0.a.e.b.b0.c.h3;

public class n implements a {
    public e a;
    public b b;
    public a c;
    public boolean d;
    public boolean e;
    public int f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public int r;
    public int s;
    public long t;
    public byte[] u;
    public int v;
    public long w;
    public long x;

    public n(e eVar) {
        if (eVar.b() == 16) {
            b bVar = new b();
            this.a = eVar;
            this.b = bVar;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    public byte[] a() {
        byte[] bArr = this.m;
        return bArr == null ? new byte[this.f] : h3.I(bArr);
    }

    public void b(byte[] bArr, int i2, int i3) {
        c();
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.u;
            int i5 = this.v;
            bArr2[i5] = bArr[i2 + i4];
            int i6 = i5 + 1;
            this.v = i6;
            if (i6 == 16) {
                d(this.o, bArr2);
                this.v = 0;
                this.w += 16;
            }
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        if (this.d) {
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
        throw new IllegalStateException("GCM cipher needs to be initialised");
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        m0.r.t.a.r.m.a1.a.n4(bArr, bArr2);
        this.b.a(bArr);
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int i3 = i2;
        c();
        long j2 = 0;
        if (this.t == 0) {
            g();
        }
        int i4 = this.s;
        if (!this.d) {
            int i5 = this.f;
            if (i4 >= i5) {
                i4 -= i5;
                if (bArr3.length - i3 < i4) {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        } else if (bArr3.length - i3 < this.f + i4) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i6 = 16;
        if (i4 > 0) {
            byte[] bArr4 = this.l;
            byte[] bArr5 = new byte[16];
            f(bArr5);
            if (this.d) {
                m0.r.t.a.r.m.a1.a.m4(bArr4, 0, bArr5, 0, i4);
                e(this.n, bArr4, 0, i4);
            } else {
                e(this.n, bArr4, 0, i4);
                m0.r.t.a.r.m.a1.a.m4(bArr4, 0, bArr5, 0, i4);
            }
            System.arraycopy(bArr4, 0, bArr3, i3, i4);
            this.t += (long) i4;
        }
        long j3 = this.w;
        int i7 = this.v;
        long j4 = j3 + ((long) i7);
        this.w = j4;
        if (j4 > this.x) {
            if (i7 > 0) {
                e(this.o, this.u, 0, i7);
            }
            if (this.x > 0) {
                m0.r.t.a.r.m.a1.a.n4(this.o, this.p);
            }
            long j5 = ((this.t * 8) + 127) >>> 7;
            byte[] bArr6 = new byte[16];
            if (this.c == null) {
                a aVar = new a();
                this.c = aVar;
                byte[] bArr7 = this.j;
                Objects.requireNonNull(aVar);
                aVar.a = m0.r.t.a.r.m.a1.a.W(bArr7);
            }
            a aVar2 = this.c;
            Objects.requireNonNull(aVar2);
            long[] jArr = new long[2];
            jArr[0] = Long.MIN_VALUE;
            if (j5 > 0) {
                long[] L = h3.L(aVar2.a);
                while (true) {
                    if ((j5 & 1) != j2) {
                        m0.r.t.a.r.m.a1.a.M2(jArr, L);
                    }
                    long[] jArr2 = new long[4];
                    bArr2 = bArr6;
                    s0.a.e.d.a.c(L[0], jArr2, 0);
                    s0.a.e.d.a.c(L[1], jArr2, 2);
                    long j6 = jArr2[0];
                    long j7 = jArr2[1];
                    long j8 = jArr2[2];
                    long j9 = jArr2[3];
                    long j10 = j8 ^ ((j9 << 57) ^ ((j9 << 63) ^ (j9 << 62)));
                    L[0] = j6 ^ ((((j10 >>> 1) ^ j10) ^ (j10 >>> 2)) ^ (j10 >>> 7));
                    L[1] = (j7 ^ ((((j9 >>> 1) ^ j9) ^ (j9 >>> 2)) ^ (j9 >>> 7))) ^ ((j10 << 57) ^ ((j10 << 63) ^ (j10 << 62)));
                    j5 >>>= 1;
                    if (j5 <= 0) {
                        break;
                    }
                    j2 = 0;
                    bArr6 = bArr2;
                }
            } else {
                bArr2 = bArr6;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < 2; i9++) {
                h3.l2(jArr[i9], bArr2, i8);
                i8 += 8;
            }
            byte[] bArr8 = this.o;
            long[] W = m0.r.t.a.r.m.a1.a.W(bArr8);
            m0.r.t.a.r.m.a1.a.M2(W, m0.r.t.a.r.m.a1.a.W(bArr2));
            int i10 = 0;
            for (long l2 : W) {
                h3.l2(l2, bArr8, i10);
                i10 += 8;
            }
            m0.r.t.a.r.m.a1.a.n4(this.n, this.o);
            i6 = 16;
        }
        byte[] bArr9 = new byte[i6];
        h3.l2(this.w * 8, bArr9, 0);
        h3.l2(this.t * 8, bArr9, 8);
        byte[] bArr10 = this.n;
        m0.r.t.a.r.m.a1.a.n4(bArr10, bArr9);
        this.b.a(bArr10);
        byte[] bArr11 = new byte[16];
        this.a.a(this.k, 0, bArr11, 0);
        m0.r.t.a.r.m.a1.a.n4(bArr11, this.n);
        int i11 = this.f;
        byte[] bArr12 = new byte[i11];
        this.m = bArr12;
        System.arraycopy(bArr11, 0, bArr12, 0, i11);
        if (this.d) {
            System.arraycopy(this.m, 0, bArr3, i3 + this.s, this.f);
            i4 += this.f;
        } else {
            int i12 = this.f;
            byte[] bArr13 = new byte[i12];
            System.arraycopy(this.l, i4, bArr13, 0, i12);
            if (!h3.U(this.m, bArr13)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        i(false);
        return i4;
    }

    public final void e(byte[] bArr, byte[] bArr2, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 >= 0) {
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i2 + i3]);
            } else {
                this.b.a(bArr);
                return;
            }
        }
    }

    public final void f(byte[] bArr) {
        int i2 = this.r;
        if (i2 != 0) {
            this.r = i2 - 1;
            byte[] bArr2 = this.q;
            int i3 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i4;
            int i5 = (i4 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i5;
            bArr2[12] = (byte) ((i5 >>> 8) + (bArr2[12] & 255));
            this.a.a(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    public final void g() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        int i2 = this.v;
        if (i2 > 0) {
            e(this.p, this.u, 0, i2);
            this.x += (long) this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/GCM";
    }

    public int getOutputSize(int i2) {
        int i3 = i2 + this.s;
        if (this.d) {
            return i3 + this.f;
        }
        int i4 = this.f;
        if (i3 < i4) {
            return 0;
        }
        return i3 - i4;
    }

    public e getUnderlyingCipher() {
        return this.a;
    }

    public int getUpdateOutputSize(int i2) {
        int i3 = i2 + this.s;
        if (!this.d) {
            int i4 = this.f;
            if (i3 < i4) {
                return 0;
            }
            i3 -= i4;
        }
        return i3 - (i3 % 16);
    }

    public final void h(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (bArr2.length - i3 >= 16) {
            if (this.t == 0) {
                g();
            }
            byte[] bArr3 = new byte[16];
            f(bArr3);
            if (this.d) {
                m0.r.t.a.r.m.a1.a.o4(bArr3, bArr, i2);
                byte[] bArr4 = this.n;
                m0.r.t.a.r.m.a1.a.n4(bArr4, bArr3);
                this.b.a(bArr4);
                System.arraycopy(bArr3, 0, bArr2, i3, 16);
            } else {
                byte[] bArr5 = this.n;
                m0.r.t.a.r.m.a1.a.o4(bArr5, bArr, i2);
                this.b.a(bArr5);
                int i4 = 0;
                do {
                    bArr2[i3 + i4] = (byte) (bArr3[0 + i4] ^ bArr[i2 + i4]);
                    int i5 = i4 + 1;
                    bArr2[i3 + i5] = (byte) (bArr3[0 + i5] ^ bArr[i2 + i5]);
                    int i6 = i5 + 1;
                    bArr2[i3 + i6] = (byte) (bArr3[0 + i6] ^ bArr[i2 + i6]);
                    int i7 = i6 + 1;
                    bArr2[i3 + i7] = (byte) (bArr3[0 + i7] ^ bArr[i2 + i7]);
                    i4 = i7 + 1;
                } while (i4 < 16);
            }
            this.t += 16;
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    public final void i(boolean z) {
        this.a.reset();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.q = h3.I(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0;
        byte[] bArr = this.l;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
            return;
        }
        byte[] bArr2 = this.i;
        if (bArr2 != null) {
            b(bArr2, 0, bArr2.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        if (java.util.Arrays.equals(r2.a, r5) != false) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r20, s0.a.b.i r21) throws java.lang.IllegalArgumentException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r0.d = r1
            r3 = 0
            r0.m = r3
            r4 = 1
            r0.e = r4
            boolean r5 = r2 instanceof s0.a.b.k0.a
            r6 = 16
            if (r5 == 0) goto L_0x0041
            s0.a.b.k0.a r2 = (s0.a.b.k0.a) r2
            byte[] r5 = r2.b()
            byte[] r7 = r2.a()
            r0.i = r7
            int r7 = r2.x
            r8 = 32
            if (r7 < r8) goto L_0x0035
            r8 = 128(0x80, float:1.794E-43)
            if (r7 > r8) goto L_0x0035
            int r8 = r7 % 8
            if (r8 != 0) goto L_0x0035
            int r7 = r7 / 8
            r0.f = r7
            s0.a.b.k0.y0 r2 = r2.q
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid value for MAC size: "
            java.lang.String r2 = i0.d.a.a.a.e0(r2, r7)
            r1.<init>(r2)
            throw r1
        L_0x0041:
            boolean r5 = r2 instanceof s0.a.b.k0.c1
            if (r5 == 0) goto L_0x01ce
            s0.a.b.k0.c1 r2 = (s0.a.b.k0.c1) r2
            byte[] r5 = r2.c
            r0.i = r3
            r0.f = r6
            s0.a.b.i r2 = r2.d
            s0.a.b.k0.y0 r2 = (s0.a.b.k0.y0) r2
        L_0x0051:
            if (r1 == 0) goto L_0x0055
            r7 = r6
            goto L_0x0058
        L_0x0055:
            int r7 = r0.f
            int r7 = r7 + r6
        L_0x0058:
            byte[] r7 = new byte[r7]
            r0.l = r7
            if (r5 == 0) goto L_0x01c6
            int r7 = r5.length
            if (r7 < r4) goto L_0x01c6
            if (r1 == 0) goto L_0x008a
            byte[] r1 = r0.h
            if (r1 == 0) goto L_0x008a
            boolean r1 = java.util.Arrays.equals(r1, r5)
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = "cannot reuse nonce for GCM encryption"
            if (r2 == 0) goto L_0x0084
            byte[] r7 = r0.g
            if (r7 == 0) goto L_0x008a
            byte[] r8 = r2.c
            boolean r7 = java.util.Arrays.equals(r7, r8)
            if (r7 != 0) goto L_0x007e
            goto L_0x008a
        L_0x007e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L_0x0084:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L_0x008a:
            r0.h = r5
            if (r2 == 0) goto L_0x0092
            byte[] r1 = r2.c
            r0.g = r1
        L_0x0092:
            r1 = 0
            if (r2 == 0) goto L_0x0144
            s0.a.b.e r5 = r0.a
            r5.init(r4, r2)
            byte[] r2 = new byte[r6]
            r0.j = r2
            s0.a.b.e r5 = r0.a
            r5.a(r2, r1, r2, r1)
            s0.a.b.i0.x.b r2 = r0.b
            byte[] r5 = r0.j
            long[][] r6 = r2.b
            r7 = 2
            if (r6 != 0) goto L_0x00bc
            int[] r6 = new int[r7]
            r6 = {256, 2} // fill-array
            java.lang.Class<long> r8 = long.class
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r8, r6)
            long[][] r6 = (long[][]) r6
            r2.b = r6
            goto L_0x00c6
        L_0x00bc:
            byte[] r6 = r2.a
            boolean r6 = java.util.Arrays.equals(r6, r5)
            if (r6 == 0) goto L_0x00c6
            goto L_0x0141
        L_0x00c6:
            byte[] r5 = s0.a.e.b.b0.c.h3.I(r5)
            r2.a = r5
            long[][] r6 = r2.b
            r6 = r6[r4]
            r8 = r1
            r9 = r8
        L_0x00d2:
            int r10 = r6.length
            if (r8 >= r10) goto L_0x00e0
            long r10 = s0.a.e.b.b0.c.h3.z(r5, r9)
            r6[r8] = r10
            int r9 = r9 + 8
            int r8 = r8 + 1
            goto L_0x00d2
        L_0x00e0:
            long[][] r5 = r2.b
            r6 = r5[r4]
            r5 = r5[r4]
            r8 = r6[r1]
            r10 = r6[r4]
            r6 = 57
            long r12 = r10 << r6
            r14 = 7
            long r15 = r8 >>> r14
            long r15 = r15 ^ r12
            long r17 = r12 >>> r4
            long r15 = r15 ^ r17
            long r17 = r12 >>> r7
            long r15 = r15 ^ r17
            long r12 = r12 >>> r14
            long r12 = r12 ^ r15
            r5[r1] = r12
            long r10 = r10 >>> r14
            long r8 = r8 << r6
            long r8 = r8 | r10
            r5[r4] = r8
        L_0x0103:
            r5 = 256(0x100, float:3.59E-43)
            if (r7 >= r5) goto L_0x0141
            long[][] r5 = r2.b
            int r6 = r7 >> 1
            r6 = r5[r6]
            r8 = r5[r7]
            r9 = r6[r1]
            r11 = r6[r4]
            r6 = 63
            long r13 = r9 >> r6
            r15 = -2233785415175766016(0xe100000000000000, double:-1.757388200993436E159)
            long r15 = r15 & r13
            long r9 = r9 ^ r15
            long r9 = r9 << r4
            long r15 = r11 >>> r6
            long r9 = r9 | r15
            r8[r1] = r9
            long r9 = r11 << r4
            long r11 = -r13
            long r9 = r9 | r11
            r8[r4] = r9
            r6 = r5[r7]
            r8 = r5[r4]
            int r9 = r7 + 1
            r5 = r5[r9]
            r9 = r6[r1]
            r11 = r8[r1]
            long r9 = r9 ^ r11
            r5[r1] = r9
            r9 = r6[r4]
            r11 = r8[r4]
            long r8 = r11 ^ r9
            r5[r4] = r8
            int r7 = r7 + 2
            goto L_0x0103
        L_0x0141:
            r0.c = r3
            goto L_0x0148
        L_0x0144:
            byte[] r2 = r0.j
            if (r2 == 0) goto L_0x01be
        L_0x0148:
            r2 = 16
            byte[] r2 = new byte[r2]
            r0.k = r2
            byte[] r3 = r0.h
            int r5 = r3.length
            r6 = 12
            if (r5 != r6) goto L_0x0160
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r1, r2, r1, r5)
            byte[] r2 = r0.k
            r3 = 15
            r2[r3] = r4
            goto L_0x018c
        L_0x0160:
            int r4 = r3.length
            r5 = r1
        L_0x0162:
            if (r5 >= r4) goto L_0x0172
            int r6 = r4 - r5
            r7 = 16
            int r6 = java.lang.Math.min(r6, r7)
            r0.e(r2, r3, r5, r6)
            int r5 = r5 + 16
            goto L_0x0162
        L_0x0172:
            r2 = 16
            byte[] r2 = new byte[r2]
            byte[] r3 = r0.h
            int r3 = r3.length
            long r3 = (long) r3
            r5 = 8
            long r3 = r3 * r5
            r5 = 8
            s0.a.e.b.b0.c.h3.l2(r3, r2, r5)
            byte[] r3 = r0.k
            m0.r.t.a.r.m.a1.a.n4(r3, r2)
            s0.a.b.i0.x.b r2 = r0.b
            r2.a(r3)
        L_0x018c:
            r2 = 16
            byte[] r3 = new byte[r2]
            r0.n = r3
            byte[] r3 = new byte[r2]
            r0.o = r3
            byte[] r3 = new byte[r2]
            r0.p = r3
            byte[] r2 = new byte[r2]
            r0.u = r2
            r0.v = r1
            r2 = 0
            r0.w = r2
            r0.x = r2
            byte[] r4 = r0.k
            byte[] r4 = s0.a.e.b.b0.c.h3.I(r4)
            r0.q = r4
            r4 = -2
            r0.r = r4
            r0.s = r1
            r0.t = r2
            byte[] r2 = r0.i
            if (r2 == 0) goto L_0x01bd
            int r3 = r2.length
            r0.b(r2, r1, r3)
        L_0x01bd:
            return
        L_0x01be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Key must be specified in initial init"
            r1.<init>(r2)
            throw r1
        L_0x01c6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "IV must be at least 1 byte"
            r1.<init>(r2)
            throw r1
        L_0x01ce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid parameters passed to GCM"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.n.init(boolean, s0.a.b.i):void");
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException {
        c();
        byte[] bArr2 = this.l;
        int i3 = this.s;
        bArr2[i3] = b2;
        int i4 = i3 + 1;
        this.s = i4;
        if (i4 != bArr2.length) {
            return 0;
        }
        h(bArr2, 0, bArr, i2);
        if (this.d) {
            this.s = 0;
        } else {
            byte[] bArr3 = this.l;
            System.arraycopy(bArr3, 16, bArr3, 0, this.f);
            this.s = this.f;
        }
        return 16;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:12:0x0031->B:13:0x0033, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int processBytes(byte[] r8, int r9, int r10, byte[] r11, int r12) throws org.bouncycastle.crypto.DataLengthException {
        /*
            r7 = this;
            r7.c()
            int r0 = r8.length
            int r0 = r0 - r9
            if (r0 < r10) goto L_0x0074
            boolean r0 = r7.d
            r1 = 16
            r2 = 0
            if (r0 == 0) goto L_0x0049
            int r0 = r7.s
            if (r0 == 0) goto L_0x0030
        L_0x0012:
            if (r10 <= 0) goto L_0x0030
            int r10 = r10 + -1
            byte[] r0 = r7.l
            int r3 = r7.s
            int r4 = r9 + 1
            byte r9 = r8[r9]
            r0[r3] = r9
            int r3 = r3 + 1
            r7.s = r3
            if (r3 != r1) goto L_0x002e
            r7.h(r0, r2, r11, r12)
            r7.s = r2
            r0 = r1
            r9 = r4
            goto L_0x0031
        L_0x002e:
            r9 = r4
            goto L_0x0012
        L_0x0030:
            r0 = r2
        L_0x0031:
            if (r10 < r1) goto L_0x003f
            int r3 = r12 + r0
            r7.h(r8, r9, r11, r3)
            int r9 = r9 + 16
            int r10 = r10 + -16
            int r0 = r0 + 16
            goto L_0x0031
        L_0x003f:
            if (r10 <= 0) goto L_0x0073
            byte[] r11 = r7.l
            java.lang.System.arraycopy(r8, r9, r11, r2, r10)
            r7.s = r10
            goto L_0x0073
        L_0x0049:
            r0 = r2
            r3 = r0
        L_0x004b:
            if (r3 >= r10) goto L_0x0073
            byte[] r4 = r7.l
            int r5 = r7.s
            int r6 = r9 + r3
            byte r6 = r8[r6]
            r4[r5] = r6
            int r5 = r5 + 1
            r7.s = r5
            int r6 = r4.length
            if (r5 != r6) goto L_0x0070
            int r5 = r12 + r0
            r7.h(r4, r2, r11, r5)
            byte[] r4 = r7.l
            int r5 = r7.f
            java.lang.System.arraycopy(r4, r1, r4, r2, r5)
            int r4 = r7.f
            r7.s = r4
            int r0 = r0 + 16
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0073:
            return r0
        L_0x0074:
            org.bouncycastle.crypto.DataLengthException r8 = new org.bouncycastle.crypto.DataLengthException
            java.lang.String r9 = "Input buffer too short"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.n.processBytes(byte[], int, int, byte[], int):int");
    }
}
