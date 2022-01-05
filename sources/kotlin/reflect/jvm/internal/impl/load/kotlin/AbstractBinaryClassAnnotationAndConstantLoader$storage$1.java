package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.e.b.a;
import m0.r.t.a.r.e.b.j;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends Lambda implements l<j, AbstractBinaryClassAnnotationAndConstantLoader.a<? extends A, ? extends C>> {
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader) {
        super(1);
        this.c = abstractBinaryClassAnnotationAndConstantLoader;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        i.e(jVar, "kotlinClass");
        AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader = this.c;
        Objects.requireNonNull(abstractBinaryClassAnnotationAndConstantLoader);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a aVar = new a(abstractBinaryClassAnnotationAndConstantLoader, hashMap, hashMap2);
        i.e(jVar, "kotlinClass");
        jVar.c(aVar, (byte[]) null);
        return new AbstractBinaryClassAnnotationAndConstantLoader.a(hashMap, hashMap2);
    }
}
