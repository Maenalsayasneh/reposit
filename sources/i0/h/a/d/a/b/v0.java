package i0.h.a.d.a.b;

import android.os.Bundle;
import i0.h.a.b.c.m.b;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class v0 implements e1 {
    public final f1 a;
    public final Bundle b;

    public v0(f1 f1Var, Bundle bundle) {
        this.a = f1Var;
        this.b = bundle;
    }

    public final Object a() {
        f1 f1Var = this.a;
        Bundle bundle = this.b;
        Objects.requireNonNull(f1Var);
        int i = bundle.getInt("session_id");
        if (i != 0) {
            Map<Integer, c1> map = f1Var.f;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                c1 c1Var = f1Var.f.get(valueOf);
                if (c1Var.c.c == 6) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!p1.f(c1Var.c.c, bundle.getInt(b.F("status", f1.c(bundle)))));
            }
        }
        return Boolean.TRUE;
    }
}
