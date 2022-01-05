package s0.a.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import s0.a.a.s;

public class y1 extends s {
    public byte[] d;

    public y1(byte[] bArr) throws IOException {
        this.d = bArr;
    }

    public synchronized r A() {
        G();
        return super.A();
    }

    public synchronized e D(int i) {
        G();
        return this.c[i];
    }

    public synchronized Enumeration E() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return new x1(bArr);
        }
        return new s.a();
    }

    public e[] F() {
        G();
        return this.c;
    }

    public final void G() {
        byte[] bArr = this.d;
        if (bArr != null) {
            e[] eVarArr = new e[10];
            x1 x1Var = new x1(bArr);
            int i = 0;
            while (x1Var.hasMoreElements()) {
                r rVar = (r) x1Var.nextElement();
                Objects.requireNonNull(rVar, "'element' cannot be null");
                int i2 = i + 1;
                if ((i2 > eVarArr.length) || false) {
                    e[] eVarArr2 = new e[Math.max(eVarArr.length, (i2 >> 1) + i2)];
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, i);
                    eVarArr = eVarArr2;
                }
                eVarArr[i] = rVar;
                i = i2;
            }
            if (i == 0) {
                eVarArr = f.a;
            } else if (eVarArr.length != i) {
                e[] eVarArr3 = new e[i];
                System.arraycopy(eVarArr, 0, eVarArr3, 0, i);
                eVarArr = eVarArr3;
            }
            this.c = eVarArr;
            this.d = null;
        }
    }

    public synchronized int hashCode() {
        G();
        return super.hashCode();
    }

    public synchronized Iterator<e> iterator() {
        G();
        return super.iterator();
    }

    public synchronized int size() {
        G();
        return this.c.length;
    }

    public synchronized void t(q qVar, boolean z) throws IOException {
        byte[] bArr = this.d;
        if (bArr != null) {
            qVar.g(z, 48, bArr);
        } else {
            super.A().t(qVar, z);
        }
    }

    public synchronized int u() throws IOException {
        byte[] bArr = this.d;
        if (bArr != null) {
            return a2.a(bArr.length) + 1 + this.d.length;
        }
        return super.A().u();
    }

    public synchronized r z() {
        G();
        return super.z();
    }
}
