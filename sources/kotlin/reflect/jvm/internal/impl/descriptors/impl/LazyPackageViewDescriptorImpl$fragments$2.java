package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import i0.j.f.p.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.t0.j;
import m0.r.t.a.r.c.v;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl$fragments$2 extends Lambda implements a<List<? extends v>> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$fragments$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.c = lazyPackageViewDescriptorImpl;
    }

    public Object invoke() {
        m0.r.t.a.r.c.t0.v vVar = this.c.x;
        vVar.I();
        return h.Z2((j) vVar.c2.getValue(), this.c.y);
    }
}
