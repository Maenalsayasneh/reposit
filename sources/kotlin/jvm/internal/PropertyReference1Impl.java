package kotlin.jvm.internal;

import m0.n.b.c;
import m0.r.d;
import m0.r.f;

public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(f fVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((c) fVar).h(), str, str2, (fVar instanceof d) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }
}
