package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.t0.e0;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.j.u.b;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements a<MemberScope> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.c = lazyPackageViewDescriptorImpl;
    }

    public Object invoke() {
        if (this.c.F().isEmpty()) {
            return MemberScope.a.b;
        }
        List<v> F = this.c.F();
        ArrayList arrayList = new ArrayList(h.K(F, 10));
        for (v o : F) {
            arrayList.add(o.o());
        }
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.c;
        List a0 = g.a0(arrayList, new e0(lazyPackageViewDescriptorImpl.x, lazyPackageViewDescriptorImpl.y));
        StringBuilder P0 = i0.d.a.a.a.P0("package view scope for ");
        P0.append(this.c.y);
        P0.append(" in ");
        P0.append(this.c.x.getName());
        return b.h(P0.toString(), a0);
    }
}
