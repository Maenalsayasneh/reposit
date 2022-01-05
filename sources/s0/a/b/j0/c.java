package s0.a.b.j0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class c implements a {
    public int a(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }

    public int b(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    public void c(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
