package i0.h.a.d.a.b;

import android.content.Context;
import i0.h.a.d.a.e.d0;
import java.util.Objects;

public final class a3 implements d0<Context> {
    public final v2 a;

    public a3(v2 v2Var) {
        this.a = v2Var;
    }

    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
