package i0.h.a.b.g.f;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class b extends FilterInputStream {
    public long c;
    public long d = -1;

    public b(InputStream inputStream) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        this.c = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.c);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.d = this.c;
    }

    public final int read() throws IOException {
        if (this.c == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.c--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.d != -1) {
            this.in.reset();
            this.c = this.d;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.c));
        this.c -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.c -= (long) read;
        }
        return read;
    }
}
