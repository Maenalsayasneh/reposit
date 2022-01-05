package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;

public class o0 extends b {
    public o0(e eVar) throws IOException {
        super(eVar.c().r("DER"), 0);
    }

    public o0(byte[] bArr) {
        super(bArr, 0);
    }

    public o0(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static o0 D(Object obj) {
        if (obj == null || (obj instanceof o0)) {
            return (o0) obj;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            return new o0(k1Var.d, k1Var.q);
        } else if (obj instanceof byte[]) {
            try {
                return (o0) r.x((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(a.b0(e, a.P0("encoding error in getInstance: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public static o0 E(z zVar, boolean z) {
        r C = zVar.C();
        if (z || (C instanceof o0)) {
            return D(C);
        }
        byte[] bArr = o.B(C).c;
        if (bArr.length >= 1) {
            byte b = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new o0(bArr2, b);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public r A() {
        return this;
    }

    public void t(q qVar, boolean z) throws IOException {
        int i;
        byte[] bArr = this.d;
        int length = bArr.length;
        if (!(length == 0 || (i = this.q) == 0)) {
            int i2 = length - 1;
            if (bArr[i2] != ((byte) (bArr[i2] & (255 << i)))) {
                byte b = (byte) (bArr[i2] & (255 << i));
                byte b2 = (byte) i;
                if (z) {
                    qVar.a.write(3);
                }
                qVar.i(i2 + 2);
                qVar.a.write(b2);
                qVar.a.write(bArr, 0, i2);
                qVar.a.write(b);
                return;
            }
        }
        qVar.e(z, 3, (byte) this.q, bArr);
    }

    public int u() {
        return a2.a(this.d.length + 1) + 1 + this.d.length + 1;
    }

    public boolean y() {
        return false;
    }

    public r z() {
        return this;
    }
}
