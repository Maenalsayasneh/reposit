package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.g.b;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor$fqName$2 extends Lambda implements a<b> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$fqName$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.c = lazyJavaAnnotationDescriptor;
    }

    public Object invoke() {
        m0.r.t.a.r.g.a e = this.c.c.e();
        if (e == null) {
            return null;
        }
        return e.b();
    }
}
