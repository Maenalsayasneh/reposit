package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.m0;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1 extends Lambda implements a<List<? extends m0>> {
    public final /* synthetic */ LazyJavaClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.c = lazyJavaClassDescriptor;
    }

    public Object invoke() {
        return h.O(this.c);
    }
}
