package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.c.y;
import m0.r.t.a.r.g.b;

/* compiled from: ModuleDescriptorImpl.kt */
public final class ModuleDescriptorImpl$packages$1 extends Lambda implements l<b, y> {
    public final /* synthetic */ v c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packages$1(v vVar) {
        super(1);
        this.c = vVar;
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        i.e(bVar, "fqName");
        v vVar = this.c;
        return new LazyPackageViewDescriptorImpl(vVar, bVar, vVar.q);
    }
}
