package s0.a.b.h0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i;
import s0.a.b.i0.n;
import s0.a.b.k0.a;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.s;

public class e implements s {
    public final n a;

    public e(n nVar) {
        this.a = nVar;
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        try {
            return this.a.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    public String getAlgorithmName() {
        return this.a.a.getAlgorithmName() + "-GMAC";
    }

    public int getMacSize() {
        return 16;
    }

    public void init(i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.a.init(true, new a((y0) c1Var.d, 128, c1Var.c, (byte[]) null));
            return;
        }
        throw new IllegalArgumentException("GMAC requires ParametersWithIV");
    }

    public void reset() {
        this.a.i(true);
    }

    public void update(byte b) throws IllegalStateException {
        n nVar = this.a;
        nVar.c();
        byte[] bArr = nVar.u;
        int i = nVar.v;
        bArr[i] = b;
        int i2 = i + 1;
        nVar.v = i2;
        if (i2 == 16) {
            nVar.d(nVar.o, bArr);
            nVar.v = 0;
            nVar.w += 16;
        }
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        this.a.b(bArr, i, i2);
    }
}
