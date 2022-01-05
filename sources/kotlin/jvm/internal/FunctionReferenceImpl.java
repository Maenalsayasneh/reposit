package kotlin.jvm.internal;

import m0.n.b.c;
import m0.r.d;
import m0.r.f;

public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, f fVar, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((c) fVar).h(), str, str2, (fVar instanceof d) ^ true ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
