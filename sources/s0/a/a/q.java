package s0.a.a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

public class q {
    public OutputStream a;

    public q(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static q a(OutputStream outputStream, String str) {
        return str.equals("DER") ? new z0(outputStream) : str.equals("DL") ? new n1(outputStream) : new q(outputStream);
    }

    public z0 b() {
        return new z0(this.a);
    }

    public q c() {
        return new n1(this.a);
    }

    public final void d(Enumeration enumeration) throws IOException {
        while (enumeration.hasMoreElements()) {
            l(((e) enumeration.nextElement()).c(), true);
        }
    }

    public final void e(boolean z, int i, byte b, byte[] bArr) throws IOException {
        if (z) {
            this.a.write(i);
        }
        i(bArr.length + 1);
        this.a.write(b);
        this.a.write(bArr, 0, bArr.length);
    }

    public final void f(boolean z, int i, int i2, byte[] bArr) throws IOException {
        m(z, i, i2);
        i(bArr.length);
        this.a.write(bArr, 0, bArr.length);
    }

    public final void g(boolean z, int i, byte[] bArr) throws IOException {
        if (z) {
            this.a.write(i);
        }
        i(bArr.length);
        this.a.write(bArr, 0, bArr.length);
    }

    public final void h(boolean z, int i, e[] eVarArr) throws IOException {
        if (z) {
            this.a.write(i);
        }
        this.a.write(128);
        for (e c : eVarArr) {
            l(c.c(), true);
        }
        this.a.write(0);
        this.a.write(0);
    }

    public final void i(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            this.a.write((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                this.a.write((byte) (i >> i4));
            }
            return;
        }
        this.a.write((byte) i);
    }

    public void j(e eVar) throws IOException {
        if (eVar != null) {
            l(eVar.c(), true);
            return;
        }
        throw new IOException("null object detected");
    }

    public void k(r rVar) throws IOException {
        if (rVar != null) {
            l(rVar, true);
            return;
        }
        throw new IOException("null object detected");
    }

    public void l(r rVar, boolean z) throws IOException {
        rVar.t(this, z);
    }

    public final void m(boolean z, int i, int i2) throws IOException {
        if (z) {
            if (i2 < 31) {
                this.a.write(i | i2);
                return;
            }
            this.a.write(31 | i);
            if (i2 < 128) {
                this.a.write(i2);
                return;
            }
            byte[] bArr = new byte[5];
            int i3 = 4;
            bArr[4] = (byte) (i2 & 127);
            do {
                i2 >>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            } while (i2 > 127);
            this.a.write(bArr, i3, 5 - i3);
        }
    }
}
