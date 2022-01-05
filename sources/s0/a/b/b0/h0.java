package s0.a.b.b0;

import com.instabug.library.settings.SettingsManager;
import com.pubnub.api.builder.PubNubErrorBuilder;
import h0.v.a.k;
import java.util.Arrays;
import s0.a.b.o;
import s0.a.g.f;

public final class h0 implements o, f {
    public static final int[] a = {24, 35, 198, 232, PubNubErrorBuilder.PNERR_CRYPTO_ERROR, 184, 1, 79, 54, PubNubErrorBuilder.PNERR_PAGINATION_PREV_OUT_OF_BOUNDS, 210, 245, 121, 111, PubNubErrorBuilder.PNERR_TIMETOKEN_MISSING, 82, 96, 188, 155, PubNubErrorBuilder.PNERR_MESSAGE_MISSING, PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS, 12, 123, 53, 29, 224, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TYPE_MISSING, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, PubNubErrorBuilder.PNERR_CONNECTION_NOT_SET, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, PubNubErrorBuilder.PNERR_PUBLISH_KEY_MISSING, PubNubErrorBuilder.PNERR_PAYLOAD_TOO_LARGE, 125, PubNubErrorBuilder.PNERR_USER_NAME_MISSING, 216, 251, 238, 124, 102, 221, 23, 71, PubNubErrorBuilder.PNERR_MESSAGE_ACTION_MISSING, 202, 45, 191, 7, 173, 90, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, PubNubErrorBuilder.PNERR_GROUP_MISSING, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, PubNubErrorBuilder.PNERR_DEVICE_ID_MISSING, 95, 32, 104, 26, 174, SettingsManager.MAX_ASR_DURATION_IN_SECONDS, 84, PubNubErrorBuilder.PNERR_UUID_MISSING, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, PubNubErrorBuilder.PNERR_MESSAGE_TIMETOKEN_MISSING, PubNubErrorBuilder.PNERR_CHANNEL_AND_GROUP_MISSING, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING, 234, 101, 186, 47, 192, 222, 28, 253, 77, PubNubErrorBuilder.PNERR_CHANNELS_TIMETOKEN_MISMATCH, 117, 6, PubNubErrorBuilder.PNERR_SUBSCRIBE_KEY_MISSING, 178, 230, 14, 31, 98, 212, 168, PubNubErrorBuilder.PNERR_SPACE_MISSING, 249, 197, 37, 89, PubNubErrorBuilder.PNERR_CHANNEL_MISSING, 114, 57, 76, 94, 120, 56, PubNubErrorBuilder.PNERR_STATE_MISSING, 209, PubNubErrorBuilder.PNERR_PAGINATION_NEXT_OUT_OF_BOUNDS, 226, 97, 179, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, k.d.DEFAULT_SWIPE_ANIMATION_DURATION, 223, 126, 36, 59, 171, 206, 17, PubNubErrorBuilder.PNERR_PUSH_TYPE_MISSING, 78, 183, 235, 60, 129, PubNubErrorBuilder.PNERR_USER_ID_MISSING, 247, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, PubNubErrorBuilder.PNERR_AUTH_KEYS_MISSING, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, PubNubErrorBuilder.PNERR_PUSH_TOPIC_MISSING, 40, 92, 248, 134};
    public static final long[] b = new long[256];
    public static final long[] c = new long[256];
    public static final long[] d = new long[256];
    public static final long[] e = new long[256];
    public static final long[] f = new long[256];
    public static final long[] g = new long[256];
    public static final long[] h = new long[256];
    public static final long[] i = new long[256];
    public static final short[] j;
    public final long[] k = new long[11];
    public byte[] l = new byte[64];
    public int m = 0;
    public short[] n = new short[32];
    public long[] o = new long[8];
    public long[] p = new long[8];
    public long[] q = new long[8];
    public long[] r = new long[8];
    public long[] s = new long[8];

    static {
        short[] sArr = new short[32];
        j = sArr;
        sArr[31] = 8;
    }

    public h0() {
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = a[i2];
            int d2 = d(i3 << 1);
            int d3 = d(d2 << 1);
            int i4 = d3 ^ i3;
            int d4 = d(d3 << 1);
            int i5 = d4 ^ i3;
            int i6 = i3;
            b[i2] = e(i3, i6, d3, i3, d4, i4, d2, i5);
            int i7 = i3;
            c[i2] = e(i5, i6, i7, d3, i3, d4, i4, d2);
            int i8 = i3;
            d[i2] = e(d2, i5, i7, i8, d3, i3, d4, i4);
            int i9 = i3;
            e[i2] = e(i4, d2, i5, i8, i9, d3, i3, d4);
            int i10 = i3;
            f[i2] = e(d4, i4, d2, i5, i9, i10, d3, i3);
            int i11 = i3;
            g[i2] = e(i3, d4, i4, d2, i5, i10, i11, d3);
            int i12 = i3;
            h[i2] = e(d3, i3, d4, i4, d2, i5, i11, i12);
            i[i2] = e(i3, d3, i3, d4, i4, d2, i5, i12);
        }
        this.k[0] = 0;
        for (int i13 = 1; i13 <= 10; i13++) {
            int i14 = (i13 - 1) * 8;
            this.k[i13] = (((((((b[i14] & -72057594037927936L) ^ (c[i14 + 1] & 71776119061217280L)) ^ (d[i14 + 2] & 280375465082880L)) ^ (e[i14 + 3] & 1095216660480L)) ^ (f[i14 + 4] & 4278190080L)) ^ (g[i14 + 5] & 16711680)) ^ (h[i14 + 6] & 65280)) ^ (i[i14 + 7] & 255);
        }
    }

    public h0(h0 h0Var) {
        c(h0Var);
    }

    public f a() {
        return new h0(this);
    }

    public void c(f fVar) {
        h0 h0Var = (h0) fVar;
        long[] jArr = h0Var.k;
        long[] jArr2 = this.k;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = h0Var.l;
        byte[] bArr2 = this.l;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.m = h0Var.m;
        short[] sArr = h0Var.n;
        short[] sArr2 = this.n;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = h0Var.o;
        long[] jArr4 = this.o;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = h0Var.p;
        long[] jArr6 = this.p;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = h0Var.q;
        long[] jArr8 = this.q;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = h0Var.r;
        long[] jArr10 = this.r;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = h0Var.s;
        long[] jArr12 = this.s;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    public final int d(int i2) {
        return ((long) i2) >= 256 ? i2 ^ 285 : i2;
    }

    public int doFinal(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[32];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr2[i3] = (byte) (this.n[i3] & 255);
        }
        byte[] bArr3 = this.l;
        int i4 = this.m;
        int i5 = i4 + 1;
        this.m = i5;
        bArr3[i4] = (byte) (bArr3[i4] | 128);
        if (i5 == bArr3.length) {
            f();
        }
        if (this.m > 32) {
            while (this.m != 0) {
                update((byte) 0);
            }
        }
        while (this.m <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArr2, 0, this.l, 32, 32);
        f();
        for (int i6 = 0; i6 < 8; i6++) {
            long j2 = this.o[i6];
            int i7 = (i6 * 8) + i2;
            for (int i8 = 0; i8 < 8; i8++) {
                bArr[i7 + i8] = (byte) ((int) ((j2 >> (56 - (i8 * 8))) & 255));
            }
        }
        reset();
        return 64;
    }

    public final long e(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return (((((((((long) i3) << 48) ^ (((long) i2) << 56)) ^ (((long) i4) << 40)) ^ (((long) i5) << 32)) ^ (((long) i6) << 24)) ^ (((long) i7) << 16)) ^ (((long) i8) << 8)) ^ ((long) i9);
    }

    public final void f() {
        int i2;
        long[] jArr;
        int i3 = 0;
        while (true) {
            i2 = 8;
            if (i3 >= this.s.length) {
                break;
            }
            long[] jArr2 = this.r;
            byte[] bArr = this.l;
            int i4 = i3 * 8;
            int i5 = i3;
            jArr2[i5] = ((((long) bArr[i4 + 1]) & 255) << 48) | ((((long) bArr[i4 + 0]) & 255) << 56) | ((((long) bArr[i4 + 2]) & 255) << 40) | ((((long) bArr[i4 + 3]) & 255) << 32) | ((((long) bArr[i4 + 4]) & 255) << 24) | ((((long) bArr[i4 + 5]) & 255) << 16) | ((((long) bArr[i4 + 6]) & 255) << 8) | (((long) bArr[i4 + 7]) & 255);
            i3 = i5 + 1;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            long[] jArr3 = this.s;
            long j2 = this.r[i6];
            long[] jArr4 = this.p;
            long j3 = this.o[i6];
            jArr4[i6] = j3;
            jArr3[i6] = j2 ^ j3;
        }
        int i7 = 1;
        while (i7 <= 10) {
            int i8 = 0;
            while (i8 < i2) {
                long[] jArr5 = this.q;
                jArr5[i8] = 0;
                long j4 = jArr5[i8];
                long[] jArr6 = b;
                long[] jArr7 = this.p;
                jArr5[i8] = jArr6[((int) (jArr7[(i8 + 0) & 7] >>> 56)) & 255] ^ j4;
                jArr5[i8] = jArr5[i8] ^ c[((int) (jArr7[(i8 - 1) & 7] >>> 48)) & 255];
                jArr5[i8] = jArr5[i8] ^ d[((int) (jArr7[(i8 - 2) & 7] >>> 40)) & 255];
                jArr5[i8] = jArr5[i8] ^ e[((int) (jArr7[(i8 - 3) & 7] >>> 32)) & 255];
                jArr5[i8] = jArr5[i8] ^ f[((int) (jArr7[(i8 - 4) & 7] >>> 24)) & 255];
                jArr5[i8] = jArr5[i8] ^ g[((int) (jArr7[(i8 - 5) & 7] >>> 16)) & 255];
                jArr5[i8] = jArr5[i8] ^ h[((int) (jArr7[(i8 - 6) & 7] >>> 8)) & 255];
                jArr5[i8] = jArr5[i8] ^ i[((int) jArr7[(i8 - 7) & 7]) & 255];
                i8++;
                i2 = 8;
            }
            long[] jArr8 = this.q;
            long[] jArr9 = this.p;
            System.arraycopy(jArr8, 0, jArr9, 0, jArr9.length);
            long[] jArr10 = this.p;
            jArr10[0] = jArr10[0] ^ this.k[i7];
            int i9 = 0;
            while (true) {
                jArr = this.q;
                if (i9 >= 8) {
                    break;
                }
                jArr[i9] = this.p[i9];
                long j5 = jArr[i9];
                long[] jArr11 = b;
                long[] jArr12 = this.s;
                jArr[i9] = j5 ^ jArr11[((int) (jArr12[(i9 + 0) & 7] >>> 56)) & 255];
                jArr[i9] = jArr[i9] ^ c[((int) (jArr12[(i9 - 1) & 7] >>> 48)) & 255];
                jArr[i9] = jArr[i9] ^ d[((int) (jArr12[(i9 - 2) & 7] >>> 40)) & 255];
                jArr[i9] = jArr[i9] ^ e[((int) (jArr12[(i9 - 3) & 7] >>> 32)) & 255];
                jArr[i9] = jArr[i9] ^ f[((int) (jArr12[(i9 - 4) & 7] >>> 24)) & 255];
                jArr[i9] = jArr[i9] ^ g[((int) (jArr12[(i9 - 5) & 7] >>> 16)) & 255];
                jArr[i9] = jArr[i9] ^ h[((int) (jArr12[(i9 - 6) & 7] >>> 8)) & 255];
                jArr[i9] = jArr[i9] ^ i[((int) jArr12[(i9 - 7) & 7]) & 255];
                i9++;
            }
            long[] jArr13 = this.s;
            System.arraycopy(jArr, 0, jArr13, 0, jArr13.length);
            i7++;
            i2 = 8;
        }
        int i10 = i2;
        for (int i11 = 0; i11 < i10; i11++) {
            long[] jArr14 = this.o;
            jArr14[i11] = jArr14[i11] ^ (this.s[i11] ^ this.r[i11]);
        }
        this.m = 0;
        Arrays.fill(this.l, (byte) 0);
    }

    public String getAlgorithmName() {
        return "Whirlpool";
    }

    public int getByteLength() {
        return 64;
    }

    public int getDigestSize() {
        return 64;
    }

    public void reset() {
        this.m = 0;
        Arrays.fill(this.n, 0);
        Arrays.fill(this.l, (byte) 0);
        Arrays.fill(this.o, 0);
        Arrays.fill(this.p, 0);
        Arrays.fill(this.q, 0);
        Arrays.fill(this.r, 0);
        Arrays.fill(this.s, 0);
    }

    public void update(byte b2) {
        byte[] bArr = this.l;
        int i2 = this.m;
        bArr[i2] = b2;
        int i3 = i2 + 1;
        this.m = i3;
        if (i3 == bArr.length) {
            f();
        }
        int i4 = 0;
        for (int length = this.n.length - 1; length >= 0; length--) {
            short[] sArr = this.n;
            int i5 = (sArr[length] & 255) + j[length] + i4;
            i4 = i5 >>> 8;
            sArr[length] = (short) (i5 & 255);
        }
    }

    public void update(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
