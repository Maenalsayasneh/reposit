package s0.a.b.a0.l;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.k0.x0;
import s0.a.b.l;
import s0.a.b.m;
import s0.a.b.n;

public class a implements l {
    public n a;
    public byte[] b;
    public byte[] c;
    public int d;

    public a(n nVar) {
        this.a = nVar;
        this.d = nVar.getDigestSize();
    }

    public final void a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3;
        int i4;
        if (bArr.length - i2 >= i) {
            byte[] bArr2 = new byte[this.d];
            byte[] bArr3 = new byte[4];
            this.a.reset();
            int i5 = 1;
            if (i2 > this.d) {
                i3 = 0;
                while (true) {
                    a(i5, bArr3);
                    this.a.update(bArr3, 0, 4);
                    n nVar = this.a;
                    byte[] bArr4 = this.b;
                    nVar.update(bArr4, 0, bArr4.length);
                    n nVar2 = this.a;
                    byte[] bArr5 = this.c;
                    nVar2.update(bArr5, 0, bArr5.length);
                    this.a.doFinal(bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i + i3, this.d);
                    int i6 = this.d;
                    i3 += i6;
                    i4 = i5 + 1;
                    if (i5 >= i2 / i6) {
                        break;
                    }
                    i5 = i4;
                }
                i5 = i4;
            } else {
                i3 = 0;
            }
            if (i3 < i2) {
                a(i5, bArr3);
                this.a.update(bArr3, 0, 4);
                n nVar3 = this.a;
                byte[] bArr6 = this.b;
                nVar3.update(bArr6, 0, bArr6.length);
                n nVar4 = this.a;
                byte[] bArr7 = this.c;
                nVar4.update(bArr7, 0, bArr7.length);
                this.a.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i + i3, i2 - i3);
            }
            return i2;
        }
        throw new OutputLengthException("output buffer too small");
    }

    public void init(m mVar) {
        if (mVar instanceof x0) {
            x0 x0Var = (x0) mVar;
            this.b = x0Var.b;
            this.c = x0Var.a;
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }
}
