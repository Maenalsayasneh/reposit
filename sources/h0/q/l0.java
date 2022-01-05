package h0.q;

import h0.q.k0;
import h0.q.m0;
import i0.j.f.p.h;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.d;

/* compiled from: ViewModelProvider.kt */
public final class l0<VM extends k0> implements c<VM> {
    public VM c;
    public final d<VM> d;
    public final a<n0> q;
    public final a<m0.b> x;

    public l0(d<VM> dVar, a<? extends n0> aVar, a<? extends m0.b> aVar2) {
        i.e(dVar, "viewModelClass");
        i.e(aVar, "storeProducer");
        i.e(aVar2, "factoryProducer");
        this.d = dVar;
        this.q = aVar;
        this.x = aVar2;
    }

    public Object getValue() {
        VM vm = this.c;
        if (vm == null) {
            m0.b invoke = this.x.invoke();
            n0 invoke2 = this.q.invoke();
            Class<VM> l1 = h.l1(this.d);
            String canonicalName = l1.getCanonicalName();
            if (canonicalName != null) {
                String n02 = i0.d.a.a.a.n0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                VM vm2 = (k0) invoke2.a.get(n02);
                if (l1.isInstance(vm2)) {
                    if (invoke instanceof m0.e) {
                        ((m0.e) invoke).onRequery(vm2);
                    }
                    vm = vm2;
                } else {
                    if (invoke instanceof m0.c) {
                        vm = ((m0.c) invoke).create(n02, l1);
                    } else {
                        vm = invoke.create(l1);
                    }
                    k0 put = invoke2.a.put(n02, vm);
                    if (put != null) {
                        put.onCleared();
                    }
                }
                this.c = vm;
                i.d(vm, "ViewModelProvider(store,…ed = it\n                }");
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
        }
        return vm;
    }
}
