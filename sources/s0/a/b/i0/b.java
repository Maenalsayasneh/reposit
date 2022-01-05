package s0.a.b.i0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i;

public interface b {
    byte[] a();

    void b(byte[] bArr, int i, int i2);

    int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException;

    String getAlgorithmName();

    int getOutputSize(int i);

    int getUpdateOutputSize(int i);

    void init(boolean z, i iVar) throws IllegalArgumentException;

    int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;
}
