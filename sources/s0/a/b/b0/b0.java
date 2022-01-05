package s0.a.b.b0;

import i0.d.a.a.a;
import org.bouncycastle.util.MemoableResetException;
import s0.a.g.f;

public class b0 extends m {
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0086, code lost:
        if (r3 > 10) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(int r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 512(0x200, float:7.175E-43)
            if (r3 >= r0) goto L_0x00ce
            int r0 = r3 % 8
            if (r0 != 0) goto L_0x00c6
            r0 = 384(0x180, float:5.38E-43)
            if (r3 == r0) goto L_0x00be
            int r3 = r3 / 8
            r2.p = r3
            int r3 = r3 * 8
            r0 = -3482333909917012819(0xcfac43c256196cad, double:-6.392239886847908E75)
            r2.f = r0
            r0 = 2216346199247487646(0x1ec20b20216f029e, double:1.604250256667292E-160)
            r2.g = r0
            r0 = -7364697282686394994(0x99cb56d75b315d8e, double:-2.0106609494103695E-184)
            r2.h = r0
            r0 = 65953792586715988(0xea509ffab89354, double:2.9978976005667514E-304)
            r2.i = r0
            r0 = -816286391624063116(0xf4abf7da08432774, double:-1.0252515228978657E254)
            r2.j = r0
            r0 = 4512832404995164602(0x3ea0cd298e9bc9ba, double:5.007211971427005E-7)
            r2.k = r0
            r0 = -5033199132376557362(0xba267c0e5ee418ce, double:-1.418977391716189E-28)
            r2.l = r0
            r0 = -124578254951840548(0xfe4568bcb6db84dc, double:-1.7921927020935902E300)
            r2.m = r0
            r0 = 83
            r2.update(r0)
            r0 = 72
            r2.update(r0)
            r0 = 65
            r2.update(r0)
            r0 = 45
            r2.update(r0)
            r0 = 53
            r2.update(r0)
            r0 = 49
            r2.update(r0)
            r0 = 50
            r2.update(r0)
            r0 = 47
            r2.update(r0)
            r0 = 10
            r1 = 100
            if (r3 <= r1) goto L_0x0086
            int r1 = r3 / 100
            int r1 = r1 + 48
            byte r1 = (byte) r1
            r2.update(r1)
            int r3 = r3 % 100
            goto L_0x0088
        L_0x0086:
            if (r3 <= r0) goto L_0x0091
        L_0x0088:
            int r1 = r3 / 10
            int r1 = r1 + 48
            byte r1 = (byte) r1
            r2.update(r1)
            int r3 = r3 % r0
        L_0x0091:
            int r3 = r3 + 48
            byte r3 = (byte) r3
            r2.update(r3)
            r2.j()
            long r0 = r2.f
            r2.q = r0
            long r0 = r2.g
            r2.r = r0
            long r0 = r2.h
            r2.s = r0
            long r0 = r2.i
            r2.t = r0
            long r0 = r2.j
            r2.u = r0
            long r0 = r2.k
            r2.v = r0
            long r0 = r2.l
            r2.w = r0
            long r0 = r2.m
            r2.x = r0
            r2.reset()
            return
        L_0x00be:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bitLength cannot be 384 use SHA384 instead"
            r3.<init>(r0)
            throw r3
        L_0x00c6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bitLength needs to be a multiple of 8"
            r3.<init>(r0)
            throw r3
        L_0x00ce:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bitLength cannot be >= 512"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.b0.b0.<init>(int):void");
    }

    public b0(b0 b0Var) {
        super(b0Var);
        this.p = b0Var.p;
        c(b0Var);
    }

    public static void m(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(4, i3);
        while (true) {
            min--;
            if (min >= 0) {
                bArr[i2 + min] = (byte) (i >>> ((3 - min) * 8));
            } else {
                return;
            }
        }
    }

    public static void n(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            m((int) (j >>> 32), bArr, i, i2);
            if (i2 > 4) {
                m((int) (j & 4294967295L), bArr, i + 4, i2 - 4);
            }
        }
    }

    public f a() {
        return new b0(this);
    }

    public void c(f fVar) {
        b0 b0Var = (b0) fVar;
        if (this.p == b0Var.p) {
            i(b0Var);
            this.q = b0Var.q;
            this.r = b0Var.r;
            this.s = b0Var.s;
            this.t = b0Var.t;
            this.u = b0Var.u;
            this.v = b0Var.v;
            this.w = b0Var.w;
            this.x = b0Var.x;
            return;
        }
        throw new MemoableResetException("digestLength inappropriate in other");
    }

    public int doFinal(byte[] bArr, int i) {
        j();
        n(this.f, bArr, i, this.p);
        n(this.g, bArr, i + 8, this.p - 8);
        n(this.h, bArr, i + 16, this.p - 16);
        n(this.i, bArr, i + 24, this.p - 24);
        n(this.j, bArr, i + 32, this.p - 32);
        n(this.k, bArr, i + 40, this.p - 40);
        n(this.l, bArr, i + 48, this.p - 48);
        n(this.m, bArr, i + 56, this.p - 56);
        reset();
        return this.p;
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("SHA-512/");
        P0.append(Integer.toString(this.p * 8));
        return P0.toString();
    }

    public int getDigestSize() {
        return this.p;
    }

    public void reset() {
        super.reset();
        this.f = this.q;
        this.g = this.r;
        this.h = this.s;
        this.i = this.t;
        this.j = this.u;
        this.k = this.v;
        this.l = this.w;
        this.m = this.x;
    }
}
