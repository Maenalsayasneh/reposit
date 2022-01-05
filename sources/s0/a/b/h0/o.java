package s0.a.b.h0;

import i0.d.a.a.a;
import java.util.Hashtable;
import s0.a.b.b0.f0;
import s0.a.b.i;
import s0.a.b.k0.m1;
import s0.a.b.k0.y0;
import s0.a.b.s;

public class o implements s {
    public f0 a;

    public o(int i, int i2) {
        this.a = new f0(i, i2);
    }

    public int doFinal(byte[] bArr, int i) {
        return this.a.e(bArr, i);
    }

    public String getAlgorithmName() {
        StringBuilder P0 = a.P0("Skein-MAC-");
        P0.append(this.a.b.e * 8);
        P0.append("-");
        P0.append(this.a.c * 8);
        return P0.toString();
    }

    public int getMacSize() {
        return this.a.c;
    }

    public void init(i iVar) throws IllegalArgumentException {
        m1 m1Var;
        if (iVar instanceof m1) {
            m1Var = (m1) iVar;
        } else if (iVar instanceof y0) {
            Hashtable hashtable = new Hashtable();
            byte[] bArr = ((y0) iVar).c;
            if (bArr != null) {
                hashtable.put(0, bArr);
                m1Var = new m1(hashtable, (m1.a) null);
            } else {
                throw new IllegalArgumentException("Parameter value must not be null.");
            }
        } else {
            throw new IllegalArgumentException(a.L0(iVar, a.P0("Invalid parameter passed to Skein MAC init - ")));
        }
        if (((byte[]) m1Var.c.get(0)) != null) {
            this.a.f(m1Var);
            return;
        }
        throw new IllegalArgumentException("Skein MAC requires a key parameter.");
    }

    public void reset() {
        this.a.h();
    }

    public void update(byte b) {
        f0 f0Var = this.a;
        byte[] bArr = f0Var.j;
        bArr[0] = b;
        f0Var.l(bArr, 0, 1);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.a.l(bArr, i, i2);
    }
}
