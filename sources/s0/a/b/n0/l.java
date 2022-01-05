package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import s0.a.b.h0.g;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.g.b;

public class l implements b {
    public static final BigInteger a = BigInteger.valueOf(0);
    public final g b;
    public final byte[] c;
    public final byte[] d;
    public BigInteger e;

    public l(n nVar) {
        g gVar = new g(nVar);
        this.b = gVar;
        int i = gVar.c;
        this.d = new byte[i];
        this.c = new byte[i];
    }

    public BigInteger a() {
        int i = b.i(this.e);
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = 0;
            while (i2 < i) {
                g gVar = this.b;
                byte[] bArr2 = this.d;
                gVar.b.update(bArr2, 0, bArr2.length);
                this.b.doFinal(this.d, 0);
                int min = Math.min(i - i2, this.d.length);
                System.arraycopy(this.d, 0, bArr, i2, min);
                i2 += min;
            }
            BigInteger e2 = e(bArr);
            if (e2.compareTo(a) > 0 && e2.compareTo(this.e) < 0) {
                return e2;
            }
            g gVar2 = this.b;
            byte[] bArr3 = this.d;
            gVar2.b.update(bArr3, 0, bArr3.length);
            this.b.b.update((byte) 0);
            this.b.doFinal(this.c, 0);
            this.b.init(new y0(this.c));
            g gVar3 = this.b;
            byte[] bArr4 = this.d;
            gVar3.b.update(bArr4, 0, bArr4.length);
            this.b.doFinal(this.d, 0);
        }
    }

    public boolean b() {
        return true;
    }

    public void c(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    public void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.e = bigInteger;
        Arrays.fill(this.d, (byte) 1);
        Arrays.fill(this.c, (byte) 0);
        int i = b.i(bigInteger);
        byte[] bArr2 = new byte[i];
        byte[] c2 = b.c(bigInteger2);
        System.arraycopy(c2, 0, bArr2, i - c2.length, c2.length);
        byte[] bArr3 = new byte[i];
        BigInteger e2 = e(bArr);
        if (e2.compareTo(bigInteger) >= 0) {
            e2 = e2.subtract(bigInteger);
        }
        byte[] c3 = b.c(e2);
        System.arraycopy(c3, 0, bArr3, i - c3.length, c3.length);
        this.b.init(new y0(this.c));
        g gVar = this.b;
        byte[] bArr4 = this.d;
        gVar.b.update(bArr4, 0, bArr4.length);
        this.b.b.update((byte) 0);
        this.b.b.update(bArr2, 0, i);
        this.b.b.update(bArr3, 0, i);
        this.b.doFinal(this.c, 0);
        this.b.init(new y0(this.c));
        g gVar2 = this.b;
        byte[] bArr5 = this.d;
        gVar2.b.update(bArr5, 0, bArr5.length);
        this.b.doFinal(this.d, 0);
        g gVar3 = this.b;
        byte[] bArr6 = this.d;
        gVar3.b.update(bArr6, 0, bArr6.length);
        this.b.b.update((byte) 1);
        this.b.b.update(bArr2, 0, i);
        this.b.b.update(bArr3, 0, i);
        this.b.doFinal(this.c, 0);
        this.b.init(new y0(this.c));
        g gVar4 = this.b;
        byte[] bArr7 = this.d;
        gVar4.b.update(bArr7, 0, bArr7.length);
        this.b.doFinal(this.d, 0);
    }

    public final BigInteger e(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.e.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.e.bitLength()) : bigInteger;
    }
}
