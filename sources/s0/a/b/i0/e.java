package s0.a.b.i0;

import i0.d.a.a.a;
import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;

public class e extends w {
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public int f;
    public s0.a.b.e g = null;
    public boolean h;
    public int i;

    public e(s0.a.b.e eVar, int i2) {
        super(eVar);
        if (i2 > eVar.b() * 8 || i2 < 8 || i2 % 8 != 0) {
            throw new IllegalArgumentException(a.g0("CFB", i2, " not supported"));
        }
        this.g = eVar;
        this.f = i2 / 8;
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
        this.e = new byte[this.f];
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i2, this.f, bArr2, i3);
        return this.f;
    }

    public int b() {
        return this.f;
    }

    public byte c(byte b2) throws DataLengthException, IllegalStateException {
        byte b3;
        if (this.h) {
            if (this.i == 0) {
                this.g.a(this.c, 0, this.d, 0);
            }
            byte[] bArr = this.d;
            int i2 = this.i;
            b3 = (byte) (b2 ^ bArr[i2]);
            byte[] bArr2 = this.e;
            int i3 = i2 + 1;
            this.i = i3;
            bArr2[i2] = b3;
            int i4 = this.f;
            if (i3 == i4) {
                this.i = 0;
                byte[] bArr3 = this.c;
                System.arraycopy(bArr3, i4, bArr3, 0, bArr3.length - i4);
                byte[] bArr4 = this.e;
                byte[] bArr5 = this.c;
                int length = bArr5.length;
                int i5 = this.f;
                System.arraycopy(bArr4, 0, bArr5, length - i5, i5);
            }
        } else {
            if (this.i == 0) {
                this.g.a(this.c, 0, this.d, 0);
            }
            byte[] bArr6 = this.e;
            int i6 = this.i;
            bArr6[i6] = b2;
            byte[] bArr7 = this.d;
            int i7 = i6 + 1;
            this.i = i7;
            b3 = (byte) (b2 ^ bArr7[i6]);
            int i8 = this.f;
            if (i7 == i8) {
                this.i = 0;
                byte[] bArr8 = this.c;
                System.arraycopy(bArr8, i8, bArr8, 0, bArr8.length - i8);
                byte[] bArr9 = this.e;
                byte[] bArr10 = this.c;
                int length2 = bArr10.length;
                int i9 = this.f;
                System.arraycopy(bArr9, 0, bArr10, length2 - i9, i9);
            }
        }
        return b3;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/CFB" + (this.f * 8);
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        this.h = z;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            int length = bArr.length;
            byte[] bArr2 = this.b;
            if (length < bArr2.length) {
                System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = this.b;
                    if (i2 >= bArr3.length - bArr.length) {
                        break;
                    }
                    bArr3[i2] = 0;
                    i2++;
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
        byte[] bArr = this.b;
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        Arrays.fill(this.e, (byte) 0);
        this.i = 0;
        this.g.reset();
    }
}
