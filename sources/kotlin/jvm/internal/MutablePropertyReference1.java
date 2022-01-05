package kotlin.jvm.internal;

import m0.n.b.m;
import m0.r.c;
import m0.r.j;
import m0.r.m;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements j {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public c computeReflected() {
        return m.b(this);
    }

    public m.a getGetter() {
        return ((j) getReflected()).getGetter();
    }

    public Object invoke(Object obj) {
        return ((MutablePropertyReference1Impl) this).get(obj);
    }
}
