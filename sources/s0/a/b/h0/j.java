package s0.a.b.h0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;

public class j {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public int d;
    public e e = null;

    public j(e eVar, int i) {
        this.e = eVar;
        this.d = i / 8;
        this.a = new byte[eVar.b()];
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.d;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            this.e.a(this.b, 0, this.c, 0);
            int i4 = 0;
            while (true) {
                int i5 = this.d;
                if (i4 < i5) {
                    bArr2[i2 + i4] = (byte) (this.c[i4] ^ bArr[i + i4]);
                    i4++;
                } else {
                    byte[] bArr3 = this.b;
                    System.arraycopy(bArr3, i5, bArr3, 0, bArr3.length - i5);
                    byte[] bArr4 = this.b;
                    int length = bArr4.length;
                    int i6 = this.d;
                    System.arraycopy(bArr2, i2, bArr4, length - i6, i6);
                    return this.d;
                }
            }
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void b() {
        byte[] bArr = this.a;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        this.e.reset();
    }
}
