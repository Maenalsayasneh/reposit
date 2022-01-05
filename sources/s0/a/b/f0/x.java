package s0.a.b.f0;

import java.math.BigInteger;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.k0.j1;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;
import s0.a.b.q;
import s0.a.e.b.v;

public class x implements c {
    public static final BigInteger g = BigInteger.valueOf(1);
    public j1 h;

    public void a(q qVar) {
        this.h = (j1) qVar;
    }

    public b b() {
        BigInteger c;
        BigInteger c2;
        BigInteger multiply;
        BigInteger bigInteger;
        x xVar = this;
        int i = xVar.h.b;
        int i2 = (i + 1) / 2;
        int i3 = i - i2;
        int i4 = i / 2;
        int i5 = i4 - 100;
        int i6 = i / 3;
        if (i5 < i6) {
            i5 = i6;
        }
        int i7 = i >> 2;
        BigInteger pow = BigInteger.valueOf(2).pow(i4);
        BigInteger bigInteger2 = g;
        BigInteger shiftLeft = bigInteger2.shiftLeft(i - 1);
        BigInteger shiftLeft2 = bigInteger2.shiftLeft(i5);
        b bVar = null;
        boolean z = false;
        while (!z) {
            BigInteger bigInteger3 = xVar.h.c;
            do {
                c = xVar.c(i2, bigInteger3, shiftLeft);
                while (true) {
                    c2 = xVar.c(i3, bigInteger3, shiftLeft);
                    BigInteger abs = c2.subtract(c).abs();
                    if (abs.bitLength() >= i5 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = c.multiply(c2);
                        if (multiply.bitLength() == i) {
                            break;
                        }
                        c = c.max(c2);
                    } else {
                        xVar = this;
                        i = i;
                    }
                }
            } while (v.c(multiply) < i7);
            if (c.compareTo(c2) < 0) {
                bigInteger = c;
                c = c2;
            } else {
                bigInteger = c2;
            }
            BigInteger bigInteger4 = g;
            BigInteger subtract = c.subtract(bigInteger4);
            BigInteger subtract2 = bigInteger.subtract(bigInteger4);
            int i8 = i;
            BigInteger modInverse = bigInteger3.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) <= 0) {
                xVar = this;
                i = i8;
            } else {
                BigInteger remainder = modInverse.remainder(subtract);
                BigInteger remainder2 = modInverse.remainder(subtract2);
                BigInteger j = s0.a.g.b.j(c, bigInteger);
                k1 k1Var = new k1(false, multiply, bigInteger3);
                l1 l1Var = r13;
                l1 l1Var2 = new l1(multiply, bigInteger3, modInverse, c, bigInteger, remainder, remainder2, j);
                bVar = new b(k1Var, l1Var);
                z = true;
                i = i8;
                xVar = this;
            }
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0209 A[LOOP:1: B:136:0x01cc->B:151:0x0209, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0236 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0207 A[EDGE_INSN: B:175:0x0207->B:150:0x0207 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.math.BigInteger c(int r13, java.math.BigInteger r14, java.math.BigInteger r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r13 * 5
            if (r0 == r2) goto L_0x023c
            s0.a.b.k0.j1 r2 = r12.h
            java.security.SecureRandom r2 = r2.a
            r3 = 1
            java.math.BigInteger r2 = s0.a.g.b.g(r13, r3, r2)
            java.math.BigInteger r4 = r2.mod(r14)
            java.math.BigInteger r5 = g
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            goto L_0x0236
        L_0x001d:
            java.math.BigInteger r4 = r2.multiply(r2)
            int r4 = r4.compareTo(r15)
            if (r4 >= 0) goto L_0x0029
            goto L_0x0236
        L_0x0029:
            int r4 = r2.bitLength()
            s0.a.b.k0.j1 r5 = r12.h
            int r5 = r5.d
            r6 = 4
            r7 = 100
            r8 = 1536(0x600, float:2.152E-42)
            r9 = 2
            r10 = 5
            if (r4 < r8) goto L_0x0049
            if (r5 > r7) goto L_0x003e
            r6 = 3
            goto L_0x0079
        L_0x003e:
            r4 = 128(0x80, float:1.794E-43)
            if (r5 > r4) goto L_0x0043
            goto L_0x0079
        L_0x0043:
            int r5 = r5 + -128
            int r5 = r5 + r3
            int r5 = r5 / r9
            int r6 = r6 + r5
            goto L_0x0079
        L_0x0049:
            r8 = 1024(0x400, float:1.435E-42)
            if (r4 < r8) goto L_0x005c
            if (r5 > r7) goto L_0x0050
            goto L_0x0079
        L_0x0050:
            r4 = 112(0x70, float:1.57E-43)
            if (r5 > r4) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            int r5 = r5 + -112
            int r5 = r5 + r3
            int r5 = r5 / r9
            int r6 = r5 + 5
            goto L_0x0079
        L_0x005c:
            r6 = 512(0x200, float:7.175E-43)
            r8 = 80
            r11 = 7
            if (r4 < r6) goto L_0x006d
            if (r5 > r8) goto L_0x0067
        L_0x0065:
            r6 = r10
            goto L_0x0079
        L_0x0067:
            if (r5 > r7) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            int r5 = r5 + -100
            goto L_0x0075
        L_0x006d:
            r11 = 40
            if (r5 > r8) goto L_0x0073
        L_0x0071:
            r6 = r11
            goto L_0x0079
        L_0x0073:
            int r5 = r5 + -80
        L_0x0075:
            int r5 = r5 + r3
            int r5 = r5 / r9
            int r6 = r5 + r11
        L_0x0079:
            java.lang.String r4 = "candidate"
            s0.a.e.a.a(r2, r4)
            r5 = 223092870(0xd4c2086, float:6.29015E-31)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 2
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 3
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 5
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 7
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 11
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 13
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 17
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 19
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 23
            if (r5 != 0) goto L_0x00ac
            goto L_0x019c
        L_0x00ac:
            r5 = 58642669(0x37ed0ed, float:7.4883726E-37)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 29
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 31
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 37
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 41
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 43
            if (r5 != 0) goto L_0x00ca
            goto L_0x019c
        L_0x00ca:
            r5 = 600662303(0x23cd611f, float:2.2267277E-17)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 47
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 53
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 59
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 61
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 67
            if (r5 != 0) goto L_0x00e8
            goto L_0x019c
        L_0x00e8:
            r5 = 33984931(0x20691a3, float:9.886561E-38)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 71
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 73
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 79
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 83
            if (r5 != 0) goto L_0x0102
            goto L_0x019c
        L_0x0102:
            r5 = 89809099(0x55a60cb, float:1.0268089E-35)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 89
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 97
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 101
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 103
            if (r5 != 0) goto L_0x011c
            goto L_0x019c
        L_0x011c:
            r5 = 167375713(0x9f9f361, float:6.0173442E-33)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 107
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 109
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 113
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 127
            if (r5 != 0) goto L_0x0136
            goto L_0x019c
        L_0x0136:
            r5 = 371700317(0x1627b25d, float:1.3546434E-25)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 131
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 137
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 139
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 149
            if (r5 != 0) goto L_0x014f
            goto L_0x019c
        L_0x014f:
            r5 = 645328247(0x2676ed77, float:8.567022E-16)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 151
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 157
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 163
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 167
            if (r5 != 0) goto L_0x0168
            goto L_0x019c
        L_0x0168:
            r5 = 1070560157(0x3fcf739d, float:1.6207157)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 173
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 179
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 181
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 191
            if (r5 != 0) goto L_0x0181
            goto L_0x019c
        L_0x0181:
            r5 = 1596463769(0x5f281a99, float:1.2113162E19)
            long r7 = (long) r5
            int r5 = i0.d.a.a.a.c(r7, r2)
            int r7 = r5 % 193
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 197
            if (r7 == 0) goto L_0x019c
            int r7 = r5 % 199
            if (r7 == 0) goto L_0x019c
            int r5 = r5 % 211
            if (r5 != 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r5 = r1
            goto L_0x019d
        L_0x019c:
            r5 = r3
        L_0x019d:
            if (r5 != 0) goto L_0x0222
            s0.a.b.k0.j1 r5 = r12.h
            java.security.SecureRandom r5 = r5.a
            s0.a.e.a.a(r2, r4)
            if (r5 == 0) goto L_0x021a
            if (r6 < r3) goto L_0x0212
            int r4 = r2.bitLength()
            if (r4 != r9) goto L_0x01b1
            goto L_0x020d
        L_0x01b1:
            boolean r4 = r2.testBit(r1)
            if (r4 != 0) goto L_0x01b8
            goto L_0x0207
        L_0x01b8:
            java.math.BigInteger r4 = s0.a.e.a.a
            java.math.BigInteger r4 = r2.subtract(r4)
            java.math.BigInteger r7 = s0.a.e.a.b
            java.math.BigInteger r7 = r2.subtract(r7)
            int r8 = r4.getLowestSetBit()
            java.math.BigInteger r9 = r4.shiftRight(r8)
        L_0x01cc:
            if (r1 >= r6) goto L_0x020d
            java.math.BigInteger r10 = s0.a.e.a.b
            java.math.BigInteger r10 = s0.a.g.b.f(r10, r7, r5)
            java.math.BigInteger r10 = r10.modPow(r9, r2)
            java.math.BigInteger r11 = s0.a.e.a.a
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L_0x0204
            boolean r11 = r10.equals(r4)
            if (r11 == 0) goto L_0x01e7
            goto L_0x0204
        L_0x01e7:
            if (r3 >= r8) goto L_0x0202
            java.math.BigInteger r11 = s0.a.e.a.b
            java.math.BigInteger r10 = r10.modPow(r11, r2)
            boolean r11 = r10.equals(r4)
            if (r11 == 0) goto L_0x01f6
            goto L_0x0204
        L_0x01f6:
            java.math.BigInteger r11 = s0.a.e.a.a
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x01ff
            goto L_0x0202
        L_0x01ff:
            int r3 = r3 + 1
            goto L_0x01e7
        L_0x0202:
            r3 = 0
            goto L_0x0205
        L_0x0204:
            r3 = 1
        L_0x0205:
            if (r3 != 0) goto L_0x0209
        L_0x0207:
            r1 = 0
            goto L_0x020e
        L_0x0209:
            int r1 = r1 + 1
            r3 = 1
            goto L_0x01cc
        L_0x020d:
            r1 = 1
        L_0x020e:
            if (r1 == 0) goto L_0x0222
            r1 = 1
            goto L_0x0223
        L_0x0212:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "'iterations' must be > 0"
            r13.<init>(r14)
            throw r13
        L_0x021a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "'random' cannot be null"
            r13.<init>(r14)
            throw r13
        L_0x0222:
            r1 = 0
        L_0x0223:
            if (r1 != 0) goto L_0x0226
            goto L_0x0236
        L_0x0226:
            java.math.BigInteger r1 = g
            java.math.BigInteger r3 = r2.subtract(r1)
            java.math.BigInteger r3 = r14.gcd(r3)
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x023b
        L_0x0236:
            int r0 = r0 + 1
            r1 = 0
            goto L_0x0002
        L_0x023b:
            return r2
        L_0x023c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unable to generate prime number for RSA key"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.f0.x.c(int, java.math.BigInteger, java.math.BigInteger):java.math.BigInteger");
    }
}
