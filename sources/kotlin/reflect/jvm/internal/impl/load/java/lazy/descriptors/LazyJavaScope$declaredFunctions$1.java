package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.e.a.s.d;
import m0.r.t.a.r.e.a.u.g.a;
import m0.r.t.a.r.e.a.w.q;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$declaredFunctions$1 extends Lambda implements l<d, Collection<? extends g0>> {
    public final /* synthetic */ LazyJavaScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredFunctions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.c = lazyJavaScope;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "name");
        LazyJavaScope lazyJavaScope = this.c.d;
        if (lazyJavaScope != null) {
            return (Collection) ((LockBasedStorageManager.m) lazyJavaScope.g).invoke(dVar);
        }
        ArrayList arrayList = new ArrayList();
        for (q t : ((a) this.c.f.invoke()).f(dVar)) {
            JavaMethodDescriptor t2 = this.c.t(t);
            if (this.c.r(t2)) {
                Objects.requireNonNull((d.a) this.c.c.a.g);
                arrayList.add(t2);
            }
        }
        this.c.j(arrayList, dVar);
        return arrayList;
    }
}
