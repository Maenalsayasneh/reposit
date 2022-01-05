package s0.a.b.n0;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.r;

public class s implements a {
    public static final s a = new s();

    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) throws IOException {
        s0.a.a.s sVar = (s0.a.a.s) r.x(bArr);
        if (sVar.size() == 2) {
            BigInteger E = ((k) sVar.D(0)).E();
            c(bigInteger, E);
            BigInteger E2 = ((k) sVar.D(1)).E();
            c(bigInteger, E2);
            if (Arrays.equals(b(bigInteger, E, E2), bArr)) {
                return new BigInteger[]{E, E2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) throws IOException {
        f fVar = new f(10);
        c(bigInteger, bigInteger2);
        fVar.a(new k(bigInteger2));
        c(bigInteger, bigInteger3);
        fVar.a(new k(bigInteger3));
        return new b1(fVar).r("DER");
    }

    public BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() >= 0 && (bigInteger == null || bigInteger2.compareTo(bigInteger) < 0)) {
            return bigInteger2;
        }
        throw new IllegalArgumentException("Value out of range");
    }
}
