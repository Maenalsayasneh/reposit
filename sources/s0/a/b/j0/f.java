package s0.a.b.j0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class f implements a {
    public int a(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 255;
        if (i <= 0 ? (bArr[bArr.length - 1] & 1) != 0 : (bArr[i - 1] & 1) != 0) {
            i2 = 0;
        }
        byte b = (byte) i2;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    public int b(byte[] bArr) throws InvalidCipherTextException {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }

    public void c(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
