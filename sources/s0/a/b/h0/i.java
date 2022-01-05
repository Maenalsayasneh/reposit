package s0.a.b.h0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i0.r;
import s0.a.b.k0.a;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.s;

public class i implements s {
    public final r a;
    public final int b;

    public i(r rVar, int i) {
        this.a = rVar;
        this.b = i;
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        try {
            return this.a.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    public String getAlgorithmName() {
        return this.a.a.getAlgorithmName() + "-KGMAC";
    }

    public int getMacSize() {
        return this.b / 8;
    }

    public void init(s0.a.b.i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.a.init(true, new a((y0) c1Var.d, this.b, c1Var.c, (byte[]) null));
            return;
        }
        throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
    }

    public void reset() {
        this.a.d();
    }

    public void update(byte b2) throws IllegalStateException {
        this.a.k.write(b2);
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        this.a.k.write(bArr, i, i2);
    }
}
