package i0.h.a.d.a.b;

import java.io.IOException;
import java.io.InputStream;

public final class a0 extends InputStream {
    public final InputStream c;
    public long d;

    public a0(InputStream inputStream, long j) {
        this.c = inputStream;
        this.d = j;
    }

    public final void close() throws IOException {
        super.close();
        this.c.close();
        this.d = 0;
    }

    public final int read() throws IOException {
        long j = this.d;
        if (j <= 0) {
            return -1;
        }
        this.d = j - 1;
        return this.c.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.d;
        if (j <= 0) {
            return -1;
        }
        int read = this.c.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.d -= (long) read;
        }
        return read;
    }
}
