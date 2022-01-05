package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.m.a0;

/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class BuiltInAnnotationDescriptor$type$2 extends Lambda implements a<a0> {
    public final /* synthetic */ BuiltInAnnotationDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuiltInAnnotationDescriptor$type$2(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        super(0);
        this.c = builtInAnnotationDescriptor;
    }

    public Object invoke() {
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = this.c;
        return builtInAnnotationDescriptor.a.j(builtInAnnotationDescriptor.b).q();
    }
}
