package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.t0.j;
import m0.r.t.a.r.c.t0.t;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.c.w;

/* compiled from: ModuleDescriptorImpl.kt */
public final class ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 extends Lambda implements a<j> {
    public final /* synthetic */ v c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(v vVar) {
        super(0);
        this.c = vVar;
    }

    public Object invoke() {
        v vVar = this.c;
        t tVar = vVar.Y1;
        if (tVar != null) {
            List<v> a = tVar.a();
            a.contains(this.c);
            for (v vVar2 : a) {
                w wVar = vVar2.Z1;
            }
            ArrayList arrayList = new ArrayList(h.K(a, 10));
            for (v vVar3 : a) {
                w wVar2 = vVar3.Z1;
                i.c(wVar2);
                arrayList.add(wVar2);
            }
            return new j(arrayList);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Dependencies of module ");
        P0.append(vVar.B0());
        P0.append(" were not set before querying module content");
        throw new AssertionError(P0.toString());
    }
}
