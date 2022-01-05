package s0.a.b.b0;

import i0.d.a.a.a;
import s0.a.g.f;

public class p extends h {
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h = new int[16];
    public int i;

    public p() {
        reset();
    }

    public p(p pVar) {
        super(pVar);
        l(pVar);
    }

    public f a() {
        return new p(this);
    }

    public void c(f fVar) {
        l((p) fVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        n(this.d, bArr, i2);
        n(this.e, bArr, i2 + 4);
        n(this.f, bArr, i2 + 8);
        n(this.g, bArr, i2 + 12);
        reset();
        return 16;
    }

    public void f() {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int t02 = a.t0(i2 + i(i3, i4, i5), this.h[0], -680876936, this, 7, i3);
        int t03 = a.t0(i(t02, i3, i4) + i5, this.h[1], -389564586, this, 12, t02);
        int t04 = a.t0(i(t03, t02, i3) + i4, this.h[2], 606105819, this, 17, t03);
        int t05 = a.t0(i(t04, t03, t02) + i3, this.h[3], -1044525330, this, 22, t04);
        int i6 = t05;
        int t06 = a.t0(i(t05, t04, t03) + t02, this.h[4], -176418897, this, 7, t05);
        int i7 = t06;
        int t07 = a.t0(i(t06, i6, t04) + t03, this.h[5], 1200080426, this, 12, t06);
        int i8 = i7;
        int i9 = i8;
        int i10 = t07;
        int t08 = a.t0(i(t07, i8, i6) + t04, this.h[6], -1473231341, this, 17, t07);
        int i11 = i10;
        int i12 = i11;
        int i13 = t08;
        int t09 = a.t0(i(t08, i11, i9) + i6, this.h[7], -45705983, this, 22, t08);
        int i14 = i13;
        int i15 = i14;
        int i16 = t09;
        int t010 = a.t0(i(t09, i14, i12) + i9, this.h[8], 1770035416, this, 7, t09);
        int i17 = i16;
        int i18 = i17;
        int i19 = t010;
        int t011 = a.t0(i(t010, i17, i15) + i12, this.h[9], -1958414417, this, 12, t010);
        int i20 = i19;
        int i21 = i20;
        int i22 = t011;
        int t012 = a.t0(i(t011, i20, i18) + i15, this.h[10], -42063, this, 17, t011);
        int i23 = i22;
        int i24 = i23;
        int i25 = t012;
        int t013 = a.t0(i(t012, i23, i21) + i18, this.h[11], -1990404162, this, 22, t012);
        int i26 = i25;
        int i27 = i26;
        int i28 = t013;
        int t014 = a.t0(i(t013, i26, i24) + i21, this.h[12], 1804603682, this, 7, t013);
        int i29 = i28;
        int i30 = i29;
        int i31 = t014;
        int t015 = a.t0(i(t014, i29, i27) + i24, this.h[13], -40341101, this, 12, t014);
        int i32 = t015;
        int t016 = a.t0(i(t015, i31, i30) + i27, this.h[14], -1502002290, this, 17, t015);
        int i33 = t016;
        int t017 = a.t0(i(t016, i32, i31) + i30, this.h[15], 1236535329, this, 22, t016);
        int i34 = t017;
        int t018 = a.t0(j(t017, i33, i32) + i31, this.h[1], -165796510, this, 5, t017);
        int i35 = t018;
        int t019 = a.t0(j(t018, i34, i33) + i32, this.h[6], -1069501632, this, 9, t018);
        int i36 = t019;
        int t020 = a.t0(j(t019, i35, i34) + i33, this.h[11], 643717713, this, 14, t019);
        int i37 = t020;
        int t021 = a.t0(j(t020, i36, i35) + i34, this.h[0], -373897302, this, 20, t020);
        int i38 = i37;
        int i39 = i38;
        int i40 = t021;
        int t022 = a.t0(j(t021, i38, i36) + i35, this.h[5], -701558691, this, 5, t021);
        int i41 = i40;
        int i42 = i41;
        int i43 = t022;
        int t023 = a.t0(j(t022, i41, i39) + i36, this.h[10], 38016083, this, 9, t022);
        int i44 = t023;
        int t024 = a.t0(j(t023, i43, i42) + i39, this.h[15], -660478335, this, 14, t023);
        int i45 = t024;
        int t025 = a.t0(j(t024, i44, i43) + i42, this.h[4], -405537848, this, 20, t024);
        int i46 = t025;
        int t026 = a.t0(j(t025, i45, i44) + i43, this.h[9], 568446438, this, 5, t025);
        int i47 = t026;
        int t027 = a.t0(j(t026, i46, i45) + i44, this.h[14], -1019803690, this, 9, t026);
        int i48 = t027;
        int t028 = a.t0(j(t027, i47, i46) + i45, this.h[3], -187363961, this, 14, t027);
        int i49 = t028;
        int t029 = a.t0(j(t028, i48, i47) + i46, this.h[8], 1163531501, this, 20, t028);
        int i50 = t029;
        int t030 = a.t0(j(t029, i49, i48) + i47, this.h[13], -1444681467, this, 5, t029);
        int i51 = t030;
        int t031 = a.t0(j(t030, i50, i49) + i48, this.h[2], -51403784, this, 9, t030);
        int i52 = t031;
        int t032 = a.t0(j(t031, i51, i50) + i49, this.h[7], 1735328473, this, 14, t031);
        int i53 = t032;
        int t033 = a.t0(j(t032, i52, i51) + i50, this.h[12], -1926607734, this, 20, t032);
        int t034 = a.t0(((t033 ^ i53) ^ i52) + i51, this.h[5], -378558, this, 4, t033);
        int t035 = a.t0(((t034 ^ t033) ^ i53) + i52, this.h[8], -2022574463, this, 11, t034);
        int t036 = a.t0(((t035 ^ t034) ^ t033) + i53, this.h[11], 1839030562, this, 16, t035);
        int t037 = a.t0(((t036 ^ t035) ^ t034) + t033, this.h[14], -35309556, this, 23, t036);
        int t038 = a.t0(((t037 ^ t036) ^ t035) + t034, this.h[1], -1530992060, this, 4, t037);
        int t039 = a.t0(((t038 ^ t037) ^ t036) + t035, this.h[4], 1272893353, this, 11, t038);
        int t040 = a.t0(((t039 ^ t038) ^ t037) + t036, this.h[7], -155497632, this, 16, t039);
        int t041 = a.t0(t037 + ((t040 ^ t039) ^ t038), this.h[10], -1094730640, this, 23, t040);
        int t042 = a.t0(((t041 ^ t040) ^ t039) + t038, this.h[13], 681279174, this, 4, t041);
        int t043 = a.t0(((t042 ^ t041) ^ t040) + t039, this.h[0], -358537222, this, 11, t042);
        int t044 = a.t0(((t043 ^ t042) ^ t041) + t040, this.h[3], -722521979, this, 16, t043);
        int t045 = a.t0(((t044 ^ t043) ^ t042) + t041, this.h[6], 76029189, this, 23, t044);
        int t046 = a.t0(((t045 ^ t044) ^ t043) + t042, this.h[9], -640364487, this, 4, t045);
        int t047 = a.t0(((t046 ^ t045) ^ t044) + t043, this.h[12], -421815835, this, 11, t046);
        int t048 = a.t0(((t047 ^ t046) ^ t045) + t044, this.h[15], 530742520, this, 16, t047);
        int t049 = a.t0(((t048 ^ t047) ^ t046) + t045, this.h[2], -995338651, this, 23, t048);
        int t050 = a.t0(k(t049, t048, t047) + t046, this.h[0], -198630844, this, 6, t049);
        int t051 = a.t0(k(t050, t049, t048) + t047, this.h[7], 1126891415, this, 10, t050);
        int t052 = a.t0(k(t051, t050, t049) + t048, this.h[14], -1416354905, this, 15, t051);
        int t053 = a.t0(k(t052, t051, t050) + t049, this.h[5], -57434055, this, 21, t052);
        int t054 = a.t0(k(t053, t052, t051) + t050, this.h[12], 1700485571, this, 6, t053);
        int t055 = a.t0(k(t054, t053, t052) + t051, this.h[3], -1894986606, this, 10, t054);
        int t056 = a.t0(k(t055, t054, t053) + t052, this.h[10], -1051523, this, 15, t055);
        int t057 = a.t0(k(t056, t055, t054) + t053, this.h[1], -2054922799, this, 21, t056);
        int t058 = a.t0(k(t057, t056, t055) + t054, this.h[8], 1873313359, this, 6, t057);
        int t059 = a.t0(k(t058, t057, t056) + t055, this.h[15], -30611744, this, 10, t058);
        int t060 = a.t0(k(t059, t058, t057) + t056, this.h[6], -1560198380, this, 15, t059);
        int t061 = a.t0(k(t060, t059, t058) + t057, this.h[13], 1309151649, this, 21, t060);
        int t062 = a.t0(k(t061, t060, t059) + t058, this.h[4], -145523070, this, 6, t061);
        int t063 = a.t0(k(t062, t061, t060) + t059, this.h[11], -1120210379, this, 10, t062);
        int t064 = a.t0(k(t063, t062, t061) + t060, this.h[2], 718787259, this, 15, t063);
        int t065 = a.t0(k(t064, t063, t062) + t061, this.h[9], -343485551, this, 21, t064);
        this.d += t062;
        this.e += t065;
        this.f += t064;
        this.g += t063;
        this.i = 0;
        int i54 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i54 != iArr.length) {
                iArr[i54] = 0;
                i54++;
            } else {
                return;
            }
        }
    }

    public void g(long j) {
        if (this.i > 14) {
            f();
        }
        int[] iArr = this.h;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    public String getAlgorithmName() {
        return "MD5";
    }

    public int getDigestSize() {
        return 16;
    }

    public void h(byte[] bArr, int i2) {
        int[] iArr = this.h;
        int i3 = this.i;
        int i4 = i3 + 1;
        this.i = i4;
        iArr[i3] = ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        if (i4 == 16) {
            f();
        }
    }

    public final int i(int i2, int i3, int i4) {
        return ((~i2) & i4) | (i3 & i2);
    }

    public final int j(int i2, int i3, int i4) {
        return (i2 & i4) | (i3 & (~i4));
    }

    public final int k(int i2, int i3, int i4) {
        return (i2 | (~i4)) ^ i3;
    }

    public final void l(p pVar) {
        d(pVar);
        this.d = pVar.d;
        this.e = pVar.e;
        this.f = pVar.f;
        this.g = pVar.g;
        int[] iArr = pVar.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = pVar.i;
    }

    public final int m(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public final void n(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
