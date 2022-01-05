package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.e.b.o;
import m0.r.t.a.r.g.b;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment$binaryClasses$2 extends Lambda implements a<Map<String, ? extends j>> {
    public final /* synthetic */ LazyJavaPackageFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.c = lazyJavaPackageFragment;
    }

    public Object invoke() {
        Pair pair;
        LazyJavaPackageFragment lazyJavaPackageFragment = this.c;
        o oVar = lazyJavaPackageFragment.a2.a.l;
        String b = lazyJavaPackageFragment.y.b();
        i.d(b, "fqName.asString()");
        List<String> a = oVar.a(b);
        LazyJavaPackageFragment lazyJavaPackageFragment2 = this.c;
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(new b(m0.r.t.a.r.j.s.b.d(str).a.replace('/', '.')));
            i.d(l, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
            j F0 = h.F0(lazyJavaPackageFragment2.a2.a.c, l);
            if (F0 == null) {
                pair = null;
            } else {
                pair = new Pair(str, F0);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return g.w0(arrayList);
    }
}
