package s0.a.b.a0;

import java.math.BigInteger;
import s0.a.b.d;
import s0.a.b.k0.b;
import s0.a.b.k0.d1;
import s0.a.b.k0.h;
import s0.a.b.k0.i;
import s0.a.b.k0.j;

public class a implements d {
    public static final BigInteger a = BigInteger.valueOf(1);
    public i b;
    public h c;

    public int a() {
        return (this.b.d.d.bitLength() + 7) / 8;
    }

    public BigInteger b(s0.a.b.i iVar) {
        j jVar = (j) iVar;
        if (jVar.d.equals(this.c)) {
            BigInteger bigInteger = this.c.d;
            BigInteger bigInteger2 = jVar.y;
            if (bigInteger2 != null) {
                BigInteger bigInteger3 = a;
                if (bigInteger2.compareTo(bigInteger3) > 0 && bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) < 0) {
                    BigInteger modPow = bigInteger2.modPow(this.b.q, bigInteger);
                    if (!modPow.equals(bigInteger3)) {
                        return modPow;
                    }
                    throw new IllegalStateException("Shared key can't be 1");
                }
            }
            throw new IllegalArgumentException("Diffie-Hellman public key is weak");
        }
        throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
    }

    public void init(s0.a.b.i iVar) {
        if (iVar instanceof d1) {
            iVar = ((d1) iVar).d;
        }
        b bVar = (b) iVar;
        if (bVar instanceof i) {
            i iVar2 = (i) bVar;
            this.b = iVar2;
            this.c = iVar2.d;
            return;
        }
        throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
    }
}
