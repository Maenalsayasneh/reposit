package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.e.a.q;
import m0.r.t.a.r.e.a.w.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<d, ? extends g<?>>> {
    public final /* synthetic */ LazyJavaAnnotationDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.c = lazyJavaAnnotationDescriptor;
    }

    public Object invoke() {
        Pair pair;
        Collection<b> a = this.c.c.a();
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.c;
        ArrayList arrayList = new ArrayList();
        for (b bVar : a) {
            d name = bVar.getName();
            if (name == null) {
                name = q.b;
            }
            g<?> b = lazyJavaAnnotationDescriptor.b(bVar);
            if (b == null) {
                pair = null;
            } else {
                pair = new Pair(name, b);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return m0.j.g.w0(arrayList);
    }
}
