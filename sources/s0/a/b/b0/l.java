package s0.a.b.b0;

import i0.d.a.a.a;
import java.util.Arrays;
import s0.a.b.o;
import s0.a.e.b.b0.c.h3;
import s0.a.g.k.d;
import s0.a.g.k.e;

public class l implements o {
    public static long[] a = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    public long[] b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public l() {
        this(288);
    }

    public l(int i) {
        this.b = new long[25];
        this.c = new byte[192];
        f(i);
    }

    public l(l lVar) {
        long[] jArr = new long[25];
        this.b = jArr;
        this.c = new byte[192];
        long[] jArr2 = lVar.b;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = lVar.c;
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        this.d = lVar.d;
        this.e = lVar.e;
        this.f = lVar.f;
        this.g = lVar.g;
    }

    public final void a(byte[] bArr, int i) {
        int i2 = this.d >>> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.b;
            jArr[i3] = jArr[i3] ^ h3.i2(bArr, i);
            i += 8;
        }
        byte[] e2 = e();
        e eVar = d.a;
        d.g(e2, 0, e2.length).toLowerCase();
        c();
    }

    public final void c() {
        long[] jArr = this.b;
        int i = 0;
        long j = jArr[0];
        boolean z = true;
        long j2 = jArr[1];
        long j3 = jArr[2];
        char c2 = 3;
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        long j15 = jArr[14];
        long j16 = jArr[15];
        long j17 = jArr[16];
        long j18 = jArr[17];
        long j19 = jArr[18];
        long j20 = jArr[19];
        long j21 = jArr[20];
        long j22 = jArr[21];
        long j23 = jArr[22];
        long j24 = jArr[23];
        int i2 = 24;
        long j25 = jArr[24];
        while (i < i2) {
            long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = ((j27 << (z ? 1 : 0)) | (j27 >>> -1)) ^ j30;
            long j32 = ((j28 << z) | (j28 >>> -1)) ^ j26;
            long j33 = ((j29 << z) | (j29 >>> -1)) ^ j27;
            long j34 = ((j30 << z) | (j30 >>> -1)) ^ j28;
            long j35 = ((j26 << z) | (j26 >>> -1)) ^ j29;
            long j36 = j ^ j31;
            long j37 = j6 ^ j31;
            long j38 = j11 ^ j31;
            long j39 = j16 ^ j31;
            long j40 = j21 ^ j31;
            long j41 = j2 ^ j32;
            long j42 = j7 ^ j32;
            long j43 = j12 ^ j32;
            long j44 = j17 ^ j32;
            long j45 = j22 ^ j32;
            long j46 = j8 ^ j33;
            long j47 = j13 ^ j33;
            long j48 = j18 ^ j33;
            long j49 = j23 ^ j33;
            long j50 = j9 ^ j34;
            long j51 = j14 ^ j34;
            long j52 = j19 ^ j34;
            long j53 = j24 ^ j34;
            long j54 = j10 ^ j35;
            long j55 = j15 ^ j35;
            long j56 = j20 ^ j35;
            long j57 = j25 ^ j35;
            long j58 = (j41 << z) | (j41 >>> 63);
            long j59 = (j42 << 44) | (j42 >>> 20);
            long j60 = j5 ^ j35;
            long j61 = (j54 << 20) | (j54 >>> 44);
            long j62 = j49 << 61;
            long j63 = j49 >>> c2;
            long j64 = j4 ^ j34;
            long j65 = j62 | j63;
            long j66 = j3 ^ j33;
            long j67 = (j55 << 39) | (j55 >>> 25);
            long j68 = (j47 << 43) | (j47 >>> 21);
            long j69 = (j66 << 62) | (j66 >>> 2);
            long j70 = (j51 << 25) | (j51 >>> 39);
            long j71 = (j40 << 18) | (j40 >>> 46);
            long j72 = (j56 << 8) | (j56 >>> 56);
            long j73 = j39 << 41;
            long j74 = j39 >>> 23;
            long j75 = (j53 << 56) | (j53 >>> 8);
            long j76 = j73 | j74;
            long j77 = (j60 << 27) | (j60 >>> 37);
            long j78 = (j57 << 14) | (j57 >>> 50);
            long j79 = j45 << 2;
            long j80 = j45 >>> 62;
            long j81 = j70;
            long j82 = j79 | j80;
            long j83 = (j50 << 55) | (j50 >>> 9);
            long j84 = j44 << 45;
            long j85 = j44 >>> 19;
            long j86 = j83;
            long j87 = j84 | j85;
            long j88 = j65;
            long j89 = (j37 << 36) | (j37 >>> 28);
            long j90 = j64 << 28;
            long j91 = j64 >>> 36;
            long j92 = j89;
            long j93 = j90 | j91;
            long j94 = j52 << 21;
            long j95 = j52 >>> 43;
            long j96 = j87;
            long j97 = j94 | j95;
            long j98 = j48 << 15;
            long j99 = j48 >>> 49;
            long j100 = j93;
            long j101 = j98 | j99;
            long j102 = j43 << 10;
            long j103 = j43 >>> 54;
            long j104 = j101;
            long j105 = j102 | j103;
            long j106 = j46 << 6;
            long j107 = j46 >>> 58;
            long j108 = j105;
            long j109 = j106 | j107;
            long j110 = j38 << 3;
            long j111 = j38 >>> 61;
            long j112 = j110 | j111;
            long j113 = ((~j59) & j68) ^ j36;
            long j114 = ((~j68) & j97) ^ j59;
            j3 = j68 ^ ((~j97) & j78);
            j4 = j97 ^ ((~j78) & j36);
            long j115 = j78 ^ ((~j36) & j59);
            long j116 = j112;
            long j117 = ((~j116) & j96) ^ j61;
            long j118 = j115;
            long j119 = j96;
            long j120 = j100 ^ ((~j61) & j112);
            long j121 = ((~j119) & j88) ^ j116;
            long j122 = j88;
            long j123 = j121;
            long j124 = j119 ^ ((~j122) & j100);
            long j125 = ((~j100) & j61) ^ j122;
            long j126 = j109;
            j11 = j58 ^ ((~j126) & j81);
            long j127 = j124;
            long j128 = j81;
            long j129 = ((~j128) & j72) ^ j126;
            long j130 = j72;
            long j131 = j125;
            long j132 = ((~j130) & j71) ^ j128;
            long j133 = j71;
            long j134 = j132;
            long j135 = j130 ^ ((~j133) & j58);
            long j136 = ((~j58) & j126) ^ j133;
            long j137 = j92;
            long j138 = j77 ^ ((~j137) & j108);
            long j139 = j135;
            long j140 = j108;
            long j141 = j136;
            long j142 = ((~j140) & j104) ^ j137;
            long j143 = j104;
            long j144 = j117;
            long j145 = j75;
            long j146 = j140 ^ ((~j143) & j75);
            long j147 = ((~j145) & j77) ^ j143;
            long j148 = ((~j77) & j137) ^ j145;
            long j149 = j86;
            long j150 = j147;
            long j151 = j67;
            long j152 = j148;
            long j153 = ((~j151) & j76) ^ j149;
            long j154 = j76;
            j21 = j69 ^ ((~j149) & j67);
            long j155 = j82;
            long j156 = j151 ^ ((~j154) & j82);
            long j157 = ((~j155) & j69) ^ j154;
            long j158 = j113 ^ a[i];
            i++;
            j7 = j144;
            j13 = j134;
            j12 = j129;
            j14 = j139;
            j22 = j153;
            c2 = 3;
            j24 = j157;
            j23 = j156;
            j10 = j131;
            jArr = jArr;
            j20 = j152;
            j15 = j141;
            j8 = j123;
            j9 = j127;
            j18 = j146;
            j16 = j138;
            j5 = j118;
            j6 = j120;
            i2 = 24;
            j19 = j150;
            j17 = j142;
            long j159 = j158;
            z = true;
            j2 = j114;
            j25 = ((~j69) & j149) ^ j155;
            j = j159;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j;
        jArr2[1] = j2;
        jArr2[2] = j3;
        jArr2[3] = j4;
        jArr2[4] = j5;
        jArr2[5] = j6;
        jArr2[6] = j7;
        jArr2[7] = j8;
        jArr2[8] = j9;
        jArr2[9] = j10;
        jArr2[10] = j11;
        jArr2[11] = j12;
        jArr2[12] = j13;
        jArr2[13] = j14;
        jArr2[14] = j15;
        jArr2[15] = j16;
        jArr2[16] = j17;
        jArr2[17] = j18;
        jArr2[18] = j19;
        jArr2[19] = j20;
        jArr2[20] = j21;
        jArr2[21] = j22;
        jArr2[22] = j23;
        jArr2[23] = j24;
        jArr2[24] = j25;
    }

    public void d(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i3 = this.e;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.g) {
            this.c[i3 >>> 3] = (byte) (i & ((1 << i2) - 1));
            this.e = i3 + i2;
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public int doFinal(byte[] bArr, int i) {
        g(bArr, i, (long) this.f);
        f(this.f);
        return this.f / 8;
    }

    public byte[] e() {
        byte[] bArr = new byte[(this.b.length * 8)];
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr = this.b;
            if (i == jArr.length) {
                return bArr;
            }
            h3.m2(jArr[i], bArr, i2);
            i2 += 8;
            i++;
        }
    }

    public final void f(int i) {
        if (i == 128 || i == 224 || i == 256 || i == 288 || i == 384 || i == 512) {
            int i2 = 1600 - (i << 1);
            if (i2 <= 0 || i2 >= 1600 || i2 % 64 != 0) {
                throw new IllegalStateException("invalid rate value");
            }
            this.d = i2;
            int i3 = 0;
            while (true) {
                long[] jArr = this.b;
                if (i3 < jArr.length) {
                    jArr[i3] = 0;
                    i3++;
                } else {
                    Arrays.fill(this.c, (byte) 0);
                    this.e = 0;
                    this.g = false;
                    this.f = (1600 - i2) / 2;
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    public void g(byte[] bArr, int i, long j) {
        if (!this.g) {
            byte[] bArr2 = this.c;
            int i2 = this.e;
            int i3 = i2 >>> 3;
            bArr2[i3] = (byte) (bArr2[i3] | ((byte) (1 << (i2 & 7))));
            int i4 = i2 + 1;
            this.e = i4;
            if (i4 == this.d) {
                a(bArr2, 0);
            } else {
                int i5 = i4 >>> 6;
                int i6 = i4 & 63;
                int i7 = 0;
                for (int i8 = 0; i8 < i5; i8++) {
                    long[] jArr = this.b;
                    jArr[i8] = jArr[i8] ^ h3.i2(this.c, i7);
                    i7 += 8;
                }
                e();
                if (i6 > 0) {
                    long[] jArr2 = this.b;
                    jArr2[i5] = (((1 << i6) - 1) & h3.i2(this.c, i7)) ^ jArr2[i5];
                }
            }
            long[] jArr3 = this.b;
            int i9 = (this.d - 1) >>> 6;
            jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
            this.e = 0;
            this.g = true;
        }
        e();
        long j2 = 0;
        if (j % 8 == 0) {
            while (j2 < j) {
                if (this.e == 0) {
                    c();
                    e();
                    long[] jArr4 = this.b;
                    int i10 = this.d >>> 6;
                    byte[] bArr3 = this.c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        h3.m2(jArr4[0 + i12], bArr3, i11);
                        i11 += 8;
                    }
                    this.e = this.d;
                }
                int min = (int) Math.min((long) this.e, j - j2);
                byte[] bArr4 = bArr;
                System.arraycopy(this.c, (this.d - this.e) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
                this.e -= min;
                j2 += (long) min;
            }
            e();
            return;
        }
        throw new IllegalStateException("outputLength not a multiple of 8");
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("Keccak-");
        P0.append(this.f);
        return P0.toString();
    }

    public int getByteLength() {
        return this.d / 8;
    }

    public int getDigestSize() {
        return this.f / 8;
    }

    public void reset() {
        f(this.f);
    }

    public void update(byte b2) {
        int i = this.e;
        if (i % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.g) {
            byte[] bArr = this.c;
            bArr[i >>> 3] = b2;
            int i2 = i + 8;
            this.e = i2;
            if (i2 == this.d) {
                a(bArr, 0);
                this.e = 0;
            }
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = this.e;
        if (i6 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        } else if (!this.g) {
            int i7 = i6 >>> 3;
            int i8 = this.d >>> 3;
            int i9 = i8 - i7;
            if (i2 < i9) {
                System.arraycopy(bArr, i, this.c, i7, i2);
                i3 = this.e + (i2 << 3);
            } else {
                if (i7 > 0) {
                    System.arraycopy(bArr, i, this.c, i7, i9);
                    i4 = i9 + 0;
                    a(this.c, 0);
                } else {
                    i4 = 0;
                }
                while (true) {
                    i5 = i2 - i4;
                    if (i5 < i8) {
                        break;
                    }
                    a(bArr, i + i4);
                    i4 += i8;
                }
                System.arraycopy(bArr, i + i4, this.c, 0, i5);
                i3 = i5 << 3;
            }
            this.e = i3;
        } else {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }
}
