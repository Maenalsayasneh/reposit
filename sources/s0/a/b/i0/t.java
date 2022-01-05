package s0.a.b.i0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;

public class t extends w {
    public int b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public final int f;
    public final e g;

    public t(e eVar, int i) {
        super(eVar);
        if (i > eVar.b() * 8 || i < 8 || i % 8 != 0) {
            throw new IllegalArgumentException(a.g0("0FB", i, " not supported"));
        }
        this.g = eVar;
        this.f = i / 8;
        this.c = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
        this.e = new byte[eVar.b()];
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.f, bArr2, i2);
        return this.f;
    }

    public int b() {
        return this.f;
    }

    public byte c(byte b2) throws DataLengthException, IllegalStateException {
        if (this.b == 0) {
            this.g.a(this.d, 0, this.e, 0);
        }
        byte[] bArr = this.e;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b3 = (byte) (b2 ^ bArr[i]);
        int i3 = this.f;
        if (i2 == i3) {
            this.b = 0;
            byte[] bArr2 = this.d;
            System.arraycopy(bArr2, i3, bArr2, 0, bArr2.length - i3);
            byte[] bArr3 = this.e;
            byte[] bArr4 = this.d;
            int length = bArr4.length;
            int i4 = this.f;
            System.arraycopy(bArr3, 0, bArr4, length - i4, i4);
        }
        return b3;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/OFB" + (this.f * 8);
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            int length = bArr.length;
            byte[] bArr2 = this.c;
            if (length < bArr2.length) {
                System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
                int i = 0;
                while (true) {
                    byte[] bArr3 = this.c;
                    if (i >= bArr3.length - bArr.length) {
                        break;
                    }
                    bArr3[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            }
            reset();
            i iVar2 = c1Var.d;
            if (iVar2 != null) {
                this.g.init(true, iVar2);
                return;
            }
            return;
        }
        reset();
        if (iVar != null) {
            this.g.init(true, iVar);
        }
    }

    public void reset() {
        byte[] bArr = this.c;
        System.arraycopy(bArr, 0, this.d, 0, bArr.length);
        this.b = 0;
        this.g.reset();
    }
}
