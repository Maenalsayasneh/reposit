package s0.a.b.i0;

import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.w;

public class q extends w {
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public int e;
    public boolean f;
    public e g;

    public q(e eVar) {
        super(eVar);
        this.g = eVar;
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (bArr.length - i < b()) {
            throw new DataLengthException("input buffer too short");
        } else if (bArr2.length - i2 >= b()) {
            processBytes(bArr, i, b(), bArr2, i2);
            return b();
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public int b() {
        return this.g.b();
    }

    public byte c(byte b2) {
        byte[] bArr;
        int i = this.e;
        if (i == 0) {
            int i2 = 0;
            while (true) {
                bArr = this.c;
                if (i2 >= bArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                byte b3 = (byte) (bArr[i2] + 1);
                bArr[i2] = b3;
                if (b3 != 0) {
                    break;
                }
                i2 = i3;
            }
            this.g.a(bArr, 0, this.d, 0);
            byte[] bArr2 = this.d;
            int i4 = this.e;
            this.e = i4 + 1;
            return (byte) (b2 ^ bArr2[i4]);
        }
        byte[] bArr3 = this.d;
        int i5 = i + 1;
        this.e = i5;
        byte b4 = (byte) (b2 ^ bArr3[i]);
        if (i5 == this.c.length) {
            this.e = 0;
        }
        return b4;
    }

    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/KCTR";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        this.f = true;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            byte[] bArr2 = this.b;
            Arrays.fill(bArr2, (byte) 0);
            System.arraycopy(bArr, 0, this.b, bArr2.length - bArr.length, bArr.length);
            i iVar2 = c1Var.d;
            if (iVar2 != null) {
                this.g.init(true, iVar2);
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed");
    }

    public void reset() {
        if (this.f) {
            this.g.a(this.b, 0, this.c, 0);
        }
        this.g.reset();
        this.e = 0;
    }
}
