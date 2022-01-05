package kotlin.reflect.jvm.internal.impl.types;

import i0.j.f.p.h;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.m.v;

/* compiled from: AbstractTypeConstructor.kt */
public final class AbstractTypeConstructor$supertypes$3 extends Lambda implements l<AbstractTypeConstructor.a, i> {
    public final /* synthetic */ AbstractTypeConstructor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.c = abstractTypeConstructor;
    }

    public Object invoke(Object obj) {
        AbstractTypeConstructor.a aVar = (AbstractTypeConstructor.a) obj;
        m0.n.b.i.e(aVar, "supertypes");
        k0 j = this.c.j();
        AbstractTypeConstructor abstractTypeConstructor = this.c;
        Collection<v> a = j.a(abstractTypeConstructor, aVar.a, new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(abstractTypeConstructor), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this.c));
        List<T> list = null;
        if (a.isEmpty()) {
            v h = this.c.h();
            a = h == null ? null : h.L2(h);
            if (a == null) {
                a = EmptyList.c;
            }
        }
        Objects.requireNonNull(this.c);
        AbstractTypeConstructor abstractTypeConstructor2 = this.c;
        if (a instanceof List) {
            list = a;
        }
        if (list == null) {
            list = g.v0(a);
        }
        List<v> l = abstractTypeConstructor2.l(list);
        m0.n.b.i.e(l, "<set-?>");
        aVar.b = l;
        return i.a;
    }
}
