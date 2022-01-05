package s0.a.e.b.b0.c;

import androidx.core.app.FrameMetricsAggregator;
import java.math.BigInteger;
import s0.a.e.b.g;
import s0.a.g.k.d;

public class e1 extends g.b {
    public static final BigInteger g = new BigInteger(1, d.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public int[] h;

    public e1() {
        this.h = new int[17];
    }

    public e1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] P0 = h3.P0(521, bigInteger);
        if (h3.C0(17, P0, d1.a)) {
            for (int i = 0; i < 17; i++) {
                P0[i] = 0;
            }
        }
        this.h = P0;
    }

    public e1(int[] iArr) {
        this.h = iArr;
    }

    public g a(g gVar) {
        int[] iArr = new int[17];
        d1.a(this.h, ((e1) gVar).h, iArr);
        return new e1(iArr);
    }

    public g b() {
        int[] iArr = new int[17];
        int[] iArr2 = this.h;
        int y1 = h3.y1(16, iArr2, iArr) + iArr2[16];
        if (y1 > 511 || (y1 == 511 && h3.C0(16, iArr, d1.a))) {
            y1 = (h3.x1(16, iArr) + y1) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr[16] = y1;
        return new e1(iArr);
    }

    public g d(g gVar) {
        int[] iArr = new int[17];
        h3.G(d1.a, ((e1) gVar).h, iArr);
        d1.d(iArr, this.h, iArr);
        return new e1(iArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        return h3.C0(17, this.h, ((e1) obj).h);
    }

    public int f() {
        return g.bitLength();
    }

    public g g() {
        int[] iArr = new int[17];
        h3.G(d1.a, this.h, iArr);
        return new e1(iArr);
    }

    public boolean h() {
        return h3.I1(17, this.h);
    }

    public int hashCode() {
        return g.hashCode() ^ h3.o1(this.h, 0, 17);
    }

    public boolean i() {
        return h3.S1(17, this.h);
    }

    public g j(g gVar) {
        int[] iArr = new int[17];
        d1.d(this.h, ((e1) gVar).h, iArr);
        return new e1(iArr);
    }

    public g m() {
        int[] iArr = new int[17];
        int[] iArr2 = this.h;
        if (d1.c(iArr2) != 0) {
            int[] iArr3 = d1.a;
            h3.W2(17, iArr3, iArr3, iArr);
        } else {
            h3.W2(17, d1.a, iArr2, iArr);
        }
        return new e1(iArr);
    }

    public g n() {
        int[] iArr = this.h;
        if (h3.S1(17, iArr) || h3.I1(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int i = 519;
        int[] iArr4 = new int[33];
        d1.b(iArr, iArr4);
        while (true) {
            d1.e(iArr4, iArr2);
            i--;
            if (i <= 0) {
                break;
            }
            d1.b(iArr2, iArr4);
        }
        int[] iArr5 = new int[33];
        d1.b(iArr2, iArr5);
        d1.e(iArr5, iArr3);
        if (h3.C0(17, iArr, iArr3)) {
            return new e1(iArr2);
        }
        return null;
    }

    public g o() {
        int[] iArr = new int[17];
        d1.g(this.h, iArr);
        return new e1(iArr);
    }

    public g r(g gVar) {
        int[] iArr = new int[17];
        d1.h(this.h, ((e1) gVar).h, iArr);
        return new e1(iArr);
    }

    public boolean s() {
        return h3.Z0(this.h, 0) == 1;
    }

    public BigInteger t() {
        return h3.l3(17, this.h);
    }
}
