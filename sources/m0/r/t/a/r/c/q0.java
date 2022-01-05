package m0.r.t.a.r.c;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import m0.n.b.i;

/* compiled from: Visibility.kt */
public abstract class q0 {
    private final boolean isPublicAPI;
    private final String name;

    public q0(String str, boolean z) {
        i.e(str, "name");
        this.name = str;
        this.isPublicAPI = z;
    }

    public Integer compareTo(q0 q0Var) {
        i.e(q0Var, "visibility");
        Visibilities visibilities = Visibilities.a;
        i.e(this, "first");
        i.e(q0Var, "second");
        if (this == q0Var) {
            return 0;
        }
        Map<q0, Integer> map = Visibilities.b;
        Integer num = map.get(this);
        Integer num2 = map.get(q0Var);
        if (num == null || num2 == null || i.a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    public q0 normalize() {
        return this;
    }

    public final String toString() {
        return getInternalDisplayName();
    }
}
