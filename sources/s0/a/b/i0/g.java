package s0.a.b.i0;

import java.util.Objects;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e0.l;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class g implements b {
    public static final byte[] a = new byte[15];
    public final l b = new l();
    public final s c;
    public final byte[] d = new byte[32];
    public final byte[] e = new byte[12];
    public final byte[] f = new byte[80];
    public final byte[] g = new byte[16];
    public byte[] h;
    public long i;
    public long j;
    public int k = 0;
    public int l;

    public g() {
        s0.a.b.h0.l lVar = new s0.a.b.h0.l();
        this.c = lVar;
    }

    public byte[] a() {
        return h3.I(this.g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "'in' cannot be null"
            java.util.Objects.requireNonNull(r10, r0)
            if (r11 < 0) goto L_0x0053
            if (r12 < 0) goto L_0x004b
            int r0 = r10.length
            int r0 = r0 - r12
            if (r11 > r0) goto L_0x0043
            int r0 = r9.k
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L_0x002d
            if (r0 == r2) goto L_0x002f
            r1 = 4
            if (r0 == r1) goto L_0x0025
            r1 = 5
            r2 = 6
            if (r0 == r1) goto L_0x002d
            if (r0 != r2) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x0025:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ChaCha20Poly1305 cannot be reused for encryption"
            r10.<init>(r11)
            throw r10
        L_0x002d:
            r9.k = r2
        L_0x002f:
            if (r12 <= 0) goto L_0x0042
            long r4 = r9.i
            r7 = -1
            r3 = r9
            r6 = r12
            long r0 = r3.f(r4, r6, r7)
            r9.i = r0
            s0.a.b.s r0 = r9.c
            r0.update(r10, r11, r12)
        L_0x0042:
            return
        L_0x0043:
            org.bouncycastle.crypto.DataLengthException r10 = new org.bouncycastle.crypto.DataLengthException
            java.lang.String r11 = "Input buffer too short"
            r10.<init>(r11)
            throw r10
        L_0x004b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "'len' cannot be negative"
            r10.<init>(r11)
            throw r10
        L_0x0053:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "'inOff' cannot be negative"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.g.b(byte[], int, int):void");
    }

    public final void c() {
        int i2;
        switch (this.k) {
            case 1:
            case 2:
                i2 = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i2 = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        d(i2);
    }

    public final void d(int i2) {
        int i3 = ((int) this.i) & 15;
        if (i3 != 0) {
            this.c.update(a, 0, 16 - i3);
        }
        this.k = i2;
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        int i3;
        Objects.requireNonNull(bArr, "'out' cannot be null");
        if (i2 >= 0) {
            c();
            h3.H(this.g);
            int i4 = this.k;
            if (i4 == 3) {
                int i5 = this.l;
                i3 = i5 + 16;
                if (i2 <= bArr.length - i3) {
                    if (i5 > 0) {
                        g(this.f, 0, i5, bArr, i2);
                        this.c.update(bArr, i2, this.l);
                    }
                    e(4);
                    System.arraycopy(this.g, 0, bArr, i2 + this.l, 16);
                } else {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else if (i4 == 7) {
                int i6 = this.l;
                if (i6 >= 16) {
                    i3 = i6 - 16;
                    if (i2 <= bArr.length - i3) {
                        if (i3 > 0) {
                            this.c.update(this.f, 0, i3);
                            g(this.f, 0, i3, bArr, i2);
                        }
                        e(8);
                        byte[] bArr2 = this.g;
                        byte[] bArr3 = this.f;
                        Objects.requireNonNull(bArr2, "'a' cannot be null");
                        Objects.requireNonNull(bArr3, "'b' cannot be null");
                        if (bArr2.length - 16 < 0) {
                            throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
                        } else if (i3 <= bArr3.length - 16) {
                            byte b2 = 0;
                            for (int i7 = 0; i7 < 16; i7++) {
                                b2 |= bArr2[0 + i7] ^ bArr3[i3 + i7];
                            }
                            if (!(b2 == 0)) {
                                throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
                            }
                        } else {
                            throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
                        }
                    } else {
                        throw new OutputLengthException("Output buffer too short");
                    }
                } else {
                    throw new InvalidCipherTextException("data too short");
                }
            } else {
                throw new IllegalStateException();
            }
            h(false, true);
            return i3;
        }
        throw new IllegalArgumentException("'outOff' cannot be negative");
    }

    public final void e(int i2) {
        int i3 = ((int) this.j) & 15;
        if (i3 != 0) {
            this.c.update(a, 0, 16 - i3);
        }
        byte[] bArr = new byte[16];
        h3.m2(this.i, bArr, 0);
        h3.m2(this.j, bArr, 8);
        this.c.update(bArr, 0, 16);
        this.c.doFinal(this.g, 0);
        this.k = i2;
    }

    public final long f(long j2, int i2, long j3) {
        long j4 = (long) i2;
        if (j2 - Long.MIN_VALUE <= (j3 - j4) - Long.MIN_VALUE) {
            return j2 + j4;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    public final void g(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (i4 <= bArr2.length - i3) {
            this.b.processBytes(bArr, i2, i3, bArr2, i4);
            this.j = f(this.j, i3, 274877906880L);
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    public int getOutputSize(int i2) {
        int max = Math.max(0, i2) + this.l;
        int i3 = this.k;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            return max + 16;
        }
        if (i3 == 5 || i3 == 6 || i3 == 7) {
            return Math.max(0, max - 16);
        }
        throw new IllegalStateException();
    }

    public int getUpdateOutputSize(int i2) {
        int max = Math.max(0, i2) + this.l;
        int i3 = this.k;
        if (!(i3 == 1 || i3 == 2 || i3 == 3)) {
            if (i3 == 5 || i3 == 6 || i3 == 7) {
                max = Math.max(0, max - 16);
            } else {
                throw new IllegalStateException();
            }
        }
        return max - (max % 64);
    }

    /* JADX INFO: finally extract failed */
    public final void h(boolean z, boolean z2) {
        h3.H(this.f);
        if (z) {
            h3.H(this.g);
        }
        this.i = 0;
        this.j = 0;
        this.l = 0;
        switch (this.k) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.k = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.k = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z2) {
            this.b.reset();
        }
        byte[] bArr = new byte[64];
        try {
            this.b.processBytes(bArr, 0, 64, bArr, 0);
            this.c.init(new y0(bArr, 0, 32));
            h3.H(bArr);
            byte[] bArr2 = this.h;
            if (bArr2 != null) {
                b(bArr2, 0, bArr2.length);
            }
        } catch (Throwable th) {
            h3.H(bArr);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [s0.a.b.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r7, s0.a.b.i r8) throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof s0.a.b.k0.a
            if (r0 == 0) goto L_0x002a
            s0.a.b.k0.a r8 = (s0.a.b.k0.a) r8
            int r0 = r8.x
            r1 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x001e
            s0.a.b.k0.y0 r0 = r8.q
            byte[] r1 = r8.b()
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            r2.<init>(r0, r1)
            byte[] r8 = r8.a()
            r6.h = r8
            goto L_0x003b
        L_0x001e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid value for MAC size: "
            java.lang.String r8 = i0.d.a.a.a.e0(r8, r0)
            r7.<init>(r8)
            throw r7
        L_0x002a:
            boolean r0 = r8 instanceof s0.a.b.k0.c1
            if (r0 == 0) goto L_0x00ab
            r2 = r8
            s0.a.b.k0.c1 r2 = (s0.a.b.k0.c1) r2
            s0.a.b.i r8 = r2.d
            r0 = r8
            s0.a.b.k0.y0 r0 = (s0.a.b.k0.y0) r0
            byte[] r1 = r2.c
            r8 = 0
            r6.h = r8
        L_0x003b:
            r8 = 32
            if (r0 != 0) goto L_0x004c
            int r3 = r6.k
            if (r3 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Key must be specified in initial init"
            r7.<init>(r8)
            throw r7
        L_0x004c:
            byte[] r3 = r0.c
            int r3 = r3.length
            if (r8 != r3) goto L_0x00a3
        L_0x0051:
            if (r1 == 0) goto L_0x009b
            int r3 = r1.length
            r4 = 12
            if (r4 != r3) goto L_0x009b
            int r3 = r6.k
            if (r3 == 0) goto L_0x007b
            if (r7 == 0) goto L_0x007b
            byte[] r3 = r6.e
            boolean r3 = java.util.Arrays.equals(r3, r1)
            if (r3 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x0073
            byte[] r3 = r6.d
            byte[] r5 = r0.c
            boolean r3 = java.util.Arrays.equals(r3, r5)
            if (r3 != 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "cannot reuse nonce for ChaCha20Poly1305 encryption"
            r7.<init>(r8)
            throw r7
        L_0x007b:
            r3 = 0
            if (r0 == 0) goto L_0x0085
            byte[] r0 = r0.c
            byte[] r5 = r6.d
            java.lang.System.arraycopy(r0, r3, r5, r3, r8)
        L_0x0085:
            byte[] r8 = r6.e
            java.lang.System.arraycopy(r1, r3, r8, r3, r4)
            s0.a.b.e0.l r8 = r6.b
            r0 = 1
            r8.init(r0, r2)
            if (r7 == 0) goto L_0x0094
            r7 = r0
            goto L_0x0095
        L_0x0094:
            r7 = 5
        L_0x0095:
            r6.k = r7
            r6.h(r0, r3)
            return
        L_0x009b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Nonce must be 96 bits"
            r7.<init>(r8)
            throw r7
        L_0x00a3:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Key must be 256 bits"
            r7.<init>(r8)
            throw r7
        L_0x00ab:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "invalid parameters passed to ChaCha20Poly1305"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.g.init(boolean, s0.a.b.i):void");
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException {
        c();
        int i3 = this.k;
        if (i3 == 3) {
            byte[] bArr2 = this.f;
            int i4 = this.l;
            bArr2[i4] = b2;
            int i5 = i4 + 1;
            this.l = i5;
            if (i5 != 64) {
                return 0;
            }
            g(bArr2, 0, 64, bArr, i2);
            this.c.update(bArr, i2, 64);
            this.l = 0;
            return 64;
        } else if (i3 == 7) {
            byte[] bArr3 = this.f;
            int i6 = this.l;
            bArr3[i6] = b2;
            int i7 = i6 + 1;
            this.l = i7;
            if (i7 != bArr3.length) {
                return 0;
            }
            this.c.update(bArr3, 0, 64);
            g(this.f, 0, 64, bArr, i2);
            byte[] bArr4 = this.f;
            System.arraycopy(bArr4, 64, bArr4, 0, 16);
            this.l = 16;
            return 64;
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[LOOP:2: B:26:0x0096->B:27:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int processBytes(byte[] r17, int r18, int r19, byte[] r20, int r21) throws org.bouncycastle.crypto.DataLengthException {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "'in' cannot be null"
            java.util.Objects.requireNonNull(r7, r0)
            if (r8 < 0) goto L_0x00d5
            if (r9 < 0) goto L_0x00cd
            int r0 = r7.length
            int r0 = r0 - r9
            if (r8 > r0) goto L_0x00c5
            if (r11 < 0) goto L_0x00bd
            r16.c()
            int r0 = r6.k
            r1 = 3
            r12 = 0
            r13 = 64
            if (r0 == r1) goto L_0x0065
            r1 = 7
            if (r0 != r1) goto L_0x005f
            r14 = r12
            r15 = r14
        L_0x002b:
            if (r14 >= r9) goto L_0x00bc
            byte[] r0 = r6.f
            int r1 = r6.l
            int r2 = r8 + r14
            byte r2 = r7[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            r6.l = r1
            int r2 = r0.length
            if (r1 != r2) goto L_0x005c
            s0.a.b.s r1 = r6.c
            r1.update(r0, r12, r13)
            byte[] r1 = r6.f
            r2 = 0
            r3 = 64
            int r5 = r11 + r15
            r0 = r16
            r4 = r20
            r0.g(r1, r2, r3, r4, r5)
            byte[] r0 = r6.f
            r1 = 16
            java.lang.System.arraycopy(r0, r13, r0, r12, r1)
            r6.l = r1
            int r15 = r15 + 64
        L_0x005c:
            int r14 = r14 + 1
            goto L_0x002b
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0065:
            int r0 = r6.l
            if (r0 == 0) goto L_0x0095
        L_0x0069:
            if (r9 <= 0) goto L_0x0095
            int r9 = r9 + -1
            byte[] r1 = r6.f
            int r0 = r6.l
            int r14 = r8 + 1
            byte r2 = r7[r8]
            r1[r0] = r2
            int r0 = r0 + 1
            r6.l = r0
            if (r0 != r13) goto L_0x0093
            r2 = 0
            r3 = 64
            r0 = r16
            r4 = r20
            r5 = r21
            r0.g(r1, r2, r3, r4, r5)
            s0.a.b.s r0 = r6.c
            r0.update(r10, r11, r13)
            r6.l = r12
            r15 = r13
            r8 = r14
            goto L_0x0096
        L_0x0093:
            r8 = r14
            goto L_0x0069
        L_0x0095:
            r15 = r12
        L_0x0096:
            if (r9 < r13) goto L_0x00b3
            r3 = 64
            int r14 = r11 + r15
            r0 = r16
            r1 = r17
            r2 = r8
            r4 = r20
            r5 = r14
            r0.g(r1, r2, r3, r4, r5)
            s0.a.b.s r0 = r6.c
            r0.update(r10, r14, r13)
            int r8 = r8 + 64
            int r9 = r9 + -64
            int r15 = r15 + 64
            goto L_0x0096
        L_0x00b3:
            if (r9 <= 0) goto L_0x00bc
            byte[] r0 = r6.f
            java.lang.System.arraycopy(r7, r8, r0, r12, r9)
            r6.l = r9
        L_0x00bc:
            return r15
        L_0x00bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'outOff' cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            org.bouncycastle.crypto.DataLengthException r0 = new org.bouncycastle.crypto.DataLengthException
            java.lang.String r1 = "Input buffer too short"
            r0.<init>(r1)
            throw r0
        L_0x00cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'len' cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'inOff' cannot be negative"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.g.processBytes(byte[], int, int, byte[], int):int");
    }
}
