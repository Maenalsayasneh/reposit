package kotlin.jvm.internal;

import m0.n.b.c;
import m0.r.d;
import m0.r.f;

public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(f fVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((c) fVar).h(), str, str2, (fVar instanceof d) ^ true ? 1 : 0);
    }

    public Object get() {
        throw null;
    }

    public void set(Object obj) {
        throw null;
    }

    public MutablePropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
