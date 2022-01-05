package s0.a.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import s0.a.g.l.a;

public class u1 extends z1 {
    public static final byte[] q = new byte[0];
    public final int x;
    public int y;

    public u1(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i >= 0) {
            this.x = i;
            this.y = i;
            if (i == 0) {
                a(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    public byte[] b() throws IOException {
        int i = this.y;
        if (i == 0) {
            return q;
        }
        int i2 = this.d;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int b = i - a.b(this.c, bArr, 0, i);
            this.y = b;
            if (b == 0) {
                a(true);
                return bArr;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("DEF length ");
            P0.append(this.x);
            P0.append(" object truncated by ");
            P0.append(this.y);
            throw new EOFException(P0.toString());
        }
        StringBuilder P02 = i0.d.a.a.a.P0("corrupted stream - out of bounds length found: ");
        P02.append(this.y);
        P02.append(" >= ");
        P02.append(i2);
        throw new IOException(P02.toString());
    }

    public int read() throws IOException {
        if (this.y == 0) {
            return -1;
        }
        int read = this.c.read();
        if (read >= 0) {
            int i = this.y - 1;
            this.y = i;
            if (i == 0) {
                a(true);
            }
            return read;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("DEF length ");
        P0.append(this.x);
        P0.append(" object truncated by ");
        P0.append(this.y);
        throw new EOFException(P0.toString());
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.y;
        if (i3 == 0) {
            return -1;
        }
        int read = this.c.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.y - read;
            this.y = i4;
            if (i4 == 0) {
                a(true);
            }
            return read;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("DEF length ");
        P0.append(this.x);
        P0.append(" object truncated by ");
        P0.append(this.y);
        throw new EOFException(P0.toString());
    }
}
