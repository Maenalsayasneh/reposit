package n0.a.g2.d0;

import java.util.Arrays;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d0.c;
import n0.a.g2.q;
import n0.a.g2.z;

/* compiled from: AbstractSharedFlow.kt */
public abstract class a<S extends c<?>> {
    public S[] c;
    public int d;
    public int q;
    public q<Integer> x;

    public final z<Integer> e() {
        q<Integer> qVar;
        synchronized (this) {
            qVar = this.x;
            if (qVar == null) {
                qVar = a0.a(Integer.valueOf(this.d));
                this.x = qVar;
            }
        }
        return qVar;
    }

    public final S f() {
        S s;
        q<Integer> qVar;
        synchronized (this) {
            S[] sArr = this.c;
            if (sArr == null) {
                sArr = h(2);
                this.c = sArr;
            } else if (this.d >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                this.c = (c[]) copyOf;
                sArr = (c[]) copyOf;
            }
            int i = this.q;
            do {
                s = sArr[i];
                if (s == null) {
                    s = g();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.a(this));
            this.q = i;
            this.d++;
            qVar = this.x;
        }
        if (qVar != null) {
            a0.b(qVar, 1);
        }
        return s;
    }

    public abstract S g();

    public abstract S[] h(int i);

    public final void i(S s) {
        q<Integer> qVar;
        int i;
        m0.l.c[] b;
        synchronized (this) {
            int i2 = this.d - 1;
            this.d = i2;
            qVar = this.x;
            i = 0;
            if (i2 == 0) {
                this.q = 0;
            }
            b = s.b(this);
        }
        int length = b.length;
        while (i < length) {
            m0.l.c cVar = b[i];
            i++;
            if (cVar != null) {
                cVar.resumeWith(m0.i.a);
            }
        }
        if (qVar != null) {
            a0.b(qVar, -1);
        }
    }
}
