package s0.a.b.j0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class g implements a {
    public SecureRandom a = null;

    public int a(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            SecureRandom secureRandom = this.a;
            if (secureRandom == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) secureRandom.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }

    public int b(byte[] bArr) throws InvalidCipherTextException {
        byte b = bArr[bArr.length - 1] & 255;
        if (b <= bArr.length) {
            return b;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    public void c(SecureRandom secureRandom) throws IllegalArgumentException {
        this.a = secureRandom;
    }
}
