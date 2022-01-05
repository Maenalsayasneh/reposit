package s0.a.b.e0;

import java.math.BigInteger;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;

public class o0 {
    public k1 a;
    public boolean b;

    public int a() {
        int bitLength = (this.a.x.bitLength() + 7) / 8;
        return this.b ? bitLength - 1 : bitLength;
    }

    public int b() {
        int bitLength = (this.a.x.bitLength() + 7) / 8;
        return this.b ? bitLength : bitLength - 1;
    }

    public BigInteger c(BigInteger bigInteger) {
        k1 k1Var = this.a;
        if (!(k1Var instanceof l1)) {
            return bigInteger.modPow(k1Var.y, k1Var.x);
        }
        l1 l1Var = (l1) k1Var;
        BigInteger bigInteger2 = l1Var.Z1;
        BigInteger bigInteger3 = l1Var.a2;
        BigInteger bigInteger4 = l1Var.b2;
        BigInteger bigInteger5 = l1Var.c2;
        BigInteger bigInteger6 = l1Var.d2;
        BigInteger modPow = bigInteger.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
        BigInteger modPow2 = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
        return modPow.subtract(modPow2).multiply(bigInteger6).mod(bigInteger2).multiply(bigInteger3).add(modPow2);
    }
}
