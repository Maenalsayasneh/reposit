package i0.h.a.d.a.b;

import android.content.Context;
import i0.h.a.d.a.e.c0;
import i0.h.a.d.a.e.d0;
import java.util.Objects;

public final class z2 implements d0<e3> {
    public final d0<Context> a;
    public final d0<n> b;
    public final d0<n1> c;

    public z2(d0<Context> d0Var, d0<n> d0Var2, d0<n1> d0Var3) {
        this.a = d0Var;
        this.b = d0Var2;
        this.c = d0Var3;
    }

    public final Object a() {
        e3 e3Var = (e3) (v2.a(((a3) this.a).a()) == null ? c0.b(this.b).a() : c0.b(this.c).a());
        Objects.requireNonNull(e3Var, "Cannot return null from a non-@Nullable @Provides method");
        return e3Var;
    }
}
