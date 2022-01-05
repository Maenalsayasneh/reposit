package s0.a.b.n0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import s0.a.b.k0.e0;
import s0.a.b.k0.f0;
import s0.a.b.v;

public class i implements v {
    public final b g = new b((a) null);
    public boolean h;
    public e0 i;
    public f0 j;

    public static class b extends ByteArrayOutputStream {
        public b(a aVar) {
        }

        public synchronized byte[] a(e0 e0Var) {
            byte[] bArr;
            bArr = new byte[64];
            e0Var.b(0, (byte[]) null, this.buf, 0, this.count, bArr, 0);
            reset();
            return bArr;
        }

        public synchronized boolean b(f0 f0Var, byte[] bArr) {
            if (64 != bArr.length) {
                reset();
                return false;
            }
            boolean w = s0.a.e.b.e0.a.w(bArr, 0, f0Var.getEncoded(), 0, this.buf, 0, this.count);
            reset();
            return w;
        }

        public synchronized void reset() {
            Arrays.fill(this.buf, 0, this.count, (byte) 0);
            this.count = 0;
        }
    }

    public boolean a(byte[] bArr) {
        f0 f0Var;
        if (!this.h && (f0Var = this.j) != null) {
            return this.g.b(f0Var, bArr);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for verification");
    }

    public byte[] b() {
        e0 e0Var;
        if (this.h && (e0Var = this.i) != null) {
            return this.g.a(e0Var);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
    }

    public void init(boolean z, s0.a.b.i iVar) {
        this.h = z;
        if (z) {
            this.i = (e0) iVar;
            this.j = null;
        } else {
            this.i = null;
            this.j = (f0) iVar;
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
