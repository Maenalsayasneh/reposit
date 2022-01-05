package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;

public class g extends r {
    public static g[] c = new g[12];
    public final byte[] d;
    public final int q;

    public g(int i) {
        if (i >= 0) {
            this.d = BigInteger.valueOf((long) i).toByteArray();
            this.q = 0;
            return;
        }
        throw new IllegalArgumentException("enumerated must be non-negative");
    }

    public g(byte[] bArr) {
        if (k.J(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.d = h3.I(bArr);
            this.q = k.L(bArr);
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    public static g B(byte[] bArr) {
        if (bArr.length > 1) {
            return new g(bArr);
        }
        if (bArr.length != 0) {
            byte b = bArr[0] & 255;
            g[] gVarArr = c;
            if (b >= gVarArr.length) {
                return new g(bArr);
            }
            g gVar = gVarArr[b];
            if (gVar != null) {
                return gVar;
            }
            g gVar2 = new g(bArr);
            gVarArr[b] = gVar2;
            return gVar2;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    public static g C(Object obj) {
        if (obj == null || (obj instanceof g)) {
            return (g) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (g) r.x((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(a.b0(e, a.P0("encoding error in getInstance: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public BigInteger D() {
        return new BigInteger(this.d);
    }

    public int E() {
        byte[] bArr = this.d;
        int length = bArr.length;
        int i = this.q;
        if (length - i <= 4) {
            return k.H(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    public int hashCode() {
        return h3.m1(this.d);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof g)) {
            return false;
        }
        return Arrays.equals(this.d, ((g) rVar).d);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 10, this.d);
    }

    public int u() {
        return a2.a(this.d.length) + 1 + this.d.length;
    }

    public boolean y() {
        return false;
    }
}
