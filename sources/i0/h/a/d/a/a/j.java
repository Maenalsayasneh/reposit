package i0.h.a.d.a.a;

import android.content.Context;
import i0.h.a.d.a.e.d0;
import java.util.Objects;

public final class j implements d0<Context> {
    public final h a;

    public j(h hVar) {
        this.a = hVar;
    }

    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
