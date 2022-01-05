package s0.a.g.l;

import java.io.IOException;
import java.io.OutputStream;

public class b extends OutputStream {
    public OutputStream c;
    public OutputStream d;

    public b(OutputStream outputStream, OutputStream outputStream2) {
        this.c = outputStream;
        this.d = outputStream2;
    }

    public void close() throws IOException {
        this.c.close();
        this.d.close();
    }

    public void flush() throws IOException {
        this.c.flush();
        this.d.flush();
    }

    public void write(int i) throws IOException {
        this.c.write(i);
        this.d.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        this.c.write(bArr);
        this.d.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.c.write(bArr, i, i2);
        this.d.write(bArr, i, i2);
    }
}
