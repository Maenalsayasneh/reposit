package i0.h.a.d.a.b;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final /* synthetic */ class x0 implements e1 {
    public final f1 a;
    public final List b;

    public x0(f1 f1Var, List list) {
        this.a = f1Var;
        this.b = list;
    }

    public final Object a() {
        f1 f1Var = this.a;
        List list = this.b;
        Objects.requireNonNull(f1Var);
        HashMap hashMap = new HashMap();
        for (c1 next : f1Var.f.values()) {
            String str = next.c.a;
            if (list.contains(str)) {
                c1 c1Var = (c1) hashMap.get(str);
                if ((c1Var == null ? -1 : c1Var.a) < next.a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }
}
