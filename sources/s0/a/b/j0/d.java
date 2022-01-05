package s0.a.b.j0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class d implements a {
    public int a(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    public int b(byte[] bArr) throws InvalidCipherTextException {
        byte b = bArr[bArr.length - 1] & 255;
        byte b2 = (byte) b;
        boolean z = (b > bArr.length) | (b == 0);
        for (int i = 0; i < bArr.length; i++) {
            z |= (bArr.length - i <= b) & (bArr[i] != b2);
        }
        if (!z) {
            return b;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    public void c(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
