package s0.a.b.g0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import s0.a.b.s;

public class c extends FilterInputStream {
    public s c;

    public c(InputStream inputStream, s sVar) {
        super(inputStream);
        this.c = sVar;
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.c.update((byte) read);
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read >= 0) {
            this.c.update(bArr, i, read);
        }
        return read;
    }
}
