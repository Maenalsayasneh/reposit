package kotlin.reflect.jvm.internal.impl.types;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.t;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.x0.f;
import m0.r.t.a.r.m.x0.j;

/* compiled from: AbstractTypeConstructor.kt */
public final class AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2 extends Lambda implements a<List<? extends v>> {
    public final /* synthetic */ AbstractTypeConstructor.ModuleViewTypeConstructor c;
    public final /* synthetic */ AbstractTypeConstructor d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2(AbstractTypeConstructor.ModuleViewTypeConstructor moduleViewTypeConstructor, AbstractTypeConstructor abstractTypeConstructor) {
        super(0);
        this.c = moduleViewTypeConstructor;
        this.d = abstractTypeConstructor;
    }

    public Object invoke() {
        e eVar = this.c.a;
        List<v> k = this.d.b();
        t<j<e>> tVar = f.a;
        i.e(eVar, "<this>");
        i.e(k, "types");
        ArrayList arrayList = new ArrayList(h.K(k, 10));
        for (v g : k) {
            arrayList.add(eVar.g(g));
        }
        return arrayList;
    }
}
