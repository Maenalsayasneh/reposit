package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.t0.m;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.b;

/* compiled from: NotFoundClasses.kt */
public final class NotFoundClasses$packageFragments$1 extends Lambda implements l<b, v> {
    public final /* synthetic */ NotFoundClasses c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.c = notFoundClasses;
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        i.e(bVar, "fqName");
        return new m(this.c.b, bVar);
    }
}
