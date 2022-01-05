package s0.a.a;

import java.io.IOException;
import java.util.Date;
import s0.a.g.j;

public class s0 extends i {
    public s0(Date date) {
        super(date);
    }

    public s0(byte[] bArr) {
        super(bArr);
    }

    public r A() {
        return this;
    }

    public final byte[] M() {
        byte[] bArr = this.c;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!I()) {
            byte[] bArr2 = this.c;
            byte[] bArr3 = new byte[(bArr2.length + 4)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(j.c("0000Z"), 0, bArr3, this.c.length - 1, 5);
            return bArr3;
        } else if (!J()) {
            byte[] bArr4 = this.c;
            byte[] bArr5 = new byte[(bArr4.length + 2)];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(j.c("00Z"), 0, bArr5, this.c.length - 1, 3);
            return bArr5;
        } else if (!H()) {
            return this.c;
        } else {
            int length = this.c.length - 2;
            while (length > 0 && this.c[length] == 48) {
                length--;
            }
            byte[] bArr6 = this.c;
            if (bArr6[length] == 46) {
                byte[] bArr7 = new byte[(length + 1)];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr7[length] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[(length + 2)];
            int i = length + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i);
            bArr8[i] = 90;
            return bArr8;
        }
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 24, M());
    }

    public int u() {
        int length = M().length;
        return a2.a(length) + 1 + length;
    }

    public r z() {
        return this;
    }
}
