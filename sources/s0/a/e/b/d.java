package s0.a.e.b;

import java.math.BigInteger;

public class d extends a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ e d;

    public d(e eVar, int i, int i2, byte[] bArr) {
        this.d = eVar;
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public int a() {
        return this.a;
    }

    public h b(int i) {
        int i2;
        int i3 = this.b;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = ((i5 ^ i) - 1) >> 31;
            int i7 = 0;
            while (true) {
                i2 = this.b;
                if (i7 >= i2) {
                    break;
                }
                byte b2 = bArr[i7];
                byte[] bArr3 = this.c;
                bArr[i7] = (byte) (b2 ^ (bArr3[i4 + i7] & i6));
                bArr2[i7] = (byte) ((bArr3[(i2 + i4) + i7] & i6) ^ bArr2[i7]);
                i7++;
            }
            i4 += i2 * 2;
        }
        return d(bArr, bArr2);
    }

    public h c(int i) {
        int i2 = this.b;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[i2];
        int i3 = i * i2 * 2;
        int i4 = 0;
        while (true) {
            int i5 = this.b;
            if (i4 >= i5) {
                return d(bArr, bArr2);
            }
            byte[] bArr3 = this.c;
            bArr[i4] = bArr3[i3 + i4];
            bArr2[i4] = bArr3[i5 + i3 + i4];
            i4++;
        }
    }

    public final h d(byte[] bArr, byte[] bArr2) {
        e eVar = this.d;
        return eVar.f(eVar.k(new BigInteger(1, bArr)), this.d.k(new BigInteger(1, bArr2)));
    }
}
