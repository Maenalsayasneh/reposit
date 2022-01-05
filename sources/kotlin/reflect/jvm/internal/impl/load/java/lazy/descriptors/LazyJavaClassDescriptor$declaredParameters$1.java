package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.e.a.w.x;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor$declaredParameters$1 extends Lambda implements a<List<? extends m0>> {
    public final /* synthetic */ LazyJavaClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$declaredParameters$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(0);
        this.c = lazyJavaClassDescriptor;
    }

    public Object invoke() {
        List<x> typeParameters = this.c.b2.getTypeParameters();
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.c;
        ArrayList arrayList = new ArrayList(h.K(typeParameters, 10));
        for (x xVar : typeParameters) {
            m0 a = lazyJavaClassDescriptor.d2.b.a(xVar);
            if (a != null) {
                arrayList.add(a);
            } else {
                throw new AssertionError("Parameter " + xVar + " surely belongs to class " + lazyJavaClassDescriptor.b2 + ", so it must be resolved");
            }
        }
        return arrayList;
    }
}
