package s0.a.b.b0;

import s0.a.b.o;
import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public abstract class m implements o, f {
    public static final long[] a = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public byte[] b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long[] n;
    public int o;

    public m() {
        this.b = new byte[8];
        this.n = new long[80];
        this.c = 0;
        reset();
    }

    public m(m mVar) {
        this.b = new byte[8];
        this.n = new long[80];
        i(mVar);
    }

    public final long d(long j2, long j3, long j4) {
        return ((~j2) & j4) ^ (j3 & j2);
    }

    public final long e(long j2, long j3, long j4) {
        return ((j2 & j4) ^ (j2 & j3)) ^ (j3 & j4);
    }

    public final long f(long j2) {
        return ((j2 >>> 39) | (j2 << 25)) ^ (((j2 << 36) | (j2 >>> 28)) ^ ((j2 << 30) | (j2 >>> 34)));
    }

    public final long g(long j2) {
        return ((j2 >>> 41) | (j2 << 23)) ^ (((j2 << 50) | (j2 >>> 14)) ^ ((j2 << 46) | (j2 >>> 18)));
    }

    public int getByteLength() {
        return 128;
    }

    public final void h() {
        long j2 = this.d;
        if (j2 > 2305843009213693951L) {
            this.e += j2 >>> 61;
            this.d = j2 & 2305843009213693951L;
        }
    }

    public void i(m mVar) {
        byte[] bArr = mVar.b;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        this.c = mVar.c;
        this.d = mVar.d;
        this.e = mVar.e;
        this.f = mVar.f;
        this.g = mVar.g;
        this.h = mVar.h;
        this.i = mVar.i;
        this.j = mVar.j;
        this.k = mVar.k;
        this.l = mVar.l;
        this.m = mVar.m;
        long[] jArr = mVar.n;
        System.arraycopy(jArr, 0, this.n, 0, jArr.length);
        this.o = mVar.o;
    }

    public void j() {
        h();
        long j2 = this.d << 3;
        long j3 = this.e;
        byte b2 = Byte.MIN_VALUE;
        while (true) {
            update(b2);
            if (this.c == 0) {
                break;
            }
            b2 = 0;
        }
        if (this.o > 14) {
            k();
        }
        long[] jArr = this.n;
        jArr[14] = j3;
        jArr[15] = j2;
        k();
    }

    public void k() {
        h();
        for (int i2 = 16; i2 <= 79; i2++) {
            long[] jArr = this.n;
            long j2 = jArr[i2 - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i2 - 7];
            long j4 = jArr[i2 - 15];
            jArr[i2] = j3 + ((j4 >>> 7) ^ (((j4 << 63) | (j4 >>> 1)) ^ ((j4 << 56) | (j4 >>> 8)))) + jArr[i2 - 16];
        }
        long j5 = this.f;
        long j6 = this.g;
        long j7 = this.h;
        long j8 = this.i;
        long j9 = this.j;
        long j10 = this.k;
        long j11 = this.l;
        long j12 = j10;
        long j13 = j8;
        int i3 = 0;
        long j14 = j6;
        long j15 = j7;
        long j16 = j9;
        int i4 = 0;
        long j17 = this.m;
        long j18 = j11;
        long j19 = j5;
        long j20 = j18;
        while (i4 < 10) {
            int i5 = i4;
            long j21 = j16;
            long[] jArr2 = a;
            int i6 = i3 + 1;
            long g2 = g(j16) + d(j16, j12, j20) + jArr2[i3] + this.n[i3] + j17;
            long j22 = j13 + g2;
            long f2 = f(j19) + e(j19, j14, j15) + g2;
            long j23 = j22;
            long j24 = f2;
            int i7 = i6 + 1;
            long g3 = g(j22) + d(j22, j21, j12) + jArr2[i6] + this.n[i6] + j20;
            long j25 = j19;
            long j26 = j19;
            long j27 = j15 + g3;
            long f3 = f(j24) + e(j24, j25, j14) + g3;
            long g4 = g(j27);
            long j28 = j27;
            long j29 = f3;
            int i8 = i7 + 1;
            long d2 = g4 + d(j27, j23, j21) + jArr2[i7] + this.n[i7] + j12;
            long j30 = j14 + d2;
            long j31 = j30;
            long f4 = f(j29) + e(j29, j24, j26) + d2;
            int i9 = i8 + 1;
            long g5 = g(j30) + d(j30, j28, j23) + jArr2[i8] + this.n[i8] + j21;
            long j32 = j29;
            long j33 = j29;
            long j34 = j26 + g5;
            long f5 = f(f4) + e(f4, j32, j24) + g5;
            long g6 = g(j34);
            long j35 = j34;
            long j36 = f5;
            int i10 = i9 + 1;
            long d3 = g6 + d(j34, j31, j28) + jArr2[i9] + this.n[i9] + j23;
            long j37 = j24 + d3;
            long f6 = f(j36) + e(j36, f4, j33) + d3;
            int i11 = i10 + 1;
            long g7 = g(j37) + d(j37, j35, j31) + jArr2[i10] + this.n[i10] + j28;
            long j38 = j36;
            long j39 = j36;
            long j40 = j33 + g7;
            long f7 = f(f6) + e(f6, j38, f4) + g7;
            long j41 = j37;
            long j42 = j37;
            long j43 = f7;
            int i12 = i11 + 1;
            long g8 = g(j40) + d(j40, j41, j35) + jArr2[i11] + this.n[i11] + j31;
            long j44 = f4 + g8;
            long j45 = j40;
            long j46 = j40;
            long f8 = f(j43) + e(j43, f6, j39) + g8;
            long g9 = g(j44) + d(j44, j45, j42) + jArr2[i12] + this.n[i12] + j35;
            long j47 = j39 + g9;
            long f9 = f(f8) + e(f8, j43, f6) + g9;
            i4 = i5 + 1;
            j15 = j43;
            i3 = i12 + 1;
            j16 = j47;
            long j48 = j42;
            j20 = j46;
            j12 = j44;
            j13 = f6;
            j17 = j48;
            j14 = f8;
            j19 = f9;
        }
        this.f += j19;
        this.g += j14;
        this.h += j15;
        this.i += j13;
        this.j += j16;
        this.k += j12;
        this.l += j20;
        this.m += j17;
        this.o = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            this.n[i13] = 0;
        }
    }

    public void l(byte[] bArr, int i2) {
        this.n[this.o] = h3.z(bArr, i2);
        int i3 = this.o + 1;
        this.o = i3;
        if (i3 == 16) {
            k();
        }
    }

    public void reset() {
        this.d = 0;
        this.e = 0;
        int i2 = 0;
        this.c = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = 0;
            i3++;
        }
        this.o = 0;
        while (true) {
            long[] jArr = this.n;
            if (i2 != jArr.length) {
                jArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }

    public void update(byte b2) {
        byte[] bArr = this.b;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = b2;
        if (i3 == bArr.length) {
            l(bArr, 0);
            this.c = 0;
        }
        this.d++;
    }

    public void update(byte[] bArr, int i2, int i3) {
        while (this.c != 0 && i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
        while (i3 > this.b.length) {
            l(bArr, i2);
            byte[] bArr2 = this.b;
            i2 += bArr2.length;
            i3 -= bArr2.length;
            this.d += (long) bArr2.length;
        }
        while (i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
