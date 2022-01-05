package i0.h.a.d.a.b;

import android.content.Context;
import i0.h.a.d.a.e.c0;
import i0.h.a.d.a.e.d0;
import java.io.File;
import java.util.concurrent.Executor;

public final class o1 implements d0<n1> {
    public final d0<String> a;
    public final d0<s> b;
    public final d0<r0> c;
    public final d0<Context> d;
    public final d0<a2> e;
    public final d0<Executor> f;

    public o1(d0<String> d0Var, d0<s> d0Var2, d0<r0> d0Var3, d0<Context> d0Var4, d0<a2> d0Var5, d0<Executor> d0Var6) {
        this.a = d0Var;
        this.b = d0Var2;
        this.c = d0Var3;
        this.d = d0Var4;
        this.e = d0Var5;
        this.f = d0Var6;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        String a2 = this.a.a();
        s a3 = this.b.a();
        r0 a4 = this.c.a();
        Context b2 = ((a3) this.d).a();
        a2 a5 = this.e.a();
        return new n1(a2 != null ? new File(b2.getExternalFilesDir((String) null), a2) : b2.getExternalFilesDir((String) null), a3, a4, b2, a5, c0.b(this.f));
    }
}
