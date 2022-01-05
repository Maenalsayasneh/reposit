package s0.a.c.m;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

public class c extends OutputStream {
    public Signature c;

    public c(Signature signature) {
        this.c = signature;
    }

    public void write(int i) throws IOException {
        try {
            this.c.update((byte) i);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void write(byte[] bArr) throws IOException {
        try {
            this.c.update(bArr);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.c.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }
}
