package s0.a.b.i0;

import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;
import s0.a.e.b.b0.c.h3;

public class l extends w {
    public int b;
    public int c = 16;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public e g;
    public int h;
    public boolean i = false;

    public l(e eVar) {
        super(eVar);
        this.g = eVar;
        this.f = new byte[16];
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i2, this.c, bArr2, i3);
        return this.c;
    }

    public int b() {
        return this.c;
    }

    public byte c(byte b2) {
        if (this.h == 0) {
            this.g.a(h3.p0(this.d, this.c), 0, this.f, 0);
        }
        byte[] bArr = this.f;
        int i2 = this.h;
        byte b3 = (byte) (b2 ^ bArr[i2]);
        int i3 = i2 + 1;
        this.h = i3;
        int i4 = this.c;
        if (i3 == i4) {
            this.h = 0;
            byte[] t = a.t(this.d, this.b - i4);
            System.arraycopy(t, 0, this.d, 0, t.length);
            System.arraycopy(this.f, 0, this.d, t.length, this.b - t.length);
        }
        return b3;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/OFB";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            if (bArr.length >= this.c) {
                int length = bArr.length;
                this.b = length;
                this.d = new byte[length];
                this.e = new byte[length];
                byte[] I = h3.I(bArr);
                this.e = I;
                System.arraycopy(I, 0, this.d, 0, I.length);
                i iVar2 = c1Var.d;
                if (iVar2 != null) {
                    this.g.init(true, iVar2);
                }
            } else {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
        } else {
            int i2 = this.c * 2;
            this.b = i2;
            byte[] bArr2 = new byte[i2];
            this.d = bArr2;
            byte[] bArr3 = new byte[i2];
            this.e = bArr3;
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            if (iVar != null) {
                this.g.init(true, iVar);
            }
        }
        this.i = true;
    }

    public void reset() {
        if (this.i) {
            byte[] bArr = this.e;
            System.arraycopy(bArr, 0, this.d, 0, bArr.length);
            h3.H(this.f);
            this.h = 0;
            this.g.reset();
        }
    }
}
