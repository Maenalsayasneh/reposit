package s0.a.a;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class n0 extends r implements y {
    public final char[] c;

    public n0(String str) {
        Objects.requireNonNull(str, "'string' cannot be null");
        this.c = str.toCharArray();
    }

    public n0(char[] cArr) {
        this.c = cArr;
    }

    public String e() {
        return new String(this.c);
    }

    public int hashCode() {
        char[] cArr = this.c;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof n0)) {
            return false;
        }
        return Arrays.equals(this.c, ((n0) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        int length = this.c.length;
        if (z) {
            qVar.a.write(30);
        }
        qVar.i(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.c;
            char c2 = cArr[i2];
            char c3 = cArr[i2 + 1];
            char c4 = cArr[i2 + 2];
            char c5 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c2 >> 8);
            bArr[1] = (byte) c2;
            bArr[2] = (byte) (c3 >> 8);
            bArr[3] = (byte) c3;
            bArr[4] = (byte) (c4 >> 8);
            bArr[5] = (byte) c4;
            bArr[6] = (byte) (c5 >> 8);
            bArr[7] = (byte) c5;
            qVar.a.write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c6 = this.c[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c6 >> 8);
                i3 = i4 + 1;
                bArr[i4] = (byte) c6;
            } while (i2 < length);
            qVar.a.write(bArr, 0, i3);
        }
    }

    public String toString() {
        return e();
    }

    public int u() {
        return (this.c.length * 2) + a2.a(this.c.length * 2) + 1;
    }

    public boolean y() {
        return false;
    }
}
