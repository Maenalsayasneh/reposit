package s0.a.b.a0;

import java.math.BigInteger;
import s0.a.b.d;
import s0.a.b.i;
import s0.a.b.k0.f;
import s0.a.b.k0.g;
import s0.a.b.k0.j;

public class h implements d {
    public static final BigInteger a = BigInteger.valueOf(1);
    public f b;

    public int a() {
        return (this.b.c.d.d.bitLength() + 7) / 8;
    }

    public BigInteger b(i iVar) {
        g gVar = (g) iVar;
        s0.a.b.k0.i iVar2 = this.b.c;
        if (iVar2.d.equals(gVar.c.d)) {
            f fVar = this.b;
            if (fVar.c.d.q != null) {
                s0.a.b.k0.h hVar = iVar2.d;
                j jVar = gVar.c;
                s0.a.b.k0.i iVar3 = fVar.d;
                j jVar2 = fVar.q;
                j jVar3 = gVar.d;
                BigInteger bigInteger = hVar.q;
                BigInteger pow = BigInteger.valueOf(2).pow((bigInteger.bitLength() + 1) / 2);
                BigInteger modPow = jVar3.y.multiply(jVar.y.modPow(jVar3.y.mod(pow).add(pow), hVar.d)).modPow(iVar3.q.add(jVar2.y.mod(pow).add(pow).multiply(iVar2.q)).mod(bigInteger), hVar.d);
                if (!modPow.equals(a)) {
                    return modPow;
                }
                throw new IllegalStateException("1 is not a valid agreement value for MQV");
            }
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
        throw new IllegalStateException("MQV public key components have wrong domain parameters");
    }

    public void init(i iVar) {
        this.b = (f) iVar;
    }
}
