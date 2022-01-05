package i0.h.a.d.a.a;

import i0.h.a.d.a.e.d0;
import java.util.Objects;

public final class i implements d0<b> {
    public final d0<f> a;

    public i(d0<f> d0Var) {
        this.a = d0Var;
    }

    public final Object a() {
        f a2 = this.a.a();
        Objects.requireNonNull(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
