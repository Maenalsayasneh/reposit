package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.o;
import m0.r.t.a.r.c.d;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$sealedSubclasses$2 extends Lambda implements a<List<? extends KClassImpl<? extends T>>> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$sealedSubclasses$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        Collection<d> G = this.c.a().G();
        i.d(G, "descriptor.sealedSubclasses");
        ArrayList arrayList = new ArrayList();
        for (d dVar : G) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> h = o.h(dVar);
            KClassImpl kClassImpl = h != null ? new KClassImpl(h) : null;
            if (kClassImpl != null) {
                arrayList.add(kClassImpl);
            }
        }
        return arrayList;
    }
}
