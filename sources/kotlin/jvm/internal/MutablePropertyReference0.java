package kotlin.jvm.internal;

import m0.n.b.m;
import m0.r.c;
import m0.r.i;
import m0.r.l;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements i {
    public MutablePropertyReference0() {
    }

    public c computeReflected() {
        return m.a.d(this);
    }

    public Object getDelegate() {
        return ((i) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    public l.a getGetter() {
        return ((i) getReflected()).getGetter();
    }

    public i.a getSetter() {
        return ((i) getReflected()).getSetter();
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
