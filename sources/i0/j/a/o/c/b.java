package i0.j.a.o.c;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: APMCountableOutputStream */
public class b extends OutputStream {
    public Long c = 0L;
    public OutputStream d;

    public b(OutputStream outputStream) {
        this.d = outputStream;
    }

    public void close() throws IOException {
        this.d.close();
    }

    public void write(int i) throws IOException {
        this.d.write(i);
        this.c = Long.valueOf(this.c.longValue() + 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.d.write(bArr, i, i2);
        this.c = Long.valueOf(this.c.longValue() + ((long) i2));
    }
}
