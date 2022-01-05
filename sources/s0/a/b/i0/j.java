package s0.a.b.i0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;
import s0.a.e.b.b0.c.h3;

public class j extends w {
    public final int b;
    public int c;
    public int d;
    public byte[] e;
    public byte[] f;
    public e g;
    public boolean h;
    public boolean i = false;
    public byte[] j;
    public byte[] k;
    public int l;

    public j(e eVar, int i2) {
        super(eVar);
        if (i2 < 0 || i2 > eVar.b() * 8) {
            StringBuilder P0 = a.P0("Parameter bitBlockSize must be in range 0 < bitBlockSize <= ");
            P0.append(eVar.b() * 8);
            throw new IllegalArgumentException(P0.toString());
        }
        this.d = eVar.b();
        this.g = eVar;
        int i3 = i2 / 8;
        this.b = i3;
        this.k = new byte[i3];
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i2, this.b, bArr2, i3);
        return this.b;
    }

    public int b() {
        return this.b;
    }

    public byte c(byte b2) {
        if (this.l == 0) {
            byte[] p02 = h3.p0(this.e, this.d);
            byte[] bArr = new byte[p02.length];
            this.g.a(p02, 0, bArr, 0);
            this.j = h3.p0(bArr, this.b);
        }
        byte[] bArr2 = this.j;
        int i2 = this.l;
        byte b3 = (byte) (bArr2[i2] ^ b2);
        byte[] bArr3 = this.k;
        int i3 = i2 + 1;
        this.l = i3;
        if (this.h) {
            b2 = b3;
        }
        bArr3[i2] = b2;
        int i4 = this.b;
        if (i3 == i4) {
            this.l = 0;
            byte[] t = m0.r.t.a.r.m.a1.a.t(this.e, this.c - i4);
            System.arraycopy(t, 0, this.e, 0, t.length);
            System.arraycopy(bArr3, 0, this.e, t.length, this.c - t.length);
        }
        return b3;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/CFB" + (this.d * 8);
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        this.h = z;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            if (bArr.length >= this.d) {
                int length = bArr.length;
                this.c = length;
                this.e = new byte[length];
                this.f = new byte[length];
                byte[] I = h3.I(bArr);
                this.f = I;
                System.arraycopy(I, 0, this.e, 0, I.length);
                i iVar2 = c1Var.d;
                if (iVar2 != null) {
                    this.g.init(true, iVar2);
                }
            } else {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
        } else {
            int i2 = this.d * 2;
            this.c = i2;
            byte[] bArr2 = new byte[i2];
            this.e = bArr2;
            byte[] bArr3 = new byte[i2];
            this.f = bArr3;
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            if (iVar != null) {
                this.g.init(true, iVar);
            }
        }
        this.i = true;
    }

    public void reset() {
        this.l = 0;
        h3.H(this.k);
        h3.H(this.j);
        if (this.i) {
            byte[] bArr = this.f;
            System.arraycopy(bArr, 0, this.e, 0, bArr.length);
            this.g.reset();
        }
    }
}
