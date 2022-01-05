package s0.a.b.e0;

import i0.d.a.a.a;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.x;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class t0 implements x {
    public static final int[] a;
    public int b = 20;
    public int c = 0;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public byte[] f = new byte[64];
    public boolean g = false;
    public int h;
    public int i;
    public int j;

    static {
        byte[] c2 = j.c("expand 16-byte kexpand 32-byte k");
        int[] iArr = new int[8];
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            iArr[i3] = h3.g2(c2, i2);
            i2 += 4;
        }
        a = iArr;
        j.c("expand 32-byte k");
        j.c("expand 16-byte k");
    }

    public static void f(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        if (iArr3.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr4.length != 16) {
            throw new IllegalArgumentException();
        } else if (i2 % 2 == 0) {
            boolean z = false;
            int i3 = iArr3[0];
            int i4 = iArr3[1];
            int i5 = iArr3[2];
            int i6 = iArr3[3];
            int i7 = iArr3[4];
            int i8 = iArr3[5];
            int i9 = iArr3[6];
            int i10 = 7;
            int i11 = iArr3[7];
            int i12 = iArr3[8];
            int i13 = 9;
            int i14 = iArr3[9];
            int i15 = iArr3[10];
            int i16 = iArr3[11];
            int i17 = iArr3[12];
            int i18 = 13;
            int i19 = iArr3[13];
            int i20 = iArr3[14];
            int i21 = iArr3[15];
            int i22 = i20;
            int i23 = i19;
            int i24 = i17;
            int i25 = i16;
            int i26 = i15;
            int i27 = i14;
            int i28 = i12;
            int i29 = i11;
            int i30 = i9;
            int i31 = i8;
            int i32 = i7;
            int i33 = i6;
            int i34 = i5;
            int i35 = i4;
            int i36 = i3;
            int i37 = i2;
            while (i37 > 0) {
                int rotateLeft = Integer.rotateLeft(i36 + i24, i10) ^ i32;
                int rotateLeft2 = i28 ^ Integer.rotateLeft(rotateLeft + i36, i13);
                int rotateLeft3 = i24 ^ Integer.rotateLeft(rotateLeft2 + rotateLeft, i18);
                int rotateLeft4 = Integer.rotateLeft(rotateLeft3 + rotateLeft2, 18) ^ i36;
                int rotateLeft5 = i27 ^ Integer.rotateLeft(i31 + i35, i10);
                int rotateLeft6 = i23 ^ Integer.rotateLeft(rotateLeft5 + i31, i13);
                int rotateLeft7 = i35 ^ Integer.rotateLeft(rotateLeft6 + rotateLeft5, i18);
                int rotateLeft8 = Integer.rotateLeft(rotateLeft7 + rotateLeft6, 18) ^ i31;
                int rotateLeft9 = i22 ^ Integer.rotateLeft(i26 + i30, 7);
                int rotateLeft10 = i34 ^ Integer.rotateLeft(rotateLeft9 + i26, 9);
                int rotateLeft11 = i30 ^ Integer.rotateLeft(rotateLeft10 + rotateLeft9, 13);
                int rotateLeft12 = i26 ^ Integer.rotateLeft(rotateLeft11 + rotateLeft10, 18);
                int rotateLeft13 = i33 ^ Integer.rotateLeft(i21 + i25, 7);
                int rotateLeft14 = i29 ^ Integer.rotateLeft(rotateLeft13 + i21, 9);
                int i38 = i37;
                int rotateLeft15 = i25 ^ Integer.rotateLeft(rotateLeft14 + rotateLeft13, 13);
                int i39 = rotateLeft6;
                int rotateLeft16 = i21 ^ Integer.rotateLeft(rotateLeft15 + rotateLeft14, 18);
                int i40 = rotateLeft3;
                i35 = rotateLeft7 ^ Integer.rotateLeft(rotateLeft4 + rotateLeft13, 7);
                i34 = rotateLeft10 ^ Integer.rotateLeft(i35 + rotateLeft4, 9);
                int rotateLeft17 = rotateLeft13 ^ Integer.rotateLeft(i34 + i35, 13);
                int rotateLeft18 = rotateLeft4 ^ Integer.rotateLeft(rotateLeft17 + i34, 18);
                i30 = rotateLeft11 ^ Integer.rotateLeft(rotateLeft8 + rotateLeft, 7);
                i29 = rotateLeft14 ^ Integer.rotateLeft(i30 + rotateLeft8, 9);
                int rotateLeft19 = Integer.rotateLeft(i29 + i30, 13) ^ rotateLeft;
                i31 = rotateLeft8 ^ Integer.rotateLeft(rotateLeft19 + i29, 18);
                i25 = rotateLeft15 ^ Integer.rotateLeft(rotateLeft12 + rotateLeft5, 7);
                int rotateLeft20 = Integer.rotateLeft(i25 + rotateLeft12, 9) ^ rotateLeft2;
                i27 = rotateLeft5 ^ Integer.rotateLeft(rotateLeft20 + i25, 13);
                i26 = rotateLeft12 ^ Integer.rotateLeft(i27 + rotateLeft20, 18);
                i24 = i40 ^ Integer.rotateLeft(rotateLeft16 + rotateLeft9, 7);
                i23 = i39 ^ Integer.rotateLeft(i24 + rotateLeft16, 9);
                i22 = rotateLeft9 ^ Integer.rotateLeft(i23 + i24, 13);
                i21 = rotateLeft16 ^ Integer.rotateLeft(i22 + i23, 18);
                i33 = rotateLeft17;
                i28 = rotateLeft20;
                i36 = rotateLeft18;
                i32 = rotateLeft19;
                z = false;
                i18 = 13;
                i13 = 9;
                i10 = 7;
                int[] iArr5 = iArr;
                i37 = i38 - 2;
                int[] iArr6 = iArr2;
            }
            char c2 = z;
            iArr2[c2] = i36 + iArr[c2];
            iArr2[1] = i35 + iArr[1];
            iArr2[2] = i34 + iArr[2];
            iArr2[3] = i33 + iArr[3];
            iArr2[4] = i32 + iArr[4];
            iArr2[5] = i31 + iArr[5];
            iArr2[6] = i30 + iArr[6];
            iArr2[7] = i29 + iArr[7];
            iArr2[8] = i28 + iArr[8];
            iArr2[9] = i27 + iArr[9];
            iArr2[10] = i26 + iArr[10];
            iArr2[11] = i25 + iArr[11];
            iArr2[12] = i24 + iArr[12];
            iArr2[13] = i23 + iArr[13];
            iArr2[14] = i22 + iArr[14];
            iArr2[15] = i21 + iArr[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    public void a() {
        int[] iArr = this.d;
        int i2 = iArr[8] + 1;
        iArr[8] = i2;
        if (i2 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void b(byte[] bArr) {
        f(this.b, this.d, this.e);
        h3.E1(this.e, bArr, 0);
    }

    public int c() {
        return 8;
    }

    public void d(int i2, int[] iArr, int i3) {
        int i4 = (i2 - 16) / 4;
        int[] iArr2 = a;
        iArr[i3] = iArr2[i4];
        iArr[i3 + 1] = iArr2[i4 + 1];
        iArr[i3 + 2] = iArr2[i4 + 2];
        iArr[i3 + 3] = iArr2[i4 + 3];
    }

    public void e() {
        int[] iArr = this.d;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void g(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 16 || bArr.length == 32) {
                int length = (bArr.length - 16) / 4;
                int[] iArr = this.d;
                int[] iArr2 = a;
                iArr[0] = iArr2[length];
                iArr[5] = iArr2[length + 1];
                iArr[10] = iArr2[length + 2];
                iArr[15] = iArr2[length + 3];
                h3.h2(bArr, 0, iArr, 1, 4);
                h3.h2(bArr, bArr.length - 16, this.d, 11, 4);
            } else {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
        }
        h3.h2(bArr2, 0, this.d, 6, 2);
    }

    public String getAlgorithmName() {
        if (this.b == 20) {
            return "Salsa20";
        }
        StringBuilder S0 = a.S0("Salsa20", "/");
        S0.append(this.b);
        return S0.toString();
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            if (bArr == null || bArr.length != c()) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + c() + " bytes of IV");
            }
            i iVar2 = c1Var.d;
            if (iVar2 == null) {
                if (this.g) {
                    g((byte[]) null, bArr);
                } else {
                    throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
                }
            } else if (iVar2 instanceof y0) {
                g(((y0) iVar2).c, bArr);
            } else {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            reset();
            this.g = true;
            return;
        }
        throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[LOOP:0: B:16:0x002e->B:20:0x004f, LOOP_START, PHI: r1 
      PHI: (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:15:0x002c, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int processBytes(byte[] r7, int r8, int r9, byte[] r10, int r11) {
        /*
            r6 = this;
            boolean r0 = r6.g
            if (r0 == 0) goto L_0x006b
            int r0 = r8 + r9
            int r1 = r7.length
            if (r0 > r1) goto L_0x0063
            int r0 = r11 + r9
            int r1 = r10.length
            if (r0 > r1) goto L_0x005b
            int r0 = r6.h
            int r0 = r0 + r9
            r6.h = r0
            r1 = 0
            r2 = 1
            if (r0 >= r9) goto L_0x002b
            if (r0 < 0) goto L_0x002b
            int r0 = r6.i
            int r0 = r0 + r2
            r6.i = r0
            if (r0 != 0) goto L_0x002b
            int r0 = r6.j
            int r0 = r0 + r2
            r6.j = r0
            r0 = r0 & 32
            if (r0 == 0) goto L_0x002b
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 != 0) goto L_0x0053
        L_0x002e:
            if (r1 >= r9) goto L_0x0052
            int r0 = r1 + r11
            byte[] r3 = r6.f
            int r4 = r6.c
            byte r3 = r3[r4]
            int r5 = r1 + r8
            byte r5 = r7[r5]
            r3 = r3 ^ r5
            byte r3 = (byte) r3
            r10[r0] = r3
            int r4 = r4 + r2
            r0 = r4 & 63
            r6.c = r0
            if (r0 != 0) goto L_0x004f
            r6.a()
            byte[] r0 = r6.f
            r6.b(r0)
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0052:
            return r9
        L_0x0053:
            org.bouncycastle.crypto.MaxBytesExceededException r7 = new org.bouncycastle.crypto.MaxBytesExceededException
            java.lang.String r8 = "2^70 byte limit per IV would be exceeded; Change IV"
            r7.<init>(r8)
            throw r7
        L_0x005b:
            org.bouncycastle.crypto.OutputLengthException r7 = new org.bouncycastle.crypto.OutputLengthException
            java.lang.String r8 = "output buffer too short"
            r7.<init>(r8)
            throw r7
        L_0x0063:
            org.bouncycastle.crypto.DataLengthException r7 = new org.bouncycastle.crypto.DataLengthException
            java.lang.String r8 = "input buffer too short"
            r7.<init>(r8)
            throw r7
        L_0x006b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.getAlgorithmName()
            r8.append(r9)
            java.lang.String r9 = " not initialised"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.e0.t0.processBytes(byte[], int, int, byte[], int):int");
    }

    public void reset() {
        this.c = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        e();
        b(this.f);
    }
}
