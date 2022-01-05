package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.e.a.s.b;
import m0.r.t.a.r.e.a.w.a;

/* compiled from: LazyJavaAnnotations.kt */
public final class LazyJavaAnnotations$annotationDescriptors$1 extends Lambda implements l<a, c> {
    public final /* synthetic */ LazyJavaAnnotations c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotations$annotationDescriptors$1(LazyJavaAnnotations lazyJavaAnnotations) {
        super(1);
        this.c = lazyJavaAnnotations;
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        i.e(aVar, "annotation");
        b bVar = b.a;
        LazyJavaAnnotations lazyJavaAnnotations = this.c;
        return bVar.b(aVar, lazyJavaAnnotations.c, lazyJavaAnnotations.q);
    }
}
