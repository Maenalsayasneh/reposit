package s0.a.b.e0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.y0;

public class w0 implements e {
    public static final int[] a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public boolean b = false;
    public int[] c = null;

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        byte[] bArr3 = bArr;
        int i3 = i;
        byte[] bArr4 = bArr2;
        int i4 = i2;
        if (this.c == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        } else if (i3 + 32 > bArr3.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i4 + 32 > bArr4.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (this.b) {
            int[] iArr = new int[8];
            c(bArr3, iArr, i3, 0);
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = ((((iArr[4] >>> 6) | (iArr[4] << -6)) ^ ((iArr[4] >>> 11) | (iArr[4] << -11))) ^ ((iArr[4] >>> 25) | (iArr[4] << -25))) + ((iArr[4] & iArr[5]) ^ ((~iArr[4]) & iArr[6])) + iArr[7] + a[i5] + this.c[i5];
                iArr[7] = iArr[6];
                iArr[6] = iArr[5];
                iArr[5] = iArr[4];
                iArr[4] = iArr[3] + i6;
                iArr[3] = iArr[2];
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i6 + ((((iArr[0] >>> 2) | (iArr[0] << -2)) ^ ((iArr[0] >>> 13) | (iArr[0] << -13))) ^ ((iArr[0] >>> 22) | (iArr[0] << -22))) + (((iArr[0] & iArr[2]) ^ (iArr[0] & iArr[3])) ^ (iArr[2] & iArr[3]));
            }
            d(iArr, bArr4, i4);
            return 32;
        } else {
            int[] iArr2 = new int[8];
            c(bArr3, iArr2, i3, 0);
            for (int i7 = 63; i7 > -1; i7--) {
                int i8 = (iArr2[0] - ((((iArr2[1] >>> 2) | (iArr2[1] << -2)) ^ ((iArr2[1] >>> 13) | (iArr2[1] << -13))) ^ ((iArr2[1] >>> 22) | (iArr2[1] << -22)))) - (((iArr2[1] & iArr2[2]) ^ (iArr2[1] & iArr2[3])) ^ (iArr2[2] & iArr2[3]));
                iArr2[0] = iArr2[1];
                iArr2[1] = iArr2[2];
                iArr2[2] = iArr2[3];
                iArr2[3] = iArr2[4] - i8;
                iArr2[4] = iArr2[5];
                iArr2[5] = iArr2[6];
                iArr2[6] = iArr2[7];
                iArr2[7] = (((i8 - a[i7]) - this.c[i7]) - ((((iArr2[4] >>> 6) | (iArr2[4] << -6)) ^ ((iArr2[4] >>> 11) | (iArr2[4] << -11))) ^ ((iArr2[4] >>> 25) | (iArr2[4] << -25)))) - ((iArr2[4] & iArr2[5]) ^ ((~iArr2[4]) & iArr2[6]));
            }
            d(iArr2, bArr4, i4);
            return 32;
        }
    }

    public int b() {
        return 32;
    }

    public final void c(byte[] bArr, int[] iArr, int i, int i2) {
        while (i2 < 8) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            iArr[i2] = b2 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            i2++;
            i = i5 + 1;
        }
    }

    public final void d(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = i + 1;
            bArr[i] = (byte) (iArr[i2] >>> 24);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (iArr[i2] >>> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (iArr[i2] >>> 8);
            i = i5 + 1;
            bArr[i5] = (byte) iArr[i2];
        }
    }

    public String getAlgorithmName() {
        return "Shacal2";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        if (iVar instanceof y0) {
            this.b = z;
            int[] iArr = new int[64];
            this.c = iArr;
            byte[] bArr = ((y0) iVar).c;
            if (bArr.length != 0 && bArr.length <= 64) {
                if (bArr.length >= 16 && bArr.length % 8 == 0) {
                    int i = 0;
                    int i2 = 0;
                    while (i < bArr.length / 4) {
                        int i3 = i2 + 1;
                        int i4 = i3 + 1;
                        byte b2 = ((bArr[i2] & 255) << 24) | ((bArr[i3] & 255) << 16);
                        int i5 = i4 + 1;
                        iArr[i] = b2 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                        i++;
                        i2 = i5 + 1;
                    }
                    for (int i6 = 16; i6 < 64; i6++) {
                        int[] iArr2 = this.c;
                        int i7 = i6 - 2;
                        int i8 = i6 - 15;
                        iArr2[i6] = ((iArr2[i7] >>> 10) ^ (((iArr2[i7] >>> 17) | (iArr2[i7] << -17)) ^ ((iArr2[i7] >>> 19) | (iArr2[i7] << -19)))) + iArr2[i6 - 7] + ((iArr2[i8] >>> 3) ^ (((iArr2[i8] >>> 7) | (iArr2[i8] << -7)) ^ ((iArr2[i8] >>> 18) | (iArr2[i8] << -18)))) + iArr2[i6 - 16];
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
        }
        throw new IllegalArgumentException("only simple KeyParameter expected.");
    }

    public void reset() {
    }
}
