package s0.a.b.i0;

import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;
import s0.a.e.b.b0.c.h3;

public class k extends w {
    public final int b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public final int f;
    public final e g;
    public int h = 0;
    public boolean i;

    public k(e eVar) {
        super(eVar);
        this.g = eVar;
        this.f = 16;
        this.b = 16;
        this.c = new byte[16];
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i2, this.b, bArr2, i3);
        return this.b;
    }

    public int b() {
        return this.b;
    }

    public byte c(byte b2) {
        if (this.h == 0) {
            byte[] bArr = this.c;
            byte[] bArr2 = new byte[bArr.length];
            this.g.a(bArr, 0, bArr2, 0);
            this.e = h3.p0(bArr2, this.b);
        }
        byte[] bArr3 = this.e;
        int i2 = this.h;
        byte b3 = (byte) (b2 ^ bArr3[i2]);
        int i3 = i2 + 1;
        this.h = i3;
        if (i3 == this.b) {
            this.h = 0;
            byte[] bArr4 = this.c;
            int length = bArr4.length - 1;
            bArr4[length] = (byte) (bArr4[length] + 1);
        }
        return b3;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/GCTR";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            int i2 = this.f;
            this.d = new byte[(i2 / 2)];
            this.c = new byte[i2];
            this.e = new byte[this.b];
            byte[] I = h3.I(c1Var.c);
            this.d = I;
            if (I.length == this.f / 2) {
                System.arraycopy(I, 0, this.c, 0, I.length);
                for (int length = this.d.length; length < this.f; length++) {
                    this.c[length] = 0;
                }
                i iVar2 = c1Var.d;
                if (iVar2 != null) {
                    this.g.init(true, iVar2);
                }
            } else {
                throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
            }
        } else {
            int i3 = this.f;
            this.d = new byte[(i3 / 2)];
            this.c = new byte[i3];
            this.e = new byte[this.b];
            if (iVar != null) {
                this.g.init(true, iVar);
            }
        }
        this.i = true;
    }

    public void reset() {
        if (this.i) {
            byte[] bArr = this.d;
            System.arraycopy(bArr, 0, this.c, 0, bArr.length);
            for (int length = this.d.length; length < this.f; length++) {
                this.c[length] = 0;
            }
            this.h = 0;
            this.g.reset();
        }
    }
}
