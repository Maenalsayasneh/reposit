package s0.a.b.k0;

public class c extends y0 {
    public static byte[] d = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public static boolean a(byte[] bArr, int i) {
        boolean z = false;
        if (bArr.length == 16) {
            for (int i2 = i; i2 != i + 8; i2++) {
                if (bArr[i2] != bArr[i2 + 8]) {
                    z = true;
                }
            }
        } else {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (int i3 = i; i3 != i + 8; i3++) {
                int i4 = i3 + 8;
                z2 |= bArr[i3] != bArr[i4];
                int i5 = i3 + 16;
                z3 |= bArr[i3] != bArr[i5];
                z4 |= bArr[i4] != bArr[i5];
            }
            if (z2 && z3 && z4) {
                return true;
            }
        }
        return z;
    }

    public static boolean b(byte[] bArr, int i) {
        if (bArr.length - i >= 8) {
            int i2 = 0;
            while (i2 < 16) {
                int i3 = 0;
                while (i3 < 8) {
                    if (bArr[i3 + i] != d[(i2 * 8) + i3]) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("key material too short.");
    }

    public static void c(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }
}
