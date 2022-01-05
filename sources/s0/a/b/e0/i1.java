package s0.a.b.e0;

import i0.d.a.a.a;
import s0.a.g.f;

public class i1 extends g1 {
    public static final byte[] k = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    public static final byte[] l = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    public static final byte[] m = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    public static final byte[] n = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    public byte[] o;

    public i1() {
        this.o = k;
    }

    public i1(int i) {
        if (i == 32) {
            this.o = l;
        } else if (i == 64) {
            this.o = m;
        } else if (i == 128) {
            this.o = n;
        } else {
            throw new IllegalArgumentException(a.e0("Unsupported length: ", i));
        }
    }

    public i1(i1 i1Var) {
        super(i1Var);
    }

    public static int o(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 23) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public f a() {
        return new i1(this);
    }

    public void c(f fVar) {
        super.c(fVar);
        this.o = ((i1) fVar).o;
    }

    public String getAlgorithmName() {
        return "Zuc-256";
    }

    public int l() {
        return 625;
    }

    public void n(int[] iArr, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3 == null || bArr3.length != 32) {
            throw new IllegalArgumentException("A key of 32 bytes is needed");
        } else if (bArr4 == null || bArr4.length != 25) {
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        } else {
            iArr[0] = o(bArr3[0], this.o[0], bArr3[21], bArr3[16]);
            iArr[1] = o(bArr3[1], this.o[1], bArr3[22], bArr3[17]);
            iArr[2] = o(bArr3[2], this.o[2], bArr3[23], bArr3[18]);
            iArr[3] = o(bArr3[3], this.o[3], bArr3[24], bArr3[19]);
            iArr[4] = o(bArr3[4], this.o[4], bArr3[25], bArr3[20]);
            iArr[5] = o(bArr4[0], (byte) (this.o[5] | (bArr4[17] & 63)), bArr3[5], bArr3[26]);
            iArr[6] = o(bArr4[1], (byte) (this.o[6] | (bArr4[18] & 63)), bArr3[6], bArr3[27]);
            iArr[7] = o(bArr4[10], (byte) (this.o[7] | (bArr4[19] & 63)), bArr3[7], bArr4[2]);
            iArr[8] = o(bArr3[8], (byte) (this.o[8] | (bArr4[20] & 63)), bArr4[3], bArr4[11]);
            iArr[9] = o(bArr3[9], (byte) ((bArr4[21] & 63) | this.o[9]), bArr4[12], bArr4[4]);
            iArr[10] = o(bArr4[5], (byte) (this.o[10] | (bArr4[22] & 63)), bArr3[10], bArr3[28]);
            iArr[11] = o(bArr3[11], (byte) (this.o[11] | (bArr4[23] & 63)), bArr4[6], bArr4[13]);
            iArr[12] = o(bArr3[12], (byte) (this.o[12] | (bArr4[24] & 63)), bArr4[7], bArr4[14]);
            iArr[13] = o(bArr3[13], this.o[13], bArr4[15], bArr4[8]);
            iArr[14] = o(bArr3[14], (byte) (this.o[14] | ((bArr3[31] >>> 4) & 15)), bArr4[16], bArr4[9]);
            iArr[15] = o(bArr3[15], (byte) (this.o[15] | (bArr3[31] & 15)), bArr3[30], bArr3[29]);
        }
    }
}
