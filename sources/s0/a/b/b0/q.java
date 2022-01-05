package s0.a.b.b0;

import java.io.ByteArrayOutputStream;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public class q implements n {
    public b a = new b((a) null);

    public static class b extends ByteArrayOutputStream {
        public b(a aVar) {
        }

        public void a(byte[] bArr, int i) {
            System.arraycopy(this.buf, 0, bArr, i, size());
        }

        public void reset() {
            super.reset();
            h3.H(this.buf);
        }
    }

    public int doFinal(byte[] bArr, int i) {
        int size = this.a.size();
        this.a.a(bArr, i);
        this.a.reset();
        return size;
    }

    public String getAlgorithmName() {
        return "NULL";
    }

    public int getDigestSize() {
        return this.a.size();
    }

    public void reset() {
        this.a.reset();
    }

    public void update(byte b2) {
        this.a.write(b2);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
