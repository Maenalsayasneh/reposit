package s0.a.b.e0;

import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i;
import s0.a.b.k0.d1;
import s0.a.b.k0.y0;
import s0.a.b.y;

public class s implements y {
    public boolean a;
    public r b;
    public byte[] c;
    public byte[] d = new byte[4];
    public byte[] e;
    public byte[] f;
    public ArrayList<byte[]> g = new ArrayList<>();

    public s(int i) {
        r rVar = new r(i);
        this.b = rVar;
        int i2 = rVar.l;
        this.c = new byte[((i2 << 3) / 2)];
        this.e = new byte[(i2 << 3)];
        this.f = new byte[(i2 << 3)];
    }

    public byte[] a(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.a) {
            int i3 = this.b.l;
            if (i2 % (i3 << 3) == 0) {
                int i4 = (i2 * 2) / (i3 << 3);
                int i5 = i4 - 1;
                int i6 = i5 * 6;
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                int i7 = this.b.l;
                byte[] bArr3 = new byte[((i7 << 3) / 2)];
                System.arraycopy(bArr2, 0, bArr3, 0, (i7 << 3) / 2);
                this.g.clear();
                int i8 = this.b.l;
                int i9 = i2 - ((i8 << 3) / 2);
                int i10 = (i8 << 3) / 2;
                while (i9 != 0) {
                    int i11 = this.b.l;
                    byte[] bArr4 = new byte[((i11 << 3) / 2)];
                    System.arraycopy(bArr2, i10, bArr4, 0, (i11 << 3) / 2);
                    this.g.add(bArr4);
                    int i12 = this.b.l;
                    i9 -= (i12 << 3) / 2;
                    i10 += (i12 << 3) / 2;
                }
                for (int i13 = 0; i13 < i6; i13++) {
                    System.arraycopy(this.g.get(i4 - 2), 0, bArr2, 0, (this.b.l << 3) / 2);
                    int i14 = this.b.l;
                    System.arraycopy(bArr3, 0, bArr2, (i14 << 3) / 2, (i14 << 3) / 2);
                    c(i6 - i13, this.d, 0);
                    for (int i15 = 0; i15 < 4; i15++) {
                        int i16 = ((this.b.l << 3) / 2) + i15;
                        bArr2[i16] = (byte) (bArr2[i16] ^ this.d[i15]);
                    }
                    this.b.a(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr3, 0, (this.b.l << 3) / 2);
                    for (int i17 = 2; i17 < i4; i17++) {
                        int i18 = i4 - i17;
                        System.arraycopy(this.g.get(i18 - 1), 0, this.g.get(i18), 0, (this.b.l << 3) / 2);
                    }
                    System.arraycopy(bArr2, (this.b.l << 3) / 2, this.g.get(0), 0, (this.b.l << 3) / 2);
                }
                System.arraycopy(bArr3, 0, bArr2, 0, (this.b.l << 3) / 2);
                int i19 = (this.b.l << 3) / 2;
                for (int i20 = 0; i20 < i5; i20++) {
                    System.arraycopy(this.g.get(i20), 0, bArr2, i19, (this.b.l << 3) / 2);
                    i19 += (this.b.l << 3) / 2;
                }
                int i21 = this.b.l;
                System.arraycopy(bArr2, i2 - (i21 << 3), this.e, 0, i21 << 3);
                byte[] bArr5 = new byte[(i2 - (this.b.l << 3))];
                if (Arrays.equals(this.e, this.f)) {
                    System.arraycopy(bArr2, 0, bArr5, 0, i2 - (this.b.l << 3));
                    return bArr5;
                }
                throw new InvalidCipherTextException("checksum failed");
            }
            throw new DataLengthException(a.u0(a.P0("unwrap data must be a multiple of "), this.b.l << 3, " bytes"));
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = this.b.l;
            if (i2 % (i3 << 3) != 0) {
                throw new DataLengthException(a.u0(a.P0("wrap data must be a multiple of "), this.b.l << 3, " bytes"));
            } else if (i + i2 <= bArr.length) {
                int i4 = ((i2 / (i3 << 3)) + 1) * 2;
                int i5 = i4 - 1;
                int i6 = i5 * 6;
                int i7 = (i3 << 3) + i2;
                byte[] bArr2 = new byte[i7];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                System.arraycopy(bArr2, 0, this.c, 0, (this.b.l << 3) / 2);
                this.g.clear();
                int i8 = this.b.l;
                int i9 = i7 - ((i8 << 3) / 2);
                int i10 = (i8 << 3) / 2;
                while (i9 != 0) {
                    int i11 = this.b.l;
                    byte[] bArr3 = new byte[((i11 << 3) / 2)];
                    System.arraycopy(bArr2, i10, bArr3, 0, (i11 << 3) / 2);
                    this.g.add(bArr3);
                    int i12 = this.b.l;
                    i9 -= (i12 << 3) / 2;
                    i10 += (i12 << 3) / 2;
                }
                int i13 = 0;
                while (i13 < i6) {
                    System.arraycopy(this.c, 0, bArr2, 0, (this.b.l << 3) / 2);
                    byte[] bArr4 = this.g.get(0);
                    int i14 = this.b.l;
                    System.arraycopy(bArr4, 0, bArr2, (i14 << 3) / 2, (i14 << 3) / 2);
                    this.b.a(bArr2, 0, bArr2, 0);
                    i13++;
                    c(i13, this.d, 0);
                    for (int i15 = 0; i15 < 4; i15++) {
                        int i16 = ((this.b.l << 3) / 2) + i15;
                        bArr2[i16] = (byte) (bArr2[i16] ^ this.d[i15]);
                    }
                    int i17 = this.b.l;
                    System.arraycopy(bArr2, (i17 << 3) / 2, this.c, 0, (i17 << 3) / 2);
                    for (int i18 = 2; i18 < i4; i18++) {
                        System.arraycopy(this.g.get(i18 - 1), 0, this.g.get(i18 - 2), 0, (this.b.l << 3) / 2);
                    }
                    System.arraycopy(bArr2, 0, this.g.get(i4 - 2), 0, (this.b.l << 3) / 2);
                }
                System.arraycopy(this.c, 0, bArr2, 0, (this.b.l << 3) / 2);
                int i19 = (this.b.l << 3) / 2;
                for (int i20 = 0; i20 < i5; i20++) {
                    System.arraycopy(this.g.get(i20), 0, bArr2, i19, (this.b.l << 3) / 2);
                    i19 += (this.b.l << 3) / 2;
                }
                return bArr2;
            } else {
                throw new DataLengthException("input buffer too short");
            }
        } else {
            throw new IllegalStateException("not set for wrapping");
        }
    }

    public final void c(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
    }

    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    public void init(boolean z, i iVar) {
        if (iVar instanceof d1) {
            iVar = ((d1) iVar).d;
        }
        this.a = z;
        if (iVar instanceof y0) {
            this.b.init(z, iVar);
            return;
        }
        throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
    }
}
