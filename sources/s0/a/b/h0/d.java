package s0.a.b.h0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.b0.c;
import s0.a.b.i;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.e.b.b0.c.h3;

public class d implements s {
    public c a;
    public int b;
    public byte[] c = null;
    public byte[] d = null;
    public long e;

    public d(int i) {
        this.a = new c(i);
        this.b = i / 8;
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        if (this.c == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        } else if (bArr.length - i >= this.b) {
            int i2 = this.a.f;
            long j = this.e;
            int i3 = i2 - ((int) (j % ((long) i2)));
            if (i3 < 13) {
                i3 += i2;
            }
            byte[] bArr2 = new byte[i3];
            bArr2[0] = Byte.MIN_VALUE;
            h3.m2(j * 8, bArr2, i3 - 12);
            this.a.update(bArr2, 0, i3);
            c cVar = this.a;
            byte[] bArr3 = this.d;
            cVar.update(bArr3, 0, bArr3.length);
            this.e = 0;
            int doFinal = this.a.doFinal(bArr, i);
            reset();
            return doFinal;
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    public int getMacSize() {
        return this.b;
    }

    public void init(i iVar) throws IllegalArgumentException {
        this.c = null;
        reset();
        if (iVar instanceof y0) {
            byte[] bArr = ((y0) iVar).c;
            this.d = new byte[bArr.length];
            int length = bArr.length;
            int i = this.a.f;
            int i2 = (((length + i) - 1) / i) * i;
            if (i2 - bArr.length < 13) {
                i2 += i;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr2[bArr.length] = Byte.MIN_VALUE;
            h3.D1(bArr.length * 8, bArr2, i2 - 12);
            this.c = bArr2;
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.d;
                if (i3 < bArr3.length) {
                    bArr3[i3] = (byte) (~bArr[i3]);
                    i3++;
                } else {
                    c cVar = this.a;
                    byte[] bArr4 = this.c;
                    cVar.update(bArr4, 0, bArr4.length);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Bad parameter passed");
        }
    }

    public void reset() {
        this.e = 0;
        this.a.reset();
        byte[] bArr = this.c;
        if (bArr != null) {
            this.a.update(bArr, 0, bArr.length);
        }
    }

    public void update(byte b2) throws IllegalStateException {
        this.a.update(b2);
        this.e++;
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (bArr.length - i < i2) {
            throw new DataLengthException("Input buffer too short");
        } else if (this.c != null) {
            this.a.update(bArr, i, i2);
            this.e += (long) i2;
        } else {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
    }
}
