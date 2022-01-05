package s0.a.b.b0;

import com.instabug.library.model.StepType;
import i0.d.a.a.a;
import s0.a.b.z;

public class c0 extends l implements z {
    public c0() {
        this(128);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(int i) {
        super(i);
        if (i == 128 || i == 256) {
            return;
        }
        throw new IllegalArgumentException(a.g0("'bitLength' ", i, " not supported for SHAKE"));
    }

    public c0(c0 c0Var) {
        super((l) c0Var);
    }

    public int b(byte[] bArr, int i, int i2) {
        if (!this.g) {
            d(15, 4);
        }
        g(bArr, i, ((long) i2) * 8);
        f(this.f);
        return i2;
    }

    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f / 8;
        b(bArr, i, i2);
        return i2;
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0(StepType.SHAKE);
        P0.append(this.f);
        return P0.toString();
    }
}
