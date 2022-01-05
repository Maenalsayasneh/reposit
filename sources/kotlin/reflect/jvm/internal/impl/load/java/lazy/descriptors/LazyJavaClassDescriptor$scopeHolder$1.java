package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.x0.e;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor$scopeHolder$1 extends Lambda implements l<e, LazyJavaClassMemberScope> {
    public final /* synthetic */ LazyJavaClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$scopeHolder$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(1);
        this.c = lazyJavaClassDescriptor;
    }

    public Object invoke(Object obj) {
        i.e((e) obj, "it");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.c;
        return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.d2, lazyJavaClassDescriptor, lazyJavaClassDescriptor.b2, lazyJavaClassDescriptor.c2 != null, lazyJavaClassDescriptor.j2);
    }
}
