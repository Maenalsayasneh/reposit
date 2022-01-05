package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.e.a.w.n;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends Lambda implements a<Map<d, ? extends n>> {
    public final /* synthetic */ LazyJavaClassMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.c = lazyJavaClassMemberScope;
    }

    public Object invoke() {
        Collection<n> B = this.c.o.B();
        ArrayList arrayList = new ArrayList();
        for (T next : B) {
            if (((n) next).F()) {
                arrayList.add(next);
            }
        }
        int R2 = h.R2(h.K(arrayList, 10));
        if (R2 < 16) {
            R2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            linkedHashMap.put(((n) next2).getName(), next2);
        }
        return linkedHashMap;
    }
}
