package s0.a.b.i0;

import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;

public class c implements e {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public int d;
    public e e = null;
    public boolean f;

    public c(e eVar) {
        this.e = eVar;
        int b2 = eVar.b();
        this.d = b2;
        this.a = new byte[b2];
        this.b = new byte[b2];
        this.c = new byte[b2];
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (!this.f) {
            int i3 = this.d;
            if (i + i3 <= bArr.length) {
                System.arraycopy(bArr, i, this.c, 0, i3);
                int a2 = this.e.a(bArr, i, bArr2, i2);
                for (int i4 = 0; i4 < this.d; i4++) {
                    int i5 = i2 + i4;
                    bArr2[i5] = (byte) (bArr2[i5] ^ this.b[i4]);
                }
                byte[] bArr3 = this.b;
                this.b = this.c;
                this.c = bArr3;
                return a2;
            }
            throw new DataLengthException("input buffer too short");
        } else if (this.d + i <= bArr.length) {
            for (int i6 = 0; i6 < this.d; i6++) {
                byte[] bArr4 = this.b;
                bArr4[i6] = (byte) (bArr4[i6] ^ bArr[i + i6]);
            }
            int a3 = this.e.a(this.b, 0, bArr2, i2);
            byte[] bArr5 = this.b;
            System.arraycopy(bArr2, i2, bArr5, 0, bArr5.length);
            return a3;
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    public int b() {
        return this.e.b();
    }

    public String getAlgorithmName() {
        return this.e.getAlgorithmName() + "/CBC";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        boolean z2 = this.f;
        this.f = z;
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            if (bArr.length == this.d) {
                System.arraycopy(bArr, 0, this.a, 0, bArr.length);
                reset();
                iVar = c1Var.d;
                if (iVar == null) {
                    if (z2 != z) {
                        throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                    }
                    return;
                }
            } else {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (iVar == null) {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        this.e.init(z, iVar);
    }

    public void reset() {
        byte[] bArr = this.a;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        Arrays.fill(this.c, (byte) 0);
        this.e.reset();
    }
}
