package s0.a.a.d3;

import java.math.BigInteger;
import s0.a.e.b.e;

public class l {
    public int a(e eVar) {
        return (eVar.l() + 7) / 8;
    }

    public byte[] b(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        } else if (i <= byteArray.length) {
            return byteArray;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            return bArr2;
        }
    }
}
