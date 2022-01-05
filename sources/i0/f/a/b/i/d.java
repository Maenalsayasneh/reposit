package i0.f.a.b.i;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: MergedStream */
public final class d extends InputStream {
    public final b c;
    public final InputStream d;
    public byte[] q;
    public int x;
    public final int y;

    public d(b bVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.c = bVar;
        this.d = inputStream;
        this.q = bArr;
        this.x = i;
        this.y = i2;
    }

    public final void a() {
        byte[] bArr = this.q;
        if (bArr != null) {
            this.q = null;
            b bVar = this.c;
            if (bVar != null) {
                bVar.g(bArr);
            }
        }
    }

    public int available() throws IOException {
        if (this.q != null) {
            return this.y - this.x;
        }
        return this.d.available();
    }

    public void close() throws IOException {
        a();
        this.d.close();
    }

    public synchronized void mark(int i) {
        if (this.q == null) {
            this.d.mark(i);
        }
    }

    public boolean markSupported() {
        return this.q == null && this.d.markSupported();
    }

    public int read() throws IOException {
        byte[] bArr = this.q;
        if (bArr == null) {
            return this.d.read();
        }
        int i = this.x;
        int i2 = i + 1;
        this.x = i2;
        byte b = bArr[i] & 255;
        if (i2 >= this.y) {
            a();
        }
        return b;
    }

    public synchronized void reset() throws IOException {
        if (this.q == null) {
            this.d.reset();
        }
    }

    public long skip(long j) throws IOException {
        long j2;
        if (this.q != null) {
            int i = this.y;
            int i2 = this.x;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this.x = i2 + ((int) j);
                return j;
            }
            a();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.d.skip(j) : j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.q;
        if (bArr2 == null) {
            return this.d.read(bArr, i, i2);
        }
        int i3 = this.y;
        int i4 = this.x;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(bArr2, i4, bArr, i, i2);
        int i6 = this.x + i2;
        this.x = i6;
        if (i6 >= this.y) {
            a();
        }
        return i2;
    }
}
