package i0.h.a.d.a.b;

import i0.h.a.d.a.e.c0;
import i0.h.a.d.a.e.d0;
import java.util.concurrent.Executor;

public final class g1 implements d0<f1> {
    public final d0<y> a;
    public final d0<e3> b;
    public final d0<r0> c;
    public final d0<Executor> d;

    public g1(d0<y> d0Var, d0<e3> d0Var2, d0<r0> d0Var3, d0<Executor> d0Var4) {
        this.a = d0Var;
        this.b = d0Var2;
        this.c = d0Var3;
        this.d = d0Var4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y a2 = this.a.a();
        return new f1(a2, c0.b(this.b), this.c.a(), c0.b(this.d));
    }
}
