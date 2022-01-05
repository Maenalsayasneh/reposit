package kotlin.jvm.internal;

import m0.r.c;
import m0.r.m;

public abstract class PropertyReference1 extends PropertyReference implements m {
    public PropertyReference1() {
    }

    public c computeReflected() {
        return m0.n.b.m.c(this);
    }

    public m.a getGetter() {
        return ((m) getReflected()).getGetter();
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
