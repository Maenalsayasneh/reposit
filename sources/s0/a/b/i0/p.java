package s0.a.b.i0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.e.b.b0.c.h3;

public class p implements a {
    public e a;
    public int b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public a l = new a(this);
    public a m = new a(this);
    public int n = 4;

    public class a extends ByteArrayOutputStream {
        public a(p pVar) {
        }

        public byte[] a() {
            return this.buf;
        }
    }

    public p(e eVar) {
        this.a = eVar;
        this.b = eVar.b();
        this.g = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
        this.e = new byte[eVar.b()];
        this.f = new byte[eVar.b()];
        this.h = new byte[eVar.b()];
        this.i = new byte[eVar.b()];
        this.j = new byte[eVar.b()];
        this.k = new byte[eVar.b()];
        this.n = 4;
    }

    public byte[] a() {
        return h3.I(this.e);
    }

    public void b(byte[] bArr, int i2, int i3) {
        this.l.write(bArr, i2, i3);
    }

    public final void c(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            for (int i4 = 0; i4 < this.a.b(); i4++) {
                byte[] bArr2 = this.f;
                bArr2[i4] = (byte) (bArr2[i4] ^ bArr[i2 + i4]);
            }
            e eVar = this.a;
            byte[] bArr3 = this.f;
            eVar.a(bArr3, 0, bArr3, 0);
            i3 -= this.a.b();
            i2 += this.a.b();
        }
    }

    public final void d(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (true) {
            byte[] bArr3 = this.k;
            if (i4 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.j;
            bArr4[i4] = (byte) (bArr4[i4] + bArr3[i4]);
            i4++;
        }
        this.a.a(this.j, 0, this.i, 0);
        for (int i5 = 0; i5 < this.a.b(); i5++) {
            bArr2[i3 + i5] = (byte) (this.i[i5] ^ bArr[i2 + i5]);
        }
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        int i3;
        int i4;
        int i5;
        byte[] a2 = this.m.a();
        int size = this.m.size();
        if (a2.length - 0 < size) {
            throw new DataLengthException("input buffer too short");
        } else if (bArr.length - i2 >= size) {
            if (this.l.size() > 0) {
                if (this.c) {
                    f(this.l.a(), 0, this.l.size(), this.m.size());
                } else {
                    f(this.l.a(), 0, this.l.size(), this.m.size() - this.b);
                }
            }
            if (this.c) {
                if (size % this.a.b() == 0) {
                    c(a2, 0, size);
                    this.a.a(this.g, 0, this.j, 0);
                    int i6 = size;
                    int i7 = 0;
                    while (i6 > 0) {
                        d(a2, i7, bArr, i2);
                        i6 -= this.a.b();
                        i7 += this.a.b();
                        i2 += this.a.b();
                    }
                    int i8 = 0;
                    while (true) {
                        byte[] bArr2 = this.k;
                        if (i8 >= bArr2.length) {
                            break;
                        }
                        byte[] bArr3 = this.j;
                        bArr3[i8] = (byte) (bArr3[i8] + bArr2[i8]);
                        i8++;
                    }
                    this.a.a(this.j, 0, this.i, 0);
                    int i9 = 0;
                    while (true) {
                        i5 = this.b;
                        if (i9 >= i5) {
                            break;
                        }
                        bArr[i2 + i9] = (byte) (this.i[i9] ^ this.f[i9]);
                        i9++;
                    }
                    System.arraycopy(this.f, 0, this.e, 0, i5);
                    g();
                    i3 = size + this.b;
                } else {
                    throw new DataLengthException("partial blocks not supported");
                }
            } else if ((size - this.b) % this.a.b() == 0) {
                this.a.a(this.g, 0, this.j, 0);
                int b2 = size / this.a.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b2; i11++) {
                    d(a2, i10, bArr, i2);
                    i10 += this.a.b();
                    i2 += this.a.b();
                }
                if (size > i10) {
                    int i12 = 0;
                    while (true) {
                        byte[] bArr4 = this.k;
                        if (i12 >= bArr4.length) {
                            break;
                        }
                        byte[] bArr5 = this.j;
                        bArr5[i12] = (byte) (bArr5[i12] + bArr4[i12]);
                        i12++;
                    }
                    this.a.a(this.j, 0, this.i, 0);
                    int i13 = 0;
                    while (true) {
                        i4 = this.b;
                        if (i13 >= i4) {
                            break;
                        }
                        bArr[i2 + i13] = (byte) (this.i[i13] ^ a2[i10 + i13]);
                        i13++;
                    }
                    i2 += i4;
                }
                int i14 = 0;
                while (true) {
                    byte[] bArr6 = this.k;
                    if (i14 >= bArr6.length) {
                        break;
                    }
                    byte[] bArr7 = this.j;
                    bArr7[i14] = (byte) (bArr7[i14] + bArr6[i14]);
                    i14++;
                }
                this.a.a(this.j, 0, this.i, 0);
                int i15 = this.b;
                System.arraycopy(bArr, i2 - i15, this.i, 0, i15);
                c(bArr, 0, i2 - this.b);
                System.arraycopy(this.f, 0, this.e, 0, this.b);
                int i16 = this.b;
                byte[] bArr8 = new byte[i16];
                System.arraycopy(this.i, 0, bArr8, 0, i16);
                if (h3.U(this.e, bArr8)) {
                    g();
                    i3 = size - this.b;
                } else {
                    throw new InvalidCipherTextException("mac check failed");
                }
            } else {
                throw new DataLengthException("partial blocks not supported");
            }
            g();
            return i3;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public final void e(int i2, byte[] bArr, int i3) {
        bArr[i3 + 3] = (byte) (i2 >> 24);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3] = (byte) i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A[LOOP:0: B:21:0x0076->B:23:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(byte[] r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            int r0 = r9 - r8
            s0.a.b.e r1 = r6.a
            int r1 = r1.b()
            if (r0 < r1) goto L_0x0141
            s0.a.b.e r0 = r6.a
            int r0 = r0.b()
            int r0 = r9 % r0
            if (r0 != 0) goto L_0x0139
            byte[] r0 = r6.g
            byte[] r1 = r6.h
            int r2 = r0.length
            int r3 = r6.n
            int r2 = r2 - r3
            int r2 = r2 + -1
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            byte[] r0 = r6.i
            r6.e(r10, r0, r3)
            byte[] r10 = r6.i
            byte[] r0 = r6.h
            byte[] r1 = r6.g
            int r1 = r1.length
            int r2 = r6.n
            int r1 = r1 - r2
            int r1 = r1 + -1
            r2 = 4
            java.lang.System.arraycopy(r10, r3, r0, r1, r2)
            byte[] r10 = r6.h
            int r0 = r10.length
            int r0 = r0 + -1
            int r1 = r6.b
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r5 = "1"
            r4.append(r5)
            r5 = 8
            if (r1 == r5) goto L_0x0069
            r5 = 16
            if (r1 == r5) goto L_0x0066
            r5 = 32
            if (r1 == r5) goto L_0x0063
            r5 = 48
            if (r1 == r5) goto L_0x0060
            r5 = 64
            if (r1 == r5) goto L_0x005d
            goto L_0x006e
        L_0x005d:
            java.lang.String r1 = "110"
            goto L_0x006b
        L_0x0060:
            java.lang.String r1 = "101"
            goto L_0x006b
        L_0x0063:
            java.lang.String r1 = "100"
            goto L_0x006b
        L_0x0066:
            java.lang.String r1 = "011"
            goto L_0x006b
        L_0x0069:
            java.lang.String r1 = "010"
        L_0x006b:
            r4.append(r1)
        L_0x006e:
            int r1 = r6.n
            int r1 = r1 + -1
            java.lang.String r1 = java.lang.Integer.toBinaryString(r1)
        L_0x0076:
            int r5 = r1.length()
            if (r5 >= r2) goto L_0x008c
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r1)
            java.lang.String r1 = "0"
            java.lang.StringBuffer r1 = r5.insert(r3, r1)
            java.lang.String r1 = r1.toString()
            goto L_0x0076
        L_0x008c:
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2 = 2
            int r1 = java.lang.Integer.parseInt(r1, r2)
            byte r1 = (byte) r1
            r10[r0] = r1
            s0.a.b.e r10 = r6.a
            byte[] r0 = r6.h
            byte[] r1 = r6.f
            r10.a(r0, r3, r1, r3)
            byte[] r10 = r6.i
            r6.e(r9, r10, r3)
            s0.a.b.e r10 = r6.a
            int r10 = r10.b()
            int r0 = r6.n
            int r10 = r10 - r0
            if (r9 > r10) goto L_0x00e9
            r10 = r3
        L_0x00b5:
            if (r10 >= r9) goto L_0x00c9
            byte[] r0 = r6.i
            int r1 = r6.n
            int r1 = r1 + r10
            byte r2 = r0[r1]
            int r4 = r8 + r10
            byte r4 = r7[r4]
            r2 = r2 ^ r4
            byte r2 = (byte) r2
            r0[r1] = r2
            int r10 = r10 + 1
            goto L_0x00b5
        L_0x00c9:
            r7 = r3
        L_0x00ca:
            s0.a.b.e r8 = r6.a
            int r8 = r8.b()
            if (r7 >= r8) goto L_0x00e1
            byte[] r8 = r6.f
            byte r9 = r8[r7]
            byte[] r10 = r6.i
            byte r10 = r10[r7]
            r9 = r9 ^ r10
            byte r9 = (byte) r9
            r8[r7] = r9
            int r7 = r7 + 1
            goto L_0x00ca
        L_0x00e1:
            s0.a.b.e r7 = r6.a
            byte[] r8 = r6.f
            r7.a(r8, r3, r8, r3)
            return
        L_0x00e9:
            r10 = r3
        L_0x00ea:
            s0.a.b.e r0 = r6.a
            int r0 = r0.b()
            if (r10 >= r0) goto L_0x0101
            byte[] r0 = r6.f
            byte r1 = r0[r10]
            byte[] r2 = r6.i
            byte r2 = r2[r10]
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r0[r10] = r1
            int r10 = r10 + 1
            goto L_0x00ea
        L_0x0101:
            s0.a.b.e r10 = r6.a
            byte[] r0 = r6.f
            r10.a(r0, r3, r0, r3)
        L_0x0108:
            if (r9 == 0) goto L_0x0138
            r10 = r3
        L_0x010b:
            s0.a.b.e r0 = r6.a
            int r0 = r0.b()
            if (r10 >= r0) goto L_0x0122
            byte[] r0 = r6.f
            byte r1 = r0[r10]
            int r2 = r10 + r8
            byte r2 = r7[r2]
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r0[r10] = r1
            int r10 = r10 + 1
            goto L_0x010b
        L_0x0122:
            s0.a.b.e r10 = r6.a
            byte[] r0 = r6.f
            r10.a(r0, r3, r0, r3)
            s0.a.b.e r10 = r6.a
            int r10 = r10.b()
            int r8 = r8 + r10
            s0.a.b.e r10 = r6.a
            int r10 = r10.b()
            int r9 = r9 - r10
            goto L_0x0108
        L_0x0138:
            return
        L_0x0139:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "padding not supported"
            r7.<init>(r8)
            throw r7
        L_0x0141:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "authText buffer too short"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.i0.p.f(byte[], int, int, int):void");
    }

    public void g() {
        Arrays.fill(this.h, (byte) 0);
        Arrays.fill(this.i, (byte) 0);
        Arrays.fill(this.k, (byte) 0);
        Arrays.fill(this.f, (byte) 0);
        this.k[0] = 1;
        this.m.reset();
        this.l.reset();
        byte[] bArr = this.d;
        if (bArr != null) {
            this.l.write(bArr, 0, bArr.length);
        }
    }

    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/KCCM";
    }

    public int getOutputSize(int i2) {
        return i2 + this.b;
    }

    public e getUnderlyingCipher() {
        return this.a;
    }

    public int getUpdateOutputSize(int i2) {
        return i2;
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        i iVar2;
        if (iVar instanceof s0.a.b.k0.a) {
            s0.a.b.k0.a aVar = (s0.a.b.k0.a) iVar;
            int i2 = aVar.x;
            if (i2 > 512 || i2 < 64 || i2 % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.g = aVar.b();
            this.b = aVar.x / 8;
            this.d = aVar.a();
            iVar2 = aVar.q;
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.g = c1Var.c;
            this.b = this.a.b();
            this.d = null;
            iVar2 = c1Var.d;
        } else {
            throw new IllegalArgumentException("Invalid parameters specified");
        }
        this.e = new byte[this.b];
        this.c = z;
        this.a.init(true, iVar2);
        this.k[0] = 1;
        byte[] bArr = this.d;
        if (bArr != null) {
            this.l.write(bArr, 0, bArr.length);
        }
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException, IllegalStateException {
        this.m.write(b2);
        return 0;
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i2 + i3) {
            this.m.write(bArr, i2, i3);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }
}
