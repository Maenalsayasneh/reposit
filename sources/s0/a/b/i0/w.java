package s0.a.b.i0;

import i0.d.a.a.a;
import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.x;
import s0.a.e.b.b0.c.h3;

public class w extends s0.a.b.w implements x {
    public final e b;
    public final int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g = 0;

    public w(e eVar) {
        super(eVar);
        this.b = eVar;
        int b2 = eVar.b();
        this.c = b2;
        this.d = new byte[b2];
        this.e = new byte[b2];
        this.f = new byte[b2];
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.c, bArr2, i2);
        return this.c;
    }

    public int b() {
        return this.b.b();
    }

    public byte c(byte b2) throws DataLengthException, IllegalStateException {
        byte b3;
        int i = this.g;
        int i2 = 0;
        if (i == 0) {
            this.b.a(this.e, 0, this.f, 0);
            byte[] bArr = this.f;
            int i3 = this.g;
            this.g = i3 + 1;
            return (byte) (b2 ^ bArr[i3]);
        }
        byte[] bArr2 = this.f;
        int i4 = i + 1;
        this.g = i4;
        byte b4 = (byte) (b2 ^ bArr2[i]);
        byte[] bArr3 = this.e;
        if (i4 == bArr3.length) {
            this.g = 0;
            int length = bArr3.length - 0;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                byte[] bArr4 = this.e;
                b3 = (byte) (bArr4[length] + 1);
                bArr4[length] = b3;
            } while (b3 == 0);
            if (this.d.length < this.c) {
                while (true) {
                    byte[] bArr5 = this.d;
                    if (i2 == bArr5.length) {
                        break;
                    } else if (this.e[i2] == bArr5[i2]) {
                        i2++;
                    } else {
                        throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                    }
                }
            }
        }
        return b4;
    }

    public String getAlgorithmName() {
        return this.b.getAlgorithmName() + "/SIC";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] I = h3.I(c1Var.c);
            this.d = I;
            int i = this.c;
            if (i >= I.length) {
                int i2 = 8;
                if (8 > i / 2) {
                    i2 = i / 2;
                }
                if (i - I.length <= i2) {
                    i iVar2 = c1Var.d;
                    if (iVar2 != null) {
                        this.b.init(true, iVar2);
                    }
                    reset();
                    return;
                }
                StringBuilder P0 = a.P0("CTR/SIC mode requires IV of at least: ");
                P0.append(this.c - i2);
                P0.append(" bytes.");
                throw new IllegalArgumentException(P0.toString());
            }
            throw new IllegalArgumentException(a.u0(a.P0("CTR/SIC mode requires IV no greater than: "), this.c, " bytes."));
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    public void reset() {
        Arrays.fill(this.e, (byte) 0);
        byte[] bArr = this.d;
        System.arraycopy(bArr, 0, this.e, 0, bArr.length);
        this.b.reset();
        this.g = 0;
    }
}
