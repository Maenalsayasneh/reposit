package s0.a.b.n0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import s0.a.b.i;
import s0.a.b.k0.h0;
import s0.a.b.k0.i0;
import s0.a.b.v;
import s0.a.e.b.b0.c.h3;

public class j implements v {
    public final b g = new b((a) null);
    public final byte[] h;
    public boolean i;
    public h0 j;
    public i0 k;

    public static class b extends ByteArrayOutputStream {
        public b(a aVar) {
        }

        public synchronized byte[] a(h0 h0Var, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            h0Var.b(0, bArr, this.buf, 0, this.count, bArr2, 0);
            reset();
            return bArr2;
        }

        public synchronized boolean b(i0 i0Var, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                reset();
                return false;
            }
            boolean w = s0.a.e.b.e0.b.w(bArr2, 0, i0Var.getEncoded(), 0, bArr, this.buf, 0, this.count);
            reset();
            return w;
        }

        public synchronized void reset() {
            Arrays.fill(this.buf, 0, this.count, (byte) 0);
            this.count = 0;
        }
    }

    public j(byte[] bArr) {
        this.h = h3.I(bArr);
    }

    public boolean a(byte[] bArr) {
        i0 i0Var;
        if (!this.i && (i0Var = this.k) != null) {
            return this.g.b(i0Var, this.h, bArr);
        }
        throw new IllegalStateException("Ed448Signer not initialised for verification");
    }

    public byte[] b() {
        h0 h0Var;
        if (this.i && (h0Var = this.j) != null) {
            return this.g.a(h0Var, this.h);
        }
        throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
    }

    public void init(boolean z, i iVar) {
        this.i = z;
        if (z) {
            this.j = (h0) iVar;
            this.k = null;
        } else {
            this.j = null;
            this.k = (i0) iVar;
        }
        this.g.reset();
    }

    public void update(byte b2) {
        this.g.write(b2);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.g.write(bArr, i2, i3);
    }
}
