package s0.a.b.h0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class l implements s {
    public final e a;
    public final byte[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final byte[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public l() {
        this.b = new byte[1];
        this.p = new byte[16];
        this.q = 0;
        this.a = null;
    }

    public l(e eVar) {
        this.b = new byte[1];
        this.p = new byte[16];
        this.q = 0;
        if (eVar.b() == 16) {
            this.a = eVar;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }

    public static final long a(int i2, int i3) {
        return (((long) i2) & 4294967295L) * ((long) i3);
    }

    public final void b() {
        int i2 = this.q;
        if (i2 < 16) {
            this.p[i2] = 1;
            for (int i3 = i2 + 1; i3 < 16; i3++) {
                this.p[i3] = 0;
            }
        }
        long g2 = ((long) h3.g2(this.p, 0)) & 4294967295L;
        long g22 = ((long) h3.g2(this.p, 4)) & 4294967295L;
        long g23 = ((long) h3.g2(this.p, 8)) & 4294967295L;
        long g24 = 4294967295L & ((long) h3.g2(this.p, 12));
        int i4 = (int) (((long) this.r) + (g2 & 67108863));
        this.r = i4;
        this.s = (int) (((long) this.s) + ((((g22 << 32) | g2) >>> 26) & 67108863));
        this.t = (int) (((long) this.t) + (((g22 | (g23 << 32)) >>> 20) & 67108863));
        this.u = (int) (((long) this.u) + ((((g24 << 32) | g23) >>> 14) & 67108863));
        int i5 = (int) (((long) this.v) + (g24 >>> 8));
        this.v = i5;
        if (this.q == 16) {
            this.v = i5 + 16777216;
        }
        long a2 = a(this.v, this.h) + a(this.u, this.i) + a(this.t, this.j) + a(this.s, this.k) + a(i4, this.c);
        long a3 = a(this.v, this.i) + a(this.u, this.j) + a(this.t, this.k) + a(this.s, this.c) + a(this.r, this.d);
        long a4 = a(this.v, this.j) + a(this.u, this.k) + a(this.t, this.c) + a(this.s, this.d) + a(this.r, this.e);
        long a5 = a(this.v, this.k) + a(this.u, this.c) + a(this.t, this.d) + a(this.s, this.e) + a(this.r, this.f);
        long a6 = a(this.v, this.c) + a(this.u, this.d) + a(this.t, this.e) + a(this.s, this.f) + a(this.r, this.g);
        int i6 = ((int) a2) & 67108863;
        this.r = i6;
        long j2 = a3 + (a2 >>> 26);
        int i7 = ((int) j2) & 67108863;
        this.s = i7;
        long j3 = a4 + (j2 >>> 26);
        this.t = ((int) j3) & 67108863;
        long j4 = a5 + (j3 >>> 26);
        this.u = ((int) j4) & 67108863;
        long j5 = a6 + (j4 >>> 26);
        this.v = ((int) j5) & 67108863;
        int i8 = (((int) (j5 >>> 26)) * 5) + i6;
        this.r = i8;
        this.s = i7 + (i8 >>> 26);
        this.r = i8 & 67108863;
    }

    public int doFinal(byte[] bArr, int i2) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = bArr;
        int i3 = i2;
        if (i3 + 16 <= bArr2.length) {
            if (this.q > 0) {
                b();
            }
            int i4 = this.s;
            int i5 = this.r;
            int i6 = i4 + (i5 >>> 26);
            this.s = i6;
            int i7 = i5 & 67108863;
            this.r = i7;
            int i8 = this.t + (i6 >>> 26);
            this.t = i8;
            int i9 = i6 & 67108863;
            this.s = i9;
            int i10 = this.u + (i8 >>> 26);
            this.u = i10;
            int i11 = i8 & 67108863;
            this.t = i11;
            int i12 = this.v + (i10 >>> 26);
            this.v = i12;
            int i13 = i10 & 67108863;
            this.u = i13;
            int i14 = ((i12 >>> 26) * 5) + i7;
            this.r = i14;
            int i15 = i12 & 67108863;
            this.v = i15;
            int i16 = i9 + (i14 >>> 26);
            this.s = i16;
            int i17 = i14 & 67108863;
            this.r = i17;
            int i18 = i17 + 5;
            int i19 = (i18 >>> 26) + i16;
            int i20 = (i19 >>> 26) + i11;
            int i21 = (i20 >>> 26) + i13;
            int i22 = 67108863 & i21;
            int i23 = ((i21 >>> 26) + i15) - 67108864;
            int i24 = (i23 >>> 31) - 1;
            int i25 = ~i24;
            int i26 = (i17 & i25) | (i18 & 67108863 & i24);
            this.r = i26;
            int i27 = (i16 & i25) | (i19 & 67108863 & i24);
            this.s = i27;
            int i28 = (i11 & i25) | (i20 & 67108863 & i24);
            this.t = i28;
            int i29 = (i22 & i24) | (i13 & i25);
            this.u = i29;
            int i30 = (i15 & i25) | (i23 & i24);
            this.v = i30;
            long j2 = (((long) ((i27 << 26) | i26)) & 4294967295L) + (((long) this.l) & 4294967295L);
            long j3 = (((long) ((i28 >>> 12) | (i29 << 14))) & 4294967295L) + (((long) this.n) & 4294967295L);
            long j4 = (((long) ((i29 >>> 18) | (i30 << 8))) & 4294967295L) + (((long) this.o) & 4294967295L);
            h3.D1((int) j2, bArr2, i3);
            long j5 = (((long) ((i27 >>> 6) | (i28 << 20))) & 4294967295L) + (((long) this.m) & 4294967295L) + (j2 >>> 32);
            h3.D1((int) j5, bArr2, i3 + 4);
            long j6 = j3 + (j5 >>> 32);
            h3.D1((int) j6, bArr2, i3 + 8);
            h3.D1((int) (j4 + (j6 >>> 32)), bArr2, i3 + 12);
            reset();
            return 16;
        }
        throw new OutputLengthException("Output buffer is too short.");
    }

    public String getAlgorithmName() {
        if (this.a == null) {
            return "Poly1305";
        }
        StringBuilder P0 = a.P0("Poly1305-");
        P0.append(this.a.getAlgorithmName());
        return P0.toString();
    }

    public int getMacSize() {
        return 16;
    }

    public void init(i iVar) throws IllegalArgumentException {
        byte[] bArr;
        e eVar = this.a;
        if (eVar == null) {
            bArr = null;
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            bArr = c1Var.c;
            iVar = c1Var.d;
        } else {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        }
        if (iVar instanceof y0) {
            byte[] bArr2 = ((y0) iVar).c;
            if (bArr2.length == 32) {
                int i2 = 16;
                if (eVar == null || (bArr != null && bArr.length == 16)) {
                    int g2 = h3.g2(bArr2, 0);
                    int g22 = h3.g2(bArr2, 4);
                    int g23 = h3.g2(bArr2, 8);
                    int g24 = h3.g2(bArr2, 12);
                    this.c = 67108863 & g2;
                    int i3 = ((g2 >>> 26) | (g22 << 6)) & 67108611;
                    this.d = i3;
                    int i4 = ((g22 >>> 20) | (g23 << 12)) & 67092735;
                    this.e = i4;
                    int i5 = ((g23 >>> 14) | (g24 << 18)) & 66076671;
                    this.f = i5;
                    int i6 = (g24 >>> 8) & 1048575;
                    this.g = i6;
                    this.h = i3 * 5;
                    this.i = i4 * 5;
                    this.j = i5 * 5;
                    this.k = i6 * 5;
                    e eVar2 = this.a;
                    if (eVar2 != null) {
                        byte[] bArr3 = new byte[16];
                        eVar2.init(true, new y0(bArr2, 16, 16));
                        this.a.a(bArr, 0, bArr3, 0);
                        i2 = 0;
                        bArr2 = bArr3;
                    }
                    this.l = h3.g2(bArr2, i2 + 0);
                    this.m = h3.g2(bArr2, i2 + 4);
                    this.n = h3.g2(bArr2, i2 + 8);
                    this.o = h3.g2(bArr2, i2 + 12);
                    reset();
                    return;
                }
                throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
            }
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    public void reset() {
        this.q = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        this.s = 0;
        this.r = 0;
    }

    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.b;
        bArr[0] = b2;
        update(bArr, 0, 1);
    }

    public void update(byte[] bArr, int i2, int i3) throws DataLengthException, IllegalStateException {
        int i4 = 0;
        while (i3 > i4) {
            if (this.q == 16) {
                b();
                this.q = 0;
            }
            int min = Math.min(i3 - i4, 16 - this.q);
            System.arraycopy(bArr, i4 + i2, this.p, this.q, min);
            i4 += min;
            this.q += min;
        }
    }
}
