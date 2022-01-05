package m0.r.t.a.r.c.t0;

import java.util.List;
import java.util.Set;
import m0.n.b.i;

/* compiled from: ModuleDescriptorImpl.kt */
public final class u implements t {
    public final List<v> a;
    public final Set<v> b;
    public final List<v> c;

    public u(List<v> list, Set<v> set, List<v> list2, Set<v> set2) {
        i.e(list, "allDependencies");
        i.e(set, "modulesWhoseInternalsAreVisible");
        i.e(list2, "directExpectedByDependencies");
        i.e(set2, "allExpectedByDependencies");
        this.a = list;
        this.b = set;
        this.c = list2;
    }

    public List<v> a() {
        return this.a;
    }

    public Set<v> b() {
        return this.b;
    }

    public List<v> c() {
        return this.c;
    }
}
