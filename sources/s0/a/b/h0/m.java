package s0.a.b.h0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.e.b.b0.c.h3;

public class m extends n {
    public m() {
    }

    public m(int i, int i2) {
        super(i, i2);
    }

    public long b() throws DataLengthException, IllegalStateException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        long j = this.i;
        int i2 = this.j;
        long j2 = j >>> ((7 - i2) << 3);
        this.i = j2;
        long j3 = j2 >>> 8;
        this.i = j3;
        this.i = j3 | ((((long) ((this.k << 3) + i2)) & 255) << 56);
        c();
        this.g ^= 238;
        a(this.b);
        long j4 = this.e;
        long j5 = this.f;
        long j6 = ((j4 ^ j5) ^ this.g) ^ this.h;
        this.f = j5 ^ 221;
        a(this.b);
        reset();
        h3.m2(j6, bArr, i);
        h3.m2(((this.e ^ this.f) ^ this.g) ^ this.h, bArr, i + 8);
        return 16;
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("SipHash128-");
        P0.append(this.a);
        P0.append("-");
        P0.append(this.b);
        return P0.toString();
    }

    public int getMacSize() {
        return 16;
    }

    public void reset() {
        super.reset();
        this.f ^= 238;
    }
}
