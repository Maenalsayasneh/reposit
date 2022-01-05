package s0.a.b;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

public abstract class w implements e, x {
    public final e a;

    public w(e eVar) {
        this.a = eVar;
    }

    public abstract byte c(byte b);

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        } else if (i3 + i2 <= bArr2.length) {
            while (i < i4) {
                bArr2[i3] = c(bArr[i]);
                i3++;
                i++;
            }
            return i2;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }
}
