package kotlin.reflect.jvm.internal.impl.types.checker;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor$refine$1$1 extends Lambda implements a<List<? extends v0>> {
    public final /* synthetic */ NewCapturedTypeConstructor c;
    public final /* synthetic */ e d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, e eVar) {
        super(0);
        this.c = newCapturedTypeConstructor;
        this.d = eVar;
    }

    public Object invoke() {
        Iterable<v0> iterable = (List) this.c.e.getValue();
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        e eVar = this.d;
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (v0 N0 : iterable) {
            arrayList.add(N0.N0(eVar));
        }
        return arrayList;
    }
}
