package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class g0 extends FilterInputStream {
    public final r1 c = new r1();
    public byte[] d = new byte[4096];
    public long q;
    public boolean x = false;
    public boolean y = false;

    public g0(InputStream inputStream) {
        super(inputStream);
    }

    public final m2 a() throws IOException {
        byte[] bArr;
        if (this.q > 0) {
            do {
                bArr = this.d;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.x || this.y) {
            return new m2((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!b(30)) {
            this.x = true;
            return this.c.b();
        }
        m2 b = this.c.b();
        if (b.e) {
            this.y = true;
            return b;
        } else if (b.b != 4294967295L) {
            int i = this.c.f - 30;
            long j = (long) i;
            int length = this.d.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.d = Arrays.copyOf(this.d, length);
            }
            if (!b(i)) {
                this.x = true;
                return this.c.b();
            }
            m2 b2 = this.c.b();
            this.q = b2.b;
            return b2;
        } else {
            throw new bv("Files bigger than 4GiB are not supported.");
        }
    }

    public final boolean b(int i) throws IOException {
        int e = e(this.d, 0, i);
        if (e != i) {
            int i2 = i - e;
            if (e(this.d, e, i2) != i2) {
                this.c.a(this.d, 0, e);
                return false;
            }
        }
        this.c.a(this.d, 0, i);
        return true;
    }

    public final int e(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.q;
        if (j <= 0 || this.x) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, (long) i2)));
        this.q -= (long) max;
        if (max != 0) {
            return max;
        }
        this.x = true;
        return 0;
    }
}
