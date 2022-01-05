package s0.a.c.m;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

public class a extends FilterInputStream {
    public int Y1;
    public final Cipher c;
    public final byte[] d = new byte[512];
    public boolean q = false;
    public byte[] x;
    public int y;

    public a(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.c = cipher;
    }

    public final byte[] a() throws InvalidCipherTextIOException {
        try {
            if (this.q) {
                return null;
            }
            this.q = true;
            return this.c.doFinal();
        } catch (GeneralSecurityException e) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e);
        }
    }

    public int available() throws IOException {
        return this.y - this.Y1;
    }

    public final int b() throws IOException {
        if (this.q) {
            return -1;
        }
        this.Y1 = 0;
        this.y = 0;
        while (true) {
            int i = this.y;
            if (i != 0) {
                return i;
            }
            int read = this.in.read(this.d);
            if (read == -1) {
                byte[] a = a();
                this.x = a;
                if (a == null || a.length == 0) {
                    return -1;
                }
                int length = a.length;
                this.y = length;
                return length;
            }
            byte[] update = this.c.update(this.d, 0, read);
            this.x = update;
            if (update != null) {
                this.y = update.length;
            }
        }
    }

    public void close() throws IOException {
        try {
            this.in.close();
            this.Y1 = 0;
            this.y = 0;
        } finally {
            if (!this.q) {
                a();
            }
        }
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        if (this.Y1 >= this.y && b() < 0) {
            return -1;
        }
        byte[] bArr = this.x;
        int i = this.Y1;
        this.Y1 = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.Y1 >= this.y && b() < 0) {
            return -1;
        }
        int min = Math.min(i2, available());
        System.arraycopy(this.x, this.Y1, bArr, i, min);
        this.Y1 += min;
        return min;
    }

    public void reset() throws IOException {
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        int min = (int) Math.min(j, (long) available());
        this.Y1 += min;
        return (long) min;
    }
}
