package s0.a.b;

import org.bouncycastle.crypto.DataLengthException;

public interface e {
    int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException;

    int b();

    String getAlgorithmName();

    void init(boolean z, i iVar) throws IllegalArgumentException;

    void reset();
}
