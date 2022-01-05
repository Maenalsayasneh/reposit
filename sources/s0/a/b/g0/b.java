package s0.a.b.g0;

import java.io.IOException;
import java.io.OutputStream;
import s0.a.b.n;

public class b extends OutputStream {
    public n c;

    public b(n nVar) {
        this.c = nVar;
    }

    public void write(int i) throws IOException {
        this.c.update((byte) i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.c.update(bArr, i, i2);
    }
}
