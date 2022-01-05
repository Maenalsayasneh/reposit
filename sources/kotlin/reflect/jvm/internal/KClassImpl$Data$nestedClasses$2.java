package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.t.a.o;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.j.u.d;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$nestedClasses$2 extends Lambda implements a<List<? extends KClassImpl<? extends Object>>> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$nestedClasses$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        Collection Y0 = h.Y0(this.c.a().w0(), (d) null, (l) null, 3, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object next : Y0) {
            if (!m0.r.t.a.r.j.d.r((i) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            Objects.requireNonNull(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> h = o.h((m0.r.t.a.r.c.d) iVar);
            KClassImpl kClassImpl = h != null ? new KClassImpl(h) : null;
            if (kClassImpl != null) {
                arrayList2.add(kClassImpl);
            }
        }
        return arrayList2;
    }
}
