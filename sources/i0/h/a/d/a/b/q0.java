package i0.h.a.d.a.b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class q0 extends OutputStream {
    public FileOutputStream Y1;
    public m2 Z1;
    public final r1 c = new r1();
    public final File d;
    public final g2 q;
    public long x;
    public long y;

    public q0(File file, g2 g2Var) {
        this.d = file;
        this.q = g2Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.x == 0 && this.y == 0) {
                int a = this.c.a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    m2 b = this.c.b();
                    this.Z1 = b;
                    if (b.e) {
                        this.x = 0;
                        g2 g2Var = this.q;
                        byte[] bArr2 = b.f;
                        g2Var.k(bArr2, bArr2.length);
                        this.y = (long) this.Z1.f.length;
                    } else if (!b.b() || this.Z1.a()) {
                        byte[] bArr3 = this.Z1.f;
                        this.q.k(bArr3, bArr3.length);
                        this.x = this.Z1.b;
                    } else {
                        this.q.f(this.Z1.f);
                        File file = new File(this.d, this.Z1.a);
                        file.getParentFile().mkdirs();
                        this.x = this.Z1.b;
                        this.Y1 = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.Z1.a()) {
                m2 m2Var = this.Z1;
                if (m2Var.e) {
                    this.q.h(this.y, bArr, i, i2);
                    this.y += (long) i2;
                    i3 = i2;
                } else if (m2Var.b()) {
                    i3 = (int) Math.min((long) i2, this.x);
                    this.Y1.write(bArr, i, i3);
                    long j = this.x - ((long) i3);
                    this.x = j;
                    if (j == 0) {
                        this.Y1.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.x);
                    m2 m2Var2 = this.Z1;
                    int length = m2Var2.f.length;
                    long j2 = m2Var2.b;
                    this.q.h((((long) length) + j2) - this.x, bArr, i, i3);
                    this.x -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
