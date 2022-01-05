package s0.a.b.e0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.b.x;

public class c1 implements x {
    public byte a = 0;
    public byte[] b = null;
    public byte c = 0;
    public byte[] d;
    public byte[] e;

    public void a(byte[] bArr, byte[] bArr2) {
        this.c = 0;
        this.b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.b;
            int i3 = i2 & 255;
            byte b2 = bArr3[(this.c + bArr3[i3] + bArr[i2 % bArr.length]) & 255];
            this.c = b2;
            byte b3 = bArr3[i3];
            bArr3[i3] = bArr3[b2 & 255];
            bArr3[b2 & 255] = b3;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.b;
            int i5 = i4 & 255;
            byte b4 = bArr4[(this.c + bArr4[i5] + bArr2[i4 % bArr2.length]) & 255];
            this.c = b4;
            byte b5 = bArr4[i5];
            bArr4[i5] = bArr4[b4 & 255];
            bArr4[b4 & 255] = b5;
        }
        this.a = 0;
    }

    public String getAlgorithmName() {
        return "VMPC";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof s0.a.b.k0.c1) {
            s0.a.b.k0.c1 c1Var = (s0.a.b.k0.c1) iVar;
            i iVar2 = c1Var.d;
            if (iVar2 instanceof y0) {
                y0 y0Var = (y0) iVar2;
                byte[] bArr = c1Var.c;
                this.d = bArr;
                if (bArr == null || bArr.length < 1 || bArr.length > 768) {
                    throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
                }
                byte[] bArr2 = y0Var.c;
                this.e = bArr2;
                a(bArr2, bArr);
                return;
            }
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        throw new IllegalArgumentException("VMPC init parameters must include an IV");
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr3 = this.b;
                byte b2 = this.c;
                byte b3 = this.a;
                byte b4 = b3 & 255;
                byte b5 = bArr3[(b2 + bArr3[b4]) & 255];
                this.c = b5;
                byte b6 = b5 & 255;
                byte b7 = bArr3[(bArr3[bArr3[b6] & 255] + 1) & 255];
                byte b8 = bArr3[b4];
                bArr3[b4] = bArr3[b6];
                bArr3[b6] = b8;
                this.a = (byte) ((b3 + 1) & 255);
                bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b7);
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
        a(this.e, this.d);
    }
}
