package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.g;

public class k extends r {
    public final byte[] c;
    public final int d;

    public k(long j) {
        this.c = BigInteger.valueOf(j).toByteArray();
        this.d = 0;
    }

    public k(BigInteger bigInteger) {
        this.c = bigInteger.toByteArray();
        this.d = 0;
    }

    public k(byte[] bArr, boolean z) {
        if (!J(bArr)) {
            this.c = z ? h3.I(bArr) : bArr;
            this.d = L(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    public static k B(Object obj) {
        if (obj == null || (obj instanceof k)) {
            return (k) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (k) r.x((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(a.b0(e, a.P0("encoding error in getInstance: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public static k C(z zVar, boolean z) {
        r C = zVar.C();
        if (z || (C instanceof k)) {
            return B(C);
        }
        return new k(o.B(C).c, true);
    }

    public static int H(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        byte b = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return b;
            }
            b = (b << 8) | (bArr[max] & 255);
        }
    }

    public static boolean J(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return bArr[0] == (bArr[1] >> 7) && !g.b("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return false;
    }

    public static int L(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public BigInteger D() {
        return new BigInteger(1, this.c);
    }

    public BigInteger E() {
        return new BigInteger(this.c);
    }

    public boolean F(BigInteger bigInteger) {
        return bigInteger != null && H(this.c, this.d, -1) == bigInteger.intValue() && E().equals(bigInteger);
    }

    public int G() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.d;
        int i2 = length - i;
        if (i2 <= 4 && (i2 != 4 || (bArr[i] & 128) == 0)) {
            return H(bArr, i, 255);
        }
        throw new ArithmeticException("ASN.1 Integer out of positive int range");
    }

    public int I() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.d;
        if (length - i <= 4) {
            return H(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long K() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.d;
        if (length - i <= 8) {
            int length2 = bArr.length;
            int max = Math.max(i, length2 - 8);
            long j = (long) (-1 & bArr[max]);
            while (true) {
                max++;
                if (max >= length2) {
                    return j;
                }
                j = (j << 8) | ((long) (bArr[max] & 255));
            }
        } else {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof k)) {
            return false;
        }
        return Arrays.equals(this.c, ((k) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 2, this.c);
    }

    public String toString() {
        return E().toString();
    }

    public int u() {
        return a2.a(this.c.length) + 1 + this.c.length;
    }

    public boolean y() {
        return false;
    }
}
