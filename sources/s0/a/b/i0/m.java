package s0.a.b.i0;

import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.k0.e1;
import s0.a.b.k0.y0;
import s0.a.b.w;
import s0.a.e.b.b0.c.h3;

public class m extends w {
    public static final byte[] b = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    public final e c;
    public y0 d;
    public long e = 0;
    public boolean f;

    public m(e eVar) {
        super(eVar);
        this.c = new e(eVar, eVar.b() * 8);
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.c.f, bArr2, i2);
        return this.c.f;
    }

    public int b() {
        return this.c.f;
    }

    public byte c(byte b2) {
        long j = this.e;
        if (j > 0 && j % 1024 == 0) {
            e eVar = this.c.a;
            eVar.init(false, this.d);
            byte[] bArr = new byte[32];
            byte[] bArr2 = b;
            eVar.a(bArr2, 0, bArr, 0);
            eVar.a(bArr2, 8, bArr, 8);
            eVar.a(bArr2, 16, bArr, 16);
            eVar.a(bArr2, 24, bArr, 24);
            y0 y0Var = new y0(bArr);
            this.d = y0Var;
            eVar.init(true, y0Var);
            byte[] I = h3.I(this.c.c);
            eVar.a(I, 0, I, 0);
            this.c.init(this.f, new c1(this.d, I));
        }
        this.e++;
        return this.c.c(b2);
    }

    public String getAlgorithmName() {
        String algorithmName = this.c.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        this.e = 0;
        this.c.init(z, iVar);
        this.f = z;
        if (iVar instanceof c1) {
            iVar = ((c1) iVar).d;
        }
        if (iVar instanceof d1) {
            iVar = ((d1) iVar).d;
        }
        if (iVar instanceof e1) {
            iVar = ((e1) iVar).c;
        }
        this.d = (y0) iVar;
    }

    public void reset() {
        this.e = 0;
        this.c.reset();
    }
}
