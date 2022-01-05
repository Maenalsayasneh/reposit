package s0.a.e.b;

import java.math.BigInteger;
import s0.a.e.b.b0.c.h3;

public class m implements Cloneable {
    public static final short[] c = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    public static final byte[] d = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    public long[] q;

    public m(int i) {
        this.q = new long[i];
    }

    public m(BigInteger bigInteger) {
        int i;
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        } else if (bigInteger.signum() == 0) {
            this.q = new long[]{0};
        } else {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
                i = 1;
            } else {
                i = 0;
            }
            int i2 = (length + 7) / 8;
            this.q = new long[i2];
            int i3 = i2 - 1;
            int i4 = (length % 8) + i;
            if (i < i4) {
                long j = 0;
                while (i < i4) {
                    j = (j << 8) | ((long) (byteArray[i] & 255));
                    i++;
                }
                this.q[i3] = j;
                i3--;
            }
            while (i3 >= 0) {
                long j2 = 0;
                int i5 = 0;
                while (i5 < 8) {
                    j2 = (j2 << 8) | ((long) (byteArray[i] & 255));
                    i5++;
                    i++;
                }
                this.q[i3] = j2;
                i3--;
            }
        }
    }

    public m(long[] jArr) {
        this.q = jArr;
    }

    public m(long[] jArr, int i, int i2) {
        if (i == 0 && i2 == jArr.length) {
            this.q = jArr;
            return;
        }
        long[] jArr2 = new long[i2];
        this.q = jArr2;
        System.arraycopy(jArr, i, jArr2, 0, i2);
    }

    public static void b(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public static void c(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            jArr3[i3 + i5] = jArr[i + i5] ^ jArr2[i2 + i5];
        }
    }

    public static void d(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    public static long g(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        int i6 = i3;
        for (int i7 = 0; i7 < i6; i7++) {
            long j2 = jArr2[i2 + i7];
            int i8 = i + i7;
            jArr[i8] = (j | (j2 << i4)) ^ jArr[i8];
            j = j2 >>> i5;
        }
        return j;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v12, types: [byte] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(long r3) {
        /*
            r0 = 32
            long r1 = r3 >>> r0
            int r1 = (int) r1
            if (r1 != 0) goto L_0x0009
            int r1 = (int) r3
            r0 = 0
        L_0x0009:
            int r3 = r1 >>> 16
            if (r3 != 0) goto L_0x001d
            int r3 = r1 >>> 8
            if (r3 != 0) goto L_0x0016
            byte[] r3 = d
            byte r3 = r3[r1]
            goto L_0x002e
        L_0x0016:
            byte[] r4 = d
            byte r3 = r4[r3]
            int r3 = r3 + 8
            goto L_0x002e
        L_0x001d:
            int r4 = r3 >>> 8
            if (r4 != 0) goto L_0x0028
            byte[] r4 = d
            byte r3 = r4[r3]
            int r3 = r3 + 16
            goto L_0x002e
        L_0x0028:
            byte[] r3 = d
            byte r3 = r3[r4]
            int r3 = r3 + 24
        L_0x002e:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.m.h(long):int");
    }

    public static void l(long[] jArr, int i, int i2) {
        int i3 = i + (i2 >>> 6);
        jArr[i3] = jArr[i3] ^ (1 << (i2 & 63));
    }

    public static void m(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        long[] jArr3 = jArr;
        long[] jArr4 = jArr2;
        int i5 = i2;
        int i6 = i + (i4 >>> 6);
        int i7 = i4 & 63;
        int i8 = i3;
        if (i7 == 0) {
            b(jArr3, i6, jArr4, i5, i8);
            return;
        }
        int i9 = i6 + 1;
        int i10 = 64 - i7;
        int i11 = 64 - i10;
        long j = 0;
        while (true) {
            i8--;
            if (i8 >= 0) {
                long j2 = jArr4[i5 + i8];
                int i12 = i9 + i8;
                jArr3[i12] = (j | (j2 >>> i10)) ^ jArr3[i12];
                j = j2 << i11;
            } else {
                jArr3[i6] = jArr3[i6] ^ j;
                return;
            }
        }
    }

    public static void n(long[] jArr, int i, int i2, long j) {
        int i3 = i + (i2 >>> 6);
        int i4 = i2 & 63;
        if (i4 == 0) {
            jArr[i3] = jArr[i3] ^ j;
            return;
        }
        jArr[i3] = jArr[i3] ^ (j << i4);
        long j2 = j >>> (64 - i4);
        if (j2 != 0) {
            int i5 = i3 + 1;
            jArr[i5] = j2 ^ jArr[i5];
        }
    }

    public static long p(int i) {
        short[] sArr = c;
        short s = sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16);
        short s2 = sArr[(i >>> 16) & 255];
        return (((long) s) & 4294967295L) | ((((long) ((sArr[i >>> 24] << 16) | s2)) & 4294967295L) << 32);
    }

    public static void t(long j, long[] jArr, int i, long[] jArr2, int i2) {
        int i3 = i;
        long[] jArr3 = jArr2;
        int i4 = i2;
        if ((j & 1) != 0) {
            b(jArr3, i4, jArr, 0, i3);
        } else {
            long[] jArr4 = jArr;
        }
        long j2 = j;
        int i5 = 1;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 != 0) {
                if ((j3 & 1) != 0) {
                    long g = g(jArr2, i2, jArr, 0, i, i5);
                    if (g != 0) {
                        int i6 = i4 + i3;
                        jArr3[i6] = g ^ jArr3[i6];
                    }
                }
                i5++;
                j2 = j3;
            } else {
                return;
            }
        }
    }

    public static void v(long[] jArr, int i, int i2, int i3, int[] iArr) {
        l(jArr, i, i2);
        int i4 = i2 - i3;
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                l(jArr, i, iArr[length] + i4);
            } else {
                l(jArr, i, i4);
                return;
            }
        }
    }

    public static int w(long[] jArr, int i, int i2, int i3, int[] iArr) {
        long[] jArr2 = jArr;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int[] iArr2 = iArr;
        int i7 = (i6 + 63) >>> 6;
        if (i5 < i7) {
            return i5;
        }
        int i8 = i5 << 6;
        int min = Math.min(i8, (i6 << 1) - 1);
        int i9 = i8 - min;
        int i10 = i5;
        while (i9 >= 64) {
            i10--;
            i9 -= 64;
        }
        int length = iArr2.length;
        int i11 = iArr2[length - 1];
        int i12 = length > 1 ? iArr2[length - 2] : 0;
        int max = Math.max(i6, i11 + 64);
        int min2 = (Math.min(min - max, i6 - i12) + i9) >> 6;
        if (min2 > 1) {
            int i13 = i10 - min2;
            int i14 = i13 << 6;
            int i15 = i14 - i6;
            int length2 = iArr2.length;
            while (true) {
                int i16 = length2 - 1;
                if (i16 < 0) {
                    break;
                }
                m(jArr, i, jArr, i4 + i13, i10 - i13, i15 + iArr2[i16]);
                i13 = i13;
                length2 = i16;
            }
            int i17 = i13;
            m(jArr, i, jArr, i4 + i17, i10 - i17, i15);
            while (i10 > i17) {
                i10--;
                jArr2[i4 + i10] = 0;
            }
            min = i14;
        }
        if (min > max) {
            int i18 = max >>> 6;
            while (true) {
                i10--;
                if (i10 <= i18) {
                    break;
                }
                int i19 = i4 + i10;
                long j = jArr2[i19];
                if (j != 0) {
                    jArr2[i19] = 0;
                    int i20 = (i10 << 6) - i6;
                    int length3 = iArr2.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        n(jArr2, i4, iArr2[length3] + i20, j);
                    }
                    n(jArr2, i4, i20, j);
                }
            }
            int i21 = max & 63;
            int i22 = i18 + i4;
            long j2 = jArr2[i22] >>> i21;
            if (j2 != 0) {
                jArr2[i22] = jArr2[i22] ^ (j2 << i21);
                int i23 = max - i6;
                int length4 = iArr2.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    n(jArr2, i4, iArr2[length4] + i23, j2);
                }
                n(jArr2, i4, i23, j2);
            }
        } else {
            max = min;
        }
        if (max > i6) {
            while (true) {
                max--;
                if (max < i6) {
                    break;
                }
                if ((jArr2[(max >>> 6) + i4] & (1 << (max & 63))) != 0) {
                    v(jArr2, i4, max, i6, iArr2);
                }
            }
        }
        return i7;
    }

    public static long x(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
        return j;
    }

    public Object clone() {
        return new m(h3.L(this.q));
    }

    public final void e(m mVar, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            b(this.q, i4, mVar.q, 0, i3);
            return;
        }
        long g = g(this.q, i4, mVar.q, 0, i3, i5);
        if (g != 0) {
            long[] jArr = this.q;
            int i6 = i3 + i4;
            jArr[i6] = g ^ jArr[i6];
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        int o = o();
        if (mVar.o() != o) {
            return false;
        }
        for (int i = 0; i < o; i++) {
            if (this.q[i] != mVar.q[i]) {
                return false;
            }
        }
        return true;
    }

    public void f(m mVar, int i) {
        int o = mVar.o();
        if (o != 0) {
            int i2 = o + i;
            long[] jArr = this.q;
            if (i2 > jArr.length) {
                long[] jArr2 = new long[i2];
                System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, i2));
                this.q = jArr2;
            }
            b(this.q, i, mVar.q, 0, o);
        }
    }

    public int hashCode() {
        int o = o();
        int i = 1;
        for (int i2 = 0; i2 < o; i2++) {
            long j = this.q[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public int i() {
        int length = this.q.length;
        while (length != 0) {
            length--;
            long j = this.q[length];
            if (j != 0) {
                return h(j) + (length << 6);
            }
        }
        return 0;
    }

    public final int j(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.q[i2];
            if (j != 0) {
                return h(j) + (i2 << 6);
            }
        }
        return 0;
    }

    public int o() {
        long[] jArr = this.q;
        int min = Math.min(jArr.length, jArr.length);
        if (min < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            do {
                min--;
            } while (jArr[min] == 0);
        } else {
            do {
                min--;
                if (jArr[min] != 0) {
                }
            } while (min > 0);
            return 0;
        }
        return min + 1;
    }

    public boolean q() {
        long[] jArr = this.q;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean r() {
        long[] jArr = this.q;
        for (long j : jArr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public m s(m mVar) {
        int i;
        int i2;
        m mVar2;
        m mVar3;
        long[] jArr;
        int i3;
        int i4 = i();
        if (i4 == 0) {
            return this;
        }
        int i5 = mVar.i();
        if (i5 == 0) {
            return mVar;
        }
        if (i4 > i5) {
            i = i4;
            i2 = i5;
            mVar3 = this;
            mVar2 = mVar;
        } else {
            i2 = i4;
            i = i5;
            mVar2 = this;
            mVar3 = mVar;
        }
        int i6 = (i2 + 63) >>> 6;
        int i7 = (i + 63) >>> 6;
        int i8 = ((i2 + i) + 62) >>> 6;
        if (i6 == 1) {
            long j = mVar2.q[0];
            if (j == 1) {
                return mVar3;
            }
            long[] jArr2 = new long[i8];
            t(j, mVar3.q, i7, jArr2, 0);
            return new m(jArr2, 0, i8);
        }
        int i9 = ((i + 7) + 63) >>> 6;
        int[] iArr = new int[16];
        int i10 = i9 << 4;
        long[] jArr3 = new long[i10];
        iArr[1] = i9;
        System.arraycopy(mVar3.q, 0, jArr3, i9, i7);
        int i11 = 2;
        int i12 = i9;
        for (int i13 = 16; i11 < i13; i13 = 16) {
            i12 += i9;
            iArr[i11] = i12;
            if ((i11 & 1) == 0) {
                jArr = jArr3;
                i3 = i10;
                x(jArr3, i12 >>> 1, jArr3, i12, i9, 1);
            } else {
                jArr = jArr3;
                i3 = i10;
                c(jArr, i9, jArr, i12 - i9, jArr3, i12, i9);
            }
            i11++;
            i10 = i3;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i14 = i10;
        long[] jArr5 = new long[i14];
        x(jArr4, 0, jArr5, 0, i14, 4);
        long[] jArr6 = mVar2.q;
        int i15 = i8 << 3;
        long[] jArr7 = new long[i15];
        for (int i16 = 0; i16 < i6; i16++) {
            long j2 = jArr6[i16];
            int i17 = i16;
            while (true) {
                long j3 = j2 >>> 4;
                d(jArr7, i17, jArr4, iArr[((int) j2) & 15], jArr5, iArr[((int) j3) & 15], i9);
                j2 = j3 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i17 += i8;
            }
        }
        while (true) {
            i15 -= i8;
            if (i15 == 0) {
                return new m(jArr7, 0, i8);
            }
            g(jArr7, i15 - i8, jArr7, i15, i8, 8);
        }
    }

    public String toString() {
        int o = o();
        if (o == 0) {
            return "0";
        }
        int i = o - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.q[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.q[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public void u(int i, int[] iArr) {
        long[] jArr = this.q;
        int w = w(jArr, 0, jArr.length, i, iArr);
        if (w < jArr.length) {
            long[] jArr2 = new long[w];
            this.q = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, w);
        }
    }
}
